package com.alilive.adapter.business;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.nav.Nav;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.p;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ddw;
import tb.kge;
import tb.pkg;
import tb.pmd;
import tb.poy;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_REQUEST_CODE = 20000;

    static {
        kge.a(-40759970);
    }

    public static void a(Activity activity, BusinessInfo businessInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd6283d", new Object[]{activity, businessInfo});
        } else if (activity == null || businessInfo == null || businessInfo.tcp == null || businessInfo.tcp.context == null) {
            n.a("BusinessUtil", "sampleSkipToGoodsDetail activity = " + activity + " businessInfo = " + businessInfo);
        } else {
            n.a("BusinessUtil", "sampleSkipToGoodsDetail businessInfo = " + businessInfo);
            String str = businessInfo.mJumpUrl;
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.itemId = businessInfo.tcp.itemId;
            contentBusinessModel.contentId = businessInfo.tcp.contentId;
            contentBusinessModel.adUserId = businessInfo.tcp.adUserId;
            contentBusinessModel.tcpBid = businessInfo.tcp.tcpBid;
            contentBusinessModel.ct = businessInfo.tcp.ct;
            contentBusinessModel.pageName = businessInfo.tcp.pageName;
            contentBusinessModel.sourceType = businessInfo.tcp.sourceType;
            contentBusinessModel.scenceId = businessInfo.tcp.scenceId;
            contentBusinessModel.actionSource = businessInfo.actionSource;
            contentBusinessModel.context = new JSONObject();
            try {
                contentBusinessModel.context.put("actionSource", businessInfo.actionSource);
                if (businessInfo.tcp.context.size() > 0) {
                    for (String str2 : businessInfo.tcp.context.keySet()) {
                        String valueOf = String.valueOf(str2);
                        contentBusinessModel.context.put(valueOf, businessInfo.tcp.context.get(valueOf));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            contentBusinessModel.dataAttributes = new JSONObject();
            try {
                if (businessInfo.tcp.dataAttributes.size() > 0) {
                    for (String str3 : businessInfo.tcp.dataAttributes.keySet()) {
                        String valueOf2 = String.valueOf(str3);
                        contentBusinessModel.dataAttributes.put(valueOf2, businessInfo.tcp.dataAttributes.get(valueOf2));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new com.taobao.tao.content.business.b().a(contentBusinessModel, new IRemoteBaseListener() { // from class: com.alilive.adapter.business.BusinessUtil$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            });
            ddw.a().a("com.taobao.taolive.room.good_click", contentBusinessModel.itemId);
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("itemId", contentBusinessModel.itemId);
            hashMap.put("contentId", contentBusinessModel.contentId);
            hashMap.put(com.taobao.tao.content.business.b.ACCOUNT_ID, contentBusinessModel.adUserId);
            hashMap.put(com.taobao.tao.content.business.b.TCP_BID, contentBusinessModel.tcpBid);
            hashMap.put(com.taobao.tao.content.business.b.CT, contentBusinessModel.ct);
            hashMap.put("context", contentBusinessModel.context.toString());
            hashMap.put("dataAttributes", contentBusinessModel.dataAttributes.toString());
            hashMap.put("pageName", contentBusinessModel.pageName);
            hashMap.put("sourceType", contentBusinessModel.sourceType);
            hashMap.put("scenceId", contentBusinessModel.scenceId);
            hashMap.put(PushConstants.CLICK_TYPE, businessInfo.clickType);
            hashMap.put("isAD", businessInfo.isAD);
            hashMap.put("channel", businessInfo.channel);
            if (contentBusinessModel.sourceType != null) {
                hashMap.put("sourceType", contentBusinessModel.sourceType);
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "LiveCpsMonitor", hashMap);
            if (!businessInfo.mIsJumpGoodsDetail || TextUtils.isEmpty(businessInfo.mJumpUrl)) {
                return;
            }
            a(activity, com.taobao.taolive.room.utils.n.a(), str);
        }
    }

    private static void a(Activity activity, com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2534655", new Object[]{activity, aVar, str});
        } else if (!p.w()) {
            Nav.from(activity).forResult(20000).toUri(str);
        } else {
            Fragment fragment = null;
            if (aVar != null) {
                fragment = a(aVar);
            }
            if (fragment != null) {
                Nav.from(activity).withFragment(fragment).forResult(20000).toUri(str);
            } else {
                Nav.from(activity).forResult(20000).toUri(str);
            }
        }
    }

    private static Fragment a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        pkg pkgVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("5fab4abf", new Object[]{aVar});
        }
        if (aVar.o() != null && (pkgVar = aVar.o().taoliveOpenContext) != null && pkgVar.f != null && (obj = pkgVar.f.get("getJumpFragment")) != null) {
            return (Fragment) obj;
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("43d1778e", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (p.v() && !TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                List<String> u = p.u();
                if (parse != null) {
                    for (String str2 : u) {
                        if (!TextUtils.isEmpty(str2)) {
                            String queryParameter = parse.getQueryParameter(str2);
                            if (!TextUtils.isEmpty(queryParameter)) {
                                jSONObject.put(str2, queryParameter);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static Map<String, String> a(com.taobao.alilive.aliliveframework.frame.a aVar, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b769307", new Object[]{aVar, map, str});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject();
        a(aVar, jSONObject, str);
        Iterator<String> keys = jSONObject.keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    map.put(next, jSONObject.getString(next));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }

    public static JSONObject a(com.taobao.alilive.aliliveframework.frame.a aVar, JSONObject jSONObject, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41011179", new Object[]{aVar, jSONObject, str});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (p.z()) {
            String L = poy.L(aVar);
            com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
            if (!TextUtils.isEmpty(L) && (split = L.split("&")) != null) {
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str2 = split[i];
                    if (str2 != null && str2.startsWith("liveAlgoParams:")) {
                        String replace = str2.replace("liveAlgoParams:", "");
                        if (!TextUtils.isEmpty(replace)) {
                            for (String str3 : replace.split("#")) {
                                String[] split2 = str3.split(Constants.WAVE_SEPARATOR);
                                if (split2 != null && split2.length >= 2) {
                                    jSONObject2.put(split2[0], (Object) split2[1]);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            for (String str4 : p.y()) {
                if (jSONObject2.get(str4) != null) {
                    try {
                        jSONObject.put(str4, jSONObject2.getString(str4));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return !TextUtils.isEmpty(str) ? a(jSONObject, str) : jSONObject;
    }
}
