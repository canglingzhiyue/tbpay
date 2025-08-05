package com.alibaba.ability.impl.file;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f1888a;
    private long b;
    private final ReentrantLock c;

    static {
        kge.a(-1833264352);
    }

    public a(Context context, String businessId) {
        q.d(context, "context");
        q.d(businessId, "businessId");
        this.f1888a = FileAbility.MAX_DIR_SIZE;
        this.b = d.b(new File(i.INSTANCE.a(context, businessId)));
        this.c = new ReentrantLock();
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.c.lock();
        try {
            this.b += j;
        } finally {
            this.c.unlock();
        }
    }

    public final boolean b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{this, new Long(j)})).booleanValue();
        }
        this.c.lock();
        try {
            if (this.b + j > this.f1888a) {
                return false;
            }
            this.b += j;
            return true;
        } finally {
            this.c.unlock();
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        this.c.lock();
        try {
            this.f1888a = j;
        } finally {
            this.c.unlock();
        }
    }
}
