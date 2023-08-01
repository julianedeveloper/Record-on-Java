public record PersonRecords(String name, int age) {
    
    //On inside,this DEFINES (automatically) that the parameters are PRIVATE and FINAL (can't be changed). 
    //The getters methods are automatically created and it's dispensed to call it in main.
    //Constructor, toString, hashCode and Equals are automatically created also.
    //STATIC ATTRIBUTES, METHODS (static or not) are accepted normally.
    //NO STATIC ATTRIBUTES requires be included in the initial parentheses.
    //IMPORTANT! The values can't be changed once by default, they are started on the CANONIC CONSTRUCTOR.
    //Record already have one extend class, which means that we can't use multiple heritage in it.
    // By default Records is already final.
    // A record can be use to implement a interface or a method.

}
