package com.taobao.search.sf.widgets.headerskin;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.jbg;
import tb.kge;
import tb.poq;

/* loaded from: classes8.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f19497a;
    private ThemeFrameLayout b;
    private FrameLayout c;
    private TUrlImageView d;
    private final g e;
    private final HandlerThread f;
    private final kotlin.d g;
    private final Activity h;
    private final String i;
    private final boolean j;

    static {
        kge.a(1643223711);
        f19497a = new k[]{t.a(new PropertyReference1Impl(t.b(d.class), "asyncHandler", "getAsyncHandler()Landroid/os/Handler;"))};
    }

    private final Handler f() {
        IpChange ipChange = $ipChange;
        return (Handler) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("9c1ea3b9", new Object[]{this}) : this.g.getValue());
    }

    public d(int i, Activity activity, String bizName) {
        q.c(activity, "activity");
        q.c(bizName, "bizName");
        this.h = activity;
        this.i = bizName;
        this.e = new g(this.i, i);
        this.f = jbg.a("tb-search-thread");
        this.j = poq.a(this.h);
        this.g = kotlin.e.a(new SkinView$asyncHandler$2(this));
        this.e.e = i;
    }

    public static final /* synthetic */ Handler a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b14f4a14", new Object[]{dVar}) : dVar.f();
    }

    public final Activity e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this}) : this.h;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.j && !j.d() && !j.e()) {
            this.c = new FrameLayout(this.h);
            FrameLayout frameLayout = this.c;
            if (frameLayout == null) {
                q.a();
            }
            frameLayout.setBackgroundColor(-1);
        } else {
            this.b = j.a().a(this.h, this.e);
            ThemeFrameLayout themeFrameLayout = this.b;
            if (themeFrameLayout == null) {
                return;
            }
            View childAt = themeFrameLayout.getChildAt(0);
            if (!(childAt instanceof FrameLayout)) {
                childAt = null;
            }
            FrameLayout frameLayout2 = (FrameLayout) childAt;
            if (frameLayout2 == null) {
                return;
            }
            View childAt2 = frameLayout2.getChildAt(0);
            if (!(childAt2 instanceof TUrlImageView)) {
                childAt2 = null;
            }
            TUrlImageView tUrlImageView = (TUrlImageView) childAt2;
            if (tUrlImageView == null) {
                return;
            }
            this.d = tUrlImageView;
            a(tUrlImageView);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = new SearchUrlImageView(this.h);
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null) {
            q.a();
        }
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.c = new FrameLayout(this.h);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.a();
        }
        frameLayout.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void a(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, url});
            return;
        }
        q.c(url, "url");
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null) {
            return;
        }
        if (TextUtils.isEmpty(url)) {
            tUrlImageView.setVisibility(8);
            tUrlImageView.setImageUrl("");
            return;
        }
        tUrlImageView.setVisibility(0);
        tUrlImageView.setImageUrl(url);
        a(tUrlImageView);
    }

    /* loaded from: classes8.dex */
    public static final class a implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TUrlImageView b;

        /* renamed from: com.taobao.search.sf.widgets.headerskin.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class RunnableC0792a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Bitmap b;
            public final /* synthetic */ float c;

            public RunnableC0792a(Bitmap bitmap, float f) {
                this.b = bitmap;
                this.c = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final e eVar = new e(com.taobao.android.tbtheme.kit.c.a(this.b), this.c);
                FrameLayout c = d.this.c();
                if (c == null) {
                    q.a();
                }
                c.post(new Runnable() { // from class: com.taobao.search.sf.widgets.headerskin.d.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (d.this.e().isFinishing()) {
                        } else {
                            FrameLayout c2 = d.this.c();
                            if (c2 == null) {
                                q.a();
                            }
                            c2.setForeground(eVar);
                        }
                    }
                });
                FrameLayout c2 = d.this.c();
                if (c2 == null) {
                    q.a();
                }
                c2.postInvalidate();
            }
        }

        public a(TUrlImageView tUrlImageView) {
            this.b = tUrlImageView;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            Bitmap bitmap = (succPhenixEvent == null || (drawable = succPhenixEvent.getDrawable()) == null) ? null : drawable.getBitmap();
            if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                this.b.setImageDrawable(null);
                return true;
            }
            this.b.setImageDrawable(succPhenixEvent.getDrawable());
            float width = this.b.getWidth() / (bitmap.getWidth() / bitmap.getHeight());
            this.b.getLayoutParams().height = (int) width;
            this.b.requestLayout();
            d.a(d.this).post(new RunnableC0792a(bitmap, width));
            return true;
        }
    }

    private final void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
        } else {
            tUrlImageView.succListener(new a(tUrlImageView));
        }
    }

    public final FrameLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("56f39b2f", new Object[]{this});
        }
        ThemeFrameLayout themeFrameLayout = this.b;
        return themeFrameLayout != null ? themeFrameLayout : this.c;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                this.f.quitSafely();
            } else {
                this.f.quit();
            }
        } catch (Exception unused) {
        }
    }
}
