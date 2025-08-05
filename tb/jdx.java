package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f29489a = new ConcurrentHashMap<>();

    public jdx() {
    }

    public jdx(Map<String, Object> map) {
        this.f29489a.putAll(map);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
        } else {
            this.f29489a.put(str, obj);
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : this.f29489a.get(str);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Object a2 = a(str);
        if (a2 instanceof String) {
            return (String) a2;
        }
        return a2 != null ? String.valueOf(a2) : str2;
    }

    public int a(String str, int i) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            a2 = a(str);
        } catch (Exception e) {
            jfj.b(e);
        }
        if (a2 instanceof Integer) {
            return ((Integer) a2).intValue();
        }
        if (a2 instanceof String) {
            return Integer.parseInt((String) a2);
        }
        return i;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object a2 = a(str);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return a2 instanceof String ? Boolean.parseBoolean((String) a2) : z;
    }
}
