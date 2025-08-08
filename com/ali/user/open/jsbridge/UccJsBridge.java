package com.ali.user.open.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.callback.MemberCallback;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.OneKeyLoginService;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.biz.UccH5Presenter;
import com.ali.user.open.ucc.biz.UccTrustLoginPresenter;
import com.ali.user.open.ucc.data.DefaultDataProvider;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.webview.UccSystemJSBridge;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UccJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile UccJsBridge instance;
    private final int TYPE_UCC_BIND = 1;
    private final int TYPE_UCC_TRUSTLOGIN = 2;
    private final int TYPE_UCC_UNBIND = 3;
    private final int TYPE_UCC_FETCH_URL = 4;
    private final int TYPE_UCC_FETCH_URL_NO_LOGIN = 5;
    private final int TYPE_UCC_ONEKEY_LOGIN = 6;
    private final int TYPE_UCC_USER_GROW_LOGIN = 7;

    public static /* synthetic */ Object ipc$super(UccJsBridge uccJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(UccJsBridge uccJsBridge, WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acaef7d4", new Object[]{uccJsBridge, wVCallBackContext, new Integer(i), str});
        } else {
            uccJsBridge.onFailCallback(wVCallBackContext, i, str);
        }
    }

    public static /* synthetic */ void access$100(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec390ce4", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccTrustLogin(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$200(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e73665", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccUnbind(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$300(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85955fe6", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccFetchUrl(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$400(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2438967", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccFetchUrlWithNoLogin(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$500(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef1b2e8", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccOneKeyLogin(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$600(UccJsBridge uccJsBridge, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9fdc69", new Object[]{uccJsBridge, str, wVCallBackContext});
        } else {
            uccJsBridge.uccUserGrowLogin(str, wVCallBackContext);
        }
    }

    public static UccJsBridge getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccJsBridge) ipChange.ipc$dispatch("a08243e9", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccJsBridge.class) {
                if (instance == null) {
                    instance = new UccJsBridge();
                }
            }
        }
        return instance;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("uccBind".equals(str)) {
            uccAction(1, str2, wVCallBackContext);
            return true;
        } else if ("uccTrustLogin".equals(str)) {
            uccAction(2, str2, wVCallBackContext);
            return true;
        } else if ("uccUnbind".equals(str)) {
            uccAction(3, str2, wVCallBackContext);
            return true;
        } else if ("getUIMode".equals(str)) {
            getUIMode(str2, wVCallBackContext);
            return true;
        } else if ("uccFetchUrl".equals(str)) {
            uccAction(4, str2, wVCallBackContext);
            return true;
        } else if ("uccFetchUrlNoLogin".equals(str)) {
            uccAction(5, str2, wVCallBackContext);
            return true;
        } else if ("aluOpenWebViewByUrl".equals(str)) {
            aluOpenWebViewByUrl(str2, wVCallBackContext);
            return true;
        } else if ("openUrlWithCallback".equals(str)) {
            openUrlWithCallback(str2, wVCallBackContext);
            return true;
        } else if ("uccOnekeyLogin".equals(str)) {
            uccAction(6, str2, wVCallBackContext);
            return true;
        } else if ("uccUserGrowContinueLogin".equals(str)) {
            uccAction(7, str2, wVCallBackContext);
            return true;
        } else if ("getUserToken".equals(str)) {
            getUserToken(str2, wVCallBackContext);
            return true;
        } else {
            wVCallBackContext.error();
            return false;
        }
    }

    public synchronized void aluOpenWebViewByUrl(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d689c1", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Bundle bundle = new Bundle();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str2 = "" + ((Object) keys.next());
                        if (!StringUtils.equals("site", str2)) {
                            bundle.putString(str2, jSONObject.optString(str2));
                        }
                    }
                    UccH5Presenter.openUrl(this.mContext, bundle, null);
                    wVCallBackContext.success(new r());
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    onFailCallback(wVCallBackContext, 1199, "系统异常");
                    return;
                }
            }
            onFailCallback(wVCallBackContext, 1108, "参数不能为空");
        }
    }

    public synchronized void openUrlWithCallback(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f825de", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                bundle.putString("url", (String) jSONObject.opt("url"));
                bundle.putString(ParamsConstants.Key.PRAMA_TRANSPARENT_H5, (String) jSONObject.opt(ParamsConstants.Key.PRAMA_TRANSPARENT_H5));
                UccH5Presenter.openUrl(this.mContext, bundle, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onSuccess(String str2, Map map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str2, map});
                        } else if (wVCallBackContext == null) {
                        } else {
                            wVCallBackContext.success(new r());
                        }
                    }

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onFail(String str2, int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                        } else {
                            UccJsBridge.access$000(UccJsBridge.this, wVCallBackContext, i, str3);
                        }
                    }
                });
                return;
            }
            onFailCallback(wVCallBackContext, 1108, "参数不能为空");
        }
    }

    private void getUIMode(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbaf43b", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r();
            rVar.a("mode", CommonUtils.getDarkModeStatus(KernelContext.applicationContext) ? BlobManager.SUB_TYPE_DARK : "Light");
            wVCallBackContext.success(rVar);
        }
    }

    private void uccAction(final int i, final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba4bf58", new Object[]{this, new Integer(i), str, wVCallBackContext});
        } else if (!KernelContext.sdkInitialized.booleanValue()) {
            try {
                q.a(UccSystemJSBridge.ALU_SYSTEM_JSBRIDGE, (Class<? extends e>) UccJsBridge.class);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (StringUtils.isEmpty(AliMemberSDK.getMasterSite())) {
                AliMemberSDK.setMasterSite("taobao");
            }
            AliMemberSDK.init(this.mContext.getApplicationContext(), new InitResultCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i2, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i2), str2});
                    }
                }

                @Override // com.ali.user.open.core.callback.InitResultCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    UccJsBridge.this.setUccDataProvider();
                    int i2 = i;
                    if (i2 == 1) {
                        UccJsBridge.this.uccBind(str, wVCallBackContext);
                    } else if (i2 == 2) {
                        UccJsBridge.access$100(UccJsBridge.this, str, wVCallBackContext);
                    } else if (i2 == 3) {
                        UccJsBridge.access$200(UccJsBridge.this, str, wVCallBackContext);
                    } else if (i2 == 4) {
                        UccJsBridge.access$300(UccJsBridge.this, str, wVCallBackContext);
                    } else if (i2 == 5) {
                        UccJsBridge.access$400(UccJsBridge.this, str, wVCallBackContext);
                    } else if (i2 == 6) {
                        UccJsBridge.access$500(UccJsBridge.this, str, wVCallBackContext);
                    } else if (i2 != 7) {
                    } else {
                        UccJsBridge.access$600(UccJsBridge.this, str, wVCallBackContext);
                    }
                }
            });
        } else if (i == 1) {
            uccBind(str, wVCallBackContext);
        } else if (i == 2) {
            uccTrustLogin(str, wVCallBackContext);
        } else if (i == 3) {
            uccUnbind(str, wVCallBackContext);
        } else if (i == 4) {
            uccFetchUrl(str, wVCallBackContext);
        } else if (i == 5) {
            uccFetchUrlWithNoLogin(str, wVCallBackContext);
        } else if (i == 6) {
            uccOneKeyLogin(str, wVCallBackContext);
        } else if (i != 7) {
        } else {
            uccUserGrowLogin(str, wVCallBackContext);
        }
    }

    private void uccFetchUrl(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d5edd8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (AliMemberSDK.getService(UserTrackerService.class) != null) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("uccFetchUrl", (Map) JSON.parseObject(str, Map.class));
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null && Site.isHavanaSite(AliMemberSDK.getMasterSite())) {
                setUccDataProvider();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            ((UccService) AliMemberSDK.getService(UccService.class)).fetchUrl((Activity) this.mContext, optString, hashMap, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str3, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    wVCallBackContext2.success();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    UccJsBridge uccJsBridge = UccJsBridge.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (StringUtils.isEmpty(str4)) {
                        str4 = "获取页面失败";
                    }
                    UccJsBridge.access$000(uccJsBridge, wVCallBackContext2, i, str4);
                }
            });
        }
    }

    private void uccFetchUrlWithNoLogin(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18cd266", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (AliMemberSDK.getService(UserTrackerService.class) != null) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("uccFetchUrlNoLogin", (Map) JSON.parseObject(str, Map.class));
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            hashMap.put(ParamsConstants.Key.PARAM_NO_LOGIN, "1");
            ((UccService) AliMemberSDK.getService(UccService.class)).fetchUrl((Activity) this.mContext, optString, hashMap, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str3, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    wVCallBackContext2.success();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    UccJsBridge uccJsBridge = UccJsBridge.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (StringUtils.isEmpty(str4)) {
                        str4 = "获取页面失败";
                    }
                    UccJsBridge.access$000(uccJsBridge, wVCallBackContext2, i, str4);
                }
            });
        }
    }

    private void uccOneKeyLogin(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8deb89", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (AliMemberSDK.getService(UserTrackerService.class) != null) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("uccOneKeyLogin", (Map) JSON.parseObject(str, Map.class));
            }
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            if (AliMemberSDK.getService(OneKeyLoginService.class) != null) {
                ((OneKeyLoginService) AliMemberSDK.getService(OneKeyLoginService.class)).oneKeyLogin(hashMap, new MemberCallback<String>() { // from class: com.ali.user.open.jsbridge.UccJsBridge.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.core.callback.MemberCallback
                    public void onSuccess(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str3});
                            return;
                        }
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        wVCallBackContext2.success();
                    }

                    @Override // com.ali.user.open.core.callback.FailureCallback
                    public void onFailure(int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str3});
                        } else {
                            UccJsBridge.access$000(UccJsBridge.this, wVCallBackContext, i, str3);
                        }
                    }
                });
            } else {
                onFailCallback(wVCallBackContext, -1, "service未注册");
            }
        }
    }

    private void uccUserGrowLogin(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e695f5c4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (AliMemberSDK.getService(UserTrackerService.class) != null) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("uccUserGrowLogin", (Map) JSON.parseObject(str, Map.class));
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            String optString2 = jSONObject.optString("requestToken");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "requestToken不能为空");
                return;
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            UccParams uccParams = new UccParams();
            uccParams.requestToken = optString2;
            UccTrustLoginPresenter.getInstance().userGrowLogin((Activity) this.mContext, uccParams, optString, hashMap, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str3, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map});
                    } else if (wVCallBackContext == null) {
                    } else {
                        r rVar = new r();
                        rVar.a("HY_SUCCESS");
                        if (map != null) {
                            rVar.a(Constants.VI_ENGINE_CALLBACKURL, map.get(Constants.VI_ENGINE_CALLBACKURL));
                        }
                        wVCallBackContext.success(rVar);
                    }
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                    } else if (i == 3000) {
                        if (wVCallBackContext == null) {
                            return;
                        }
                        r rVar = new r();
                        rVar.a("HY_FAILED");
                        rVar.a("code", String.valueOf(i));
                        if (!StringUtils.isEmpty(str4)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(str4);
                                Iterator<String> keys2 = jSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String str5 = "" + ((Object) keys2.next());
                                    if (!StringUtils.equals("site", str5)) {
                                        rVar.a(str5, jSONObject2.optString(str5));
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        wVCallBackContext.error(rVar);
                    } else {
                        UccJsBridge.access$000(UccJsBridge.this, wVCallBackContext, i, str4);
                    }
                }
            });
        }
    }

    private void uccTrustLogin(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3bd534", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null && Site.isHavanaSite(AliMemberSDK.getMasterSite())) {
                setUccDataProvider();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            ((UccService) AliMemberSDK.getService(UccService.class)).trustLogin((Activity) this.mContext, optString, hashMap, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str3, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    wVCallBackContext2.success();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    UccJsBridge uccJsBridge = UccJsBridge.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (StringUtils.isEmpty(str4)) {
                        str4 = "免登失败";
                    }
                    UccJsBridge.access$000(uccJsBridge, wVCallBackContext2, i, str4);
                }
            });
        } catch (Exception e) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("message", e.getMessage());
            UTHitUtils.send(UTHitConstants.PageUccLogin, "UccLogin_EXCEPTION", null, hashMap2);
            onFailCallback(wVCallBackContext, 1199, "系统异常:" + e.getMessage());
        }
    }

    public void uccBind(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82b7e40", new Object[]{this, str, wVCallBackContext});
        } else {
            uccBind((Activity) this.mContext, str, wVCallBackContext);
        }
    }

    public void uccBind(Activity activity, String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45ebf52", new Object[]{this, activity, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null && Site.isHavanaSite(AliMemberSDK.getMasterSite())) {
                setUccDataProvider();
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = "" + ((Object) keys.next());
                if (!StringUtils.equals("site", str2)) {
                    hashMap.put(str2, jSONObject.optString(str2));
                }
            }
            ((UccService) AliMemberSDK.getService(UccService.class)).bind(activity, optString, hashMap, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str3, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str3, map});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    wVCallBackContext2.success();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    UccJsBridge uccJsBridge = UccJsBridge.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (StringUtils.isEmpty(str4)) {
                        str4 = "绑定失败";
                    }
                    UccJsBridge.access$000(uccJsBridge, wVCallBackContext2, i, str4);
                }
            });
        } catch (Exception e) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("message", e.getMessage());
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccLogin_EXCEPTION", null, hashMap2);
            onFailCallback(wVCallBackContext, 1199, "系统异常:" + e.getMessage());
        }
    }

    private void uccUnbind(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5765bd9", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String optString = new JSONObject(str).optString("site");
            if (StringUtils.isEmpty(optString)) {
                onFailCallback(wVCallBackContext, 1108, "site不能为空");
                return;
            }
            if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null && Site.isHavanaSite(AliMemberSDK.getMasterSite())) {
                setUccDataProvider();
            }
            ((UccService) AliMemberSDK.getService(UccService.class)).unbind(optString, new UccCallback() { // from class: com.ali.user.open.jsbridge.UccJsBridge.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str2, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str2, map});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    wVCallBackContext2.success();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str2, int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                        return;
                    }
                    UccJsBridge uccJsBridge = UccJsBridge.this;
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    if (StringUtils.isEmpty(str3)) {
                        str3 = "解绑失败";
                    }
                    UccJsBridge.access$000(uccJsBridge, wVCallBackContext2, i, str3);
                }
            });
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", e.getMessage());
            UTHitUtils.send(UTHitConstants.PageUccUnBind, "UccLogin_EXCEPTION", null, hashMap);
            onFailCallback(wVCallBackContext, 1199, "系统异常:" + e.getMessage());
        }
    }

    private void getUserToken(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fafb86", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null) {
            setUccDataProvider();
        }
        ((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider().getUserToken(AliMemberSDK.getMasterSite(), new MemberCallback<String>() { // from class: com.ali.user.open.jsbridge.UccJsBridge.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.callback.MemberCallback
            public void onSuccess(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str2});
                } else if (wVCallBackContext == null) {
                } else {
                    r rVar = new r();
                    rVar.a("userToken", str2);
                    wVCallBackContext.success(rVar);
                }
            }

            @Override // com.ali.user.open.core.callback.FailureCallback
            public void onFailure(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str2});
                } else {
                    UccJsBridge.access$000(UccJsBridge.this, wVCallBackContext, i, str2);
                }
            }
        });
    }

    public void setUccDataProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3418b5", new Object[]{this});
        } else {
            ((UccService) AliMemberSDK.getService(UccService.class)).setUccDataProvider(new DefaultDataProvider());
        }
    }

    private void onFailCallback(WVCallBackContext wVCallBackContext, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14967f07", new Object[]{this, wVCallBackContext, new Integer(i), str});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_FAILED");
            rVar.a("code", String.valueOf(i));
            rVar.a("message", str);
            wVCallBackContext.error(rVar);
        }
    }
}
