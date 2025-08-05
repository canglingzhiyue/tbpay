package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.utils.n;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes8.dex */
public class ppn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ppn f32802a;
    private static final String c;
    private Random b = new Random();
    private HashMap<String, ppo> d = new HashMap<>();

    private ppn() {
    }

    public static ppn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppn) ipChange.ipc$dispatch("f094070", new Object[0]);
        }
        if (f32802a == null) {
            synchronized (ppn.class) {
                if (f32802a == null) {
                    f32802a = new ppn();
                }
            }
        }
        return f32802a;
    }

    static {
        kge.a(1038699362);
        c = ppn.class.getSimpleName();
    }

    public void a(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9edb", new Object[]{this, context, str, aVar});
        } else if (context == null || str == null) {
            n.a(c, "createRoomEngine context null");
        } else {
            ppo ppoVar = new ppo();
            ppoVar.a(context, str, aVar);
            this.d.put(str, ppoVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
            n.a(c, "destroyRoomEngine liveContextKey =  null");
        } else {
            ppo remove = this.d.remove(str);
            if (remove == null) {
                return;
            }
            remove.a();
        }
    }

    public <T extends ppm> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9b88c20e", new Object[]{this, str, cls});
        }
        if (str == null) {
            n.a(c, "getService liveContextKey =  null");
            return null;
        }
        ppo ppoVar = this.d.get(str);
        if (ppoVar == null) {
            return null;
        }
        return (T) ppoVar.a(cls);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String a2 = pmd.a().q() != null ? pmd.a().q().a() : "";
        return str + "_" + a2 + "_" + this.b.nextInt(1000) + "_" + System.currentTimeMillis();
    }
}
