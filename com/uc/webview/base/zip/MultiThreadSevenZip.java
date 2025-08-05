package com.uc.webview.base.zip;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.Log;
import com.uc.webview.base.cyclone.Z7Dec;
import com.uc.webview.base.io.d;
import java.io.File;

/* loaded from: classes9.dex */
public final class MultiThreadSevenZip {
    public static final int SZ_ERROR_LIBC_ENOSPC = 28;
    public static final int SZ_OK = 0;
    private static final String TAG = "7zmt";
    private static volatile boolean sNativeReady = false;
    private final String mCheckFile;

    public MultiThreadSevenZip() {
        this(null);
    }

    public MultiThreadSevenZip(String str) {
        this.mCheckFile = str;
    }

    private void checkFileIfNeed(int i, String str) {
        if (i == 0) {
            try {
                if (TextUtils.isEmpty(this.mCheckFile)) {
                    return;
                }
                File file = new File(this.mCheckFile);
                if (file.exists() && file.length() > 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("dec failed:\n");
                d.a(sb, new File(str));
                Log.w(TAG, sb.toString());
            } catch (Throwable th) {
                Log.w(TAG, "maybe dec failed", th);
            }
        }
    }

    public final int deccompress(Context context, String str, String str2) {
        return deccompress(context, str, str2, "");
    }

    public final int deccompress(Context context, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        int dec = Z7Dec.dec(str, str2);
        Log.d(TAG, "dec7z file:" + str + ", out:" + str2 + ", ret:" + dec + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
        checkFileIfNeed(dec, str2);
        return dec;
    }
}
