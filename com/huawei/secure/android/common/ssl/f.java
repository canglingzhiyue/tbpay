package com.huawei.secure.android.common.ssl;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import tb.cyp;
import tb.cyr;
import tb.cys;
import tb.cyu;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7610a = "SecureX509SingleInstance";
    private static volatile g b;

    private f() {
    }

    public static g a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            cyr.a(context);
            if (b == null) {
                synchronized (f.class) {
                    if (b == null) {
                        InputStream b2 = cyp.b(context);
                        if (b2 == null) {
                            cyu.a(f7610a, "get assets bks");
                            b2 = context.getAssets().open(g.d);
                        } else {
                            cyu.a(f7610a, "get files bks");
                        }
                        b = new g(b2, "");
                        new cys().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            String str = "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
            return b;
        }
        throw new NullPointerException("context is null");
    }
}
