package com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.bxp;
import tb.kge;
import tb.ljs;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMainFeedsLoopStartStopService f17536a;
    private IMainLifecycleService b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private final bxp l = new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bxp, tb.llb
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                c.a(c.this).a(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }

        @Override // tb.bxp, tb.llb
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                c.a(c.this).b(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }
    };
    private final IMainFeedsLoopStartStopService.a m = new IMainFeedsLoopStartStopService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!c.b(c.this)) {
            } else {
                c.a(c.this, false);
                c cVar = c.this;
                c.a(cVar, c.c(cVar) + (SystemClock.uptimeMillis() - c.d(c.this)));
                c cVar2 = c.this;
                c.b(cVar2, c.e(cVar2) + (SystemClock.uptimeMillis() - c.f(c.this)));
                c.c(c.this, SystemClock.uptimeMillis());
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else if (c.b(c.this)) {
            } else {
                c.a(c.this, true);
                long uptimeMillis = SystemClock.uptimeMillis();
                c.d(c.this, uptimeMillis);
                c.e(c.this, uptimeMillis);
                c.b(c.this, true);
            }
        }
    };

    static {
        kge.a(1162834027);
    }

    public static /* synthetic */ long a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76cab528", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.i = j;
        return j;
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("7d8086d1", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76caf148", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.k = z;
        return z;
    }

    public static /* synthetic */ long b(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beca1387", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.f = j;
        return j;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48380d55", new Object[]{cVar})).booleanValue() : cVar.k;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beca4fa7", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.j = z;
        return z;
    }

    public static /* synthetic */ long c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efb3e706", new Object[]{cVar})).longValue() : cVar.i;
    }

    public static /* synthetic */ long c(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c971e6", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.e = j;
        return j;
    }

    public static /* synthetic */ long d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("972fc0c7", new Object[]{cVar})).longValue() : cVar.h;
    }

    public static /* synthetic */ long d(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ec8d045", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.h = j;
        return j;
    }

    public static /* synthetic */ long e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eab9a88", new Object[]{cVar})).longValue() : cVar.f;
    }

    public static /* synthetic */ long e(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96c82ea4", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.d = j;
        return j;
    }

    public static /* synthetic */ long f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6277449", new Object[]{cVar})).longValue() : cVar.d;
    }

    public void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        ljsVar.a(IMainLifecycleService.class);
        this.f17536a = (IMainFeedsLoopStartStopService) ljsVar.a(IMainFeedsLoopStartStopService.class);
        this.b = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = this.f17536a;
        if (iMainFeedsLoopStartStopService != null) {
            iMainFeedsLoopStartStopService.registerStartStopListener(this.m);
        }
        IMainLifecycleService iMainLifecycleService = this.b;
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().a(this.l);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = this.f17536a;
        if (iMainFeedsLoopStartStopService != null) {
            iMainFeedsLoopStartStopService.unregisterStartStopListener(this.m);
        }
        IMainLifecycleService iMainLifecycleService = this.b;
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.l);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = SystemClock.uptimeMillis();
        this.d = 0L;
        this.f = 0L;
        this.g = 0L;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.h = 0L;
        this.i = 0L;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.j) {
        } else {
            this.j = false;
            this.g += SystemClock.uptimeMillis() - this.e;
        }
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("escapeDuration", String.valueOf(this.f));
        hashMap.put("escapeDurationAfterDragging", String.valueOf(this.g + this.f));
        hashMap.put("triggerPreloadCardDisplayTimestamp", String.valueOf(this.c));
        hashMap.put("totalEscapeDuration", String.valueOf(this.i));
        return hashMap;
    }
}
