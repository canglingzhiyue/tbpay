package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.util.c;
import java.util.Map;

/* loaded from: classes8.dex */
public class ouy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-4990773);
    }

    public static String a(String str) {
        Uri parse;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (oux.a(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String host = parse.getHost();
        if (oux.a(host) || (indexOf = host.indexOf(".")) <= 0) {
            return null;
        }
        return host.substring(0, indexOf);
    }

    public static String b(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (oux.a(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String host = parse.getHost();
        if (oux.a(host)) {
            host = "";
        }
        String path = parse.getPath();
        if (oux.a(path)) {
            path = "";
        }
        return host + path;
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        String encodedQuery = parse.getEncodedQuery();
        String encodedFragment = parse.getEncodedFragment();
        if (oux.a(encodedQuery)) {
            encodedQuery = "";
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                if (!TextUtils.isEmpty(encodedQuery)) {
                    encodedQuery = encodedQuery + "&";
                }
                encodedQuery = encodedQuery + entry.getKey() + "=" + entry.getValue();
            }
        }
        return new ouz().a(scheme).b(host).c(path).d(encodedQuery).e(encodedFragment).toString();
    }

    public static String c(String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse != null && (a2 = c.a(parse)) != null && a2.size() > 0) {
            return a(a2);
        }
        return null;
    }

    public static String d(String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse != null && (a2 = c.a(parse)) != null && a2.size() > 0) {
            return b(a2);
        }
        return null;
    }

    public static String e(String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse != null && (a2 = c.a(parse)) != null && a2.size() > 0) {
            return c(a2);
        }
        return null;
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("shop_id");
        if (!TextUtils.isEmpty(str)) {
            return Uri.decode(str);
        }
        String str2 = map.get("shopId");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return Uri.decode(str2);
    }

    private static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("userId");
        if (!TextUtils.isEmpty(str)) {
            return Uri.decode(str);
        }
        String str2 = map.get("sellerId");
        if (!TextUtils.isEmpty(str2)) {
            return Uri.decode(str2);
        }
        String str3 = map.get("user_id");
        if (!TextUtils.isEmpty(str3)) {
            return Uri.decode(str3);
        }
        String str4 = map.get("seller_id");
        if (!TextUtils.isEmpty(str4)) {
            return Uri.decode(str4);
        }
        String str5 = map.get("uid");
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        return Uri.decode(str5);
    }

    private static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("nick");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = map.get("sellerNick");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }
}
