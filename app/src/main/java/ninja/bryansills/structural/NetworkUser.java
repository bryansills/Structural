package ninja.bryansills.structural;

import com.google.gson.annotations.SerializedName;

public class NetworkUser {

    @SerializedName("first_name") private String mFirstName;
    @SerializedName("middle_name") protected String mMiddleName;
    @SerializedName("last_name") private String mLastName;
    @SerializedName("age") private int mAge;

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
}
