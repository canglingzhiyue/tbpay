package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class az {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-158988330);
    }

    public static boolean a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map != null && map.containsKey("x-used-stream");
    }

    public static String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ef8f2", new Object[]{mtopResponse});
        }
        if (mtopResponse != null) {
            try {
            } catch (Exception e) {
                i.a("StreamDataUtils", "getTraceId exception:" + e);
            }
            if (mtopResponse.getHeaderFields() != null) {
                Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                if (headerFields.containsKey("eagleeye-traceid")) {
                    return headerFields.get("eagleeye-traceid").get(0);
                }
                return "";
            }
        }
        return "";
    }

    public static boolean a(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("206474f4", new Object[]{mtopInfo})).booleanValue();
        }
        if (mtopInfo != null) {
            return a(mtopInfo.b());
        }
        return false;
    }

    public static boolean a(MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{mtopResponse})).booleanValue() : (mtopResponse == null || (headerFields = mtopResponse.getHeaderFields()) == null || !headerFields.containsKey(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API)) ? false : true;
    }

    public static boolean b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{map})).booleanValue() : map != null && Boolean.parseBoolean(map.get("updateWithCustomApi")) && "true".equals(map.get("streamMode")) && j.ag();
    }
}
