package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import com.taobao.muniontaobaosdk.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26774a = new HashMap();
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private Application d;
    private String e;

    static {
        kge.a(785515653);
    }

    public dia(Application application, String str) {
        this.d = application;
        this.e = str;
    }

    public dia a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dia) ipChange.ipc$dispatch("7c6e5918", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f26774a.put("namespace", str);
        }
        return this;
    }

    public dia a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dia) ipChange.ipc$dispatch("24af24cd", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26774a.put(TanxArgNames.UT_ARGS.getKey(), b.b(map));
            this.c = map;
        }
        return this;
    }

    public dia b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dia) ipChange.ipc$dispatch("5e00358e", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26774a.put(TanxArgNames.MONITOR_ARGS.getKey(), b.b(map));
            this.b = map;
        }
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new dib(this.e, this.f26774a, this.b).a();
        }
    }
}
