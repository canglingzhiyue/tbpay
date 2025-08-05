package tb;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.common.view.RoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.DelayConfig;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.e;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.c;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class sgx extends ptk implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable A;
    private Runnable B;
    private final ViewGroup b;
    private p c;
    private final psw e;
    private long m;
    private boolean n;
    private int o;
    private Handler p;
    private boolean q;
    private int s;
    private sgy t;
    private spy y;
    private boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    public String f33566a = null;
    private final List<WeakReference<sgx>> k = new ArrayList();
    private boolean l = false;
    private boolean u = false;
    private boolean v = false;
    private int w = 0;
    private int x = 0;
    private long z = 0;
    private boolean C = false;
    private boolean r = false;
    private boolean D = false;
    private boolean E = oeb.a("ShortVideo.supportWeexLifecycle", true);

    static {
        kge.a(-1125437082);
        kge.a(-311268728);
    }

    public static /* synthetic */ Object ipc$super(sgx sgxVar, String str, Object... objArr) {
        if (str.hashCode() == -152376096) {
            super.cI_();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ int a(sgx sgxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7f329c2", new Object[]{sgxVar, new Integer(i)})).intValue();
        }
        sgxVar.i = i;
        return i;
    }

    public static /* synthetic */ p a(sgx sgxVar, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("e3fed656", new Object[]{sgxVar, pVar});
        }
        sgxVar.c = pVar;
        return pVar;
    }

    public static /* synthetic */ void a(sgx sgxVar, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604571f6", new Object[]{sgxVar, view, new Boolean(z)});
        } else {
            sgxVar.a(view, z);
        }
    }

    public static /* synthetic */ void a(sgx sgxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a815647e", new Object[]{sgxVar, str});
        } else {
            sgxVar.d(str);
        }
    }

    public static /* synthetic */ void a(sgx sgxVar, spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1f40ec", new Object[]{sgxVar, spyVar, new Boolean(z)});
        } else {
            sgxVar.a(spyVar, z);
        }
    }

    public static /* synthetic */ int b(sgx sgxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9d0f361", new Object[]{sgxVar, new Integer(i)})).intValue();
        }
        sgxVar.i = i;
        return i;
    }

    public static /* synthetic */ String b(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90a3f0b", new Object[]{sgxVar}) : sgxVar.q();
    }

    public static /* synthetic */ void b(sgx sgxVar, spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a4fb8b", new Object[]{sgxVar, spyVar, new Boolean(z)});
        } else {
            sgxVar.b(spyVar, z);
        }
    }

    public static /* synthetic */ void c(sgx sgxVar, spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2ab62a", new Object[]{sgxVar, spyVar, new Boolean(z)});
        } else {
            sgxVar.e(spyVar, z);
        }
    }

    public static /* synthetic */ void c(sgx sgxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baefcde", new Object[]{sgxVar, new Boolean(z)});
        } else {
            sgxVar.a(z);
        }
    }

    public static /* synthetic */ psw f(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("89bf9bd9", new Object[]{sgxVar}) : sgxVar.e;
    }

    public static /* synthetic */ p m(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("996a3b3d", new Object[]{sgxVar}) : sgxVar.c;
    }

    public static /* synthetic */ void n(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5c9441", new Object[]{sgxVar});
        } else {
            sgxVar.p();
        }
    }

    public static /* synthetic */ String o(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11cef61e", new Object[]{sgxVar}) : sgxVar.r();
    }

    public static /* synthetic */ ViewGroup p(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8b15bd72", new Object[]{sgxVar}) : sgxVar.b;
    }

    public static /* synthetic */ void q(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e5a7c4", new Object[]{sgxVar});
        } else {
            sgxVar.I();
        }
    }

    public static /* synthetic */ boolean r(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d568ae49", new Object[]{sgxVar})).booleanValue() : sgxVar.C;
    }

    public static /* synthetic */ void s(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ebb4c6", new Object[]{sgxVar});
        } else {
            sgxVar.m();
        }
    }

    public static /* synthetic */ void t(sgx sgxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26ebb47", new Object[]{sgxVar});
        } else {
            sgxVar.l();
        }
    }

    public sgx(ViewGroup viewGroup, psw pswVar) {
        this.b = viewGroup;
        this.e = pswVar;
        A();
        this.k.add(new WeakReference<>(this));
        shg.a();
        if (!sjt.a(ImageLoader.Scene.FIRST_FRAME) || !pio.a(viewGroup.getContext())) {
            return;
        }
        spz.c("CardWeeXV2MessageHandler", "初始化CardWeeXV2MessageHandler时候, 已有首帧");
        c();
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
            spz.c("CardWeeXV2MessageHandler", "weex预加载,handleMessage,收到MSG_REGISTER_FILTER_MESSAGES解析感兴趣的消息列表，array size:" + c.size());
            a(c);
            C();
        } else {
            boolean equals = spyVar.c.equals(spy.MSG_DATA_CHANGE);
            if (this.c == null && equals) {
                this.y = spyVar;
                b(spyVar);
            } else if (this.i == 2) {
                a(this.c, new JSONObject(spyVar.a()));
            } else {
                g(spyVar);
            }
        }
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (this.c == null || !this.r) {
        } else {
            this.r = false;
            spz.c("CardWeeXV2MessageHandler", "weex预加载handlerPreloadCreateInstance");
            D();
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        View findViewById = this.b.findViewById(R.id.fluid_sdk_weex_interactive_card);
        if (findViewById == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.bottomMargin = 0;
        findViewById.setLayoutParams(layoutParams);
    }

    private void g(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9646aea2", new Object[]{this, spyVar});
        } else if (spyVar == null || this.i == 3 || this.i == 4) {
        } else {
            if (this.f.size() < 200) {
                this.f.add(spyVar);
                spz.c("CardWeeXV2MessageHandler", "weexDelay，pendingMsg add" + spyVar.toString());
                return;
            }
            spz.c("CardWeeXV2MessageHandler", "pendingMsg reach 200");
        }
    }

    private void a(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85077e6b", new Object[]{this, pVar, jSONObject});
        } else if (pVar == null) {
        } else {
            if (jSONObject != null && TextUtils.equals(spy.MSG_DATA_CHANGE, (String) jSONObject.get("name"))) {
                spz.c("CardWeeXV2MessageHandler", "weex预加载dispatchEvent,发送VSMSG_updateMediaData => " + pVar.getInstanceId());
            }
            pVar.dispatchEvent(MUSEventTarget.MUS_BODY_TARGET, "shortvideomessage", jSONObject);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        try {
            this.h.removeCallbacks(this.A);
        } catch (Exception unused) {
            FluidException.throwException(this.e.z(), ICardService.WEEX_REMOVE_TIMEOUT_CALLBACKS_ERROR);
        }
    }

    private void a(final spy spyVar, final boolean z, final p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b034d5", new Object[]{this, spyVar, new Boolean(z), pVar});
        } else if (this.c == null) {
        } else {
            sgy sgyVar = this.t;
            if (sgyVar != null) {
                sgyVar.a(((MUSDKInstance) pVar).getToken());
            }
            if (!shg.c()) {
                return;
            }
            spz.c("CardWeeXV2MessageHandler", "checkTimeout timeout do rebuildWeex ," + q());
            oec.a(new Runnable() { // from class: tb.sgx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!shg.g() || pVar == sgx.m(sgx.this)) {
                        sgx.n(sgx.this);
                        sgx.a(sgx.this, spyVar, z);
                        spz.c("CardWeeXV2MessageHandler", "checkTimeout timeout rebuildWeex initWeexInstance ," + sgx.b(sgx.this) + sgx.o(sgx.this));
                    } else {
                        spz.c("CardWeeXV2MessageHandler", "checkTimeout timeout 实例不同 instance=" + pVar + " musInstance=" + sgx.m(sgx.this) + "---" + sgx.b(sgx.this));
                    }
                }
            });
        }
    }

    private void a(final spy spyVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75d1eb8", new Object[]{this, spyVar, new Boolean(z)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: tb.sgx.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                spz.c("CardWeeXV2MessageHandler", "IdleTaskHelper weex 开始执行initWeexInstance --- ");
                if (sgx.f(sgx.this) == null) {
                    return;
                }
                sgx.a(sgx.this, 1);
                if (sgx.p(sgx.this) != null) {
                    pil.a(sgx.p(sgx.this).getContext(), spj.j(sgx.f(sgx.this).z()), "gg_interactive_render_weex");
                }
                skl j = ((IDataService) sgx.f(sgx.this).z().getService(IDataService.class)).getConfig().j();
                if (j != null) {
                    sgx.this.f33566a = j.g;
                }
                if (TextUtils.isEmpty(sgx.this.f33566a)) {
                    sgx.b(sgx.this, 3);
                    if (sgx.p(sgx.this) == null) {
                        return;
                    }
                    String j2 = spj.j(sgx.f(sgx.this).z());
                    pil.a(sgx.p(sgx.this).getContext(), j2, "gg_interactive_render_weex", "layout error", null);
                    a.a().b(j2, a.CELL_RENDER_FINISH);
                    return;
                }
                sgx sgxVar = sgx.this;
                sgx.a(sgxVar, sgxVar.f33566a);
                sgx.b(sgx.this, spyVar, z);
                StringBuilder sb = new StringBuilder();
                sb.append("IdleTaskHelper 创建weex实例 position=");
                sb.append(sgx.f(sgx.this) != null ? Integer.valueOf(sgx.f(sgx.this).r()) : "null");
                sb.append(sgx.b(sgx.this));
                sb.append(sgx.o(sgx.this));
                spz.c("CardWeeXV2MessageHandler", sb.toString());
            }
        };
        int r = this.e.r();
        boolean a2 = hnm.a(this.e.z());
        spz.c("CardWeeXV2MessageHandler", "IdleTaskHelper weex--- isLowDevice=" + obu.i() + " adapterPosition=" + r + " isMainListIdle=" + a2);
        if (obu.i() && r == 0 && !a2) {
            hnm.a(this.e.z(), runnable);
        } else {
            runnable.run();
        }
    }

    private JSONObject f(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0318f41", new Object[]{this, spyVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (spyVar != null) {
                jSONObject.put("model", (Object) spyVar.i);
            }
            Map a2 = smb.a(this.e.z(), spyVar);
            if (this.e.r() == 0) {
                a2.put("isColdStartFirstInstance", true);
            }
            a(a2);
            jSONObject.put("options", (Object) a2);
            return jSONObject;
        } catch (Exception e) {
            spz.c("CardWeeXV2MessageHandler", "weex预创建createWeexInitData error:" + e);
            return null;
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            psw pswVar = this.e;
            if (!(pswVar instanceof sii)) {
                return;
            }
            map.put("playerPauseIconPosition", ((sii) pswVar).X().j());
        }
    }

    private void b(spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93ae857", new Object[]{this, spyVar, new Boolean(z)});
        } else if (sjt.a(this.e.z())) {
            c(spyVar, z);
        } else {
            d(spyVar, z);
        }
    }

    private void c(final spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab18b1f6", new Object[]{this, spyVar, new Boolean(z)});
        } else if (h(spyVar)) {
        } else {
            spz.c("CardWeeXV2MessageHandler", "createWeexInstanceASync");
            b bVar = new b();
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
            weexUnicornConfig.a(true);
            bVar.a(weexUnicornConfig);
            q b = e.b(this.b.getContext(), this.f33566a, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
            if (this.b.getMeasuredWidth() > 0 && this.b.getMeasuredHeight() > 0) {
                b.a(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
            }
            b.a(this.f33566a);
            b.a(e.b().a(f(spyVar)));
            b.a(new s() { // from class: tb.sgx.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.s
                public void a(s.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8d89384", new Object[]{this, aVar});
                        return;
                    }
                    sgx.a(sgx.this, ((WeexInstanceImpl) aVar.a(sgx.p(sgx.this).getContext())).getAdapterMUSInstance());
                    sgx.c(sgx.this, spyVar, false);
                    sgx sgxVar = sgx.this;
                    sgx.a(sgxVar, sgx.m(sgxVar).getRenderRoot(), false);
                }
            });
        }
    }

    private boolean h(spy spyVar) {
        PreloadWeexData preloadWeexData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c9b527", new Object[]{this, spyVar})).booleanValue();
        }
        spz.c("CardWeeXV2MessageHandler", "canUsePreloadAsyncWeexInstance");
        IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) this.e.z().getService(IPreloadWeexService.class);
        if (iPreloadWeexService == null || (preloadWeexData = iPreloadWeexService.getPreloadWeexData()) == null || preloadWeexData.a() == null) {
            return false;
        }
        spz.c("CardWeeXV2MessageHandler", "预加载Render阶段异步创建好weex实例");
        this.c = preloadWeexData.a();
        a(preloadWeexData.d());
        if (this.c != null) {
            e(spyVar, false);
            this.r = true;
            a(this.c.getRenderRoot(), true);
            if (2 == preloadWeexData.b()) {
                spz.c("CardWeeXV2MessageHandler", "实例已经渲染成功");
                b(true);
                if (!E()) {
                    a(this.c, spyVar, true);
                } else {
                    g(i(spyVar));
                }
            }
        }
        preloadWeexData.a((WeexInstance) null);
        iPreloadWeexService.onDestroyService();
        return true;
    }

    private void a(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ec586", new Object[]{this, weexInstance});
        } else if (!sjt.z() || weexInstance == null) {
        } else {
            ((juh) weexInstance.getExtend(juh.class)).a(new tbq() { // from class: tb.sgx.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tbq
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    spz.c("CardWeeXV2MessageHandler", "weex预创建,onWeexUiDisplayed");
                    oce.c(sgx.f(sgx.this).y(), "removeTransitionView");
                    sgx.q(sgx.this);
                }

                @Override // tb.tbq
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        spz.c("CardWeeXV2MessageHandler", "weex预创建,onWeexUiNoLongerDisplayed");
                    }
                }
            });
        }
    }

    private void d(spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf67b95", new Object[]{this, spyVar, new Boolean(z)});
            return;
        }
        spz.c("CardWeeXV2MessageHandler", "createWeexInstanceSync");
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.a(new f() { // from class: tb.sgx.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                } else {
                    sgx.a(sgx.this, view, false);
                }
            }
        });
        if (son.o()) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.image);
        } else {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        try {
            mUSInstanceConfig.c(this.f33566a);
        } catch (Throwable unused) {
        }
        spz.c("CardWeeXV2MessageHandler", "创建weex实例 weexUrl=" + this.f33566a);
        this.c = com.taobao.android.weex_framework.q.a().a(this.b.getContext(), mUSInstanceConfig);
        e(spyVar, true);
    }

    private void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else if (view == null) {
            FluidException.throwException(this.e.z(), ICardService.WEEX_INSTANCE_CREATE_VIEW_ERROR);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.sgx.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                    } else if (!(sgx.m(sgx.this) instanceof MUSDKInstance)) {
                    } else {
                        ((MUSDKInstance) sgx.m(sgx.this)).refreshPixelCheckTime();
                        spz.c("CardWeeXV2MessageHandler", "weex view attached to window and refresh pixel check time, weex instance: " + sgx.m(sgx.this).getInstanceId());
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                    } else if (sgx.m(sgx.this) == null) {
                    } else {
                        spz.c("CardWeeXV2MessageHandler", "weex view detached from window, weex instance: " + sgx.m(sgx.this).getInstanceId());
                    }
                }
            });
            a(view);
            view.setTag(((IMessageService) this.e.z().getService(IMessageService.class)).getMessageCenter());
            view.setId(R.id.fluid_sdk_weex_interactive_card);
            int G = G();
            this.r = z;
            if (sjt.q() && z) {
                a(G, view);
            } else {
                c(G, view);
            }
        }
    }

    private int G() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fe0941", new Object[]{this})).intValue();
        }
        int i2 = -1;
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                } else if (this.b.getChildAt(i) instanceof DWPenetrateFrameLayout) {
                    i2 = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        spz.c("CardWeeXV2MessageHandler", "getWebViewIndex:" + i2);
        return i2;
    }

    private void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
        } else if (view == null) {
        } else {
            if (view.getParent() != null) {
                spz.c("CardWeeXV2MessageHandler", "weex预创建,将weexView从根布局上移除");
                H();
                oce.c(this.e.y(), "remove");
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (E()) {
                b(i, view);
            } else {
                c(i, view);
            }
        }
    }

    private void H() {
        p pVar;
        TextureView textureView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (!sjt.z() || (pVar = this.c) == null || !(pVar.getRenderView() instanceof TextureView) || (textureView = (TextureView) this.c.getRenderView()) == null) {
        } else {
            TUrlImageView tUrlImageView = new TUrlImageView(this.e.y());
            tUrlImageView.setImageBitmap(textureView.getBitmap());
            FrameLayout frameLayout = new FrameLayout(this.e.y());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(textureView.getWidth(), textureView.getHeight()));
            frameLayout.setId(R.id.fluid_sdk_weex_interactive_card_transition);
            frameLayout.addView(tUrlImageView);
            int G = G();
            spz.c("CardWeeXV2MessageHandler", "weex预创建,onAddPreloadWeexViewToCell创建bitmap view防止闪动,weexRenderView width:" + textureView.getWidth() + ",height:" + textureView.getHeight());
            d(G, frameLayout);
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (this.b == null) {
        } else {
            spz.c("CardWeeXV2MessageHandler", "weex预创建,removeTransitionView移除bitmap view防止闪动");
            FrameLayout frameLayout = (FrameLayout) this.b.findViewById(R.id.fluid_sdk_weex_interactive_card_transition);
            if (frameLayout == null || !(frameLayout.getParent() instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
        }
    }

    private void b(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95435e58", new Object[]{this, new Integer(i), view});
        } else if (this.D) {
        } else {
            if (!(this.e instanceof sii)) {
                c(i, view);
                return;
            }
            spz.c("CardWeeXV2MessageHandler", "weex预创建,handlePreLoadWeexViewPosition,VSMSG_getProgressPosition");
            d(i, view);
            this.D = true;
        }
    }

    private void d(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da3f85a", new Object[]{this, new Integer(i), view});
            return;
        }
        int m = spj.m(this.e.z());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = m;
        spz.c("CardWeeXV2MessageHandler", "weex预创建,VSMSG_getProgressPosition，bottomMargin=" + m);
        a(i, view, layoutParams);
    }

    private void c(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1973ab59", new Object[]{this, new Integer(i), view});
        } else {
            a(i, view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private void a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e68ba6", new Object[]{this, new Integer(i), view, layoutParams});
        } else if (i == -1) {
            this.b.addView(view, layoutParams);
        } else {
            this.b.addView(view, i, layoutParams);
        }
    }

    private void e(spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed44534", new Object[]{this, spyVar, new Boolean(z)});
        } else if (this.c == null) {
            spz.c("CardWeeXV2MessageHandler", "weex预创建,onWeexInstanceCreated musInstance is null return");
        } else {
            if (sjt.t()) {
                this.i = 6;
            }
            this.c.registerRenderListener(this);
            if (iqw.k()) {
                e();
            } else {
                g();
            }
            this.c.setWeexScrollListener(new jvs() { // from class: tb.sgx.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvs
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (!sgx.r(sgx.this)) {
                    } else {
                        sgx.s(sgx.this);
                        spz.c("CardWeeXV2MessageHandler", "onOverScrolling doPendingEvent");
                    }
                }
            });
            if (z) {
                this.c.initWithURL(Uri.parse(this.f33566a));
                a(this.c, spyVar, false);
            }
            this.c.setTag("std_pop_anim_listener", this.e);
            this.m = SystemClock.elapsedRealtime();
            psw pswVar = this.e;
            String str = this.f33566a;
            d.a(pswVar, "weex_v2_start", str, this.e.v().a() + "", "", "");
            if (this.b == null) {
                return;
            }
            String j = spj.j(this.e.z());
            pil.a(this.b.getContext(), j, "gg_interactive_render_weex", null);
            a.a().b(j, a.CELL_RENDER_FINISH);
        }
    }

    private void a(p pVar, spy spyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a5a9b", new Object[]{this, pVar, spyVar, new Boolean(z)});
        } else if (pVar == null) {
        } else {
            if (z) {
                spy i = i(spyVar);
                if (i == null) {
                    return;
                }
                a(pVar, new JSONObject(i.a()));
                return;
            }
            pVar.render(f(spyVar), null);
        }
    }

    private spy i(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spy) ipChange.ipc$dispatch("1ac9f426", new Object[]{this, spyVar});
        }
        if (spyVar == null) {
            return null;
        }
        Map map = spyVar.i;
        if (!ogv.a(map)) {
            Map a2 = smb.a(this.e.z(), spyVar);
            a(a2);
            map.put("options", a2);
        }
        spz.c("CardWeeXV2MessageHandler", "weex预创建weexInstanceRender,dispatchEvent：options:" + spyVar.i.get("options") + ",id:" + spyVar.d + ",name:" + spyVar.c);
        return spyVar;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.setGestureEventListener(new jvq() { // from class: tb.sgx.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvq
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || map.size() == 0) {
                    } else {
                        boolean a2 = oec.a(map.get("state"), false);
                        sgx.c(sgx.this, a2);
                        if (!a2 || !(sgx.p(sgx.this) instanceof RoundCornerLayout)) {
                            return;
                        }
                        String a3 = oec.a(map.get("acceptGestureType"), com.taobao.tao.flexbox.layoutmanager.view.b.PULL_INIT);
                        spz.c("CardWeeXV2MessageHandler", "gesture listener acceptGestureType:" + a3);
                        ((RoundCornerLayout) sgx.p(sgx.this)).setAcceptGestureType(a3);
                    }
                }
            });
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.c.setGestureStateListener(new c() { // from class: tb.sgx.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.ui.c
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    spz.c("CardWeeXV2MessageHandler", "gesture listener onGestureState:" + z);
                    sgx.c(sgx.this, z);
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.C = true;
            this.b.postDelayed(new Runnable() { // from class: tb.sgx.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!sgx.r(sgx.this)) {
                    } else {
                        sgx.t(sgx.this);
                        spz.c("CardWeeXV2MessageHandler", "onGestureState runnable clearpending:");
                    }
                }
            }, w());
        } else {
            spz.c("CardWeeXV2MessageHandler", "onGestureState runnable dopending:");
            m();
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        c(obw.WEEX_STATE_CONSUME);
        ViewGroup viewGroup = this.b;
        if (!(viewGroup instanceof RoundCornerLayout)) {
            return;
        }
        ((RoundCornerLayout) viewGroup).clearPendingEvent();
        this.b.requestDisallowInterceptTouchEvent(true);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.C = false;
        c(obw.WEEX_STATE_NOT_CONSUME);
        ViewGroup viewGroup = this.b;
        if (!(viewGroup instanceof RoundCornerLayout)) {
            return;
        }
        ((RoundCornerLayout) viewGroup).doPendingEvent();
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
        if (!E()) {
            return this.j.contains(spyVar.c) && (spyVar.d.equals(this.g) || "VSMSG_syncPageMap".equals(spyVar.c) || "VSMSG_syncProcessMap".equals(spyVar.c));
        } else if (!oeb.a("ShortVideo.fixMisMatchWeexId", true) || TextUtils.equals(spyVar.d, this.g)) {
            return true;
        } else {
            spz.c("CardWeeXV2MessageHandler", "message id not match return, msgId:" + spyVar.d + " currentId:" + this.g);
            return false;
        }
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (E()) {
            spz.c("CardWeeXV2MessageHandler", "weex预加载filterMessages为null 开始add 消息");
            this.j.addAll(list);
            if (!this.j.contains("VSMSG_supportGlobalMuteState")) {
                com.taobao.android.fluid.framework.mute.helper.f.a(this.e.z(), "Weex");
            }
            ArrayList arrayList = new ArrayList();
            for (WeakReference<sgx> weakReference : this.k) {
                sgx sgxVar = weakReference.get();
                if (sgxVar != null) {
                    sgxVar.n();
                    if (sgxVar.o()) {
                        arrayList.add(sgxVar);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                soi.a(this.k, (sgx) it.next());
            }
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!this.d || E()) {
        } else {
            this.i = 2;
        }
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.j.isEmpty();
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (E()) {
            spz.c("CardWeeXV2MessageHandler", "weex预加载handlePendingMessage(),isFilterMessagesEmpty return");
            return false;
        }
        spz.c("CardWeeXV2MessageHandler", "weex预加载handlePendingMessage(),paddingMsg size:" + this.f.size() + "，state:" + this.i);
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c) && spyVar.d.equals(this.g) && this.c != null) {
                spz.c("CardWeeXV2MessageHandler", "weex2 ready fireEvent onShortVideoMessage handlePendingMessage " + spyVar.toString() + "，args：" + spyVar.i);
                a(this.c, new JSONObject(spyVar.a()));
            }
        }
        this.f.clear();
        return true;
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

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        this.l = true;
        obt.a(view, oeb.a("ShortVideo.weexAnimDuration", 350));
    }

    public void a() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.E || (pVar = this.c) == null) {
        } else {
            pVar.onActivityStart();
            this.c.onActivityResume();
        }
    }

    public void b() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c(obw.WEEX_STATE_NOT_CONSUME);
        if (!this.E || (pVar = this.c) == null) {
            return;
        }
        pVar.onActivityPause();
        this.c.onActivityStop();
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c("CardWeeXV2MessageHandler", "销毁weex实例");
        super.cI_();
        p();
        v();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeView(this.h);
        }
        if (this.c == null) {
            return;
        }
        spz.c("CardWeeXV2MessageHandler", "checkTimeout timeout rebuildWeex destroyMusInstance " + this.t + "---" + this + "-----" + this.c.getInstanceId());
        this.c.destroy();
        this.c = null;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        } else {
            b(false);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.i = 3;
        psw pswVar = this.e;
        String str2 = this.f33566a;
        d.a(pswVar, "weex_v2_error", str2, this.e.v().a() + "", str, "");
        a("weex onRenderFailed", i, str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        } else {
            a("weex onRefreshFailed", i, str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        psw pswVar = this.e;
        String str2 = this.f33566a;
        d.a(pswVar, "weex_v2_runtime_exc", str2, this.e.w() + "", str, "");
        a("weex onJSException", i, str);
        try {
            if (!shg.f() || str == null || !str.contains("Weex js thread executed over")) {
                return;
            }
            this.u = false;
            this.v = false;
            if (this.B != null && this.t != null) {
                this.t.b(this.B);
            }
            if (this.A != null) {
                s();
            }
            spz.c("CardWeeXV2MessageHandler", "checkTimeout weex onJSException start rebuildWeex:" + str);
            a(this.y, false, pVar);
            d.b(this.e.z(), "weex_v2_pile_js_exception", str, 0L);
        } catch (Throwable th) {
            spz.c("CardWeeXV2MessageHandler", "weex onJSException rebuildWeex:" + th);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        this.i = 3;
        psw pswVar = this.e;
        String str2 = this.f33566a;
        d.a(pswVar, "weex_v2_fatal", str2, this.e.w() + "", str, "");
        a("weex onFatalException", i, str);
    }

    private void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        spz.c("CardWeeXV2MessageHandler", str + " errCode=" + i + ",errorMsg" + str2 + r() + q());
    }

    private String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        return ", title=" + sju.a(this.e) + "; " + this.t + "---" + this + " contentId=" + this.e.w();
    }

    private String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(", instance=");
        sb.append(this.c);
        sb.append(", instanceId=");
        p pVar = this.c;
        sb.append(pVar == null ? "null" : Integer.valueOf(pVar.getInstanceId()));
        return sb.toString();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.n) {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,开关关闭或者已经收到首帧return，mEnableDelayInit：" + this.n + ",mHasFirstFrameRender：" + this.q);
        } else if (x()) {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,isInterrupt需要return");
        } else {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,收到首帧回调");
            this.q = true;
            if (sjt.a("initweex2") && this.y != null) {
                spz.c("CardWeeXV2MessageHandler", "PickPreloadController，enableInteractOpt(initweex2)");
                v();
                a(this.y, false);
            } else if (this.p == null || !u()) {
            } else {
                spz.c("CardWeeXV2MessageHandler", "PickPreloadController，首帧后依然需要延迟创建");
                a(1);
            }
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = true;
        RenderTrackUtils.a(this.e.z(), RenderTrackUtils.renderEnd);
        FluidContext z3 = this.e.z();
        psw pswVar = this.e;
        RenderTrackUtils.a(z3, pswVar, "interact_first_cost_weex", pswVar.w());
        d.a(this.e, "weex_v2_end", this.f33566a, this.e.v().a() + "", "" + (SystemClock.elapsedRealtime() - this.m), "");
        c(obw.WEEX_STATE_NOT_CONSUME);
        n();
        o();
        StringBuilder sb = new StringBuilder();
        sb.append("weex onRenderSuccess ，instanceId=");
        p pVar = this.c;
        sb.append(pVar == null ? "null" : Integer.valueOf(pVar.getInstanceId()));
        spz.c("CardWeeXV2MessageHandler", sb.toString());
        if (this.e.r() == 0) {
            z2 = true;
        }
        if (z || !z2 || this.l) {
            return;
        }
        b(this.h);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (!sjt.b(this.e.z())) {
        } else {
            occ.a(FluidSDK.getContext(), occ.KEY_WEEX_LOAD_URL, str);
        }
    }

    private boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        if (sjt.t()) {
            return y();
        }
        return z();
    }

    private boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 && this.i != 1 && this.i != 6) {
            return false;
        }
        spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,状态不满足return,state：" + this.i);
        return true;
    }

    private boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        if (this.q) {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,开关关闭或者已经收到首帧return，mEnableDelayInit：" + this.n + ",mHasFirstFrameRender：" + this.q);
            return true;
        } else if (this.c == null) {
            return false;
        } else {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，onVideoFirstFrameRender,已经创建过musInstance实例 return");
            return true;
        }
    }

    private void b(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (!this.n || (sjt.a("initweex2") && this.q)) {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，延迟开关关闭|| (延时开关打开并且页面Appear收到首帧回调，无需再延迟) --直接创建");
            a(spyVar, false);
        } else {
            e(spyVar);
            a(!t());
        }
    }

    private void e(final spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940a1a0", new Object[]{this, spyVar});
        } else if (this.p != null) {
        } else {
            this.p = new Handler(Looper.getMainLooper()) { // from class: tb.sgx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else {
                        sgx.a(sgx.this, spyVar, false);
                    }
                }
            };
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            if (this.p.hasMessages(0)) {
                return;
            }
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，initWeexInstance,MSG_TIME_OUT_DELAY_INIT，首帧回调未回来补充逻辑");
            this.p.sendEmptyMessageDelayed(0, this.o);
        } else if (i != 1) {
        } else {
            if (this.p.hasMessages(0)) {
                spz.c("CardWeeXV2MessageHandler", "PickPreloadController，MSG_FIRST_FRAME_RENDER_DELAY_INIT,移除兜底逻辑");
                this.p.removeMessages(0);
            }
            if (this.p.hasMessages(1)) {
                return;
            }
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，initWeexInstance,MSG_FIRST_FRAME_RENDER_DELAY_INIT，首帧回调后延迟逻辑");
            this.p.sendEmptyMessageDelayed(1, this.s);
        }
    }

    private boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.n && !this.q;
    }

    private boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.n && this.s > 0;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (!this.n || this.p == null) {
        } else {
            spz.c("CardWeeXV2MessageHandler", "PickPreloadController，removeDelayMsg");
            this.p.removeCallbacksAndMessages(null);
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        DelayConfig b = b(this.e.z());
        if (b == null) {
            return;
        }
        if (B()) {
            ((IInteractionService) this.e.z().getService(IInteractionService.class)).getConfig().a(false);
            b.getClass();
            this.n = oec.a((Object) true, false);
            b.getClass();
            this.o = oec.a((Object) "3000", 0);
            if (this.n) {
                b.getClass();
                this.s = oec.a((Object) "1", 0);
            }
        }
        spz.c("CardWeeXV2MessageHandler", "weexDelay，initWeexInstance配置-mEnableDelayInit：" + this.n + "，mDelayInitDefaultTimeOut：" + this.o + " mDelayTimeAfterFirstFrameRender=" + this.s);
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        if (iqw.h()) {
            if (((IContainerService) this.e.z().getService(IContainerService.class)).isFirstCardRenderSuccess()) {
                z = false;
            }
        } else {
            z = ((IInteractionService) this.e.z().getService(IInteractionService.class)).getConfig().l();
        }
        spz.c("CardWeeXV2MessageHandler", "weexDelay，initWeexInstance配置-isDelayInitWeexAfterFirstFrameRender：" + z + "，mDelayInitDefaultTimeOut：" + this.o);
        return z;
    }

    private int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("gestureWaitScrollTime", 16);
    }
}
