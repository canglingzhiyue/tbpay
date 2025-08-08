package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.internal.perf.model.PerformanceFlowModel;
import com.taobao.taobao.internal.perf.model.PerformanceStageModel;
import com.taobao.taobao.utils.b;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class tdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f34051a;
    private final String c;
    private final a d;
    private String e;
    private Map<String, String> j;
    private final Map<String, Long> h = new HashMap();
    private final List<String> i = new ArrayList();
    private final PerformanceFlowModel b = new PerformanceFlowModel("tbcashdesk", "收银台", null, null, "taobao.cashdesk.pay");

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f34053a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long e = 0;
        public long f = 0;
        public long g = 0;
    }

    public static /* synthetic */ Map a(tdx tdxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bfb67805", new Object[]{tdxVar}) : tdxVar.j;
    }

    public static /* synthetic */ void a(tdx tdxVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592a5ee4", new Object[]{tdxVar, str, str2});
        } else {
            tdxVar.a(str, str2);
        }
    }

    public static /* synthetic */ void a(tdx tdxVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691c4cab", new Object[]{tdxVar, str, map});
        } else {
            tdxVar.a(str, map);
        }
    }

    public static /* synthetic */ void a(tdx tdxVar, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fba6e49", new Object[]{tdxVar, map, str, str2});
        } else {
            tdxVar.a(map, str, str2);
        }
    }

    public static /* synthetic */ PerformanceFlowModel b(tdx tdxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PerformanceFlowModel) ipChange.ipc$dispatch("28ea0da1", new Object[]{tdxVar}) : tdxVar.b;
    }

    public static /* synthetic */ Map c(tdx tdxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("32589987", new Object[]{tdxVar}) : tdxVar.h;
    }

    public static /* synthetic */ List d(tdx tdxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9813c94", new Object[]{tdxVar}) : tdxVar.i;
    }

    public tdx(Activity activity, String str) {
        this.f34051a = activity;
        this.b.setStartMills(System.currentTimeMillis());
        this.c = str;
        this.d = new a();
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            a(map, true);
        }
    }

    public void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
            return;
        }
        JSONObject e = e(map);
        this.j = map;
        this.e = e != null ? e.getString("paymentType") : "未知";
        this.d.e = System.currentTimeMillis();
        Activity activity = this.f34051a;
        if (activity != null) {
            this.d.d = z ? activity.getIntent().getLongExtra("NAV_START_ACTIVITY_TIME", 0L) : 0L;
        }
        if (e == null) {
            return;
        }
        this.d.f34053a = a(e.getString("startTime"), 0L);
        this.d.b = a(e.getString(joq.STAGE_BEFORE_NETWORK), 0L);
        this.d.c = a(e.getString("startToPay"), 0L);
    }

    private JSONObject e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee8b72b9", new Object[]{this, map});
        }
        String str = map.get("option");
        if (str != null) {
            return JSONObject.parseObject(str);
        }
        return null;
    }

    private long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.f = System.currentTimeMillis();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a((String) null, (String) null, str);
        }
    }

    public void a(final String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.d.g = System.currentTimeMillis();
        if (b(str3)) {
            return;
        }
        jqh.a(new Runnable() { // from class: tb.tdx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    tdx.a(tdx.this, str, str2);
                    tdx.a(tdx.this, tdx.a(tdx.this), str, str2);
                    String jSONString = JSON.toJSONString(tdx.b(tdx.this));
                    HashMap hashMap = new HashMap();
                    hashMap.put(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, jSONString);
                    tdx.a(tdx.this, "tbcashdesk", hashMap);
                    b.a("taobao.cashdesk.pay", tdx.c(tdx.this), tdx.d(tdx.this), 0.1f);
                    jqg.b("PerformanceTrace", tdx.c(tdx.this).toString());
                    jqg.b("PerformanceTrace", tdx.d(tdx.this).toString());
                } catch (Throwable th) {
                    jqg.b("PerformanceTrace", th.getMessage());
                }
            }
        });
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (this.d.f34053a != 0 && this.d.b != 0) {
            this.b.setStartMills(this.d.f34053a);
            PerformanceStageModel performanceStageModel = new PerformanceStageModel(joq.STAGE_BEFORE_NETWORK);
            performanceStageModel.setStartMills(this.d.f34053a);
            performanceStageModel.setEndMills(this.d.b);
            this.b.addChildStage(performanceStageModel);
            this.h.put(joq.STAGE_BEFORE_NETWORK, Long.valueOf(this.d.b - this.d.f34053a));
        }
        if (this.d.c != 0 && this.d.b != 0) {
            this.h.put("createOrderRequestTime", Long.valueOf(this.d.c - this.d.b));
        } else if (this.d.d != 0 && this.d.b != 0 && this.d.d - this.d.b > 0) {
            this.h.put("createOrderRequestTime", Long.valueOf(this.d.d - this.d.b));
        } else if (this.d.e != 0 && this.d.b != 0 && this.d.e - this.d.b > 0) {
            this.h.put("createOrderRequestTime", Long.valueOf(this.d.e - this.d.b));
        }
        if (this.d.c != 0 && this.d.d != 0 && this.d.d - this.d.c > 0) {
            this.h.put("CallJSBridge耗时", Long.valueOf(this.d.d - this.d.c));
        } else if (this.d.c != 0 && this.d.e != 0 && this.d.e - this.d.c > 0) {
            this.h.put("CallJSBridge耗时", Long.valueOf(this.d.e - this.d.c));
        }
        if (this.d.d != 0 && this.d.e != 0 && this.d.e - this.d.d > 0) {
            PerformanceStageModel performanceStageModel2 = new PerformanceStageModel("navTime");
            performanceStageModel2.setStartMills(this.d.d);
            performanceStageModel2.setEndMills(this.d.e);
            this.b.addChildStage(performanceStageModel2);
            this.h.put("导航耗时", Long.valueOf(this.d.e - this.d.d));
        }
        if (this.d.e != 0 && this.d.f != 0 && this.d.f - this.d.e > 0) {
            PerformanceStageModel performanceStageModel3 = new PerformanceStageModel("containerTime");
            performanceStageModel3.setStartMills(this.d.e);
            performanceStageModel3.setEndMills(this.d.f);
            this.b.addChildStage(performanceStageModel3);
            this.h.put("containerTime", Long.valueOf(this.d.f - this.d.e));
        }
        if (this.d.f != 0 && this.d.g != 0 && this.d.g - this.d.f > 0) {
            PerformanceStageModel performanceStageModel4 = new PerformanceStageModel("realPayTime");
            performanceStageModel4.setStartMills(this.d.f);
            performanceStageModel4.setEndMills(this.d.g);
            this.b.addChildStage(performanceStageModel4);
            this.b.setEndMills(this.d.g);
            this.h.put("payTime", Long.valueOf(this.d.g - this.d.f));
        }
        if (this.d.f34053a != 0 && this.d.g != 0 && this.d.g - this.d.f34053a > 0) {
            this.h.put("提交到支付完成总耗时", Long.valueOf(this.d.g - this.d.f34053a));
        } else if (this.d.e != 0 && this.d.g != 0 && this.d.g - this.d.e > 0) {
            this.h.put("拉起收银台到支付总耗时", Long.valueOf(this.d.g - this.d.e));
        }
        long a2 = a(str, 0L);
        if (a2 > 0) {
            this.h.put("alipayOpenTime", Long.valueOf(a2));
        }
        long a3 = a(str2, 0L);
        if (a3 <= 0) {
            return;
        }
        this.h.put("alipayRenderTime", Long.valueOf(a3));
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !"9000".equals(str);
    }

    private boolean b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("signStr");
        return str != null && str.contains("&agreement_no=") && str.contains("payService=\"litePay\"");
    }

    private String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{this, map});
        }
        String str = map.get("orderids");
        return StringUtils.isEmpty(str) ? "" : String.valueOf(str.split(",").length);
    }

    private String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c9c3aa6", new Object[]{this, map});
        }
        String str = map.get("signStr");
        return StringUtils.isEmpty(str) ? "" : str;
    }

    private void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
            return;
        }
        String valueOf = String.valueOf(b(map));
        String c = c(map);
        String str3 = map.get("from");
        HashMap hashMap = new HashMap(3);
        hashMap.put("litePay", valueOf);
        if (str != null) {
            hashMap.put(MspGlobalDefine.OPEN_TIME, str);
        }
        if (str2 != null) {
            hashMap.put("renderTime", str2);
        }
        hashMap.put("itemCount", c);
        hashMap.put("signStr", d(map));
        hashMap.put(CashdeskConstants.CASHIER_TYPE, this.c);
        hashMap.put("litePay", valueOf);
        if (str3 != null) {
            hashMap.put("from", str3);
        }
        hashMap.put("paymentType", this.e);
        this.b.addCommonArgs(hashMap);
        List<String> list = this.i;
        list.add("类型：" + this.c);
        List<String> list2 = this.i;
        list2.add("免密：" + valueOf);
        List<String> list3 = this.i;
        list3.add("数量：" + c);
        List<String> list4 = this.i;
        list4.add("来源：" + str3);
        List<String> list5 = this.i;
        list5.add("支付：" + this.e);
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, str, "", "", map).build());
        }
    }
}
