package com.taobao.adaemon;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.adaemon.ProcessController;
import com.taobao.aranger.exception.IPCException;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.lang.reflect.Method;
import tb.gvk;
import tb.kge;
import tb.suq;

/* loaded from: classes.dex */
public class TriggerService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLAG_AUTO_START = "auto_start";
    public static final String FLAG_PROVIDER_START = "provider_start";
    public static final String KEY_TYPE = "type";
    public static final int TYPE_COMMAND = 2;
    public static final int TYPE_NONE = -1;
    public static final int TYPE_PUSH = 4;
    public static final int TYPE_RECENT = 8;
    public static final int TYPE_SCHEDULE = 1;
    public static final int TYPE_UNKNOW = 64;

    /* renamed from: a */
    public static volatile int f8335a;
    public static int b;
    public static Method c;
    private static final Handler d;
    private static final ITrigger f;
    private static boolean g;
    public static boolean h;
    private final Messenger e = new Messenger(d);

    public static /* synthetic */ Object ipc$super(TriggerService triggerService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean lambda$LfmPdpYvLGOCmi1QHN_vVFCX2Ps(TriggerService triggerService) {
        return triggerService.b();
    }

    public static /* synthetic */ void lambda$pueKUcKlJrtKdo0tQRg1JRR5Qeg(Intent intent) {
        b(intent);
    }

    static {
        kge.a(1795037466);
        f8335a = -1;
        d = new Handler(Looper.getMainLooper());
        try {
            Method method = Class.forName("com.taobao.monitor.impl.common.ProcessStart").getMethod("setProcessStartType", Integer.TYPE);
            c = method;
            method.setAccessible(true);
        } catch (Throwable unused) {
            c = null;
        }
        f = $$Lambda$TriggerService$aIK13NgmgofVPWqlDGvjsSQr82w.INSTANCE;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        l.a(true);
        e.b("TriggerService", "onCreate()", new Object[0]);
    }

    @Override // android.app.Service
    public IBinder onBind(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$TriggerService$pueKUcKlJrtKdo0tQRg1JRR5Qeg
            @Override // java.lang.Runnable
            public final void run() {
                TriggerService.lambda$pueKUcKlJrtKdo0tQRg1JRR5Qeg(intent);
            }
        });
        a(intent);
        if (!g) {
            g = true;
            boolean booleanExtra = intent.getBooleanExtra(FLAG_AUTO_START, true);
            h = intent.getBooleanExtra(FLAG_PROVIDER_START, false);
            e.b("TriggerService", "startService from onBind", "autoStart", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                a(getApplicationContext());
            } else if (Build.VERSION.SDK_INT >= 23) {
                try {
                    new Handler(Looper.getMainLooper()).getLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.adaemon.-$$Lambda$TriggerService$LfmPdpYvLGOCmi1QHN_vVFCX2Ps
                        {
                            TriggerService.this = this;
                        }

                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            return TriggerService.lambda$LfmPdpYvLGOCmi1QHN_vVFCX2Ps(TriggerService.this);
                        }
                    });
                } catch (Throwable th) {
                    e.a("TriggerService", "startService when idle", th, new Object[0]);
                }
            }
        }
        return this.e.getBinder();
    }

    public static /* synthetic */ void b(Intent intent) {
        if (c != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("isTriggerAlive", false);
                Method method = c;
                int i = 1;
                Object[] objArr = new Object[1];
                if (!booleanExtra) {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                method.invoke(null, objArr);
                e.b("TriggerService", "main isTrigger:" + booleanExtra, new Object[0]);
            } catch (Exception e) {
                e.a("TriggerService", "invoke set process start type into apm error", e, new Object[0]);
            }
        }
    }

    public /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        e.b("TriggerService", "main idle", new Object[0]);
        a(getApplicationContext());
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        e.b("TriggerService", "onStartCommand()", new Object[0]);
        a(intent);
        return 2;
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        int intExtra = intent == null ? 64 : intent.getIntExtra("type", 64);
        b |= intExtra;
        if (f8335a != -1) {
            return;
        }
        f8335a = intExtra;
        e.b("TriggerService", "setType()", suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, Integer.valueOf(f8335a));
        if (f8335a == -1 || f8335a == 64 || !l.c()) {
            return;
        }
        c.a($$Lambda$TriggerService$p7nhc0ifvSPTvwCUGFngbhTsBE.INSTANCE);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            ProcessController.b.a(f);
        }
    }

    public static /* synthetic */ void a(String str) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            if (!ITrigger.TYPE_SYS_SCHEDULE.equals(str)) {
                return;
            }
            a(l.e());
        } catch (Throwable th) {
            e.a("TriggerService", "trigger err", th, new Object[0]);
        }
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (!l.c() || g.a()) {
                return;
            }
            if ((!h && gvk.a(gvk.a()) != -2) || !TimeMeter.a("adaemon_trigger", QrCodeData.QR_CODE_VALID_PERIOD)) {
                return;
            }
            context.startService(new Intent(context, TriggerService.class));
            e.b("TriggerService", "startService success", new Object[0]);
        } catch (Throwable th) {
            e.a("TriggerService", "startService err", th, new Object[0]);
        }
    }
}
