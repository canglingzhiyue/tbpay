package com.loc;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7652a = x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static ai f;
    private List<String> b;
    private String c;
    private final Context d;
    private final Handler e;

    /* loaded from: classes4.dex */
    private static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ai> f7654a;

        a(Looper looper, ai aiVar) {
            super(looper);
            this.f7654a = new WeakReference<>(aiVar);
        }

        a(ai aiVar) {
            this.f7654a = new WeakReference<>(aiVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ai aiVar = this.f7654a.get();
            if (aiVar == null || message == null || message.obj == null) {
                return;
            }
            aiVar.a((String) message.obj, message.what);
        }
    }

    private ai(Context context) {
        this.d = context.getApplicationContext();
        this.e = Looper.myLooper() == null ? new a(Looper.getMainLooper(), this) : new a(this);
    }

    public static ai a(Context context) {
        if (f == null) {
            synchronized (ai.class) {
                if (f == null) {
                    f = new ai(context);
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.loc.ai$1] */
    public synchronized void a(final String str, final int i) {
        ContentResolver contentResolver;
        String str2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread() { // from class: com.loc.ai.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    ContentResolver contentResolver2;
                    String str3;
                    String b = ao.b(str);
                    if (!TextUtils.isEmpty(b)) {
                        if ((i & 1) > 0) {
                            try {
                                if (Build.VERSION.SDK_INT < 23) {
                                    contentResolver2 = ai.this.d.getContentResolver();
                                    str3 = ai.this.c;
                                } else if (Settings.System.canWrite(ai.this.d)) {
                                    contentResolver2 = ai.this.d.getContentResolver();
                                    str3 = ai.this.c;
                                }
                                Settings.System.putString(contentResolver2, str3, b);
                            } catch (Exception unused) {
                            }
                        }
                        if ((i & 16) > 0) {
                            ak.a(ai.this.d, ai.this.c, b);
                        }
                        if ((i & 256) <= 0) {
                            return;
                        }
                        SharedPreferences.Editor edit = ai.this.d.getSharedPreferences(ai.f7652a, 0).edit();
                        edit.putString(ai.this.c, b);
                        if (Build.VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    }
                }
            }.start();
            return;
        }
        String b = ao.b(str);
        if (!TextUtils.isEmpty(b)) {
            if ((i & 1) > 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        contentResolver = this.d.getContentResolver();
                        str2 = this.c;
                    } else {
                        contentResolver = this.d.getContentResolver();
                        str2 = this.c;
                    }
                    Settings.System.putString(contentResolver, str2, b);
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                ak.a(this.d, this.c, b);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor edit = this.d.getSharedPreferences(f7652a, 0).edit();
                edit.putString(this.c, b);
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                    return;
                }
                edit.commit();
            }
        }
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        List<String> list = this.b;
        if (list != null) {
            list.clear();
            this.b.add(str);
        }
        a(str, Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
    }
}
