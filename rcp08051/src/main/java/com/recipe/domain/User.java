package com.recipe.domain;

import java.util.Date;

public class User {
  
  //Constructor
  public User() {  
  }
  
  protected int userNo;
  protected String userName;
  protected String email;
  protected String password;
  protected String image;
  protected String intro;
  protected String role;
  protected Date joinDate;
  protected String recipeUrl;
  
  public int getUserNo() {
    return userNo;
  }
  public void setUserNo(int userNo) {
    this.userNo = userNo;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
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
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public String getIntro() {
    return intro;
  }
  public void setIntro(String intro) {
    this.intro = intro;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
  public String getRecipeUrl() {
    return recipeUrl;
  }
  public void setRecipeUrl(String recipeUrl) {
    this.recipeUrl = recipeUrl;
  }
  
  @Override
  public String toString() {
    return "User [userNo=" + userNo + ", userName=" + userName + ", email=" + email + ", password=" + password
        + ", image=" + image + ", intro=" + intro + ", role=" + role + ", joinDate=" + joinDate + ", recipeUrl="
        + recipeUrl + "]";
  }    
}