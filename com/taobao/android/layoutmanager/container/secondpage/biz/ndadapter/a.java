package com.taobao.android.layoutmanager.container.secondpage.biz.ndadapter;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.b;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.d;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class a extends com.taobao.android.detail2.core.framework.secondpage.a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private C0511a h;
    private GGSecTNodePageAdapterForND i;
    private d j;

    static {
        kge.a(1819197801);
        kge.a(-1969929256);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context) {
        super(context);
        ogg.a("DelegateSecondPageAdapterForND", "construct context:" + context + " ;;; " + this);
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        ogg.a("DelegateSecondPageAdapterForND", "createRootView context:" + this.f11564a + " ;;; " + this);
        if (c.a()) {
            return m().a(this.f11564a);
        }
        return l().a();
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void a(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b35d093", new Object[]{this, uri, view});
            return;
        }
        ogg.a("DelegateSecondPageAdapterForND", "renderContentView context:" + this.f11564a + ";;; rootView:" + view + " ;;; " + this);
        if (c.a()) {
            m().a(uri, (String) null);
        } else {
            l().a(uri, view);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void b(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d5fb94", new Object[]{this, uri, view});
        } else if (c.a()) {
            m().a();
        } else {
            l().b(uri, view);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (c.a()) {
            m().b();
        } else {
            l().d();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (c.a()) {
            m().c();
        } else {
            l().e();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (c.a()) {
            m().d();
        } else {
            l().g();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public com.taobao.android.detail2.core.framework.secondpage.c a(com.taobao.android.detail2.core.framework.secondpage.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.secondpage.c) ipChange.ipc$dispatch("94e1caed", new Object[]{this, bVar});
        }
        if (c.a()) {
            if (this.h == null) {
                this.h = new C0511a(bVar);
            }
            this.h.a(bVar);
            return this.h;
        }
        return l().a(bVar);
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.b
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.g.a();
        }
    }

    private GGSecTNodePageAdapterForND l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GGSecTNodePageAdapterForND) ipChange.ipc$dispatch("5d76c79d", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new GGSecTNodePageAdapterForND(this.f11564a);
        }
        return this.i;
    }

    private d m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b830607d", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new d(this);
        }
        return this.j;
    }

    /* renamed from: com.taobao.android.layoutmanager.container.secondpage.biz.ndadapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0511a extends com.taobao.android.detail2.core.framework.secondpage.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;
        private MotionEvent c;

        static {
            kge.a(-1159430105);
        }

        public static /* synthetic */ Object ipc$super(C0511a c0511a, String str, Object... objArr) {
            if (str.hashCode() == -874020383) {
                super.a((com.taobao.android.detail2.core.framework.secondpage.b) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public C0511a(com.taobao.android.detail2.core.framework.secondpage.b bVar) {
            super(bVar);
            this.b = false;
            this.c = null;
        }

        @Override // com.taobao.android.detail2.core.framework.secondpage.c
        public void a(com.taobao.android.detail2.core.framework.secondpage.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbe781e1", new Object[]{this, bVar});
            } else if (bVar == this.f11565a) {
            } else {
                super.a(bVar);
                this.b = false;
                this.c = null;
            }
        }

        @Override // com.taobao.android.detail2.core.framework.secondpage.c
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
            boolean c = c(motionEvent);
            if (motionEvent == this.c) {
                return true;
            }
            if (!c && this.b && !b(a(), false, 0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                b(obtain);
                obtain.recycle();
                this.c = MotionEvent.obtain(motionEvent);
                this.c.setAction(0);
                b(this.c);
                this.c.recycle();
                this.c = null;
            }
            return c;
        }

        @Override // com.taobao.android.detail2.core.framework.secondpage.c
        public boolean a(View view, boolean z, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("436a9bd", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if ((view instanceof com.taobao.tao.flexbox.layoutmanager.view.b) && ((com.taobao.tao.flexbox.layoutmanager.view.b) view).canPullIntercept(com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG)) {
                this.b = true;
                return true;
            }
            return b(view, z, i, i2, i3);
        }
    }
}
