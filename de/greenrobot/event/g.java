package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class g {
    private static final List<g> d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f24775a;
    l b;
    g c;

    private g(Object obj, l lVar) {
        this.f24775a = obj;
        this.b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(l lVar, Object obj) {
        synchronized (d) {
            int size = d.size();
            if (size > 0) {
                g remove = d.remove(size - 1);
                remove.f24775a = obj;
                remove.b = lVar;
                remove.c = null;
                return remove;
            }
            return new g(obj, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(g gVar) {
        gVar.f24775a = null;
        gVar.b = null;
        gVar.c = null;
        synchronized (d) {
            if (d.size() < 10000) {
                d.add(gVar);
            }
        }
    }
}
