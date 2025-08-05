package tb;

import android.app.Application;
import android.os.Handler;
import android.util.Log;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* loaded from: classes.dex */
public class aku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f25410a;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, float f);
    }

    public aku a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aku) ipChange.ipc$dispatch("f2419b04", new Object[]{this, application});
        }
        alf.f25418a = application;
        return this;
    }

    public aku a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aku) ipChange.ipc$dispatch("244c3bc3", new Object[]{this, handler});
        }
        alf.b = handler;
        return this;
    }

    public aku a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aku) ipChange.ipc$dispatch("5358fe0b", new Object[]{this, aVar});
        }
        this.f25410a = aVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (alf.f25418a == null) {
            Log.e(alf.TAG, "you must setContext before start!");
        } else {
            if (!ABGlobal.isFeatureOpened(alf.f25418a, "deviceScore32DowngradeOff")) {
                alf.c = com.taobao.android.diagnose.common.a.b();
            }
            akr akrVar = new akr();
            akrVar.a(this.f25410a);
            akrVar.a();
            akt.a(new akx(akrVar));
            akv.a(alf.f25418a, akrVar);
            akw.a(akrVar);
        }
    }

    public static HardWareInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HardWareInfo) ipChange.ipc$dispatch("866eb86e", new Object[0]);
        }
        if (alf.f25418a == null) {
            return null;
        }
        HardWareInfo hardWareInfo = new HardWareInfo(alf.f25418a);
        alf.f25418a.registerActivityLifecycleCallbacks(new com.ali.alihadeviceevaluator.old.a(hardWareInfo));
        aks.a().g();
        int h = hardWareInfo.h();
        if (h > 0) {
            aks.a().a(h);
        }
        akw.a(hardWareInfo);
        return hardWareInfo;
    }
}
