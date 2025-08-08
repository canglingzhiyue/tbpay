package com.taobao.android.tbsku.container;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.sku.network.SkuRequestParams;
import com.taobao.android.sku.network.c;
import com.taobao.android.sku.presenter.b;
import com.taobao.android.sku.utils.g;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.r;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
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
public class TBXSkuContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f15407a;
    private com.taobao.android.tbsku.model.a b;
    private TBXSkuCore c;
    private volatile boolean d;
    private volatile boolean e;
    private ixt f;
    private Handler g = new Handler(Looper.getMainLooper());
    private String h = "uniqueId" + System.currentTimeMillis();
    private SkuUpdateDataReceiver i;

    static {
        kge.a(-1944329267);
    }

    public static /* synthetic */ void a(TBXSkuContainer tBXSkuContainer, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccc245b", new Object[]{tBXSkuContainer, new Integer(i), new Boolean(z)});
        }
    }

    public static /* synthetic */ JSONObject a(TBXSkuContainer tBXSkuContainer, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4e7a070f", new Object[]{tBXSkuContainer, mtopResponse}) : tBXSkuContainer.a(mtopResponse);
    }

    public static /* synthetic */ String a(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a103bfda", new Object[]{tBXSkuContainer, jSONObject}) : tBXSkuContainer.f(jSONObject);
    }

    public static /* synthetic */ void a(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc486aa", new Object[]{tBXSkuContainer});
        } else {
            tBXSkuContainer.m();
        }
    }

    public static /* synthetic */ void a(TBXSkuContainer tBXSkuContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d919f4", new Object[]{tBXSkuContainer, str});
        } else {
            tBXSkuContainer.a(str);
        }
    }

    public static /* synthetic */ boolean a(TBXSkuContainer tBXSkuContainer, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2058f9e7", new Object[]{tBXSkuContainer, str, map, new Boolean(z)})).booleanValue() : tBXSkuContainer.a(str, map, z);
    }

    public static /* synthetic */ ixt b(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ixt) ipChange.ipc$dispatch("9aab6bf6", new Object[]{tBXSkuContainer}) : tBXSkuContainer.f;
    }

    public static /* synthetic */ void b(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1b8ca5", new Object[]{tBXSkuContainer, jSONObject});
        } else {
            tBXSkuContainer.e(jSONObject);
        }
    }

    public static /* synthetic */ void b(TBXSkuContainer tBXSkuContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8744b5", new Object[]{tBXSkuContainer, str});
        } else {
            tBXSkuContainer.b(str);
        }
    }

    public static /* synthetic */ TBXSkuCore c(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBXSkuCore) ipChange.ipc$dispatch("23d38638", new Object[]{tBXSkuContainer}) : tBXSkuContainer.c;
    }

    public static /* synthetic */ void c(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530c67c4", new Object[]{tBXSkuContainer, jSONObject});
        } else {
            tBXSkuContainer.b(jSONObject);
        }
    }

    public static /* synthetic */ String d(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2854293", new Object[]{tBXSkuContainer}) : tBXSkuContainer.h;
    }

    public static /* synthetic */ com.taobao.android.tbsku.model.a e(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tbsku.model.a) ipChange.ipc$dispatch("a0f4462f", new Object[]{tBXSkuContainer}) : tBXSkuContainer.b;
    }

    public static /* synthetic */ Context f(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9290b5a7", new Object[]{tBXSkuContainer}) : tBXSkuContainer.f15407a;
    }

    public static /* synthetic */ String g(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d82df0", new Object[]{tBXSkuContainer}) : tBXSkuContainer.i();
    }

    public static /* synthetic */ String h(TBXSkuContainer tBXSkuContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c49270f", new Object[]{tBXSkuContainer}) : tBXSkuContainer.j();
    }

    /* loaded from: classes6.dex */
    public class a implements ixt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2056407583);
            kge.a(-321064151);
        }

        private a() {
        }

        @Override // tb.ixt
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
            } else {
                try {
                    String string = jSONObject.getString("actionFrom");
                    if (StringUtils.isEmpty(string)) {
                        string = "NULL";
                    }
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1989579947:
                            if (string.equals("CLOSE_BTN")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1519039294:
                            if (string.equals("ADD_CART_SUCCESS")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1270747266:
                            if (string.equals("ADD_CART_FAILED")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 964279645:
                            if (string.equals("BUY_NOW")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1722726347:
                            if (string.equals("CONFIRM_DISMISS")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1970224683:
                            if (string.equals("CUSTOM_RIGHT_BTN")) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    if (c != 2) {
                        if (c == 3) {
                            TBXSkuContainer.a(TBXSkuContainer.this, TBXSkuContainer.a(TBXSkuContainer.this, jSONObject));
                        } else if (c == 4) {
                            TBXSkuContainer.b(TBXSkuContainer.this, TBXSkuContainer.a(TBXSkuContainer.this, jSONObject));
                        } else if (c != 5 && c != 6) {
                            TBXSkuContainer.a(TBXSkuContainer.this);
                        }
                    }
                    if (TBXSkuContainer.b(TBXSkuContainer.this) == null) {
                        return;
                    }
                    TBXSkuContainer.b(TBXSkuContainer.this).a(jSONObject);
                } finally {
                    if (TBXSkuContainer.b(TBXSkuContainer.this) != null) {
                        TBXSkuContainer.b(TBXSkuContainer.this).a(jSONObject);
                    }
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public class SkuUpdateDataReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1025757544);
        }

        private SkuUpdateDataReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TBXSkuContainer.c(TBXSkuContainer.this) == null) {
            } else {
                String a2 = TBXSkuContainer.c(TBXSkuContainer.this).a();
                if (StringUtils.isEmpty(a2) || !TBXSkuContainer.d(TBXSkuContainer.this).equals(intent.getStringExtra("skuToken")) || !a2.equals(intent.getStringExtra(fgl.ORIGINALITEMID))) {
                    return;
                }
                String stringExtra = intent.getStringExtra(fgl.TARGETITEMID);
                String stringExtra2 = intent.getStringExtra(mrm.KEY_AREA_ID);
                String stringExtra3 = intent.getStringExtra("addressId");
                String stringExtra4 = intent.getStringExtra("params");
                String stringExtra5 = intent.getStringExtra("forbidLoading");
                HashMap<String, String> hashMap = new HashMap<String, String>() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.SkuUpdateDataReceiver.1
                    {
                        if (TBXSkuContainer.e(TBXSkuContainer.this) != null) {
                            putAll(TBXSkuContainer.e(TBXSkuContainer.this).f);
                        }
                    }
                };
                if (!StringUtils.isEmpty(stringExtra2)) {
                    hashMap.put(mrm.KEY_AREA_ID, stringExtra2);
                }
                if (!StringUtils.isEmpty(stringExtra3)) {
                    hashMap.put("addressId", stringExtra3);
                }
                if (!StringUtils.isEmpty(stringExtra4)) {
                    hashMap.put("params", stringExtra4);
                }
                if (!TBXSkuContainer.a(TBXSkuContainer.this, stringExtra, (Map) hashMap, false) || "true".equalsIgnoreCase(stringExtra5)) {
                    return;
                }
                TBXSkuContainer.c(TBXSkuContainer.this).b().w();
            }
        }
    }

    public TBXSkuContainer(Context context) {
        iyf.a().b("beforeMtop", "container");
        this.f15407a = context;
        g();
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = new TBXSkuCore(this.f15407a, this.h);
        this.c.a(new a());
        this.c.a(new jcv() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jcv
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                r.a(TBXSkuContainer.f(TBXSkuContainer.this), qqy.SKU_MSG_JS_CRASHED, 1);
                TBXSkuContainer.a(TBXSkuContainer.this, 16, true);
                TBXSkuContainer.this.d();
                TBXSkuContainer.a(TBXSkuContainer.this, 16, false);
            }
        });
    }

    public com.taobao.android.tbsku.model.a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.tbsku.model.a) ipChange.ipc$dispatch("4d38f895", new Object[]{this, jSONObject});
        }
        this.b = new com.taobao.android.tbsku.model.a(com.taobao.android.tbsku.container.a.a(jSONObject));
        if (!StringUtils.isEmpty(this.b.c)) {
            this.h = this.b.c;
        }
        f();
        return this.b;
    }

    public Context n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8ea2aded", new Object[]{this}) : this.f15407a;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        iyf.a().a(this.b.k, "FirstScreenPaint");
        this.c.e(this.b.k);
        this.c.f(this.b.j);
        this.c.b(this.b.c());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.b().a(new b(this.f15407a) { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 1690278155) {
                        return super.a((b.a) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.sku.presenter.b
                public b a(final b.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("64bf990b", new Object[]{this, aVar}) : super.a(new b.a() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.sku.presenter.b.a
                        public void a(b bVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("de477a41", new Object[]{this, bVar});
                                return;
                            }
                            b.a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(bVar);
                            }
                            TBXSkuContainer.this.d();
                        }
                    });
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.b().z();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d) {
        } else {
            this.d = true;
            com.taobao.android.tbsku.model.a aVar = this.b;
            if (aVar == null) {
                o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_INIT_E, "not init data", (String) null, (String) null);
                r.a(this.f15407a, "please set data before show", 1);
                d();
            } else if (aVar.l) {
                o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_INIT_E, this.b.n, this.b.f15432a, this.b.e);
                r.a(this.f15407a, this.b.n, 1);
                d();
            } else if (a(this.b.f15432a, this.b.f, true)) {
            } else {
                o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_INIT_E, "Mtop初始化失败!", this.b.f15432a, this.b.e);
                d();
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        d(jSONObject);
        if (k() && jdj.c(jSONObject, this.b.k)) {
            r.a(this.f15407a, l(), 1);
            d();
            return;
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null && aVar.v && !StringUtils.isEmpty(c(jSONObject))) {
            r.a(this.f15407a, this.b.w, 1);
            d();
        } else if (!jdj.a(jSONObject, this.b.k)) {
            r.a(this.f15407a, qqy.SKU_MSG_NOT_SUPPORT, 1);
            d();
        } else {
            this.c.a(jSONObject);
            this.c.e();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            h();
            this.c.c();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.i = new SkuUpdateDataReceiver();
        LocalBroadcastManager.getInstance(this.f15407a).registerReceiver(this.i, intentFilter);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            if (this.i == null) {
                return;
            }
            LocalBroadcastManager.getInstance(this.f15407a).unregisterReceiver(this.i);
        } catch (Throwable unused) {
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
        boolean z3 = map != null && "true".equals(map.get("enableFastSku"));
        boolean a2 = qqz.a(this.f15407a, str2);
        if (!z3 && (!a2 || !qra.a())) {
            z2 = false;
        }
        if (z2) {
            return a(str, map, new TBXSkuResponseListener(this, this.g, z, str2));
        }
        return a(str, map, z, new TBXSkuResponseListener(this, this.g, z, str2));
    }

    private boolean a(String str, Map<String, String> map, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b6f8bb9", new Object[]{this, str, map, new Boolean(z), iRemoteBaseListener})).booleanValue();
        }
        c cVar = new c(this.f15407a, new SkuRequestParams(str, map));
        cVar.a(iRemoteBaseListener);
        boolean a2 = cVar.a();
        if (!a2) {
            r.a(this.f15407a, qqy.SKU_MSG_MTOP_INIT_FAILED, 1);
        }
        return a2;
    }

    private boolean a(final String str, Map<String, String> map, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96e38587", new Object[]{this, str, map, iRemoteBaseListener})).booleanValue();
        }
        Intent intent = new Intent();
        intent.putExtra("id", str);
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
        smxVar.a(new MainRequestCallback(mainRequestParams, new soa() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.3
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
                hashMap.put("outType", "skuContainer");
                hashMap.put("itemId", str);
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

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.f15432a;
    }

    private String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.e;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    private String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        com.taobao.android.tbsku.model.a aVar = this.b;
        if (aVar != null) {
            return aVar.r;
        }
        return qqy.SKU_MSG_DEPRESS_SHOW_H5_SKU;
    }

    private String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("trade")) != null && !jSONObject2.isEmpty()) {
            return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
        }
        return null;
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        String c = c(jSONObject);
        if (StringUtils.isEmpty(c)) {
            return;
        }
        o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_REDIRECT_URL_E, "商品出现降级 redirectUrl: " + c, this.b.f15432a, this.b.e);
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        d(jSONObject);
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.d(jSONObject);
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

    private String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e46e245d", new Object[]{this, jSONObject});
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
        LocalBroadcastManager.getInstance(this.f15407a).sendBroadcast(intent);
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
        LocalBroadcastManager.getInstance(this.f15407a).sendBroadcast(intent);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("detailSKU");
        intent.putExtra("result", "cancel");
        LocalBroadcastManager.getInstance(this.f15407a).sendBroadcast(intent);
    }

    /* loaded from: classes6.dex */
    public static class TBXSkuResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mInit;
        private Handler mMainHandler;
        private String mOpenFrom;
        private WeakReference<TBXSkuContainer> mWeakReference;

        static {
            kge.a(-1076345345);
            kge.a(-525336021);
        }

        public static /* synthetic */ boolean access$1300(TBXSkuResponseListener tBXSkuResponseListener, TBXSkuContainer tBXSkuContainer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5137ffdf", new Object[]{tBXSkuResponseListener, tBXSkuContainer})).booleanValue() : tBXSkuResponseListener.isPresenterValid(tBXSkuContainer);
        }

        public static /* synthetic */ void access$1500(TBXSkuResponseListener tBXSkuResponseListener, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696a6179", new Object[]{tBXSkuResponseListener, jSONObject});
            } else {
                tBXSkuResponseListener.dealResultInMainThread(jSONObject);
            }
        }

        public static /* synthetic */ WeakReference access$2000(TBXSkuResponseListener tBXSkuResponseListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("5dbdc6cb", new Object[]{tBXSkuResponseListener}) : tBXSkuResponseListener.mWeakReference;
        }

        public TBXSkuResponseListener(TBXSkuContainer tBXSkuContainer, Handler handler, boolean z, String str) {
            this.mWeakReference = new WeakReference<>(tBXSkuContainer);
            this.mMainHandler = handler;
            this.mInit = z;
            this.mOpenFrom = str;
        }

        private boolean isPresenterValid(TBXSkuContainer tBXSkuContainer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56d3594b", new Object[]{this, tBXSkuContainer})).booleanValue() : tBXSkuContainer != null && TBXSkuContainer.c(tBXSkuContainer).b().h().g();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (!isPresenterValid(tBXSkuContainer)) {
                return;
            }
            dealMtopError(tBXSkuContainer, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            final TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (!isPresenterValid(tBXSkuContainer)) {
                return;
            }
            iyf.a().a("mtop", new HashMap<String, String>() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.TBXSkuResponseListener.1
                {
                    put("api", mtopResponse.getApi());
                    put("v", mtopResponse.getV());
                    put("eagleEyeTraceId", jdi.a(mtopResponse));
                    put("mtopState", mtopResponse.getMtopStat().toString());
                }
            });
            iyf.a().b("afterMtop", "container");
            new Thread(new Runnable() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.TBXSkuResponseListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TBXSkuResponseListener.access$1300(TBXSkuResponseListener.this, tBXSkuContainer)) {
                    } else {
                        TBXSkuResponseListener.access$1500(TBXSkuResponseListener.this, TBXSkuContainer.a(tBXSkuContainer, mtopResponse));
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
            TBXSkuContainer tBXSkuContainer = this.mWeakReference.get();
            if (!isPresenterValid(tBXSkuContainer)) {
                return;
            }
            dealMtopError(tBXSkuContainer, mtopResponse);
        }

        public void dealMtopError(TBXSkuContainer tBXSkuContainer, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c883e2", new Object[]{this, tBXSkuContainer, mtopResponse});
                return;
            }
            String retMsg = mtopResponse.getRetMsg();
            if (StringUtils.isEmpty(retMsg)) {
                retMsg = qqy.SKU_MSG_QUERYDATA_FAILED;
            }
            r.a(TBXSkuContainer.f(tBXSkuContainer), qqy.SKU_MSG_QUERYDATA_FAILED, 1);
            if (this.mInit) {
                o.b(o.DEFAULT_BIZ_NAME, o.UM_URL_DOWNGRADE_MTOP_E, retMsg, TBXSkuContainer.g(tBXSkuContainer), TBXSkuContainer.h(tBXSkuContainer));
                TBXSkuContainer.a(tBXSkuContainer, 8, true);
                tBXSkuContainer.d();
                TBXSkuContainer.a(tBXSkuContainer, 8, false);
                return;
            }
            TBXSkuContainer.b(tBXSkuContainer, (JSONObject) null);
        }

        public void dealMtopSuccess(TBXSkuContainer tBXSkuContainer, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8d8b898", new Object[]{this, tBXSkuContainer, jSONObject});
                return;
            }
            if (this.mInit) {
                TBXSkuContainer.c(tBXSkuContainer, jSONObject);
            } else {
                TBXSkuContainer.b(tBXSkuContainer, jSONObject);
            }
            qqz.a(tBXSkuContainer.n(), jSONObject, this.mOpenFrom);
        }

        private void dealResultInMainThread(final JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4ac2778", new Object[]{this, jSONObject});
            } else {
                this.mMainHandler.post(new Runnable() { // from class: com.taobao.android.tbsku.container.TBXSkuContainer.TBXSkuResponseListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TBXSkuContainer tBXSkuContainer = (TBXSkuContainer) TBXSkuResponseListener.access$2000(TBXSkuResponseListener.this).get();
                        if (!TBXSkuResponseListener.access$1300(TBXSkuResponseListener.this, tBXSkuContainer)) {
                            return;
                        }
                        TBXSkuResponseListener.this.dealMtopSuccess(tBXSkuContainer, jSONObject);
                    }
                });
            }
        }
    }
}
