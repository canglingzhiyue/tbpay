package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class mua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(601642710);
    }

    public static void a(String str, int i, Object obj, Object obj2, Object obj3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f3c2ab", new Object[]{str, new Integer(i), obj, obj2, obj3, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3);
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : jSONObject.keySet()) {
                arrayList.add(str2 + "=" + jSONObject.getString(str2));
            }
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, (String[]) arrayList.toArray(new String[0]));
        }
    }
}
