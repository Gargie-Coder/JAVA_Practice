public class genericsum<T> {//Not recommended approach as it violates type safety and java does not support arithemetic operations on generic types. This is just for demonstration purposes.
  T x;
  T y;
  genericsum(T x,T y){
    this.x=x;
    this.y=y;
  }
  T sum(){
    
    if(x instanceof Integer&&y instanceof Integer){
      return (T)(Integer)((Integer)x+(Integer)y);
    }
    else if(x instanceof Double&&y instanceof Double){
      return (T)(Double)((Double)x+(Double)y);
    }
    else if(x instanceof String&&y instanceof String){
      return (T)(String)((String)x+(String)y);
    }
    return null;
  }
  
}
