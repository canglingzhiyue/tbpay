package com.taobao.taolive.room.business.mess;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesRequest;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponse;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.business.b;
import tb.cgv;
import tb.cgw;
import tb.kge;
import tb.poz;
import tb.pqj;

/* loaded from: classes8.dex */
public class d extends b implements cgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.sdk.controller.e f21536a;

    static {
        kge.a(329317116);
        kge.a(-1848515859);
    }

    public d(com.taobao.taolive.sdk.adapter.network.d dVar, com.taobao.taolive.sdk.controller.e eVar) {
        super(dVar, true);
        this.f21536a = eVar;
    }

    @Override // tb.cgv
    public cgv a(com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cgv) ipChange.ipc$dispatch("865e35d7", new Object[]{this, dVar}) : new d(dVar, null);
    }

    @Override // tb.cgv
    public void a(int i, String str, long j, long j2, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7833403", new Object[]{this, new Integer(i), str, new Long(j), new Long(j2), str2, str3, str4});
            return;
        }
        cgw cgwVar = new cgw();
        cgwVar.b = i;
        cgwVar.f26296a = str;
        cgwVar.c = j;
        cgwVar.d = j2;
        cgwVar.e = str2;
        cgwVar.f = str3;
        cgwVar.g = str4;
        a(cgwVar);
    }

    public void a(cgw cgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3674165", new Object[]{this, cgwVar});
            return;
        }
        MtopMediaplatformAliveRecommendLivesRequest mtopMediaplatformAliveRecommendLivesRequest = new MtopMediaplatformAliveRecommendLivesRequest();
        if (aa.n()) {
            mtopMediaplatformAliveRecommendLivesRequest.API_NAME = "mtop.tblive.recommend.updown.lives";
            mtopMediaplatformAliveRecommendLivesRequest.VERSION = "1.0";
        } else {
            mtopMediaplatformAliveRecommendLivesRequest.API_NAME = "mtop.mediaplatform.alive.recommend.lives";
            mtopMediaplatformAliveRecommendLivesRequest.VERSION = "1.0";
        }
        if (!TextUtils.isEmpty(poz.l(this.f21536a))) {
            mtopMediaplatformAliveRecommendLivesRequest.setSource(poz.l(this.f21536a));
        } else {
            mtopMediaplatformAliveRecommendLivesRequest.setSource("source_live");
        }
        mtopMediaplatformAliveRecommendLivesRequest.setS(cgwVar.c);
        mtopMediaplatformAliveRecommendLivesRequest.setN(cgwVar.d);
        mtopMediaplatformAliveRecommendLivesRequest.setAccountStays(cgwVar.e);
        if (TextUtils.isDigitsOnly(cgwVar.f26296a)) {
            mtopMediaplatformAliveRecommendLivesRequest.setLiveId(v.c(cgwVar.f26296a));
        }
        mtopMediaplatformAliveRecommendLivesRequest.setLastBroadCastId(cgwVar.f);
        if (cgwVar.g != null) {
            JSONObject b = pqj.b(cgwVar.g);
            if (aa.cS()) {
                b.put("entryLiveSourcePre", (Object) poz.I(this.f21536a));
            }
            if (b != null) {
                if (com.taobao.taolive.room.utils.d.a()) {
                    mtopMediaplatformAliveRecommendLivesRequest.mockUserId = b.getString("mockUserId");
                    b.remove("mockUserId");
                    cgwVar.g = JSON.toJSONString(b);
                }
                if (aa.aG()) {
                    b.put("queryTimeMoving", (Object) "true");
                    cgwVar.g = JSON.toJSONString(b);
                }
            }
            mtopMediaplatformAliveRecommendLivesRequest.tppParam = cgwVar.g;
        }
        a(cgwVar.b, (INetDataObject) mtopMediaplatformAliveRecommendLivesRequest, MtopMediaplatformAliveRecommendLivesResponse.class, false, true);
    }
}
