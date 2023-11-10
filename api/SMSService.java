package api;

import model.SMS;

public interface SMSService {
    boolean sendSMS(SMS sms);
}
