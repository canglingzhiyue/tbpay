package com.taobao.android.detail.industry.scene.weex2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.taobao.R;
import tb.etm;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class TTDetailARWeex2Component extends etm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_NAME_LIFE_CYCLE = "lifecycle";
    private static final String KEY_FIELDS_PARAMS = "params";
    private static final String KEY_FIELDS_PARAMS_BRIDGE_DATA = "bridgeData";
    private static final String KEY_FIELDS_PARAMS_BRIDGE_DATA_WEEX_URL = "weexUrl";
    private static final String KEY_FIELDS_URL = "url";
    private static final String MODULE_NAME = "detailIndustry";
    private static final String PLATFORM_VIEW_NAME = "armakeup";
    private static final String WEXX_EVENT_MODULE = "detailWeex2";
    private ARMakeupNativeView mARMakeupNativeView;
    private volatile boolean mHasRender;
    private p mMUSInstance;
    private View mWeexContentView;

    static {
        kge.a(1490531509);
    }

    public static /* synthetic */ Object ipc$super(TTDetailARWeex2Component tTDetailARWeex2Component, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1978560141:
                super.onActivityPageResumed((Activity) objArr[0]);
                return null;
            case -1898152289:
                super.onComponentExpand();
                return null;
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1634521564:
                super.onActivityPagePaused((Activity) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 413640386:
                super.onCreate();
                return null;
            case 502306446:
                super.onComponentShrink();
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View access$002(TTDetailARWeex2Component tTDetailARWeex2Component, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e90c68e1", new Object[]{tTDetailARWeex2Component, view});
        }
        tTDetailARWeex2Component.mWeexContentView = view;
        return view;
    }

    public static /* synthetic */ ScrollFrameLayout access$100(TTDetailARWeex2Component tTDetailARWeex2Component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollFrameLayout) ipChange.ipc$dispatch("d11208a0", new Object[]{tTDetailARWeex2Component}) : tTDetailARWeex2Component.mContentContainer;
    }

    public static /* synthetic */ void access$200(TTDetailARWeex2Component tTDetailARWeex2Component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef9013", new Object[]{tTDetailARWeex2Component});
        } else {
            tTDetailARWeex2Component.addContentView();
        }
    }

    public TTDetailARWeex2Component(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        MUSEngine.registerPlatformView("armakeup", ARMakeupWeexView.class);
        this.mARMakeupNativeView = new ARMakeupNativeView(context);
        this.mARMakeupNativeView.setId(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        this.mARMakeupNativeView.setTag(this);
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.a(new f() { // from class: com.taobao.android.detail.industry.scene.weex2.TTDetailARWeex2Component.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                TTDetailARWeex2Component.access$002(TTDetailARWeex2Component.this, view);
                if (TTDetailARWeex2Component.access$100(TTDetailARWeex2Component.this) == null) {
                    return;
                }
                TTDetailARWeex2Component.access$200(TTDetailARWeex2Component.this);
            }
        });
        this.mMUSInstance = q.a().a(this.mContext, mUSInstanceConfig);
    }

    @Override // tb.etm
    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
            return;
        }
        super.onActivityPageResumed(activity);
        if (activity != this.mContext) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onResume");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm
    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
            return;
        }
        super.onActivityPagePaused(activity);
        if (activity != this.mContext) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onPause");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm
    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
            return;
        }
        super.onComponentExpand();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onExpend");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm
    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
            return;
        }
        super.onComponentShrink();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onExpendExit");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm, com.taobao.android.detail.ttdetail.component.module.d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        MUSEngine.registerModule(MODULE_NAME, DIWeex2Module.class);
        MUSEngine.registerPlatformView("armakeup", ARMakeupWeexView.class);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        renderUrl();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onAppear");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm, com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifecycle", (Object) "onDisappear");
        this.mMUSInstance.fireEvent(1, "detailWeex2", jSONObject);
    }

    @Override // tb.etm
    public void onViewUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e7b33e", new Object[]{this, view});
        } else if (this.mWeexContentView == null) {
        } else {
            addContentView();
        }
    }

    private void addContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d9bd64", new Object[]{this});
        } else if (this.mContentContainer.getChildAt(0) == this.mARMakeupNativeView && this.mContentContainer.getChildAt(1) == this.mWeexContentView) {
        } else {
            this.mContentContainer.removeAllViews();
            this.mContentContainer.addView(this.mARMakeupNativeView, new FrameLayout.LayoutParams(-1, -1, 17));
            this.mContentContainer.addView(this.mWeexContentView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    private void renderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ab7c00", new Object[]{this});
        } else if (this.mHasRender) {
        } else {
            this.mMUSInstance.initWithURL(Uri.parse(getWeexUrl()));
            this.mMUSInstance.render(getInitRenderData(), null);
            this.mHasRender = true;
        }
    }

    private String getWeexUrl() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        JSONObject jSONObject2 = d.getJSONObject("params");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("bridgeData")) != null) {
            String string = jSONObject.getString(KEY_FIELDS_PARAMS_BRIDGE_DATA_WEEX_URL);
            if (!StringUtils.isEmpty(string)) {
                return string;
            }
        }
        return d.getString("url");
    }

    private JSONObject getInitRenderData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("448fed2d", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d != null && (jSONObject = d.getJSONObject("params")) != null) {
            return jSONObject.getJSONObject("bridgeData");
        }
        return null;
    }

    @Override // tb.etm, com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mMUSInstance.destroy();
    }
}
