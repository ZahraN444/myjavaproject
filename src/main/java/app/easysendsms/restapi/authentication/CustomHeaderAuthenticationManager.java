/*
 * EasySendSMSAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package app.easysendsms.restapi.authentication;

import app.easysendsms.restapi.CustomHeaderAuthenticationCredentials;
import io.apimatic.core.authentication.HeaderAuth;
import java.util.HashMap;

public class CustomHeaderAuthenticationManager extends HeaderAuth implements CustomHeaderAuthenticationCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private CustomHeaderAuthenticationModel authModel;

    /**
     * Constructor that sets custom header parameters.
     */
    public CustomHeaderAuthenticationManager(CustomHeaderAuthenticationModel authModel) {

        super(new HashMap<String,String>() {
            private static final long serialVersionUID = 1L;
            {
                put("apikey", authModel.getApikey());
            }
        });

        this.authModel = authModel;
    }

    /**
     * String value for apikey.
     * @return apikey
     */
    public String getApikey() {
        return authModel.getApikey();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param apikey String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String apikey) {
        return apikey.equals(getApikey());
    }

    /**
     * Converts this CustomHeaderAuthenticationManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomHeaderAuthenticationManager [" + "apikey=" + getApikey() + "]";
    }
    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "CustomHeaderAuthentication - " + errorMessage;
     }

}
