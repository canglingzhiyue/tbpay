package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.a;
import java.io.File;

/* loaded from: classes7.dex */
public class khc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1375543087);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String a2 = khp.a(a.ORANGE_CALENDER_HUAWEI_ENABLE, String.valueOf(false));
        khu.a("calenderHuaweiEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String a2 = khp.a(a.ORANGE_CALENDER_OPPO_ENABLE, String.valueOf(false));
        khu.a("calenderOppoEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        String a2 = khp.a(a.ORANGE_CALENDER_READ_LOCAL_ENABLE, String.valueOf(true));
        boolean a3 = a("calenderReadLocalEnable");
        khu.a("calenderReadLocalEnable: " + a2 + ",switchLocal: " + a3);
        return Boolean.parseBoolean(a2) || a3;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String a2 = khp.a(a.ORANGE_CALENDER_ADD_REPEAT_ENABLE, String.valueOf(true));
        khu.a("calenderAddRepeatEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return new File("/data/local/tmp/", str).exists();
        } catch (Exception e) {
            khu.a("abSwitchLocal " + str + e.getMessage());
            return false;
        }
    }
}
