package com.uc.webview.base.cyclone;

import android.util.Log;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23777a;

    static {
        NullPointerException nullPointerException;
        int i;
        try {
            System.loadLibrary("cycloneuc");
            i = -1000;
            nullPointerException = null;
        } catch (NullPointerException e) {
            nullPointerException = e;
            i = -1004;
        } catch (SecurityException e2) {
            nullPointerException = e2;
            i = -1002;
        } catch (UnsatisfiedLinkError e3) {
            nullPointerException = e3;
            i = -1003;
        } catch (Throwable th) {
            nullPointerException = th;
            i = -1001;
        }
        if (nullPointerException != null) {
            Log.e("ucbs.cyclone", "load libcycloneuc.so exception: ".concat(String.valueOf(nullPointerException)));
        }
        f23777a = i;
    }
}
