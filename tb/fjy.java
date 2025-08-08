package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class fjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(956733029);
    }

    public static String a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return "";
        }
        String queryParameter = data.getQueryParameter("entryNDNid");
        return !StringUtils.isEmpty(queryParameter) ? queryParameter : b(intent);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String queryParameter = Uri.parse(str).getQueryParameter("entryNDNid");
        return !StringUtils.isEmpty(queryParameter) ? queryParameter : b(str);
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String a2 = fjo.a(intent, "id");
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = fjo.a(intent, "item_id");
        return !StringUtils.isEmpty(a3) ? a3 : c(intent);
    }

    private static String c(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249b0259", new Object[]{intent});
        }
        String str2 = "";
        String str3 = null;
        if (StringUtils.isEmpty(str2)) {
            try {
                str = fjo.a(intent, FavoriteConstants.DetailConstants_DETAIL_URL);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                str2 = b(str);
            }
        }
        if (StringUtils.isEmpty(str2)) {
            try {
                str3 = intent.getDataString();
            } catch (Exception unused2) {
            }
            if (str3 != null) {
                str2 = b(str3);
            }
        }
        try {
            if (!StringUtils.isEmpty(str2)) {
                intent.putExtra("item_id", str2);
            }
        } catch (Exception unused3) {
        }
        return str2;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String c = c(str);
        return c != null ? c : d(str);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        return matcher2.group(1);
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        for (String str2 : new String[]{"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"}) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static Map<String, String> a(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(uri.getQuery()) && (queryParameterNames = uri.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }
}
