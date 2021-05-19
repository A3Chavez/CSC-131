package composite;

public class Driver {
	public static void main(String[] args) {

		DistributionList cs, math, spam, faxList;
		EmailAddress dean;

		spam = new DistributionList();
		dean = new EmailAddress("Tex Avery", "tex@hollywood.edu");

		cs = new DistributionList();
		cs.add(new EmailAddress("Gilligan", "littlebuddy@island.edu"));
		cs.add(new EmailAddress("The Skipper", "skipper@island.edu"));
		cs.add(new EmailAddress("Mr. and Mrs. Howell", "magoo@island.edu"));

		math = new DistributionList();
		math.add(new EmailAddress("Fred Flintstone", "bedrock.edu"));
		math.add(new EmailAddress("Barney Rubble", "bedrock.edu"));
		math.add(new EmailAddress("Stony Curtis", "hollyrock.edu"));
		
		faxList = new DistributionList();
		faxList.add(new FaxNumber("Saitama", "123456"));
		faxList.add(new FaxNumber("Genos", "123456"));
    
		spam.add(cs);
		spam.add(math);
		spam.add(dean);
		spam.add(faxList);

		spam.sendMessage("Buy my book!");
		
		//spam.remove(dean);
	}
}
