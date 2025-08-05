package com.taobao.search.refactor.list;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ntx;

/* loaded from: classes7.dex */
public final class a extends com.taobao.search.refactor.list.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private final int[] c;
    private final int d;
    private final int e;

    /* renamed from: com.taobao.search.refactor.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0777a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0777a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a.a(a.this);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a.a(a.this);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        kge.a(-571330145);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h widget) {
        super(widget);
        q.c(widget, "widget");
        this.b = true;
        this.c = new int[2];
        this.d = ntx.a() / 2;
        this.e = ntx.c() / 2;
    }

    public static final /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a824b50", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (k()) {
        } else {
            com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) i().J();
            q.a((Object) bVar, "widget.iView");
            com.taobao.search.jarvis.c.a(bVar.m());
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!k()) {
            com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) i().J();
            q.a((Object) bVar, "widget.iView");
            com.taobao.search.jarvis.c.b(bVar.m());
        }
        try {
            l();
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) i().getView();
        if (frameLayout == null) {
            return;
        }
        frameLayout.postDelayed(new RunnableC0777a(), 200L);
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
            return;
        }
        q.c(listStyle, "listStyle");
        FrameLayout frameLayout = (FrameLayout) i().getView();
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
        if (r4 < r23.e) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r4 < r23.e) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.refactor.list.a.l():void");
    }

    private final boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view.getTop() < 0) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        return viewGroup != null && view.getBottom() <= viewGroup.getBottom();
    }
}
