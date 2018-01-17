package ninja.bryansills.structural;

public class User {

    private String mFirstName;
    private String mMiddleName;
    private String mLastName;
    private int mAge;
    private boolean notHungarian;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getMiddleName() {
        return mMiddleName;
    }

    public void setMiddleName(String mMiddleName) {
        this.mMiddleName = mMiddleName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }

    public boolean isNotHungarian() {
        return notHungarian;
    }

    public void setNotHungarian(boolean notHungarian) {
        this.notHungarian = notHungarian;
    }

}
