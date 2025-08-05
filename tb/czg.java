package tb;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class czg {

    /* renamed from: a  reason: collision with root package name */
    private static volatile czg f26613a;
    private Context b;
    private Map<String, czf> c = new ConcurrentHashMap();

    public czg(Context context) {
        this.b = context;
    }

    public static czg a(Context context) {
        if (f26613a == null) {
            synchronized (czg.class) {
                if (f26613a == null) {
                    f26613a = new czg(context);
                }
            }
        }
        return f26613a;
    }

    public czf a(String str) {
        return this.c.get(str);
    }

    public czf a(String str, czh czhVar) {
        if (!this.c.containsKey(str)) {
            czf czfVar = new czf(czhVar);
            this.c.put(str, czfVar);
            return czfVar;
        }
        throw new IllegalStateException("Handler key [" + str + "] has been contained!");
    }

    public <T extends czi> czf a(String str, T t) {
        if (t instanceof czk) {
            return a(str, new czj((czk) t, this.b));
        }
        throw new IllegalArgumentException("Unsupported template!");
    }
}
