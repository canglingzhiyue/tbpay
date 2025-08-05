package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<UINode> f16147a;
    private static final Comparator<UINode> b;
    private static final Comparator<UINode> c;
    private static final Comparator<UINode> d;
    private final ArrayList<UINode> e = new ArrayList<>(1);
    private final ArrayList<UINode> f = new ArrayList<>(1);
    private final ArrayList<UINode> g = new ArrayList<>(1);
    private final ArrayList<UINode> h = new ArrayList<>(1);
    private boolean i = true;
    private boolean j = true;
    private i k;

    static {
        kge.a(948616720);
        f16147a = new Comparator<UINode>() { // from class: com.taobao.android.weex_uikit.ui.s.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, uINode, uINode2})).intValue() : a(uINode, uINode2);
            }

            public int a(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae81b5b", new Object[]{this, uINode, uINode2})).intValue();
                }
                int i = uINode.getGlobalVisibleRect().top;
                int i2 = uINode2.getGlobalVisibleRect().top;
                if (i != i2) {
                    return i - i2;
                }
                return 0;
            }
        };
        b = new Comparator<UINode>() { // from class: com.taobao.android.weex_uikit.ui.s.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, uINode, uINode2})).intValue() : a(uINode, uINode2);
            }

            public int a(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae81b5b", new Object[]{this, uINode, uINode2})).intValue();
                }
                int i = uINode.getGlobalVisibleRect().bottom;
                int i2 = uINode2.getGlobalVisibleRect().bottom;
                if (i != i2) {
                    return i - i2;
                }
                return 0;
            }
        };
        c = new Comparator<UINode>() { // from class: com.taobao.android.weex_uikit.ui.s.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, uINode, uINode2})).intValue() : a(uINode, uINode2);
            }

            public int a(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae81b5b", new Object[]{this, uINode, uINode2})).intValue();
                }
                int i = uINode.getGlobalVisibleRect().left;
                int i2 = uINode2.getGlobalVisibleRect().left;
                if (i != i2) {
                    return i - i2;
                }
                return 0;
            }
        };
        d = new Comparator<UINode>() { // from class: com.taobao.android.weex_uikit.ui.s.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, uINode, uINode2})).intValue() : a(uINode, uINode2);
            }

            public int a(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae81b5b", new Object[]{this, uINode, uINode2})).intValue();
                }
                int i = uINode.getGlobalVisibleRect().right;
                int i2 = uINode2.getGlobalVisibleRect().right;
                if (i != i2) {
                    return i - i2;
                }
                return 0;
            }
        };
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60917831", new Object[]{this, iVar});
        } else {
            this.k = iVar;
        }
    }

    public i a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("96380637", new Object[]{this}) : this.k;
    }

    public void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{this, uINode});
            return;
        }
        uINode.added = true;
        this.e.add(uINode);
        if (!this.k.d()) {
            return;
        }
        this.f.add(uINode);
        this.g.add(uINode);
        this.h.add(uINode);
        this.i = true;
        h();
    }

    public void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134606bf", new Object[]{this, uINode});
            return;
        }
        uINode.added = false;
        this.e.remove(uINode);
        if (this.k.d()) {
            this.f.remove(uINode);
            this.g.remove(uINode);
            this.h.remove(uINode);
        }
        h();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e.size();
    }

    public UINode a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("96475653", new Object[]{this, new Integer(i)}) : this.e.get(i);
    }

    public List<UINode> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.e;
    }

    public List<UINode> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f;
    }

    public List<UINode> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.g;
    }

    public List<UINode> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.h;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.k.d() || !this.i) {
        } else {
            this.i = false;
            if (this.e.size() <= 1) {
                return;
            }
            Collections.sort(this.e, f16147a);
            Collections.sort(this.f, b);
            Collections.sort(this.g, c);
            Collections.sort(this.h, d);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.j = true;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.j;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.j = false;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.i = true;
        }
    }
}
