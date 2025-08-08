package com.taobao.tao.rate.ui.commit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.helper.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.rate.common.helper.b;
import com.taobao.tao.rate.kit.broadcast.RateOpAPI;
import com.taobao.taobao.R;
import com.taobao.ugc.fragment.request.GetOrderRateInfoResponse;
import com.taobao.ugc.fragment.request.OrderRateInfoData;
import com.taobao.ugc.utils.n;
import com.taobao.ugc.utils.q;
import com.taobao.ugc.utils.w;
import com.taobao.ugc.utils.z;
import com.taobao.uikit.extend.component.TBCircularProgress;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jmq;
import tb.kge;
import tb.onu;
import tb.qoj;
import tb.tko;
import tb.tkz;

/* loaded from: classes8.dex */
public class MainRateLoadingActivity extends FragmentActivity implements tkz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "com.taobao.ugc.action";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_ORDER_ID = "orderId";
    public static final String KEY_SELLER_ID = "sellerId";
    public static final String ORDERID = "orderID";
    public static final String ORDERID2 = "orderId";
    public static final int REQUEST_CODE = 10001;
    private TBCircularProgress b;
    private String c;
    private String d;
    private String e;
    private onu g;
    private long h;
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.tao.rate.ui.commit.MainRateLoadingActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            StringBuilder sb;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                String action = intent.getAction();
                JSONObject jSONObject = new JSONObject();
                if (b.e().booleanValue()) {
                    MainRateLoadingActivity.this.finish();
                    return;
                }
                if (StringUtils.equals(action, MainRateLoadingActivity.ACTION)) {
                    if (b.d().booleanValue()) {
                        String c = b.c();
                        String stringExtra = intent.getStringExtra("suc_url_params");
                        String stringExtra2 = intent.getStringExtra("next_page_url");
                        if (!StringUtils.isEmpty(stringExtra)) {
                            jSONObject = JSON.parseObject(stringExtra);
                        }
                        if (stringExtra2 != null && !stringExtra2.isEmpty()) {
                            c = stringExtra2;
                        }
                        str = b.a(jSONObject, c);
                        Nav.from(MainRateLoadingActivity.this).toUri(str);
                        sb = new StringBuilder();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if (!StringUtils.isEmpty(MainRateLoadingActivity.a(MainRateLoadingActivity.this))) {
                            sb2.append("&sellerId=");
                            sb2.append(MainRateLoadingActivity.a(MainRateLoadingActivity.this));
                        }
                        String a2 = MainRateLoadingActivity.this.f20893a ? b.a() : b.b();
                        String stringExtra3 = intent.getStringExtra("suc_url_params");
                        String stringExtra4 = intent.getStringExtra("data");
                        if (!StringUtils.isEmpty(stringExtra3)) {
                            jSONObject = JSON.parseObject(stringExtra3);
                            b.a(sb2, jSONObject);
                        } else {
                            MainRateLoadingActivity.a(MainRateLoadingActivity.this, sb2, stringExtra4);
                        }
                        str = a2 + MainRateLoadingActivity.b(MainRateLoadingActivity.this) + sb2.toString();
                        Nav.from(MainRateLoadingActivity.this).toUri(str);
                        sb = new StringBuilder();
                    }
                    sb.append("rate success jump url: ");
                    sb.append(str);
                    sb.toString();
                }
                Intent intent2 = new Intent(RateOpAPI.f);
                intent2.putExtra(RateOpAPI.g, true);
                LocalBroadcastManager.getInstance(MainRateLoadingActivity.this).sendBroadcast(intent2);
                Intent intent3 = new Intent(com.taobao.android.order.bundle.helper.b.ORDER_ACTION);
                intent3.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                intent3.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                intent3.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                MainRateLoadingActivity.this.getApplicationContext().sendBroadcast(intent3);
                Intent intent4 = new Intent("MyTaobao_Order_Refresh");
                intent4.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                intent4.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                intent4.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                MainRateLoadingActivity.this.getApplicationContext().sendBroadcast(intent4);
                b.a(MainRateLoadingActivity.this, jSONObject, "RateSuccess");
                MainRateLoadingActivity.this.getApplicationContext().sendBroadcast(b.a(jSONObject));
                String str2 = "sendBroadcast: " + jSONObject.toJSONString();
                MainRateLoadingActivity.this.finish();
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f20893a = false;

    static {
        kge.a(1968910054);
        kge.a(-273825309);
    }

    private String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "Page_MainRateLoading";
    }

    public static /* synthetic */ Object ipc$super(MainRateLoadingActivity mainRateLoadingActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ String a(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c75f740d", new Object[]{mainRateLoadingActivity}) : mainRateLoadingActivity.d;
    }

    public static /* synthetic */ String a(MainRateLoadingActivity mainRateLoadingActivity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b857b643", new Object[]{mainRateLoadingActivity, str}) : mainRateLoadingActivity.a(str);
    }

    public static /* synthetic */ void a(MainRateLoadingActivity mainRateLoadingActivity, StringBuilder sb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba918e62", new Object[]{mainRateLoadingActivity, sb, str});
        } else {
            mainRateLoadingActivity.a(sb, str);
        }
    }

    public static /* synthetic */ String b(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c82df28e", new Object[]{mainRateLoadingActivity}) : mainRateLoadingActivity.c;
    }

    public static /* synthetic */ TBCircularProgress c(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgress) ipChange.ipc$dispatch("b9ac1e13", new Object[]{mainRateLoadingActivity}) : mainRateLoadingActivity.b;
    }

    public static /* synthetic */ String d(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9caef90", new Object[]{mainRateLoadingActivity}) : mainRateLoadingActivity.e;
    }

    public static /* synthetic */ long e(MainRateLoadingActivity mainRateLoadingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b3fd263", new Object[]{mainRateLoadingActivity})).longValue() : mainRateLoadingActivity.h;
    }

    private void a(StringBuilder sb, String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6b8fcd", new Object[]{this, sb, str});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
        } else {
            Map map = (Map) JSON.parseObject(String.valueOf(jSONObject.getJSONObject("orderToFeedIdMap")), Map.class);
            if (map != null) {
                Object obj = map.get(this.c);
                if (obj instanceof String) {
                    sb.append("&rateId=");
                    sb.append((String) obj);
                }
            }
            Boolean bool = jSONObject.getBoolean("allGoodRate");
            if (bool != null) {
                sb.append("&allGoodRate=");
                sb.append(bool);
            }
            b(sb, jSONObject, "rewardStatus");
            b(sb, jSONObject, "rewardNumberFormat");
            b(sb, jSONObject, "rewardType");
            b(sb, jSONObject, "unlockRaterTask");
            b(sb, jSONObject, "listVersion");
        }
    }

    private static void b(StringBuilder sb, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8deb8518", new Object[]{sb, jSONObject, str});
            return;
        }
        String string = jSONObject.getString(str);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(string);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        a();
        setContentView(R.layout.rate_ugc_activity_loading);
        qoj.a();
        String config = OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "rateSucessPage", "false");
        if (!StringUtils.isEmpty(config)) {
            this.f20893a = Boolean.valueOf(config).booleanValue();
        }
        this.b = (TBCircularProgress) findViewById(R.id.rate_progress);
        this.b.setVisibility(0);
        this.g = new onu();
        if (!a(getIntent())) {
            com.taobao.tao.rate.kit.engine.b.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
            return;
        }
        if (!StringUtils.isEmpty(this.c)) {
            c();
            new tko().a(this.c, this.e, b(), this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f, intentFilter);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            this.h = System.currentTimeMillis();
            return;
        }
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        if (longExtra > 0) {
            this.h = longExtra;
        } else if (longExtra2 > 0) {
            this.h = longExtra2;
        } else {
            this.h = System.currentTimeMillis();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.g.a(this, d());
        if (this.b.getVisibility() == 0) {
            return;
        }
        this.b.setVisibility(0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.g.a(this);
    }

    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMessages", "intent = null");
            onu.a(d(), "Report-Error", hashMap);
            return false;
        }
        this.c = null;
        try {
            this.c = intent.getStringExtra("orderID");
            if (StringUtils.isEmpty(this.c)) {
                this.c = intent.getStringExtra("orderId");
            }
        } catch (Exception unused) {
        }
        if (StringUtils.isEmpty(this.c)) {
            Uri data = intent.getData();
            if (data == null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errorMessages", "intent uri = null");
                hashMap2.put("orderId", this.c);
                onu.a(d(), "Report-Error", hashMap2);
                return false;
            }
            this.c = data.getQueryParameter("orderID");
            if (StringUtils.isEmpty(this.c)) {
                this.c = data.getQueryParameter("orderId");
            }
        }
        return !StringUtils.isEmpty(this.c);
    }

    @Override // tb.tkz
    public void a(GetOrderRateInfoResponse getOrderRateInfoResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4dfcc2", new Object[]{this, getOrderRateInfoResponse});
        } else if (getOrderRateInfoResponse == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMessages", "response = null");
            onu.a(d(), "Report-Error", hashMap);
            onu.a("Page_Rate", "Entry-Report-Error", hashMap);
            finish();
        } else {
            OrderRateInfoData mo2429getData = getOrderRateInfoResponse.mo2429getData();
            if (mo2429getData == null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errorMessages", "data = null");
                onu.a(d(), "Report-Error", hashMap2);
                onu.a("Page_Rate", "Entry-Report-Error", hashMap2);
                finish();
                return;
            }
            final String redirectUrl = mo2429getData.getRedirectUrl();
            this.d = mo2429getData.getSellerId();
            c();
            HashMap hashMap3 = new HashMap();
            hashMap3.put(Constants.WEIBO_REDIRECTURL_KEY, !StringUtils.isEmpty(redirectUrl) ? redirectUrl : "");
            onu.a("Page_Rate", "Entry-Redirect-Request", hashMap3);
            a("process_rate_publish_order_request", System.currentTimeMillis() - this.h, (Map<String, String>) null);
            if (!StringUtils.isEmpty(redirectUrl)) {
                w.a(new w.b() { // from class: com.taobao.tao.rate.ui.commit.MainRateLoadingActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.ugc.utils.w.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        MainRateLoadingActivity.c(MainRateLoadingActivity.this).setVisibility(8);
                        String str = redirectUrl;
                        Nav forResult = Nav.from(MainRateLoadingActivity.this).forResult(10001);
                        Nav.setTransition(17432576, 17432577);
                        if (!StringUtils.isEmpty(MainRateLoadingActivity.d(MainRateLoadingActivity.this))) {
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("channel", MainRateLoadingActivity.d(MainRateLoadingActivity.this));
                            str = q.a(str, hashMap4);
                        }
                        if (MainRateLoadingActivity.e(MainRateLoadingActivity.this) > 0) {
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("clickStartTime", Long.valueOf(MainRateLoadingActivity.e(MainRateLoadingActivity.this)));
                            str = q.a(str, hashMap5);
                        }
                        String a2 = MainRateLoadingActivity.a(MainRateLoadingActivity.this, str);
                        Uri parse = Uri.parse(a2);
                        if (at.a(parse.getQueryParameter("floatMode"), false)) {
                            forResult.toUri(parse.buildUpon().path("/ocean/publish_float.htm").build());
                        } else {
                            forResult.toUri(a2);
                        }
                    }

                    @Override // com.taobao.ugc.utils.w.b
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            return;
                        }
                        String a2 = z.a();
                        if (!StringUtils.isEmpty(a2)) {
                            Nav.from(MainRateLoadingActivity.this).toUri(ax.a(a2, q.a(MainRateLoadingActivity.this.getIntent().getData())));
                            MainRateLoadingActivity.this.finish();
                            return;
                        }
                        com.taobao.tao.rate.kit.engine.b.a(MainRateLoadingActivity.this.getApplicationContext(), MainRateLoadingActivity.this.getResources().getString(R.string.rate_invalid_request));
                        MainRateLoadingActivity.this.finish();
                    }
                });
                return;
            }
            com.taobao.tao.rate.kit.engine.b.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
        }
    }

    private static void a(String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f002c73", new Object[]{str, new Long(j), map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            jmq.d().a("rate_performance", 2201, "rate_cost", str, String.valueOf(j), n.a(hashMap));
        }
    }

    private void c() {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (getIntent() == null || (a2 = q.a(getIntent().getData())) == null || !a2.containsKey("channel")) {
        } else {
            this.e = a2.get("channel");
        }
    }

    private String a(String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (getIntent() == null || (a2 = q.a(getIntent().getData())) == null || !a2.containsKey("extraParams")) {
            return str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extraParams", a2.get("extraParams"));
        return q.a(str, hashMap);
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        try {
            Map<String, String> a2 = q.a(getIntent().getData());
            if (a2.containsKey("extraParams")) {
                return m.a(JSONObject.parseObject(a2.get("extraParams")));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // tb.tkz
    public void a(MtopResponse mtopResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad030c1", new Object[]{this, mtopResponse, str, str2});
            return;
        }
        if (!StringUtils.isEmpty(str2)) {
            com.taobao.tao.rate.kit.engine.b.a(getApplicationContext(), str2);
        } else {
            com.taobao.tao.rate.kit.engine.b.a(getApplicationContext(), com.taobao.android.litecreator.localization.a.a(R.string.rate_data_retrieval_failed_retry));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMessages", str2);
        hashMap.put("orderId", this.c);
        onu.a(d(), "Report-Error", hashMap);
        onu.a("Page_Rate", "Entry-Report-Error", hashMap);
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == -1) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g = null;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f);
    }
}
