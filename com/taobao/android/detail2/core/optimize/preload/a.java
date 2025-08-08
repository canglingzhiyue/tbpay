package com.taobao.android.detail2.core.optimize.preload;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.detail2.core.framework.base.weex.h;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.weex_framework.util.p;
import java.net.URLEncoder;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bpt;
import tb.ctu;
import tb.ctv;
import tb.fhi;
import tb.fjk;
import tb.fjm;
import tb.fjp;
import tb.fjt;
import tb.fkr;
import tb.idk;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.detail2.core.optimize.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0468a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f11672a;
        public String b;
        public String c;
        public String d;
        public String e;
        public boolean f = false;

        static {
            kge.a(897527005);
        }
    }

    static {
        kge.a(1480081447);
    }

    public static void a(fkr fkrVar, fhi fhiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f269bc0", new Object[]{fkrVar, fhiVar, new Boolean(z)});
        } else if (z) {
        } else {
            fkrVar.c(true);
            try {
                JSONObject H = fhiVar.H();
                fkrVar.a(H.getBooleanValue("enableWeexKeepLive"));
                fkrVar.b(H.getBooleanValue("enableWeexKeepLiveWithActivity"));
                JSONObject jSONObject = H.getJSONObject("optimizeConfig");
                if (jSONObject != null) {
                    fkrVar.a(new ctv(jSONObject));
                    fhiVar.a("optimizeConfig", (Object) fkrVar.r().f(fkrVar.k().W));
                }
            } catch (Throwable th) {
                fjt.a("new_detail异常", "savePreloadFeature异常", th);
            }
            JSONObject s = fhiVar.s();
            if (ipa.aW()) {
                if (s == null) {
                    s = new JSONObject();
                }
                if (h.a(fhiVar)) {
                    s.put(h.ND_CLIENT_ALIGN_PREF_HOME_URL, "true");
                    fjt.a(fjt.TAG_TIP, "Result-AutoAlignWeexUrl align_pref_home , pref or guide-true");
                } else {
                    s.put(h.ND_CLIENT_ALIGN_PREF_HOME_URL, "false");
                    fjt.a(fjt.TAG_TIP, "Result-AutoAlignWeexUrl align_pref_home , pref or guide-false");
                }
            }
            fkrVar.e(s);
        }
    }

    public static b b(fkr fkrVar, fhi fhiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c0dd188d", new Object[]{fkrVar, fhiVar, new Boolean(z)});
        }
        try {
            ctu.a("generatePreRealRequestParams");
            b a2 = a(fkrVar, fhiVar);
            RecRequestParamsV2 a3 = a(fkrVar, a2, z);
            a(a3, fkrVar, a2, a(z, a2));
            a3.setNavRequest(true);
            a2.j = a3;
            return a2;
        } finally {
            ctu.a();
        }
    }

    public static RecRequestParamsV2 a(fkr fkrVar, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("329a4b99", new Object[]{fkrVar, bVar, new Boolean(z)});
        }
        int a2 = a(z, bVar);
        RecRequestParamsV2 recRequestParamsV2 = new RecRequestParamsV2();
        recRequestParamsV2.setSlideMode(z ? "up" : "down");
        if ((fkrVar.b().P() && a2 != 0) || (fkrVar.b().Q() && a2 == 0)) {
            long currentTimeMillis = System.currentTimeMillis();
            String feature = BUFS.getFeature(new BUFS.QueryArgs(), fkrVar.W().a(), fkrVar.W().b(), fkrVar.W().c());
            fjt.a(fjt.TAG_RENDER, "BUFS.getFeature耗时：" + (System.currentTimeMillis() - currentTimeMillis));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bxFeature", (Object) feature);
            recRequestParamsV2.addBizParams(jSONObject);
        }
        recRequestParamsV2.setPreloadPassParams(fkrVar.V());
        recRequestParamsV2.setExposedItemIds(bVar.c.getAppendString());
        if (fkrVar.ag()) {
            recRequestParamsV2.setExposedComplexIds(bVar.d.getAppendString());
        }
        recRequestParamsV2.setExposedCardSubTypes(bVar.e.getAppendString());
        recRequestParamsV2.setExposedItemCount(String.valueOf(bVar.f));
        return recRequestParamsV2;
    }

    public static RecRequestParamsV2 a(RecRequestParamsV2 recRequestParamsV2, fkr fkrVar, b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecRequestParamsV2) ipChange.ipc$dispatch("5455b842", new Object[]{recRequestParamsV2, fkrVar, bVar, new Integer(i)});
        }
        if (recRequestParamsV2 == null) {
            recRequestParamsV2 = new RecRequestParamsV2();
        }
        recRequestParamsV2.setItemId(bVar.i).setPageNum(String.valueOf(i)).setQueryParams(fkrVar.l()).setHalfScreenGuideIndexList(fkrVar.B()).setNewDetailVisibleSizeInfo(fjm.a(fkrVar)).setEntranceCardParams(fkrVar.E()).setAppId(com.taobao.android.detail2.core.framework.data.net.recommend.a.REC_APP_ID).setIsOpenImmediatelyMode(fkrVar.S()).setCustomBizParams(bVar.h).setPassParams(bVar.g).setNewDetailChannel(fkrVar.k().W).setNewType(fkrVar.k().L);
        if (fjk.a()) {
            recRequestParamsV2.setMockSpecifyLiveId(fkrVar.b().h());
        }
        return recRequestParamsV2;
    }

    public static int a(boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97369d95", new Object[]{new Boolean(z), bVar})).intValue() : z ? bVar.f11673a.f11517a + 1 : bVar.b.f11517a + 1;
    }

    public static b a(fkr fkrVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ea571deb", new Object[]{fkrVar, dVar});
        }
        b bVar = new b();
        b(fkrVar, bVar);
        a(fkrVar, bVar);
        if (!fkr.NO_ID_DEFAULT.equals(fkrVar.f())) {
            bVar.c.add(fkrVar.f());
            if (dVar == null) {
                bVar.e.add("_");
            } else {
                bVar.e.add(dVar.c("_"));
            }
        }
        return bVar;
    }

    private static void a(fkr fkrVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcadfc21", new Object[]{fkrVar, bVar});
        } else if (StringUtils.isEmpty(fkrVar.e())) {
        } else {
            bVar.i = fkrVar.e();
        }
    }

    private static void b(fkr fkrVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d7422", new Object[]{fkrVar, bVar});
            return;
        }
        try {
            String c = fkrVar.c(fkrVar.I());
            if (StringUtils.isEmpty(c)) {
                return;
            }
            Uri parse = Uri.parse(c);
            String str = parse.getHost() + parse.getPath();
            JSONObject jSONObject = new JSONObject();
            if (ipa.g()) {
                jSONObject.put("assetsReleaseVersion", (Object) idk.a(c));
            } else {
                jSONObject.put("assetsReleaseVersion", (Object) p.b(c));
            }
            bVar.h.put(URLEncoder.encode(str, "UTF-8"), (Object) jSONObject);
        } catch (Throwable th) {
            fjt.a("new_detail异常", "initJSVersionForRequest异常", th);
        }
    }

    public static C0468a a(MtopResponse mtopResponse, boolean z, int i, b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0468a) ipChange.ipc$dispatch("5a5a9efe", new Object[]{mtopResponse, new Boolean(z), new Integer(i), bVar});
        }
        C0468a c0468a = new C0468a();
        try {
            jSONObject = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject = null;
        }
        String a2 = bpt.a(mtopResponse);
        if (jSONObject == null || jSONObject.keySet().size() == 0) {
            c0468a.c = fjp.ERROR_CODE_RECOMMEND_DATA_EMPTY;
            c0468a.e = a2;
            c0468a.d = "推荐data数据为空, itemId: " + bVar.i + ", isPageUp: " + z + ", pageIndex: " + i;
            c0468a.f11672a = jSONObject;
            c0468a.b = "empty data";
            return c0468a;
        } else if (jSONObject.getJSONArray("sectionList") == null) {
            c0468a.c = fjp.ERROR_CODE_RECOMMEND_SECTION_EMPTY;
            c0468a.e = a2;
            c0468a.d = "推荐section列表数据为空, itemId: " + bVar.i + ", isPageUp: " + z + ", pageIndex: " + i;
            c0468a.f11672a = null;
            c0468a.b = "empty sectionList";
            return c0468a;
        } else {
            c0468a.e = a2;
            c0468a.f11672a = jSONObject;
            c0468a.f = true;
            return c0468a;
        }
    }

    public static void a(JSONObject jSONObject, b bVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67232fbe", new Object[]{jSONObject, bVar});
        } else if (bVar == null || (jSONObject2 = jSONObject.getJSONObject("passParams")) == null) {
        } else {
            bVar.g = jSONObject2;
        }
    }

    public static C0468a a(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0468a) ipChange.ipc$dispatch("dc53783", new Object[]{mtopResponse});
        }
        C0468a c0468a = new C0468a();
        try {
            jSONObject = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Exception e) {
            fjt.a("new_detail异常", "mtopresponse解析失败", e);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            fjt.a(fjt.TAG_RENDER, "预请求preCheckMtopData，拿到的data为空");
            c0468a.f11672a = null;
            c0468a.b = "data null";
            return c0468a;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("preloadSectionList");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            fjt.a(fjt.TAG_RENDER, "预请求preCheckMtopData，拿到的preloadSectionList为空");
            c0468a.f11672a = null;
            c0468a.b = "data null";
            return c0468a;
        }
        c0468a.f11672a = jSONObject2;
        c0468a.f = true;
        return c0468a;
    }
}
