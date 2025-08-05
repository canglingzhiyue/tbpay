package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class lyh extends lyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(lyh lyhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lyh(Context context) {
        super(context, "ut_page.csv");
    }

    public lyh(Context context, String str) {
        super(context, !lye.a(str) ? "ut_page.csv" : str);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = null;
        if (str != null) {
            str2 = a(str, "_key", str);
        }
        return str2 != null ? str2 : "NullActivity";
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String a2 = a(str, "_args");
        return a2 == null ? a(a(str), "_args") : a2;
    }

    public String a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{this, activity});
        }
        if (activity == null) {
            return null;
        }
        return b(activity.getClass().getSimpleName());
    }

    public Map<String, String> a(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f0860cca", new Object[]{this, str, uri}) : a(lyj.a(b(str)), uri);
    }

    public Map<String, String> a(Activity activity, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("81090242", new Object[]{this, activity, uri}) : a(lyj.a(a(activity)), uri);
    }

    private Map<String, String> a(Map<String, String> map, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9bfc497f", new Object[]{this, map, uri});
        }
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                String value = next.getValue();
                if (!TextUtils.isEmpty(value) && value.startsWith("${") && value.endsWith(riy.BLOCK_END_STR) && value.length() > 2) {
                    String a2 = lyl.a(uri, value.substring(2, value.length() - 1), "");
                    if (!TextUtils.isEmpty(a2)) {
                        map.put(key, a2);
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return map;
    }
}
