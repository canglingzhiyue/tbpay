package com.nirvana.tools.logger.model;

/* loaded from: classes4.dex */
public class b extends c {
    public static final int MONITOR_URGENCY_DELAYED = 2;
    public static final int MONITOR_URGENCY_REAL_TIME = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f8092a;

    public b() {
    }

    public b(int i) {
        if (i != 1 && i != 2) {
            i = 2;
        }
        this.f8092a = i;
    }

    public int a() {
        return this.f8092a;
    }

    public void a(int i) {
        this.f8092a = i;
    }
}
