package tb;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dvz implements ComponentCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ drk f27027a;

    public dvz(dvy dvyVar, drk drkVar) {
        this.f27027a = drkVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        drk drkVar = this.f27027a;
        drkVar.getClass();
        if (drm.f26925a) {
            drkVar.f26923a = false;
            drx drxVar = drkVar.d;
            if ((drxVar instanceof dyv) || !(drxVar instanceof hiv)) {
                return;
            }
            ((hiv) drxVar).c = Long.MIN_VALUE;
            return;
        }
        synchronized (drkVar.f) {
            drx drxVar2 = drkVar.d;
            if (!(drxVar2 instanceof dyv) && (drxVar2 instanceof hiv)) {
                ((hiv) drxVar2).c = Long.MIN_VALUE;
            }
            drkVar.f26923a = false;
            drkVar.b = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }
}
