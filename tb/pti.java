package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class pti extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<WeakReference<pti>> f32878a;
    private final ViewGroup b;
    private final FluidContext c;
    private aa d;
    private TNodeView e;
    private TNodeView.b k;

    static {
        kge.a(-1214028303);
    }

    public static /* synthetic */ Object ipc$super(pti ptiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ViewGroup a(pti ptiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("1e4f26e2", new Object[]{ptiVar}) : ptiVar.b;
    }

    public static /* synthetic */ aa a(pti ptiVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("b92cc723", new Object[]{ptiVar, aaVar});
        }
        ptiVar.d = aaVar;
        return aaVar;
    }

    public static /* synthetic */ void b(pti ptiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ca1c54", new Object[]{ptiVar});
        } else {
            ptiVar.l();
        }
    }

    public static /* synthetic */ boolean c(pti ptiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d74d22d9", new Object[]{ptiVar})).booleanValue() : ptiVar.m();
    }

    public static /* synthetic */ TNodeView.b d(pti ptiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView.b) ipChange.ipc$dispatch("9dc423b5", new Object[]{ptiVar}) : ptiVar.k;
    }

    public pti(FluidContext fluidContext, ViewGroup viewGroup) {
        this.c = fluidContext;
        this.b = viewGroup;
        this.j = new ArrayList();
        this.f32878a = new ArrayList();
        this.f32878a.add(new WeakReference<>(this));
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spy.BIZ_ALBUM_DETAIL.equals(spyVar.f33836a) && spyVar.c.equals("VSMSG_registerFilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else {
            boolean equals = spyVar.c.equals(spy.MSG_UPDATE_ALBUM_DETAIL);
            if (this.e == null && equals) {
                b(spyVar);
            } else if (this.i == 2) {
                this.d.k().b(2, this.d, "onShortVideoMessage", null, spyVar.a(), null);
            } else if (this.i == 3 || this.i == 4) {
            } else {
                if (this.f.size() < 200) {
                    this.f.add(spyVar);
                } else {
                    spz.c("AlbumDetailTNodeMessageHandler", "pendingMsg reach 200");
                }
            }
        }
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        if (spyVar.c.equals("VSMSG_registerFilter")) {
            return spy.BIZ_ALBUM_DETAIL.equals(spyVar.f33836a);
        }
        if (this.j.isEmpty()) {
            return true;
        }
        return this.j.contains(spyVar.c) && (spyVar.d.equals(this.g) || "VSMSG_syncPageMap".equals(spyVar.c) || "VSMSG_syncProcessMap".equals(spyVar.c));
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.j.isEmpty()) {
            this.j.addAll(list);
            ArrayList arrayList = new ArrayList();
            for (WeakReference<pti> weakReference : this.f32878a) {
                pti ptiVar = weakReference.get();
                if (ptiVar != null) {
                    ptiVar.l();
                    if (ptiVar.m()) {
                        arrayList.add(ptiVar);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    soi.a(this.f32878a, (pti) it.next());
                }
            }
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.d == null || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c)) {
                this.d.k().b(2, this.d, "onShortVideoMessage", null, spyVar.a(), null);
            }
        }
        this.f.clear();
        return true;
    }

    private void b(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (this.e != null) {
        } else {
            this.i = 1;
            Map a2 = smb.a(this.c, spyVar);
            skl j = ((IDataService) this.c.getService(IDataService.class)).getConfig().j();
            String str = null;
            String str2 = j != null ? j.n : null;
            if (!StringUtils.isEmpty(str2)) {
                str = Uri.parse(str2).getQueryParameter(a.CONFIG_POLICY);
                int indexOf = str2.indexOf("?");
                if (indexOf != -1) {
                    str2 = str2.substring(0, indexOf);
                }
            }
            ab.h.a aVar = new ab.h.a(this.b.getContext());
            aVar.b(a2).c(str2).c(com.taobao.android.fluid.framework.hostcontainer.tnode.a.a(str));
            if (spyVar != null && spyVar.i != null) {
                aVar.a(spyVar.i);
            }
            final long currentTimeMillis = System.currentTimeMillis();
            this.e = TNodeView.create(aVar, ((IHostTNodeService) this.c.getService(IHostTNodeService.class)).getSharedTNodeEngine(), new TNodeView.b() { // from class: tb.pti.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutCompleted(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                        return;
                    }
                    aaVar.a(7, new aa.f() { // from class: tb.pti.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.f
                        public boolean a() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : pti.a(pti.this).isShown();
                        }
                    });
                    pti.a(pti.this, aaVar);
                    pti.b(pti.this);
                    pti.c(pti.this);
                    if (pti.d(pti.this) != null) {
                        pti.d(pti.this).onLayoutCompleted(aaVar);
                    }
                    spz.b("AlbumDetailTNodeMessageHandler", "renderContainer time=" + (System.currentTimeMillis() - currentTimeMillis));
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                        return;
                    }
                    pti.this.i = 3;
                    ogg.a("AlbumDetailTNodeMessageHandler", "layout error");
                    if (pti.d(pti.this) == null) {
                        return;
                    }
                    pti.d(pti.this).onLayoutError();
                }
            });
            a(this.e);
            this.b.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public aa b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("eea45475", new Object[]{this}) : this.d;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b((spy) null);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d == null) {
        } else {
            ((IHostTNodeService) this.c.getService(IHostTNodeService.class)).getSharedTNodeEngine().a(this.d);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            ((IHostTNodeService) this.c.getService(IHostTNodeService.class)).getSharedTNodeEngine().b(this.d);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return;
        }
        tNodeView.reload();
    }

    public void a(TNodeView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2f5d47", new Object[]{this, bVar});
        } else {
            this.k = bVar;
        }
    }
}
