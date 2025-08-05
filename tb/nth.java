package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nth INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f31752a;

    static {
        kge.a(311321852);
        INSTANCE = new nth();
        f31752a = new LinkedHashMap();
    }

    private nth() {
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (f31752a.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : f31752a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(";");
        }
        if (sb.length() > 0) {
            z = true;
        }
        if (z) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        q.a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
