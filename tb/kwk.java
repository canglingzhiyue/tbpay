package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;

/* loaded from: classes4.dex */
public class kwk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_PARAMS = "bizParams";
    public static final String FROM = "from";
    public static final String ITEM_ID = "itemId";
    public static final String PAYLOAD = "payload";
    public static final String REC_CUBE = "recCube";
    public static final String SELLER_ID = "sellerId";
    public static final String USER_ID = "userId";
    private static String h;

    /* renamed from: a  reason: collision with root package name */
    public String f30351a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public JSONObject g;

    static {
        kge.a(-993204141);
        h = "TTDetailRecommendParams";
    }

    public static kwk a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kwk) ipChange.ipc$dispatch("2903415f", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
        if (jSONObject2 == null) {
            return null;
        }
        kwk kwkVar = new kwk();
        String string = jSONObject2.getString("api");
        String string2 = jSONObject2.getString("version");
        String string3 = jSONObject2.getString("channel");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            string = "mtop.taobao.wireless.home.awesome.itemdetail.recommend";
            string2 = "1.0";
            string3 = "detail";
        }
        String str = h;
        i.a(str, "api : " + string + ", version : " + string2 + ", channel : " + string3);
        kwkVar.f30351a = string;
        kwkVar.b = string2;
        kwkVar.c = string3;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("bizParams");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        String string4 = jSONObject2.getString("itemId");
        jSONObject3.put("itemId", (Object) string4);
        String string5 = jSONObject2.getString("userId");
        jSONObject3.put("sellerId", (Object) string5);
        String string6 = TextUtils.isEmpty(jSONObject2.getString("from")) ? REC_CUBE : jSONObject2.getString("from");
        jSONObject3.put("from", (Object) string6);
        kwkVar.d = string4;
        kwkVar.e = string5;
        kwkVar.f = string6;
        kwkVar.g = jSONObject3;
        return kwkVar;
    }
}
