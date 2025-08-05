package com.alibaba.evo.internal.downloader;

import android.content.Context;
import com.alibaba.evo.internal.request.MtopResponseOutDo;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.m;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import tb.bwt;
import tb.cex;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1539494356);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!cex.a().j().M()) {
            h.f("ExperimentIndexMtopRequest", "isMtopIndexEnable=false");
        } else {
            long a2 = k.b().a("nextAvailableTime", -1L);
            if (a2 > 0 && a2 > m.a()) {
                h.f("ExperimentIndexMtopRequest", "checkIndex: nextAvailableTime limit. It can be executed after " + (m.a() - a2) + "ms");
                return;
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.tmall.ant.api.core.allocate");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            HashMap hashMap = new HashMap();
            hashMap.put("configVersion", String.valueOf(cex.a().i().c()));
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest);
            build.mo1296handler(p.b());
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.evo.internal.downloader.ExperimentIndexMtopRequest$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    h.f("ExperimentIndexMtopRequest", "onSystemError: " + mtopResponse.toString());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (baseOutDo == null) {
                        h.f("ExperimentIndexMtopRequest", "onSuccess: baseOutDo=null");
                    } else if (!(baseOutDo.mo2429getData() instanceof bwt)) {
                    } else {
                        bwt bwtVar = (bwt) baseOutDo.mo2429getData();
                        if (!bwtVar.g) {
                            h.f("ExperimentIndexMtopRequest", "onSuccess: responseData.success=false");
                            return;
                        }
                        if (bwtVar.f26152a != null) {
                            cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.ExperimentV5Data, bwtVar.f26152a, "mtop_allocate"));
                        }
                        if (bwtVar.b != null) {
                            cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.BetaExperimentV5Data, bwtVar.b, "mtop_allocate"));
                        }
                        Set<Long> set = bwtVar.c != null ? bwtVar.c.groupIds : null;
                        h.f("ExperimentIndexMtopRequest", "【白名单数据】mtop: " + set);
                        cex.a().n().a(set);
                        if (bwtVar.h > 0) {
                            k.b().b("nextAvailableTime", bwtVar.h);
                        }
                        h.f("ExperimentIndexMtopRequest", "onSuccess: " + new String(mtopResponse.getBytedata()));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    MtopResponseOutDo mtopResponseOutDo;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null || (mtopResponseOutDo = (MtopResponseOutDo) g.a(mtopResponse.getDataJsonObject().toString(), (Class<Object>) MtopResponseOutDo.class)) == null || mtopResponseOutDo.data == null) {
                    } else {
                        bwt bwtVar = mtopResponseOutDo.data;
                        if (bwtVar.h <= 0) {
                            return;
                        }
                        k.b().b("nextAvailableTime", bwtVar.h);
                        h.f("ExperimentIndexMtopRequest", "onError: msgCode=" + bwtVar.f + " msgInfo=" + bwtVar.e + " nextAvailableTime=" + bwtVar.h);
                    }
                }
            }).startRequest(MtopResponseOutDo.class);
        }
    }
}
