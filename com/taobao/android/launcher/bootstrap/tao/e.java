package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gtx;
import tb.gtz;
import tb.gvi;
import tb.orq;
import tb.sad;

/* loaded from: classes.dex */
public class e implements Handler.Callback, a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f13086a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final Handler d = new Handler(Coordinator.getWorkerLooper(), this);
    private final gtz c = new gtz();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public void a(Application application, gtx gtxVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388fc9ed", new Object[]{this, application, gtxVar, aVar});
            return;
        }
        this.f13086a = aVar;
        if (StringUtils.equals(gtxVar.b, gtxVar.f28453a)) {
            h.b("Sche-LifeCycle", "startup watchdog setup");
            this.d.sendEmptyMessageDelayed(2, orq.FRAME_CHECK_TIMEOUT);
            this.d.sendEmptyMessageDelayed(3, sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
            this.d.sendEmptyMessageDelayed(4, 10000L);
            h.b("Sche-LifeCycle", "startup watchdog setup finished");
        }
        this.c.a(application, gtxVar);
        this.c.a();
    }

    public boolean j_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba31ef40", new Object[]{this})).booleanValue() : this.b.get();
    }

    public void dN_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3459633c", new Object[]{this});
            return;
        }
        this.d.removeMessages(2);
        com.taobao.application.common.c.a(this);
        long j = TBToast.Duration.LONG;
        int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
        if (a2 == 1) {
            j = 5500;
        } else if (a2 == 2) {
            j = 6500;
        }
        this.d.sendEmptyMessageDelayed(1, j);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            h.b("Sche-LifeCycle", "scheduleLaunchCompleted, reason: " + str);
            this.d.removeMessages(1);
            this.c.a();
            this.c.b();
            a aVar = this.f13086a;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.b("Sche-LifeCycle", "scheduleBackgroundDeepIdle");
        gvi.a("scheduleBackgroundDeepIdle");
        gvi.b("scheduleBackgroundDeepIdle");
        a aVar = this.f13086a;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        h.b("Sche-LifeCycle", "scheduleLaunchCompleteTimeout: " + str);
        gvi.a(str);
        gvi.b(str);
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != 0 || i2 != 2) {
        } else {
            h.b("Sche-LifeCycle", "launch finished, try cancel watchdog settled before");
            this.d.removeMessages(3);
            this.d.removeMessages(4);
            a("callback");
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            a("delay");
            return true;
        } else if (i == 2) {
            c();
            return true;
        } else if (i == 3) {
            b("launchCompleteTimeout6");
            return true;
        } else if (i != 4) {
            return false;
        } else {
            b("launchCompleteTimeout10");
            return true;
        }
    }
}
