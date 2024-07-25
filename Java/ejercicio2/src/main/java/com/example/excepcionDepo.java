package com.example;

public class excepcionDepo extends Exception {
    public excepcionDepo() {
        super();
        }
        public excepcionDepo(String mensage) {
        super(mensage);
        }
        public excepcionDepo(String mensage, Throwable causa) {
        super(mensage, causa);
        }
        public excepcionDepo(Throwable causa) {
        super(causa);
        }
        
}
