

class Node {

	int data ; 
	Node next , prev ; 
	Node ( int data ){
		this.data = data ; 
		next = null ; 
		prev = null ; 
	}
	
}



	


public class DaireselBagliListe1 {
	Node head ; 
	Node tail ; 
	public DaireselBagliListe1(){
		
		head = null ; 
		tail = null ; 
	}
	
	void BasEkle ( Node eleman ) {
		
		if ( head == null ) {
			
			head = eleman ; 
			tail = eleman ; 
			head.next= tail; 
			tail.prev = head ; 
			head.prev = tail ; 
			tail.next = head ; 
		}
		else {
			eleman.next = head ; 
		    head.prev = eleman;
		    head = eleman ; 
		    tail.next = eleman ; 
		    head.prev = tail ; 
			
		}
		
	} 
	
	/* void OrtaEkle(Node eleman , Node once ) {
		if (head == null) {
			System.out.println("Liste Yapısı Boş");
		} 
		else {
			int sayac=0;
			Node temp = head;

			while (sayac != eleman) {
				sayac++;
				
				temp = temp.next;
			}
			eleman.next=temp;
			eleman.prev=temp.prev;
			temp.prev.next=eleman;
			temp.prev=eleman;
			
		}
	}
	*/
		
		
		
	
	
	void SonEkle( Node eleman ) {
		
		if ( head == null ) {
			
			head = eleman;
			tail = eleman;
			head.next = tail;
			head.prev = tail;
			tail.next = head;
			tail.prev = head;
			
		}
		else {
			eleman.next = head;
			head.prev = eleman;
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;

		}
	}
	
	void Cbastansil() {
		Node temp =head;

		if (head == null) {
			System.out.println("liste boş");
		} else {
			head = head.next;// 
			
			tail.next = head;
			head.prev = tail;// elemanla taili bağladık
			
			temp=null;
		}
	}
	
	void ElemanSil() {
		
		
		if ( head.next == head ) {
			head = null ; 
			tail = null ; 
		}

		else { 
			head.prev.next = head.next ; 
			head.next.prev = head.prev ; 
			head = head.next ; 
			
		}
		
		
	}
	
	void Yazdır () {
		

		if (head == null) {
			System.out.println("Liste Yapısı Boş");
		} else {
			Node temp = head;
			Node temp2=tail;
			while (temp != temp2) {
				temp2=head;
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
		}}
			
	void Birleştir (DaireselBagliListe1 list,DaireselBagliListe1 list2) {
		if(list.head==null || list2.head==null) {
			System.out.println("listelerden biri veya ikisi boş olduğu için birleştirilemez");
		}
		
		else {
			list.tail.next=list2.head;
			list.head.prev=list2.tail;
			head =list.head;
			tail=list2.tail;
			head.prev=tail;
			tail.next=head;
			
		}
	
	}
	
	
	
	
	
	
  public static void main(String[] args) {
		
	  DaireselBagliListe1 list = new DaireselBagliListe1 (); 
	  DaireselBagliListe1 list2 = new DaireselBagliListe1 ();
        
        
        
        
        
		Node elemanbir = new Node(1) ; 
		Node elemaniki = new Node(2) ; 
		Node elemanuc = new Node (3) ; 
		Node elemandort = new Node(4) ; 
		
		
		list.BasEkle(elemanbir);
		list.SonEkle(elemaniki);
		list.SonEkle(elemanuc);
		list.SonEkle(elemandort);
		
		list2.BasEkle(elemanbir);
		list2.SonEkle(elemaniki);
		list2.SonEkle(elemanuc);
		list2.SonEkle(elemandort);
		list.Yazdır();
		System.out.println(" -- ");
		list.Birleştir(list, list2); 
		
		
		
	}

}



