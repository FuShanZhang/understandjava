package T01;

import T01.Father;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Son extends Father {


    public    void said(){
        System.out.println("我是你er");
    }
    public static void main(String[] args) {
        Father father = new Son();

        father.said();

    }



}
