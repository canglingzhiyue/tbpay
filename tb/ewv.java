package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ewv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(936565166);
        tpc.a("com.taobao.android.detail.sdk.utils.sku.ConvertUtils");
    }

    public static List<String> a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("332400c0", new Object[]{map, str});
        }
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey() + str + entry.getValue());
            }
        }
        return arrayList;
    }

    public static String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe45281d", new Object[]{list, str}) : a(list, str, "");
    }

    public static String a(List<String> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("875e8653", new Object[]{list, str, str2});
        }
        if (list != null && !list.isEmpty()) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str);
                    sb.append(str2);
                    sb.append(str3);
                    sb.append(str2);
                }
            }
            if (sb.length() > str.length()) {
                return sb.substring(str.length());
            }
        }
        return "";
    }

    public static List<String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        if (!ewu.a(map)) {
            return new ArrayList(map.values());
        }
        return new ArrayList();
    }
}
