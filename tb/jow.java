package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class jow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, jov> f29666a;

    static {
        kge.a(-1954163630);
        f29666a = new HashMap();
        joy joyVar = new joy();
        f29666a.put(joyVar.a(), joyVar);
        jox joxVar = new jox();
        f29666a.put(joxVar.a(), joxVar);
        jpa jpaVar = new jpa();
        f29666a.put(jpaVar.a(), jpaVar);
        joz jozVar = new joz();
        f29666a.put(jozVar.a(), jozVar);
    }

    public static void a(b bVar, JSONObject jSONObject) {
        jpu b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{bVar, jSONObject});
            return;
        }
        String h = bVar.h() == null ? "Ultron" : bVar.h();
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject2 == null) {
            jpr.a(jpu.a(h).c("UltronDeltaParser").b("hierarchy is null"));
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("delta");
        if (jSONArray == null || jSONArray.isEmpty()) {
            jqg.a(h, "UltronDeltaParser", "deltaProtocol is empty");
            jpr.a(jpu.a(h).c("UltronDeltaParser").b("hierarchy is null"));
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                b = jpu.a(h).c("UltronDeltaParser").b("deltaOptionObj is not JSONObject");
            } else {
                JSONObject jSONObject3 = (JSONObject) next;
                String string = jSONObject3.getString("opType");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = jSONObject3.getString("target");
                    if (!TextUtils.isEmpty(string2)) {
                        jov jovVar = f29666a.get(string);
                        if (jovVar == null) {
                            jpu c = jpu.a(h).c("UltronDeltaParser");
                            b = c.b("there is no delta parser for type:" + string);
                        } else {
                            try {
                                jovVar.a(bVar, jSONObject, jSONObject3, string2, jSONObject3.getString(c.MSG_SOURCE_PARENT), jSONObject3.getString("position"));
                            } catch (Exception e) {
                                jpr.a(jpu.a(h).c("UltronDeltaParser").b(e.getMessage()));
                            }
                            bVar.d(string2, string);
                        }
                    }
                }
            }
            jpr.a(b);
        }
    }
}
