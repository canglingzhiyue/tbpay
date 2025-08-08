package tb;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.common.view.RoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.DelayConfig;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.weex.RenderContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class qmq extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<WeakReference<qmq>> f32939a;
    private final ViewGroup b;
    private aa c;
    private TNodeView d;
    private final FluidContext e;
    private final psw k;
    private boolean m;
    private boolean n;
    private Handler o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean l = false;
    private boolean t = false;
    private boolean u = false;

    static {
        kge.a(1832168209);
        kge.a(1539428149);
    }

    public static /* synthetic */ Object ipc$super(qmq qmqVar, String str, Object... objArr) {
        if (str.hashCode() == -152376096) {
            super.cI_();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ aa a(qmq qmqVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("7898613", new Object[]{qmqVar, aaVar});
        }
        qmqVar.c = aaVar;
        return aaVar;
    }

    public static /* synthetic */ void a(qmq qmqVar, TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8eb46a", new Object[]{qmqVar, tNodeView});
        } else {
            qmqVar.a(tNodeView);
        }
    }

    public static /* synthetic */ void a(qmq qmqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf93c3ed", new Object[]{qmqVar, str});
        } else {
            qmqVar.c(str);
        }
    }

    public static /* synthetic */ boolean a(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9cece7", new Object[]{qmqVar})).booleanValue() : qmqVar.t;
    }

    public static /* synthetic */ boolean a(qmq qmqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78016255", new Object[]{qmqVar, new Boolean(z)})).booleanValue();
        }
        qmqVar.u = z;
        return z;
    }

    public static /* synthetic */ TNodeView b(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("13f1cdc1", new Object[]{qmqVar}) : qmqVar.d;
    }

    public static /* synthetic */ boolean b(qmq qmqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59df2bf4", new Object[]{qmqVar, new Boolean(z)})).booleanValue();
        }
        qmqVar.t = z;
        return z;
    }

    public static /* synthetic */ psw c(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("11bd08ad", new Object[]{qmqVar}) : qmqVar.k;
    }

    public static /* synthetic */ void d(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7260066", new Object[]{qmqVar});
        } else {
            qmqVar.q();
        }
    }

    public static /* synthetic */ boolean e(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5a906eb", new Object[]{qmqVar})).booleanValue() : qmqVar.r();
    }

    public static /* synthetic */ boolean f(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42c0d6c", new Object[]{qmqVar})).booleanValue() : qmqVar.l;
    }

    public static /* synthetic */ ViewGroup g(qmq qmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("35ebb00c", new Object[]{qmqVar}) : qmqVar.b;
    }

    public qmq(ViewGroup viewGroup, psw pswVar) {
        this.b = viewGroup;
        this.e = pswVar.z();
        this.k = pswVar;
        DelayConfig b = b(pswVar.z());
        if (b != null) {
            if (((IInteractionService) pswVar.z().getService(IInteractionService.class)).getConfig().l()) {
                ((IInteractionService) pswVar.z().getService(IInteractionService.class)).getConfig().a(false);
                this.n = soq.a();
                b.getClass();
                boolean z = true;
                this.m = oec.a((Object) true, false);
                b.getClass();
                this.p = oec.a((Object) "3000", 0);
                if (this.m) {
                    b.getClass();
                    this.s = oec.a((Object) "1", 0);
                    this.r = this.s <= 0 ? false : z;
                }
            }
            spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView配置-mEnableDelayInit：" + this.m + "，mDelayInitDefaultTimeOut：" + this.p);
        }
        this.j = h();
        this.f32939a = new ArrayList();
        this.f32939a.add(new WeakReference<>(this));
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if ("interact".equals(spyVar.f33836a) && spyVar.c.equals("VSMSG_registerFilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else {
            boolean equals = spyVar.c.equals(spy.MSG_DATA_CHANGE);
            if (this.i != 5 && this.d == null && equals) {
                this.i = 5;
                spz.c("CardTNodeMessageHandler", "PickPreloadController，handleMessage,进入initTNodeView逻辑");
                e(spyVar);
            } else if (this.i == 2) {
                aa aaVar = this.c;
                if (aaVar == null || aaVar.k() == null) {
                    return;
                }
                this.c.k().b(2, this.c, "onShortVideoMessage", null, spyVar.a(), null);
            } else if (this.i == 3 || this.i == 4) {
            } else {
                if (this.f.size() < 200) {
                    this.f.add(spyVar);
                } else {
                    spz.c("CardTNodeMessageHandler", "pendingMsg reach 200");
                }
            }
        }
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        return !this.m && ((IUsePreloadService) this.k.z().getService(IUsePreloadService.class)).enableTab3UseCacheData() && this.n;
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.m && !this.q;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.m && this.r;
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        if (spyVar.c.equals("VSMSG_registerFilter")) {
            return "interact".equals(spyVar.f33836a);
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
            for (WeakReference<qmq> weakReference : this.f32939a) {
                qmq qmqVar = weakReference.get();
                if (qmqVar != null) {
                    qmqVar.q();
                    if (qmqVar.r()) {
                        arrayList.add(qmqVar);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                soi.a(this.f32939a, (qmq) it.next());
            }
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.c == null || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private boolean r() {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty() || (aaVar = this.c) == null || aaVar.k() == null) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c) && spyVar.d.equals(this.g)) {
                this.c.k().b(2, this.c, "onShortVideoMessage", null, spyVar.a(), null);
            }
        }
        this.f.clear();
        return true;
    }

    public void b(spy spyVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (this.d == null) {
            this.i = 1;
            if (this.b != null) {
                pil.a(this.b.getContext(), spj.j(this.k.z()), "gg_interactive_render_tnode");
            }
            Map a2 = smb.a(this.k.z(), spyVar);
            skl j = ((IDataService) this.k.z().getService(IDataService.class)).getConfig().j();
            String str = null;
            final String str2 = j != null ? j.d : null;
            if (!StringUtils.isEmpty(str2)) {
                str = Uri.parse(str2).getQueryParameter(a.CONFIG_POLICY);
                int indexOf = str2.indexOf("?");
                if (indexOf != -1) {
                    str2 = str2.substring(0, indexOf);
                }
            }
            ab.h.a aVar = new ab.h.a(this.b.getContext());
            aVar.b(a2).c(str2).a(spyVar.i).c(com.taobao.android.fluid.framework.hostcontainer.tnode.a.a(str));
            aVar.a(false);
            final ab sharedTNodeEngine = ((IHostTNodeService) this.e.getService(IHostTNodeService.class)).getSharedTNodeEngine();
            spz.c("CardTNodeMessageHandler", "PickPreloadController,initTNodeView. dsl=" + str2 + " ; dsl_is_orange=" + oeb.bb());
            this.d = TNodeView.create(aVar, sharedTNodeEngine, new TNodeView.b() { // from class: tb.qmq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutCompleted(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                        return;
                    }
                    qmq.a(qmq.this, aaVar);
                    qmq.a(qmq.this, true);
                    if (qmq.a(qmq.this)) {
                        if (qmq.b(qmq.this) != null && qmq.b(qmq.this).getEngine() != null && qmq.this.c() != null) {
                            qmq.b(qmq.this).getEngine().a(qmq.this.c());
                            spz.a("CardTNode", "cardtnode 初始化tnodeview完成，补发 onResume");
                        }
                        qmq.b(qmq.this, false);
                    }
                    qmq.a(qmq.this, obw.WEEX_STATE_NOT_EXIST);
                    String F = sharedTNodeEngine.F();
                    d.f(qmq.c(qmq.this).z(), F);
                    RenderTrackUtils.a(qmq.c(qmq.this).z(), RenderTrackUtils.renderEnd);
                    RenderTrackUtils.a(qmq.c(qmq.this).z(), qmq.c(qmq.this), "interact_first_cost", qmq.c(qmq.this).w());
                    qmq.d(qmq.this);
                    qmq.e(qmq.this);
                    if (spi.a() && qmq.c(qmq.this).r() == 0) {
                        z = true;
                    }
                    if (z && !qmq.f(qmq.this)) {
                        qmq qmqVar = qmq.this;
                        qmq.a(qmqVar, qmq.b(qmqVar));
                    }
                    if (qmq.g(qmq.this) != null) {
                        String j2 = spj.j(qmq.c(qmq.this).z());
                        pil.a(qmq.g(qmq.this).getContext(), j2, "gg_interactive_render_tnode", null);
                        com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().b(j2, com.taobao.tao.flexbox.layoutmanager.usertracker.a.CELL_RENDER_FINISH);
                    }
                    spz.c("CardTNodeMessageHandler", "PickPreloadController,initTNodeView--onLayoutCompleted. dslmd5=" + F);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                        return;
                    }
                    qmq.this.i = 3;
                    ogg.b("layout error， url=" + str2);
                    if (qmq.g(qmq.this) == null) {
                        return;
                    }
                    String j2 = spj.j(qmq.c(qmq.this).z());
                    pil.a(qmq.g(qmq.this).getContext(), j2, "gg_interactive_render_tnode", "layout error", null);
                    com.taobao.tao.flexbox.layoutmanager.usertracker.a.a().b(j2, com.taobao.tao.flexbox.layoutmanager.usertracker.a.CELL_RENDER_FINISH);
                }
            });
            spz.c("CardTNodeMessageHandler", "创建tnode实例");
            a((View) this.d);
            int childCount = this.b.getChildCount();
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.b.getChildAt(i4);
                if (childAt instanceof RenderContainer) {
                    i2 = i4;
                } else if (childAt instanceof DWPenetrateFrameLayout) {
                    i3 = i4;
                }
            }
            if (i2 == -1 && i3 == -1) {
                this.b.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            if (i2 == -1 || i3 == -1) {
                i = i2 != -1 ? i2 : i3;
            } else {
                i = Math.min(i2, i3);
            }
            if (i == -1) {
                return;
            }
            this.b.addView(this.d, i, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public aa c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("e04dfa94", new Object[]{this}) : this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.a.a() || this.d == null || c() == null || this.d.getEngine() == null) {
        } else {
            this.d.getEngine().b(c());
            spz.a("CardTNode", "cardtnode onPauseMedia");
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.a.a()) {
        } else {
            if (this.d != null && c() != null && this.u && this.d.getEngine() != null) {
                this.d.getEngine().a(c());
                spz.a("CardTNode", "cardtnode onResume");
                return;
            }
            this.t = true;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.a.b() || this.d == null || c() == null || this.d.getEngine() == null) {
        } else {
            this.d.getEngine().a(c());
            spz.a("CardTNode", "cardtnode onResume");
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!com.taobao.android.fluid.framework.hostcontainer.tnode.a.b() || this.d == null || c() == null || this.d.getEngine() == null) {
        } else {
            this.d.getEngine().b(c());
            spz.a("CardTNode", "cardtnode onPauseMedia");
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (!(viewGroup instanceof RoundCornerLayout)) {
            return;
        }
        ((RoundCornerLayout) viewGroup).setWeexConsume(str);
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c("CardTNodeMessageHandler", "销毁tnode实例");
        super.cI_();
        if (this.c != null) {
            if (oeb.bK()) {
                try {
                    this.c.d(true);
                } catch (Throwable unused) {
                    spz.c("CardTNodeMessageHandler", "detach failed");
                }
            }
            this.c = null;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null && (tNodeView = this.d) != null) {
            viewGroup.removeView(tNodeView);
            this.d = null;
        }
        s();
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!this.m || this.o == null) {
        } else {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，removeDelayMsg");
            this.o.removeCallbacksAndMessages(null);
        }
    }

    private void a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29395e05", new Object[]{this, tNodeView});
            return;
        }
        this.l = true;
        obt.a(tNodeView, 200);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.m) {
        } else {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，onVideoFirstFrameRender,收到首帧回调");
            this.q = true;
            if (this.d != null) {
                return;
            }
            t();
        }
    }

    private void e(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940a1a0", new Object[]{this, spyVar});
        } else if (o()) {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，延迟到首帧回来后创建");
            a(spyVar, 0);
        } else if (p()) {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，首帧后依然需要延迟创建");
            a(spyVar, 1);
        } else if (n()) {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，默认tab3降级延迟加载逻辑");
            a(spyVar, 2);
        } else if (this.m) {
        } else {
            spz.c("CardTNodeMessageHandler", "PickPreloadController，延迟开关关闭|| (延时开关打开并且页面Appear收到首帧回调，无需再延迟) --直接创建");
            b(spyVar);
        }
    }

    private void a(final spy spyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75cdee7", new Object[]{this, spyVar, new Integer(i)});
            return;
        }
        if (this.o == null) {
            this.o = new Handler(Looper.getMainLooper()) { // from class: tb.qmq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    qmq.this.b(spyVar);
                    spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeViewRunnable tnodeview==" + qmq.b(qmq.this));
                }
            };
        }
        if (i == 0) {
            if (this.o.hasMessages(0)) {
                return;
            }
            spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView,MSG_TIME_OUT_DELAY_INIT，首帧回调未回来补充逻辑");
            this.o.sendEmptyMessageDelayed(0, this.p);
        } else if (i != 1) {
            if (i != 2 || this.o.hasMessages(2)) {
                return;
            }
            spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView,MSG_DEMOTE_DELAY_INIT，默认tab3 互动区降级逻辑");
            this.o.sendEmptyMessageDelayed(2, 200L);
        } else {
            if (this.o.hasMessages(0)) {
                spz.c("CardTNodeMessageHandler", "PickPreloadController，MSG_FIRST_FRAME_RENDER_DELAY_INIT,移除兜底逻辑");
                this.o.removeMessages(0);
            }
            if (this.o.hasMessages(1)) {
                return;
            }
            spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView,MSG_FIRST_FRAME_RENDER_DELAY_INIT，首帧回调后延迟逻辑");
            this.o.sendEmptyMessageDelayed(1, this.s);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (this.o == null) {
        } else {
            if (p()) {
                spz.c("CardTNodeMessageHandler", "PickPreloadController，首帧后依然需要延迟创建");
                if (this.o.hasMessages(0)) {
                    spz.c("CardTNodeMessageHandler", "PickPreloadController，MSG_FIRST_FRAME_RENDER_DELAY_INIT,移除兜底逻辑");
                    this.o.removeMessages(0);
                }
                if (this.o.hasMessages(1)) {
                    return;
                }
                spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView,MSG_FIRST_FRAME_RENDER_DELAY_INIT，首帧回调后延迟逻辑");
                this.o.sendEmptyMessageDelayed(1, this.s);
            } else if (!n() || this.o.hasMessages(2)) {
            } else {
                spz.c("CardTNodeMessageHandler", "PickPreloadController，initTNodeView,MSG_DEMOTE_DELAY_INIT，默认tab3 互动区降级逻辑");
                this.o.sendEmptyMessageDelayed(2, 200L);
            }
        }
    }
}
