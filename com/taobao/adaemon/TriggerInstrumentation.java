package com.taobao.adaemon;

import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kat;
import tb.kge;
import tb.mto;
import tb.rty;

/* loaded from: classes.dex */
public class TriggerInstrumentation extends Instrumentation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public static AtomicBoolean triggered;

    /* loaded from: classes.dex */
    public static class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f8334a;

        static {
            kge.a(-1415747376);
            kge.a(808545181);
        }

        public a(Application application) {
            this.f8334a = application;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            } else {
                this.f8334a.unbindService(this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                this.f8334a.unbindService(this);
            }
        }
    }

    static {
        kge.a(633162963);
        TAG = TriggerInstrumentation.class.getSimpleName();
        triggered = new AtomicBoolean();
    }

    public static /* synthetic */ Object ipc$super(TriggerInstrumentation triggerInstrumentation, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1263725205) {
            super.callApplicationOnCreate((Application) objArr[0]);
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ad156b", new Object[]{this, application});
            return;
        }
        super.callApplicationOnCreate(application);
        rty.f33380a.d(TAG, "callApplicationOnCreate", new Object[0]);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        rty.f33380a.d(TAG, i.b.MEASURE_ONCREATE, new Object[0]);
        triggered.set(true);
        kat.a("keepalive", "full_verify", "instr", mto.a.GEO_NOT_SUPPORT);
        if (bundle == null) {
            return;
        }
        Intent intent = new Intent(getContext(), TriggerChannelService.class);
        intent.replaceExtras(bundle);
        getContext().getApplicationContext().bindService(intent, new a((Application) getContext().getApplicationContext()), 1);
    }
}
