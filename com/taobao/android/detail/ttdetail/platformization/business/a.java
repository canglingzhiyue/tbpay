package com.taobao.android.detail.ttdetail.platformization.business;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.utils.aj;
import com.taobao.android.detail.ttdetail.utils.as;
import com.taobao.android.detail.ttdetail.utils.bo;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.kge;
import tb.lus;
import tb.nup;
import tb.odg;

/* loaded from: classes5.dex */
public class a extends nup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_FLIGGY = "fliggy";
    public static final String BIZ_TYPE_TINY_SHOP = "tinyShop";
    private static final List<String> i;

    /* renamed from: a  reason: collision with root package name */
    private Intent f10779a;
    private Context b;
    private eyx c;
    private TTDetailBaseActivity d;
    private BizContext f;
    private b h;
    private volatile int e = 0;
    private Map<String, String> g = new ConcurrentHashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle$2
        {
            a.this = this;
            put(a.BIZ_TYPE_FLIGGY, "com.taobao.android.detail.fliggyttdetail.FliggyBizContext");
            put(a.BIZ_TYPE_TINY_SHOP, "com.taobao.android.detail.liveshop.LiveShopDetailBizContext");
        }
    };

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474178196:
                super.a(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1085177691:
                return new Boolean(super.a((Map) objArr[0], (MtopResponse) objArr[1], ((Number) objArr[2]).intValue()));
            case -706337803:
                return new Boolean(super.a((Map) objArr[0], (lus) objArr[1], ((Boolean) objArr[2]).booleanValue()));
            case 40303500:
                return new Boolean(super.a((JSONObject) objArr[0]));
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 253552625:
                super.a((eyx) objArr[0], (Context) objArr[1], (Intent) objArr[2]);
                return null;
            case 1161530805:
                super.a((b) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(2131599989);
        i = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle$1
            {
                add("web.m.taobao.com/app/tb-zhibo-app/dt-shop-detail/goods");
                add("web.wapa.taobao.com/app/tb-zhibo-app/dt-shop-detail/goods");
                add("diantao.cn/share-landing-page/home.html");
                add("market.wapa.taobao.com/app/tb-zhibo-app/share-landing-page/home.html");
            }
        };
    }

    public a(TTDetailBaseActivity tTDetailBaseActivity) {
        this.d = tTDetailBaseActivity;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d.a(str);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.d.a(map);
        }
    }

    @Override // tb.nup
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453b8db5", new Object[]{this, bVar});
            return;
        }
        super.a(bVar);
        this.h = bVar;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        JSONObject c = g.c(jSONObject);
        Trade trade = (Trade) aj.a(c, Trade.class);
        String redirectUrl = trade != null ? trade.getRedirectUrl() : null;
        boolean isEmpty = TextUtils.isEmpty(redirectUrl);
        String str = BIZ_TYPE_FLIGGY;
        if (isEmpty || !com.taobao.android.detail.ttdetail.utils.b.a(l.b(redirectUrl), i)) {
            Item item = (Item) aj.a(c, Item.class);
            String businessId = item != null ? item.getBusinessId() : null;
            if (TextUtils.isEmpty(businessId) ? !bo.a(item) : !TextUtils.equals(str, businessId)) {
                str = null;
            }
        } else {
            str = BIZ_TYPE_TINY_SHOP;
        }
        if (odg.t().a(str)) {
            return str;
        }
        return null;
    }

    private BizContext c(JSONObject jSONObject) {
        String b = b(jSONObject);
        if (TextUtils.isEmpty(b)) {
            i.a("BizLifecycle", "not findBizIdFromServer");
            return null;
        }
        String str = this.g.get(b);
        if (TextUtils.isEmpty(str)) {
            i.a("BizLifecycle", "bizId: " + b + " not registered by framework");
            return null;
        }
        try {
            BizContext bizContext = (BizContext) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (TextUtils.equals(b, bizContext.bizId())) {
                i.a("BizLifecycle", "instance BizContext success with bizId: " + b + ", classPath: " + str);
                return bizContext;
            }
            i.a("BizLifecycle", "instance BizContext: " + bizContext + ", should set bizId with value: " + b);
            return null;
        } catch (Throwable th) {
            i.a("BizLifecycle", "instance BizContext error", th);
            return null;
        }
    }

    @Override // tb.nup
    public void a(eyx eyxVar, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ce7f1", new Object[]{this, eyxVar, context, intent});
            return;
        }
        this.f10779a = intent;
        this.b = context;
        this.c = eyxVar;
        super.a(eyxVar, context, intent);
        this.e = 0;
    }

    @Override // tb.nup
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.e = 1;
        BizContext bizContext = this.f;
        if (bizContext == null) {
            return;
        }
        bizContext.onResume();
    }

    @Override // tb.nup
    public boolean a(Map<String, String> map, lus lusVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e623f5", new Object[]{this, map, lusVar, new Boolean(z)})).booleanValue();
        }
        if (super.a(map, lusVar, z)) {
            return true;
        }
        BizContext bizContext = this.f;
        return bizContext != null && bizContext.onSendRequest(map, lusVar, z);
    }

    @Override // tb.nup
    public boolean a(Map<String, String> map, MtopResponse mtopResponse, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf5180a5", new Object[]{this, map, mtopResponse, new Integer(i2)})).booleanValue();
        }
        boolean a2 = super.a(map, mtopResponse, i2);
        if (this.f == null) {
            this.f = c(as.a(mtopResponse, i2));
            BizContext bizContext = this.f;
            if (bizContext != null) {
                bizContext.attachBizContext(this.c, this.b, this.f10779a, this.h, this);
                g();
            }
        }
        if (a2) {
            return true;
        }
        BizContext bizContext2 = this.f;
        return bizContext2 != null && bizContext2.onInterceptResponse(map, mtopResponse, i2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e <= 0) {
            this.f.onCreate();
        } else if (this.e <= 1) {
            this.f.onCreate();
            this.f.onResume();
        } else if (this.e <= 2) {
            this.f.onCreate();
            this.f.onResume();
            this.f.onPause();
        } else {
            this.f.onCreate();
            this.f.onResume();
            this.f.onPause();
            this.f.onDestroy();
        }
    }

    public String b(Map<String, String> map, MtopResponse mtopResponse, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9225efe", new Object[]{this, map, mtopResponse, new Integer(i2)}) : this.d.a(map, mtopResponse, i2);
    }

    @Override // tb.nup
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            super.a(z);
        }
    }

    @Override // tb.nup
    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (super.a(jSONObject)) {
            return true;
        }
        BizContext bizContext = this.f;
        return bizContext != null && bizContext.onFrameworkDowngrade(jSONObject);
    }

    @Override // tb.nup
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.e = 2;
        BizContext bizContext = this.f;
        if (bizContext == null) {
            return;
        }
        bizContext.onPause();
    }

    @Override // tb.nup
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        this.e = 3;
        BizContext bizContext = this.f;
        if (bizContext == null) {
            return;
        }
        bizContext.onDestroy();
    }
}
