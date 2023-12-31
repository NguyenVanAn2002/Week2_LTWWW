package vn.edu.iuh.fit.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETE(-1)
    ;

    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
