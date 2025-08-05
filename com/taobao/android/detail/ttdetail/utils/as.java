package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class as {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(804434776);
    }

    public static JSONObject a(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("44136010", new Object[]{mtopInfo});
        }
        if (mtopInfo == null) {
            i.a("MtopUtils", "mtopInfo is null");
            return null;
        }
        return a(mtopInfo.b());
    }

    public static JSONObject b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("92da388e", new Object[]{mtopResponse}) : a(mtopResponse);
    }

    public static JSONObject a(MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91c5bd96", new Object[]{mtopResponse, new Integer(i)});
        }
        if (i == 3) {
            try {
                return a(mtopResponse);
            } catch (Exception e) {
                i.a("MtopUtils", "parse ERROR mtop data exception: ", e);
                return null;
            }
        }
        return a(mtopResponse);
    }

    private static JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            i.a("MtopUtils", "mtopResponse is null");
            return null;
        }
        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
        return (originFastJsonObject != null || mtopResponse.getBytedata() == null) ? originFastJsonObject : JSON.parseObject(new String(mtopResponse.getBytedata()));
    }
}
