import api.SMSSender;
import api.SMSService;
import api.TimService;
import api.TimServiceAdapter;
import api.VivoService;
import api.VivoServiceAdapter;
import model.SMS;

public class AppSMSNotification {

	public static void main(String[] args) {
		SMSService timServiceAdapter = new TimServiceAdapter(new TimService());
        SMSService vivoServiceAdapter = new VivoServiceAdapter(new VivoService());
        
        SMS message1 = new SMS("83988885544", "83988221133", "Bom dia. Seu boleto já está disponível para pagamento");
        SMS message2 = new SMS("83988885544", "83988221133", "Boa tarde. Sua fatura vence em 3 dias.");
        
        timServiceAdapter.sendSMS(message1);
        vivoServiceAdapter.sendSMS(message2);
		
	}
}
