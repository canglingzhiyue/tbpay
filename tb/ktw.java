package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ktw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "commonBizParams";

    /* renamed from: a  reason: collision with root package name */
    private final List<ktx> f30315a = new CopyOnWriteArrayList();

    static {
        kge.a(1190225163);
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (this.f30315a.isEmpty()) {
            lap.a("CreateCommonParams", "create", "IBizParamsBuilder 为空请检查");
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject.put(KEY, (Object) jSONObject2);
        for (ktx ktxVar : this.f30315a) {
            String b = ktxVar.b();
            if (TextUtils.isEmpty(b)) {
                lap.a("CreateCommonParams", "create", "IBizParamsBuilder getKey 返回空，请检查 ： " + ktxVar.getClass().getName());
            } else {
                jSONObject2.put(b, (Object) ktxVar.a());
            }
        }
        return jSONObject;
    }

    public ktw a(ktx ktxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ktw) ipChange.ipc$dispatch("f3815baf", new Object[]{this, ktxVar});
        }
        this.f30315a.add(ktxVar);
        return this;
    }
}
