package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class icd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1236881762);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : a("remote_download_timeout", 60000L);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Boolean.parseBoolean(b("is_enable_pad_adapt", "true"));
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return a(b("pad_not_full_white_list", "message"), ",").contains(str);
        }
        return false;
    }

    private static List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Arrays.asList(str.split(str2));
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("taopai", str, str2);
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("taopai", str, null);
        if (config == null) {
            return j;
        }
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }
}
