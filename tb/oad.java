package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class oad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-507080887);
    }

    public static boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, String> a2 = oae.a(str);
        if (a2 == null || a2.size() <= 0) {
            str2 = "queryParams=isNull&checkUrl=" + str;
        } else {
            String queryParameter = Uri.parse(str).getQueryParameter("sm");
            if (!TextUtils.isEmpty(queryParameter)) {
                String str3 = "&sm=";
                if (!str.contains(str3)) {
                    str3 = "?sm=";
                }
                String replace = str.replace(str3.concat(queryParameter), "");
                oaj oajVar = new oaj();
                oajVar.a(replace);
                String a3 = oajVar.a();
                boolean equals = TextUtils.equals(a3, queryParameter);
                if (!equals) {
                    AppMonitor.Alarm.commitFail("share", "PwdUrlCheckUtils", "", "generateSign=" + a3 + "&paramsSign=" + queryParameter + "&checkUrl=" + str);
                }
                return equals;
            }
            str2 = "paramsSign=" + queryParameter + "&checkUrl=" + str;
        }
        AppMonitor.Alarm.commitFail("share", "PwdUrlCheckUtils", "", str2);
        return false;
    }
}
