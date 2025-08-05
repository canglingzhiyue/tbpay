package com.taobao.android.icart.widget.touch.tips;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.gof;
import tb.goj;
import tb.gol;
import tb.gom;
import tb.goz;
import tb.kge;

/* loaded from: classes5.dex */
public class DragTips implements gol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAST_BUNDLE_STATE_IDLE = 0;
    public static final int LAST_BUNDLE_STATE_JOIN = 1;
    public static final int LAST_BUNDLE_STATE_MERGE = 3;
    public static final int LAST_BUNDLE_STATE_ONLY_TIP = 4;
    public static final int LAST_BUNDLE_STATE_REMOVE = 2;
    public final TipsLineFollower b;
    public RecyclerView c;
    public IDMComponent e;
    private DragFloatLayer f;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f12919a = new ArrayList();
    public int d = 0;

    /* loaded from: classes5.dex */
    public @interface BundleState {
    }

    static {
        kge.a(-1482108383);
        kge.a(-974263230);
    }

    public static /* synthetic */ DragFloatLayer a(DragTips dragTips) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DragFloatLayer) ipChange.ipc$dispatch("c127b042", new Object[]{dragTips}) : dragTips.f;
    }

    public DragTips(RecyclerView recyclerView, TipsLineFollower tipsLineFollower, DragFloatLayer dragFloatLayer) {
        this.b = tipsLineFollower;
        this.c = recyclerView;
        this.f = dragFloatLayer;
    }

    @Override // tb.gol
    public void a(RecyclerView recyclerView, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870e9345", new Object[]{this, recyclerView, iDMComponent, new Integer(i)});
        } else if (gof.a(iDMComponent) && gof.c(gof.a(recyclerView), iDMComponent, i)) {
            this.b.setShowInCardUp(new a());
        } else {
            this.b.setShowInCardUp(null);
        }
    }

    @Override // tb.gol
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a(0, "", true);
        List<IDMComponent> a2 = gof.a(this.c);
        IDMComponent iDMComponent = a2.get(i);
        if (gof.a(iDMComponent) && gof.c(a2, iDMComponent, i)) {
            this.b.setShowInCardUp(new a());
        } else {
            this.b.setShowInCardUp(null);
        }
    }

    @Override // tb.gol
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.e = iDMComponent;
        }
    }

    @Override // tb.gol
    public void a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = i;
        int i2 = this.d;
        if (i2 == 0) {
            this.b.setData("", z, false);
        } else if (i2 == 1) {
            this.b.setData(str, z, false);
        } else if (i2 == 2) {
            this.b.setData(str, z, false);
        } else if (i2 == 3) {
            this.b.setData(str, z, false);
        } else if (i2 != 4) {
        } else {
            this.b.setData(str, z, true);
        }
    }

    @Override // tb.gol
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    @Override // tb.gol
    public void a(RecyclerView recyclerView, goj gojVar, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3d2fb8", new Object[]{this, recyclerView, gojVar, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        List<IDMComponent> a2 = gof.a(recyclerView);
        if (i < 0) {
            return;
        }
        int dragPos = this.f.getDragPos();
        IDMComponent iDMComponent = a2.get(dragPos);
        if (gof.a(iDMComponent)) {
            if (dragPos <= 0 || dragPos >= a2.size() - 1) {
                return;
            }
            a(a2, iDMComponent, i > dragPos, dragPos, i);
        } else if (!gof.d(iDMComponent)) {
        } else {
            a(gojVar, a2, iDMComponent, dragPos, i);
        }
    }

    public void a(List<IDMComponent> list, IDMComponent iDMComponent, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f764b9", new Object[]{this, list, iDMComponent, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (i2 < 0 || i2 >= list.size()) {
        } else {
            IDMComponent a2 = gof.a(list, i);
            IDMComponent iDMComponent2 = list.get(i2);
            if (iDMComponent == null || iDMComponent2 == null) {
                return;
            }
            a(false, iDMComponent, iDMComponent2, i, false);
            gom a3 = goz.a(iDMComponent, a2, iDMComponent2);
            if (a3 == null) {
                return;
            }
            a3.a(this, z, false, a2, iDMComponent2, iDMComponent);
        }
    }

    public void a(goj gojVar, List<IDMComponent> list, IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799feacd", new Object[]{this, gojVar, list, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (i2 < 0 || i2 >= list.size()) {
        } else {
            IDMComponent iDMComponent2 = list.get(i2);
            if (iDMComponent == null || iDMComponent2 == null) {
                return;
            }
            goz.a().a(this, false, gojVar.a(this.c, i, i2), null, iDMComponent2, iDMComponent);
        }
    }

    @Override // tb.gol
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f12919a.isEmpty()) {
        } else {
            this.f12919a.clear();
        }
    }

    @Override // tb.gol
    public IDMComponent c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("f7d9f66e", new Object[]{this}) : this.e;
    }

    @Override // tb.gol
    public List<IDMComponent> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f12919a;
    }

    @Override // tb.gol
    public void a(boolean z, IDMComponent iDMComponent, IDMComponent iDMComponent2, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf4ee1d", new Object[]{this, new Boolean(z), iDMComponent, iDMComponent2, new Integer(i), new Boolean(z2)});
            return;
        }
        if (!z && (this.f12919a.isEmpty() || gof.c(this.f12919a.get(0), iDMComponent2))) {
            z3 = false;
        }
        if (z3) {
            b();
        }
        if (z || !z2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<IDMComponent> k = gof.k(iDMComponent2);
        if (k != null) {
            arrayList.addAll(k);
        }
        this.f12919a.addAll(arrayList);
    }

    @Override // tb.gol
    public List<IDMComponent> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : gof.a(this.c);
    }

    /* loaded from: classes5.dex */
    public class a implements TipsLineFollower.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(539526164);
            kge.a(157113245);
        }

        private a() {
        }

        @Override // com.taobao.android.icart.widget.touch.TipsLineFollower.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            List<IDMComponent> a2 = gof.a(DragTips.this.c);
            DragTips dragTips = DragTips.this;
            dragTips.a(a2, a2.get(DragTips.a(DragTips.this).getDragPos()), z, DragTips.a(dragTips).getDragPos(), DragTips.a(DragTips.this).getEnterPos());
        }
    }
}
