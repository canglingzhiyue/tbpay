package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGConstantsTypeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ilh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f29136a;
    private Map<String, String> b;
    private Map<String, String> c;
    private Context d;

    static {
        kge.a(133401675);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.d = context;
        this.f29136a = a();
        this.b = c();
        this.c = b();
    }

    private Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RGConstantsTypeInfo.CPU_CORE_NUM, String.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("cpuName", String.valueOf(ils.a()));
        hashMap.put("cpuArch", String.valueOf(ils.a(this.d)));
        return hashMap;
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RGConstantsTypeInfo.STORAGE_SIZE, ils.b(this.d));
        return hashMap;
    }

    private Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RGConstantsTypeInfo.MEMORY_MAX_SIZE, ils.b());
        return hashMap;
    }

    private Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        Map<String, String> map = this.f29136a;
        if (map != null && !map.isEmpty()) {
            return this.f29136a;
        }
        this.f29136a = a();
        return this.f29136a;
    }

    private Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        Map<String, String> map = this.b;
        if (map != null && !map.isEmpty()) {
            return this.b;
        }
        this.b = c();
        return this.b;
    }

    private Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        Map<String, String> map = this.c;
        if (map != null && !map.isEmpty()) {
            return this.c;
        }
        this.c = b();
        return this.c;
    }

    public Map<String, String> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return d();
        }
        if (i == 2) {
            return e();
        }
        if (i == 6) {
            return f();
        }
        ilt.a("DeviceInfoProvider", "provide unknown type:" + i);
        return Collections.emptyMap();
    }
}
