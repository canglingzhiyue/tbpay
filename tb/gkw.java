package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class gkw extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1728664302);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        if (list != null && list.size() == 2) {
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            try {
                if (obj instanceof List) {
                    objArr = ((List) obj).toArray();
                } else {
                    objArr = (Object[]) obj;
                }
                for (int i = 0; i < objArr.length; i++) {
                    if (objArr[i].equals(obj2)) {
                        return objArr[i];
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
