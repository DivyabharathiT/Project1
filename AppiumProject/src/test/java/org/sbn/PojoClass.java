package org.sbn;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Sbn_BaseClass {
	
	public PojoClass()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Login
	
	@FindBy(xpath="//*[@id='tv_next']")
	private WebElement next;
	
	public WebElement getNext() {
		return next;
	}

	public WebElement getLgn() {
		return lgn;
	}


	public WebElement getUsername() {
		return username;
	}

	

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLinearLayout() {
		return linearLayout;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	@FindBy(xpath="//*[@id='llt_login']")
	private WebElement lgn;
	
	@FindBy(xpath="//*[@id='username_text_input_layout']")
	private WebElement userlayout ;
	
	@FindBy(xpath="//*[@class='android.widget.FrameLayout']")
	private WebElement framelayout;
	
	

	@FindBy(xpath="//*[@id='edt_username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password_text_input_layout']")
	private WebElement passLayout ;
	

	

	public WebElement getPassLayout() {
		return passLayout;
	}

	@FindBy(xpath="//*[@id='edt_password']")
	private WebElement pass;
	
	@FindBy(xpath="//*[@class='android.widget.LinearLayout']")
	private WebElement linearLayout ;
	
	@FindBy(xpath="//*[@id='tv_login']")
	private WebElement lgnbtn;
	
	@FindBy(xpath="//*[@id='tv_smart_black']")
	private WebElement smart;
	
	public WebElement getSmart() {
		return smart;
	}

	

	
	
	
	//Register
	@FindBy(xpath="//*[@id='tv_create_account']")
	private WebElement createacc ;
	

	public WebElement getUserlayout() {
		return userlayout;
	}

	public WebElement getFramelayout() {
		return framelayout;
	}

	public WebElement getCreateacc() {
		return createacc;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBusinessname() {
		return businessname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBtnconfirmpass() {
		return btnconfirmpass;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getBtnregister() {
		return btnregister;
	}

	@FindBy(xpath="//*[@id='edt_first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id='edt_last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id='edt_business_name']")
	private WebElement businessname;
	

	@FindBy(xpath="//*[@id='edt_email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='til_confirm_password']")
	private WebElement btnconfirmpass;
	
	@FindBy(xpath="//*[@id='edt_confirm_password']")
	private WebElement confirmpass;
	
	@FindBy(xpath="//*[@id='tv_register']")
	private WebElement btnregister;
	
	@FindBy(xpath="//*[@id='tv_header']")
	private WebElement AddProfile;
	
	public WebElement getAddProfile() {
		return AddProfile;
	}

	
	
	//change password
	
	
	@FindBy(xpath="//*[@id='i_settings']")
	private WebElement setting;
	
	public WebElement getSetting() {
		return setting;
	}

	public WebElement getBtnchangepass() {
		return btnchangepass;
	}

	public WebElement getCurrentpass() {
		return currentpass;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	public WebElement getRenewpass() {
		return renewpass;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	@FindBy(xpath="//*[@text='Change Password']")
	private WebElement btnchangepass;
	
	@FindBy(xpath="//*[@id='edt_current_password']")
	private WebElement currentpass;
	
	@FindBy(xpath="//*[@id='edt_new_password']")
	private WebElement newpass;
	
	@FindBy(xpath="//*[@id='edt_reenter_password']")
	private WebElement renewpass;
	
	@FindBy(xpath="//*[@text='Submit']")
	private WebElement btnsubmit;
	
	//view albums
	
	@FindBy(xpath="//*[@id='iv_next_one']")
	private WebElement nextone;
	
	public WebElement getNextone() {
		return nextone;
	}

	public WebElement getBtngallery() {
		return btngallery;
	}

	public WebElement getTabphotos() {
		return tabphotos;
	}

	@FindBy(xpath="//*[@text='My Gallery']")
	private WebElement btngallery;
	
	@FindBy(xpath="//*[@text='PHOTOS']")
	private WebElement tabphotos;
	
	@FindBy(xpath="//*[@id='edt_username']")
	private WebElement user;
	
	
	//createPost
	
	
	
	public WebElement getUser() {
		return user;
	}

	@FindBy(xpath="//*[@text='Create Post']")
	private WebElement createpost;
	

	public WebElement getCreatepost() {
		return createpost;
	}

	public WebElement getPostTitle() {
		return postTitle;
	}

	public WebElement getAddphotos() {
		return addphotos;
	}

	public WebElement getAllimages() {
		return allimages;
	}

	public WebElement getPicture() {
		return picture;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}

	public WebElement getBtnDone() {
		return btnDone;
	}

	public WebElement getBtnPost() {
		return btnPost;
	}

	@FindBy(xpath="//*[@id='tv_post_title']")
	private WebElement postTitle;
	
	@FindBy(xpath="//*[@text='Add Photos/ Videos']")
	private WebElement addphotos;
	
	@FindBy(xpath="//*[@id='iv_first_image']")
	private WebElement allimages;
	
	@FindBy(xpath="//*[@id='tv_additional_images']")
	private WebElement picture;
	
	@FindBy(xpath="//*[@text='Ok']")
	private WebElement btnOk;
	
	@FindBy(xpath="//*[@text='DONE']")
	private WebElement btnDone;
	
	@FindBy(xpath="//*[@text='Post']")
	private WebElement btnPost;
	
	
	//Add Profile Info
	@FindBy(xpath="//*[@id='iv_edit']")
	private WebElement edit;
	
	public WebElement getEdit() {
		return edit;
	}

	public WebElement getIvprofile() {
		return ivprofile;
	}

	public WebElement getGallery() {
		return gallery;
	}

	public WebElement getPic1() {
		return pic1;
	}

	public WebElement getCrop() {
		return crop;
	}

	public WebElement getIvcover() {
		return ivcover;
	}

	public WebElement getRelativeLayout() {
		return relativeLayout;
	}

	public WebElement getPic2() {
		return pic2;
	}

	public WebElement getSavechanges() {
		return savechanges;
	}

	@FindBy(xpath="//*[@id='iv_camera_profile']")
	private WebElement ivprofile;
	
	@FindBy(xpath="//*[@id='iv_gallery']")
	private WebElement gallery;
	
	@FindBy(xpath="//*[@contentDescription='Photo taken on 14-Nov-2020 11:18:00 AM']")
	private WebElement pic1;
	
	@FindBy(xpath="//*[@text='CROP']")
	private WebElement crop;
	
	@FindBy(xpath="//*[@id='iv_camera_cover']")
	private WebElement ivcover;
	
	@FindBy(xpath="//*[@class='android.widget.RelativeLayout' and ./*[@text='Download']]")
	private WebElement relativeLayout;
	
	@FindBy(xpath="//*[@contentDescription='Photo taken on 15-Aug-2020 11:28:30 PM']")
	private WebElement pic2;
	
	@FindBy(xpath="//*[@text='Save Changes']")
	private WebElement savechanges;
	
	@FindBy(xpath="//*[@id='iv_edit']")
	private WebElement ivedit;

	public WebElement getIvedit() {
		return ivedit;
	}
	
	
}
