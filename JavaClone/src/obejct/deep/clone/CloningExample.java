package obejct.deep.clone;

public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
        City city = new City("Dehradun");
        Person person1 = new Person("Naresh", 10000, city);
        System.out.println(person1);
        
        Person person2 = person1.clone();
        System.out.println(person2);
        
        // here person reference has been changed. this is cloned. 
        if (person1 == person2) { 
            System.out.println("Both person1 and person2 holds same object");
        }
        
        // here contents are same so we can say got same copy of object.
        if (person1.equals(person2)) { 
            System.out.println("But both person1 and person2 are equal and have same content");
        }
        
        // here city reference has been changed. this is cloned.
        if (person1.getCity() == person2.getCity()) {
            System.out.println("Both person1 and person2 have same city object");
        }
        
        // i did changes here with clone object.
        person2.getCity().setName("Bhopal");
        person2.setIncome(20000);
        person2.setName("sumit tiwari");
        
        System.out.println("  ***************** after changes on clone object    ***********");
        System.out.println(person1);// in deep clone city object is not changed.
        
        System.out.println(person2);
    }
	
}

/*   Out Put 
 Person [name=Naresh, income=10000, city=City [name=Dehradun]]
Person [name=Naresh, income=10000, city=City [name=Dehradun]]
But both person1 and person2 are equal and have same content
  ***************** after changes on clone object    ***********
Person [name=Naresh, income=10000, city=City [name=Dehradun]]
Person [name=sumit tiwari, income=20000, city=City [name=Bhopal]]
 * */
