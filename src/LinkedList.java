
public class LinkedList {

	private class Data {
		private Object obj;
		private Data next = null;

		public Data(Object object) {
			this.obj = object;
		}
	}
	
	private Data first = null;
	
	public void insertFirst(Object object) {
		Data data = new Data(object);
		data.next = first;
		first = data;
	}
	
	public Object deleteFirst() throws Exception {
		if (first == null) {
			throw new Exception("empty!");
		}
		Data temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void display() throws Exception {
		if (first == null) {
			throw new Exception("empty!");
		}
		Data temp = first;
		while (temp != null) {
			System.out.print(temp.obj.toString() + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void remove(Object object) throws Exception {
		if (first == null) {
			throw new Exception("empty!");
		}
		if (first.obj.equals(object)) {
			first = first.next;
		} else {
			Data pre = first;
			Data cur = first.next;
			while (cur != null) {
				if (cur.obj.equals(object)) {
					pre.next = cur.next;
					break;
				}
				pre = cur;
				cur = cur.next;
			}
		}
	}
	
	public Object find(Object object) throws Exception {
		if (first == null) {
			throw new Exception("empty!");
		}
		Data cur = first;
		while (cur!=null) {
			if (cur.obj.equals(object)) {
				return cur.obj;
			}
			cur = cur.next;
		}
		return null;
	}
}
