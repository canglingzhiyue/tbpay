package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dbg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-698739333);
    }

    public static Map<String, String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split2 = str.split("\\?");
        if (split2.length <= 1) {
            return null;
        }
        String str2 = split2[1];
        HashMap hashMap = new HashMap();
        for (String str3 : str2.split("&")) {
            if (!StringUtils.isEmpty(str3)) {
                String[] split3 = str3.split("=", 2);
                if (split3.length > 1) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
        }
        return hashMap;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        String queryParameter = parse.getQueryParameter(str2);
        if (StringUtils.isEmpty(str)) {
            Uri.Builder buildUpon = parse.buildUpon();
            String path = parse.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str2, str3).build().toString();
        }
        return str.replace(String.format("%s=%s", str2, queryParameter), String.format("%s=%s", str2, str3));
    }
}
