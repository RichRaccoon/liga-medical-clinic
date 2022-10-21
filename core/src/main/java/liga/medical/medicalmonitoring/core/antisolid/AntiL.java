package liga.medical.medicalmonitoring.core.antisolid;

public class AntiL {
    public void doSomething1() {
        // logic
    }

    public void doSomething2() {
        // logic
    }

    public void doSomething3() {
        // logic
    }
}

class ChildAntiL1 extends AntiL {
    @Override
    public void doSomething1() {
        super.doSomething1();
    }

    @Override
    public void doSomething2() {
        super.doSomething2();
    }

    @Override
    public void doSomething3() {
        super.doSomething3();
    }
}

class ChildAntiL2 extends AntiL {
    @Override
    public void doSomething1() {
        super.doSomething1();
    }

    @Override
    public void doSomething2() {
        super.doSomething2();
    }

    @Override
    public void doSomething3() {
        throw new UnsupportedOperationException("Unsupported operation!!!");
    }
}
