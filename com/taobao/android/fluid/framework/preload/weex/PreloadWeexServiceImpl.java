package com.taobao.android.fluid.framework.preload.weex;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.a;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.e;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import java.util.Map;
import tb.jvb;
import tb.kge;
import tb.obu;
import tb.occ;
import tb.oec;
import tb.ogv;
import tb.ohd;
import tb.sjt;
import tb.smb;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public class PreloadWeexServiceImpl implements IPreloadWeexService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PreloadWeexServiceImpl";
    private static final int WEEX_VIEW_LAYER_TOP_LEVEL = 52;
    private ViewGroup mContainerView;
    private Context mContext;
    private final FluidContext mFluidContext;
    private PreloadWeexData mPreloadWeexData = new PreloadWeexData();
    private s mWeexInstanceCreateCallback;

    static {
        kge.a(-1516367734);
        kge.a(-116423627);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    public static /* synthetic */ PreloadWeexData access$000(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadWeexData) ipChange.ipc$dispatch("b8d3026f", new Object[]{preloadWeexServiceImpl}) : preloadWeexServiceImpl.mPreloadWeexData;
    }

    public static /* synthetic */ PreloadWeexData access$002(PreloadWeexServiceImpl preloadWeexServiceImpl, PreloadWeexData preloadWeexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadWeexData) ipChange.ipc$dispatch("551a6c98", new Object[]{preloadWeexServiceImpl, preloadWeexData});
        }
        preloadWeexServiceImpl.mPreloadWeexData = preloadWeexData;
        return preloadWeexData;
    }

    public static /* synthetic */ Context access$100(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4f46e595", new Object[]{preloadWeexServiceImpl}) : preloadWeexServiceImpl.mContext;
    }

    public static /* synthetic */ void access$200(PreloadWeexServiceImpl preloadWeexServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27535e28", new Object[]{preloadWeexServiceImpl, str});
        } else {
            preloadWeexServiceImpl.logPreloadWeexData(str);
        }
    }

    public static /* synthetic */ ViewGroup access$300(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b6d1516", new Object[]{preloadWeexServiceImpl}) : preloadWeexServiceImpl.mContainerView;
    }

    public PreloadWeexServiceImpl(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mContext = this.mFluidContext.getContext();
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void createWeexInstance(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92d159d", new Object[]{this, context, aVar});
            return;
        }
        String weexLoadUrl = getWeexLoadUrl();
        if (!sjt.b(this.mFluidContext) || StringUtils.isEmpty(weexLoadUrl)) {
            return;
        }
        updatePreloadAsyncWeexInstanceFlag();
        this.mContext = context;
        b bVar = new b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        weexUnicornConfig.a(true);
        bVar.a(weexUnicornConfig);
        q b = e.b(context, weexLoadUrl, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        b.a(weexLoadUrl);
        b.a(e.b().a(createPreloadAsyncWeexInitData(this.mFluidContext, aVar)));
        initWeexInstanceCreateCallback();
        b.a(this.mWeexInstanceCreateCallback);
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void startRender(Context context, ViewGroup viewGroup, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63aa6604", new Object[]{this, context, viewGroup, aVar});
        } else if (!sjt.b(this.mFluidContext)) {
        } else {
            this.mContainerView = viewGroup;
            createWeexInstance(context, aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public boolean tryAddWeexViewToContainer(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50639424", new Object[]{this, viewGroup})).booleanValue();
        }
        if (!sjt.q()) {
            return false;
        }
        if (this.mPreloadWeexData == null && viewGroup == null) {
            return false;
        }
        spz.c(TAG, "weex预创建try add weex view to container, mPreloadWeexData: " + this.mPreloadWeexData);
        boolean addWeexViewToContainer = addWeexViewToContainer(viewGroup);
        if (addWeexViewToContainer) {
            detachVideoViewFromContainerSafely(viewGroup, this.mPreloadWeexData);
        }
        return addWeexViewToContainer;
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void removePreAttachedWeexInstance() {
        p musInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517f55a0", new Object[]{this});
            return;
        }
        try {
            spz.c(TAG, "removePreAttachedWeexInstance getMusInstance:" + getMusInstance());
            if (getMusInstance() == null || (musInstance = getMusInstance()) == null || musInstance.getRenderRoot() == null) {
                return;
            }
            final View renderRoot = musInstance.getRenderRoot();
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view = renderRoot;
                    if (view == null || !(view.getParent() instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) renderRoot.getParent()).removeView(renderRoot);
                    spz.c(PreloadWeexServiceImpl.TAG, "PickPreloadControllerNew,weexView 移除清空");
                    if (PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this) != null) {
                        PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this).a((WeexInstance) null);
                    }
                    PreloadWeexServiceImpl.access$002(PreloadWeexServiceImpl.this, null);
                }
            });
        } catch (Throwable th) {
            spz.c(TAG, "removePreAttachedWeexInstance " + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public PreloadWeexData getPreloadWeexData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadWeexData) ipChange.ipc$dispatch("7d3eaad8", new Object[]{this}) : this.mPreloadWeexData;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mPreloadWeexData = null;
        this.mWeexInstanceCreateCallback = null;
    }

    private JSONObject createPreloadAsyncWeexInitData(FluidContext fluidContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a715b4e9", new Object[]{this, fluidContext, aVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (aVar != null && aVar.a() != null) {
            Map a2 = aVar.a().a(this.mFluidContext);
            if (!ogv.a(a2)) {
                spz.c(TAG, "createPreloadAsyncWeexInitData,有model数据，构建model数据");
                jSONObject.put("model", (Object) a2);
            }
        }
        Map a3 = smb.a(fluidContext, null);
        if (!ogv.a(a3)) {
            spz.c(TAG, "createPreloadAsyncWeexInitData,底部bar高度：" + a3.get("actionBarHeight") + ",isImmersiveVideo:" + a3.get("isImmersiveVideo"));
        }
        a3.put("isColdStartFirstInstance", true);
        jSONObject.put("options", (Object) a3);
        return jSONObject;
    }

    private static String getWeexLoadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b09e007", new Object[0]);
        }
        String a2 = occ.a(FluidSDK.getContext(), occ.KEY_WEEX_LOAD_URL);
        spz.c(TAG, "getWeexLoadUrl:" + a2);
        return a2;
    }

    private void updatePreloadAsyncWeexInstanceFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae93db45", new Object[]{this});
        } else {
            this.mPreloadWeexData.a(true);
        }
    }

    private boolean addWeexViewToContainer(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fca1b09", new Object[]{this, viewGroup})).booleanValue();
        }
        p musInstance = getMusInstance();
        if (viewGroup == null || musInstance == null) {
            spz.c(TAG, "weex预创建addVideoViewToContainer return for musInstance or containerView is null");
            return false;
        }
        View renderRoot = musInstance.getRenderRoot();
        if (renderRoot == null || renderRoot.getParent() != null || !canWeexAttachAtContext(viewGroup.getContext())) {
            spz.c(TAG, "weex预创建addVideoViewToContainer return for weexView is not valid");
            return false;
        }
        if (sjt.z()) {
            layoutParams = new FrameLayout.LayoutParams(ohd.f(this.mContext), obu.a(this.mContext, spj.d(this.mFluidContext)) - obu.b());
            layoutParams.topMargin = ohd.h(this.mContext);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        spz.c(TAG, "weex预创建PickPreloadControllerNew,addWeexViewToContainer:" + renderRoot + "containerView height:" + viewGroup.getHeight() + "containerView  height:" + viewGroup.getHeight());
        TNodeView.a aVar = new TNodeView.a() { // from class: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.a
            public void a(TNodeView tNodeView, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cec5caad", new Object[]{this, tNodeView, view});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.a
            public void b(TNodeView tNodeView, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf94492e", new Object[]{this, tNodeView, view});
                }
            }
        };
        if (viewGroup instanceof TNodeView) {
            ((TNodeView) viewGroup).addUpperView(renderRoot, layoutParams, 52, aVar);
        } else {
            viewGroup.addView(renderRoot, layoutParams);
        }
        return true;
    }

    private boolean canWeexAttachAtContext(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c03d5df", new Object[]{this, context})).booleanValue() : inSameContextForWeex(context);
    }

    private boolean inSameContextForWeex(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4e96b1f", new Object[]{this, context})).booleanValue() : (getMusInstance() == null || getMusInstance().getRenderRoot() == null || getMusInstance().getRenderRoot().getContext() != context) ? false : true;
    }

    private p getMusInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("d13ef4ce", new Object[]{this});
        }
        PreloadWeexData preloadWeexData = this.mPreloadWeexData;
        if (preloadWeexData != null && preloadWeexData.a() != null) {
            return this.mPreloadWeexData.a();
        }
        return null;
    }

    private void detachVideoViewFromContainerSafely(final ViewGroup viewGroup, final PreloadWeexData preloadWeexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d1a999", new Object[]{this, viewGroup, preloadWeexData});
        } else if (preloadWeexData == null) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PreloadWeexData preloadWeexData2 = preloadWeexData;
                    if (preloadWeexData2 == null || preloadWeexData2.a() == null) {
                        return;
                    }
                    View renderRoot = preloadWeexData.a().getRenderRoot();
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 == null || renderRoot == null) {
                        return;
                    }
                    if (!(viewGroup2 instanceof TNodeView)) {
                        viewGroup2.removeView(renderRoot);
                    } else if (!((TNodeView) viewGroup2).containView(renderRoot)) {
                    } else {
                        spz.c(PreloadWeexServiceImpl.TAG, "weex预创建detachWeexViewFromContainerSafely");
                        ((TNodeView) viewGroup).removeUpperView(renderRoot);
                    }
                }
            }, 5000L);
        }
    }

    private void initWeexInstanceCreateCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d18cee", new Object[]{this});
        } else if (this.mWeexInstanceCreateCallback != null) {
        } else {
            this.mWeexInstanceCreateCallback = new s() { // from class: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.s
                public void a(s.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8d89384", new Object[]{this, aVar});
                        return;
                    }
                    spz.c(PreloadWeexServiceImpl.TAG, "onInstanceCreatedInMain,获取异步weex实例");
                    WeexInstance a2 = aVar.a(PreloadWeexServiceImpl.access$100(PreloadWeexServiceImpl.this));
                    jvb adapterMUSInstance = ((WeexInstanceImpl) a2).getAdapterMUSInstance();
                    if (adapterMUSInstance != null) {
                        adapterMUSInstance.registerRenderListener(new a.C0497a() { // from class: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.fluid.framework.preload.a.C0497a, com.taobao.android.weex_framework.g
                            public void onRenderSuccess(p pVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                                    return;
                                }
                                PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this).a(2);
                                PreloadWeexServiceImpl.access$200(PreloadWeexServiceImpl.this, "RENDER_SUCCESS");
                            }

                            @Override // com.taobao.android.fluid.framework.preload.a.C0497a, com.taobao.android.weex_framework.g
                            public void onRenderFailed(p pVar, int i, String str, boolean z) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                                    return;
                                }
                                PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this).a(3);
                                PreloadWeexServiceImpl.access$200(PreloadWeexServiceImpl.this, "RENDER_FAIL");
                            }
                        });
                        PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this).a(a2);
                        PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this).a(1);
                        PreloadWeexServiceImpl.access$200(PreloadWeexServiceImpl.this, "CREATE_INSTANCE");
                    }
                    spz.c(PreloadWeexServiceImpl.TAG, "weex预创建,mPreloadWeexData:" + PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this));
                    PreloadWeexServiceImpl preloadWeexServiceImpl = PreloadWeexServiceImpl.this;
                    preloadWeexServiceImpl.tryAddWeexViewToContainer(PreloadWeexServiceImpl.access$300(preloadWeexServiceImpl));
                }
            };
        }
    }

    private void logPreloadWeexData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9be721", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",weex预创建:");
        PreloadWeexData preloadWeexData = this.mPreloadWeexData;
        sb.append(preloadWeexData != null ? preloadWeexData.toString() : null);
        spz.c(TAG, sb.toString());
    }
}
