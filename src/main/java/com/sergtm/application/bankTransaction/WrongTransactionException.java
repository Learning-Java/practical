package com.sergtm.application.bankTransaction;

/**
 * Created by admin on 06.10.2016.
 */
public class WrongTransactionException extends Throwable {
    public WrongTransactionException(String message){
        super(message);
    }
}
