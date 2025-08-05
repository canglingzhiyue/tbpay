package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class glk extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-699441976);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        if (list == null || list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        if (!(obj instanceof String)) {
            return null;
        }
        return ((String) obj).toUpperCase();
    }
}
