package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class jyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jyt INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, FutureTask<JSONObject>> f29864a;
    private static final LinkedList<jys> b;

    static {
        kge.a(206282342);
        INSTANCE = new jyt();
        f29864a = new HashMap<>();
        b = new LinkedList<>();
    }

    private jyt() {
    }

    public final boolean a(Uri data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, data})).booleanValue();
        }
        q.c(data, "data");
        Iterator<jys> it = b.iterator();
        while (it.hasNext()) {
            jys next = it.next();
            if (next.a(data)) {
                return a(data, next.a());
            }
        }
        return false;
    }

    public final boolean a(Uri data, jyu preloadTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1329e8d", new Object[]{this, data, preloadTask})).booleanValue();
        }
        q.c(data, "data");
        q.c(preloadTask, "preloadTask");
        return f.a().a(data.toString(), preloadTask.a(), preloadTask.b(), preloadTask.c(), preloadTask.d(), null, false);
    }

    public final void a(jys handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0550354", new Object[]{this, handler});
            return;
        }
        q.c(handler, "handler");
        b.add(handler);
    }
}
