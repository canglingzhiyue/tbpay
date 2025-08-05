package com.unionpay;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.unionpay.utils.UPUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class h implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Handler f24023a;
    private e b;
    private WeakReference c;
    private String d;
    private String e;
    private volatile boolean f = false;

    public h(e eVar, Context context, String str, String str2) {
        this.c = null;
        if (context != null) {
            this.c = new WeakReference(context);
        }
        this.b = eVar;
        this.f24023a = new Handler(Looper.getMainLooper(), this);
        this.d = str;
        this.e = str2;
    }

    private static synchronized String a(Context context) {
        String a2;
        synchronized (h.class) {
            a2 = com.unionpay.utils.b.a(UPUtils.a(context, "direct_configs"), UPUtils.a(context, "direct_mode"));
        }
        return a2;
    }

    private static synchronized void a(Context context, String str, String str2) {
        synchronized (h.class) {
            UPUtils.a(context, str2, "direct_configs");
            UPUtils.a(context, str, "direct_mode");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(h hVar, String str) {
        ArrayList arrayList = null;
        try {
            String a2 = com.unionpay.utils.b.a(str, hVar.d);
            if (!TextUtils.isEmpty(a2)) {
                arrayList = com.unionpay.utils.b.b(hVar.b(), a2);
            }
            hVar.a(arrayList);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            a(hVar.b(), hVar.d, str);
        } catch (Exception unused) {
        }
    }

    private void a(String str, String str2) {
        if (this.b == null || this.f) {
            return;
        }
        this.f = true;
        this.b.onError(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context b() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void a() {
        if (b() == null) {
            Handler handler = this.f24023a;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(1011);
            return;
        }
        String c = UPUtils.c(com.unionpay.utils.b.a(this.d));
        String a2 = a(b());
        if (!TextUtils.isEmpty(a2)) {
            a(com.unionpay.utils.b.b(b(), a2));
        }
        if (!TextUtils.isEmpty(c)) {
            Executors.newSingleThreadExecutor().execute(new i(this, c));
            return;
        }
        Handler handler2 = this.f24023a;
        if (handler2 == null) {
            return;
        }
        handler2.sendEmptyMessage(1010);
    }

    public final void a(ArrayList arrayList) {
        Handler handler = this.f24023a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 1007;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("directApps", arrayList);
            obtainMessage.setData(bundle);
            this.f24023a.sendMessage(obtainMessage);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case 1007:
                Bundle data = message.getData();
                if (this.b != null && !this.f) {
                    this.f = true;
                    if (data != null && data.getStringArrayList("directApps") != null) {
                        this.b.onResult(data);
                        break;
                    } else {
                        this.b.onError("03", "unknown error");
                        break;
                    }
                }
                break;
            case 1008:
            case 1009:
                str = "02";
                str2 = "network error";
                a(str, str2);
                break;
            case 1010:
                a("03", "unknown error");
                break;
            case 1011:
                str = "01";
                str2 = "parameter error";
                a(str, str2);
                break;
        }
        return true;
    }
}
