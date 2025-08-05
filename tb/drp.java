package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.j;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taolive.room.utils.aw;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class drp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseNode";
    public String k;
    public String l;
    public JSONObject r;
    public Map<String, Object> x;

    /* renamed from: a  reason: collision with root package name */
    public long f26928a = -1;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public long f = 0;
    public String g = "";
    public String h = "";
    public String i = "";
    public long j = 0;
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = null;
    public String q = null;
    public boolean s = false;
    public HashMap<String, Object> t = null;
    public Map<String, String> u = null;
    public Map<String, Object> v = null;
    private String w = null;
    private Map<String, Object> y = Collections.synchronizedMap(new HashMap());

    static {
        kge.a(1847211943);
    }

    public abstract HashMap<String, Object> b();

    public String c() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.w) && (map = this.v) != null && map.size() > 0) {
            this.w = new JSONObject(this.v).toJSONString();
        }
        return this.w;
    }

    public Map<String, Object> a() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        this.x = Collections.synchronizedMap(new HashMap());
        this.x.put("sessionId", j.a(this.b));
        this.x.put("bizId", j.a(this.c));
        this.x.put("scene", j.a(this.d));
        this.x.put("createTime", Long.valueOf(this.e));
        this.x.put(StWindow.UPDATE_TIME, Long.valueOf(this.f));
        this.x.put("userId", j.a(dsj.f26943a));
        this.x.put("actionType", j.a(this.h));
        this.x.put("actionName", j.a(this.i));
        this.x.put("actionDuration", Long.valueOf(this.j));
        this.x.put(e.ACTION_ARGS, j.a(this.k));
        Map<String, String> map = this.u;
        if (map != null && map.size() > 0) {
            if (dro.m()) {
                a2 = j.a(j.e(this.v));
            } else {
                a2 = j.a(j.b(this.u));
            }
        } else {
            a2 = j.a(this.l);
        }
        this.x.put(e.BIZ_ARGS, a2.replace("'", "''"));
        this.x.put(aw.PARAM_IS_FIRST_ENTER, Integer.valueOf(this.s ? 1 : 0));
        this.x.put("fromScene", j.a(this.m));
        this.x.put("toScene", j.a(this.n));
        this.x.put("reserve1", j.a(this.o));
        this.x.put("reserve2", j.a(this.p));
        this.x.put("periodSessionId", dsh.a().b());
        HashMap<String, Object> hashMap = this.t;
        if (hashMap != null && hashMap.size() > 0) {
            this.x.putAll(this.t);
        }
        this.x.put("bizArgKVS", j.a(this.w));
        HashMap<String, Object> b = b();
        if (b != null && b.size() > 0) {
            this.x.putAll(b);
        }
        return this.x;
    }
}
