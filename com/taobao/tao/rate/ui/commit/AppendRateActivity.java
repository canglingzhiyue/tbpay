package com.taobao.tao.rate.ui.commit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.rate.common.helper.b;
import com.taobao.tao.rate.kit.broadcast.RateOpAPI;
import com.taobao.taobao.R;
import com.taobao.ugc.utils.q;
import com.taobao.ugc.utils.w;
import com.taobao.ugc.utils.z;
import java.util.HashMap;
import tb.kge;
import tb.onu;
import tb.qoj;

/* loaded from: classes8.dex */
public class AppendRateActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL = "channel";
    public static final String ISARCHIVE = "isArchive";
    public static final String ORDERID = "parentBizOrderId";
    public static final int REQUEST_CODE = 10001;
    public static final String TAG = "AppendRateActivity";
    private String c;
    private String d;
    private String e;
    private long g;
    private final String b = "taobao.rate.newAppend";
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.tao.rate.ui.commit.AppendRateActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                String action = intent.getAction();
                JSONObject jSONObject = new JSONObject();
                if (b.e().booleanValue()) {
                    AppendRateActivity.this.finish();
                    return;
                }
                if (TextUtils.equals(action, "taobao.rate.newAppend")) {
                    String stringExtra = intent.getStringExtra("suc_url_params");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        jSONObject = JSON.parseObject(stringExtra);
                    }
                    if (b.d().booleanValue()) {
                        String c = b.c();
                        String stringExtra2 = intent.getStringExtra("next_page_url");
                        if (intent.getBooleanExtra("enable_jump", false)) {
                            if (stringExtra2 != null && !stringExtra2.isEmpty()) {
                                c = stringExtra2;
                            }
                            String a2 = b.a(jSONObject, c);
                            Nav.from(AppendRateActivity.this).toUri(a2);
                            String str = "rate success jump url: " + a2;
                            HashMap hashMap = new HashMap();
                            hashMap.put("status", "1");
                            hashMap.put("orderId", AppendRateActivity.a(AppendRateActivity.this));
                            onu.a("Page_AppendRate", "Button-Publish", hashMap);
                            Intent intent2 = new Intent(RateOpAPI.x);
                            Bundle bundle = new Bundle();
                            bundle.putString(RateOpAPI.l, "");
                            bundle.putString(RateOpAPI.b, AppendRateActivity.a(AppendRateActivity.this));
                            intent2.putExtras(bundle);
                            LocalBroadcastManager.getInstance(AppendRateActivity.this.getApplicationContext()).sendBroadcast(intent2);
                            Intent intent3 = new Intent(RateOpAPI.f);
                            intent.putExtra(RateOpAPI.g, false);
                            LocalBroadcastManager.getInstance(AppendRateActivity.this.getApplicationContext()).sendBroadcast(intent3);
                            Intent intent4 = new Intent(com.taobao.android.order.bundle.helper.b.ORDER_ACTION);
                            intent4.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                            intent4.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                            intent4.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                            AppendRateActivity.this.getApplicationContext().sendBroadcast(intent4);
                            Intent intent5 = new Intent("MyTaobao_Order_Refresh");
                            intent5.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                            intent5.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                            intent5.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                            AppendRateActivity.this.getApplicationContext().sendBroadcast(intent5);
                            b.a(AppendRateActivity.this, jSONObject, "RateSuccess");
                            AppendRateActivity.this.getApplicationContext().sendBroadcast(b.a(jSONObject));
                            String str2 = "sendBroadcast: " + jSONObject.toJSONString();
                        }
                    }
                    com.taobao.tao.rate.kit.engine.b.a(AppendRateActivity.this.getApplicationContext(), com.taobao.android.litecreator.localization.a.a(R.string.rate_review_success));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("status", "1");
                    hashMap2.put("orderId", AppendRateActivity.a(AppendRateActivity.this));
                    onu.a("Page_AppendRate", "Button-Publish", hashMap2);
                    Intent intent22 = new Intent(RateOpAPI.x);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(RateOpAPI.l, "");
                    bundle2.putString(RateOpAPI.b, AppendRateActivity.a(AppendRateActivity.this));
                    intent22.putExtras(bundle2);
                    LocalBroadcastManager.getInstance(AppendRateActivity.this.getApplicationContext()).sendBroadcast(intent22);
                    Intent intent32 = new Intent(RateOpAPI.f);
                    intent.putExtra(RateOpAPI.g, false);
                    LocalBroadcastManager.getInstance(AppendRateActivity.this.getApplicationContext()).sendBroadcast(intent32);
                    Intent intent42 = new Intent(com.taobao.android.order.bundle.helper.b.ORDER_ACTION);
                    intent42.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                    intent42.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                    intent42.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                    AppendRateActivity.this.getApplicationContext().sendBroadcast(intent42);
                    Intent intent52 = new Intent("MyTaobao_Order_Refresh");
                    intent52.putExtra(a.INTENT_KEY_MY_TAOBAO_NEED_REFRESH, true);
                    intent52.putExtra(a.INTENT_KEY_ORDER_LIST_NEED_REFRESH, true);
                    intent52.putExtra(a.INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, true);
                    AppendRateActivity.this.getApplicationContext().sendBroadcast(intent52);
                    b.a(AppendRateActivity.this, jSONObject, "RateSuccess");
                    AppendRateActivity.this.getApplicationContext().sendBroadcast(b.a(jSONObject));
                    String str22 = "sendBroadcast: " + jSONObject.toJSONString();
                }
                AppendRateActivity.this.finish();
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f20890a = false;

    static {
        kge.a(-220212779);
    }

    public static /* synthetic */ Object ipc$super(AppendRateActivity appendRateActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Page_AppendRate";
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

    public static /* synthetic */ String a(AppendRateActivity appendRateActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8552017e", new Object[]{appendRateActivity}) : appendRateActivity.c;
    }

    public static /* synthetic */ void b(AppendRateActivity appendRateActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd738a3", new Object[]{appendRateActivity});
        } else {
            appendRateActivity.b();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            this.g = System.currentTimeMillis();
            return;
        }
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        if (longExtra > 0) {
            this.g = longExtra;
        } else if (longExtra2 > 0) {
            this.g = longExtra2;
        } else {
            this.g = System.currentTimeMillis();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        c();
        setContentView(R.layout.rate_activity_commit);
        qoj.a();
        if (!a(getIntent())) {
            com.taobao.tao.rate.kit.engine.b.a(this, getResources().getString(R.string.rate_invalid_request));
            finish();
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "rateSucessPage", "false");
        if (!TextUtils.isEmpty(config)) {
            this.f20890a = Boolean.valueOf(config).booleanValue();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("taobao.rate.newAppend");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f, intentFilter);
        w.a(new w.b() { // from class: com.taobao.tao.rate.ui.commit.AppendRateActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ugc.utils.w.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    AppendRateActivity.b(AppendRateActivity.this);
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
                if (!TextUtils.isEmpty(a2)) {
                    Nav.from(AppendRateActivity.this).toUri(ax.a(a2, q.a(AppendRateActivity.this.getIntent().getData())));
                    AppendRateActivity.this.finish();
                    return;
                }
                com.taobao.tao.rate.kit.engine.b.a(AppendRateActivity.this.getApplicationContext(), AppendRateActivity.this.getResources().getString(R.string.rate_invalid_request));
                AppendRateActivity.this.finish();
            }
        });
    }

    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMessages", "intent = null");
            onu.a(a(), "Report-Error", hashMap);
            return false;
        }
        this.c = null;
        this.d = null;
        try {
            this.c = intent.getStringExtra(ORDERID);
            this.d = intent.getStringExtra(ISARCHIVE);
            this.e = intent.getStringExtra("channel");
        } catch (Exception unused) {
        }
        Uri data = intent.getData();
        if (data == null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errorMessages", "intent uri = null");
            hashMap2.put("orderId", this.c);
            onu.a(a(), "Report-Error", hashMap2);
            return false;
        }
        Uri parse = Uri.parse(data.toString().replace("html#!", "html?"));
        if (TextUtils.isEmpty(this.c)) {
            this.c = parse.getQueryParameter(ORDERID);
        }
        if (TextUtils.isEmpty(this.c)) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errorMessages", "orderId = null");
            onu.a(a(), "Report-Error", hashMap3);
            return false;
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = parse.getQueryParameter(ISARCHIVE);
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = "0";
        }
        if (TextUtils.isEmpty(this.e)) {
            this.e = parse.getQueryParameter("channel");
        }
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "mtop.taobao.rate.append.render");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("orderId", (Object) this.c);
        jSONObject2.put("pageType", (Object) "publishAppendRate");
        jSONObject2.put(CoreConstants.IN_PARAM_ARCHIVE, (Object) Boolean.valueOf("1".equals(this.d)));
        jSONObject2.put("platformType", (Object) "wireless");
        if (!TextUtils.isEmpty(this.e)) {
            jSONObject2.put("channel", (Object) this.e);
        }
        jSONObject.put("params", (Object) jSONObject2.toJSONString());
        jSONObject.put("version", (Object) "2.0");
        String jSONString = jSONObject.toJSONString();
        Nav forResult = Nav.from(this).forResult(10001);
        Nav.setTransition(17432576, 17432577);
        forResult.toUri("http://h5.m.taobao.com/ocean/publish.htm?page=Page_AppendRate&api=".concat(Uri.encode(jSONString)).concat("&notify=").concat("taobao.rate.newAppend").concat("&clickStartTime=").concat(String.valueOf(this.g)));
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

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f);
    }
}
