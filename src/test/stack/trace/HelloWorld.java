package test.stack.trace;

class SomeClass {

    

    public void methodC() {
        RuntimeException e = new RuntimeException();
        e.setStackTrace(new StackTraceElement[]{
                new StackTraceElement("OtherClass", "methodX", "String.java", 99),
                new StackTraceElement("OtherClass", "methodY", "String.java", 55)
        });
        throw e;
    }

    public static void main(String[] args) {
        new SomeClass().methodA();
    }

    private void methodA() {
    }
}