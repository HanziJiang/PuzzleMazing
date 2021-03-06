package com.group0536.puzzlemazing.actions.appinit;

public interface AppInitializeActions {
    String PREFIX = "app-init-";
    String START_INITIALIZATION = PREFIX + "start";
    String RESTART_INITIALIZATION = PREFIX + "restart";
    String FINISH_INITIALIZATION = PREFIX + "finish";
    String CHECK_UPDATE = PREFIX + "check-update";
    String LOAD_SAVED_TOKEN = PREFIX + "load-saved-token";
    String CLEAR_CURRENT_USER = PREFIX + "clear-current-user";
    String LOG_IN = PREFIX + "login";
    String SKIP_LOG_IN = PREFIX + "skip-login";
    String REGISTER = PREFIX + "register";
    String SEND_USER = PREFIX + "send-user";

    // keys
    String KEY_REQUIRE_UPDATE = "require-update";
    String KEY_CURRENT_USER = "current-user";
    String KEY_CONTEXT = "context";

    String KEY_ERROR_MESSAGE = "error-message";
}
