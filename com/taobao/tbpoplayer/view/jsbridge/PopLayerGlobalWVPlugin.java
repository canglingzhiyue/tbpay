package com.taobao.tbpoplayer.view.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.g;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import tb.kge;

/* loaded from: classes9.dex */
public class PopLayerGlobalWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(824731478);
    }

    public static /* synthetic */ Object ipc$super(PopLayerGlobalWVPlugin popLayerGlobalWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            rVar = new r();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerGlobalWVPlugin.execute." + str + ".error.", th);
            wVCallBackContext.error();
        }
        if (!"recordDisplay".equals(str) && !"recordUserBehavior".equals(str) && !"recordClose".equals(str)) {
            if ("info".equals(str)) {
                rVar.a("sdkAdapterVersion", "");
                rVar.a("isSupportConstraintMock", (Object) true);
                wVCallBackContext.success(rVar);
                return true;
            } else if (JarvisConstant.KEY_JARVIS_TRIGGER.equals(str)) {
                JSONObject parseObject = JSON.parseObject(str2);
                final String string = parseObject.getString("protocol");
                g.a(string, parseObject.getString("param")).a(parseObject.getString("traceInfo")).a(new g.a() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerGlobalWVPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3, String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("popId", (Object) str3);
                        jSONObject.put("protocol", (Object) str4);
                        jSONObject.put("onProcess", (Object) "displayed");
                        wVCallBackContext.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3, boolean z, boolean z2, String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e47be646", new Object[]{this, str3, new Boolean(z), new Boolean(z2), str4, str5});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("popId", (Object) str3);
                        jSONObject.put("protocol", (Object) string);
                        jSONObject.put("onProcess", (Object) IDecisionResult.STATE_CLOSED);
                        jSONObject.put("closeReason", (Object) str4);
                        jSONObject.put("closeSubReason", (Object) str5);
                        wVCallBackContext.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("protocol", (Object) string);
                        jSONObject.put("onProcess", (Object) "triggerFailed");
                        jSONObject.put("closeReason", (Object) str3);
                        wVCallBackContext.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
                    }
                }).a();
                wVCallBackContext.success(rVar);
                return true;
            } else {
                if ("showStoreReview".equals(str)) {
                    JSONObject parseObject2 = JSON.parseObject(str2);
                    if (!(parseObject2.containsKey("jumpFirst") && parseObject2.getBooleanValue("jumpFirst"))) {
                        String lowerCase = Build.BRAND.toLowerCase();
                        if ("vivo".equals(lowerCase)) {
                            if (jumpToCommentVIVO(getActivityContext())) {
                                rVar.a("show", (Object) true);
                                rVar.a(com.taobao.android.tracker.util.e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, (Object) false);
                                wVCallBackContext.success(rVar);
                                return true;
                            }
                        } else if ("oppo".equals(lowerCase) && jumpToCommentOPPO(getActivityContext())) {
                            rVar.a("show", (Object) true);
                            rVar.a(com.taobao.android.tracker.util.e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, (Object) false);
                            wVCallBackContext.success(rVar);
                            return true;
                        }
                    }
                    if (!(parseObject2.containsKey("onlyShow") && parseObject2.getBooleanValue("onlyShow"))) {
                        rVar.a(com.taobao.android.tracker.util.e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Boolean.valueOf(com.taobao.tbpoplayer.util.e.a(getActivityContext(), parseObject2.getString("jumpUrl"))));
                        rVar.a("show", (Object) false);
                        wVCallBackContext.success(rVar);
                        return true;
                    }
                    rVar.a(com.taobao.android.tracker.util.e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, (Object) false);
                    rVar.a("show", (Object) false);
                    wVCallBackContext.success(rVar);
                    return true;
                }
                return false;
            }
        }
        wVCallBackContext.success(rVar);
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    public boolean enableAddCommentVIVO(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf9c7b8", new Object[]{this, context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.bbk.appstore", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode >= 5020;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("enableAddCommentVIVO.error", th);
        }
        return false;
    }

    private Activity getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b26b5e57", new Object[]{this});
        }
        if (this.mContext instanceof Activity) {
            return (Activity) this.mContext;
        }
        return PopLayer.getReference().internalGetCurrentActivity();
    }

    public boolean jumpToCommentVIVO(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1a6e9f", new Object[]{this, activity})).booleanValue();
        }
        if (!enableAddCommentVIVO(activity)) {
            return false;
        }
        String packageName = this.mContext.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName + "&th_name=need_comment"));
        intent.setPackage("com.bbk.appstore");
        intent.setFlags(268468224);
        getActivityContext().startActivity(intent);
        return true;
    }

    public boolean jumpToCommentOPPO(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2aad093", new Object[]{this, activity})).booleanValue();
        }
        String str = "oaps://mk/developer/comment?pkg=" + activity.getPackageName();
        long j = 84000;
        if (getVersionCode(activity, "com.heytap.market") >= j) {
            return jumpApp(activity, Uri.parse(str), "com.heytap.market");
        }
        if (getVersionCode(activity, "com.oppo.market") < j) {
            return false;
        }
        return jumpApp(activity, Uri.parse(str), "com.oppo.market");
    }

    private long getVersionCode(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb63146", new Object[]{this, activity, str})).longValue();
        }
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return -1L;
            }
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    private boolean jumpApp(Activity activity, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede931e9", new Object[]{this, activity, uri, str})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
            intent.setData(uri);
            activity.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
