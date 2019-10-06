package locators;

public class AmazonLocator {

	//Search Related Xapaths
		public String searchbox = "//*[@id=\'twotabsearchtextbox\']";
		public String scr = ".nav-search-submit > input:nth-child(2)";
		public String searchbutton ="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input";
		public String searchresult ="//*[@id=\"search\"]/span[2]/h1/div/div[1]/div/div/span[3]";
	
		//SIgn-in/Sign-out/Account related
		public String Account= "//*[@id=\"nav-signin-tooltip\"]/a/span";
		public String Log_email ="//*[@id=\"ap_email\"]";
		public String Log_continue = "//*[@id=\"continue\"]";
		public String Log_Password = "//*[@id='ap_password']";
		public String signin = "//*[@id=\'signInSubmit\']";
		public String createaccount= "//*[@id=\'createAccountSubmit\']";
		public String AccHolder = "//*[@id=\"nav-link-accountList\"]/span[1]";
	
	
	
}
