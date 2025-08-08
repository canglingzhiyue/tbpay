package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* loaded from: classes8.dex */
public class opi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32262a;

    static {
        kge.a(469933770);
    }

    private static boolean b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dfaa61e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : i == 0 && i2 == 0 && i3 == 0;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f32262a = true;
        lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "进入我淘了");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        f32262a = false;
        lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "离开我淘了");
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (!c()) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "orderCountRequestSuccess 不需要预请求");
        } else if (!f32262a) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "真实需要发请求的时候已经离开我淘 不需要发请求了");
        } else {
            int a2 = a(jSONObject, "waitPay");
            int a3 = a(jSONObject, "waitConfirm");
            int a4 = a(jSONObject, "waitSend");
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "当前待支付的订单数是：" + a2 + "待确认的订单数：" + a3 + "待发货的订单数是：" + a4);
            a(a2, a3, a4);
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!j.a("orderListRecInstantOpenEnable", true)) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "我淘预请求降级了");
            return false;
        } else if ("tscheduleAndInstantOpen".equals(opj.b())) {
            return true;
        } else {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "当前不允许在我淘预请求");
            return false;
        }
    }

    private static void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String c = opj.c();
        if (StringUtils.isEmpty(c)) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "实验类型为空，不发预请求");
        } else if (b(i, i2, i3)) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "000情况不处理");
        } else if (a(c, i, i2, i3)) {
            d();
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "符合都小于3的情况，准备发预请求了");
        } else if (!b(c, i, i2, i3)) {
        } else {
            d();
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "符合有一个小于3的情况，准备发预请求了");
        }
    }

    private static boolean a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fb0d35", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        boolean equals = opj.ALL_LESS_THEN.equals(str);
        int d = opj.d();
        return equals && (i <= d && i2 <= d && i3 <= d);
    }

    private static boolean b(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8d46054", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        boolean equals = opj.ONE_LESS_THEN.equals(str);
        int d = opj.d();
        return equals && ((i > 0 && i <= d) || (i2 > 0 && i2 <= d) || (i3 > 0 && i3 <= d));
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        JSONObject e = e();
        if (e == null || e.isEmpty()) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "预请求的配置为空");
            return;
        }
        oph.a(b(e), ksk.REC_ORDER_LIST_CATAPULT, opj.a());
        opr.b(opr.ORIGIN_MY_TAO_BAO);
        opr.a("tscheduleAndInstantOpen");
    }

    private static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        return jSONObject2;
    }

    private static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[0]);
        }
        try {
            return JSON.parseObject(j.a("orderListPreRequestParams", "{\"apiParams\":{\"appid\":2497,\"isNeedSubSelectionData\":\"true\"},\"ignores\":[\"orderIdsStr\",\"clientReqTime\",\"channel\",\"orderListType\"],\"timeout\":\"15000\"}"));
        } catch (Exception e) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "获取预请求配置出现异常：" + e);
            return null;
        }
    }

    private static int a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48075345", new Object[]{jSONObject, str})).intValue();
        }
        if (jSONObject.isEmpty()) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "我淘返回订单的接口为空");
            return 0;
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "MyTaoBaoPreRequest", "解析订单数出现异常：" + e);
            return 0;
        }
    }
}
