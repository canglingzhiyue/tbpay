package com.taobao.tao.remotebusiness;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;
import tb.ryq;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1556172631);
    }

    public static com.taobao.tao.stream.d a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.stream.d) ipChange.ipc$dispatch("cabd0ce9", new Object[]{mtopResponse});
        }
        com.taobao.tao.stream.d dVar = new com.taobao.tao.stream.d();
        if (mtopResponse == null) {
            return dVar;
        }
        dVar.i = mtopResponse.getOriginFastJsonObject();
        dVar.c = mtopResponse.getApi();
        dVar.d = mtopResponse.getV();
        dVar.e = mtopResponse.getBytedata();
        dVar.b = mtopResponse.getRetMsg();
        dVar.f21113a = mtopResponse.getRetCode();
        dVar.g = mtopResponse.getHeaderFields();
        dVar.h = mtopResponse.getRet();
        ryq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            dVar.f = streamModeData.c;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            dVar.j = mtopStat.falcoId;
        }
        return dVar;
    }

    public static com.taobao.tao.stream.c b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.stream.c) ipChange.ipc$dispatch("be4c910b", new Object[]{mtopResponse});
        }
        com.taobao.tao.stream.c cVar = new com.taobao.tao.stream.c();
        if (mtopResponse == null) {
            return cVar;
        }
        cVar.f21112a = mtopResponse.getHeaderFields();
        cVar.b = mtopResponse.getRetCode();
        cVar.c = "SUCCESS";
        cVar.e = mtopResponse.mappingCode;
        cVar.f = mtopResponse.getResponseCode();
        ryq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            cVar.d = streamModeData.b;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            cVar.g = mtopStat.falcoId;
        }
        return cVar;
    }

    public static com.taobao.tao.stream.b c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.stream.b) ipChange.ipc$dispatch("b1dc152d", new Object[]{mtopResponse});
        }
        com.taobao.tao.stream.b bVar = new com.taobao.tao.stream.b();
        if (mtopResponse == null) {
            return bVar;
        }
        bVar.f21112a = mtopResponse.getHeaderFields();
        bVar.b = mtopResponse.getRetCode();
        bVar.c = mtopResponse.getRetMsg();
        bVar.e = mtopResponse.mappingCode;
        bVar.f = mtopResponse.getResponseCode();
        ryq streamModeData = mtopResponse.getStreamModeData();
        if (streamModeData != null) {
            bVar.d = streamModeData.b;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            bVar.g = mtopStat.falcoId;
        }
        return bVar;
    }
}
