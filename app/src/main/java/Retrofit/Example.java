package Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("data")
        @Expose
        private List<ClassModel> data = null;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ClassModel> getData() {
            return data;
        }

        public void setData(List<ClassModel> data) {
            this.data = data;
        }

    }

