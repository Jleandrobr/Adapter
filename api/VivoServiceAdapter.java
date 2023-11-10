package api;

import model.SMS;

public class VivoServiceAdapter implements SMSService {

    private VivoService vivoService;

    public VivoServiceAdapter(VivoService vivoService) {
        this.vivoService = vivoService;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        try {
            vivoService.enviarSMS(sms.getOrigem(), sms.getDestino(), sms.getTimestamp(), new String[]{sms.getTexto()});
            return true;
        } catch (SMSException e) {
            e.printStackTrace();
            return false;
        }
    }
}
