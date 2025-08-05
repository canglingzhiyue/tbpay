package com.uc.webview.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/* loaded from: classes9.dex */
public final class j {
    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf(".jar");
        String str2 = str.substring(0, lastIndexOf) + "jar";
        if (new File(str2).exists()) {
            return str2;
        }
        try {
            Files.createSymbolicLink(Paths.get(str2, new String[0]), Paths.get(str, new String[0]), new FileAttribute[0]);
        } catch (FileAlreadyExistsException unused) {
        } catch (IOException e) {
            android.util.Log.e("UCLoaderAndroid12", "failed to create symblic file: " + str + ", and use the default dex path: " + str, e);
            return str;
        }
        return str2;
    }
}
