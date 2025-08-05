package tb;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.widget.Space;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.utils.f;
import com.taobao.themis.utils.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes9.dex */
public final class suk implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f33906a;
    private List<sul> b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private final ArrayList<TabBarItem> g;
    private c.a h;
    private final Context i;

    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f33907a;
        public final /* synthetic */ suk b;

        public a(int i, suk sukVar) {
            this.f33907a = i;
            this.b = sukVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c.a a2 = suk.a(this.b);
            if (a2 == null) {
                return;
            }
            a2.a(this.f33907a);
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

    static {
        kge.a(-619006486);
        kge.a(1289404388);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b4297a", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public suk(Context context) {
        q.d(context, "context");
        this.i = context;
        this.b = new ArrayList();
        this.c = -1;
        this.e = -1;
        this.f = -1;
        this.g = new ArrayList<>();
    }

    public static final /* synthetic */ c.a a(suk sukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("2ef666f9", new Object[]{sukVar}) : sukVar.h;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : c.b.a(this);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b8f1b", new Object[]{this, tabBar});
            return;
        }
        q.d(tabBar, "tabBar");
        List<TabBarItem> items = tabBar.getItems();
        if (items != null) {
            this.g.addAll(items);
        }
        this.d = tabBar.isBulge();
        this.e = this.d ? this.g.size() / 2 : -1;
        this.f = this.g.size();
        if (this.f < 2) {
            if (!f.a(this.i)) {
                return;
            }
            Toast.makeText(this.i, "⚠️ 当配置 >= 2 的 Items 时 TabBar 才会展示", 0).show();
            return;
        }
        RelativeLayout a2 = a(this.i, this.g);
        if (tabBar.getInvisible()) {
            i = 8;
        }
        a2.setVisibility(i);
        t tVar = t.INSTANCE;
        this.f33906a = a2;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f33906a;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.c;
        if (i2 >= 0 && i2 < this.b.size()) {
            this.b.get(i2).a(false);
        }
        if (i >= 0 && i < this.b.size()) {
            this.b.get(i).a(true);
        }
        this.c = i;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.f33906a;
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
        RelativeLayout relativeLayout = this.f33906a;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f33906a != null ? 49 : 0;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(String mode) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, mode})).booleanValue();
        }
        q.d(mode, "mode");
        if ((!this.d && q.a((Object) mode, (Object) "bulge") && ((i = this.f) == 3 || i == 5)) || (this.d && (!q.a((Object) mode, (Object) "bulge")))) {
            this.d = q.a((Object) mode, (Object) "bulge");
            this.e = this.d ? (this.f - 1) / 2 : -1;
            this.b.clear();
            RelativeLayout relativeLayout = this.f33906a;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                a(relativeLayout, this.i, this.g);
                int i2 = this.c;
                if (i2 >= 0 && i2 < this.b.size()) {
                    this.b.get(this.c).a(true);
                }
            }
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(c.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e0c39a", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.h = listener;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e88f9", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        if (i < 0 || i >= this.b.size()) {
            return false;
        }
        TabBarItem tabBarItem = this.g.get(i);
        q.b(tabBarItem, "tabBarItems[index]");
        TabBarItem tabBarItem2 = tabBarItem;
        TabBarItem tabBarItem3 = new TabBarItem();
        String pageId = tabBarItemModel.getPageId();
        if (pageId == null) {
            pageId = tabBarItem2.getPageId();
        }
        tabBarItem3.setPageId(pageId);
        String iconNormal = tabBarItemModel.getIconNormal();
        if (iconNormal == null) {
            iconNormal = tabBarItem2.getIconNormal();
        }
        tabBarItem3.setIconNormal(iconNormal);
        String iconSelected = tabBarItemModel.getIconSelected();
        if (iconSelected == null) {
            iconSelected = tabBarItem2.getIconSelected();
        }
        tabBarItem3.setIconSelected(iconSelected);
        QueryPass queryPass = tabBarItemModel.getQueryPass();
        if (queryPass == null) {
            queryPass = tabBarItem2.getQueryPass();
        }
        tabBarItem3.setQueryPass(queryPass);
        this.g.set(i, tabBarItem3);
        sul sulVar = this.b.get(i);
        sulVar.a(tabBarItem3);
        if (i == this.c) {
            z = true;
        }
        sulVar.a(z);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), text})).booleanValue();
        }
        q.d(text, "text");
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i).a(text);
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i).b();
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i >= this.b.size() || i2 < 0 || i2 >= this.b.size()) {
        } else {
            TabBarItem d = this.b.get(i).d();
            TabBarItem d2 = this.b.get(i2).d();
            int i3 = this.c;
            if (i3 == i) {
                this.c = i2;
            } else if (i3 == i2) {
                this.c = i;
            }
            a(i, d2);
            a(i2, d);
        }
    }

    private final RelativeLayout a(Context context, List<TabBarItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("a6966aa1", new Object[]{this, context, list});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        a(relativeLayout, context, list);
        return relativeLayout;
    }

    private final void a(RelativeLayout relativeLayout, Context context, List<TabBarItem> list) {
        Integer num;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990c6b81", new Object[]{this, relativeLayout, context, list});
            return;
        }
        int generateViewId = View.generateViewId();
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        t tVar = t.INSTANCE;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(generateViewId);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(0);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(b.INSTANCE);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p.b();
            }
            a(linearLayout, context, (TabBarItem) obj, i2 == this.e);
            i2 = i3;
        }
        relativeLayout.addView(linearLayout);
        View view = new View(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, k.a(context, 1.0f));
        layoutParams2.addRule(2, generateViewId);
        t tVar2 = t.INSTANCE;
        view.setLayoutParams(layoutParams2);
        try {
            num = Integer.valueOf(Color.parseColor("#e9e9e9"));
        } catch (Exception unused) {
            num = -7829368;
        }
        view.setBackgroundColor(num.intValue());
        relativeLayout.addView(view);
        if (this.d) {
            View a2 = this.b.get(this.e).a();
            int a3 = k.a(context, 63);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams3.addRule(2, generateViewId);
            layoutParams3.addRule(14);
            layoutParams3.setMargins(0, 0, 0, -k.a(context, 49));
            t tVar3 = t.INSTANCE;
            a2.setLayoutParams(layoutParams3);
            relativeLayout.addView(a2);
        }
        for (Object obj2 : this.b) {
            int i4 = i + 1;
            if (i < 0) {
                p.b();
            }
            ((sul) obj2).a().setOnClickListener(new a(i, this));
            i = i4;
        }
    }

    private final void a(LinearLayout linearLayout, Context context, TabBarItem tabBarItem, boolean z) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eeec60d", new Object[]{this, linearLayout, context, tabBarItem, new Boolean(z)});
            return;
        }
        if (z) {
            a2 = k.a(context, 63);
        } else {
            a2 = k.a(context, 49);
        }
        int a3 = z ? k.a(context, 49) : a2;
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(0, -1, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a3);
        sul sulVar = new sul(tabBarItem, context, z);
        this.b.add(sulVar);
        if (z) {
            linearLayout.addView(new Space(context), layoutParams);
        } else {
            linearLayout.addView(sulVar.a(), layoutParams);
        }
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(0, -1, 1.0f));
    }
}
