package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ldw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1512594796);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals("poplayer", parse.getScheme()) || !TextUtils.equals("homepage_interest", parse.getHost())) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("sectionBizCode", str2).build();
        return buildUpon.toString();
    }
}
