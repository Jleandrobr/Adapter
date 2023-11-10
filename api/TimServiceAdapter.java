package api;

import model.SMS;

public class TimServiceAdapter implements SMSService {

    private TimService timService;

    public TimServiceAdapter(TimService timService) {
        this.timService = timService;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        return timService.sendSMS(sms);
    }
}
