package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    static final JSONReader.c f2942a;
    static final d e;
    static final d f;
    JSONReader.c b;
    JSONWriter.a c;
    final String d;
    final List<g> g;
    final boolean h;
    public final boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final d f2943a;
        final a b;
        final g c;
        final g d;
        final long e;
        Object f;
        Object g;
        boolean h;

        static {
            kge.a(775182714);
        }

        a(d dVar, a aVar, g gVar, g gVar2, long j) {
            this.f2943a = dVar;
            this.c = gVar;
            this.d = gVar2;
            this.b = aVar;
            this.e = j;
        }
    }

    static {
        kge.a(1506491279);
        e = new d("$", new ArrayList(), true, false);
        f = new d("#-1", new ArrayList(), false, true);
        f2942a = JSONFactory.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(String str, List<g> list, boolean z, boolean z2) {
        this.d = str;
        this.g = list;
        this.h = z;
        this.i = z2;
    }

    public static d a(String str) {
        return "#-1".equals(str) ? f : new f(str).a();
    }

    public Object a(Object obj) {
        int size;
        if (!this.h && (size = this.g.size()) != 0) {
            int i = 0;
            a aVar = null;
            while (i < size) {
                g gVar = this.g.get(i);
                int i2 = i + 1;
                a aVar2 = new a(this, aVar, gVar, i2 < size ? this.g.get(i2) : null, 0L);
                if (i == 0) {
                    aVar2.f = obj;
                }
                gVar.a(aVar2);
                i = i2;
                aVar = aVar2;
            }
            return aVar.g;
        }
        return obj;
    }

    public final String toString() {
        return this.d;
    }
}
