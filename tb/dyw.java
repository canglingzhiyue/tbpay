package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class dyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-29060518);
        emu.a("com.taobao.android.detail.core.detail.fragment.comment.taosdk.MyUrlEncoder");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
