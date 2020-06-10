package com.exceptions;

public class ExceededLimitException extends Exception
{
    public ExceededLimitException(String s)
    {
        super(s);
    }
}