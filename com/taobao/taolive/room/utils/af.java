package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private z f21756a = new z(300000, 1000) { // from class: com.taobao.taolive.room.utils.af.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.room.utils.z
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            af afVar = af.this;
            af.a(afVar, af.a(afVar) + 1000);
            if (af.b(af.this) == null) {
                if (af.c(af.this) == null) {
                    return;
                }
                af.c(af.this).a();
                return;
            }
            af.b(af.this).a(af.a(af.this));
        }

        @Override // com.taobao.taolive.room.utils.z
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            af.a(af.this, System.currentTimeMillis());
            if (af.c(af.this) == null) {
                return;
            }
            af.c(af.this).b();
        }
    };
    private a b;
    private long c;

    /* loaded from: classes8.dex */
    public interface a {
        void a(long j);
    }

    static {
        kge.a(-1348012455);
    }

    public static /* synthetic */ long a(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c3c6888", new Object[]{afVar})).longValue() : afVar.c;
    }

    public static /* synthetic */ long a(af afVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb5120a4", new Object[]{afVar, new Long(j)})).longValue();
        }
        afVar.c = j;
        return j;
    }

    public static /* synthetic */ a b(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("eeb870b0", new Object[]{afVar}) : afVar.b;
    }

    public static /* synthetic */ z c(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("320111cb", new Object[]{afVar}) : afVar.f21756a;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d998bb7", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            z zVar = this.f21756a;
            if (zVar != null && !zVar.f21784a) {
                this.c = System.currentTimeMillis();
                this.f21756a.b();
            }
            this.b = aVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        z zVar = this.f21756a;
        if (zVar == null) {
            return;
        }
        zVar.b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        z zVar = this.f21756a;
        if (zVar == null) {
            return;
        }
        zVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        z zVar = this.f21756a;
        if (zVar != null) {
            zVar.a();
            this.f21756a = null;
        }
        this.b = null;
    }
}
