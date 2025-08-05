package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class jaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f29442a;

    public jaw(Map<String, String> map) {
        this.f29442a = map;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        String str2 = this.f29442a.get(str);
        if (str2 != null) {
            try {
                return Integer.parseInt(str2);
            } catch (Exception e) {
                jay.a(e);
            }
        }
        return i;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String str2 = this.f29442a.get(str);
        if (str2 != null) {
            try {
                return Boolean.parseBoolean(str2);
            } catch (Exception e) {
                jay.a(e);
            }
        }
        return z;
    }
}
