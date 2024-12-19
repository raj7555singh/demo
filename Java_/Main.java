// // COPY CONSTRUCTOR ===================================
// class A {

//      A()//once made private can not be called in main maethod 
//     {
//         System.out.println("wihout overloading ");
//     }
//     static void show(String str)
//     {
//         System.out.println("static method can be called without creating objects"+ " "+str);
//     }
//     A(String str)
//     {
       
//         System.out.println(str+" "+"with overloading");
//     }

//     A(int a,int b,int c)
//     {
//         System.out.println(a+" "+b+" "+c);
//     }

// }
// public class Main {

//     public static void main(String[] args) {
//         // A r1=new A();
//         // A r2= new A(r1);
//         // A.show("okay raj");//static can be called
//         A r1=new A();
//         A r2=new A("check this");
//         A r3=new A(5,6,4);
//     }
// }
// // ========================================================
// ======================================================================================


// STATIC BLOCK-----it gets execcuted first in comparison to all at the time of loading itself

// and it gets executed only once

// INSTANCE block

// class A {

//     A()
//     {
//         System.out.println("A constructor");
//     }
//     static{
//         System.out.println("static block it will print first and only one time no matter how many objects created as it is independent of object");
//     }
//     // instance block
//     {
//         System.out.println("this is instance block and will execute after static at the time of object creation as it depends on objects");
//     }
    
// }
// public class Main {

//     public static void main(String[] args) {
//         A r1=new A();
//         A r2=new A();
//     }
// }

// =====================================================================================


// STATIC,STATIC METHOD , INSTANCE BLOCK AND NORMAL CONSTRUCTOR

// class A{
//     A()
//     {
//         System.out.println("noraml constructor after instance block");
//     }
//     static
//     {
//         System.out.println("static block will print first");
//     }

//     {
//             System.out.println("instance block will first if no static block and also if static method call after it");
//     }
//     static void show()
//     {
//         System.out.println("static method its order of printing varies as we call firstly or lastly");
//     }
//     void disp()
//     {
//         System.out.println("normal method if called will print after normal construtor");
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         A.show();
//         A r1=new A();
//         A.show();
//         r1.disp();
//     }
// }
// ======================================================================================
// class A{
//     static
//     {
//         System.out.println("no need create objects for static block");
//         // agar dusri class bna kar a ko access karnege as in above case then need to create onj
//            can access static variables only unlike instance
// }

//         {
//             System.out.println("instance block needs obj creation for execution");
//         }
//     public static void main(String[] args)
//         {
//                 // A bj=new A();//req for instance block
//         }
// }

// =====================================================================================


// INHERITANCE method of one class can be used in other class

// class A{
//     int a;
//     int b;

//     void add()
//     {
    //         System.out.println(" A ka kaam "+(a+b));
    //     }
    //     static
    //      {
    //         System.out.println("coming from A");
    //     }
    //     {
    //         System.out.println("instance h apun");
    //     }
// }
// class B extends A
// {
    
//     B(int c,int d)
//     {
//         a=c;
//         b=d;
//         System.out.println(" B ka kaam "+(a*b));
//     }
// }

// public class Main {
    // public static void main(String[] args) {
    //     // B obj=new B(3,2);
    //     // obj.add();//by same obj we can access methods of A also without creating its obj
    //     // even protected method can be accessed
    // }
// }

// MULTIPLE INHERITANCE------------------------------------------------------

// interface A {
//     void show();
// }

// interface B {
//     void display();
// }

// class C implements A, B {  

//     @Override
//     public void show()
//     {
//         System.out.println("jj");
//     }
//     @Override
//     public void display()
//     {
//         System.out.println("jgjkf");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
        
//     }
// }


// JAVA DOES NOT SUPPORTS MULTIPLE INHERITANCE AS TO AVOID AMBIGUITY BETWEEN SAME CLASS EVEN IF METHODS ARE DIFFERNTS FOR FUTURE REFERNCE TO AVOID AMBIGUITY ASK CHATGPT MORE

// THIS KEY WORD=================================================================

// class A{
//     int a,b;
//     A(int a,int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
//     public void show()
//     {
//         System.out.println(a+" "+b);
//     }
//     public void display()
//     {
//         System.out.println(this);//will print referecne 
//     }
//     A()
//     {
//         this(3,4);//to call constructor without parameters..............if method called without passing params
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         A a=new A(4,6);
//         // A b=new A();
//         // System.out.println(a.show());
//         a.show();
//         a.display();
//     }
// }




