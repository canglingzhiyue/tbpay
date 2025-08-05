package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import tb.smr;

/* loaded from: classes5.dex */
public class smn implements OnScreenChangedListener, smq, smr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33720a;
    private final f<OnScreenChangedListener> b = new f<>();
    private final f<smr> c = new f<>();

    static {
        kge.a(-2031216584);
        kge.a(-758729333);
        kge.a(-855224269);
        kge.a(825059505);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
    }

    public smn(FluidContext fluidContext) {
        this.f33720a = fluidContext;
    }

    @Override // tb.smq
    public void addDeviceRotateListener(smr smrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16215c05", new Object[]{this, smrVar});
        } else if (smrVar == null) {
        } else {
            this.c.a(smrVar);
        }
    }

    @Override // tb.smq
    public void addDeviceRotateListener(smr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120f66e8", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.a(aVar);
        }
    }

    public void addOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effcfd4d", new Object[]{this, onScreenChangedListener});
        } else if (onScreenChangedListener == null) {
        } else {
            this.b.a(onScreenChangedListener);
        }
    }

    public void removeDeviceRotateListener(smr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416b2e0b", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.c(aVar);
        }
    }

    public void removeDeviceRotateListener(smr smrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fa8fe8", new Object[]{this, smrVar});
        } else if (smrVar == null) {
        } else {
            this.c.c(smrVar);
        }
    }

    public void removeOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b87bf30", new Object[]{this, onScreenChangedListener});
        } else if (onScreenChangedListener == null) {
        } else {
            this.b.c(onScreenChangedListener);
        }
    }

    @Override // tb.smr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("DeviceListenerManager", "onPhoneRotate 被执行，监听器数量：" + this.c.b());
        for (smr smrVar : this.c.a()) {
            try {
                smrVar.b();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33720a, smrVar, "onPhoneRotate", e);
            }
        }
    }

    @Override // tb.smr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("DeviceListenerManager", "onTabletRotate 被执行， 监听器数量：" + this.c.b());
        for (smr smrVar : this.c.a()) {
            try {
                smrVar.a();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33720a, smrVar, "onTabletRotate", e);
            }
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        spz.c("DeviceListenerManager", "onScreenChanged: " + i);
        for (OnScreenChangedListener onScreenChangedListener : this.b.a()) {
            try {
                onScreenChangedListener.onScreenChanged(i, configuration);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33720a, onScreenChangedListener, "onScreenChanged", e);
            }
        }
    }
}
