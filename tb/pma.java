package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.b;
import java.util.Map;

/* loaded from: classes8.dex */
public class pma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1107432519);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (StringUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.toString();
    }

    public static String a(String str, String str2, String str3) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            String a2 = a(str);
            Uri parse = Uri.parse(a2);
            if (parse.getQueryParameter(str2) != null) {
                return a2.replace(str2 + "=" + Uri.encode(queryParameter), str2 + "=" + Uri.encode(str3));
            }
            Uri.Builder buildUpon = parse.buildUpon();
            String path = parse.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str2, str3).toString();
        } catch (Exception e) {
            Log.e("replaceQueryParameter", "" + e.getMessage());
            return str;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!str.startsWith(ado.URL_SEPARATOR)) {
            return str;
        }
        return b.HTTPS_SCHEMA + str;
    }
}
