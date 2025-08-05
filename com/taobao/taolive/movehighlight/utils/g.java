package com.taobao.taolive.movehighlight.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import tb.kge;
import tb.pma;
import tb.pmd;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(90282087);
    }

    public static void a(Context context, TBLiveDataModel tBLiveDataModel, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5add8a", new Object[]{context, tBLiveDataModel, new Boolean(z), aVar});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (!pmd.a().a("reportUrlForTaoBao")) {
            if (videoInfo == null || videoInfo.openReportUrl == null) {
                return;
            }
            s.a(context, videoInfo.openReportUrl, true);
            return;
        }
        if (com.taobao.taolive.room.utils.k.a() == 2) {
            z2 = true;
        }
        if (z || z2 || !u.Z() || videoInfo == null || videoInfo.reportUrlPopLayer == null) {
            if (videoInfo == null || videoInfo.reportUrl == null) {
                return;
            }
            o.a(aVar);
            s.a(context, videoInfo.reportUrl, true);
            return;
        }
        String str = videoInfo.reportUrlPopLayer;
        if (c.m()) {
            JSONObject parseObject = JSON.parseObject(Uri.parse(str).getQueryParameter("params"));
            String l = c.l();
            if (TextUtils.isEmpty(l)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("subjectType", "LIVE");
            hashMap.put("reportType", "LIVE");
            hashMap.put("subjectId", videoInfo.liveId);
            hashMap.put("ttid", pmd.a().u().a());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reportStartTime", (Object) String.valueOf(System.currentTimeMillis()));
            jSONObject.put(com.alibaba.triver.triver_shop.newShop.view.embed.c.LIVE_TYPE, (Object) videoInfo.roomStatus);
            jSONObject.put("liveRecordTime", (Object) "0");
            hashMap.put("extParams", jSONObject.toJSONString());
            parseObject.put("url", (Object) pma.a(l, hashMap));
            str = pma.a(str, "params", parseObject.toJSONString());
        }
        o.a(aVar);
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", str);
        intent.putExtra("param", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
