package com.taobao.android.detail.industry.scene.weex2.ar;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.detail.industry.tool.c;
import com.taobao.android.detail.industry.tool.monitor.DIMonitorUtil;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.taobao.R;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import org.json.JSONObject;
import tb.bag;
import tb.dpx;
import tb.etb;
import tb.kge;

/* loaded from: classes4.dex */
public class ARMakeupWeexView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ARMakeupWeexView";
    private ARMakeupNativeView nativeView;
    private long openCameraTimeStamp;
    private final FrameLayout rootView;
    private final etb uploadService;

    static {
        kge.a(2029542711);
    }

    public static /* synthetic */ Object ipc$super(ARMakeupWeexView aRMakeupWeexView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(ARMakeupWeexView aRMakeupWeexView, JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f283426", new Object[]{aRMakeupWeexView, jSONObject, bVar});
        } else {
            aRMakeupWeexView.realOpenCamera(jSONObject, bVar);
        }
    }

    public static /* synthetic */ com.alibaba.fastjson.JSONObject access$100(ARMakeupWeexView aRMakeupWeexView, boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("cde4536e", new Object[]{aRMakeupWeexView, new Boolean(z), str}) : aRMakeupWeexView.assembleResult(z, str);
    }

    public static /* synthetic */ long access$200(ARMakeupWeexView aRMakeupWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4b7f805", new Object[]{aRMakeupWeexView})).longValue() : aRMakeupWeexView.openCameraTimeStamp;
    }

    public static /* synthetic */ void access$300(ARMakeupWeexView aRMakeupWeexView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78bd6e6", new Object[]{aRMakeupWeexView, str, str2});
        } else {
            aRMakeupWeexView.reportError(str, str2);
        }
    }

    public ARMakeupWeexView(Context context, int i) {
        super(context, i);
        this.uploadService = new etb();
        this.rootView = new FrameLayout(context);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.rootView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() == null) {
                return;
            }
            getArTryContainer().pause();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityPause", "ARMakeupView#InternalError");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() == null) {
                return;
            }
            getArTryContainer().resume();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityResume", "ARMakeupView#InternalError");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else {
            release();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            release();
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            if (this.nativeView == null) {
                return;
            }
            this.nativeView.destroy();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("onActivityDestroy", "ARMakeupView#InternalError");
        }
    }

    private ARTryViewContainer getArTryContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARTryViewContainer) ipChange.ipc$dispatch("9d838ea7", new Object[]{this});
        }
        String str = "getArTryContainer: getAuraWeexInstance()=" + getAuraWeexInstance();
        if (this.nativeView == null && getAuraWeexInstance() != null && (getAuraWeexInstance().j() instanceof ARMakeupNativeView)) {
            this.nativeView = (ARMakeupNativeView) getAuraWeexInstance().j();
        }
        if (this.nativeView == null) {
            this.nativeView = getARMakeupNativeView();
        }
        ARMakeupNativeView aRMakeupNativeView = this.nativeView;
        if (aRMakeupNativeView != null) {
            return aRMakeupNativeView.getArTryViewContainer();
        }
        return null;
    }

    private ARMakeupNativeView getNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARMakeupNativeView) ipChange.ipc$dispatch("64bf8bcc", new Object[]{this});
        }
        if (this.nativeView == null && getAuraWeexInstance() != null && (getAuraWeexInstance().j() instanceof ARMakeupNativeView)) {
            this.nativeView = (ARMakeupNativeView) getAuraWeexInstance().j();
        }
        if (this.nativeView == null) {
            this.nativeView = getARMakeupNativeView();
        }
        ARMakeupNativeView aRMakeupNativeView = this.nativeView;
        if (aRMakeupNativeView != null) {
            return aRMakeupNativeView;
        }
        return null;
    }

    private ARMakeupNativeView getARMakeupNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ARMakeupNativeView) ipChange.ipc$dispatch("d2f0aaf2", new Object[]{this});
        }
        View view = (View) getMUSInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        if (!(findViewById instanceof ARMakeupNativeView)) {
            return null;
        }
        return (ARMakeupNativeView) findViewById;
    }

    private bag getAuraWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bag) ipChange.ipc$dispatch("591b3988", new Object[]{this});
        }
        View view = (View) getMUSInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.aura_render_component_weex2_instance);
        if (!(tag instanceof bag)) {
            return null;
        }
        return (bag) tag;
    }

    @JSMethod
    public void openCamera(final JSONObject jSONObject, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec62447f", new Object[]{this, jSONObject, bVar});
            return;
        }
        try {
            this.openCameraTimeStamp = System.currentTimeMillis();
            c.a(getContext(), new Runnable() { // from class: com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ARMakeupWeexView.access$000(ARMakeupWeexView.this, jSONObject, bVar);
                    }
                }
            }, new Runnable() { // from class: com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bVar.a(ARMakeupWeexView.access$100(ARMakeupWeexView.this, false, "permissionDenied"));
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("openCamera", "ARMakeupView#InternalError");
        }
    }

    private void realOpenCamera(JSONObject jSONObject, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9146301", new Object[]{this, jSONObject, bVar});
            return;
        }
        String str = "openCamera: params=" + jSONObject;
        if (jSONObject == null || getNativeView() == null) {
            return;
        }
        this.nativeView.init(getContext());
        com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONObject.toString());
        if (com.taobao.android.detail.industry.tool.b.d() && parseObject.getJSONObject("sourceParam") != null && parseObject.getJSONObject("sourceParam").getJSONObject(BlobManager.BLOB_ELEM_TYPE_CAMERA) != null) {
            com.alibaba.fastjson.JSONObject jSONObject2 = parseObject.getJSONObject("sourceParam").getJSONObject(BlobManager.BLOB_ELEM_TYPE_CAMERA);
            jSONObject2.put("availablePreviewRatio", (Object) Double.valueOf(0.75d));
            jSONObject2.put("previewWidth", (Object) Integer.valueOf(this.nativeView.getHeight()));
            jSONObject2.put("previewHeight", (Object) Integer.valueOf(this.nativeView.getWidth()));
        }
        final ARTryViewContainer arTryContainer = getArTryContainer();
        arTryContainer.setupAREngine(parseObject, new dpx() { // from class: com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dpx
            public void a(boolean z, com.alibaba.fastjson.JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject3});
                    return;
                }
                DIMonitorUtil.a(com.taobao.android.detail.industry.tool.b.e(), "ar_mainPic4ARTrial", DIMonitorUtil.StageType.STAGE_OPEN_CAMERA.getValue(), System.currentTimeMillis() - ARMakeupWeexView.access$200(ARMakeupWeexView.this));
                String str2 = "openCamera: ret=" + z + ", data=" + jSONObject3;
                String string = jSONObject3.getString("resultCode");
                com.alibaba.fastjson.JSONObject access$100 = ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, string);
                if (!z) {
                    ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#openCamera", string);
                } else {
                    access$100.put("forceEnterAR", (Object) true);
                    arTryContainer.resume();
                }
                bVar.a(access$100);
            }
        });
    }

    @JSMethod
    public void applyEffect(JSONObject jSONObject, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cbeb5ef", new Object[]{this, jSONObject, bVar});
            return;
        }
        try {
            String str = "applyEffect: params=" + jSONObject;
            if (jSONObject == null || getArTryContainer() == null) {
                return;
            }
            getArTryContainer().applyAREffect(JSON.parseObject(jSONObject.toString()), new dpx() { // from class: com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dpx
                public void a(boolean z, com.alibaba.fastjson.JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject2});
                        return;
                    }
                    String str2 = "applyEffect: ret=" + z + ", data=" + jSONObject2;
                    String string = jSONObject2.getString("resultCode");
                    if (!z) {
                        ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#applyEffect", string);
                    }
                    bVar.a(ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, string));
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("applyEffect", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void clearEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3848e3c5", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() == null) {
                return;
            }
            getArTryContainer().clearAllEffect();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("clearEffect", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() == null) {
                return;
            }
            getArTryContainer().resume();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("resume", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        try {
            if (getArTryContainer() == null) {
                return;
            }
            getArTryContainer().pause();
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("pause", "ARMakeupView#InternalError");
        }
    }

    @JSMethod
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            release();
        }
    }

    @JSMethod
    public void getScreenshotUrl(JSONObject jSONObject, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0eb369b", new Object[]{this, jSONObject, bVar});
            return;
        }
        try {
            this.uploadService.a(getArTryContainer());
            this.uploadService.a(new etb.a() { // from class: com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.etb.a
                public void a(boolean z, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
                        return;
                    }
                    String str3 = "getScreenshotUrl: ret=" + z + ", code=" + str + ", url=" + str2;
                    com.alibaba.fastjson.JSONObject access$100 = ARMakeupWeexView.access$100(ARMakeupWeexView.this, z, str);
                    if (!z) {
                        ARMakeupWeexView.access$300(ARMakeupWeexView.this, "ARMakeupView#getScreenshotUrl", str);
                    } else {
                        access$100.put("url", (Object) str2);
                    }
                    bVar.a(access$100);
                }
            });
            this.uploadService.a(jSONObject.getString("bizCode"));
        } catch (Throwable th) {
            th.printStackTrace();
            reportError("getScreenshotUrl", "ARMakeupView#InternalError");
        }
    }

    private void reportError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{this, str, str2});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        if (auraWeexInstance == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str2);
        auraWeexInstance.a(str, hashMap);
    }

    private com.alibaba.fastjson.JSONObject assembleResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("a5f36568", new Object[]{this, new Boolean(z), str});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (!z) {
            jSONObject.put("errorCode", (Object) str);
        }
        return jSONObject;
    }
}
