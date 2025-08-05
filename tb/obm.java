package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;

/* loaded from: classes8.dex */
public class obm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31892a;

    static {
        kge.a(942062458);
        try {
            f31892a = "true".equals(a("android_share_bizconfig", "disableAliPrivacy"));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        nzl orangeDefaultValueHelper = ShareBizAdapter.getInstance().getOrangeDefaultValueHelper();
        return OrangeConfig.getInstance().getConfig(str, str2, orangeDefaultValueHelper == null ? null : orangeDefaultValueHelper.a(str, str2));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            String string = acg.a().getString(acg.a().getResources().getIdentifier("ttid", "string", "com.taobao.taobao"));
            nyy.a("ttid=" + string);
            if ("212200".equals(string)) {
                return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "gpFetchClipboardEnable", "false"));
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "notUseReadWritePermission", "true"));
        } catch (Throwable unused) {
            return true;
        }
    }
}
