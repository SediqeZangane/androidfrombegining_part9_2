package Retrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateEmployee {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("data")
        @Expose
        private CreateData data;

    public CreateEmployee(String status, CreateData data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public CreateData getData() {
            return data;
        }

        public void setData(CreateData data) {
            this.data = data;
        }

    }


