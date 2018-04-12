
public class Test {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.insertFirst(4);  
        ll.insertFirst(3);  
        ll.insertFirst(2);  
        ll.insertFirst(1); 
        ll.insertFirst(2);
        ll.display();  
        ll.remove(2); 
        ll.display();
        ll.deleteFirst();  
        ll.display();  
        ll.remove(3);  
        ll.display();  
        System.out.println(ll.find(1));  
        System.out.println(ll.find(4));
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
           new Thread("" + i){
              public void run(){
               System.out.println("Thread: " + getName() + "running");
              }
           }.start();
        }
	}

}
