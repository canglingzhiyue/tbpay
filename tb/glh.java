package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class glh extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-752484130);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        String str = null;
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                if (obj != null && (obj instanceof String)) {
                    if (str == null) {
                        str = obj.toString();
                    } else {
                        str = str.concat(obj.toString());
                    }
                }
            }
        }
        return str;
    }
}
