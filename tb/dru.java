package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dru {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_ENTER_NODE = "last_enter_node";
    public static final String TAG = "NodeStoreHelper";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, drp> f26932a;

    static {
        kge.a(-827987239);
        f26932a = new HashMap();
    }

    public static drp a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (drp) ipChange.ipc$dispatch("7c6e7cb2", new Object[]{str}) : f26932a.get(str);
    }

    public static void a(String str, drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259e63c0", new Object[]{str, drpVar});
        } else {
            f26932a.put(str, drpVar);
        }
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue() : (obj instanceof Activity) && ((Activity) obj).isFinishing();
    }
}
