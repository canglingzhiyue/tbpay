package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fno extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1241648166);
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj}) : str;
    }

    @Override // tb.fnl
    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar}) : a((String) list.get(0), fpdVar.e());
    }
}
