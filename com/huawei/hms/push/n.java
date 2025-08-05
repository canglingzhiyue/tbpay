package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class n extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private Context f7526a;
    private m b;

    public n(Context context, m mVar) {
        this.f7526a = context;
        this.b = mVar;
    }

    private static Intent a(Context context, m mVar) {
        if (mVar == null) {
            return null;
        }
        Intent b = d.b(context, mVar.d());
        if (mVar.n() == null) {
            if (mVar.a() != null) {
                Intent intent = new Intent(mVar.a());
                if (d.a(context, mVar.d(), intent).booleanValue()) {
                    b = intent;
                }
            }
            b.setPackage(mVar.d());
            return b;
        }
        try {
            Intent parseUri = Intent.parseUri(mVar.n(), 0);
            parseUri.setSelector(null);
            if (parseUri.getClipData() == null) {
                parseUri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
            }
            HMSLog.d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + parseUri.getAction());
            return d.a(context, mVar.d(), parseUri).booleanValue() ? parseUri : b;
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "intentUri error," + e.toString());
            return b;
        }
    }

    private boolean a(Context context) {
        return d.c(context, this.b.d());
    }

    private boolean b(Context context) {
        if ("cosa".equals(this.b.i())) {
            return a(context);
        }
        return true;
    }

    private boolean b(Context context, m mVar) {
        if (!"cosa".equals(mVar.i()) || a(context, mVar) != null) {
            return false;
        }
        HMSLog.d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.i("PushSelfShowLog", "enter run()");
        try {
            if (!b(this.f7526a) || b(this.f7526a, this.b)) {
                return;
            }
            l.a(this.f7526a, this.b);
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", e.toString());
        }
    }
}
