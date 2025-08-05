package com.taobao.adaemon;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class TriggerChannelService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_BINDER = "binder";
    public static final String EXTRA_CHANNEL = "channel";
    public static final String EXTRA_MAIN = "main";
    public static final String EXTRA_ORIGIN = "origin";
    public static final String EXTRA_TYPE = "type";
    public static final int TRIGGER_VERSION_CODE = 305;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f8331a;
    private final Messenger b = new Messenger(f8331a);

    public static /* synthetic */ Object ipc$super(TriggerChannelService triggerChannelService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-2015761875);
        f8331a = new Handler(Looper.getMainLooper());
    }

    /* loaded from: classes.dex */
    public static class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f8333a;

        static {
            kge.a(1348140882);
            kge.a(808545181);
        }

        public a(Application application) {
            this.f8333a = application;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            } else {
                this.f8333a.unbindService(this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                this.f8333a.unbindService(this);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        a(intent.getExtras());
        return this.b.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        e.b("TriggerChannelService", null, "onCreate()");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.adaemon.TriggerChannelService.a(android.os.Bundle):void");
    }
}
