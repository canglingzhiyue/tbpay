package io.unicorn.embedding.engine;

import com.taobao.android.weex_framework.util.g;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f24829a;
    private final Map<String, a> b = new HashMap();
    private final Queue<a> c = new LinkedList();

    static {
        kge.a(-2039494759);
    }

    b() {
    }

    public static b a() {
        if (f24829a == null) {
            f24829a = new b();
        }
        return f24829a;
    }

    public a a(String str) {
        return this.b.get(str);
    }

    public void a(String str, a aVar) {
        if (aVar != null) {
            g.d("put engine with id:" + str);
            this.b.put(str, aVar);
            return;
        }
        g.d("remove engine with id:" + str);
        this.b.remove(str);
    }

    public boolean a(a aVar) {
        if (this.c.size() < 3) {
            aVar.l();
            this.c.add(aVar);
            rtd.b("FlutterEngineCache", "recycle engine: " + aVar);
            return true;
        }
        return false;
    }

    public a b() {
        if (!this.c.isEmpty()) {
            a remove = this.c.remove();
            rtd.b("FlutterEngineCache", "reuse engine: " + remove);
            return remove;
        }
        return null;
    }

    public void b(String str) {
        a(str, null);
    }
}
