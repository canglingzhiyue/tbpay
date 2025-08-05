package com.taobao.android.icart.widget.touch;

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.List;
import tb.bbz;
import tb.goe;
import tb.gof;
import tb.goj;
import tb.gok;
import tb.gol;
import tb.gon;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends DragFloatLayer.a<String, IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CartRecyclerView c;
    private final bbz d;
    private final DragFloatLayer<String> e;
    private final TipsLineFollower f;
    private final List<IDMComponent> g;
    private final List<IDMComponent> h;
    private IDMComponent i;
    private RecyclerView.AdapterDataObserver j;
    private gol k;
    private goj l;
    private gon m;
    private gok o;
    private RecyclerView.ItemAnimator p;

    static {
        kge.a(-1240912457);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 803977334) {
            super.a((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != 1834281898) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((RecyclerView) objArr[0], objArr[1], objArr[2], objArr[3]);
            return null;
        }
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.a, com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public /* bridge */ /* synthetic */ void b(RecyclerView recyclerView, Object obj, Object obj2, int i, int i2) {
    }

    public static /* synthetic */ gol a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gol) ipChange.ipc$dispatch("62ecb4e9", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ CartRecyclerView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("8f7d8b57", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ RecyclerView.ItemAnimator c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ItemAnimator) ipChange.ipc$dispatch("44dcc9eb", new Object[]{bVar}) : bVar.p;
    }

    public static /* synthetic */ List d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2c153b31", new Object[]{bVar}) : bVar.h;
    }

    public static /* synthetic */ List e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e68adbb2", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ IDMComponent f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("a7deb598", new Object[]{bVar}) : bVar.i;
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public /* synthetic */ Object a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : b(i);
    }

    public b(bbz bbzVar, CartRecyclerView cartRecyclerView, DragFloatLayer<String> dragFloatLayer, TipsLineFollower tipsLineFollower) {
        super(bbzVar.x().p().l().a());
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.c = cartRecyclerView;
        this.d = bbzVar;
        this.e = dragFloatLayer;
        this.f = tipsLineFollower;
        this.p = this.c.getItemAnimator();
        c();
    }

    public boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        gon gonVar = this.m;
        return gonVar != null && gonVar.a(iDMComponent);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g.clear();
        this.h.clear();
        this.k.b();
        IDMComponent iDMComponent = this.i;
        if (iDMComponent != null) {
            iDMComponent.getFields().remove("_draging");
            this.i = null;
        }
        this.k.a(0, "", true);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        goe goeVar = new goe();
        this.k = goeVar.a(this.d, this.c, this.f, this.e);
        this.l = goeVar.b(this.d);
        this.m = goeVar.a(this.d);
        this.o = goeVar.c(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r19, com.taobao.android.ultron.common.model.IDMComponent r20) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.touch.b.a(android.view.View, com.taobao.android.ultron.common.model.IDMComponent):void");
    }

    public String b(int i) {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        int a2 = gof.a(this.c, i);
        List<C> list = this.f12915a;
        if (a2 >= 0 && a2 < list.size() && (iDMComponent = (IDMComponent) list.get(a2)) != null) {
            return iDMComponent.getKey();
        }
        return null;
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.c.getItemAnimator() == null) {
            this.c.setItemAnimator(this.p);
        }
        boolean a2 = this.l.a(this.c, i, i2);
        if (a2) {
            this.c.post(new Runnable() { // from class: com.taobao.android.icart.widget.touch.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this).a(true, null, null, -1, false);
                    }
                }
            });
        }
        return a2;
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : this.l.b(this.c, i, i2);
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.a, com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public void a(RecyclerView recyclerView, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af6258a", new Object[]{this, recyclerView, str, str2, new Integer(i), new Integer(i2)});
        } else {
            this.k.a(recyclerView, this.l, str, str2, i, i2);
        }
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.a, com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(recyclerView, i, i2);
        this.k.a(i2);
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.a, com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public void a(RecyclerView recyclerView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33615af4", new Object[]{this, recyclerView, str, str2, str3});
            return;
        }
        ArrayList arrayList = new ArrayList(this.h);
        ArrayList arrayList2 = new ArrayList(this.g);
        int a2 = this.k.a();
        int a3 = gof.a((List<IDMComponent>) this.f12915a, this.i);
        this.c.getAdapter().notifyItemChanged(a3);
        b();
        if (str == null) {
            UnifyLog.d("DragManager", "dragUniqueId null");
            return;
        }
        IDMComponent b = this.d.H().b(str);
        if (b == null) {
            UnifyLog.d("DragManager", "dragComponent null");
            return;
        }
        if (!(gof.a(b) || gof.d(b))) {
            UnifyLog.d("DragManager", "isOperateComponent false");
            return;
        }
        if (str3 != null) {
            this.o.a(b, this.d.H().b(str3), a2);
        } else {
            this.c.setItemAnimator(null);
            Point a4 = a();
            if (a4 != null && a4.x != a4.y) {
                z = true;
            }
            if (a2 != 0) {
                z = true;
            }
            if (z) {
                this.o.a(b, gof.a((List<IDMComponent>) this.f12915a, a4 == null ? a3 : gof.a(this.c, a4.y)), a2);
                if (!arrayList2.isEmpty()) {
                    if (a3 == this.f12915a.size() - 1) {
                        this.f12915a.addAll(arrayList2);
                    } else {
                        this.f12915a.addAll(a3 + 1, arrayList2);
                    }
                    this.c.getAdapter().notifyItemRangeInserted(a3 + 1, arrayList2.size());
                }
                if (!arrayList.isEmpty()) {
                    this.f12915a.addAll(a3, arrayList);
                    this.c.getAdapter().notifyItemRangeInserted(a3, arrayList.size());
                }
                gof.a(this.c, b, this.i, arrayList, arrayList2);
            } else {
                this.d.x().a(this.d.n().x());
            }
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.icart.widget.touch.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.b(b.this).getItemAnimator() != null) {
                } else {
                    b.b(b.this).setItemAnimator(b.c(b.this));
                }
            }
        });
        super.a(recyclerView, str, str2, str3);
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public boolean a(RecyclerView recyclerView, String str, boolean z) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e7d8f8", new Object[]{this, recyclerView, str, new Boolean(z)})).booleanValue();
        }
        if (!z || (findViewWithTag = this.c.findViewWithTag(h.VIEW_PROVIDER_RECOMMEND_CONTAINER)) == null) {
            return true;
        }
        return this.c.getBottom() - findViewWithTag.getTop() < this.d.x().u().getHeight();
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.a, com.taobao.android.icart.widget.touch.DragFloatLayer.b
    public void a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{this, recyclerView, str});
        } else {
            this.d.h().a(recyclerView, 0, 1, true);
        }
    }

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.AdapterDataObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1028021595);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1902625302:
                    super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case -1756146412:
                    super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                case -1389471316:
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
                    return null;
                case -238222724:
                    super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1882209744:
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        private a() {
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                return;
            }
            Point a2 = b.this.a();
            if (!b.d(b.this).isEmpty() || !b.e(b.this).isEmpty()) {
                for (int size = b.this.f12915a.size() - 1; size >= 0; size--) {
                    IDMComponent iDMComponent = (IDMComponent) b.this.f12915a.get(size);
                    if ((b.f(b.this) != iDMComponent && gof.a(b.d(b.this), iDMComponent) >= 0) || gof.a(b.e(b.this), iDMComponent) >= 0) {
                        b.this.f12915a.remove(size);
                    }
                }
            }
            if (a2 != null && a2.x != a2.y) {
                DragFloatLayer.a.a(b.this.f12915a, a2);
            }
            for (int size2 = b.this.f12915a.size() - 1; size2 >= 0; size2--) {
                IDMComponent iDMComponent2 = (IDMComponent) b.this.f12915a.get(size2);
                if (b.f(b.this) != null && TextUtils.equals(iDMComponent2.getKey(), b.f(b.this).getKey())) {
                    iDMComponent2.writeFields("_draging", "true");
                } else if (iDMComponent2.getFields() != null) {
                    iDMComponent2.getFields().remove("_draging");
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeChanged(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            } else {
                super.onItemRangeChanged(i, i2, obj);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeInserted(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeRemoved(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                super.onItemRangeMoved(i, i2, i3);
            }
        }
    }
}
