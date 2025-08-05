package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.alibaba.analytics.core.sync.q;
import com.loc.at;
import com.loc.f;
import com.loc.fr;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes3.dex */
public class APSService extends Service {

    /* renamed from: a  reason: collision with root package name */
    f f6386a;
    int b = 0;
    boolean c = false;

    private void a(Context context) {
        try {
            if (this.f6386a == null) {
                this.f6386a = new f(context);
            }
            this.f6386a.a();
        } catch (Throwable th) {
            fr.a(th, "APSService", i.b.MEASURE_ONCREATE);
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f6386a.a(intent);
        } catch (Throwable th) {
            fr.a(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f6386a.b();
            if (this.c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            fr.a(th, "APSService", MessageID.onDestroy);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(at.f, 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra(q.MSGTYPE_INTERVAL, 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.c = true;
                        this.b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra(at.j, true) && this.b > 0) {
                        this.b--;
                    }
                    if (this.b <= 0) {
                        stopForeground(true);
                        this.c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
