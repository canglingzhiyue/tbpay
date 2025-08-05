package tb;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.procedure.IPage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final mnx f31151a = new mnx();
    private final Map<IPage, List<sgh>> b = new HashMap();

    public static mnx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mnx) ipChange.ipc$dispatch("f07dd07", new Object[0]) : f31151a;
    }

    public void a(Activity activity, qpi qpiVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1454707b", new Object[]{this, activity, qpiVar, iPage});
        } else if ((!d.d && !d.g) || !(iPage instanceof mou)) {
        } else {
            mnw mnwVar = null;
            if (Build.VERSION.SDK_INT >= 24) {
                mnwVar = new mnw((mou) iPage);
            }
            mny mnyVar = new mny(activity, qpiVar, mnwVar);
            mnyVar.f();
            mnyVar.a(iPage);
            a(iPage, mnyVar);
            sgi sgiVar = new sgi(activity, qpiVar, mnwVar);
            sgiVar.f();
            sgiVar.a(iPage);
            a(iPage, sgiVar);
        }
    }

    private void a(IPage iPage, sgh sghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c0737f", new Object[]{this, iPage, sghVar});
            return;
        }
        if (!this.b.containsKey(iPage)) {
            this.b.put(iPage, new ArrayList());
        }
        this.b.get(iPage).add(sghVar);
    }

    public void a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025d123", new Object[]{this, iPage});
            return;
        }
        List<sgh> list = this.b.get(iPage);
        if (list == null) {
            return;
        }
        for (sgh sghVar : list) {
            sghVar.b(iPage);
            sghVar.b();
        }
        this.b.remove(iPage);
    }

    public void b(IPage iPage) {
        List<sgh> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc5fc24", new Object[]{this, iPage});
        } else if ((iPage instanceof mou) && (list = this.b.get(((mou) iPage).r())) != null) {
            for (sgh sghVar : list) {
                sghVar.a(iPage);
            }
        }
    }

    public void c(IPage iPage) {
        List<sgh> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9662725", new Object[]{this, iPage});
        } else if ((iPage instanceof mou) && (list = this.b.get(((mou) iPage).r())) != null) {
            for (sgh sghVar : list) {
                sghVar.b(iPage);
            }
        }
    }
}
