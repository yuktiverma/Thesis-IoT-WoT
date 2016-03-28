package model;

	import org.eclipse.californium.core.CoapClient;

	import org.eclipse.californium.core.CoapResponse;



	public class ConnectToCoap {



	    public static void main(String[] args) {



	        CoapClient client = new CoapClient("coap://[aaaa::212:4b00:799:6300]:5683/lt/r");

	        //client.put("Off",8);

	        CoapResponse response = client.get();

	        

	        if (response!=null) {

	        

	        

	        System.out.println( response.getResponseText() );

	        

	        } else {

	        

	        System.out.println("Request failed");

	        

	        }

	    }



	}


