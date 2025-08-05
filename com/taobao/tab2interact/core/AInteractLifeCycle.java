package com.taobao.tab2interact.core;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sus;
import tb.suw;

/* loaded from: classes8.dex */
public abstract class AInteractLifeCycle extends suw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private State f19717a;
    private final Context b;
    private final FrameLayout c;
    private final sus d;
    private final com.taobao.tab2interact.core.data.baseinfo.a e;

    /* loaded from: classes8.dex */
    public enum State {
        NOT_INIT("notInit"),
        INIT("init"),
        START("start"),
        STOP("stop"),
        DESTROY("destroy");
        
        private final String text;

        State(String str) {
            this.text = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    static {
        kge.a(-1794714886);
        Companion = new a(null);
    }

    public abstract void b();

    public abstract void c();

    public abstract View d();

    public abstract FrameLayout.LayoutParams e();

    public final Context m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6552c96c", new Object[]{this}) : this.b;
    }

    public final sus n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sus) ipChange.ipc$dispatch("731016c0", new Object[]{this}) : this.d;
    }

    public final com.taobao.tab2interact.core.data.baseinfo.a o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tab2interact.core.data.baseinfo.a) ipChange.ipc$dispatch("f43b5580", new Object[]{this}) : this.e;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(84856258);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public AInteractLifeCycle(Context context, FrameLayout interactHostView, sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager) {
        q.d(context, "context");
        q.d(interactHostView, "interactHostView");
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        this.b = context;
        this.c = interactHostView;
        this.d = messageCenter;
        this.e = baseInfoManager;
        this.f19717a = State.NOT_INIT;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "AInteractLayerComponent", "初始化互动组件或互动层");
        b();
        c();
        this.c.addView(d(), 0, e());
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "AInteractLayerComponent", "开启互动组件或互动层");
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "AInteractLayerComponent", "暂停互动组件或互动层");
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.taobao.tab2interact.core.utils.a.b(this, "AInteractLayerComponent", "销毁互动组件或互动层");
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f19717a == State.INIT || this.f19717a == State.START || this.f19717a == State.STOP || this.f19717a == State.DESTROY) {
        } else {
            a();
            this.f19717a = State.INIT;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f19717a == State.NOT_INIT || this.f19717a == State.START || this.f19717a == State.DESTROY) {
        } else {
            f();
            this.f19717a = State.START;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.f19717a == State.NOT_INIT || this.f19717a == State.INIT || this.f19717a == State.STOP || this.f19717a == State.DESTROY) {
        } else {
            g();
            this.f19717a = State.STOP;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.f19717a == State.NOT_INIT || this.f19717a == State.DESTROY) {
        } else {
            h();
            this.f19717a = State.DESTROY;
        }
    }
}
