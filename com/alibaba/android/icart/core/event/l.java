package com.alibaba.android.icart.core.event;

import com.alibaba.ariver.kernel.RVEvents;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bmy;
import tb.kge;

/* loaded from: classes2.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends bmy>> f2338a;

    static {
        kge.a(15127152);
        HashMap hashMap = new HashMap();
        f2338a = hashMap;
        hashMap.put("cartSelect", aa.class);
        f2338a.put("cartAdjustOperate", h.class);
        f2338a.put("changeQuantity", ag.class);
        f2338a.put("cartSubmit", ad.class);
        f2338a.put("cartGroupSubmit", o.class);
        f2338a.put("cartUserTrack", af.class);
        f2338a.put("widgetExposure", ao.class);
        f2338a.put("popItemExpand", u.class);
        f2338a.put("popExpandClick", t.class);
        f2338a.put("cartCalculateClick", a.class);
        f2338a.put("cartCheckAll", b.class);
        f2338a.put("cartSettlement", ac.class);
        f2338a.put("receiveUPP", an.class);
        f2338a.put("openSearch", z.class);
        f2338a.put("closeSearch", z.class);
        f2338a.put("searchClick", z.class);
        f2338a.put("keywordChange", aj.class);
        f2338a.put("mtopRequest", ak.class);
        f2338a.put("reorderClick", y.class);
        f2338a.put("addItemSelect", f.class);
        f2338a.put("addGroupPopupWindow", d.class);
        f2338a.put("shareClick", q.class);
        f2338a.put("moreClick", p.class);
        f2338a.put("openPopupWindow", al.class);
        f2338a.put("closePopupWindow", ah.class);
        f2338a.put(RVEvents.TAB_CLICK, ae.class);
        f2338a.put("confirmAddClick", e.class);
        f2338a.put("cartOperateDialog", ItemOperationSubscriber.class);
        f2338a.put("checkPromotion", i.class);
        f2338a.put("eventQueue", k.class);
        f2338a.put("groupInit", n.class);
        f2338a.put("transparent", v.class);
        f2338a.put("recommendItemClick", w.class);
        f2338a.put("expandSelectedItems", m.class);
        f2338a.put("recommendTabClick", x.class);
        f2338a.put("showAllGroup", ab.class);
        f2338a.put("confirmGroupClick", j.class);
        f2338a.put("couponInit", ai.class);
        f2338a.put("jumpElevatorClick", r.class);
        f2338a.put("addressEyeClick", g.class);
        f2338a.put("showStdPop", ap.class);
        f2338a.put("alipayService", c.class);
        f2338a.put("showAll", s.class);
        f2338a.put("openPop", com.alibaba.android.icart.core.ability.event.a.class);
    }

    public static Map<String, Class<? extends bmy>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f2338a;
    }
}
