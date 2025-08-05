package com.alibaba.security.ccrc.service.build;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.security.ccrc.service.build.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1255v implements InterfaceC1258w {

    /* renamed from: a  reason: collision with root package name */
    public final Z f3332a;
    public final ThreadPoolExecutor b = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ka(C1264y.c));

    public AbstractC1255v(Z z) {
        this.f3332a = z;
        this.b.allowCoreThreadTimeOut(true);
    }
}
