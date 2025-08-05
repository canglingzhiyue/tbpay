package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class dcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static dcm f26688a;
    private final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();

    static {
        kge.a(80764345);
    }

    public static dcm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcm) ipChange.ipc$dispatch("f039b10", new Object[0]);
        }
        if (f26688a == null) {
            synchronized (dcm.class) {
                if (f26688a == null) {
                    f26688a = new dcm();
                }
            }
        }
        return f26688a;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.b.put(str, obj);
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : this.b.remove(str);
    }
}
