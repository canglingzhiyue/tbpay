package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.odx;
import tb.oec;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class c extends Component<BrowserViewPager, C0841c> implements ViewPager.OnPageChangeListener, com.taobao.tao.flexbox.layoutmanager.core.ae, com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, com.taobao.tao.flexbox.layoutmanager.core.z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;

    /* renamed from: a  reason: collision with root package name */
    private a f20121a;
    private long c;
    private long d;
    private int b = 0;
    private boolean e = false;
    private b f = new b();
    private List<ScrollChangeListener> g = new ArrayList();

    static {
        kge.a(553835952);
        kge.a(1848919473);
        kge.a(328095190);
        kge.a(863201962);
        kge.a(-1420926486);
        kge.a(-1353647536);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1664931440:
                super.handleChildAdded((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -670057321:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -486998538:
                super.handleChildMoved((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[3]);
                return null;
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(BrowserViewPager browserViewPager, C0841c c0841c, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, browserViewPager, c0841c, map, new Boolean(z)});
        } else {
            a(browserViewPager, c0841c, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.tao.flexbox.layoutmanager.component.c$c] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ C0841c mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : b();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.taobao.tao.flexbox.layoutmanager.component.BrowserViewPager] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ BrowserViewPager onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ long a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c481f729", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.doubleClickTimeStamp = j;
        return j;
    }

    public static /* synthetic */ b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bb8d9d0", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c481f374", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.b(i);
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4823349", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.e = z;
        return z;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("7c5a2d0e", new Object[]{cVar}) : cVar.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("34e6ed6d", new Object[]{cVar}) : cVar.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ed73adcc", new Object[]{cVar}) : cVar.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("a6006e2b", new Object[]{cVar}) : cVar.node;
    }

    public static /* synthetic */ boolean f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8aa9d7b8", new Object[]{cVar})).booleanValue() : cVar.e;
    }

    public static /* synthetic */ long g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3fe2ce9", new Object[]{cVar})).longValue() : cVar.doubleClickTimeStamp;
    }

    public static /* synthetic */ View.OnClickListener h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("1b2d281f", new Object[]{cVar}) : cVar.clickListener;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("88336fa7", new Object[]{cVar}) : cVar.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("40c03006", new Object[]{cVar}) : cVar.node;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            scrollToPositionWithNumber(i, z, i2, 0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (this.view == 0) {
        } else {
            ((BrowserViewPager) this.view).setCurrentItem(i, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue() : this.node.R();
    }

    public void a(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6b6ab9", new Object[]{this, scrollChangeListener});
        } else if (this.g.contains(scrollChangeListener)) {
        } else {
            this.g.add(scrollChangeListener);
        }
    }

    public void b(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3944cfa", new Object[]{this, scrollChangeListener});
        } else {
            this.g.remove(scrollChangeListener);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (ScrollChangeListener scrollChangeListener : this.g) {
            scrollChangeListener.onScrollStateChanged(i, 0);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20130a = 0;
        public int b = -1;
        public int c = 0;
        public int d = -1;
        public int e = 0;
        public Set f = new HashSet();

        static {
            kge.a(-162295786);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f20130a = 0;
            this.b = -1;
            this.c = 0;
            this.d = -1;
            this.e = 0;
            this.f.clear();
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f20130a != 0;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f.f20130a |= i;
        if ((i & 1) != 0) {
            if (this.f.b == -1) {
                this.f.b = i2;
            }
            this.f.c++;
        } else if ((i & 2) == 0) {
            if ((i & 4) == 0) {
                return;
            }
            this.f.f.add(Integer.valueOf(i2));
        } else {
            if (this.f.d == -1) {
                this.f.d = i2;
            }
            this.f.e++;
        }
    }

    public BrowserViewPager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserViewPager) ipChange.ipc$dispatch("c426e9e0", new Object[]{this, context});
        }
        BrowserViewPager b2 = ogu.b(context);
        b2.addOnPageChangeListener(this);
        if ("preload".equals(((C0841c) this.viewParams).e)) {
            b2.setOffscreenPageLimit(2);
        } else {
            b2.setOffscreenPageLimit(1);
        }
        this.f20121a = new a();
        this.d = System.currentTimeMillis();
        if (((C0841c) this.viewParams).i) {
            b2.enableEdgeEffect();
        }
        ab.e S = this.node.S();
        if (S != null) {
            S.a("onpageselected", this);
        }
        return b2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.f20121a;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.view != 0) {
            ((BrowserViewPager) this.view).setAdapter(null);
            ((BrowserViewPager) this.view).removeOnPageChangeListener(this);
            ogu.a((BrowserViewPager) this.view);
        }
        ab.e S = this.node.S();
        if (S != null) {
            S.b("onpageselected", this);
        }
        super.detach(z);
        if (this.node.d == null) {
            return;
        }
        for (int i = 0; i < this.node.d.size(); i++) {
            this.node.d.get(i).d(z);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        e();
        c(i);
        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.a(c.this, i);
                }
            }
        });
        this.b = i;
        this.c = System.currentTimeMillis();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(this.b));
        com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(this.b);
        if (b2 == null) {
            return;
        }
        hashMap.put("type", "item");
        sendMessage(Component.MSG_FLAG_DISAPPEAR, b2, "onwilldisappear", null, hashMap, null);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(i);
        if (b2 == null) {
            return;
        }
        hashMap.put("type", "item");
        sendMessage(130, b2, "onwillappear", null, hashMap, null);
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldIndex", Integer.valueOf(this.b));
        hashMap.put("newIndex", Integer.valueOf(i));
        hashMap.put("pageHeight", Integer.valueOf(this.measureResult.b));
        hashMap.put("group", ((C0841c) this.viewParams).b);
        if ("browserex".equals(this.name)) {
            sendMessage(getNode(), "onpageselected", null, hashMap, null);
        } else {
            sendMessage(getNode(), "onbrowserselected", null, hashMap, null);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        postMessage(this.node, "onscrollstatechanged", ((C0841c) this.viewParams).f, hashMap, null);
        if (i == 0) {
            if (((C0841c) this.viewParams).h != null) {
                postMessage(this.node, "onenddragging", null, null, null);
            }
        } else if (i == 1 && ((C0841c) this.viewParams).g != null) {
            postMessage(this.node, "onbegindragging", null, null, null);
        }
        a(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        super.handleChildAdded(aaVar, i, aaVar2);
        a(1, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        super.handleChildDeleted(aaVar, i, aaVar2);
        a(2, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
            return;
        }
        super.handleChildMoved(aaVar, i, i2, aaVar2);
        a(8, i);
    }

    public void a(BrowserViewPager browserViewPager, C0841c c0841c, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a4fbff", new Object[]{this, browserViewPager, c0841c, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(browserViewPager, c0841c, map, z);
        ((BrowserViewPager) this.view).setEdgePan(((C0841c) this.viewParams).j);
        ((BrowserViewPager) this.view).setEnableSwipe(((C0841c) this.viewParams).k);
        a(f());
        this.f.a();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f20121a.a(this.node.d);
    }

    public com.taobao.tao.flexbox.layoutmanager.core.aa a() {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("fcfaae56", new Object[]{this});
        }
        if (this.view != 0 && (currentItem = ((BrowserViewPager) this.view).getCurrentItem()) >= 0 && currentItem < this.node.d.size()) {
            return this.node.d.get(currentItem);
        }
        return null;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (((BrowserViewPager) this.view).getAdapter() == null) {
            ((BrowserViewPager) this.view).setAdapter(this.f20121a);
            ((BrowserViewPager) this.view).setCurrentItem(((C0841c) this.viewParams).f20131a, ((C0841c) this.viewParams).l);
            com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(((C0841c) this.viewParams).f20131a);
            if (b2 == null) {
                return;
            }
            a.a(this.f20121a, (ViewGroup) this.view, null, b2);
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.aa b3 = this.node.b(((BrowserViewPager) this.view).getCurrentItem());
            if (b3 != null) {
                boolean n = b3.n();
                if (n) {
                    b3.c(b3.J().G().f20361a, b3.J().G().b);
                }
                if (!b3.w() || n || b3.s()) {
                    b3.b(((BrowserViewPager) this.view).getContext());
                }
            }
            if (!z) {
                return;
            }
            ((BrowserViewPager) this.view).setCurrentItem(((C0841c) this.viewParams).f20131a, ((C0841c) this.viewParams).l);
        }
    }

    public C0841c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0841c) ipChange.ipc$dispatch("e7985535", new Object[]{this}) : new C0841c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, final String str, String str2, final Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        final com.taobao.tao.flexbox.layoutmanager.core.aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str.equals("onpageappear") || str.equals("onwillappear") || str.equals("onpagedisappear") || str.equals("onwilldisappear")) {
            if (this.view != 0 && (b2 = aaVar2.b(((BrowserViewPager) this.view).getCurrentItem())) != null) {
                if (b2.w()) {
                    sendMessage(34, b2, str, null, map, null);
                } else {
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.this.sendMessage(34, b2, str, null, map, null);
                            }
                        }
                    });
                }
            }
            return !str.equals("onwilldisappear") && !str.equals("onwillappear");
        }
        if (str.equals("onpageselected") && odx.a(oec.a(map.get("group"), (String[]) null), ((C0841c) this.viewParams).b) && aaVar != getNode()) {
            int intValue = ((Integer) map.get("newIndex")).intValue();
            if (this.view != 0) {
                ((BrowserViewPager) this.view).setCurrentItem(intValue, ((C0841c) this.viewParams).l);
            }
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean sendViewAppearForAdd(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfadc3ad", new Object[]{this, aaVar})).booleanValue();
        }
        return aaVar == this.node.b(this.view != 0 ? ((BrowserViewPager) this.view).getCurrentItem() : 0);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(final aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("onwillappear")) {
            final com.taobao.tao.flexbox.layoutmanager.core.aa b2 = this.node.b(((BrowserViewPager) this.view).getCurrentItem());
            if (b2 != null) {
                if (b2.w()) {
                    sendMessage(130, b2, eVar.c, null, eVar.d, null);
                } else {
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.this.sendMessage(130, b2, eVar.c, null, eVar.d, null);
                            }
                        }
                    });
                }
            }
            return false;
        } else if (eVar.c.equals("onwilldisappear")) {
            final com.taobao.tao.flexbox.layoutmanager.core.aa b3 = this.node.b(((BrowserViewPager) this.view).getCurrentItem());
            if (b3 != null) {
                if (b3.w()) {
                    sendMessage(Component.MSG_FLAG_DISAPPEAR, b3, eVar.c, null, eVar.d, null);
                } else {
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.this.sendMessage(Component.MSG_FLAG_DISAPPEAR, b3, eVar.c, null, eVar.d, null);
                            }
                        }
                    });
                }
            }
            return false;
        } else {
            return onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
        }
    }

    /* loaded from: classes8.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b = 0;

        static {
            kge.a(-1188004709);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public a() {
        }

        public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(a aVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("40e43255", new Object[]{aVar, aaVar, new Integer(i)}) : aVar.a(aaVar, i);
        }

        public static /* synthetic */ void a(a aVar, ViewGroup viewGroup, ViewGroup viewGroup2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13479338", new Object[]{aVar, viewGroup, viewGroup2, aaVar});
            } else {
                aVar.a(viewGroup, viewGroup2, aaVar);
            }
        }

        public boolean a(List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
            }
            int size = list != null ? list.size() : 0;
            boolean b = c.a(c.this).b();
            if (size == this.b && !b) {
                return false;
            }
            this.b = size;
            notifyDataSetChanged();
            return true;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (c.b(c.this).d != null) {
                return c.c(c.this).d.size();
            }
            return 0;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa b = c.d(c.this).b(i);
            if (b == null) {
                return;
            }
            a(viewGroup, (ViewGroup) obj, b);
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout);
            final com.taobao.tao.flexbox.layoutmanager.core.aa b = c.e(c.this).b(i);
            if (b != null) {
                a(viewGroup, frameLayout, b);
                frameLayout.setTag(b);
                if (i == c.this.getView().getCurrentItem() && !c.f(c.this)) {
                    c.a(c.this, true);
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.a(c.this, i);
                            }
                        }
                    });
                }
                if (b.x() != null && !b.I().hasComponentClickTouchListener()) {
                    final GestureDetector gestureDetector = new GestureDetector(frameLayout.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public boolean onDown(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                            }
                            return true;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public void onLongPress(MotionEvent motionEvent) {
                            String a2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                                return;
                            }
                            com.taobao.tao.flexbox.layoutmanager.core.aa a3 = a.a(a.this, b, 1);
                            if (a3 == null || (a2 = oec.a(a3.e("onlongpress"), (String) null)) == null) {
                                return;
                            }
                            c.this.sendMessage(a3, "onlongpress", a2, null, null);
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onDoubleTap(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                            }
                            com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a.a(a.this, b, 2);
                            if (a2 != null) {
                                String a3 = oec.a(a2.e("ondblclick"), (String) null);
                                if (a3 != null) {
                                    c.this.sendMessage(a2, "ondblclick", a3, null, null);
                                }
                                c.a(c.this, System.currentTimeMillis());
                            }
                            return a2 != null;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                            }
                            com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a.a(a.this, b, 0);
                            if (a2 != null && System.currentTimeMillis() - c.g(c.this) > ViewConfiguration.getDoubleTapTimeout() * 2) {
                                if (a2.e("trackinfo") != null) {
                                    c.this.sendMessage(a2, "click", null, null, null);
                                }
                                String a3 = oec.a(a2.e("onclick"), (String) null);
                                if (a3 != null) {
                                    c.this.sendMessage(a2, "onclick", a3, null, null);
                                }
                            }
                            return a2 != null;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public boolean onSingleTapUp(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue() : c.h(c.this) != null;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue() : a.a(a.this, b, 2) != null;
                        }
                    });
                    frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.c.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : gestureDetector.onTouchEvent(motionEvent);
                        }
                    });
                }
            }
            return frameLayout;
        }

        private com.taobao.tao.flexbox.layoutmanager.core.aa a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("d7504beb", new Object[]{this, aaVar, new Integer(i)});
            }
            while (true) {
                aaVar = aaVar.J();
                if (aaVar == null) {
                    return null;
                }
                if (i != 0) {
                    if (i == 1) {
                        if (aaVar.e("onlongpress") != null) {
                            return aaVar;
                        }
                    } else if (i == 2 && aaVar.e("ondblclick") != null) {
                        return aaVar;
                    }
                } else if (aaVar.e("onclick") != null) {
                    return aaVar;
                }
            }
        }

        private void a(ViewGroup viewGroup, ViewGroup viewGroup2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            ViewGroup viewGroup3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf139f4e", new Object[]{this, viewGroup, viewGroup2, aaVar});
                return;
            }
            boolean n = aaVar.n();
            if (n) {
                aaVar.c(c.i(c.this).G().f20361a, c.j(c.this).G().b);
            }
            if (!aaVar.w() || n || aaVar.s()) {
                aaVar.b(viewGroup.getContext());
            }
            if (viewGroup2 == null || viewGroup2 == (viewGroup3 = (ViewGroup) aaVar.x().getParent())) {
                return;
            }
            viewGroup2.removeAllViews();
            if (viewGroup3 != null) {
                viewGroup3.removeView(aaVar.x());
            }
            viewGroup2.addView(aaVar.x());
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            View view = (View) obj;
            viewGroup.removeView(view);
            if (!(view.getTag() instanceof com.taobao.tao.flexbox.layoutmanager.core.aa)) {
                return;
            }
            view.setTag(null);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (((BrowserViewPager) this.view).getCurrentItem() == this.node.d.size() - 1) {
            long max = Math.max(this.d, this.c);
            if (((C0841c) this.viewParams).c > 0 && System.currentTimeMillis() - max < ((C0841c) this.viewParams).c) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : ((BrowserViewPager) this.view).getCurrentItem() == 0 && ((C0841c) this.viewParams).d > 0 && System.currentTimeMillis() - this.c < ((long) ((C0841c) this.viewParams).d);
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.c$c  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0841c extends ScrollViewComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_FAST = "fast";
        public static final String MODE_NONE = "none";
        public static final String MODE_PRELOAD = "preload";
        public String[] b;
        public int c;
        public int d;
        public String f;
        public String g;
        public String h;

        /* renamed from: a  reason: collision with root package name */
        public int f20131a = 0;
        public String e = "preload";
        public boolean i = true;
        public int j = 0;
        public boolean k = true;
        public boolean l = true;

        static {
            kge.a(120120368);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
            if (r9.equals("right-edgepan-delay") != false) goto L11;
         */
        @Override // com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.c, tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.c.C0841c.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        if (((str.hashCode() == -980170895 && str.equals("scrollToPosition")) ? (char) 0 : (char) 65535) != 0) {
            z = false;
        } else {
            int a2 = oec.a(jSONObject.get("index"), -1);
            int a3 = oec.a(jSONObject.get("jumpNumber"), 0);
            boolean a4 = oec.a(jSONObject.get("animated"), true);
            String a5 = oec.a(jSONObject.get("position"), "none");
            if ("middle".equals(a5)) {
                i = 1;
            } else if (!"bottom".equals(a5)) {
                i = 0;
            }
            scrollToPositionWithNumber(a2, a4, i, a3);
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }
}
