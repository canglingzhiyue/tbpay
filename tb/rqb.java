package tb;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.lyc;

/* loaded from: classes9.dex */
public class rqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-90841446);
    }

    public static String getPageName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str}) : lyc.a.b(str);
    }

    public static Map<String, String> getArgsMap(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3ead722", new Object[]{str, uri}) : lyc.a.a(str, uri);
    }

    public static Map<String, String> getArgsMap(Activity activity, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65d0e09a", new Object[]{activity, uri}) : lyc.a.a(activity, uri);
    }
}
