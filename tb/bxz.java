package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.BizErrorSampling;
import com.alibaba.ha.bizerrorreporter.c;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.a;
import com.alibaba.ha.bizerrorreporter.module.b;
import com.alibaba.motu.tbrest.d;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bxz implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f26176a;
    public a b;

    public bxz(Context context, a aVar) {
        this.f26176a = context;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.b.f3119a == null) {
                return;
            }
            if ((e.a().c != null && !a().booleanValue()) || (a2 = new c().a(this.f26176a, this.b)) == null) {
                return;
            }
            d.a().a(null, System.currentTimeMillis(), a2.b, a2.d.intValue(), a2.e, a2.f3120a, a2.c, null).booleanValue();
        } catch (Exception e) {
            Log.e(com.alibaba.ha.bizerrorreporter.d.LOGTAG, "send business err happen ", e);
        }
    }

    private Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this});
        }
        BizErrorSampling bizErrorSampling = e.a().c;
        int a2 = a(0, 10000);
        if (bizErrorSampling == BizErrorSampling.OneTenth) {
            if (a2 >= 0 && a2 < 1000) {
                return true;
            }
        } else if (bizErrorSampling == BizErrorSampling.OnePercent) {
            if (a2 >= 0 && a2 < 100) {
                return true;
            }
        } else if (bizErrorSampling == BizErrorSampling.OneThousandth) {
            if (a2 >= 0 && a2 < 10) {
                return true;
            }
        } else if (bizErrorSampling == BizErrorSampling.OneTenThousandth) {
            if (a2 >= 0 && a2 <= 0) {
                return true;
            }
        } else if (bizErrorSampling != BizErrorSampling.Zero && bizErrorSampling == BizErrorSampling.All) {
            return true;
        }
        return false;
    }

    private int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return i + ((int) (Math.random() * ((i2 - i) + 1)));
        } catch (Exception e) {
            Log.e(com.alibaba.ha.bizerrorreporter.d.LOGTAG, "get random number err", e);
            return 0;
        }
    }
}
