package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class ect {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1514712198);
        emu.a("com.taobao.android.detail.core.detail.utils.StringParseUtils");
    }

    public static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String[] strArr = {""};
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue();
            } else {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue() + ",";
            }
            i++;
        }
        return strArr;
    }

    public static String[] b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cd1154b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, Object> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            } else {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
            i++;
        }
        return new String[]{sb.toString()};
    }
}
