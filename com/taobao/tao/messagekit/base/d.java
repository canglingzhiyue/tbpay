package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tao.reactivex.f.k;
import tb.jrg;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f20753a;
    private com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> b = new com.taobao.tao.messagekit.core.model.d<>();
    private com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> c = new com.taobao.tao.messagekit.core.model.d<>();
    private com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> d = new com.taobao.tao.messagekit.core.model.d<>();
    private f e = new f();
    private com.taobao.tao.messagekit.base.a f = new com.taobao.tao.messagekit.base.a();
    private com.taobao.tao.messagekit.base.monitor.c g = new com.taobao.tao.messagekit.base.monitor.c();
    private com.taobao.tao.messagekit.base.network.b h = new com.taobao.tao.messagekit.base.network.b();
    private com.taobao.tao.messagekit.base.b i = new com.taobao.tao.messagekit.base.b();
    private g j = new g();
    private AtomicBoolean k = new AtomicBoolean(false);
    private b l;
    private a m;

    /* loaded from: classes8.dex */
    public interface a {
        tao.reactivex.c<com.taobao.tao.messagekit.core.model.b> a(tao.reactivex.c<com.taobao.tao.messagekit.core.model.b> cVar);
    }

    /* loaded from: classes8.dex */
    public interface b {
        tao.reactivex.c<com.taobao.tao.messagekit.core.model.b> b(tao.reactivex.c<com.taobao.tao.messagekit.core.model.b> cVar);
    }

    static {
        kge.a(-1308236948);
        f20753a = new d();
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c2c79097", new Object[0]) : f20753a;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fa69b4", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.m = aVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fade13", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.l = bVar;
        }
    }

    public com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.core.model.d) ipChange.ipc$dispatch("a4fea18e", new Object[]{this}) : this.b;
    }

    public com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.core.model.d) ipChange.ipc$dispatch("67eb0aed", new Object[]{this}) : this.c;
    }

    public com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.core.model.d) ipChange.ipc$dispatch("2ad7744c", new Object[]{this}) : this.d;
    }

    public com.taobao.tao.messagekit.base.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.a) ipChange.ipc$dispatch("481202b6", new Object[]{this}) : this.f;
    }

    public g f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a964a00f", new Object[]{this}) : this.j;
    }

    public f g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ab73c8f", new Object[]{this}) : this.e;
    }

    public com.taobao.tao.messagekit.base.monitor.c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.monitor.c) ipChange.ipc$dispatch("e6c7eca6", new Object[]{this}) : this.g;
    }

    public com.taobao.tao.messagekit.base.network.b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.network.b) ipChange.ipc$dispatch("1559bcd2", new Object[]{this}) : this.h;
    }

    public com.taobao.tao.messagekit.base.b j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.base.b) ipChange.ipc$dispatch("2eaf11f0", new Object[]{this}) : this.i;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.k.compareAndSet(false, true)) {
            MsgLog.c("MsgRouter", "already initialized >>>");
        } else {
            com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> dVar = this.c;
            if (dVar != null) {
                dVar.a(com.taobao.tao.messagekit.core.model.d.DOWN_STREAM);
            }
            com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> dVar2 = this.b;
            if (dVar2 != null) {
                dVar2.a(com.taobao.tao.messagekit.core.model.d.UP_STREAM);
            }
            com.taobao.tao.messagekit.core.model.d<com.taobao.tao.messagekit.core.model.b> dVar3 = this.d;
            if (dVar3 != null) {
                dVar3.a(com.taobao.tao.messagekit.core.model.d.CONTROL_STREAM);
            }
            MsgLog.b("MsgRouter", "onInitialized >>>");
            this.l.b(this.b.a().a(k.a())).a(i());
            this.m.a(this.d.a().a(k.a()).a(new jrg<com.taobao.tao.messagekit.core.model.b>() { // from class: com.taobao.tao.messagekit.base.MsgRouter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(com.taobao.tao.messagekit.core.model.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue() : (bVar.f20780a instanceof Ack) || (bVar.f20780a instanceof AccsConnInfo);
                }

                @Override // tb.jrg
                public /* synthetic */ boolean test(com.taobao.tao.messagekit.core.model.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
                }
            })).a(e());
            com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_MSG_DURATION", new ArrayList<String>() { // from class: com.taobao.tao.messagekit.base.MsgRouter$2
                {
                    d.this = this;
                    add("MKT_DIMENS_BIZ");
                    add("MKT_DIMENS_DUP");
                    add("MKT_DIMENS_MQTT");
                    add("MKT_DIMENS_TYPE");
                    add("MKT_DIMENS_SUBTYPE");
                    add("MKT_DIMENS_TOPIC");
                }
            }, new ArrayList<String>() { // from class: com.taobao.tao.messagekit.base.MsgRouter$3
                {
                    d.this = this;
                    add("MKT_MEASURE_FLOW");
                    add("MKT_MEASURE_NET");
                    add("MKT_MEASURE_PACK");
                }
            });
            this.g.b();
        }
    }
}
