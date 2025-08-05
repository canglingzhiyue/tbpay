package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ogy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile SharedPreferences f32048a;

    static {
        kge.a(-1685285047);
    }

    public static Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        Map a2 = oec.a((Object) b().getString("local_setting", null), (Map) null);
        if (a2 == null) {
            return null;
        }
        return oec.a(a2.get(BizContext.KEY_SETTING_FILTER), (Map) null);
    }

    public static String a(String str, String str2) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Map a3 = a();
        if (a3 != null && (a2 = oec.a(a3.get(str), (Map) null)) != null) {
            return oec.a(a2.get(str2), (String) null);
        }
        return null;
    }

    public static Object b(String str) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e4e661f", new Object[]{str});
        }
        Map a3 = a();
        if (a3 != null && (a2 = oec.a(a3.get("ab"), (Map) null)) != null) {
            return oec.b(a2, str);
        }
        return null;
    }

    public static String a(String str) {
        Map a2;
        List a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = "?";
        int indexOf = str.indexOf(str2);
        String substring = indexOf > 0 ? str.substring(indexOf + 1) : null;
        Map a4 = a();
        if (a4 != null && (a2 = oec.a(a4.get("tnode"), (Map) null)) != null && (a3 = oec.a(a2.get("dslMapper"), (List) null)) != null) {
            String replace = str.replace("dev.", "");
            for (int i = 0; i < a3.size(); i++) {
                Object obj = a3.get(i);
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    String a5 = oec.a(map.get("key"), (String) null);
                    String a6 = oec.a(map.get("value"), (String) null);
                    if (replace.contains(a5.replace("dev.", "")) && !TextUtils.isEmpty(a6)) {
                        if (substring == null) {
                            return a6;
                        }
                        if (a6.contains(str2)) {
                            str2 = "&";
                        }
                        return a6 + str2 + substring;
                    }
                }
            }
        }
        return str;
    }

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else {
            b().edit().putString("local_setting", JSON.toJSONString(obj)).apply();
        }
    }

    private static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[0]);
        }
        if (f32048a == null) {
            synchronized (ogy.class) {
                if (f32048a == null) {
                    f32048a = ab.a().getSharedPreferences("tnode_local_setting_file", 0);
                }
            }
        }
        return f32048a;
    }
}
