package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.a;
import com.taobao.android.gateway.msgcenter.b;
import com.taobao.informationflowdataservice.dataservice.core.event.RecmdGatewayMsg;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class lxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f30969a;
    private b b;
    private lwz c;

    static {
        kge.a(-1188943423);
        f30969a = "preloadOptimize";
    }

    public lxf(lwz lwzVar, b bVar) {
        this.b = bVar;
        this.c = lwzVar;
    }

    public void a(String str, a aVar, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace6f915", new Object[]{this, str, aVar, strArr, jSONObject});
            return;
        }
        String[] a2 = a(strArr);
        if (TextUtils.isEmpty(str) || a2 == null || aVar == null) {
            return;
        }
        a(str, aVar, a(str, a2, jSONObject));
    }

    private JSONObject a(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3fdac03", new Object[]{this, str, strArr, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("containers", (Object) strArr);
        b(str, strArr, a(jSONObject));
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("bizParam", (Object) jSONObject3);
        return jSONObject3;
    }

    private void b(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95177a4", new Object[]{this, str, strArr, jSONObject});
            return;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str, "PageBack")) {
                a(str2, jSONObject);
            }
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        lxn.a(this.c.b(), str);
        JSONObject a2 = lxn.a(str);
        if (a2 == null) {
            return;
        }
        for (String str2 : a2.keySet()) {
            String string = a2.getString(str2);
            jSONObject.put(str2, (Object) a2.getString(str2));
            if (TextUtils.equals("itemId", str2)) {
                lxn.a(str, string);
            }
        }
    }

    private String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{this, strArr});
        }
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    private void a(String str, a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c2aa0c", new Object[]{this, str, aVar, jSONObject});
            return;
        }
        com.taobao.android.gateway.datastructure.b bVar = new com.taobao.android.gateway.datastructure.b(str, aVar, jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message == null) {
            return;
        }
        this.b.a(message);
    }
}
