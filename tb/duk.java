package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.a;
import java.util.HashMap;
import java.util.Map;
import tb.ifz;

/* loaded from: classes4.dex */
public class duk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SERVICE_NAME = "nextrpc-BUY2";
    public static final int mTaoBaoBizId = 24;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26990a;
    private duj b;
    private Map<String, String> c;
    private String d;
    private duh e;
    private duh f;
    private duh g;
    private Activity h;
    private boolean i;
    private String j;

    static {
        kge.a(615267431);
    }

    public duk(Activity activity) {
        this.d = null;
        this.i = duy.a("closeCreateOrderRetry", false);
        a(activity);
        this.h = activity;
    }

    public duk(Context context, Intent intent) {
        this.d = null;
        a(context, intent);
    }

    public duh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duh) ipChange.ipc$dispatch("f03de07", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new duh();
        }
        this.e.a(this.b.b());
        this.e.c(this.b.a());
        this.e.b(this.b.c());
        this.e.a(this.f26990a);
        if (!StringUtils.isEmpty(this.j)) {
            duh duhVar = this.e;
            duhVar.e("order_" + this.j);
        }
        this.e.c(24);
        this.e.a(true);
        this.e.b(this.c);
        this.e.d(this.d);
        this.e.b(a.b());
        return this.e;
    }

    public duh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duh) ipChange.ipc$dispatch("16b58366", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new duh();
        }
        this.f.a(this.b.d());
        this.f.c(this.b.a());
        this.f.b(this.b.e());
        this.f.c(24);
        this.f.a(true);
        this.f.b(this.c);
        this.f.d(this.d);
        this.f.b(a.b());
        return this.f;
    }

    public duh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duh) ipChange.ipc$dispatch("1e6728c5", new Object[]{this});
        }
        Map<String, String> a2 = dui.a(this.h);
        if (this.g == null) {
            this.g = new duh();
        }
        this.g.a(this.b.f());
        this.g.c(this.b.a());
        this.g.b(this.b.g());
        this.g.c(24);
        this.g.a(a2);
        this.g.a(true);
        this.g.b(true);
        this.g.b(this.c);
        this.g.d(this.d);
        this.g.b(a.b());
        if (this.i) {
            this.g.a(0);
        }
        return this.g;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.j;
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            Intent b = fke.b(activity);
            if (b == null) {
                ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(prepare)").a(1.0f));
            } else {
                a(activity, b);
            }
        }
    }

    private void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        this.f26990a = dui.a(context, intent);
        this.j = this.f26990a.remove("itemNum");
        this.c = a(intent);
        this.b = new duj(this.f26990a);
        if (!StringUtils.isEmpty(this.b.a())) {
            return;
        }
        this.d = "UNIT_TRADE";
    }

    private Map<String, String> a(Intent intent) {
        Map map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{this, intent});
        }
        try {
            map = (Map) intent.getSerializableExtra("buildOrderParams");
        } catch (Throwable unused) {
            map = null;
        }
        if (map == null) {
            Uri data = intent.getData();
            str = data != null ? data.getQueryParameter("itemId") : null;
        } else {
            str = (String) map.get("itemId");
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-itemid", str);
        return hashMap;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.c.putAll(map);
    }

    public Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    if ("exParams".equals(key)) {
                        a(this.f26990a, entry.getValue());
                    } else {
                        this.f26990a.put(key, entry.getValue());
                    }
                }
            }
        }
        return this.f26990a;
    }

    private void a(Map<String, String> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
        } else if (map == null || str == null) {
        } else {
            String str2 = map.get("exParams");
            if (StringUtils.isEmpty(str2)) {
                map.put("exParams", str);
                return;
            }
            JSONObject jSONObject2 = null;
            try {
                jSONObject = JSON.parseObject(str2);
                try {
                    jSONObject2 = JSON.parseObject(str);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.putAll(jSONObject2);
            map.put("exParams", jSONObject.toJSONString());
        }
    }

    public duj d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (duj) ipChange.ipc$dispatch("2618ce62", new Object[]{this}) : this.b;
    }
}
