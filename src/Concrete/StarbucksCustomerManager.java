package Concrete;

import Entities.Customer;
import Interfaces.BaseCustomerManager;
import Interfaces.CustomerCheckService;
import Interfaces.CustomerService;

public class StarbucksCustomerManager extends BaseCustomerManager {
 CustomerCheckService customerCheckService;
 
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}
    

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println(" gg");
		}
		
	}
}
