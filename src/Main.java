

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Interfaces.BaseCustomerManager;

public class Main {

	public static void main(String[] args) throws ParseException {
		 DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	        Date tarih = df.parse("1997/10/15");
		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter()); 
		baseCustomerManager.save(new Customer(1,"BERKAN", "OLGUN", "tc nizi yazýnýz ", tarih ));
	}

}
