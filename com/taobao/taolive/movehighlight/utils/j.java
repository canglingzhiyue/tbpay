package com.taobao.taolive.movehighlight.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.pre.PreRequestInfo;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1109834642);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        JSONObject b = pqj.b(str);
        if (b == null) {
            b = new JSONObject();
        }
        b.put("pcmId", (Object) str2);
        return b.toJSONString();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject b = pqj.b(str);
        if (TextUtils.isEmpty(str) || b == null) {
            return str;
        }
        b.remove("pcmId");
        return b.toJSONString();
    }

    public static LiveItem.SpfPlayVideo a(Map<String, String> map) {
        PreRequestInfo c;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.SpfPlayVideo) ipChange.ipc$dispatch("9e6f1960", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("timeMovingSpfPlayVideo");
        if (!TextUtils.isEmpty(str)) {
            return (LiveItem.SpfPlayVideo) pqj.a(str, LiveItem.SpfPlayVideo.class);
        }
        if (map.get(aw.PRE_REQUEST_TIME_MOVE_KEY) != null && (c = com.taobao.taolive.room.pre.a.a().c(map.get(aw.PRE_REQUEST_TIME_MOVE_KEY))) != null && c.responseStatus == 1 && (videoInfo = c.info) != null && videoInfo.timeMovingPlayInfo != null) {
            return videoInfo.timeMovingPlayInfo.spfPlayVideo;
        }
        return null;
    }
}
