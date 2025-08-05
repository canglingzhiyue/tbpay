package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ehj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f27311a;

    static {
        kge.a(-842317381);
        f27311a = new HashMap();
        emu.a("com.taobao.android.detail.core.newdesc.NewDetailBizSwitchConfig");
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            f27311a.put(str, obj);
        }
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f27311a.get(str);
    }
}
