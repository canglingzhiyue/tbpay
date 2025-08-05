package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    e f7781a;
    Context b;
    Messenger c = null;

    public f(Context context) {
        this.f7781a = null;
        this.b = null;
        this.b = context.getApplicationContext();
        this.f7781a = new e(this.b);
    }

    public final IBinder a(Intent intent) {
        this.f7781a.b(intent);
        this.f7781a.a(intent);
        this.c = new Messenger(this.f7781a.b());
        return this.c.getBinder();
    }

    public final void a() {
        try {
            e.d();
            this.f7781a.j = fy.b();
            this.f7781a.k = fy.a();
            this.f7781a.a();
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", i.b.MEASURE_ONCREATE);
        }
    }

    public final void b() {
        try {
            if (this.f7781a == null) {
                return;
            }
            this.f7781a.b().sendEmptyMessage(11);
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", MessageID.onDestroy);
        }
    }
}
