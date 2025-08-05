package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.sku.utils.o;
import com.taobao.android.u;
import java.util.Map;

/* loaded from: classes6.dex */
public class qrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1925398049);
    }

    public static void a(int i, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{new Integer(i), str, map});
        } else {
            a(i, str, null, null, map);
        }
    }

    public static void a(int i, String str, Object obj, Object obj2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65420708", new Object[]{new Integer(i), str, obj, obj2, map});
        } else if (!TextUtils.isEmpty(str)) {
            String[] strArr = new String[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                strArr[i2] = entry.getKey() + "=" + entry.getValue();
                i2++;
            }
            AliUserTrackerInterface a2 = u.a();
            if (a2 == null) {
                return;
            }
            if (!str.contains(o.PAGE_NAME)) {
                str = "Page_New_SKU_" + str;
            }
            a2.a(o.PAGE_NAME, i, str, obj, obj2, strArr);
        }
    }
}
