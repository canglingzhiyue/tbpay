package com.taobao.android.tbsku;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.msoa.c;
import com.taobao.android.sku.network.SkuRequestParams;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.utils.g;
import com.taobao.android.sku.utils.k;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.r;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.ut.share.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.fgl;
import tb.ixt;
import tb.iyf;
import tb.jcv;
import tb.jdg;
import tb.jdi;
import tb.jdj;
import tb.kge;
import tb.mrm;
import tb.qqy;
import tb.qqz;
import tb.qra;
import tb.qrg;
import tb.smx;
import tb.soa;
import tb.tfu;

/* loaded from: classes6.dex */
public class TBXSkuActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f15378a;
    private com.taobao.android.tbsku.model.a b;
    private ViewGroup c;
    private ViewGroup d;
    private TBXSkuCore e;
    private String f;
    private jdg g;
    private SkuUpdateDataReceiver h;

    static {
        kge.a(1039577781);
    }

    public static /* synthetic */ Object ipc$super(TBXSkuActivity tBXSkuActivity, String str, Object... objArr) {
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
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public TBXSkuActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.tbsku.TBXSkuActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
        this.f15378a = new Handler(Looper.getMainLooper());
        this.f = "uniqueId" + System.currentTimeMillis();
    }

    public static /* synthetic */ Intent a(TBXSkuActivity tBXSkuActivity, Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ee14e564", new Object[]{tBXSkuActivity, intent, jSONObject}) : tBXSkuActivity.a(intent, jSONObject);
    }

    public static /* synthetic */ JSONObject a(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9d18aa0c", new Object[]{tBXSkuActivity, jSONObject}) : tBXSkuActivity.a(jSONObject);
    }

    public static /* synthetic */ JSONObject a(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2604ec88", new Object[]{tBXSkuActivity, jSONObject, new Boolean(z)}) : tBXSkuActivity.b(jSONObject, z);
    }

    public static /* synthetic */ JSONObject a(TBXSkuActivity tBXSkuActivity, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a58fce69", new Object[]{tBXSkuActivity, mtopResponse}) : tBXSkuActivity.a(mtopResponse);
    }

    public static /* synthetic */ void a(TBXSkuActivity tBXSkuActivity, int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536811bc", new Object[]{tBXSkuActivity, new Integer(i), intent});
        } else {
            tBXSkuActivity.a(i, intent);
        }
    }

    public static /* synthetic */ void a(TBXSkuActivity tBXSkuActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1580bd4e", new Object[]{tBXSkuActivity, str});
        } else {
            tBXSkuActivity.b(str);
        }
    }

    public static /* synthetic */ void a(TBXSkuActivity tBXSkuActivity, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de111877", new Object[]{tBXSkuActivity, str, map});
        } else {
            tBXSkuActivity.a(str, map);
        }
    }

    public static /* synthetic */ boolean a(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b142c88", new Object[]{tBXSkuActivity})).booleanValue() : tBXSkuActivity.l();
    }

    public static /* synthetic */ boolean a(TBXSkuActivity tBXSkuActivity, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e412a941", new Object[]{tBXSkuActivity, str, map, new Boolean(z)})).booleanValue() : tBXSkuActivity.a(str, map, z);
    }

    public static /* synthetic */ Intent b(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("3ed235ec", new Object[]{tBXSkuActivity, jSONObject, new Boolean(z)}) : tBXSkuActivity.a(jSONObject, z);
    }

    public static /* synthetic */ String b(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2db94313", new Object[]{tBXSkuActivity, jSONObject}) : tBXSkuActivity.i(jSONObject);
    }

    public static /* synthetic */ void b(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148bba23", new Object[]{tBXSkuActivity});
        } else {
            tBXSkuActivity.k();
        }
    }

    public static /* synthetic */ void b(TBXSkuActivity tBXSkuActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e1c12d", new Object[]{tBXSkuActivity, str});
        } else {
            tBXSkuActivity.a(str);
        }
    }

    public static /* synthetic */ String c(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ddae91e", new Object[]{tBXSkuActivity}) : tBXSkuActivity.f;
    }

    public static /* synthetic */ void c(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce82736e", new Object[]{tBXSkuActivity, jSONObject});
        } else {
            tBXSkuActivity.g(jSONObject);
        }
    }

    public static /* synthetic */ com.taobao.android.tbsku.model.a d(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tbsku.model.a) ipChange.ipc$dispatch("b3b17ddc", new Object[]{tBXSkuActivity}) : tBXSkuActivity.b;
    }

    public static /* synthetic */ TBXSkuCore e(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBXSkuCore) ipChange.ipc$dispatch("cf4db68c", new Object[]{tBXSkuActivity}) : tBXSkuActivity.e;
    }

    public static /* synthetic */ void f(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd1a31", new Object[]{tBXSkuActivity, jSONObject});
        } else {
            tBXSkuActivity.f(jSONObject);
        }
    }

    public static /* synthetic */ boolean f(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa69f0a3", new Object[]{tBXSkuActivity})).booleanValue() : tBXSkuActivity.j();
    }

    public static /* synthetic */ String g(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c18fa22", new Object[]{tBXSkuActivity}) : tBXSkuActivity.e();
    }

    public static /* synthetic */ String h(TBXSkuActivity tBXSkuActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa87e63", new Object[]{tBXSkuActivity}) : tBXSkuActivity.f();
    }

    /* loaded from: classes6.dex */
    public class a implements ixt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1311139127);
            kge.a(-321064151);
        }

        private a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
            if (r0.equals("CLOSE_BTN") != false) goto L21;
         */
        @Override // tb.ixt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.alibaba.fastjson.JSONObject r14) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.TBXSkuActivity.a.a(com.alibaba.fastjson.JSONObject):void");
        }
    }

    /* loaded from: classes6.dex */
    public class SkuUpdateDataReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-708640176);
        }

        private SkuUpdateDataReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TBXSkuActivity.e(TBXSkuActivity.this) == null) {
            } else {
                String a2 = TBXSkuActivity.e(TBXSkuActivity.this).a();
                if (StringUtils.isEmpty(a2) || !TBXSkuActivity.c(TBXSkuActivity.this).equals(intent.getStringExtra("skuToken")) || !a2.equals(intent.getStringExtra(fgl.ORIGINALITEMID))) {
                    return;
                }
                String stringExtra = intent.getStringExtra(fgl.TARGETITEMID);
                String stringExtra2 = intent.getStringExtra(mrm.KEY_AREA_ID);
                String stringExtra3 = intent.getStringExtra("addressId");
                String stringExtra4 = intent.getStringExtra("params");
                String stringExtra5 = intent.getStringExtra("forbidLoading");
                HashMap hashMap = new HashMap(TBXSkuActivity.d(TBXSkuActivity.this).f);
                if (!StringUtils.isEmpty(stringExtra2)) {
                    hashMap.put(mrm.KEY_AREA_ID, stringExtra2);
                }
                if (!StringUtils.isEmpty(stringExtra3)) {
                    hashMap.put("addressId", stringExtra3);
                }
                if (!StringUtils.isEmpty(stringExtra4)) {
                    hashMap.put("params", stringExtra4);
                }
                if (!TBXSkuActivity.a(TBXSkuActivity.this, stringExtra, (Map) hashMap, false) || "true".equalsIgnoreCase(stringExtra5)) {
                    return;
                }
                TBXSkuActivity.e(TBXSkuActivity.this).b().w();
            }
        }
    }

    private void a(String str, Map<String, Object> map) {
        boolean z = true;
        try {
            Class<?> cls = Class.forName("com.taobao.android.msoa.c");
            cls.getDeclaredMethod("onRequestSuccess", String.class, Map.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str, map);
            z = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z) {
            try {
                c.a().a(str, map);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private Intent a(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f0a7bd48", new Object[]{this, intent, jSONObject});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("buyNow", "true");
        JSONObject jSONObject2 = jSONObject.getJSONObject("buyNow");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        intent.putExtra("sourceType", "11");
        intent.putExtra("buildOrderParamsBundle", bundle);
        return intent;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("buyNow");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject2;
    }

    private Intent a(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5fecff47", new Object[]{this, jSONObject, new Boolean(z)});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(z ? tfu.ADD_CART : "buyNow");
        String str3 = "";
        if (jSONObject2 != null) {
            str3 = jSONObject2.getString("itemId");
            str2 = jSONObject2.getString("skuId");
            str = jSONObject2.getString("quantity");
        } else {
            str = str3;
            str2 = str;
        }
        Intent intent = new Intent();
        intent.putExtra("id", str3);
        intent.putExtra("skuId", str2);
        intent.putExtra("sku_quantity", str);
        return intent;
    }

    private JSONObject b(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("134f56ad", new Object[]{this, jSONObject, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject(z ? tfu.ADD_CART : "buyNow");
        String str3 = "";
        if (jSONObject3 != null) {
            str3 = jSONObject3.getString("itemId");
            str2 = jSONObject3.getString("skuId");
            str = jSONObject3.getString("quantity");
        } else {
            str = str3;
            str2 = str;
        }
        jSONObject2.put("itemId", (Object) str3);
        jSONObject2.put("skuId", (Object) str2);
        jSONObject2.put("quantity", (Object) str);
        return jSONObject2;
    }

    private boolean l() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        JSONObject m = this.e.b().m();
        if (m != null && (jSONObject = m.getJSONObject("feature")) != null) {
            return "true".equals(jSONObject.getString("enableMSOAReturnAdapt"));
        }
        return false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.XSku_Dialog_Activity);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(51);
        overridePendingTransition(R.anim.xsku_slide_up, 0);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        this.b = new com.taobao.android.tbsku.model.a(getIntent());
        a();
        if (this.b.l) {
            o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_INIT_E, this.b.n, this.b.f15432a, this.b.e);
            r.a(this, this.b.n, 1);
            a(this.b.m, (Intent) null);
            return;
        }
        if (!StringUtils.isEmpty(this.b.c)) {
            this.f = this.b.c;
        }
        setContentView(R.layout.xsku_activity_tbxsku);
        this.c = (ViewGroup) findViewById(R.id.xsku_container_progress);
        this.d = (ViewGroup) findViewById(R.id.xsku_activity_root_container);
        View findViewById = findViewById(R.id.ll_preset_container);
        View findViewById2 = findViewById(R.id.progress_bar);
        int i = 8;
        findViewById.setVisibility(n.a() ? 0 : 8);
        if (!n.a()) {
            i = 0;
        }
        findViewById2.setVisibility(i);
        getWindow().setLayout(-1, -1);
        getWindow().setGravity(80);
        i();
        c();
        if (Boolean.TRUE.toString().equals(this.b.u)) {
            com.taobao.android.sku.f.f15177a = true;
            Toast.makeText(this, "slLoad true", 0).show();
        } else if (Boolean.FALSE.toString().equals(this.b.u)) {
            com.taobao.android.sku.f.f15177a = false;
            Toast.makeText(this, "slLoad false", 0).show();
        }
        if (a(this.b.f15432a, this.b.f, true)) {
            return;
        }
        o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_INIT_E, "Mtop初始化失败!", this.b.f15432a, this.b.e);
        a(14, (Intent) null);
    }

    private void a() {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        iyf.a().a(this.b.k, "FirstScreenPaint");
        if (!StringUtils.isEmpty(this.b.t) && (b = k.b(this.b.t)) != null) {
            long longValue = b.getLongValue("JSBRIDGE_START_UPTIME");
            long longValue2 = b.getLongValue("MSOA_START_UPTIME");
            long longValue3 = b.getLongValue("MSOA_END_UPTIME");
            if (longValue != 0 && longValue2 != 0) {
                iyf.a().a("jsBridge", "nav", longValue, longValue2, null);
            }
            if (longValue2 != 0 && longValue3 != 0) {
                iyf.a().a("mosa", "nav", longValue2, longValue3, null);
            }
        }
        iyf.a().a("nav", "nav", this.b.s, jdi.a(), null);
        iyf.a().b("beforeMtop", "container");
    }

    private JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1
            {
                put("actionFrom", "CLOSE_BTN");
                put("inputMode", (Object) TBXSkuActivity.d(TBXSkuActivity.this).d);
                put("buyNow", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1.1
                    {
                        put("itemId", (Object) TBXSkuActivity.e(TBXSkuActivity.this).a());
                    }
                });
                put(tfu.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuActivity.1.2
                    {
                        put("itemId", (Object) TBXSkuActivity.e(TBXSkuActivity.this).a());
                    }
                });
            }
        };
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        c.a h = this.e.b().h().h();
        if (h != null && h.a()) {
            return;
        }
        ixt q = this.e.b().q();
        if (q != null) {
            q.a(b());
        }
        super.onBackPressed();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        jdg jdgVar = this.g;
        if (jdgVar == null) {
            return;
        }
        jdgVar.o();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        jdg jdgVar = this.g;
        if (jdgVar == null) {
            return;
        }
        jdgVar.p();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        jdg jdgVar = this.g;
        if (jdgVar == null) {
            return;
        }
        jdgVar.q();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jdg jdgVar = this.g;
        if (jdgVar == null) {
            return;
        }
        jdgVar.r();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d();
        TBXSkuCore tBXSkuCore = this.e;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.h = new SkuUpdateDataReceiver();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.h, intentFilter);
        this.e.a(new a());
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.h == null) {
                return;
            }
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.h);
        } catch (Throwable unused) {
        }
    }

    public void addSkuInRootContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f17eed", new Object[]{this, view});
        } else if (view == null || j()) {
        } else {
            this.c.setVisibility(8);
            this.d.removeAllViews();
            this.d.addView(view, -1, -1);
        }
    }

    private boolean a(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a5f025", new Object[]{this, str, map, new Boolean(z)})).booleanValue();
        }
        iyf.a().a("beforeMtop", (Map<String, String>) null);
        iyf.a().b("mtop", "container");
        String str2 = this.b.f.get("openFrom");
        boolean a2 = qqz.a(this, str2);
        if ((!b.c() && !a2) || !qra.a()) {
            z2 = false;
        }
        if (z2) {
            return a(map, new TBXSkuResponseListener(this, this.f15378a, z, str2));
        }
        return a(str, map, z, new TBXSkuResponseListener(this, this.f15378a, z, str2));
    }

    private boolean a(String str, Map<String, String> map, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b6f8bb9", new Object[]{this, str, map, new Boolean(z), iRemoteBaseListener})).booleanValue();
        }
        com.taobao.android.sku.network.c cVar = new com.taobao.android.sku.network.c(this, new SkuRequestParams(str, map));
        cVar.a(iRemoteBaseListener);
        boolean a2 = cVar.a();
        if (!a2) {
            r.a(this, qqy.SKU_MSG_MTOP_INIT_FAILED, 1);
        }
        return a2;
    }

    private boolean a(Map<String, String> map, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a971c03d", new Object[]{this, map, iRemoteBaseListener})).booleanValue();
        }
        Intent intent = new Intent();
        intent.putExtra("id", e());
        MainRequestParams mainRequestParams = new MainRequestParams(intent);
        map.put("skuOutSdk", "true");
        map.put("container_type", "sku");
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null && !StringUtils.isEmpty(aVar.d)) {
            map.put("skuType", this.b.d.toLowerCase());
        }
        mainRequestParams.getExParams().remove("openFrom");
        mainRequestParams.updateRefreshParams(map);
        smx smxVar = new smx(mainRequestParams);
        smxVar.a(new MainRequestCallback(mainRequestParams, new soa() { // from class: com.taobao.android.tbsku.TBXSkuActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33fc5943", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                    return;
                }
                iRemoteBaseListener.onSuccess(i, mtopInfo.b(), baseOutDo, obj);
                if (!(!smx.API_NAME.equals(mtopInfo.b().getApi()))) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("outType", "skuActivity");
                qrg.a(19999, "Request_Degrade", hashMap);
            }

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4224cd2f", new Object[]{this, mtopInfo, new Integer(i), obj});
                } else {
                    iRemoteBaseListener.onError(i, mtopInfo.b(), obj);
                }
            }
        }));
        smxVar.k();
        return true;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.f15432a;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.e;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null) {
            return aVar.r;
        }
        return qqy.SKU_MSG_DEPRESS_SHOW_H5_SKU;
    }

    private String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("trade")) != null && !jSONObject2.isEmpty()) {
            return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
        }
        return null;
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        String d = d(jSONObject);
        if (StringUtils.isEmpty(d)) {
            return;
        }
        o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_REDIRECT_URL_E, "商品出现降级 redirectUrl: " + d, this.b.f15432a, this.b.e);
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        e(jSONObject);
        TBXSkuCore tBXSkuCore = this.e;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.d(jSONObject);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.e = new TBXSkuCore(this, this.f);
        this.e.e(this.b.k);
        this.e.f(this.b.j);
        this.e.b(this.b.c());
        this.e.a(new jcv() { // from class: com.taobao.android.tbsku.TBXSkuActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jcv
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TBXSkuActivity.f(TBXSkuActivity.this)) {
                } else {
                    r.a(TBXSkuActivity.this, qqy.SKU_MSG_JS_CRASHED, 1);
                    TBXSkuActivity.a(TBXSkuActivity.this, 16, (Intent) null);
                }
            }
        });
    }

    private void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        e(jSONObject);
        if (j()) {
            return;
        }
        if (g() && jdj.c(jSONObject, this.b.k)) {
            r.a(this, h(), 1);
            a(15, (Intent) null);
            return;
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null && aVar.v && !StringUtils.isEmpty(d(jSONObject))) {
            r.a(this, this.b.w, 1);
            a(15, (Intent) null);
        } else if (!jdj.a(jSONObject, this.b.k)) {
            r.a(this, qqy.SKU_MSG_NOT_SUPPORT, 1);
            a(15, (Intent) null);
        } else {
            h(jSONObject);
        }
    }

    private void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
            return;
        }
        this.g = new jdg(this);
        this.e.b().a(this.g);
        this.e.a(jSONObject);
        this.e.e();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, R.anim.xsku_slide_down);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (isFinishing()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return isDestroyed();
    }

    private JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        String str = new String(mtopResponse.getBytedata());
        if (!StringUtils.isEmpty(str)) {
            return g.a(str);
        }
        return null;
    }

    private void a(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12ba58", new Object[]{this, new Integer(i), intent});
            return;
        }
        setResult(i, intent);
        finish();
    }

    private String i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("606b2420", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(tfu.ADD_CART)) != null) {
            return jSONObject2.getString("addCartResult");
        }
        return null;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null && aVar.a()) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.putExtra("result", "success");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null && aVar.a()) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.putExtra("result", "fail");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    /* loaded from: classes6.dex */
    public static class TBXSkuResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mInit;
        private Handler mMainHandler;
        private String mOpenFrom;
        private WeakReference<TBXSkuActivity> mWeakReference;

        static {
            kge.a(991900183);
            kge.a(-525336021);
        }

        public static /* synthetic */ void access$1900(TBXSkuResponseListener tBXSkuResponseListener, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86938a9", new Object[]{tBXSkuResponseListener, jSONObject});
            } else {
                tBXSkuResponseListener.dealResultInMainThread(jSONObject);
            }
        }

        public static /* synthetic */ WeakReference access$2400(TBXSkuResponseListener tBXSkuResponseListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("cfaaa90f", new Object[]{tBXSkuResponseListener}) : tBXSkuResponseListener.mWeakReference;
        }

        public TBXSkuResponseListener(TBXSkuActivity tBXSkuActivity, Handler handler, boolean z, String str) {
            this.mWeakReference = new WeakReference<>(tBXSkuActivity);
            this.mMainHandler = handler;
            this.mInit = z;
            this.mOpenFrom = str;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity == null || TBXSkuActivity.f(tBXSkuActivity)) {
                return;
            }
            dealMtopError(tBXSkuActivity, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            final TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity == null || TBXSkuActivity.f(tBXSkuActivity) || this.mMainHandler == null) {
                return;
            }
            iyf.a().a("mtop", new HashMap<String, String>() { // from class: com.taobao.android.tbsku.TBXSkuActivity.TBXSkuResponseListener.1
                {
                    put("api", mtopResponse.getApi());
                    put("v", mtopResponse.getV());
                    put("eagleEyeTraceId", jdi.a(mtopResponse));
                    put("mtopState", mtopResponse.getMtopStat().toString());
                }
            });
            iyf.a().b("afterMtop", "container");
            new Thread(new Runnable() { // from class: com.taobao.android.tbsku.TBXSkuActivity.TBXSkuResponseListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TBXSkuActivity.f(tBXSkuActivity)) {
                    } else {
                        TBXSkuResponseListener.access$1900(TBXSkuResponseListener.this, TBXSkuActivity.a(tBXSkuActivity, mtopResponse));
                    }
                }
            }).start();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuActivity tBXSkuActivity = this.mWeakReference.get();
            if (tBXSkuActivity == null || TBXSkuActivity.f(tBXSkuActivity)) {
                return;
            }
            dealMtopError(tBXSkuActivity, mtopResponse);
        }

        public void dealMtopError(TBXSkuActivity tBXSkuActivity, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ec2d536", new Object[]{this, tBXSkuActivity, mtopResponse});
                return;
            }
            String retMsg = mtopResponse.getRetMsg();
            if (StringUtils.isEmpty(retMsg)) {
                retMsg = qqy.SKU_MSG_QUERYDATA_FAILED;
            }
            r.a(tBXSkuActivity, qqy.SKU_MSG_QUERYDATA_FAILED, 1);
            if (this.mInit) {
                o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_MTOP_E, retMsg, TBXSkuActivity.g(tBXSkuActivity), TBXSkuActivity.h(tBXSkuActivity));
                TBXSkuActivity.a(tBXSkuActivity, 8, (Intent) null);
                return;
            }
            TBXSkuActivity.f(tBXSkuActivity, null);
        }

        public void dealMtopSuccess(TBXSkuActivity tBXSkuActivity, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fec05f1a", new Object[]{this, tBXSkuActivity, jSONObject});
                return;
            }
            if (this.mInit) {
                TBXSkuActivity.c(tBXSkuActivity, jSONObject);
            } else {
                TBXSkuActivity.f(tBXSkuActivity, jSONObject);
            }
            qqz.a(tBXSkuActivity.getApplicationContext(), jSONObject, this.mOpenFrom);
        }

        private void dealResultInMainThread(final JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4ac2778", new Object[]{this, jSONObject});
            } else {
                this.mMainHandler.post(new Runnable() { // from class: com.taobao.android.tbsku.TBXSkuActivity.TBXSkuResponseListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TBXSkuActivity tBXSkuActivity = (TBXSkuActivity) TBXSkuResponseListener.access$2400(TBXSkuResponseListener.this).get();
                        if (tBXSkuActivity == null || TBXSkuActivity.f(tBXSkuActivity)) {
                            return;
                        }
                        TBXSkuResponseListener.this.dealMtopSuccess(tBXSkuActivity, jSONObject);
                    }
                });
            }
        }
    }
}
