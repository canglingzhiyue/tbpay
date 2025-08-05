package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import tb.kge;

/* loaded from: classes.dex */
public class ACCSRestartService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-865111904);
    }

    public static /* synthetic */ Object ipc$super(ACCSRestartService aCCSRestartService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case 413640386:
                super.onCreate();
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        ALog.e("ACCSRestartService", "onCreate()", new Object[0]);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        ALog.e("ACCSRestartService", "onStartCommand()", new Object[0]);
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ALog.e("ACCSRestartService", "onDestroy()", new Object[0]);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        ALog.e("ACCSRestartService", "onLowMemory()", new Object[0]);
        a(getApplicationContext());
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        ALog.e("ACCSRestartService", "onTrimMemory()", "level", Integer.valueOf(i));
        a(getApplicationContext());
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!UtilityImpl.isAppKeepAlive()) {
            ALog.e("ACCSRestartService", "not keep alive", new Object[0]);
        } else if (!TimeMeter.a(TimeMeter.TAG_RESTART_SERVICE, 10000L)) {
        } else {
            try {
                context.startService(new Intent(context, ACCSRestartService.class));
                ALog.e("ACCSRestartService", "start success", new Object[0]);
            } catch (Throwable th) {
                ALog.e("ACCSRestartService", "startService err", th, new Object[0]);
            }
        }
    }
}
