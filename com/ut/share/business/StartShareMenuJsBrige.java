package com.ut.share.business;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.mtop.wvplugin.a;
import com.taobao.share.wvapi.servicebrige.b;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenPublishAbility;
import com.ut.share.business.ShareContent;
import com.ut.share.utils.FlowOutFacade;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class StartShareMenuJsBrige extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    public static /* synthetic */ Object ipc$super(StartShareMenuJsBrige startShareMenuJsBrige, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(128603029);
        TAG = StartShareMenuJsBrige.class.getSimpleName();
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContext = null;
        super.onDestroy();
    }

    public StartShareMenuJsBrige(Activity activity) {
        this.mContext = activity;
        if (!(this.mContext instanceof Activity)) {
            this.mContext = c.b();
        }
    }

    public StartShareMenuJsBrige() {
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("showSharedMenu".equals(str)) {
            showSharedMenu(wVCallBackContext, str2);
        } else if ("cachePassword".equals(str)) {
            putHistory(wVCallBackContext, str2);
        } else if ("doCopy".equals(str)) {
            copyToClipboard(wVCallBackContext, str2);
        } else if ("copyPassword".equals(str)) {
            copyPassword(wVCallBackContext, str2);
        } else if ("openApp".equals(str)) {
            startPackage(wVCallBackContext, str2);
        } else if ("canOpenApp".equals(str)) {
            canStartPackage(wVCallBackContext, str2);
        } else if ("generateShorUrl".equals(str)) {
            generateShorUrl(wVCallBackContext, str2);
        } else if (!"shareInputExposure".equals(str)) {
            return false;
        } else {
            traceShareBtnExpose(wVCallBackContext, str2);
        }
        return true;
    }

    public final void traceShareBtnExpose(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d65c54", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ShareBusiness.traceShareBtnExpose(JSON.parseObject(str).getString("bizType"));
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    public final void startPackage(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4159a792", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Map map = (Map) JSON.parseObject(str, Map.class);
            String obj = map.get("packageName") != null ? map.get("packageName").toString() : null;
            if (!StringUtils.isEmpty(obj) && openApp(this.mContext, obj)) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error();
            }
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    public final void canStartPackage(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf9782", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Map map = (Map) JSON.parseObject(str, Map.class);
            String obj = map.get("packageName") != null ? map.get("packageName").toString() : null;
            if (!StringUtils.isEmpty(obj) && installedApp(this.mContext, obj)) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error();
            }
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public final void showSharedMenu(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e416dc0f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map parseParam = parseParam(str);
        if (parseParam == null || parseParam.isEmpty()) {
            wVCallBackContext.error();
            return;
        }
        String obj = parseParam.get("packageName") != null ? parseParam.get("packageName").toString() : null;
        if (!StringUtils.isEmpty(obj)) {
            startPackage(wVCallBackContext, obj);
        } else if (this.mContext == null) {
        } else {
            if (!(this.mContext instanceof Activity)) {
                this.mContext = c.b();
            }
            if (this.mContext != null && (this.mContext instanceof Activity)) {
                ShareContent shareContent = getShareContent(parseParam);
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArray = (JSONArray) parseParam.get("targets");
                    if (jSONArray != null) {
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().toString());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ShareBusiness.share((Activity) this.mContext, arrayList, shareContent, new ShareBusinessListener() { // from class: com.ut.share.business.StartShareMenuJsBrige.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ut.share.business.ShareBusinessListener
                    public void onShare(ShareContent shareContent2, ShareTargetType shareTargetType) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent2, shareTargetType});
                        } else if (wVCallBackContext == null || shareTargetType == null) {
                        } else {
                            String targetByType = ShareTargetType.getTargetByType(shareTargetType.getValue());
                            HashMap hashMap = new HashMap();
                            hashMap.put("target", targetByType);
                            hashMap.put("shareTarget", targetByType);
                            wVCallBackContext.fireEvent("wvShareClickEvent", new JSONObject(hashMap).toJSONString());
                        }
                    }

                    @Override // com.ut.share.business.ShareBusinessListener
                    public void onFinished(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                        } else if (map == null) {
                        } else {
                            String str2 = map.get("platform");
                            HashMap hashMap = new HashMap();
                            hashMap.put("target", str2);
                            hashMap.put("shareTarget", str2);
                            if (StringUtils.equals("success", map.get(a.RESULT_KEY))) {
                                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                                if (wVCallBackContext2 == null) {
                                    return;
                                }
                                wVCallBackContext2.success(JSON.toJSONString(map));
                                wVCallBackContext.fireEvent("wvShareSuccessEvent", new JSONObject(hashMap).toJSONString());
                            } else if (StringUtils.equals("fail", map.get(a.RESULT_KEY))) {
                                WVCallBackContext wVCallBackContext3 = wVCallBackContext;
                                if (wVCallBackContext3 == null) {
                                    return;
                                }
                                wVCallBackContext3.error(JSON.toJSONString(map));
                                wVCallBackContext.fireEvent("wvShareFailedEvent", new JSONObject(hashMap).toJSONString());
                            } else if (StringUtils.equals("cancel", map.get(a.RESULT_KEY))) {
                                WVCallBackContext wVCallBackContext4 = wVCallBackContext;
                                if (wVCallBackContext4 == null) {
                                    return;
                                }
                                wVCallBackContext4.error(JSON.toJSONString(map));
                                wVCallBackContext.fireEvent("wvShareCancelEvent", new JSONObject(hashMap).toJSONString());
                            } else if (!StringUtils.equals("close", map.get(a.RESULT_KEY)) || wVCallBackContext == null) {
                            } else {
                                String jSONString = JSON.toJSONString(map);
                                wVCallBackContext.success(jSONString);
                                wVCallBackContext.fireEvent("wvShareCloseEvent", jSONString);
                            }
                        }
                    }
                });
                wVCallBackContext.success();
                return;
            }
            wVCallBackContext.error();
        }
    }

    private ShareContent getShareContent(Map map) {
        ShareContent shareContent;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("a0c46a40", new Object[]{this, map});
        }
        String str = null;
        try {
            shareContent = new ShareContent();
        } catch (Exception e) {
            e = e;
            shareContent = null;
        }
        try {
            shareContent.contentType = map.get("contentType") == null ? null : map.get("contentType").toString();
            if (StringUtils.isEmpty(shareContent.contentType)) {
                shareContent.contentType = map.get("scene") == null ? null : map.get("scene").toString();
            }
            if (StringUtils.isEmpty(shareContent.contentType)) {
                shareContent.contentType = "other";
            }
            shareContent.shareScene = shareContent.contentType;
            String str2 = "false";
            shareContent.needSaveContent = map.get("needSaveContent") == null ? str2 : map.get("needSaveContent").toString();
            shareContent.disableBackToClient = map.get("disableBackToClient") == null ? false : Boolean.parseBoolean(map.get("disableBackToClient").toString());
            shareContent.businessId = map.get("businessId") == null ? null : map.get("businessId").toString();
            shareContent.templateId = map.get("templateId") == null ? null : map.get("templateId").toString();
            shareContent.title = map.get("title") == null ? null : map.get("title").toString();
            shareContent.description = map.get("text") == null ? null : map.get("text").toString();
            shareContent.imageUrl = map.get("image") == null ? null : map.get("image").toString();
            shareContent.url = map.get("url") == null ? null : map.get("url").toString();
            shareContent.wwMsgType = WWMessageType.WWMessageTypeDefault;
            shareContent.weixinMsgType = map.get("weixinMsgType") == null ? null : map.get("weixinMsgType").toString();
            if (map.get("isActivity") != null) {
                str2 = map.get("isActivity").toString();
            }
            shareContent.isActivity = str2;
            shareContent.weixinAppId = map.get("weixinAppId") == null ? null : map.get("weixinAppId").toString();
            shareContent.headUrl = map.get("headUrl") == null ? null : map.get("headUrl").toString();
            shareContent.disableQrcode = map.get("disableQrcode") != null && Boolean.parseBoolean(map.get("disableQrcode").toString());
            shareContent.disableTextInfo = map.get("disableTextInfo") != null && Boolean.parseBoolean(map.get("disableTextInfo").toString());
            if (map.get("disableHeadUrl") == null || !Boolean.parseBoolean(map.get("disableHeadUrl").toString())) {
                z = false;
            }
            shareContent.disableHeadUrl = z;
            shareContent.popType = ShareContent.TaoPasswordPopType.findType(map.get("popType") == null ? "" : map.get("popType").toString());
            shareContent.popUrl = map.get("popUrl") == null ? null : map.get("popUrl").toString();
            shareContent.phoneNumberList = map.get("phoneNumbers") != null ? (List) map.get("phoneNumbers") : null;
            shareContent.smsTemplate = map.get("smsCustomTemplate") != null ? String.valueOf(map.get("smsCustomTemplate")) : null;
            shareContent.markMap = map.get("markMap") != null ? (Map) map.get("markMap") : null;
            Object obj = map.get("maskAlpha");
            if (obj != null) {
                str = obj.toString();
            }
            shareContent.maskAlpha = str;
            shareContent.activityParams = (Map) map.get(InnerOpenPublishAbility.PARAMS_URL_PARAMS);
            shareContent.extendParams = (Map) map.get("extendParams");
            shareContent.templateParams = (Map) map.get("templateParams");
            if (shareContent.extendParams == null || shareContent.extendParams.size() == 0) {
                shareContent.extendParams = (Map) map.get("extraParams");
            }
            try {
                shareContent.businessInfo = (Map) map.get("businessInfo");
            } catch (Exception unused) {
            }
            shareContent.extraParams = shareContent.extendParams;
            Object obj2 = map.get("images");
            if (obj2 != null && (obj2 instanceof JSONArray)) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = ((JSONArray) obj2).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                shareContent.snapshotImages = arrayList;
            }
            shareContent.qrConfig = (JSONObject) map.get("qrConfig");
            if (map.containsKey("qrTipsText")) {
                shareContent.qrTipsText = String.valueOf(map.get("qrTipsText"));
            }
            Object obj3 = map.get("mediaPublisher");
            if (obj3 instanceof JSONObject) {
                shareContent.mediaPublisher = (TBShareMediaPublisher) JSONObject.toJavaObject((JSONObject) obj3, TBShareMediaPublisher.class);
            }
            Object obj4 = map.get("mediaInfo");
            if (obj4 instanceof JSONObject) {
                shareContent.mediaInfo = (TBShareMediaInfo) JSONObject.toJavaObject((JSONObject) obj4, TBShareMediaInfo.class);
            }
        } catch (Exception e2) {
            e = e2;
            Log.e(TAG, "Js share error, param is " + JSON.toJSONString(map));
            Log.e(TAG, "share error: " + e.getMessage());
            return shareContent;
        }
        return shareContent;
    }

    public final void putHistory(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80e753", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        String str2 = null;
        String obj = map.get("expireTime") == null ? null : map.get("expireTime").toString();
        if (map.get("password") != null) {
            str2 = map.get("password").toString();
        }
        if (!com.taobao.share.wvapi.servicebrige.c.a(this.mContext, obj, str2)) {
            wVCallBackContext.error();
        } else {
            wVCallBackContext.success();
        }
    }

    public final void copyToClipboard(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac239634", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        String str2 = null;
        String trim = map.get("title") == null ? null : map.get("title").toString().trim();
        String trim2 = map.get("url") == null ? null : map.get("url").toString().trim();
        String trim3 = map.get("businessId") == null ? null : map.get("businessId").toString().trim();
        if (map.get("shareScene") != null) {
            str2 = map.get("shareScene").toString().trim();
        }
        if (!com.taobao.share.wvapi.servicebrige.a.a(this.mContext, trim3, trim, trim2, str2)) {
            wVCallBackContext.error();
        } else {
            wVCallBackContext.success();
        }
    }

    public final void copyPassword(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b73743e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Map map = (Map) JSON.parseObject(str, Map.class);
        String obj = map.get("expireTime") == null ? null : map.get("expireTime").toString();
        String obj2 = map.get("password") == null ? null : map.get("password").toString();
        String str2 = "noToast";
        if (map.get(str2) == null) {
            str2 = null;
        }
        if (!com.taobao.share.wvapi.servicebrige.a.a(this.mContext, str2, obj2, null, null)) {
            wVCallBackContext.error();
        } else if (!com.taobao.share.wvapi.servicebrige.c.a(this.mContext, obj, obj2)) {
            wVCallBackContext.error();
        } else {
            wVCallBackContext.success();
        }
    }

    private void generateShorUrl(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927728b0", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            if (!(this.mContext instanceof Activity)) {
                return;
            }
            final WeakReference weakReference = new WeakReference(wVCallBackContext);
            new b().a(this.mContext, getShareContent(parseParam(str)), new b.a() { // from class: com.ut.share.business.StartShareMenuJsBrige.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.wvapi.servicebrige.b.a
                public void result(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str2});
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = (WVCallBackContext) weakReference.get();
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    if (StringUtils.isEmpty(str2)) {
                        wVCallBackContext2.error();
                        return;
                    }
                    r rVar = new r();
                    rVar.a("shortUrl", str2);
                    wVCallBackContext2.success(rVar);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private Map parseParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("720e7ba0", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(str, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean installedApp(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d87e588", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean openApp(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b18058", new Object[]{context, str})).booleanValue();
        }
        if (!installedApp(context, str)) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                FlowOutFacade.getInstance().startActivity(context, launchIntentForPackage);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
