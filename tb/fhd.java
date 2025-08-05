package tb;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes5.dex */
public class fhd extends fij {

    /* renamed from: a  reason: collision with root package name */
    public String f27938a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public JSONObject o;

    static {
        kge.a(258910152);
    }

    public fhd(JSONObject jSONObject, Object obj) {
        super(obj);
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("simpleShareItemModel")) == null) {
            return;
        }
        this.f27938a = jSONObject2.getString("imageUrl");
        this.b = jSONObject2.getString("businessId");
        this.c = jSONObject2.getString("desc");
        this.d = jSONObject2.getString("shareUrl");
        this.e = jSONObject2.getString("title");
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("mediaPublisher");
            if (jSONObject3 != null) {
                this.j = jSONObject3.getString("nick");
                this.k = jSONObject3.getString("avatar");
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("mediaInfo");
            if (jSONObject4 != null) {
                this.l = Integer.parseInt(jSONObject4.getString("type"));
                this.n = Integer.parseInt(jSONObject4.getString("height"));
                this.m = Integer.parseInt(jSONObject4.getString("width"));
            }
            this.o = jSONObject2.getJSONObject("templateParams");
        } catch (Exception e) {
            fjt.a("new_detail异常", "share mediaInfo解析异常", e);
        }
    }
}
