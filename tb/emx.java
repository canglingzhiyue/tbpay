package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class emx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, emw> f27449a;

    static {
        kge.a(-1762447862);
        emu.a("com.taobao.android.detail.datasdk.context.EngineContextManager");
        f27449a = new ConcurrentHashMap<>();
    }

    public static emw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emw) ipChange.ipc$dispatch("7c6edf25", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f27449a.containsKey(str)) {
            return f27449a.get(str);
        }
        emw emwVar = new emw();
        f27449a.put(str, emwVar);
        return emwVar;
    }

    public static emw a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emw) ipChange.ipc$dispatch("16ba80d3", new Object[]{obj});
        }
        if (obj != null) {
            return a(c(obj));
        }
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || !f27449a.containsKey(str)) {
        } else {
            f27449a.get(str).a();
            f27449a.remove(str);
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            b(c(obj));
        }
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj}) : obj.toString();
    }
}
