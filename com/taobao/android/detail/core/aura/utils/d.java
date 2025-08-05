package com.taobao.android.detail.core.aura.utils;

import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ai;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ak;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.l;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.n;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.q;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.r;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.y;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.z;
import com.taobao.android.detail.wrapper.ultronengine.event.j;
import com.taobao.android.trade.event.Event;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.emu;
import tb.emw;
import tb.emx;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> ROUTE_TABLE;

    static {
        kge.a(139694808);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ROUTE_TABLE = concurrentHashMap;
        concurrentHashMap.put("openWW", z.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put("openProductParams", r.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put(j.SUBSCRIBER_ID, "open_guarantee");
        ROUTE_TABLE.put("openRate", s.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put("openFloatDialog", n.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE);
        ROUTE_TABLE.put("openShare", "share");
        ROUTE_TABLE.put("addToCart", com.taobao.android.detail.ttdetail.handler.bizhandlers.b.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put("buyNow", com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put(com.taobao.android.detail.wrapper.ultronengine.event.h.SUBSCRIBER_ID, "open_desc");
        ROUTE_TABLE.put("openPopLayer", q.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put("openRedPacket", "open_redpacket");
        ROUTE_TABLE.put("openTmallApp", y.EVENT_TYPE_ALTERNATIVE);
        ROUTE_TABLE.put("open_url", "open_url");
        ROUTE_TABLE.put("user_track", "user_track");
        ROUTE_TABLE.put("openUrl", "open_url");
        ROUTE_TABLE.put("userTrack", "user_track");
        ROUTE_TABLE.put("ut_exposure", "ut_exposure");
        ROUTE_TABLE.put(ai.EVENT_TYPE, ai.EVENT_TYPE);
        ROUTE_TABLE.put("open_guarantee", "open_guarantee");
        ROUTE_TABLE.put(ak.EVENT_TYPE, ak.EVENT_TYPE);
        ROUTE_TABLE.put(l.EVENT_TYPE, l.EVENT_TYPE);
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailEventRouteUtils");
    }

    public static Event a(DetailCoreActivity detailCoreActivity, AURAEventIO aURAEventIO, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("844cab8", new Object[]{detailCoreActivity, aURAEventIO, map});
        }
        emw a2 = emx.a(detailCoreActivity);
        if (a2 == null || a2.b() == null || a2.b().n() == null || !map.containsKey(aURAEventIO.getEventType())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) map.get(aURAEventIO.getEventType()));
        jSONObject.put("fields", (Object) aURAEventIO.getEventModel().c());
        return emx.a(detailCoreActivity).b().n().a(new ActionModel(jSONObject), detailCoreActivity.C().f10055a, null, null);
    }
}
