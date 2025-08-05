package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class kgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ?> f30056a;

    static {
        kge.a(-1003262799);
    }

    public kgm(Map<String, ?> map) {
        this.f30056a = map == null ? new HashMap<>() : map;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Object obj = this.f30056a.get(str);
        return (obj == null || !(obj instanceof String)) ? str2 : (String) obj;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f30056a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                tco.a(e);
            }
        }
        return z;
    }
}
