package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.avr;
import tb.dwq;
import tb.dwv;
import tb.eca;
import tb.emu;
import tb.enh;
import tb.eqb;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AURA_DETAIL_DOWNGRADE = "auraDetailDowngrade";
    public static final String KEY_DEGRADE_REASON = "auraDetailDowngradeReason";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9400a;
    public static final List<String> b;

    static {
        kge.a(223662157);
        f9400a = new ArrayList();
        b = new ArrayList();
        f9400a.clear();
        f9400a.addAll(d.ROUTE_TABLE.keySet());
        f9400a.add(avr.EVENT_TYPE);
        f9400a.add("userTrack");
        f9400a.add("toast");
        f9400a.add("openUrl");
        f9400a.add(dwv.EVENT_TYPE);
        f9400a.add("checkCollect");
        f9400a.add("collectClick");
        f9400a.add("openAddress");
        f9400a.add("openSKU");
        f9400a.add("addJhsWaiting");
        f9400a.add("checkPresale");
        f9400a.add("adjustState");
        f9400a.add("setRemind");
        f9400a.add("invateRate");
        f9400a.add("querySMBagPrice");
        f9400a.add("openRate");
        f9400a.add("updateSKUQuantity");
        f9400a.add("adjustRules");
        f9400a.add("updateOpenAPIMsgSubscriberStatus");
        f9400a.add("openAPIMsgSubscriber");
        f9400a.add("mtopRequest");
        List<String> h = f.h();
        if (h != null) {
            f9400a.addAll(h);
        }
        b.clear();
        List<String> g = f.g();
        if (g != null) {
            b.addAll(g);
        }
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailDowngradeUtil");
    }

    public static void a(final Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a(j.a("AliDetailDowngradeUtil"), BTags.DowngradeTag), "jumpOldDetail AURA降级");
        if (jqm.a()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.detail.core.aura.utils.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Toast.makeText(context, "AURA页面降级", 0).show();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        b(context, str);
        if (context instanceof DetailCoreActivity) {
            ((DetailCoreActivity) context).d(true);
        }
        p pVar = new p();
        pVar.f = true;
        com.taobao.android.trade.event.f.a(context, pVar);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        p pVar = new p();
        pVar.i = str;
        pVar.j = str2;
        pVar.h = true;
        com.taobao.android.trade.event.f.a(context, pVar);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (context instanceof DetailCoreActivity) {
            ((DetailCoreActivity) context).e(true);
        }
        p pVar = new p();
        pVar.g = true;
        com.taobao.android.trade.event.f.a(context, pVar);
    }

    private static void b(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(1, dwq.AURA_MODULE_NAME, "downgradeOldProtocol", "AURA降级至非终态协议");
        bVar.a(new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.aura.utils.AliDetailDowngradeUtil$2
            {
                put(c.KEY_DEGRADE_REASON, str);
            }
        });
        h.a(context, bVar, str);
        i.c(context);
        eca.a(context, str);
    }

    public static boolean a(Context context, List<AURARenderComponent> list) {
        Map<String, List<Event>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9773155", new Object[]{context, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (AURARenderComponent aURARenderComponent : list) {
                if (aURARenderComponent != null && aURARenderComponent.data != null && (map = aURARenderComponent.data.events) != null && !map.isEmpty()) {
                    for (String str : map.keySet()) {
                        List<Event> list2 = map.get(str);
                        if (list2 != null && !list2.isEmpty()) {
                            for (Event event : list2) {
                                if (event != null) {
                                    if (!a(event.type, f9400a)) {
                                        String str2 = null;
                                        if (context instanceof DetailCoreActivity) {
                                            com.taobao.android.detail.datasdk.model.datamodel.node.c C = ((DetailCoreActivity) context).C();
                                            str2 = C == null ? "" : C.i();
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("aura event uncovered:");
                                        sb.append(event.type == null ? "" : event.type);
                                        sb.append(" itemId:");
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        sb.append(str2);
                                        h.a(context, new com.alibaba.android.aura.b(1, dwq.AURA_MODULE_NAME, "auraUncoveredEvent", sb.toString()));
                                        return true;
                                    } else if (a(event.type, b)) {
                                        return true;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (StringUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72cc59d", new Object[]{enhVar})).booleanValue();
        }
        if (enhVar != null && enhVar.c != null && enhVar.c.f27459a != null && enhVar.c.f27459a.f10055a != null) {
            com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = enhVar.c.f27459a.f10055a;
            FeatureNode f = eqb.f(bVar);
            ItemNode c = eqb.c(bVar);
            if (f != null && f.oneProductMMDegrade && c != null && !StringUtils.isEmpty(c.itemId)) {
                return true;
            }
        }
        return false;
    }

    public static void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce12f06", new Object[]{bVar, context});
        } else if (bVar == null || context == null) {
        } else {
            ItemNode c = eqb.c(bVar);
            String str = "";
            String str2 = c != null ? c.itemId : str;
            SkuCoreNode j = eqb.j(bVar);
            if (j != null && j.skuItem != null) {
                str = j.skuItem.skuId;
            }
            a(context, str2, str);
        }
    }
}
