package tb;

import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class nmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1112521639);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d() && c();
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a(e(), "readWeitao");
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a(f(), "showGuide");
    }

    private static long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getLong("followsdk_readweitao_lasttime", 0L);
    }

    private static long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getLong("followsdk_showguide_lasttime", 0L);
    }

    private static boolean a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d8a222a", new Object[]{new Long(j), str})).booleanValue();
        }
        if (j == 0) {
            String str2 = str + ", no record";
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = (currentTimeMillis - j) / 86400000;
        String str3 = str + ", ct = " + currentTimeMillis + ", rt = " + j + ", day = " + j2;
        return j2 >= 14;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals(OrangeConfig.getInstance().getConfig("weitao_switch", "follow_query_degree", ""), "true");
    }
}
