package com.reedelk.google.drive.v3.internal;

import com.google.api.services.drive.model.File;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FileListAttributes extends HashMap<String, Serializable> {

    private static final String ATTR_WEB_CONTENT_LINK = "webContentLink";
    private static final String ATTR_WEB_VIEW_LINK = "webViewLink";
    private static final String ATTR_NAME = "name";
    private static final String ATTR_ID = "id";

    public static final List<String> ALL_ATTRIBUTES =
            Arrays.asList(ATTR_WEB_CONTENT_LINK, ATTR_WEB_VIEW_LINK, ATTR_NAME, ATTR_ID);
// TODO: IDentify which attributes
    public FileListAttributes(File file) {
    }
}
