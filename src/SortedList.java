
public class SortedList {
	private class Data{  
        private Object obj;  
        private Data next = null;  
          
        Data(Object obj){  
            this.obj = obj;  
        }  
    }  
  
    private Data first = null;  
      
    public void insert(Object obj){  
        Data data = new Data(obj);  
        Data pre = null;  
        Data cur = first;  
        while(cur != null && (Integer.valueOf(data.obj.toString())  
                .intValue() > Integer.valueOf(cur.obj.toString())  
                .intValue())){  
            pre = cur;  
            cur = cur.next;  
        }  
        if(pre == null)  
            first = data;  
        else  
            pre.next = data;  
        data.next = cur;  
    }  
      
    public Object deleteFirst() throws Exception{  
        if(first == null)  
            throw new Exception("empty!");  
        Data temp = first;  
        first = first.next;  
        return temp.obj;  
    }  
      
    public void display(){  
        if(first == null)  
            System.out.println("empty");  
        System.out.print("first -> last : ");  
        Data cur = first;  
        while(cur != null){  
            System.out.print(cur.obj.toString() + " -> ");  
            cur = cur.next;  
        }  
        System.out.print("\n");  
    }  
}
