package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.util.Map;

/* loaded from: classes4.dex */
public class duj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_WDKSGLL = "wdksgll";
    public static final String K_WDK_ADDRESSID = "wdk_addressId";

    /* renamed from: a  reason: collision with root package name */
    private String f26989a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private int n;
    private boolean o;

    static {
        kge.a(-426271507);
    }

    public duj(Map<String, String> map) {
        this.o = false;
        try {
            String str = map.get("exParams");
            JSONObject parseObject = str != null ? JSON.parseObject(str) : new JSONObject();
            map.put("exParams", parseObject.toJSONString());
            this.f26989a = parseObject.getString("novad");
            this.b = parseObject.getString("novab");
            this.c = parseObject.getString("novabv");
            this.d = parseObject.getString("novaa");
            this.e = parseObject.getString("novaav");
            this.f = parseObject.getString("novac");
            this.g = parseObject.getString("novacv");
            if (parseObject.containsKey("source_int")) {
                this.o = true;
                this.n = parseObject.getIntValue("source_int");
            }
            if (parseObject.containsKey(K_WDK_ADDRESSID)) {
                this.j = parseObject.getString(K_WDK_ADDRESSID);
            }
            if (parseObject.containsKey(K_WDKSGLL)) {
                String string = parseObject.getString(K_WDKSGLL);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split(",");
                    this.h = split[0];
                    this.i = split[1];
                }
            }
            if (parseObject.containsKey("poiId")) {
                this.k = parseObject.getString("poiId");
            }
            if (parseObject.containsKey("life_order_location")) {
                JSONObject jSONObject = parseObject.getJSONObject("life_order_location");
                this.h = jSONObject.getString("longitude");
                this.i = jSONObject.getString("latitude");
                this.j = jSONObject.getString("addressId");
                this.k = jSONObject.getString("poiId");
            }
            this.l = map.get("storeId");
            if (!parseObject.containsKey("life_biz_type")) {
                return;
            }
            this.m = parseObject.getString("life_biz_type");
        } catch (Throwable unused) {
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26989a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        return b.c() ? "mtop.trade.global.buy.build" : "mtop.trade.order.build";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        return b.c() ? "1.0" : AfcCustomSdk.SDK_VERSION;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        return b.c() ? "mtop.trade.global.buy.adjust" : "mtop.trade.order.adjust";
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        return b.c() ? "1.0" : "6.0";
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        return b.c() ? "mtop.trade.global.buy.create" : "mtop.trade.order.create";
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.g)) {
            return this.g;
        }
        return b.c() ? "1.0" : "6.0";
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.k;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.l;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.m;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.n;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.o;
    }
}
