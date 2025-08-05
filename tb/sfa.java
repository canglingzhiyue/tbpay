package tb;

import android.app.Activity;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.utils.y;

/* loaded from: classes5.dex */
public class sfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1002644186);
    }

    public static void a(Activity activity, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c718061", new Object[]{activity, cVar});
            return;
        }
        if (cVar != null && cVar.B() != null) {
            a(cVar.B(), activity);
        }
        DinamicXEngine c = hhs.a().c();
        if (c == null) {
            return;
        }
        a(c, activity);
        if (cVar == null) {
            return;
        }
        cVar.c.a(c, activity);
    }

    private static void a(d dVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9642701f", new Object[]{dVar, activity});
        } else if (dVar == null) {
        } else {
            bny q = dVar.q();
            if (q == null) {
                his.b("GoodAPadAdapterUtils", "viewEngine is null.");
                return;
            }
            bob e = q.e();
            if (e == null) {
                his.b("GoodAPadAdapterUtils", "dinamicXEngineManager is null.");
            } else if (e.a().d() == null) {
                his.b("GoodAPadAdapterUtils", "getEngine is null.");
            } else {
                a(e.a().d(), activity);
            }
        }
    }

    public static void a(DinamicXEngine dinamicXEngine, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7149ec2b", new Object[]{dinamicXEngine, activity});
        } else if (dinamicXEngine == null || activity == null || !y.a()) {
        } else {
            if (y.b(activity)) {
                dinamicXEngine.b().a(true, true);
            }
            if (!y.c(activity) || !y.d(activity)) {
                return;
            }
            dinamicXEngine.b().a(true);
        }
    }
}
