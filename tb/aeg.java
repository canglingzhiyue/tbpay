package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.PrefetchType;
import com.taobao.weaver.prefetch.b;
import com.taobao.weaver.prefetch.c;
import com.taobao.weaver.prefetch.d;
import com.taobao.weaver.prefetch.f;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class aeg implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f25285a;
    private static String b;
    private static String c;

    static {
        kge.a(-209314528);
        kge.a(-1116671417);
        f25285a = "Prefetch.getData";
        b = "Prefetch.requestData";
        c = "test";
    }

    @Override // com.taobao.weaver.prefetch.d
    public f a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1300fe98", new Object[]{this, str, map});
        }
        JSONObject jSONObject = new JSONObject(map);
        if (jSONObject.getBoolean("isSupport") != null) {
            z = jSONObject.getBoolean("isSupport").booleanValue();
        }
        String queryParameter = Uri.parse(str).getQueryParameter("apiName");
        f fVar = new f();
        if (f25285a.equals(queryParameter) || b.equals(queryParameter) || z) {
            fVar.b = c;
            if (map.containsKey("externalKey")) {
                fVar.b = jSONObject.getString("externalKey");
            }
            fVar.f23476a = PrefetchType.SUPPORTED;
        }
        return fVar;
    }

    @Override // com.taobao.weaver.prefetch.d
    public String a(String str, Map<String, Object> map, final b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2892414", new Object[]{this, str, map, bVar});
        }
        JSONObject jSONObject = new JSONObject(map);
        if (jSONObject.getBoolean("isLocal") != null) {
            z = jSONObject.getBoolean("isLocal").booleanValue();
        }
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, "TBClient");
            hashMap.put("apiName", "Prefetch");
            hashMap.put("type", "Local");
            c cVar = new c();
            cVar.d = hashMap;
            cVar.b = 10;
            cVar.f23472a = 500;
            bVar.a(cVar);
            return null;
        }
        android.taobao.windvane.connect.c.a().a(str, new android.taobao.windvane.connect.d<android.taobao.windvane.connect.f>() { // from class: tb.aeg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.connect.d
            public /* synthetic */ void onFinish(android.taobao.windvane.connect.f fVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33e8872e", new Object[]{this, fVar, new Integer(i)});
                } else {
                    a(fVar, i);
                }
            }

            public void a(android.taobao.windvane.connect.f fVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("518578c7", new Object[]{this, fVar, new Integer(i)});
                } else if (fVar == null || fVar.d().length == 0) {
                    bVar.a("-4", "getData Error");
                } else {
                    try {
                        String str2 = new String(fVar.d(), "utf-8");
                        c cVar2 = new c();
                        cVar2.d = JSONObject.parseObject(str2);
                        cVar2.f23472a = 500;
                        cVar2.b = 10;
                        bVar.a(cVar2);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return null;
    }
}
