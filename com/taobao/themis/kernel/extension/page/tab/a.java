package com.taobao.themis.kernel.extension.page.tab;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.utils.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.sul;

/* loaded from: classes9.dex */
public final class a implements com.taobao.themis.kernel.container.ui.titlebar.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f22527a;
    private RelativeLayout b;
    private c.a c;
    private com.taobao.themis.kernel.extension.page.tab.c d;
    private final Context e;

    /* renamed from: com.taobao.themis.kernel.extension.page.tab.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class View$OnClickListenerC0944a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22528a;
        public final /* synthetic */ a b;

        public View$OnClickListenerC0944a(int i, a aVar) {
            this.f22528a = i;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c.a a2 = a.a(this.b);
            if (a2 == null) {
                return;
            }
            a2.a(this.f22528a);
        }
    }

    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22529a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ com.taobao.themis.kernel.extension.page.tab.c e;
        public final /* synthetic */ LinearLayout f;
        public final /* synthetic */ a g;

        public c(int i, int i2, int i3, int i4, com.taobao.themis.kernel.extension.page.tab.c cVar, LinearLayout linearLayout, a aVar) {
            this.f22529a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = cVar;
            this.f = linearLayout;
            this.g = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c.a a2 = a.a(this.g);
            if (a2 == null) {
                return;
            }
            a2.a(this.f22529a);
        }
    }

    static {
        kge.a(1767422806);
        kge.a(1289404388);
    }

    public a(Context context) {
        q.d(context, "context");
        this.e = context;
    }

    public static final /* synthetic */ c.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("1816a42", new Object[]{aVar}) : aVar.c;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : c.b.a(this);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(TabBar tabBar) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b8f1b", new Object[]{this, tabBar});
            return;
        }
        q.d(tabBar, "tabBar");
        boolean z = !tabBar.getInvisible();
        boolean isBulge = tabBar.isBulge();
        List<TabBarItem> items = tabBar.getItems();
        if (items == null) {
            items = p.a();
        }
        this.d = new com.taobao.themis.kernel.extension.page.tab.c(0, new ArrayList(items), isBulge, new ArrayList());
        int generateViewId = View.generateViewId();
        LinearLayout linearLayout = new LinearLayout(this.e);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setClipChildren(false);
        linearLayout.setId(generateViewId);
        linearLayout.setOnClickListener(b.INSTANCE);
        t tVar = t.INSTANCE;
        this.f22527a = linearLayout;
        View view = new View(this.e);
        try {
            i = Color.parseColor("#e9e9e9");
        } catch (Exception unused) {
            i = -7829368;
        }
        view.setBackgroundColor(i);
        RelativeLayout relativeLayout = new RelativeLayout(this.e);
        relativeLayout.setClipChildren(false);
        relativeLayout.setBackgroundColor(0);
        if (!z) {
            i2 = 8;
        }
        relativeLayout.setVisibility(i2);
        t tVar2 = t.INSTANCE;
        this.b = relativeLayout;
        LinearLayout linearLayout2 = this.f22527a;
        if (linearLayout2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, k.a(this.e, 49));
            layoutParams.addRule(12);
            RelativeLayout relativeLayout2 = this.b;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(linearLayout2, layoutParams);
            }
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, k.a(this.e, 1.0f));
        layoutParams2.addRule(2, generateViewId);
        RelativeLayout relativeLayout3 = this.b;
        if (relativeLayout3 != null) {
            relativeLayout3.addView(view, layoutParams2);
        }
        LinearLayout linearLayout3 = this.f22527a;
        if (linearLayout3 != null) {
            linearLayout3.bringToFront();
        }
        e();
    }

    private final void e() {
        int a2;
        int a3;
        int a4;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f22527a;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.e().clear();
        if (cVar.b()) {
            a2 = k.a(this.e, 64.0f);
        } else {
            a2 = k.a(this.e, 50.0f);
        }
        RelativeLayout relativeLayout = this.b;
        if (relativeLayout != null && (layoutParams = relativeLayout.getLayoutParams()) != null) {
            layoutParams.height = a2;
        }
        int a5 = cVar.a() / 2;
        int i = 0;
        for (Object obj : cVar.d()) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            TabBarItem tabBarItem = (TabBarItem) obj;
            boolean z = a5 == i && cVar.b();
            if (z) {
                a3 = k.a(this.e, 63);
            } else {
                a3 = k.a(this.e, 49);
            }
            int i3 = a3;
            if (z) {
                a4 = k.a(this.e, 63);
            } else {
                a4 = k.a(this.e, 49);
            }
            int i4 = a4;
            sul sulVar = new sul(tabBarItem, this.e, z);
            View a6 = sulVar.a();
            a6.setOnClickListener(new c(i, i4, i3, a5, cVar, linearLayout, this));
            linearLayout.addView(new Space(a6.getContext()), new LinearLayout.LayoutParams(0, -1, 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i3);
            layoutParams2.gravity = 80;
            linearLayout.addView(a6, layoutParams2);
            linearLayout.addView(new Space(a6.getContext()), new LinearLayout.LayoutParams(0, -1, 1.0f));
            cVar.e().add(sulVar);
            if (i == cVar.c()) {
                sulVar.a(true);
            }
            i = i2;
        }
    }

    private final void d(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i >= cVar.e().size()) {
            return;
        }
        sul sulVar = cVar.e().get(i);
        if (i != cVar.c()) {
            z = false;
        }
        sulVar.a(z);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i >= cVar.a() || cVar.c() == i) {
            return;
        }
        int c2 = cVar.c();
        cVar.a(i);
        d(c2);
        d(i);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(c.a listener) {
        ArrayList<sul> e;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e0c39a", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.c = listener;
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || (e = cVar.e()) == null) {
            return;
        }
        for (Object obj : e) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            ((sul) obj).a().setOnClickListener(new View$OnClickListenerC0944a(i, this));
            i = i2;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.b;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(0);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.b;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f22527a != null ? 49 : 0;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(String mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, mode})).booleanValue();
        }
        q.d(mode, "mode");
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null) {
            return false;
        }
        boolean b2 = cVar.b();
        cVar.a(q.a((Object) mode, (Object) "bulge"));
        if (b2 != cVar.b()) {
            e();
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e88f9", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i >= cVar.a()) {
            return false;
        }
        cVar.d().set(i, tabBarItemModel);
        e();
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), text})).booleanValue();
        }
        q.d(text, "text");
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar != null && i >= 0 && i < cVar.e().size()) {
            return cVar.e().get(i).a(text);
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar != null && i >= 0 && i < cVar.e().size()) {
            return cVar.e().get(i).b();
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i >= cVar.a() || i2 < 0 || i2 >= cVar.a() || i == i2) {
            return;
        }
        int c2 = cVar.c();
        if (c2 == i) {
            cVar.a(i2);
        } else if (c2 == i2) {
            cVar.a(i);
        }
        TabBarItem tabBarItem = cVar.d().get(i);
        q.b(tabBarItem, "tabBarState.tabBarItemModels[originIndex]");
        TabBarItem tabBarItem2 = cVar.d().get(i2);
        q.b(tabBarItem2, "tabBarState.tabBarItemModels[targetIndex]");
        cVar.d().set(i, tabBarItem2);
        cVar.d().set(i2, tabBarItem);
        e();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b4297a", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i > cVar.a() || cVar.a() >= 5) {
            return false;
        }
        if (i <= cVar.c()) {
            cVar.a(cVar.c() + 1);
        }
        cVar.d().add(i, tabBarItemModel);
        e();
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        com.taobao.themis.kernel.extension.page.tab.c cVar = this.d;
        if (cVar == null || i < 0 || i >= cVar.a() || i == cVar.c() || cVar.a() <= 2) {
            return false;
        }
        if (i < cVar.c()) {
            cVar.a(cVar.c() - 1);
        }
        cVar.d().remove(i);
        e();
        return true;
    }
}
