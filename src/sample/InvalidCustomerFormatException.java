package src.sample;

import java.io.IOException;

public class InvalidCustomerFormatException extends IOException {

    InvalidCustomerFormatException(String message){
        super(message);
    }

}
