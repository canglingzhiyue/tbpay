package com.taobao.android.icart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.utils.ICartWVService;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.aat;
import tb.bbz;
import tb.bcf;
import tb.bcg;
import tb.bei;
import tb.bga;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes5.dex */
public class CartWVBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ADD_CART_NOTIFY = "action_add_cart_notify";
    public static final String ACTION_ICART_WV_SERVICE = "action_icart_wv_service";
    public static final String ACTION_QUERY_CART_PAGE = "query_cart_page";
    public static final String KEY_ICART_WV_SERVICE_ACTION = "key_icart_wv_service_action";
    public static final String KEY_ICART_WV_SERVICE_PARAMS = "key_icart_wv_service_params";
    public static final String KEY_NEED_LOADING = "key_need_loading";

    /* renamed from: a  reason: collision with root package name */
    private IntentFilter f12767a;
    private final aat b;
    private final bbz c;

    static {
        kge.a(-1676907685);
    }

    public static /* synthetic */ Object ipc$super(CartWVBroadcast cartWVBroadcast, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bbz a(CartWVBroadcast cartWVBroadcast) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("3155d5b0", new Object[]{cartWVBroadcast}) : cartWVBroadcast.c;
    }

    public static /* synthetic */ void a(CartWVBroadcast cartWVBroadcast, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a6ab6f", new Object[]{cartWVBroadcast, jSONObject, new Integer(i)});
        } else {
            cartWVBroadcast.a(jSONObject, i);
        }
    }

    public CartWVBroadcast(aat aatVar) {
        this.b = aatVar;
        this.c = aatVar.h();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f12767a == null) {
            this.f12767a = new IntentFilter();
            this.f12767a.addAction(ACTION_QUERY_CART_PAGE);
            this.f12767a.addAction(ACTION_ICART_WV_SERVICE);
            this.f12767a.addCategory("android.intent.category.DEFAULT");
        }
        b();
        LocalBroadcastManager.getInstance(this.c.m()).registerReceiver(this, this.f12767a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.c.m()).unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            String action = intent.getAction();
            if (ACTION_QUERY_CART_PAGE.equals(action)) {
                this.c.a(intent.getBooleanExtra(KEY_NEED_LOADING, false));
            } else if (!ACTION_ICART_WV_SERVICE.equals(action) || !this.b.g()) {
            } else {
                a(intent);
            }
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            String stringExtra = intent.getStringExtra(KEY_ICART_WV_SERVICE_PARAMS);
            String stringExtra2 = intent.getStringExtra(KEY_ICART_WV_SERVICE_ACTION);
            try {
                JSONObject parseObject = JSONObject.parseObject(stringExtra);
                if (!"addGroup".equals(stringExtra2) && !"reGroup".equals(stringExtra2)) {
                    if ("checkItem".equals(stringExtra2)) {
                        b(parseObject, stringExtra2);
                        return;
                    } else if (!"queryFirstPage".equals(stringExtra2)) {
                        return;
                    } else {
                        a(parseObject);
                        return;
                    }
                }
                a(parseObject, stringExtra2);
            } catch (Exception e) {
                bga.a.b("iCart", ICartWVService.JS_BRIDGE_NAME, "handleICartWVService", e.getMessage());
                UnifyLog.d(ICartWVService.JS_BRIDGE_NAME, "parse json error:" + e.getMessage());
            }
        }
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        String string = jSONObject.getString("componentKey");
        String string2 = jSONObject.getString("type");
        String string3 = jSONObject.getString("cartId");
        String string4 = jSONObject.getString("toBundleId");
        if (TextUtils.isEmpty(string2) || str == null || string == null) {
            return;
        }
        IDMComponent b = this.c.n().w().b(string);
        for (b bVar : b.getEventMap().get(str)) {
            if ("reorderClick".equals(bVar.getType())) {
                JSONObject fields = bVar.getFields();
                fields.clear();
                fields.put("type", (Object) string2);
                fields.put("from", (Object) string3);
                fields.put("fromBundleId", (Object) bei.g(b));
                fields.put("toBundleId", (Object) string4);
                bmz a2 = this.c.F().a();
                a2.c(str);
                a2.a(bVar.getType());
                a2.a(bVar);
                a2.a(b);
                this.c.F().a(a2);
            }
        }
    }

    private void b(final JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{this, jSONObject, str});
            return;
        }
        final String string = jSONObject.getString("componentKey");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        final bcf bcfVar = new bcf(this.c);
        int b = bcfVar.b(string);
        if (b != -1) {
            a(jSONObject, b);
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        if (jSONObject2 == null) {
            return;
        }
        new bcg(this.c).b(jSONObject2, new jnv() { // from class: com.taobao.android.icart.broadcast.CartWVBroadcast.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                int b2 = bcfVar.b(string);
                if (b2 == -1) {
                    return;
                }
                CartWVBroadcast.a(CartWVBroadcast.this, jSONObject, b2);
            }
        });
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        }
        new bcg(this.c).a(jSONObject2, new jnv() { // from class: com.taobao.android.icart.broadcast.CartWVBroadcast.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    ((RecyclerView) CartWVBroadcast.a(CartWVBroadcast.this).x().s()).scrollToPosition(0);
                }
            }
        });
    }

    private void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        String string = jSONObject.getString("componentKey");
        bcf bcfVar = new bcf(this.c);
        if (jSONObject.getBooleanValue("needScrollTo")) {
            bcfVar.a(i);
        }
        bcfVar.a(string, jSONObject);
        a(string);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        IDMComponent b = this.c.O().b(str);
        if (b == null || bei.b(b) || !bei.a(b)) {
            return;
        }
        b bVar = null;
        for (b bVar2 : b.getEventMap().get("checkClick")) {
            if ("cartSelect".equals(bVar2.getType())) {
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return;
        }
        bmz I = this.c.I();
        I.a("cartSelect");
        I.a(b);
        I.c("checkClick");
        I.a(bVar);
        this.c.F().a(I);
    }
}
