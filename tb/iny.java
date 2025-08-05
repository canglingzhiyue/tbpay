package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import java.util.ArrayList;
import java.util.List;
import tb.inz;
import tb.ioa;
import tb.iru;
import tb.isu;
import tb.iul;

/* loaded from: classes6.dex */
public abstract class iny<V extends View, IV extends ioa, IP extends inz, MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>> extends irr<V, IV, IP, iru<? extends a<? extends BaseSearchResult, ?>>, Void> implements iob<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private iul f29175a;
    private iul b;
    private iul c;
    private iul d;
    private final List<PartnerRecyclerView.a> e;
    private boolean f;

    static {
        kge.a(1007259585);
        kge.a(-1847183570);
    }

    public static /* synthetic */ Object ipc$super(iny inyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1885427910) {
            super.onChildAdded((iul) objArr[0]);
            return null;
        } else if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 299066517) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxPause();
            return null;
        }
    }

    public abstract iul a(irq irqVar);

    public abstract iul b(irq irqVar);

    public abstract iul c(irq irqVar);

    public abstract iul d(irq irqVar);

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "BaseListWidget";
    }

    public iny(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.e = new ArrayList();
        this.f = false;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            this.f29175a = a(I().a(((ioa) J()).e()).a(new iur() { // from class: tb.iny.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ioa) iny.this.J()).d(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        return;
                    }
                    throw new IllegalStateException("don't remove header");
                }
            }));
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            this.b = d(I().a(((ioa) J()).i()).a(new iur() { // from class: tb.iny.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ioa) iny.this.J()).e(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        return;
                    }
                    throw new IllegalStateException("don't remove footer");
                }
            }));
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.c = b(I().a(((ioa) J()).i()).a(new iur() { // from class: tb.iny.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ioa) iny.this.J()).e(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        return;
                    }
                    throw new IllegalStateException("don't remove footer");
                }
            }));
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.d = c(I().a(((ioa) J()).i()).a(new iur() { // from class: tb.iny.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ioa) iny.this.J()).e(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        return;
                    }
                    throw new IllegalStateException("don't remove footer");
                }
            }));
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!this.e.isEmpty()) {
            for (PartnerRecyclerView.a aVar : this.e) {
                aVar.n();
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void ao_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf69df8", new Object[]{this});
        } else if (!this.e.isEmpty()) {
            for (PartnerRecyclerView.a aVar : this.e) {
                aVar.ao_();
            }
        }
    }

    public void aq_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1604f36", new Object[]{this});
        } else if (!this.e.isEmpty()) {
            for (PartnerRecyclerView.a aVar : this.e) {
                aVar.aq_();
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!this.e.isEmpty()) {
            for (PartnerRecyclerView.a aVar : this.e) {
                aVar.c(i);
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        postEvent(isu.f.a(((ioa) J()).m()));
        if (this.e.isEmpty()) {
            return;
        }
        for (PartnerRecyclerView.a aVar : this.e) {
            aVar.o();
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        postEvent(isu.b.a(i));
        if (this.e.isEmpty()) {
            return;
        }
        for (PartnerRecyclerView.a aVar : this.e) {
            aVar.b(i);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.e.isEmpty()) {
            for (PartnerRecyclerView.a aVar : this.e) {
                aVar.k();
            }
        }
    }

    public void a(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac1099", new Object[]{this, irwVar, new Integer(i)});
        } else {
            ((inz) K()).a(irwVar, i);
        }
    }

    @Override // tb.iob
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            ((inz) K()).w();
        }
    }

    public RecyclerView B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("5b88e4db", new Object[]{this}) : ((ioa) J()).l();
    }

    public RecyclerView.Adapter C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("aea4a60f", new Object[]{this}) : ((inz) K()).t();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        ((inz) K()).B();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        ((inz) K()).C();
    }

    @Override // tb.iob
    public void a(itd<?, ?> itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
        } else {
            ((inz) K()).a(itdVar, i);
        }
    }

    @Override // tb.iob
    public void b(itd<?, ?> itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde7cce3", new Object[]{this, itdVar, new Integer(i)});
        } else {
            ((inz) K()).b(itdVar, i);
        }
    }

    public void b(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb89da38", new Object[]{this, irwVar, new Integer(i)});
        } else {
            ((inz) K()).b(irwVar, i);
        }
    }

    public void c(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d67a3d7", new Object[]{this, irwVar, new Integer(i)});
        } else {
            ((inz) K()).c(irwVar, i);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            ((inz) K()).H();
        }
    }

    @Override // tb.iob
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            ((inz) K()).I();
        }
    }

    @Override // tb.iob
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            ((inz) K()).J();
        }
    }

    @Override // tb.iut
    public void onChildAdded(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9ea73a", new Object[]{this, iulVar});
            return;
        }
        super.onChildAdded(iulVar);
        if (!(iulVar instanceof itd) || !this.f) {
            return;
        }
        ((itd) iulVar).h();
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        this.f = true;
        travel(new iul.a() { // from class: tb.iny.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f29180a = 0;

            @Override // tb.iul.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    this.f29180a++;
                }
            }

            @Override // tb.iul.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    this.f29180a--;
                }
            }

            @Override // tb.iul.a
            public boolean a(iul iulVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ee649e1c", new Object[]{this, iulVar})).booleanValue();
                }
                if (this.f29180a == 1 && (iulVar instanceof itd)) {
                    ((itd) iulVar).h();
                }
                return true;
            }
        });
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        this.f = false;
        travel(new iul.a() { // from class: tb.iny.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f29181a = 0;

            @Override // tb.iul.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    this.f29181a++;
                }
            }

            @Override // tb.iul.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    this.f29181a--;
                }
            }

            @Override // tb.iul.a
            public boolean a(iul iulVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ee649e1c", new Object[]{this, iulVar})).booleanValue();
                }
                if (this.f29181a == 1 && (iulVar instanceof itd)) {
                    ((itd) iulVar).i();
                }
                return true;
            }
        });
    }
}
