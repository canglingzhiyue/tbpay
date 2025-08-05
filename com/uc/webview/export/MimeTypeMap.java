package com.uc.webview.export;

import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IMimeTypeMap;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes9.dex */
public class MimeTypeMap {
    private static HashMap<Integer, MimeTypeMap> sInstances;
    private IMimeTypeMap mMimeTypeMap;

    private MimeTypeMap(IMimeTypeMap iMimeTypeMap) {
        this.mMimeTypeMap = iMimeTypeMap;
    }

    public static String getFileExtensionFromUrl(String str) {
        return getSingleton().mMimeTypeMap.getFileExtensionFromUrlEx(str);
    }

    private static synchronized MimeTypeMap getInstance(int i) throws RuntimeException {
        MimeTypeMap mimeTypeMap;
        synchronized (MimeTypeMap.class) {
            if (sInstances == null) {
                sInstances = new HashMap<>();
            }
            mimeTypeMap = sInstances.get(Integer.valueOf(i));
            if (mimeTypeMap == null) {
                mimeTypeMap = new MimeTypeMap(b.e(i));
                sInstances.put(Integer.valueOf(i), mimeTypeMap);
            }
        }
        return mimeTypeMap;
    }

    public static MimeTypeMap getSingleton() throws RuntimeException {
        return getInstance(e.a());
    }

    public static MimeTypeMap getSingleton(WebView webView) throws RuntimeException {
        return getInstance(webView.getCurrentViewCoreType());
    }

    public String getExtensionFromMimeType(String str) {
        return this.mMimeTypeMap.getExtensionFromMimeType(str);
    }

    public String getMimeTypeFromExtension(String str) {
        return this.mMimeTypeMap.getMimeTypeFromExtension(str);
    }

    public boolean hasExtension(String str) {
        return this.mMimeTypeMap.hasExtension(str);
    }

    public boolean hasMimeType(String str) {
        return this.mMimeTypeMap.hasMimeType(str);
    }

    public String toString() {
        return "MimeTypeMap@" + hashCode() + riy.ARRAY_START_STR + this.mMimeTypeMap + riy.ARRAY_END_STR;
    }
}
