package com.group0536.puzzlemazing.models;

import android.content.res.Resources;

import com.group0536.puzzlemazing.R;

/**
 * This class stores the progress during the initialization of application.
 *
 * @author Jimmy Lan
 */
public class AppInitProgress {
    // Steps required to initialize application
    private boolean isUpdateCheckDone;
    private boolean isLoadSavedTokenDone;
    private boolean isLogInUserDone;

    // errorMessage associating with errors. It is empty if no error occurred.
    private String errorMessage;

    public AppInitProgress() {
    }

    public boolean isUpdateCheckDone() {
        return isUpdateCheckDone;
    }

    public void setUpdateCheckDone(boolean updateCheckDone) {
        isUpdateCheckDone = updateCheckDone;
    }

    public boolean isLoadSavedTokenDone() {
        return isLoadSavedTokenDone;
    }

    public void setLoadSavedTokenDone(boolean loadSavedTokenDone) {
        isLoadSavedTokenDone = loadSavedTokenDone;
    }

    public boolean isLogInUserDone() {
        return isLogInUserDone;
    }

    public void setLogInUserDone(boolean logInUserDone) {
        isLogInUserDone = logInUserDone;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(int errorMessageId) {
        errorMessage = Resources.getSystem().getString(errorMessageId);
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean hasError() {
        return errorMessage == null || errorMessage.equals("");
    }
}
