public class Register {
    private String registerName;
    private String registerAddress;
    private String registerValue;

    public Register(String registerName, String registerAddress, String registerValue) {
        this.registerName = registerName;
        this.registerAddress = registerAddress;
        this.registerValue = registerValue;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public String getRegisterValue() {
        return registerValue;
    }

    public void setRegisterValue(String registerValue) {
        this.registerValue = registerValue;
    }

    @Override
    public String toString() {
        return "Register{name= " + registerName + ", address= " + registerAddress + ", value=" + registerValue + "}";
    }
}