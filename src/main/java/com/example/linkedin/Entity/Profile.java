package com.example.linkedin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Arrays;

@Entity
public class Profile {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;
        private String username;
        private String email;
        private String password;
        private String job;
        private String bio;
        private String qualification;
        private long phoneno;
        private String skill;
        private String photo;

    public Profile() {

    }

        public Profile(long userid, String username, String email, String password, String job, String bio, String qualification, long phoneno, String skill, String photo) {
            this.userid = userid;
            this.username = username;
            this.email = email;
            this.password = password;
            this.job = job;
            this.bio = bio;
            this.qualification = qualification;
            this.phoneno = phoneno;
            this.skill = skill;
            this.photo = photo;
        }

        public long getUserid() {
            return userid;
        }

        public void setUserid(long userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getQualification() {
            return qualification;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }

        public long getPhoneno() {
            return phoneno;
        }

        public void setPhoneno(long phoneno) {
            this.phoneno = phoneno;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
@Override

public String toString() {
    return "Profile{" +
            "userid=" + userid +
            ", username='" + username + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", job='" + job + '\'' +
            ", bio='" + bio + '\'' +
            ", qualification='" + qualification + '\'' +
            ", phoneno=" + phoneno +
            ", skill='" + skill + '\'' +
            ", photo=" + photo +
            '}';
}




}


