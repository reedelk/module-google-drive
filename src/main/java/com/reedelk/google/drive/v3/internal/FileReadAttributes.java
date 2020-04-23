package com.reedelk.google.drive.v3.internal;

import java.io.Serializable;
import java.util.HashMap;

public class FileReadAttributes extends HashMap<String, Serializable> {

    public FileReadAttributes(String fileId) {
        put("fileId", fileId);
    }
}
