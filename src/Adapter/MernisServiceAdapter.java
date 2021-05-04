package Adapter;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entities.Customer;
import Interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)  {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		boolean resoult=false;
		try {
		resoult=	kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resoult;
		
	}

}
