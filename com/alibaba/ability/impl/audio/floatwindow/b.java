package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final d b;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.ability.impl.audio.floatwindow.a f1865a;

    private b() {
    }

    public /* synthetic */ b(o oVar) {
        this();
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : b;
    }

    public final void a(Context context, AbsFloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a49a2", new Object[]{this, context, floatWindow});
            return;
        }
        q.d(context, "context");
        q.d(floatWindow, "floatWindow");
        if (this.f1865a == null) {
            this.f1865a = new com.alibaba.ability.impl.audio.floatwindow.a(context);
            com.alibaba.ability.impl.audio.floatwindow.a aVar = this.f1865a;
            q.a(aVar);
            aVar.b();
        }
        com.alibaba.ability.impl.audio.floatwindow.a aVar2 = this.f1865a;
        q.a(aVar2);
        if (aVar2.a().containsFloatWindow(floatWindow)) {
            return;
        }
        com.alibaba.ability.impl.audio.floatwindow.a aVar3 = this.f1865a;
        q.a(aVar3);
        aVar3.a().addViewByLevel(floatWindow, floatWindow.level);
    }

    public final void b(Context context, AbsFloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8420ea3", new Object[]{this, context, floatWindow});
            return;
        }
        q.d(context, "context");
        q.d(floatWindow, "floatWindow");
        com.alibaba.ability.impl.audio.floatwindow.a aVar = this.f1865a;
        if (aVar == null || !aVar.a().containsFloatWindow(floatWindow)) {
            return;
        }
        aVar.a().removeView(floatWindow);
        if (!aVar.a().isEmpty()) {
            return;
        }
        aVar.c();
        this.f1865a = null;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1503031406);
        }

        public final b a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("b5e32a60", new Object[]{this});
            } else {
                d a2 = b.a();
                a aVar = b.Companion;
                value = a2.getValue();
            }
            return (b) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1626497882);
        Companion = new a(null);
        b = e.a(FloatWindowManager$Companion$instance$2.INSTANCE);
    }
}
