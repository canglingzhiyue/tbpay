package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public class d {
    private static final ExecutorService i = Executors.newCachedThreadPool();
    boolean e;
    List<Class<?>> h;

    /* renamed from: a  reason: collision with root package name */
    boolean f24772a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;
    boolean f = true;
    ExecutorService g = i;

    public c a() {
        return new c(this);
    }

    public d a(boolean z) {
        this.f24772a = z;
        return this;
    }

    public d b(boolean z) {
        this.b = z;
        return this;
    }

    public d c(boolean z) {
        this.e = z;
        return this;
    }
}
