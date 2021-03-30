package com.example.whatsapp;

public class DataItem2 {

        private String UserName2;

        private String Description2;

        private String Profile2;

        private  String Telephone;

        public DataItem2(String UserName2, String Description2, String Profile2, String Telephone) {
            this.UserName2 = UserName2;
            this.Description2 = Description2;
            this.Profile2 = Profile2;
            this.Telephone=Telephone;
        }

        public String getUserName2() {

            return UserName2;
        }

        public String getDescription2() {

            return Description2;
        }

        public String getProfile2() {

            return Profile2;
        }
        public String getTelephone() {

            return Telephone;
        }
    }

