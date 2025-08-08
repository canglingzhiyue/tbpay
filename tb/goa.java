package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class goa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_SURE_AND_DETAIL = "3";

    /* renamed from: a  reason: collision with root package name */
    private gnz f28402a;

    static {
        kge.a(-2104862112);
    }

    public static /* synthetic */ String a(goa goaVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bebfb870", new Object[]{goaVar, map, str}) : goaVar.a(map, str);
    }

    private goa(gnz gnzVar) {
        this.f28402a = gnzVar;
    }

    public static goa a(gnz gnzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (goa) ipChange.ipc$dispatch("3512e008", new Object[]{gnzVar}) : new goa(gnzVar);
    }

    public void a(gny gnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9e3126", new Object[]{this, gnyVar});
        } else {
            a("3", gnyVar, false);
        }
    }

    public void a(String str, final gny gnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268ce9e4", new Object[]{this, str, gnyVar, new Boolean(z)});
        } else if (this.f28402a == null) {
            gnyVar.a(-3, mrm.KEY_SKU_PARAM_ERROR_MSG);
        } else {
            JSONObject jSONObject = new JSONObject();
            if (this.f28402a.f != null) {
                jSONObject.put("id_biz_installment", (Object) this.f28402a.f);
            }
            JSONObject jSONObject2 = this.f28402a.d;
            if (jSONObject2 != null) {
                jSONObject.putAll(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            if (this.f28402a.g != null) {
                jSONObject3.putAll(this.f28402a.g);
            }
            jSONObject3.put("skuId", (Object) this.f28402a.b);
            jSONObject3.put("bizName", (Object) "cart");
            jSONObject3.put("extInput", (Object) jSONObject);
            String c = bcd.a().c();
            if (!StringUtils.isEmpty(c)) {
                jSONObject3.put("addressId", (Object) c);
                this.f28402a.i.add("addressId");
            }
            jSONObject3.put("openFrom", (Object) "cart");
            this.f28402a.i.add("openFrom");
            if ("1".equals(str)) {
                jSONObject3.put("depressTBCartRefresh", (Object) Boolean.valueOf(z));
            }
            if (a()) {
                jSONObject3.put("sku_forbidH5", (Object) "true");
                jSONObject3.put("sku_forbidH5_toast", (Object) b.a(R.string.taobao_app_1028_1_21631));
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", this.f28402a.f28401a);
            hashMap.put("sourceType", str);
            jSONObject3.put(noa.KEY_MSOA_TRANS_KEY, (Object) bei.b(this.f28402a.i));
            hashMap.put("exParams", jSONObject3);
            try {
                c.a().a(new h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new MSOAServiceListener() { // from class: tb.goa.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        } else if (map == null) {
                            gnyVar.a(-1, mrm.KEY_SKU_CANCEL_MSG);
                        } else {
                            gnz a2 = gnz.a(goa.a(goa.this, map, "itemId"), goa.a(goa.this, map, "skuId"), goa.a(goa.this, map, mrm.KEY_AREA_ID), "");
                            Object obj = map.get(tfu.ADD_CART);
                            if (obj instanceof Map) {
                                a2.e = goa.a(goa.this, (Map) obj, "exParams");
                            }
                            gnyVar.a(a2);
                        }
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str2, String str3, boolean z2, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z2), map});
                            return;
                        }
                        gny gnyVar2 = gnyVar;
                        gnyVar2.a(-2, mrm.KEY_SKU_ERROR_MSG + str2 + str3);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f28402a.h)) {
            return Boolean.valueOf(this.f28402a.h).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("cart_switch", "forbidH5", "true"));
    }

    private String a(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str}) : (map == null || (obj = map.get(str)) == null || !(obj instanceof String)) ? "" : (String) obj;
    }
}
