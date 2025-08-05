package tb;

import com.taobao.android.weex.n;
import com.taobao.android.weex_framework.ui.c;
import com.taobao.android.weex_framework.ui.h;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.common.b;
import io.unicorn.plugin.common.d;
import io.unicorn.plugin.common.g;
import io.unicorn.plugin.common.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rtl {

    /* renamed from: a  reason: collision with root package name */
    public final h f33368a;
    private c c;
    private h.b e;
    private List<h.a> d = new ArrayList();
    final h.c b = new a(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        private final rtl f33369a;

        static {
            kge.a(-1374803027);
            kge.a(-1128999743);
        }

        public a(rtl rtlVar) {
            this.f33369a = rtlVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.h.c
        public void a(g gVar, h.d dVar) {
            String str = gVar.f24846a;
            Object obj = gVar.b;
            rtd.b("EngineChannel", "Received '" + str + "' message.");
            if (this.f33369a.c != null && "gestureState".equals(str) && (obj instanceof JSONObject)) {
                try {
                    this.f33369a.c.a(((JSONObject) obj).getBoolean("gestureState"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (this.f33369a.d != null && "gestureState".equals(str) && (obj instanceof JSONObject)) {
                try {
                    for (h.a aVar : this.f33369a.d) {
                        aVar.a(((JSONObject) obj).getBoolean("gestureState"), ((JSONObject) obj).getString("acceptGestureType"));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (this.f33369a.e == null || !"onOverscroll".equals(str) || !(obj instanceof JSONObject)) {
                return;
            }
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject(Constants.Name.CONTENT_OFFSET);
                this.f33369a.e.a(((JSONObject) obj).getDouble("value"), ((JSONObject) obj).getDouble("velocity"), ((JSONObject) obj).getString("axis"), jSONObject);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    static {
        kge.a(-2057318970);
    }

    public rtl(b bVar) {
        this.f33368a = new io.unicorn.plugin.common.h(bVar, "unicorn/engine_events", d.INSTANCE);
        this.f33368a.a(this.b);
    }

    public static void c() {
        a.a();
    }

    public void a() {
        this.f33368a.a("refreshPixelCheckTime", null);
    }

    public void a(n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", nVar.a().value());
            jSONObject.put("x", nVar.b());
            jSONObject.put("y", nVar.c());
            jSONObject.put("width", nVar.d());
            jSONObject.put("height", nVar.e());
            jSONObject.put("eventType", nVar.f().value());
            jSONObject.put("timeStamp", nVar.g() * 1000);
            this.f33368a.a("external.event", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(h.b bVar) {
        if (bVar != null) {
            this.e = bVar;
            this.f33368a.a("handleOverscroll", true);
        }
    }

    public void a(String str, Object obj) {
        this.f33368a.a(str, obj);
    }

    public void a(boolean z, c cVar, h.a aVar) {
        rtd.a("EngineChannel", "Sending message to set consumption mode '" + z + "'");
        this.c = cVar;
        if (aVar != null) {
            this.d.add(aVar);
        }
        this.f33368a.a("setConsumptionMode", Integer.valueOf(z ? 1 : 0));
    }

    public void b() {
        this.f33368a.a("stopPixelCheck", null);
    }

    public void d() {
        this.c = null;
        this.d.clear();
        this.e = null;
    }
}
