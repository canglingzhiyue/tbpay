package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public abstract class fnl implements fnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1790544846);
        kge.a(1393268012);
    }

    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        return null;
    }

    @Override // tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        return null;
    }

    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }

    @Override // tb.fnp
    public Object a(String str, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("28a0e6aa", new Object[]{this, str, fpdVar}) : a(fpdVar.b(), str, fpdVar.e(), fpdVar.d());
    }
}
