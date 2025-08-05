package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.detail.ttdetail.utils.bq;
import java.util.HashMap;
import java.util.Map;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.lus;

/* loaded from: classes5.dex */
public class ai implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_item";

    /* renamed from: a  reason: collision with root package name */
    private Context f10682a;
    private eyx b;
    private a c;
    private b d;

    /* loaded from: classes5.dex */
    public interface a {
        void a(Map<String, String> map, lus lusVar, RuntimeParam... runtimeParamArr);
    }

    /* loaded from: classes5.dex */
    public interface b {
        String a();

        Map<String, String> b();
    }

    static {
        kge.a(-1679329409);
        kge.a(1967244270);
    }

    public static /* synthetic */ Context a(ai aiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8761b15e", new Object[]{aiVar}) : aiVar.f10682a;
    }

    public static /* synthetic */ String b(ai aiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c2d3efb", new Object[]{aiVar}) : aiVar.a();
    }

    public static /* synthetic */ eyx c(ai aiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("4f54381e", new Object[]{aiVar}) : aiVar.b;
    }

    public static /* synthetic */ Map d(ai aiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("537600f8", new Object[]{aiVar}) : aiVar.b();
    }

    public ai(Context context, eyx eyxVar, a aVar, b bVar) {
        this.f10682a = context;
        this.b = eyxVar;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.utils.i.a("UpdateItemImplementor", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE);
        if (aVar == null || (b2 = aVar.b()) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        final String string = b2.getString("itemId");
        hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, string);
        hashMap.put("clearSkuStorage", "true");
        hashMap.put("params", b2.getString("params"));
        com.taobao.android.detail.ttdetail.utils.i.a("UpdateItemImplementor", "onUpdateItem itemId=" + string);
        this.c.a(hashMap, new lus() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lus
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ai.c(ai.this).b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            com.taobao.android.detail.ttdetail.utils.al.a(ai.a(ai.this));
                            com.taobao.android.detail.ttdetail.utils.al.a(ai.a(ai.this), ai.b(ai.this));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("item_id", !TextUtils.isEmpty(string) ? string : "");
                            hashMap2.put("seller_id", com.taobao.android.detail.ttdetail.utils.d.a((Seller) ai.c(ai.this).a().a(Seller.class), ""));
                            hashMap2.put("spm", "a2141.7631564");
                            com.taobao.android.detail.ttdetail.utils.al.a(ai.a(ai.this), hashMap2);
                            com.taobao.android.detail.ttdetail.utils.al.a(ai.a(ai.this), ai.d(ai.this));
                        }
                    });
                }
            }
        }, bq.a(runtimeAbilityParamArr));
        return true;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        b bVar = this.d;
        String a2 = bVar != null ? bVar.a() : null;
        return !TextUtils.isEmpty(a2) ? a2 : "Page_Detail";
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        b bVar = this.d;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }
}
