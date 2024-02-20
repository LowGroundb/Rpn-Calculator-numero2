import java.util.Stack;


class Calculator {
public static double calculator(String expresion){
    if(expresion.length()==0){
        return 0;
    }
    //start,end indexes of where is the start and end of the string that i want to use
    int start = 0;
    int end = 0;
     Stack<Object> stack = new Stack();
    do {
       
    //finds the index of the first "space" that it finds
    int space = expresion.substring(start).indexOf(' ');
    //if it can find "space"
    if(space!=-1){
        end = start + space;
    }
    //if it can't find "space"
    else{
     end = expresion.length();   
    }
    //element=the string that i will test
    String element = expresion.substring(start,end);
    if(element.equals("+")||element.equals("-")||element.equals("*")||element.equals("/")){
        double a =(double)stack.pop();
        double b =(double)stack.pop();
        stack.push(opperation(a,b,element));
    }
    else{
        stack.push(Double.parseDouble(element));
    }
    start=end+1;
    if(stack.size()==1 && space==-1){break;}
}while(!stack.empty());
  
  double result = (double)stack.pop();
  
  return result;
}
    public static double opperation(double num1, double num2, String opp){
        double result=0;
       switch (opp) {
        case "+":
            result=num1+num2;
            break;
        case "-":
            result=num1-num2;
            break;    
            case "*":
            result=num1*num2;
            break;  
            case "/":
            if(num2==0){
               break;
            }
            result=num1/num2;
            break;      
        default:
        System.out.println("Division with 0");
        return -999;
           
       }
       return result;
    }



}