public class customer {
  int cid;
  String name;
  customer(int cid,String name){
    this.cid=cid;
    this.name=name;
  }
  void getcustomer(){
    System.out.println("Customeer Id:"+cid+" "+"Customer Name:"+name);
  }
}
