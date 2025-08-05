package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class mui {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_KEY_BUCKET_ARRAY = "bucketArray";

    static {
        kge.a(-1912451107);
    }

    public static void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mui.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject2;
                    JSONArray jSONArray;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject3 = JSONObject.this;
                    if (jSONObject3 == null || !jSONObject3.containsKey(AntDetector.EXT_KEY_AB_TEST) || (jSONObject2 = JSONObject.this.getJSONObject(AntDetector.EXT_KEY_AB_TEST)) == null || !jSONObject2.containsKey(mui.JSON_KEY_BUCKET_ARRAY) || (jSONArray = jSONObject2.getJSONArray(mui.JSON_KEY_BUCKET_ARRAY)) == null || jSONArray.size() <= 0) {
                        return;
                    }
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            UTABTest.activateServer(next.toString());
                        }
                    }
                }
            });
        }
    }
}
