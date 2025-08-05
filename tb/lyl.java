package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10c6f18d", new Object[]{uri, str, str2}) : (str == null || uri == null || uri.getQueryParameter(str) == null) ? str2 : uri.getQueryParameter(str);
    }
}
