package tb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class cww {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f26575a = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        String a(cwu cwuVar);
    }

    public static Map<String, a> a() {
        return f26575a;
    }

    public static void a(String str, a aVar) {
        f26575a.put(str, aVar);
    }
}
