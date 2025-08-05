package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes8.dex */
public class oda {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CHAT_ACTIVITY_URL = "http://tb.cn/n/im/dynamic/chat.html";
    public static final String KEY_CHAT_ACTIVITY_URL = "ChatActivityURL";
    public static final String KEY_ENABLE_VIDEO_DOWNLOAD = "videodownload_enable";
    public static final String KEY_NEW_NAMESPACE = "android_share_bizconfig";

    static {
        kge.a(1394305129);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_CHAT_ACTIVITY_URL, DEFAULT_CHAT_ACTIVITY_URL);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_ENABLE_VIDEO_DOWNLOAD, "true"));
    }
}
