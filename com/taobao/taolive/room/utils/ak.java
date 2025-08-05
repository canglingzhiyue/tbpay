package com.taobao.taolive.room.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.fxb;
import tb.kge;
import tb.poz;
import tb.pqj;

/* loaded from: classes8.dex */
public abstract class ak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-336799741);
    }

    public static String a(Uri uri) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(aw.PARAM_TRANSPARENT_KEY);
        if (TextUtils.isEmpty(queryParameter) || (c = pqj.c(queryParameter)) == null || c.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            String string = c.getString(i);
            if (!TextUtils.isEmpty(string)) {
                String queryParameter2 = uri.getQueryParameter(string);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    hashMap.put(string, queryParameter2);
                }
            }
        }
        return pqj.a(hashMap);
    }

    public static Map<String, String> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c689e33", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null) {
            if (aa.cx()) {
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            if ("pages.tmall.com".equals(uri.getHost())) {
                hashMap.put("id", uri.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID));
            } else {
                String queryParameter = uri.getQueryParameter("id");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = uri.getQueryParameter(aw.PARAM_ELEVEN_LIVE_ID);
                }
                String a2 = a(uri);
                hashMap.put(aw.PARAM_IGNORE_PV, uri.getQueryParameter(aw.PARAM_IGNORE_PV));
                if (a2 == null) {
                    a2 = "";
                }
                hashMap.put(aw.PARAM_TRANSPARENT_PARAMS, a2);
                hashMap.put("id", queryParameter);
                hashMap.put("userId", uri.getQueryParameter("userId"));
                hashMap.put("spm", uri.getQueryParameter("spm"));
                hashMap.put("scm", uri.getQueryParameter("scm"));
                hashMap.put("trackInfo", uri.getQueryParameter("trackInfo"));
                hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, uri.getQueryParameter(aw.PARAM_TRACK_LIVEOPRT_ID));
                hashMap.put("clickid", uri.getQueryParameter("clickid"));
                hashMap.put(aw.PARAM_FORCE_FULL_SCREEN, uri.getQueryParameter(aw.PARAM_FORCE_FULL_SCREEN));
                hashMap.put("livesource", uri.getQueryParameter("livesource"));
                hashMap.put("itemid", uri.getQueryParameter("itemid"));
                hashMap.put(aw.PARAM_TIMEMOVING_ITEM_ID, uri.getQueryParameter(aw.PARAM_TIMEMOVING_ITEM_ID));
                hashMap.put(aw.PARAM_SJSD_ITEM_ID, uri.getQueryParameter(aw.PARAM_SJSD_ITEM_ID));
                hashMap.put(aw.PARAM_HIDE_UI, uri.getQueryParameter(aw.PARAM_HIDE_UI));
                hashMap.put(aw.PARAM_HIDE_DYNAMIC, uri.getQueryParameter(aw.PARAM_HIDE_DYNAMIC));
                hashMap.put(aw.PARAM_HIDE_H5_DYNAMIC, uri.getQueryParameter(aw.PARAM_HIDE_H5_DYNAMIC));
                hashMap.put(aw.PARAM_FORCE_FANDOM, uri.getQueryParameter(aw.PARAM_FORCE_FANDOM));
                hashMap.put(aw.PARAM_VRPASS, uri.getQueryParameter(aw.PARAM_VRPASS));
                hashMap.put("utLogMap", uri.getQueryParameter("utLogMap"));
                hashMap.put(aw.PARAMS_LIVE_TRACKINFO, uri.getQueryParameter(aw.PARAMS_LIVE_TRACKINFO));
                hashMap.put(aw.PARAM_ACTIVITY_URL, uri.getQueryParameter(aw.PARAM_ACTIVITY_URL));
                hashMap.put("renderType", uri.getQueryParameter("renderType"));
                hashMap.put(aw.PARAM_ACTIVITY_POSITION, uri.getQueryParameter(aw.PARAM_ACTIVITY_POSITION));
                hashMap.put(aw.PARAM_SHOULD_OPEN_ONCE, uri.getQueryParameter(aw.PARAM_SHOULD_OPEN_ONCE));
                hashMap.put("enterAnimation", uri.getQueryParameter("enterAnimation"));
                hashMap.put("exitAnimation", uri.getQueryParameter("exitAnimation"));
                hashMap.put("modal", uri.getQueryParameter("modal"));
                hashMap.put("timePointPlayUrl", uri.getQueryParameter("timePointPlayUrl"));
                hashMap.put(aw.PARAM_CUSTOM_PLAY_CTRL, uri.getQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL));
                hashMap.put("bubbleGoodInfoJson", uri.getQueryParameter("bubbleGoodInfoJson"));
                hashMap.put(aw.PARAM_BACKWARD_SWITCH, uri.getQueryParameter(aw.PARAM_BACKWARD_SWITCH));
                hashMap.put(aw.PARAM_BACKWARD_RETURN, uri.getQueryParameter(aw.PARAM_BACKWARD_RETURN));
                hashMap.put(aw.PARAM_INTENT_URL, uri.toString());
                hashMap.put(aw.PARAM_MINILIVE_ENABLE_SHOW, uri.getQueryParameter(aw.PARAM_MINILIVE_ENABLE_SHOW));
                hashMap.put(aw.PARAM_USER_TASK_JSON, uri.getQueryParameter(aw.PARAM_USER_TASK_JSON));
                hashMap.put(aw.PARAM_FANDOM_INTERACTTYPE, uri.getQueryParameter(aw.PARAM_FANDOM_INTERACTTYPE));
                hashMap.put(aw.PARAM_PRODUCT_TYPE, uri.getQueryParameter(aw.PARAM_PRODUCT_TYPE));
                hashMap.put(aw.PARAM_NEED_RECOMMEND, uri.getQueryParameter(aw.PARAM_NEED_RECOMMEND));
                hashMap.put(aw.PARAM_TCP_OUTER_PARAM, uri.getQueryParameter(aw.PARAM_TCP_OUTER_PARAM));
                hashMap.put(aw.PARAM_COVER_GAUSS_SAMPLING, uri.getQueryParameter(aw.PARAM_COVER_GAUSS_SAMPLING));
                hashMap.put(aw.PARAM_COVER_GAUSS_RADIUS, uri.getQueryParameter(aw.PARAM_COVER_GAUSS_RADIUS));
                hashMap.put(aw.PARAM_ITEM_IDS, uri.getQueryParameter(aw.PARAM_ITEM_IDS));
                hashMap.put(aw.PARAM_ITEM_HOLD_TYPE, uri.getQueryParameter(aw.PARAM_ITEM_HOLD_TYPE));
                hashMap.put(aw.PARAM_LIVE_IS_AD, uri.getQueryParameter(aw.PARAM_LIVE_IS_AD));
                String shareFissionLiveShareActionInfoParams = com.taobao.android.live.plugin.proxy.f.k().getShareFissionLiveShareActionInfoParams();
                if (!TextUtils.isEmpty(shareFissionLiveShareActionInfoParams)) {
                    hashMap.put(shareFissionLiveShareActionInfoParams, uri.getQueryParameter(shareFissionLiveShareActionInfoParams));
                }
                hashMap.put("content", uri.getQueryParameter("content"));
                hashMap.put(com.taobao.taolive.room.controller2.j.PARAM_LIVEHOME_SPM, uri.getQueryParameter(com.taobao.taolive.room.controller2.j.PARAM_LIVEHOME_SPM));
                poz.X(uri.getQueryParameter(aw.PARAM_SERVER_PARAMS), n.b(n.a()));
            }
        }
        return hashMap;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            return new String(c(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{str}) : Base64.decode(str.replace('.', '+').replace('_', fxb.DIR).replace('-', '='), 0);
    }

    public static String a(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5852829e", new Object[]{arrayList});
        }
        String str = null;
        if (arrayList == null) {
            return null;
        }
        if (arrayList.size() > 1 && arrayList.get(1) != null) {
            if (arrayList.get(1).rtcLiveUrl != null) {
                str = arrayList.get(1).rtcLiveUrl;
            }
            if (TextUtils.isEmpty(str) && arrayList.get(1).flvUrl != null) {
                str = arrayList.get(1).flvUrl;
            }
        }
        return d(str);
    }

    public static String d(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = new URI(str).getPath().split("/");
            if (split.length - 1 < 0) {
                return null;
            }
            String str2 = split[split.length - 1];
            if (str2 != null && (indexOf = str2.indexOf(".")) >= 0) {
                str2 = str2.substring(0, indexOf);
            }
            return (str2 == null || !str2.contains("transcode")) ? str2 : str2.substring(0, str2.indexOf("___transcode___"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2) {
        Uri parse;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            return "";
        }
        JSONObject b = TextUtils.isEmpty(str) ? null : pqj.b(str);
        if (b == null) {
            b = new JSONObject();
        }
        String queryParameter = parse.getQueryParameter("huanduanParams");
        if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    b.put(str3, (Object) parse.getQueryParameter(str3));
                }
            }
        }
        return b.toJSONString();
    }
}
