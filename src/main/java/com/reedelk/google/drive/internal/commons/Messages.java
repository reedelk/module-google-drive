package com.reedelk.google.drive.internal.commons;

import com.reedelk.runtime.api.commons.FormattedMessage;

public class Messages {

    private Messages() {
    }

    public enum FileCreate implements FormattedMessage {

        FILE_NAME_EMPTY("The file name to be created on Google Drive must not be empty (DynamicValue=[%s])."),
        GENERIC_ERROR("The file with name=[%s] could not be created on Google Drive, cause=[%s]");


        private String message;

        FileCreate(String message) {
            this.message = message;
        }

        @Override
        public String template() {
            return message;
        }
    }
}
