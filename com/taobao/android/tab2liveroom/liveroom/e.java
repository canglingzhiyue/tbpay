package com.taobao.android.tab2liveroom.liveroom;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.n;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1539413447);
    }

    public static String a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e1cdd7", new Object[]{uri, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    if (entry.getValue() != null) {
                        hashMap.put(entry.getKey(), Uri.encode(entry.getValue().toString()));
                    }
                }
            }
        } catch (Throwable unused) {
            ogg.a(a.TAG, "parse extParams error, extParams: " + str);
        }
        String[] split = oeb.a("tab2liveRoomExtraKeys", "").split(",");
        if (split != null) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2)) {
                    String queryParameter = uri.getQueryParameter(str2);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        hashMap.put(str2, queryParameter);
                    }
                }
            }
        }
        String a2 = a.a(oeb.a("tab2liveRoomUrl", a.DEFAULT_REFRESH_URL), hashMap);
        ogg.c(a.TAG, "convert2LiveRoomUrl: " + a2);
        return a2;
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        String str = null;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("extParams");
            if (!StringUtils.isEmpty(queryParameter)) {
                try {
                    str = JSON.parseObject(queryParameter).getString("livesource");
                } catch (Throwable unused) {
                    ogg.a(a.TAG, "parseLiveSource error");
                }
            }
        }
        return StringUtils.isEmpty(str) ? "tb_tab2.guangguang_newlivetab" : str;
    }

    public static void a(Context context, m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c689f05b", new Object[]{context, bVar});
        } else if (context == null || bVar == null) {
        } else {
            com.taobao.taolive.room.utils.m.a(System.currentTimeMillis(), n.b(context), a(bVar.d));
        }
    }

    public static String a(String str, LivePreloadData livePreloadData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("972ca8b0", new Object[]{str, livePreloadData});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse != null && StringUtils.isEmpty(parse.getQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL))) {
            if (livePreloadData != null && livePreloadData.canComposeQuickOpenParams()) {
                String str2 = livePreloadData.customPlayCtrlParams;
                ogg.a(a.TAG, "拼接秒开参数,id:" + livePreloadData.id + ",customPlayCtrlParams:" + (true ^ StringUtils.isEmpty(str2)));
                return parse.buildUpon().appendQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL, str2).appendQueryParameter("id", livePreloadData.id).appendQueryParameter("trackInfo", livePreloadData.trackInfo).build().toString();
            }
            ogg.a(a.TAG, "没有秒开参数,pageUrl:" + str);
        }
        return str;
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String str = uri.getHost() + uri.getPath();
        return StringUtils.equals(str, "market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html") || StringUtils.equals(str, "h5.m.taobao.com/taolive/video.html") || StringUtils.equals(str, "huodong.m.taobao.com/act/talent/live.html");
    }
}
