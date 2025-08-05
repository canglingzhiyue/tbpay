package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import com.taobao.muniontaobaosdk.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dhy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26770a = new HashMap();
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private String d;

    static {
        kge.a(-1764241267);
    }

    public dhy(String str) {
        this.d = str;
    }

    public dhy a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhy) ipChange.ipc$dispatch("7c6e583f", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f26770a.put("namespace", str);
        }
        return this;
    }

    public dhy a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhy) ipChange.ipc$dispatch("24af23f4", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26770a.put(TanxArgNames.UT_ARGS.getKey(), b.b(map));
            this.c = map;
        }
        return this;
    }

    public dhy b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhy) ipChange.ipc$dispatch("5e0034b5", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26770a.put(TanxArgNames.MONITOR_ARGS.getKey(), b.b(map));
            this.b = map;
        }
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new dhz(this.d, this.f26770a, this.b).a();
        }
    }
}
