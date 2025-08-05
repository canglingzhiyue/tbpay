package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class oae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOMO_PKG = "com.immomo.momo";
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String QZONE_PKG = "com.qzone";
    public static final String WEIXIN_PKG = "com.tencent.mm";

    static {
        kge.a(-1862319424);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (str != null) {
            return a(Uri.parse(str));
        }
        return null;
    }

    public static Map<String, String> a(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        String[] split = (fragment == null || !fragment.contains("?")) ? null : fragment.split("\\?");
        if (split != null && split.length > 0) {
            fragment = split[0];
            query = !TextUtils.isEmpty(query) ? query + "&" + split[1] : split[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(query)) {
                String str = query + "&" + fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    hashMap.put(str2, uri.getQueryParameter(str2));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
