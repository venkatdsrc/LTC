/*@Author: Venkat
Loads all the UI elements from the properties file and maps them the respective calling objects through getter methods

*/

package test.java.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LTCErrorMsgHandling {

	

	public final Properties properties = new Properties();
	
	public LTCErrorMsgHandling() {
	
		String errorMsgFilePath;
		errorMsgFilePath=System.getProperty("user.dir")+"\\";
		
		System.out.println("read from properties file");
		try {
			properties.load(new FileInputStream("C:\\Users\\venkatragavan\\git\\semobile\\semobile\\objectrepository\\objrep.properties"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	//this method retrieves id of skip button element in the app launch page
	
	public String getSkipButtonID() {
		return properties.getProperty("skipButtonID");
	}
	
	//this method retrieves id of emailid text box element in the first time user registration page
	
	public String getRegisterEmailIDTextID() {
		return properties.getProperty("registerEmailTextID");
	}
	

	
	//this method retrieves id of Register with Facebook link element in the first time user registration page
	
	public String getRegisterWithFBLinkID() {
		return properties.getProperty("registerViaFBID");
	}
	
	//this method retrieves id of Register button element in the user registration page
	
	

			
			
	public String getRegisterButtonID() {
		return properties.getProperty("registerButtonID");
	}
	
	//this method retrieves id of Save button element in the list of countries pop up page
	
	public String getSaveButtonID() {
		return properties.getProperty("saveButtonID");
	}
	
	//this method retrieves id of home page image element
	
	public String getViewSEHomeImageID() {
		return properties.getProperty("viewHomeImageID");
	}
	
	//this method retrieves id of logout link element
	
	public String getLogOutLinkTextID() {
		return properties.getProperty("logoutLinkTextID");
	}
	
	//this method retrieves id of Login button element in the app launch page
	
	public String getLogInButtonName() {
		return properties.getProperty("loginButtonName");
	}
	
	//this method retrieves id of EmailID text element in login prompt page
	
	public String getLogInEmailTextID() {
		return properties.getProperty("loginEmailTextID");
	}
	
	//this method retrieves id of Password text element in the Login prompt page
	
	public String getLogInPwdTextID() {
		return properties.getProperty("loginPwdTextID");
	}
	
	//this method retrieves id of SignIn button element in the Login prompt page
	
	public String getSignInButtonID() {
		return properties.getProperty("signInButtonID");
	}
	
	//this method retrieves id of Inspire Me element found in the List of sales page
	
		public String getInspireMeHomeID() {
			return properties.getProperty("inspireMeHomeID");
		}
		
	//this method retrieves id of Inspire Me tab element found in the list of sales page
	
	public String getInspireMeTabName() {
		return properties.getProperty("inspireMeTabName");
	}
	
	//this method retrieves id of discount price element found in the list of sales page
	
	public String getDiscountPriceTextID() {
		return properties.getProperty("discountPriceTextID");
	}
		
	//this method retrieves id of original price element found in the list of sales page
	
	public String getOriginalPriceTextID() {
		return properties.getProperty("orginalPriceTextID");
	}
	
	//this method retrieves id of discount percentage element found in the list of sales page
	
	public String getDiscountPercentageTextID() {
		return properties.getProperty("discountPercentageTextID");
	}
	
	//this method retrieves id of Text label element found in the list of sales page
	
	public String getTextTitleID() {
		return properties.getProperty("textTitleID");
	}
				
	//this method retrieves id of Image (tick) element found in the Select Your Country page
	
	public String getImageCheckedID() {
		return properties.getProperty("imageCheckedID");
	}

	//this method retrieves id of hotel location element found in the list of sales page
	
	public String getHotelLocationTextID() {
		return properties.getProperty("hotelLocationID");
	}
		
	//this method retrieves id of favorite (heart) symbol found in the list of sales page
	
	public String getFavoriteButtonID() {
		return properties.getProperty("favoriteButtonID");
	}
			
	//this method retrieves id of favorite text found in the list of sales page
	
	public String getFavoriteTextID() {
		return properties.getProperty("favoriteTextID");
	}
		
	//this method retrieves id of sale ends text found in the list of sales page
	
	public String getSaleEndsTextID() {
		return properties.getProperty("saleEndsTextID");
	}

	//this method retrieves id of per room text found in the list of sales page
	
	public String getPerRoomTextID() {
		return properties.getProperty("perRoomTextID");
	}
	
	//this method retrieves id of Escapes menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getEscapesTextMenuID() {
		return properties.getProperty("escapeTextMenuID");
	}
		
	//this method retrieves id of Last-minute menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getLastMinuteTextMenuID() {
		return properties.getProperty("lastMinuteTextMenuID");
	}
	
	//this method retrieves id of 'Saved' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getSavedTextMenuID() {
		return properties.getProperty("savedTextMenuID");
	}
	
	//this method retrieves id of 'Your details' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getYourDetailsTextMenuID() {
		return properties.getProperty("yourDetailsTextMenuID");
	}
	
	//this method retrieves id of 'Your Subscriptions' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getYourSubscriptionsTextMenuID() {
		return properties.getProperty("yourSubscriptionsTextMenuID");
	}
			
	//this method retrieves id of 'Your bookings' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getYourBookingsTextMenuID() {
		return properties.getProperty("yourBookingsTextMenuID");
	}
	
	//this method retrieves id of 'Your credits' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getYourCreditsTextMenuID() {
		return properties.getProperty("yourCreditsTextMenuID");
	}
		
	//this method retrieves id of 'Tour' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getTourTextMenuID() {
		return properties.getProperty("tourTextMenuID");
	}
	

	//this method retrieves id of 'Contact Us' menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getContactUsTextMenuID() {
		return properties.getProperty("contactUsTextMenuID");
	}
	
	//this method retrieves id of app version menu item found in the Inspire Me list page drop down available in the upper left corner
	
	public String getAppVersionTextMenuID() {
		return properties.getProperty("appVersionTextMenuID");
	}
	
	//this method retrieves id of Logged in user's email id menu item in the Inspire Me list page drop down available in the upper left corner
	
	public String getLoggedInUserTextMenuID() {
		return properties.getProperty("loggedInUserTextMenuID");
	}

	//this method retrieves id of Editor's pick element found in the Inspire Me list page 
	
	public String getEditorsPickTextID() {
		return properties.getProperty("editorsPickTextID");
	}
	
	
	//this method retrieves name of Search and Refind table element found in the Inspire Me list page 
	
	public String getSearchAndRefineTabName() {
		return properties.getProperty("searchAndRefineTabName");
	}
	
	
	//this method retrieves id of destination text element found in the Inspire Me list page 
	
	public String getEnterDestinationTextID() {
		return properties.getProperty("enterDestinationTextID");
	}

	//this method retrieves id of check-in/check-out label elements found in the Search and Refine tab
	
	public String getCheckInCheckOutLabelID() {
		return properties.getProperty("checkInCheckOutLabelID");
	}

	//this method retrieves id of check-in/check-out text elements found in the Search and Refine tab
	
	public String getCheckInCheckOutTextID() {
		return properties.getProperty("checkInCheckOutTextID");
	}

	//this method retrieves id of Check-in label element found in the Calendar
	
	public String getCheckInLabelInCalendarID() {
		return properties.getProperty("checkInLabelInCalendarID");
	}

	//this method retrieves id of Check-in image element found in the Calendar
	
	public String getCheckInImageInCalendarID() {
		return properties.getProperty("checkInImageInCalendarID");
	}
	
	//this method retrieves id of left arrow image element inside Check-in layout in the Calendar
	
	public String getCheckInLeftArrowInCalendarID() {
		return properties.getProperty("checkInLeftArrowInCalendarID");
	}
	
	
	//this method retrieves id of right arrow image element inside Check-in layout in the Calendar
	
	public String getCheckInRightArrowInCalendarID() {
		return properties.getProperty("checkInRightArrowInCalendarID");
	}
			
	//this method retrieves id of check-in month name element inside Check-in layout in the Calendar
	
	public String getCheckInMonthNameInCalendarID() {
		return properties.getProperty("checkInMonthNameInCalendarID");
	}

	//this method retrieves id of check-in date element in the Calendar
	
	public String getCheckInDateInCalendarID() {
		return properties.getProperty("checkInDateInCalendarID");
	}
	
	
	//this method retrieves id of check-out date element in the Calendar
	
	public String getCheckOutDateInCalendarID() {
		return properties.getProperty("checkOutDateInCalendarID");
	}

	//this method retrieves id of Check-out image element found in the Calendar
	
	public String getCheckOutImageInCalendarID() {
		return properties.getProperty("checkOutImageInCalendarID");
	}
		
	
	//this method retrieves id of left arrow image element inside Check-out layout in the Calendar
	
	public String getCheckOutLeftArrowInCalendarID() {
		return properties.getProperty("checkOutLeftArrowInCalendarID");
	}
		
		
	//this method retrieves id of right arrow image element inside Check-out layout in the Calendar
		
	public String getCheckOutRightArrowInCalendarID() {
		return properties.getProperty("checkOutRightArrowInCalendarID");
	}
		

	//this method retrieves id of check-out month name element inside Check-in layout in the Calendar
	
	public String getCheckOutMonthNameInCalendarID() {
		return properties.getProperty("checkOutMonthInCalendarID");
	}

	//this method retrieves id of Go button element inside Search and Refine 
	
	public String getGoButtonID() {
		return properties.getProperty("goButtonID");
	}
	
	//this method retrieves id of Reset button element inside Search and Refine 
	
	public String getResetButtonID() {
		return properties.getProperty("resetButtonID");
	}

	//this method retrieves id of 'Show Results' element inside Search and Refine 
	
	public String getShowResultsButtonID() {
		return properties.getProperty("showResultsButtonID");
	}
	
	//this method retrieves id of result header element inside Search and Refine 
	
	public String getResultHeaderTextID() {
		return properties.getProperty("resultHeaderTextID");
	}
	
	//this method retrieves id of 'more info' element inside Search and Refine 
	
	public String getMoreInfoInCheckInCheckOutTextID() {
		return properties.getProperty("moreInfoInCheckInCheckOutTextID");
	}
		

	//this method retrieves id of 'more refine' element inside Search and Refine 
	
	public String getMoreRefineInCheckInCheckOutTextID() {
		return properties.getProperty("moreRefineInCheckInCheckOutTextID");
	}



	//this method retrieves id of more image element inside Search and Refine 
	
	public String getMoreImgInCheckInCheckOutTextID() {
		return properties.getProperty("moreImgInCheckInCheckOutTextID");
	}
	

	//this method retrieves id of 'Guests' bar element inside Search and Refine 
	
	public String getSeekGuestsBarID() {
		return properties.getProperty("seekGuestsBarID");
	}

	//this method retrieves id of no.of guests text element inside Search and Refine 
	
	public String getGuestsCountTextID() {
		return properties.getProperty("guestsCountTextID");
	}
	
	//this method retrieves id of 'Rooms' bar element inside Search and Refine 
	
	public String getSeekRoomsBarID() {
		return properties.getProperty("seekRoomsBarID");
	}
	

	//this method retrieves id of no.of rooms count element inside Search and Refine 
	
	public String getRoomsCountTextID() {
		return properties.getProperty("roomsCountTextID");
	}

	//this method retrieves id of 'Amenities' label element inside Search and Refine 
	
	public String getAmenitiesLabelTextID() {
		return properties.getProperty("amenitiesLabelTextID");
	}
	

	//this method retrieves id of 'Amenities' selection element inside Search and Refine 
	
	public String getAmenitiesSelectionID() {
		return properties.getProperty("amenitiesSelectionID");
	}
	


	//this method retrieves id of 'Style' element inside Search and Refine 
	
	public String getStyleLablelID() {
		return properties.getProperty("styleLabelID");
	}

	//this method retrieves id of style selection element inside Search and Refine 
	
	public String getStyleSelectionID() {
		return properties.getProperty("styleSelectionID");
	}


	//this method retrieves id of 'Bundles' element inside Search and Refine 
	
	public String getBundlesLabelID() {
		return properties.getProperty("bundlesLabelID");
	}

	
	//this method retrieves id of bundles selection element inside Search and Refine 
	
	public String getBundlesSelectionID() {
		return properties.getProperty("bundlesSelectionID");
	}


	//this method retrieves id of Switch view element inside Search and Refine 
	
	public String getSwitchViewID() {
		return properties.getProperty("switchViewID");
	}

	//this method retrieves id of 'Cancel' button element inside Search and Refine 
	
	public String getCancelButtonID() {
			return properties.getProperty("cancelButtonID");
	}

	//this method retrieves id of 'Reset' pop-up button element inside Search and Refine 
	
	public String getResetPopupButtonID() {
			return properties.getProperty("resetPopupButtonID");
	}
	

	//this method retrieves id of alert title element  
	
	public String getAlertTitleID() {
			return properties.getProperty("alertTitleID");
	}


	//this method retrieves id of 'Book Now' in sale detail page
	
	public String getBookNowButtonID() {
			return properties.getProperty("bookNowButtonID");
	}


	//this method retrieves id of 'Choose' in offer selection page
	
	public String getChooseButtonID() {
			return properties.getProperty("chooseButtonID");
	}


	//this method retrieves id of 'Show More' in offer selection page
	
	public String getShowMoreButtonID() {
			return properties.getProperty("showMoreButtonID");
	}
	
	//this method retrieves id of 'More details' link in offer selection page
	
	public String getMoreDetailsLinkTextID() {
			return properties.getProperty("moreDetailsLinkTextID");
	}
	
	//this method retrieves id of 'More details' link in offer selection page
	
	public String getChildPolicyLinkTextID() {
			return properties.getProperty("childPolicyLinkTextID");
	}
	
	//this method retrieves id of 'More details' link in offer selection page
	
	public String getSingleTravellersLinkTextID() {
			return properties.getProperty("singleTravellersLinkTextID");
	}
	
	//this method retrieves id of 'Payment' button in travel date selection page
	
	public String getPaymentButtonID() {
			return properties.getProperty("paymentButtonID");
	}
	
	//this method retrieves id of 'First Name' text in Your details menu page
	
	public String getFirstNameTextID() {
			return properties.getProperty("firstNameTextID");
	}
		
	//this method retrieves id of 'Last Name' text in Your details menu page
	
	public String getLastNameTextID() {
			return properties.getProperty("lastNameTextID");
	}

	//this method retrieves id of 'Address1' text in Your details menu page
	
	public String getAddress1TextID() {
			return properties.getProperty("address1TextID");
	}
	

	//this method retrieves id of 'Address2' text in Your details menu page
	
	public String getAddress2TextID() {
			return properties.getProperty("address2TextID");
	}
	

	//this method retrieves id of 'Post Code' text in Your details menu page
	
	public String postCodeTextID() {
			return properties.getProperty("postCodeTextID");
	}

	//this method retrieves id of 'City' text in Your details menu page
	
	public String cityTextID() {
			return properties.getProperty("cityTextID");
	}
	
	//this method retrieves id of 'Country' text in Your details menu page
	
	public String countryTextID() {
			return properties.getProperty("countryTextID");
	}
	
	//this method retrieves id of 'Home Phone' text in Your details menu page
	
	public String homePhoneLabelID() {
			return properties.getProperty("homePhoneLabelID");
	}
	
	//this method retrieves id of 'Phone' text in Your details menu page
	
	public String phoneTextID() {
			return properties.getProperty("phoneTextID");
	}
	
	//this method retrieves id of 'Email' text in Your details menu page
	
	public String emailDetailTextID() {
			return properties.getProperty("emailDetailTextID");
	}
	
	//this method retrieves id of 'Change Password' link in Your details menu page
	
	public String changePwdLinkID() {
			return properties.getProperty("changePwdLinkID");
	}
	
	//this method retrieves id of 'Edit Current Password' text field in Change Password page
	
	public String editCurrentPwdTextID() {
			return properties.getProperty("editCurrentPwdTextID");
	}
	
	//this method retrieves id of 'Edit New Password' text field in Change Password page
	
	public String editNewPwdTextID() {
			return properties.getProperty("editNewPwdTextID");
	}
	
	//this method retrieves id of 'Edit New Password Confirm' text field in Change Password page
	
	public String editNewPwdConfirmTextID() {
			return properties.getProperty("editNewPwdConfirmTextID");
	}

	//this method retrieves id of 'Save Changes' button field in Change Password page
	
	public String saveChangesButtonID() {
			return properties.getProperty("saveChangesButtonID");
	}

	//this method retrieves id of 'Subscription information' text area field in Your SUbscription page
	
	public String getSubscriptionInfoID() {
			return properties.getProperty("subscriptionInfoID");
	}
	
	//this method retrieves id of 'Mail preferences' bar field in Your SUbscription page
	
	public String getMailsBarID() {
			return properties.getProperty("mailsBarID");
	}

	//this method retrieves id of 'Credit balance' field in Your Credits page
	
	public String getYourCreditBalanceID() {
			return properties.getProperty("yourCreditBalanceID");
	}

	//this method retrieves id of empty menu field in Your Subscriptions, Saved menu pages (in case no data found)
	
	public String getEmptyMenuItemResultsID() {
			return properties.getProperty("emptyMenuItemResultsID");
	}

	//this method retrieves id of airport label field in Dates selection page
	
	public String getAirportNameLabelID() {
			return properties.getProperty("airportNameLabelID");
	}
	
	//this method retrieves id of Booking price label field in Dates selection page
	
	public String getBookingPriceLabelID() {
			return properties.getProperty("bookingPriceLabelID");
	}
	
	//this method retrieves id of Offer description label field in Dates selection page
	
	public String getOfferDescriptionLabelID() {
			return properties.getProperty("offerDescriptionLabelID");
	}
	
	//this method retrieves id of Payment page
	
	public String getPaymentPageID() {
			return properties.getProperty("paymentPageID");
	}
	
	//this method retrieves id of available check-in date
	
	public String getAvailableHotelCheckInDateID() {
			return properties.getProperty("availableHotelCheckInDateID");
	}

	//this method retrieves id of check-in date label
	
	public String getCheckInTextID() {
			return properties.getProperty("checkInTextID");
	}

	//this method retrieves id of check-out date label
	
	public String getCheckOutTextID() {
			return properties.getProperty("checkOutTextID");
	}
	
	//this method retrieves id of error message text element ID
	
	public String getErrorTextID() {
			return properties.getProperty("errorTextID");
	}
	
	
	
}	
	
	