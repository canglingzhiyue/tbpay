package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.sku.utils.b;

/* loaded from: classes6.dex */
public class jdj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29476a;
        public String b;

        static {
            kge.a(-727781430);
        }

        public a(boolean z, String str) {
            this.f29476a = false;
            this.b = "";
            this.f29476a = z;
            this.b = str;
        }
    }

    static {
        kge.a(1378171081);
    }

    public static boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48075356", new Object[]{jSONObject, str})).booleanValue() : b(jSONObject, str).f29476a;
    }

    public static a b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5fb5328", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new a(false, "input error");
        }
        return new a(true, "Congratulations, it's done");
    }

    public static boolean c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a73f914", new Object[]{jSONObject, str})).booleanValue();
        }
        if (!b.a(str)) {
            return a(jSONObject);
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(SkuCoreNode.TAG)) == null || (jSONObject3 = jSONObject2.getJSONObject("skuItem")) == null) {
            return false;
        }
        return !StringUtils.isEmpty(jSONObject3.getString("optionalSkuH5Url")) || a(jSONObject);
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(SkuCoreNode.TAG)) == null || (jSONObject3 = jSONObject2.getJSONObject("skuItem")) == null || StringUtils.isEmpty(jSONObject3.getString("skuH5Url"))) ? false : true;
    }
}
