package liga.medical.medicalmonitoring.core.antisolid;

public interface AntiI {
    void area();
    void volume();
}

class Cube implements AntiI {
    @Override
    public void area() {
        // print area
    }

    @Override
    public void volume() {
        // print volume
    }
}

class Square implements AntiI {
    @Override
    public void area() {
        // print area
    }

    @Override
    public void volume() {
        // ?????????
    }
}
