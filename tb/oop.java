package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class oop extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1660977879);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        try {
            return new JSONArray(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Object();
        }
    }
}
