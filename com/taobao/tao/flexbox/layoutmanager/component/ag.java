package com.taobao.tao.flexbox.layoutmanager.component;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class ag {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ = "guangguang";
    public static final int EVENT_ACTION = 3;
    public static final int EVENT_ENTER = 66;
    public static final int EVENT_ESCAPE = 111;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.dinamicx.videoc.b f20109a;
    private Method c;
    private Method d;
    private DXNativeViewPagerView e;
    private DXRecyclerView f;
    private DXRecyclerView g;
    private String h;
    private boolean l;
    private int b = -1;
    private Handler k = new Handler(Looper.getMainLooper());
    private ViewPager.OnPageChangeListener m = new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                ag.e(ag.this);
            }
        }
    };
    private RecyclerView.OnScrollListener n = new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (ag.i(ag.this) == null) {
                ag.e(ag.this);
            }
            if (ag.i(ag.this) == null || ag.i(ag.this).canScrollVertically(-1)) {
                return;
            }
            ag agVar = ag.this;
            ag.a(agVar, ag.i(agVar), i);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (ag.i(ag.this) == null || ag.i(ag.this).canScrollVertically(-1)) {
                return;
            }
            ag agVar = ag.this;
            ag.b(agVar, ag.i(agVar));
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-400836641);
    }

    public static /* synthetic */ int a(ag agVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cab8e9be", new Object[]{agVar, new Integer(i)})).intValue();
        }
        agVar.b = i;
        return i;
    }

    public static /* synthetic */ DXNativeViewPagerView a(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXNativeViewPagerView) ipChange.ipc$dispatch("c33b7e6c", new Object[]{agVar}) : agVar.e;
    }

    public static /* synthetic */ DXNativeViewPagerView a(ag agVar, DXNativeViewPagerView dXNativeViewPagerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeViewPagerView) ipChange.ipc$dispatch("2e906a9e", new Object[]{agVar, dXNativeViewPagerView});
        }
        agVar.e = dXNativeViewPagerView;
        return dXNativeViewPagerView;
    }

    public static /* synthetic */ DXRecyclerView a(ag agVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerView) ipChange.ipc$dispatch("bae50d9e", new Object[]{agVar, viewGroup}) : agVar.b(viewGroup);
    }

    public static /* synthetic */ DXRecyclerView a(ag agVar, DXRecyclerView dXRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("61647f26", new Object[]{agVar, dXRecyclerView});
        }
        agVar.f = dXRecyclerView;
        return dXRecyclerView;
    }

    public static /* synthetic */ void a(ag agVar, DXRecyclerView dXRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249e6ce4", new Object[]{agVar, dXRecyclerView, new Integer(i)});
        } else {
            agVar.a(dXRecyclerView, i);
        }
    }

    public static /* synthetic */ DXRecyclerView b(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerView) ipChange.ipc$dispatch("c6e4dc3e", new Object[]{agVar}) : agVar.f;
    }

    public static /* synthetic */ void b(ag agVar, DXRecyclerView dXRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1464700", new Object[]{agVar, dXRecyclerView});
        } else {
            agVar.a(dXRecyclerView);
        }
    }

    public static /* synthetic */ RecyclerView.OnScrollListener c(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("2318e4a4", new Object[]{agVar}) : agVar.n;
    }

    public static /* synthetic */ ViewPager.OnPageChangeListener d(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("72d29f7f", new Object[]{agVar}) : agVar.m;
    }

    public static /* synthetic */ void e(ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c952dbb4", new Object[]{agVar});
        } else {
            agVar.c();
        }
    }

    public static /* synthetic */ boolean f(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca892e97", new Object[]{agVar})).booleanValue() : agVar.l;
    }

    public static /* synthetic */ void g(ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbf8172", new Object[]{agVar});
        } else {
            agVar.d();
        }
    }

    public static /* synthetic */ String h(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("664f2c6f", new Object[]{agVar}) : agVar.h;
    }

    public static /* synthetic */ DXRecyclerView i(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerView) ipChange.ipc$dispatch("62f3d857", new Object[]{agVar}) : agVar.g;
    }

    public static /* synthetic */ com.taobao.android.dinamicx.videoc.b j(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.videoc.b) ipChange.ipc$dispatch("d5ee8ae8", new Object[]{agVar}) : agVar.f20109a;
    }

    public ag(DinamicXEngine dinamicXEngine, String str) {
        this.f20109a = dinamicXEngine.u();
        this.h = str;
    }

    public void a(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        final int[] iArr = {1};
        viewGroup.postDelayed(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
                ag.a(ag.this, (DXNativeViewPagerView) ag.a(viewGroup, DXNativeViewPagerView.class));
                if (ag.a(ag.this) == null) {
                    if (iArr[0] >= 10) {
                        return;
                    }
                    viewGroup.postDelayed(this, 300L);
                    return;
                }
                ag agVar = ag.this;
                ag.a(agVar, ag.a(agVar).getCurrentItem());
                ag agVar2 = ag.this;
                ag.a(agVar2, ag.a(agVar2, (ViewGroup) ag.a(agVar2)));
                if (ag.b(ag.this) != null) {
                    ag.b(ag.this).addOnScrollListener(ag.c(ag.this));
                }
                ag.a(ag.this).setOnPageChangeListener(ag.d(ag.this));
            }
        }, 300L);
        viewGroup.setTag(R.id.dx_video_view_control_lifecycle, new a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.component.ag.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ag.this.b();
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.component.ag.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    ag.this.a();
                }
            }
        });
    }

    public static a a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a7ed009d", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.dx_video_view_control_lifecycle);
        if (!(tag instanceof a)) {
            return null;
        }
        return (a) tag;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        if (this.b == this.e.getCurrentItem() && this.g != null) {
            return;
        }
        this.b = this.e.getCurrentItem();
        DXNativeViewPagerView dXNativeViewPagerView = this.e;
        this.g = (DXRecyclerView) a(dXNativeViewPagerView.getChildAt(dXNativeViewPagerView.getCurrentItem()), DXRecyclerView.class);
        if (this.g == null || this.f20109a == null) {
            return;
        }
        this.k.removeCallbacksAndMessages(null);
        a(this.b);
    }

    private void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.k.postDelayed(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!ag.f(ag.this)) {
                    } else {
                        ag.g(ag.this);
                        if (i != ag.a(ag.this).getCurrentItem()) {
                            return;
                        }
                        String str = "guangguang_" + ag.h(ag.this) + i;
                        ogg.a("DxVideoControlHelper", "addVideoQueue  key :" + str);
                        ag.j(ag.this).d(ag.i(ag.this), str);
                    }
                }
            }, 350L);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DXNativeViewPagerView dXNativeViewPagerView = this.e;
        if (dXNativeViewPagerView == null || dXNativeViewPagerView.getChildCount() == 0) {
            return;
        }
        for (int i = 0; i < this.e.getChildCount(); i++) {
            DXRecyclerView dXRecyclerView = (DXRecyclerView) a(this.e.getChildAt(i), DXRecyclerView.class);
            if (dXRecyclerView != null) {
                String str = "guangguang_" + this.h + i;
                this.f20109a.f(dXRecyclerView, str);
                ogg.a("DxVideoControlHelper", "clearVideoQueue key :" + str);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.k.removeCallbacksAndMessages(null);
        this.l = false;
        d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = true;
        DXNativeViewPagerView dXNativeViewPagerView = this.e;
        if (dXNativeViewPagerView == null) {
            return;
        }
        this.g = (DXRecyclerView) a(dXNativeViewPagerView.getChildAt(dXNativeViewPagerView.getCurrentItem()), DXRecyclerView.class);
        if (this.g == null || this.f20109a == null) {
            return;
        }
        this.k.postDelayed(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ag.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!ag.f(ag.this)) {
                } else {
                    String str = "guangguang_" + ag.h(ag.this) + ag.a(ag.this).getCurrentItem();
                    ag.j(ag.this).e(ag.i(ag.this), str);
                    ogg.a("DxVideoControlHelper", "addVideoQueue1  key :" + str);
                }
            }
        }, 350L);
    }

    private void a(DXRecyclerView dXRecyclerView) {
        try {
            if (this.c == null) {
                this.c = RecyclerView.class.getDeclaredMethod("dispatchOnScrolled", Integer.TYPE, Integer.TYPE);
                this.c.setAccessible(true);
            }
            this.c.invoke(dXRecyclerView, 0, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(DXRecyclerView dXRecyclerView, int i) {
        try {
            if (this.d == null) {
                this.d = RecyclerView.class.getDeclaredMethod("dispatchOnScrollStateChanged", Integer.TYPE);
                this.d.setAccessible(true);
            }
            this.d.invoke(dXRecyclerView, Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private DXRecyclerView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("7a44364f", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
        if (viewGroup2 instanceof DXRecyclerView) {
            return (DXRecyclerView) viewGroup.getParent();
        }
        return b(viewGroup2);
    }

    public static <T extends View> T a(View view, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cad60e95", new Object[]{view, cls});
        }
        if (view == 0) {
            return null;
        }
        if (view.getClass().equals(cls)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                T t = (T) a(viewGroup.getChildAt(i), cls);
                if (t != null) {
                    return t;
                }
            }
        }
        return null;
    }
}
