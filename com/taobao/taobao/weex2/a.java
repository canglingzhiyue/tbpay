package com.taobao.taobao.weex2;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.f;
import com.taobao.android.weex_framework.util.g;
import com.taobao.umipublish.extension.windvane.innercall.InnerOpenPublishAbility;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class a implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.weex_ability.f
    public void a(Context context, String str, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9219f41", new Object[]{this, context, str, bVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ShareContent shareContent = new ShareContent();
            String str2 = "";
            shareContent.businessId = jSONObject.has("businessId") ? jSONObject.getString("businessId") : str2;
            shareContent.disableHeadUrl = jSONObject.has("disableHeadUrl") ? jSONObject.getBoolean("disableHeadUrl") : false;
            shareContent.disableQrcode = jSONObject.has("disableQrcode") ? jSONObject.getBoolean("disableQrcode") : false;
            shareContent.disableTextInfo = jSONObject.has("disableTextInfo") ? jSONObject.getBoolean("disableTextInfo") : false;
            shareContent.title = jSONObject.has("title") ? jSONObject.getString("title") : str2;
            String string = jSONObject.has("text") ? jSONObject.getString("text") : str2;
            if (StringUtils.isEmpty(string)) {
                string = "我分享给你了一个淘宝页面，快来看看吧";
            }
            shareContent.description = string;
            shareContent.imageUrl = jSONObject.has("image") ? jSONObject.getString("image") : str2;
            Map<String, Object> map = null;
            shareContent.snapshotImages = jSONObject.has("images") ? JSON.parseArray(jSONObject.getString("images"), String.class) : null;
            shareContent.url = jSONObject.has("url") ? jSONObject.getString("url") : str2;
            shareContent.contentType = jSONObject.has("contentType") ? jSONObject.getString("contentType") : str2;
            shareContent.extendParams = jSONObject.has("extendParams") ? (Map) JSON.parseObject(jSONObject.getString("extendParams"), Map.class) : null;
            shareContent.businessInfo = jSONObject.has("businessInfo") ? (Map) JSON.parseObject(jSONObject.getString("businessInfo"), Map.class) : null;
            shareContent.isActivity = jSONObject.has("isActivity") ? jSONObject.getString("isActivity") : "false";
            shareContent.activityParams = jSONObject.has(InnerOpenPublishAbility.PARAMS_URL_PARAMS) ? (Map) JSON.parseObject(jSONObject.getString(InnerOpenPublishAbility.PARAMS_URL_PARAMS), Map.class) : null;
            shareContent.needSaveContent = jSONObject.has("needSaveContent") ? jSONObject.getString("needSaveContent") : "false";
            shareContent.disableBackToClient = jSONObject.has("disableBackToClient") ? jSONObject.getBoolean("disableBackToClient") : false;
            shareContent.weixinAppId = jSONObject.has("weixinAppId") ? jSONObject.getString("weixinAppId") : str2;
            shareContent.weixinMsgType = jSONObject.has("weixinMsgType") ? jSONObject.getString("weixinMsgType") : str2;
            shareContent.qrTipsText = jSONObject.has("qrTipsText") ? jSONObject.getString("qrTipsText") : str2;
            shareContent.templateId = jSONObject.has("templateId") ? jSONObject.getString("templateId") : str2;
            shareContent.shareId = jSONObject.has("shareId") ? jSONObject.getString("shareId") : str2;
            shareContent.shareScene = jSONObject.has("scene") ? jSONObject.getString("scene") : str2;
            if (jSONObject.has("targets")) {
                str2 = jSONObject.getString("targets");
            }
            String str3 = str2;
            if (jSONObject.has("templateParams")) {
                map = (Map) JSON.parseObject(jSONObject.getString("templateParams"), Map.class);
            }
            shareContent.templateParams = map;
            ArrayList arrayList = new ArrayList();
            if (!StringUtils.equals("all", str3)) {
                if (!StringUtils.isEmpty(str3)) {
                    for (String str4 : str3.split(",")) {
                        arrayList.add(str4);
                    }
                } else {
                    arrayList.add("3");
                    arrayList.add(AgooConstants.ACK_FLAG_NULL);
                    arrayList.add("0");
                }
            }
            if (!(context instanceof Activity)) {
                return;
            }
            ShareBusiness.share((Activity) context, arrayList, shareContent, new ShareBusinessListener() { // from class: com.taobao.taobao.weex2.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.share.business.ShareBusinessListener
                public void onShare(ShareContent shareContent2, ShareTargetType shareTargetType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent2, shareTargetType});
                        return;
                    }
                    g.a("MUShareModule", "into--[onShare]");
                    com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                    jSONObject2.put("result", (Object) "click");
                    if (shareTargetType != null) {
                        jSONObject2.put("target", (Object) shareTargetType.getValue());
                    }
                    bVar.a(jSONObject2);
                }

                @Override // com.ut.share.business.ShareBusinessListener
                public void onFinished(Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map2});
                        return;
                    }
                    g.a("MUShareModule", "into--[onFinished]");
                    if (map2 == null || !map2.containsKey("result")) {
                        return;
                    }
                    if (StringUtils.equals("no target", map2.get("result"))) {
                        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                        jSONObject2.put("result", (Object) "failure");
                        bVar.a(jSONObject2);
                        return;
                    }
                    com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
                    jSONObject3.put("result", (Object) "success");
                    bVar.a(jSONObject3);
                }
            });
        } catch (JSONException unused) {
            com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
            jSONObject2.put("result", (Object) "failure");
            bVar.a(jSONObject2);
            Toast.makeText(context, "分享失败", 0).show();
        }
    }
}
