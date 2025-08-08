package com.taobao.android.fluid.framework.data.remote.newmodel;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.remote.MediaContentDetailRecommendRequest;
import com.taobao.android.fluid.framework.data.remote.MediaContentDetailRequest;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.data.remote.newmodel.b;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.Map;
import tb.fhp;
import tb.kge;
import tb.obu;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogv;
import tb.skk;
import tb.skl;
import tb.slq;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MATCH_ALL = "*";
    public static final String MATCH_IGNORE = "ignore";
    public static final String MATCH_NONE = "-";

    static {
        kge.a(887464526);
    }

    public static IMTOPRequest a(FluidContext fluidContext, sps spsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("713b2d58", new Object[]{fluidContext, spsVar, str});
        }
        spz.c("RecommendNewMixUtils", "fetchContentDetail request detail buildExtendParameters refreshCurrentData");
        String str2 = null;
        c.a a2 = slq.a(spsVar, fluidContext.getInstanceConfig().getTab3ComponentSource(), false, true, (String) null);
        if (skk.a(fluidContext)) {
            b.a a3 = a(spsVar, str, "1");
            b.a g = a3.g(spsVar.i);
            if (skk.g()) {
                str2 = b.ASAC_VALUE;
            }
            g.c(str2).h(JSON.toJSONString(a2.a())).c();
            return a3.b();
        }
        MediaContentDetailRequest mediaContentDetailRequest = new MediaContentDetailRequest();
        mediaContentDetailRequest.contentId = str;
        mediaContentDetailRequest.source = spsVar.b;
        mediaContentDetailRequest.detailParameters = spsVar.i;
        mediaContentDetailRequest.extendParameters = JSON.toJSONString(a2.a());
        return mediaContentDetailRequest;
    }

    public static IMTOPRequest a(FluidContext fluidContext, sps spsVar, String str, String str2, String str3, int i, String str4, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("efbd293b", new Object[]{fluidContext, spsVar, str, str2, str3, new Integer(i), str4, new Boolean(z), new Boolean(z2)});
        }
        if (StringUtils.isEmpty(str)) {
            str = spsVar.d;
        }
        if (skk.a(fluidContext)) {
            return a(spsVar, str, z ? "8" : "1").h(str2).c(z2 ? b.ASAC_VALUE : null).d(str3).a(i).s(str4).c().b();
        }
        MediaContentDetailRecommendRequest mediaContentDetailRecommendRequest = new MediaContentDetailRecommendRequest();
        mediaContentDetailRecommendRequest.contentId = str;
        mediaContentDetailRecommendRequest.source = spsVar.b;
        mediaContentDetailRecommendRequest.pageIndex = i;
        mediaContentDetailRecommendRequest.sceneId = str4;
        mediaContentDetailRecommendRequest.pageSize = z ? 3L : 1L;
        mediaContentDetailRecommendRequest.bizParameters = str3;
        mediaContentDetailRecommendRequest.extendParameters = str2;
        return mediaContentDetailRecommendRequest;
    }

    public static com.taobao.android.fluid.framework.data.remote.base.a a(FluidContext fluidContext, a.C0494a c0494a, sps spsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.remote.base.a) ipChange.ipc$dispatch("ba411d23", new Object[]{fluidContext, c0494a, spsVar, new Boolean(z)});
        }
        ogg.d("RecommendNewMixUtils", "开始请求");
        if (!skk.a(fluidContext)) {
            return c0494a;
        }
        String str = null;
        String str2 = (z || !skk.g()) ? null : b.ASAC_VALUE;
        b.a a2 = a(spsVar, c0494a.d(), "1");
        a2.g(c0494a.e()).h(c0494a.g()).a(z).c(str2).c();
        JSONObject a3 = c0494a.a();
        JSONObject jSONObject = a3 != null ? a3.getJSONObject("options") : null;
        if (jSONObject != null) {
            str = jSONObject.getString(MtopModule.KEY_MTOP_BIZ_TOPIC);
        }
        if (str != null) {
            a2.u(str);
        }
        return a2;
    }

    public static com.taobao.android.fluid.framework.data.remote.base.a a(boolean z, boolean z2, int i, String str, sps spsVar, Map map, Map map2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.remote.base.a) ipChange.ipc$dispatch("2c736896", new Object[]{new Boolean(z), new Boolean(z2), new Integer(i), str, spsVar, map, map2, new Boolean(z3)});
        }
        String str2 = !ogv.a(map) ? (String) map.get(c.KEY_TAB3COMPONENTSOURCE) : null;
        String a2 = slq.a(spsVar, map2);
        c.a e = slq.a(spsVar, str2, z2, false, (String) null).e(z3);
        b.a a3 = a(spsVar, str, "1");
        a3.g(a2).h(JSON.toJSONString(e.a())).a(z).b(i).c();
        if (z2) {
            a3.u(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_LAUNCH);
        } else {
            a3.u(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_PRELOAD);
        }
        return a3;
    }

    private static b.a a(sps spsVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("de85dee1", new Object[]{spsVar, str, str2});
        }
        NewRecommendRequest newRecommendRequest = new NewRecommendRequest();
        PositionInfo b = com.taobao.android.editionswitcher.b.b(ab.a());
        return new b().a(spsVar, newRecommendRequest).d().a(a()).e(str).n(spsVar.c).t(spsVar.b).o(spsVar.b).m(mtopsdk.xstate.a.a("nq")).p(str2).j(obu.i() ? "y" : "n").b(oec.a(ab.a())).q(Build.MODEL).f(b == null ? "CN" : b.countryCode).k("content").i(fhp.VIEWHOLDER_KEY).l(d.OPEN_TYPE_MVP).r("POST");
    }

    public static String a(skl sklVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b48fbdc", new Object[]{sklVar}) : skk.b() ? sklVar.P : sklVar.O;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String a2 = oeb.a("ShortVideo.newRecommendMtopAppId", "666");
        spz.c("RecommendNewMixUtils", "getNewRecommendMtopAppId appId:" + a2);
        return a2;
    }
}
