package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class jrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ?> f29730a;

    static {
        kge.a(-1465840163);
    }

    public jrj(Map<String, ?> map) {
        this.f29730a = map;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Object obj = this.f29730a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Integer.parseInt((String) obj);
                }
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
            } catch (Exception e) {
                jrk.a(e);
            }
        }
        return i;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Object obj = this.f29730a.get(str);
        return (obj == null || !(obj instanceof String)) ? str2 : (String) obj;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f29730a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                jrk.a(e);
            }
        }
        return z;
    }
}
