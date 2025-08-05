package com.uc.webview.internal.stats;

import com.uc.webview.base.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class c {
    private static final Random b = new Random();

    /* renamed from: a  reason: collision with root package name */
    protected int f23996a;

    /* loaded from: classes9.dex */
    public interface a {
        c a(Map<String, String> map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(String str, Map map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(map.size() << 4);
        if (str.isEmpty()) {
            sb.append(str);
            sb.append(ResponseProtocolType.COMMENT);
        }
        sb.append(riy.BLOCK_START_STR);
        for (Object obj : map.keySet()) {
            sb.append(obj);
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(map.get(obj));
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    protected boolean a(c cVar) {
        return false;
    }

    protected abstract h b();

    protected void b(c cVar) {
    }

    protected abstract int c();

    protected abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> e();

    protected abstract c f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String g() {
        return b().f23999a;
    }

    protected boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        h b2 = b();
        int i = 0;
        if (h()) {
            h b3 = b();
            if (b3.size() > 50) {
                i = 1;
            } else if (b3.size() * d() > 10000) {
                i = 2;
            } else if (b3.size() > 7) {
                Iterator<c> it = b3.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    i2 += it.next().c();
                }
                if (i2 > 50000) {
                    i = 3;
                }
            }
        }
        if (i != 0) {
            Log.w("Stats", "discard stats, reason " + i + ", " + toString());
            return;
        }
        if (!b2.isEmpty()) {
            Iterator<c> it2 = b2.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                if (next.a(this)) {
                    next.b(this);
                    new StringBuilder("stats is merged into to cache: ").append(toString());
                    Log.b();
                    return;
                }
            }
        }
        b2.add(this);
    }

    public abstract void j();

    public final void k() {
        StatsManager.a(f());
        j();
    }
}
