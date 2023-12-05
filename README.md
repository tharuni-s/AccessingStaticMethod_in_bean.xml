# AccessingStaticMethod_in_bean.xml
The syntax #{T(java.lang.Math).PI} is used to invoke a static method in Spring bean.xml. In this case, the method is PI() which returns the value of pi.
The T() function is used to get the Class object for the given name. The .() operator is used to invoke the method on the Class object.
