package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import com.taobao.muniontaobaosdk.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26778a = new HashMap();
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private Map<String, String> d = new HashMap();
    private Application e;
    private String f;

    static {
        kge.a(704047953);
    }

    public dic(Application application, String str) {
        this.e = application;
        this.f = str;
    }

    public dic a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dic) ipChange.ipc$dispatch("7c6e5956", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f26778a.put("namespace", str);
        }
        return this;
    }

    public dic a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dic) ipChange.ipc$dispatch("24af250b", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26778a.put(TanxArgNames.UT_ARGS.getKey(), b.b(map));
            this.c = map;
        }
        return this;
    }

    public dic b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dic) ipChange.ipc$dispatch("5e0035cc", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26778a.put(TanxArgNames.MONITOR_ARGS.getKey(), b.b(map));
            this.b = map;
        }
        return this;
    }

    public dic c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dic) ipChange.ipc$dispatch("9751468d", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f26778a.put(TanxArgNames.MACRO_ARGS.getKey(), b.b(map));
            this.d = map;
        }
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new did(this.f, this.f26778a, this.b, this.d).a();
        }
    }
}
