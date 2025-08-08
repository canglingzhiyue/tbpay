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
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.mute.helper.g;
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
public class jck extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f29451a;
    private final List<WeakReference<jck>> b;
    private final ViewGroup c;
    private aa d;
    private TNodeView e;
    private String k;
    private int l = -1;
    private int m = -1;
    private String n = null;

    static {
        kge.a(-891236299);
    }

    public static /* synthetic */ Object ipc$super(jck jckVar, String str, Object... objArr) {
        if (str.hashCode() == -152376096) {
            super.cI_();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(jck jckVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4508070", new Object[]{jckVar, new Integer(i)})).intValue();
        }
        jckVar.i = i;
        return i;
    }

    public static /* synthetic */ FluidContext a(jck jckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("725b0b42", new Object[]{jckVar}) : jckVar.f29451a;
    }

    public static /* synthetic */ aa a(jck jckVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("2cfc9d0", new Object[]{jckVar, aaVar});
        }
        jckVar.d = aaVar;
        return aaVar;
    }

    public static /* synthetic */ void b(jck jckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9e61c7", new Object[]{jckVar});
        } else {
            jckVar.d();
        }
    }

    public static /* synthetic */ boolean c(jck jckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc21684c", new Object[]{jckVar})).booleanValue() : jckVar.e();
    }

    public static /* synthetic */ TNodeView d(jck jckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("55e6d0a6", new Object[]{jckVar}) : jckVar.e;
    }

    public jck(ViewGroup viewGroup, FluidContext fluidContext) {
        this.f29451a = fluidContext;
        this.c = viewGroup;
        this.j = new ArrayList();
        this.b = new ArrayList();
        this.b.add(new WeakReference<>(this));
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spy.BIZ_SHORTVIDEO_GLOBAL_FLOAT.equals(spyVar.f33836a) && spyVar.c.equals("VSMSG_registerFilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else if (this.e == null && this.i == 0) {
            e(spyVar);
        } else if (this.i == 2) {
            aa aaVar = this.d;
            if (aaVar == null || aaVar.k() == null) {
                return;
            }
            this.d.k().b(2, this.d, "onShortVideoMessage", null, spyVar.a(), null);
        } else if (this.i == 3 || this.i == 4) {
        } else {
            if (this.f.size() < 200) {
                this.f.add(spyVar);
            } else {
                spz.c("GlobalTNodeMessageHandler", "pendingMsg reach 200");
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
            return spy.BIZ_SHORTVIDEO_GLOBAL_FLOAT.equals(spyVar.f33836a);
        }
        if (!this.j.isEmpty()) {
            return this.j.contains(spyVar.c);
        }
        return true;
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.j.isEmpty()) {
            this.j.addAll(list);
            if (this.j.contains("VSMSG_getCommonMuteState")) {
                g.a().d();
            }
            if (!this.j.contains("VSMSG_supportGlobalMuteState")) {
                f.a(this.f29451a, "TNode");
            }
            skl j = ((IDataService) this.f29451a.getService(IDataService.class)).getConfig().j();
            if (j != null) {
                Iterator<String> it = this.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (next.contains("VSMSG_tnodeVersion_")) {
                        String[] split = next.split("_");
                        if (split.length > 2) {
                            j.f33657a = oec.a((Object) split[2], 0);
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (WeakReference<jck> weakReference : this.b) {
                jck jckVar = weakReference.get();
                if (jckVar != null) {
                    jckVar.d();
                    if (jckVar.e()) {
                        arrayList.add(jckVar);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                soi.a(this.b, (jck) it2.next());
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d == null || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private boolean e() {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty() || (aaVar = this.d) == null || aaVar.k() == null) {
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
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (this.e != null) {
            spz.c("GlobalTNodeMessageHandler", "PickPreloadController，tNodeView不为null，return");
        } else {
            this.i = 1;
            Map a2 = smb.a(this.f29451a, spyVar);
            final String str2 = this.k;
            if (str2 == null) {
                skl j = ((IDataService) this.f29451a.getService(IDataService.class)).getConfig().j();
                str2 = j != null ? j.d : null;
            }
            if (!StringUtils.isEmpty(str2)) {
                str = Uri.parse(str2).getQueryParameter(a.CONFIG_POLICY);
                int indexOf = str2.indexOf("?");
                if (indexOf != -1) {
                    str2 = str2.substring(0, indexOf);
                }
            } else {
                str = null;
            }
            String str3 = this.k == null ? null : this.n;
            ab.h.a aVar = new ab.h.a(this.c.getContext());
            aVar.b(a2).c(str2).b("global").d(str3).c(com.taobao.android.fluid.framework.hostcontainer.tnode.a.a(str)).e(true);
            spz.c("GlobalTNodeMessageHandler", "PickPreloadController,initTNodeView. dsl=" + str2);
            ab sharedTNodeEngine = ((IHostTNodeService) this.f29451a.getService(IHostTNodeService.class)).getSharedTNodeEngine();
            final long currentTimeMillis = System.currentTimeMillis();
            this.e = TNodeView.create(aVar, sharedTNodeEngine, new TNodeView.b() { // from class: tb.jck.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutCompleted(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    spz.c("GlobalTNodeMessageHandler", "globletnode layout onLayoutCompleted url=" + str2 + " ; loadtime=" + currentTimeMillis2);
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a.a(jck.a(jck.this), "finish", str2, String.valueOf(currentTimeMillis2));
                    jck.a(jck.this, aaVar);
                    jck.b(jck.this);
                    jck.c(jck.this);
                    spz.c("GlobalTNodeMessageHandler", "PickPreloadController，initTNode初始化完成");
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                        return;
                    }
                    jck.a(jck.this, 3);
                    spz.c("GlobalTNodeMessageHandler", "globletnode layout error. url=" + str2);
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a.a(jck.a(jck.this), "error", str2, (String) null);
                }
            });
            spz.c("GlobalTNodeMessageHandler", "创建全局tnode实例globletnode, url=" + str2);
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a.a(this.f29451a, "load", str2, (String) null);
            a(this.e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i = this.l;
            if (i > 0) {
                layoutParams.width = i;
            }
            int i2 = this.m;
            if (i2 > 0) {
                layoutParams.height = i2;
            }
            this.c.addView(this.e, layoutParams);
            if (!sjt.a("delayglobaltnode")) {
                return;
            }
            this.e.setSuspendLayoutState(true);
            oec.a(new Runnable() { // from class: tb.jck.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (jck.d(jck.this) == null) {
                    } else {
                        jck.d(jck.this).setSuspendLayoutState(false);
                    }
                }
            }, oeb.a("ShortVideo.delayTimeOut", obu.i() ? 3000 : 2000));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("GlobalTNodeMessageHandler", "PickPreloadController，init 创建");
        e(null);
    }

    public void a(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348715c", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
            return;
        }
        this.k = str;
        this.n = str2;
        if (i > 0 && i2 > 0) {
            this.l = i;
            this.m = i2;
        }
        b((spy) null);
    }

    private void e(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940a1a0", new Object[]{this, spyVar});
        } else {
            b(spyVar);
        }
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c("GlobalTNodeMessageHandler", "销毁全局tnode实例");
        super.cI_();
        if (this.d != null) {
            if (oeb.bK()) {
                try {
                    this.d.d(true);
                } catch (Throwable unused) {
                    spz.c("GlobalTNodeMessageHandler", "detach failed");
                }
            }
            this.d = null;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || (tNodeView = this.e) == null) {
            return;
        }
        viewGroup.removeView(tNodeView);
        this.e = null;
    }
}
