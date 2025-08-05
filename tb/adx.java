package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.f;

@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.fullScreen.loading")
/* loaded from: classes4.dex */
public final class adx extends dtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1394712451);
    }

    public static /* synthetic */ Object ipc$super(adx adxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(adx adxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd3be03", new Object[]{adxVar});
        } else {
            adxVar.l();
        }
    }

    @Override // tb.dtl
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (n()) {
            a(new Runnable() { // from class: tb.adx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        adx.a(adx.this);
                    }
                }
            });
        } else {
            l();
        }
    }

    private void l() {
        f k;
        AURAFlowData f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (h() || (k = k()) == null || (f = f()) == null) {
        } else {
            k.c(Boolean.valueOf("aura.workflow.adjust".equals(f.getFlowCode())));
        }
    }

    @Override // tb.dtl
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (h()) {
        } else {
            o();
            f k = k();
            if (k == null) {
                return;
            }
            k.d();
        }
    }
}
