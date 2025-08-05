package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.a;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class jnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(96869846);
    }

    public void a(b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{this, bVar, jSONObject});
        } else if (jSONObject != null && bVar != null) {
            if ((bVar.f("container") && !bVar.j().isEmpty()) || (jSONObject2 = jSONObject.getJSONObject("container")) == null || (jSONArray = jSONObject2.getJSONArray("data")) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            StringBuilder sb = new StringBuilder("\n");
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    a aVar = new a(jSONObject3);
                    arrayList.add(aVar);
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("type");
                    if (jSONArray2 != null) {
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            String string = jSONArray2.getString(i2);
                            sb.append("componentType: ");
                            sb.append(string);
                            sb.append(", containerName: ");
                            sb.append(aVar.c);
                            sb.append("\n");
                            bVar.j().put(string, jSONObject3);
                        }
                    }
                }
            }
            if (bVar.d() == null) {
                bVar.c(arrayList);
            } else {
                bVar.d().addAll(arrayList);
            }
        }
    }
}
