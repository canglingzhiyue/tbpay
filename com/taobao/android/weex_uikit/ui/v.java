package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.r;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINodeGroup f16149a;
    private boolean e;
    private r.a f;
    private List<UINode> b = new ArrayList(1);
    private List<UINode> d = new ArrayList(0);
    private List<UINode> c = new ArrayList(0);

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<UINode> f16151a;
        public List<UINode> b;
        public List<UINode> c;

        static {
            kge.a(684410783);
        }

        public a(List<UINode> list, List<UINode> list2, List<UINode> list3) {
            this.f16151a = new ArrayList();
            if (!list.isEmpty()) {
                this.f16151a = new ArrayList(list);
            }
            if (!list2.isEmpty()) {
                this.b = new ArrayList(list2);
            }
            if (!list3.isEmpty()) {
                this.c = new ArrayList(list3);
            }
        }
    }

    static {
        kge.a(-1739250504);
    }

    public static /* synthetic */ r.a b(v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("44096ff4", new Object[]{vVar}) : vVar.f;
    }

    public v(UINodeGroup uINodeGroup) {
        this.f16149a = uINodeGroup;
    }

    public void a(r.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9044c5ab", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{this, uINode});
            return;
        }
        this.b.add(uINode);
        this.d.add(uINode);
        this.e = true;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
    }

    public UINode a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("96475653", new Object[]{this, new Integer(i)}) : this.b.get(i);
    }

    public void a(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afac74d", new Object[]{this, new Integer(i), uINode});
            return;
        }
        List<UINode> list = this.b;
        if (i > list.size() || i < 0) {
            throw new IllegalStateException("AddChild parent index out of bounds, parent: " + toString() + ", index: " + i);
        }
        list.add(i, uINode);
        this.d.add(uINode);
        this.e = true;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        List<UINode> list = this.b;
        if (i >= list.size() || i < 0) {
            throw new IllegalStateException("RemoveChild from parent index out of bounds, parent: " + toString() + ", index: " + i);
        }
        UINode remove = list.remove(i);
        if (remove != null) {
            this.c.add(remove);
        }
        this.e = true;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            List<UINode> list = this.b;
            if (i >= list.size() || i < 0) {
                throw new IllegalStateException("moveChild from parent index out of bounds, parent: " + toString() + ", fromIndex: " + i);
            }
            UINode remove = list.remove(i);
            if (i < i2) {
                list.add(i2 - 1, remove);
            } else {
                list.add(i2, remove);
            }
            this.e = true;
        }
    }

    public int b(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("134606b2", new Object[]{this, uINode})).intValue() : this.b.indexOf(uINode);
    }

    public void a(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!this.e) {
        } else {
            this.e = false;
            if (this.f == null) {
                com.taobao.android.weex_framework.util.g.c("commitListener is null");
                return;
            }
            final a aVar = new a(this.b, this.c, this.d);
            this.c.clear();
            this.d.clear();
            list.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.v.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        v.b(v.this).a(aVar);
                    }
                }
            });
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97182827", new Object[]{this, aVar});
            return;
        }
        this.b.clear();
        if (aVar.f16151a != null) {
            this.b.addAll(aVar.f16151a);
        }
        if (aVar.b != null) {
            for (UINode uINode : aVar.b) {
                if (uINode != null) {
                    uINode.removedFromParent();
                }
            }
        }
        s layoutState = this.f16149a.getLayoutState();
        if (aVar.c != null && layoutState != null) {
            for (UINode uINode2 : aVar.c) {
                if (uINode2 != null) {
                    uINode2.setParentNode(this.f16149a);
                    if (!uINode2.isRoot()) {
                        layoutState.a(uINode2);
                    }
                }
            }
        }
        this.f16149a.notifyChildrenChange();
    }

    public void a(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60976104", new Object[]{this, vVar});
            return;
        }
        vVar.b.clear();
        vVar.b.addAll(this.b);
    }
}
