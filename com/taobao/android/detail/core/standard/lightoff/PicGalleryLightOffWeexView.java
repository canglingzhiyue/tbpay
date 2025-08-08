package com.taobao.android.detail.core.standard.lightoff;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.h;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffPicComponent;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.eir;
import tb.emu;
import tb.jqm;
import tb.kge;
import tb.ljl;

/* loaded from: classes4.dex */
public class PicGalleryLightOffWeexView extends FrameLayout implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ON_DISMISS = "onDismiss";
    private static final String ACTION_ON_LOCATOR_TO = "onLocatorTo";
    private static final String ACTION_ON_LONGCLICK = "onLongClick";
    private static final String ACTION_ON_SHOW = "onShow";
    private static final String DEFAULT_DEVELOP_LOAD_URL = "https://market.wapa.taobao.com/app/detail-project/main-pic-fullscreen/home?wh_weex=true";
    private static final String DEFAULT_LOAD_URL = "https://market.m.taobao.com/app/detail-project/main-pic-fullscreen/home?wh_weex=true";
    private static final String TAG = "PicGalleryLightOff";
    private View mErrorView;
    private String mLoadUrl;
    private String mToken;
    private b mTransHelper;
    private WXSDKInstance mWeexInstance;
    private com.taobao.weex.d mWeexRenderListener;

    public static /* synthetic */ Object ipc$super(PicGalleryLightOffWeexView picGalleryLightOffWeexView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    public static /* synthetic */ void access$000(PicGalleryLightOffWeexView picGalleryLightOffWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12048ba", new Object[]{picGalleryLightOffWeexView});
        } else {
            picGalleryLightOffWeexView.showErrorView();
        }
    }

    public static /* synthetic */ b access$100(PicGalleryLightOffWeexView picGalleryLightOffWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("af650c93", new Object[]{picGalleryLightOffWeexView}) : picGalleryLightOffWeexView.mTransHelper;
    }

    static {
        kge.a(1842458992);
        kge.a(570372262);
        try {
            WXSDKEngine.registerComponent(PicGalleryLightOffVideoComponent.CLAZZ_NAME, PicGalleryLightOffVideoComponent.class);
            WXSDKEngine.registerComponent(PicGalleryLightOffPicComponent.CLAZZ_NAME, PicGalleryLightOffPicComponent.class);
        } catch (WXException e) {
            arc.a().c("PicGalleryLightOffWeexView", "WXSDKEngine.registerComponent failed", e.getMessage());
        }
    }

    public PicGalleryLightOffWeexView(Context context, String str) {
        super(context);
        this.mWeexRenderListener = new com.taobao.weex.d() { // from class: com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                } else if (view == PicGalleryLightOffWeexView.this.getChildAt(0)) {
                } else {
                    PicGalleryLightOffWeexView.this.removeAllViews();
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    PicGalleryLightOffWeexView.this.addView(view);
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                arc.a().c("PicGalleryLightOffWeexView", ljl.RENDER_SUCCESS_TIME, "");
                if (PicGalleryLightOffWeexView.this.getChildCount() == 0) {
                    PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                } else {
                    z = true;
                }
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(z);
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                } else {
                    arc.a().c("PicGalleryLightOffWeexView", "onRefreshSuccess", "");
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str2, str3});
                    return;
                }
                if (StringUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                if (StringUtils.isEmpty(str3)) {
                    str3 = "unknown";
                }
                ard a2 = arc.a();
                a2.c("PicGalleryLightOffWeexView", "onException", "errorCode:" + str2 + ",errorMsg:" + str3);
                PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                Context context2 = PicGalleryLightOffWeexView.this.getContext();
                h.a(context2, "industryPicGalleryLightOffError", str2 + "_" + str3);
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(false);
            }
        };
        this.mToken = str;
        init();
    }

    public PicGalleryLightOffWeexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWeexRenderListener = new com.taobao.weex.d() { // from class: com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                } else if (view == PicGalleryLightOffWeexView.this.getChildAt(0)) {
                } else {
                    PicGalleryLightOffWeexView.this.removeAllViews();
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    PicGalleryLightOffWeexView.this.addView(view);
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                arc.a().c("PicGalleryLightOffWeexView", ljl.RENDER_SUCCESS_TIME, "");
                if (PicGalleryLightOffWeexView.this.getChildCount() == 0) {
                    PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                } else {
                    z = true;
                }
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(z);
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                } else {
                    arc.a().c("PicGalleryLightOffWeexView", "onRefreshSuccess", "");
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str2, str3});
                    return;
                }
                if (StringUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                if (StringUtils.isEmpty(str3)) {
                    str3 = "unknown";
                }
                ard a2 = arc.a();
                a2.c("PicGalleryLightOffWeexView", "onException", "errorCode:" + str2 + ",errorMsg:" + str3);
                PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                Context context2 = PicGalleryLightOffWeexView.this.getContext();
                h.a(context2, "industryPicGalleryLightOffError", str2 + "_" + str3);
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(false);
            }
        };
        init();
    }

    public PicGalleryLightOffWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWeexRenderListener = new com.taobao.weex.d() { // from class: com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                } else if (view == PicGalleryLightOffWeexView.this.getChildAt(0)) {
                } else {
                    PicGalleryLightOffWeexView.this.removeAllViews();
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    PicGalleryLightOffWeexView.this.addView(view);
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i2, int i22) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i2), new Integer(i22)});
                    return;
                }
                arc.a().c("PicGalleryLightOffWeexView", ljl.RENDER_SUCCESS_TIME, "");
                if (PicGalleryLightOffWeexView.this.getChildCount() == 0) {
                    PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                } else {
                    z = true;
                }
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(z);
            }

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i2), new Integer(i22)});
                } else {
                    arc.a().c("PicGalleryLightOffWeexView", "onRefreshSuccess", "");
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str2, str3});
                    return;
                }
                if (StringUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                if (StringUtils.isEmpty(str3)) {
                    str3 = "unknown";
                }
                ard a2 = arc.a();
                a2.c("PicGalleryLightOffWeexView", "onException", "errorCode:" + str2 + ",errorMsg:" + str3);
                PicGalleryLightOffWeexView.access$000(PicGalleryLightOffWeexView.this);
                Context context2 = PicGalleryLightOffWeexView.this.getContext();
                h.a(context2, "industryPicGalleryLightOffError", str2 + "_" + str3);
                if (PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this) == null) {
                    return;
                }
                PicGalleryLightOffWeexView.access$100(PicGalleryLightOffWeexView.this).a(false);
            }
        };
        init();
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.mToken = str;
        }
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.mToken;
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void setLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3a6338", new Object[]{this, str});
        } else {
            this.mLoadUrl = str;
        }
    }

    public String getLoadUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42b77266", new Object[]{this}) : this.mLoadUrl;
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
        } else {
            this.mWeexInstance.c(TAG, getRealWeexUrl(), null, null, WXRenderStrategy.APPEND_ASYNC);
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        } else {
            this.mWeexInstance.a("onShow", (Map<String, Object>) null);
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6d0f54", new Object[]{this});
        } else {
            this.mWeexInstance.a(ACTION_ON_LONGCLICK, (Map<String, Object>) null);
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            this.mWeexInstance.a(ACTION_ON_DISMISS, (Map<String, Object>) null);
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.mWeexInstance.onActivityResume();
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.mWeexInstance.onActivityPause();
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.mWeexInstance.onActivityStop();
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mWeexInstance.onActivityDestroy();
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void onLocatorTo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba35ff7", new Object[]{this, jSONObject});
            return;
        }
        this.mWeexInstance.a(ACTION_ON_LOCATOR_TO, (Map<String, Object>) jSONObject);
        b bVar = this.mTransHelper;
        if (bVar == null) {
            return;
        }
        bVar.a(jSONObject);
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.c
    public void setTransHelpCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc90f69", new Object[]{this, bVar});
        } else {
            this.mTransHelper = bVar;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mWeexInstance = new WXSDKInstance(getContext());
        this.mWeexInstance.a(this.mWeexRenderListener);
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexView");
    }

    private void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        if (this.mErrorView == null) {
            this.mErrorView = View.inflate(getContext(), R.layout.pic_gallery_light_off_error_view, null);
            ((Button) this.mErrorView.findViewById(R.id.retryBtn)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        PicGalleryLightOffWeexView.this.loadView();
                    }
                }
            });
        }
        if (this.mErrorView.getParent() != null) {
            ((ViewGroup) this.mErrorView.getParent()).removeView(this.mErrorView);
        }
        addView(this.mErrorView);
    }

    private String getRealWeexUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a3363f", new Object[]{this});
        }
        String str = this.mLoadUrl;
        if (StringUtils.isEmpty(str)) {
            str = jqm.a() ? DEFAULT_DEVELOP_LOAD_URL : DEFAULT_LOAD_URL;
        }
        if (StringUtils.isEmpty(this.mToken)) {
            arc.a().b("PicGalleryLightOffWeexView", "loadView", "mToken is empty");
        } else {
            str = str + "&light_off_token=" + this.mToken;
        }
        if (com.taobao.android.detail.core.aura.utils.f.m()) {
            str = str + "&isSupportNativeVideo=true";
        }
        if (!eir.c(this.mWeexInstance.M())) {
            return str;
        }
        return str + "&pic_extend=true&pic_version=2";
    }
}
