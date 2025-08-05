package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import tb.sht;

/* loaded from: classes5.dex */
public class shp implements shs, sht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33584a;
    private final f<sht> b = new f<>();
    private final f<shs> c = new f<>();

    static {
        kge.a(872358235);
        kge.a(-1856029082);
        kge.a(-1514374609);
        kge.a(-58582805);
    }

    public shp(FluidContext fluidContext) {
        this.f33584a = fluidContext;
    }

    public void a(sht.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534bf39c", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.a(aVar);
        }
    }

    public void a(sht shtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec185b9", new Object[]{this, shtVar});
        } else if (shtVar == null) {
        } else {
            this.b.a(shtVar);
        }
    }

    @Override // tb.shs
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
            return;
        }
        for (shs shsVar : this.c.a()) {
            try {
                shsVar.onBackClick();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shsVar, "onBackClick", e);
            }
        }
    }

    @Override // tb.sht
    public void onDoubleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (sht shtVar : this.b.a()) {
            try {
                shtVar.onDoubleClick(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onDoubleClick", e);
            }
        }
    }

    @Override // tb.sht
    public void onTripleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (sht shtVar : this.b.a()) {
            try {
                shtVar.onTripleClick(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onTripleClick", e);
            }
        }
    }

    @Override // tb.sht
    public boolean onLongClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        for (sht shtVar : this.b.a()) {
            try {
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onLongClick", e);
            }
            if (shtVar.onLongClick(z)) {
                spz.c("CardListenersManager", "The observer: " + shtVar + " intercept the onLongClick event");
                break;
            }
            continue;
        }
        return true;
    }

    @Override // tb.sht
    public void onLongClickCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
            return;
        }
        for (sht shtVar : this.b.a()) {
            try {
                shtVar.onLongClickCancel();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onLongClickCancel", e);
            }
        }
    }

    @Override // tb.sht
    public void onPendingClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
            return;
        }
        for (sht shtVar : this.b.a()) {
            try {
                shtVar.onPendingClick();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onPendingClick", e);
            }
        }
    }

    @Override // tb.sht
    public void onSingleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (sht shtVar : this.b.a()) {
            try {
                shtVar.onSingleClick(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33584a, shtVar, "onSingleClick", e);
            }
        }
    }
}
