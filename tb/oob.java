package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.Map;

/* loaded from: classes8.dex */
public class oob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-701276370);
    }

    public static void a(String str, int i, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82709d8a", new Object[]{str, new Integer(i), str2, map});
        } else {
            a(str, i, str2, a(map));
        }
    }

    public static void a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4196da5", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            ooa.b(onx.USER_TRACK_TAG);
            ooa.a(onx.USER_TRACK_TAG, str + "\nEvent id: " + i + "\narg1: " + str2 + "\nargs: " + str3);
            ooa.b(onx.USER_TRACK_TAG);
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
        } catch (Exception e) {
            ooa.a("track", e);
        }
    }

    private static String a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
