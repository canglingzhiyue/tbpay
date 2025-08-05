package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.behavixswitch.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class drg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static drg f26920a;
    private List<dri> b;
    private List<dri> c;
    private String d = "";
    private JSONObject e = new JSONObject();
    private String f = "";

    static {
        kge.a(1376051998);
    }

    private drg() {
    }

    public static drg a() {
        drg drgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drg) ipChange.ipc$dispatch("f03d2a5", new Object[0]);
        }
        drg drgVar2 = f26920a;
        if (drgVar2 != null) {
            return drgVar2;
        }
        synchronized (drg.class) {
            if (f26920a == null) {
                f26920a = new drg();
            }
            drgVar = f26920a;
        }
        return drgVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a.b.h()) {
            g();
        } else {
            e();
            f();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            String a2 = a.a(j.a.K_NODE_FILTERS, com.taobao.android.behavix.adapter.a.a(j.a.K_NODE_FILTERS));
            if (TextUtils.equals(a2, this.d)) {
                return;
            }
            if (TextUtils.isEmpty(a2)) {
                g();
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(a2);
                this.d = a2;
                if (parseObject != null && parseObject.size() != 0) {
                    this.b = a(parseObject, "whitelist");
                    this.c = a(parseObject, "blacklist");
                    return;
                }
                g();
            } catch (Exception e) {
                dsb.a("NodeConfigCenter.updateConfig", "", null, e);
            }
        } catch (Throwable th) {
            dsb.a("NodeConfigCenter.updateConfig", null, null, th);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            String a2 = a.a(j.a.K_TABLE_CONFIG, "{\"dc_userBehavior_custom_node\":{\"limit\":1000,\"expire\":30}}");
            if (TextUtils.equals(a2, this.f)) {
                return;
            }
            if (TextUtils.isEmpty(a2)) {
                this.e = new JSONObject();
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(a2);
                this.f = a2;
                if (parseObject != null && parseObject.size() != 0) {
                    this.e = parseObject;
                    return;
                }
                this.e = new JSONObject();
            } catch (Exception e) {
                dsb.a("NodeConfigCenter.updateTableConfig", "", null, e);
            }
        } catch (Throwable th) {
            dsb.a("NodeConfigCenter.updateTableConfig", null, null, th);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.b = new ArrayList(0);
        this.c = new ArrayList(0);
    }

    private List<dri> a(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954730b5", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(str)) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    arrayList.add(new dri(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public List<dri> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        if (!a.b.h()) {
            this.b = new ArrayList(0);
            this.d = null;
            return null;
        }
        return this.b;
    }

    public List<dri> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        if (!a.b.h()) {
            this.c = new ArrayList(0);
            this.d = null;
            return null;
        }
        return this.c;
    }
}
