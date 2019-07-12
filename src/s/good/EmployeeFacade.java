package s.good;

class EmployeeFacade {
    private Cook cook = new Cook();
    private Cleaner cleaner = new Cleaner();

    public void cook() {
        cook.cook();
    }

    public void clean() {
        cleaner.clean();
    }

}
