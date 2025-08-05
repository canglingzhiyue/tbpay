package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.f;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class qnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32964a;
        public String b;
        public String c;
        public boolean d;
        public boolean e;
        public View f;

        static {
            kge.a(-916181582);
        }
    }

    static {
        kge.a(1707676375);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : qnr.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return f.a().a(PopLayer.getReference().internalGetCurrentActivity(), InternalTriggerController.b());
        } catch (Throwable th) {
            c.a("TBPopLayerQuery.hasRequestingPop.error", th);
            return false;
        }
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("30b8e443", new Object[]{this, str});
        }
        try {
            d a2 = cag.i().a(str);
            if (a2 == null) {
                return null;
            }
            a aVar = new a();
            aVar.c = a2.z();
            aVar.f32964a = a2.m();
            aVar.b = a2.x().layerType;
            aVar.d = "true".equals(a2.t().r);
            aVar.e = "true".equals(a2.t().s);
            aVar.f = a2.g();
            return aVar;
        } catch (Throwable th) {
            c.a("TBPopLayerQuery.getCurRequestingPopInfo.error", th);
            return null;
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (d dVar : cag.i().c()) {
                if (!dVar.x().layerType.equals(str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            c.a("TBPopLayerQuery.hasOtherLayerRequestingPop.error", th);
        }
        return false;
    }
}
