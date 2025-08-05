package com.taobao.android.detail.industry.scene.weex2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryViewContainer;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.bag;
import tb.dpx;
import tb.ekb;
import tb.eke;
import tb.etd;
import tb.kge;

/* loaded from: classes4.dex */
public class DIWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1294944975);
    }

    public static /* synthetic */ Object ipc$super(DIWeex2Module dIWeex2Module, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(DIWeex2Module dIWeex2Module, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bf036c", new Object[]{dIWeex2Module, bVar});
        } else {
            dIWeex2Module.callSuccess(bVar);
        }
    }

    public static /* synthetic */ JSONObject access$100(DIWeex2Module dIWeex2Module, boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("926ee0a8", new Object[]{dIWeex2Module, new Boolean(z), str}) : dIWeex2Module.assembleResult(z, str);
    }

    public DIWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public void isSupport(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fb472d", new Object[]{this, str, bVar});
        } else if (str.equals("expendPicGallery") && com.taobao.android.detail.industry.tool.b.b()) {
            callSuccess(bVar);
        } else if (str.equals("requestARTryPermission")) {
            callSuccess(bVar);
        } else {
            callError(bVar, "");
        }
    }

    @MUSMethod
    public void requestARTryPermission(String str, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6a3d72", new Object[]{this, str, bVar});
            return;
        }
        try {
            com.taobao.android.detail.industry.tool.c.a(getInstance().getUIContext(), new Runnable() { // from class: com.taobao.android.detail.industry.scene.weex2.DIWeex2Module.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DIWeex2Module.access$000(DIWeex2Module.this, bVar);
                    }
                }
            }, new Runnable() { // from class: com.taobao.android.detail.industry.scene.weex2.DIWeex2Module.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bVar.a(DIWeex2Module.access$100(DIWeex2Module.this, false, "permissionDenied"));
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            callError(bVar, "" + th.getMessage());
        }
    }

    @MUSMethod(uiThread = true)
    public void onError(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39f8e51", new Object[]{this, str, bVar});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        try {
            com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "onError:" + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                bVar.a("no params");
            } else if (auraWeexInstance != null) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(parseObject);
                auraWeexInstance.a("onJsError", hashMap);
                callSuccess(bVar);
            } else if (getDetail3NewHeaderARComponent() != null) {
                callSuccess(bVar);
            } else {
                callError(bVar, "report failed");
            }
        } catch (Exception e) {
            callError(bVar, e.getMessage());
            if (auraWeexInstance == null) {
                return;
            }
            auraWeexInstance.a(str + "|" + e.getMessage(), null);
        }
    }

    @MUSMethod
    public void prefetchMakeupModel(String str, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2678411", new Object[]{this, str, bVar});
        } else if (str == null) {
        } else {
            try {
                ARTryViewContainer.downloadResources(getInstance().getContext().a(), JSON.parseObject(str), new dpx() { // from class: com.taobao.android.detail.industry.scene.weex2.DIWeex2Module.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.dpx
                    public void a(boolean z, JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
                        } else {
                            bVar.a(DIWeex2Module.access$100(DIWeex2Module.this, z, jSONObject != null ? jSONObject.getString("code") : ""));
                        }
                    }
                });
            } catch (Exception e) {
                callError(bVar, e.getMessage());
                bag auraWeexInstance = getAuraWeexInstance();
                if (auraWeexInstance == null) {
                    return;
                }
                auraWeexInstance.a("prefetchMakeupModel|" + e.getMessage(), null);
            }
        }
    }

    @MUSMethod
    public void expendPicGallery(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de3ee4e", new Object[]{this, str, bVar});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        try {
            if (auraWeexInstance != null) {
                s b = auraWeexInstance.g().b();
                if (b == null) {
                    com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "expendPicGallery auraInstance null");
                } else {
                    AURARenderComponent d = auraWeexInstance.d();
                    com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
                    dVar.a(d);
                    com.alibaba.android.aura.service.event.c.a(b, eke.EVENT_TYPE, dVar);
                    com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "expendPicGallery send auraEvent");
                }
                callSuccess(bVar);
                return;
            }
            TTDetailARWeex2Component detail3NewHeaderARComponent = getDetail3NewHeaderARComponent();
            if (detail3NewHeaderARComponent == null) {
                return;
            }
            callSuccess(bVar);
            detail3NewHeaderARComponent.expandComponent();
        } catch (Exception e) {
            callError(bVar, e.getMessage());
            if (auraWeexInstance == null) {
                return;
            }
            auraWeexInstance.a("expendPicGallery|" + e.getMessage(), null);
        }
    }

    @MUSMethod
    public void exitExpendPicGallery(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e305a80c", new Object[]{this, str, bVar});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        try {
            if (auraWeexInstance != null) {
                s b = auraWeexInstance.g().b();
                if (b == null) {
                    com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "exitExpendPicGallery auraInstance null");
                } else {
                    AURARenderComponent d = auraWeexInstance.d();
                    com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
                    dVar.a(d);
                    com.alibaba.android.aura.service.event.c.a(b, ekb.EVENT_TYPE, dVar);
                    com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "exitExpendPicGallery send auraEvent");
                }
                callSuccess(bVar);
                return;
            }
            TTDetailARWeex2Component detail3NewHeaderARComponent = getDetail3NewHeaderARComponent();
            if (detail3NewHeaderARComponent == null) {
                return;
            }
            callSuccess(bVar);
            detail3NewHeaderARComponent.shrinkComponent();
        } catch (Exception e) {
            callError(bVar, e.getMessage());
            if (auraWeexInstance == null) {
                return;
            }
            auraWeexInstance.a("exitExpendPicGallery|" + e.getMessage(), null);
        }
    }

    private JSONObject assembleResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5f36568", new Object[]{this, new Boolean(z), str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (!z) {
            jSONObject.put("code", (Object) str);
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = true)
    public void selectSKU(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7347db69", new Object[]{this, str, bVar});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        try {
            com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "selectSKU:" + str);
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                callError(bVar, "no params");
                return;
            }
            String str2 = (String) parseObject.get("skuId");
            String str3 = (String) parseObject.get(g.KEY_PV_PATH);
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str2)) {
                callError(bVar, "skuId invalid and pvPath invalid");
            } else if (auraWeexInstance != null) {
                q g = auraWeexInstance.g();
                if (g != null && g.e() != null) {
                    etd.a(str2, str3, g.e());
                    callSuccess(bVar);
                    return;
                }
                callError(bVar, "cannot get context");
            } else if (getDetail3NewHeaderARComponent() != null) {
                callSuccess(bVar);
            } else {
                callError(bVar, "get instance fail");
            }
        } catch (Exception e) {
            callError(bVar, e.getMessage());
            if (auraWeexInstance == null) {
                return;
            }
            auraWeexInstance.a(str + "|" + e.getMessage(), null);
        }
    }

    @MUSMethod(uiThread = true)
    public void openCameraSetting(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54581abf", new Object[]{this, jSONObject, bVar});
            return;
        }
        bag auraWeexInstance = getAuraWeexInstance();
        try {
            com.taobao.android.detail.industry.tool.a.a("DIWeex2Module", "openCameraSetting:" + jSONObject.toJSONString());
            goIntentSetting(getInstance().getUIContext());
            callSuccess(bVar);
        } catch (Exception e) {
            callError(bVar, e.getMessage());
            if (auraWeexInstance == null) {
                return;
            }
            auraWeexInstance.a("selectSKU|" + jSONObject.toJSONString() + "|" + e.getMessage(), null);
        }
    }

    private void callSuccess(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d374afe3", new Object[]{this, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) "success");
        bVar.a(jSONObject);
    }

    private void callError(com.taobao.android.weex_framework.bridge.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebe2c32", new Object[]{this, bVar, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) "fail");
        jSONObject.put("errorMsg", (Object) str);
        bVar.a(jSONObject);
    }

    private TTDetailARWeex2Component getDetail3NewHeaderARComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailARWeex2Component) ipChange.ipc$dispatch("7b1c1e6e", new Object[]{this});
        }
        View view = (View) getInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        if (findViewById instanceof ARMakeupNativeView) {
            Object tag = ((ARMakeupNativeView) findViewById).getTag();
            if (tag instanceof TTDetailARWeex2Component) {
                return (TTDetailARWeex2Component) tag;
            }
        }
        return null;
    }

    private bag getAuraWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bag) ipChange.ipc$dispatch("591b3988", new Object[]{this});
        }
        View view = (View) getInstance().getRenderRoot().getParent();
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.aura_render_component_weex2_instance);
        if (!(tag instanceof bag)) {
            return null;
        }
        return (bag) tag;
    }

    public void goIntentSetting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cc8495", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }
}
