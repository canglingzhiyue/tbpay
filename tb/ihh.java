package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ihh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ?> f29025a;

    public ihh(Map<String, ?> map) {
        this.f29025a = map == null ? new HashMap<>() : map;
    }

    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        Object obj = this.f29025a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Long.parseLong((String) obj);
                }
                if (obj instanceof Long) {
                    return ((Long) obj).longValue();
                }
            } catch (Exception e) {
                ihc.a(e);
            }
        }
        return j;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f29025a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                ihc.a(e);
            }
        }
        return z;
    }
}
