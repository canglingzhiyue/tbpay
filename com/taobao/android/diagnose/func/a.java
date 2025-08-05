package com.taobao.android.diagnose.func;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.b;
import com.taobao.android.diagnose.common.c;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.EventLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fmx;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f11711a;
    private final com.taobao.android.diagnose.model.a b;
    private com.taobao.android.diagnose.scene.a c = null;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private boolean e = false;
    private int f = 0;
    private boolean g = false;
    private long h = 0;

    static {
        kge.a(1829180551);
    }

    public static /* synthetic */ void lambda$DZC3XB9NCgEl1Oy9AV5kEebcnkY(a aVar, long j, long j2, long j3) {
        aVar.b(j, j2, j3);
    }

    public a(Context context, com.taobao.android.diagnose.model.a aVar) {
        this.f11711a = context;
        this.b = aVar;
    }

    public void a(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    private void a(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262808dc", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
        } else if (this.e) {
        } else {
            if (j2 < com.taobao.android.diagnose.config.a.n.memExhaustLevel) {
                this.f = 0;
                return;
            }
            if (this.f == 0) {
                this.h = j3;
            }
            int i = this.f + 1;
            this.f = i;
            if (i < 3) {
                return;
            }
            if (this.f == 3) {
                System.gc();
                System.runFinalization();
                return;
            }
            if (!this.g) {
                long j4 = 0;
                if (this.b.f() != null) {
                    j4 = this.b.f().f11714a;
                }
                b.a(j >> 20, j2, j4 >> 20, this.h >> 20);
                if (this.b.i().isInner) {
                    b.a(14);
                }
                this.g = true;
            }
            if (com.taobao.android.diagnose.config.a.o && this.f < com.taobao.android.diagnose.config.a.n.exhaustCount + 3) {
                return;
            }
            this.e = true;
            Intent intent = new Intent("com.taobao.android.diagnose.action.JAVA_LOW_MEMORY");
            intent.putExtra("used", j);
            intent.putExtra("ratio", j2);
            LocalBroadcastManager.getInstance(this.f11711a).sendBroadcast(intent);
            v.d("MemoryChecker", "Notify JAVA_LOW_MEMORY. ratio=" + j2);
            EventLogger.builder(5).setData("type", String.valueOf(14)).setData("used", String.valueOf(j)).setData("ratio", String.valueOf(j2)).setData("before", String.valueOf(this.h)).log();
            this.c.a("scene_mem_exhaust", (fmx) null);
        }
    }

    public void a(final long j, final long j2, final long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c581a5c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)});
            return;
        }
        com.taobao.android.diagnose.scene.a.a("fact_heap_level", Long.valueOf(j2));
        if (!com.taobao.android.diagnose.config.a.n.isCheckExhaustEnable() || this.d.compareAndSet(false, true)) {
            return;
        }
        c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.func.-$$Lambda$a$DZC3XB9NCgEl1Oy9AV5kEebcnkY
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$DZC3XB9NCgEl1Oy9AV5kEebcnkY(a.this, j, j2, j3);
            }
        });
    }

    public /* synthetic */ void b(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0935bb", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        try {
            a(j, j2, j3);
        } finally {
            this.d.set(false);
        }
    }
}
