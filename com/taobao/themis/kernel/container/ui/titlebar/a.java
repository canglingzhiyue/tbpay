package com.taobao.themis.kernel.container.ui.titlebar;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CENTER = 2;
    public static final C0941a Companion;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f22508a;
    private ITMSPage b;

    static {
        kge.a(-450107207);
        Companion = new C0941a(null);
    }

    public abstract View a(Context context);

    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
        } else {
            q.d(style, "style");
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f22508a;
    }

    public final void m_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abf1d0a", new Object[]{this, new Integer(i)});
        } else {
            this.f22508a = i;
        }
    }

    public final ITMSPage d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7f0e0b36", new Object[]{this}) : this.b;
    }

    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        this.b = page;
    }

    /* renamed from: com.taobao.themis.kernel.container.ui.titlebar.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0941a {
        static {
            kge.a(71237825);
        }

        private C0941a() {
        }

        public /* synthetic */ C0941a(o oVar) {
            this();
        }
    }
}
