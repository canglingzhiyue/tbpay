package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.Map;

/* loaded from: classes5.dex */
public class spl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f33814a;
    public String b;
    public String c;
    public Map<String, String> d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public float k;

    static {
        kge.a(1613560696);
    }

    public static spl a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spl) ipChange.ipc$dispatch("17cfb4e4", new Object[]{eyyVar});
        }
        spl splVar = null;
        if (eyyVar != null && eyyVar.d() != null) {
            JSONObject jSONObject = eyyVar.d().getJSONObject("payload");
            if (jSONObject == null) {
                return null;
            }
            splVar = new spl();
            splVar.f33814a = jSONObject.getString("userId");
            splVar.b = jSONObject.getString("shopId");
            splVar.c = jSONObject.getString("itemId");
            try {
                splVar.d = (Map) jSONObject.getObject("moduleDescParams", Map.class);
            } catch (Exception unused) {
                i.a("DetailDescModel", "detailDescModel moduleDescParams parser error");
            }
            splVar.e = jSONObject.getString("taobaoDescUrl");
            splVar.f = jSONObject.getString("taobaoPcDescUrl");
            try {
                splVar.g = jSONObject.getBooleanValue("shrinkDesc");
                splVar.h = jSONObject.getBooleanValue("shrinkPriceInfo");
            } catch (Exception unused2) {
                i.a("DetailDescModel", "detailDescModel shrink parser error");
            }
            try {
                splVar.k = jSONObject.getFloatValue("shrinkDescHeightRatio");
            } catch (Exception unused3) {
                i.a("DetailDescModel", "detailDescModel shrinkHeight parser error");
            }
            splVar.i = jSONObject.getString("priceExpandImageUrl");
            splVar.j = jSONObject.getString("priceShrinkImageUrl");
        }
        return splVar;
    }
}
