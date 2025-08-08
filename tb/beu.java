package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class beu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1804829120);
    }

    public static void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{view, str});
        } else {
            rly.a().a(view, str, "ali_cart", "m_taobao_cart");
        }
    }

    public static String a(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        HashMap<String, Object> a2 = a(str);
        if (a2 != null && (obj = a2.get(str2)) != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static HashMap<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = rlz.a().f() != null ? rlz.a().f().get(str) : "";
        if (!StringUtils.isEmpty(str2)) {
            str = str2;
        }
        HashMap<String, HashMap<String, Object>> e = rlz.a().e("ali_cart");
        if (e == null) {
            return null;
        }
        return e.get(str);
    }
}
