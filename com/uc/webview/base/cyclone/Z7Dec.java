package com.uc.webview.base.cyclone;

/* loaded from: classes9.dex */
public class Z7Dec {
    public static int dec(String str, String str2) {
        int i = a.f23777a;
        return i != -1000 ? i : decImpl(str, str2);
    }

    private static native int decImpl(String str, String str2);
}
