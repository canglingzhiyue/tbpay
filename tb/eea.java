package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.split.a;
import com.alibaba.android.split.core.internal.FlexaPrepareClassLoader;
import com.alibaba.android.split.q;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.magic.RuntimeUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class eea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f27224a;
    private static xin b;

    static {
        kge.a(414516737);
        f27224a = new AtomicBoolean(false);
        b = (xin) a.a((Class<? extends Object>) xin.class, new Object[0]);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f27224a.compareAndSet(false, true) || Build.VERSION.SDK_INT <= 28 || !v.q(context)) {
        } else {
            try {
                RuntimeUtils.a();
                Log.e("FlexaRuntime", "isVerifierEnable:" + RuntimeUtils.b());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(q qVar, bgy bgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10a023a", new Object[]{qVar, bgyVar});
        } else if (Build.VERSION.SDK_INT > 27 && Boolean.FALSE.booleanValue()) {
            b.a(bgyVar.t().getClassLoader(), qVar.c());
        } else {
            FlexaPrepareClassLoader.tryLoad(qVar, bgyVar);
        }
    }
}
