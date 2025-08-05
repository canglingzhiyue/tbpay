package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.sku.c;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.eyx;
import tb.kge;
import tb.odg;
import tb.pir;
import tb.pkw;
import tb.xiy;

/* loaded from: classes5.dex */
public class w extends xiy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openSKU";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_sku";

    /* renamed from: a */
    private volatile boolean f10727a = true;
    private volatile boolean b = false;
    private Context c;
    private eyx d;
    private com.taobao.android.detail.ttdetail.c e;
    private volatile com.taobao.android.detail.ttdetail.request.stream.a f;
    private c.e g;
    private a h;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(112321438);
    }

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b5457963", new Object[]{wVar}) : wVar.c;
    }

    public static /* synthetic */ void a(w wVar, com.taobao.android.detail.ttdetail.handler.event.a aVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e2890a", new Object[]{wVar, aVar, jSONObject, new Boolean(z)});
        } else {
            wVar.a(aVar, jSONObject, z);
        }
    }

    public static /* synthetic */ boolean a(w wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1e434cd", new Object[]{wVar, new Boolean(z)})).booleanValue();
        }
        wVar.b = z;
        return z;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.c b(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.c) ipChange.ipc$dispatch("8d9ae129", new Object[]{wVar}) : wVar.e;
    }

    public static /* synthetic */ eyx c(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("251e4c35", new Object[]{wVar}) : wVar.d;
    }

    public w(Context context, eyx eyxVar, com.taobao.android.detail.ttdetail.c cVar, a aVar) {
        this.c = context;
        this.d = eyxVar;
        this.e = cVar;
        this.h = aVar;
    }

    public static com.taobao.android.detail.ttdetail.handler.event.a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.handler.event.a) ipChange.ipc$dispatch("e0f7b415", new Object[]{str, str2}) : new com.taobao.android.detail.ttdetail.handler.event.a(new OpenSkuImplementor$1(str, str2));
    }

    @Override // tb.ezm
    public boolean a(final com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            com.taobao.android.detail.ttdetail.utils.ao.a(true);
            return true;
        }
        if ("ADDCART_AND_BUYNOW".equalsIgnoreCase(b(aVar.b()))) {
            this.d.e().a("skuClickTime", String.valueOf(System.currentTimeMillis()));
            this.d.e().a("skuClickTimeType", com.taobao.android.sku.utils.o.P_SKUBAR_BTN_CLICK);
        }
        final com.taobao.android.detail.ttdetail.request.stream.a aVar2 = new com.taobao.android.detail.ttdetail.request.stream.a() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.w.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                w.this = this;
            }

            @Override // com.taobao.android.detail.ttdetail.request.stream.a
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "拉起sku添加流式listener, 回调成功");
                w.a(w.this, true);
                w.a(w.this, aVar, jSONObject, false);
            }

            @Override // com.taobao.android.detail.ttdetail.request.stream.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "拉起sku添加流式listener, 回调失败, retCode=" + str + ", retMsg=" + str2);
                w.a(w.this, true);
                Toast.makeText(w.a(w.this), odg.o().a(R.string.tt_detail_app_busy_system_tired), 0).show();
                w.b(w.this).e();
                w.b(w.this).k();
            }
        };
        this.f = aVar2;
        if (this.d.a().b(this.f)) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "拉起sku流式listener已经存在监听");
            return false;
        }
        this.b = false;
        if (this.d.a().b() == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", this.d.e().a("requestItemId"));
            com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -300013, "拉起sku流式回调失败重发请求");
            this.h.a();
            com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "拉起sku流式二段数据异常，重发请求");
        }
        this.d.a().c(aVar2);
        if (!this.b) {
            a(aVar, null, true);
            if (this.g == null) {
                this.g = new c.e() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.w.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        w.this = this;
                    }

                    @Override // com.taobao.android.sku.c.e
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        w.c(w.this).a().a(aVar2);
                        com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "sku面板关闭，移除可能的loading流式listener");
                    }
                };
            }
            this.e.a(this.g);
        } else {
            this.e.a((c.e) null);
        }
        com.taobao.android.detail.ttdetail.utils.i.a("OpenSkuImplementor", "拉起sku execute finish, with dataReadyState: " + this.b);
        return true;
    }

    private String a() {
        SkuCore.b skuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        SkuCore skuCore = (SkuCore) this.d.a().a(SkuCore.class);
        if (skuCore != null && (skuItem = skuCore.getSkuItem()) != null) {
            return skuItem.b();
        }
        return null;
    }

    private void a(com.taobao.android.detail.ttdetail.handler.event.a aVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7911647", new Object[]{this, aVar, jSONObject, new Boolean(z)});
            return;
        }
        pir pirVar = (pir) this.d.a().a(pkw.PARSER_ID);
        if (pirVar == null) {
            return;
        }
        this.e.a(jSONObject);
        this.e.a();
        String str = null;
        if (this.f10727a) {
            str = (String) this.d.e().a("lastPageSetSkuId");
        }
        JSONObject b = aVar.b();
        String b2 = b(b);
        if (!z && "BUYNOW".equalsIgnoreCase(b2)) {
            String a2 = a();
            if (!TextUtils.isEmpty(a2)) {
                com.taobao.android.sku.weex.c.a(this.c, "onSKUEntryClick", a2, this.d.e().a());
            }
        }
        this.e.a(b2, str, a(b), com.taobao.android.detail.ttdetail.utils.k.c((Feature) pirVar.a(Feature.class)));
        if (z) {
            this.e.d();
        }
        this.f10727a = false;
    }

    private String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
            return jSONObject2.getString("silentAction");
        }
        return null;
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null) {
            return "ADDCART_AND_BUYNOW";
        }
        String string = jSONObject2.getString("skuBottomMode");
        if ("ADDCART".equals(string)) {
            return "ADDCART";
        }
        if ("BUYNOW".equals(string)) {
            return "BUYNOW";
        }
        "ADDCART_AND_BUYNOW".equals(string);
        return "ADDCART_AND_BUYNOW";
    }

    @Override // tb.xiy
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor$4
            {
                put("SKULayerId", String.valueOf(w.b(w.this).l()));
            }
        };
    }
}
