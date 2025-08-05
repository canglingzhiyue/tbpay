package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class glp extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1644192256);
    }

    @Override // tb.glo
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj}) : str;
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar}) : a((String) list.get(0), gmfVar.c());
    }
}
