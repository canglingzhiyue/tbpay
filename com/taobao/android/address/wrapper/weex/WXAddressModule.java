package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.a;
import com.taobao.android.address.wrapper.c;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

/* loaded from: classes4.dex */
public class WXAddressModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "addressModule";
    private String currentSelectType;

    public static /* synthetic */ Object ipc$super(WXAddressModule wXAddressModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else if (hashCode != 1692842255) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityPause();
            return null;
        }
    }

    public static /* synthetic */ void access$000(WXAddressModule wXAddressModule, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d2879", new Object[]{wXAddressModule, jSCallback});
        } else {
            wXAddressModule.returnErr(jSCallback);
        }
    }

    @JSMethod(uiThread = true)
    public void getAddressParams(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f3625", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (this.mWXSDKInstance != null && this.mWXSDKInstance.O() != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (c.s != null) {
                    jSONObject2.put(c.K_DELIVERY_ID, (Object) c.s.deliverId);
                    jSONObject2.put(c.g, (Object) c.s.agencyReceive);
                    jSONObject2.put(c.h, (Object) c.s.agencyReceiveH5Url);
                    jSONObject2.put(c.i, (Object) c.s.agencyReceiveHelpUrl);
                    jSONObject2.put(c.k, (Object) Boolean.valueOf(c.s.abroadStation));
                    jSONObject2.put(c.j, (Object) Boolean.valueOf(c.s.supportStation));
                    jSONObject2.put(c.m, (Object) Boolean.valueOf(c.s.needChangeKinship));
                    jSONObject2.put(c.n, (Object) c.s.relationId);
                    jSONObject2.put("source", (Object) c.s.source);
                    jSONObject2.put(c.l, (Object) c.s.sites);
                    jSONObject2.put("extMap", (Object) c.s.extMap);
                    jSONObject2.put(c.o, (Object) c.s.sellerID);
                    jSONObject2.put(c.p, (Object) c.s.deliverAddrList);
                    jSONObject2.put(c.q, (Object) c.s.accurateAddressInfo);
                    jSONObject2.put(c.r, (Object) c.s.bizcode);
                    if (c.s.extNativeJson != null) {
                        jSONObject2.put(c.w, (Object) c.s.extNativeJson);
                    }
                    if (c.s.extUrlJson != null) {
                        jSONObject2.put(c.x, (Object) c.s.extUrlJson);
                    }
                }
                jSCallback.invoke(jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
                returnErr(jSCallback2);
            }
        } else {
            returnErr(jSCallback2);
        }
    }

    private void returnErr(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f59e2ec", new Object[]{this, jSCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) (-1));
        jSONObject.put("message", (Object) "fail");
        if (jSCallback == null) {
            return;
        }
        jSCallback.invoke(jSONObject);
    }

    @JSMethod(uiThread = true)
    public void userChoosedAddress(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e32597", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (this.mWXSDKInstance != null && jSONObject != null && this.mWXSDKInstance.O() != null && (this.mWXSDKInstance.O() instanceof Activity)) {
            WVAddressModule.userChoosedAddress((Activity) this.mWXSDKInstance.O(), jSONObject.toJSONString());
        } else if (this.mWXSDKInstance.O() == null || !(this.mWXSDKInstance.O() instanceof Activity)) {
        } else {
            WVAddressModule.cancel((Activity) this.mWXSDKInstance.O());
        }
    }

    @JSMethod(uiThread = true)
    public void openH5Page(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8b87e3", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (this.mWXSDKInstance == null || jSONObject == null || this.mWXSDKInstance.O() == null || !(this.mWXSDKInstance.O() instanceof Activity)) {
        } else {
            String openH5Page = WVAddressModule.openH5Page((Activity) this.mWXSDKInstance.O(), jSONObject.toJSONString());
            if (StringUtils.isEmpty(openH5Page)) {
                return;
            }
            this.currentSelectType = openH5Page;
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1 && i2 == 1) {
            if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null) {
                return;
            }
            WVAddressModule.executeActivityResult((Activity) this.mWXSDKInstance.O(), intent, false);
        } else if (i == 9876 && i2 == 9876) {
            if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null) {
                return;
            }
            WVAddressModule.storeFinish((Activity) this.mWXSDKInstance.O(), intent, this.currentSelectType);
        } else if (i == 2) {
            if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null) {
                return;
            }
            WVAddressModule.executeActivityResult((Activity) this.mWXSDKInstance.O(), intent, true);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @JSMethod(uiThread = true)
    public void speechRecognition(JSONObject jSONObject, final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32386f4", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null || !(this.mWXSDKInstance.O() instanceof Activity)) {
        } else {
            WVAddressModule.speechRecognition((Activity) this.mWXSDKInstance.O(), jSONObject.toJSONString(), new a() { // from class: com.taobao.android.address.wrapper.weex.WXAddressModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.address.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (jSCallback == null) {
                    } else {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("data", (Object) str);
                            jSCallback.invoke(jSONObject2);
                        } catch (Exception e) {
                            e.printStackTrace();
                            WXAddressModule.access$000(WXAddressModule.this, jSCallback2);
                        }
                    }
                }

                @Override // com.taobao.android.address.a
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        WXAddressModule.access$000(WXAddressModule.this, jSCallback2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        WVAddressModule.stopRecognition();
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        WVAddressModule.destoryRecognition();
        super.onActivityDestroy();
    }
}
