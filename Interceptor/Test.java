package Interceptor;

class Test {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new LogFilter());
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("STUDENT");
        client.sendRequest("FACULTYMEMBER");
    }
}
