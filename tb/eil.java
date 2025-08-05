package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.e;

/* loaded from: classes4.dex */
public class eil implements eio<String, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LSDB f27324a;

    static {
        kge.a(521015017);
        kge.a(968905969);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // tb.eio
    public /* synthetic */ JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9798556e", new Object[]{this, str}) : b2(str);
    }

    @Override // tb.eio
    public /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, str});
        } else {
            a2(str);
        }
    }

    public eil() {
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailOptLSDBManager");
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        } else if (this.f27324a != null) {
            return true;
        } else {
            try {
                Config config = new Config();
                config.walSize = 524288;
                this.f27324a = LSDB.open("DetailPage", config);
                i.c(l.a("DetailOptLSDBManager"), "open success");
            } catch (Exception e) {
                i.a(l.a("DetailOptLSDBManager"), "open LSDB", e);
            }
            return this.f27324a != null;
        }
    }

    @Override // tb.eio
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (!a()) {
        } else {
            String jSONString = jSONObject.toJSONString();
            try {
                this.f27324a.insertString(new e(str), jSONString);
                String a2 = l.a("DetailOptLSDBManager");
                i.c(a2, "缓存数据到本地，读取到key:" + str + ", value: " + jSONString);
            } catch (Exception e) {
                i.a(l.a("DetailOptLSDBManager"), "insert LSDB", e);
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!a()) {
        } else {
            try {
                this.f27324a.delete(new e(str));
                String a2 = l.a("DetailOptLSDBManager");
                i.c(a2, "删除本地缓存数据，读取到key:" + str);
            } catch (Exception e) {
                i.a(l.a("DetailOptLSDBManager"), "delete LSDB", e);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public JSONObject b2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        JSONObject jSONObject = null;
        if (!a()) {
            return null;
        }
        try {
            jSONObject = JSONObject.parseObject(this.f27324a.getString(new e(str)));
            String a2 = l.a("DetailOptLSDBManager");
            i.c(a2, "获取本地缓存数据，读取到key:" + str + ", value:" + jSONObject);
            return jSONObject;
        } catch (Exception e) {
            i.a(l.a("DetailOptLSDBManager"), "delete LSDB", e);
            return jSONObject;
        }
    }
}
