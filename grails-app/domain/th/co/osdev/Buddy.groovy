package th.co.osdev

class Buddy {

	Long buddyId
	String name
	String email
    static constraints = {
    	buddyId blank:false , unique:true
    }

    String toString(){
    	buddyId
    }
}
