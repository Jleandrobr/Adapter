package api;

import model.SMS;

public class TimServiceAdapter implements SMSService {

    private TimService timService;

    public TimServiceAdapter(TimService timService) {
        this.timService = timService;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        // Adaptando o método sendSMS da classe TimService para a interface comum
        return timService.sendSMS(sms);
    }
}
