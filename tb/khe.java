package tb;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.common.request.b;
import com.taobao.desktop.common.request.c;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class khe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static void a(JSONObject jSONObject, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169e470e", new Object[]{jSONObject, khgVar});
        } else if (jSONObject == null || khgVar == null) {
        } else {
            List<String> c = khgVar.c();
            if (c != null && c.size() > 0) {
                jSONObject.put("dynamicList", (Object) c);
            }
            List<String> d = khgVar.d();
            if (d == null || d.size() <= 0) {
                return;
            }
            jSONObject.put("animList", (Object) d);
        }
    }

    public static void a(String str, List<String> list, Object obj, boolean z, final khf khfVar, Handler handler, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c882352", new Object[]{str, list, obj, new Boolean(z), khfVar, handler, khgVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONObject.put("ids", (Object) list);
            a(jSONObject, khgVar);
            if (obj != null) {
                jSONObject.put("bizExt", obj);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(0, jSONObject);
            hashMap.put("bizInfo", jSONArray.toString());
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "1.0");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a2 = khn.a(khm.a().c()).a();
            if (a2 != null) {
                jSONObject2.put("mockData", (Object) a2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("encryptedUid", (Object) khn.a(khm.a().c()).d());
            jSONObject2.put("encryptedUser", (Object) jSONObject3);
            if (khgVar != null && !StringUtils.isEmpty(khgVar.a())) {
                jSONObject2.put(i.CDN_REQUEST_TYPE, (Object) khgVar.a());
            }
            hashMap.put("extMap", String.valueOf(jSONObject2));
            b.a(hashMap, z, new c() { // from class: tb.khe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.common.request.c
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    khu.a(getClass(), "requestServerData onSuccess");
                    khf khfVar2 = khf.this;
                    if (khfVar2 == null || str2 == null) {
                        return;
                    }
                    khfVar2.a(str2);
                }

                @Override // com.taobao.desktop.common.request.c
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    Class<?> cls = getClass();
                    khu.a(cls, "requestData onError: " + str2 + " retMsg" + str3);
                    khf khfVar2 = khf.this;
                    if (khfVar2 == null) {
                        return;
                    }
                    khfVar2.b(str3);
                }
            }, handler);
        } catch (Exception e) {
            khu.a("requestServerData onError: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
