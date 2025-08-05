package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.b;
import com.taobao.android.weex_framework.h;
import com.taobao.android.weex_plugin.component.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes6.dex */
public class jwn implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final jwn b = new jwn();

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Map<Integer, a>> f29834a = new HashMap();

    public static jwn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwn) ipChange.ipc$dispatch("f06a07d", new Object[0]) : b;
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa295853", new Object[]{this, weexInstance, new Integer(i), jSONObject});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        a aVar = new a();
        aVar.a(weexInstance, jSONObject);
        if (this.f29834a.get(Integer.valueOf(instanceId)) == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i), aVar);
            this.f29834a.put(Integer.valueOf(instanceId), hashMap);
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).put(Integer.valueOf(i), aVar);
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71504a3d", new Object[]{this, weexInstance, new Integer(i), bVar, bVar2});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a(weexInstance, i, bVar, bVar2);
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25a5e3d", new Object[]{this, weexInstance, new Integer(i)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a();
    }

    @Override // com.taobao.android.weex_framework.h
    public void b(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a546c79c", new Object[]{this, weexInstance, new Integer(i)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).b();
        this.f29834a.get(Integer.valueOf(instanceId)).remove(Integer.valueOf(i));
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d52c7", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a(weexInstance, str);
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f1dc66", new Object[]{this, weexInstance, new Integer(i), new Integer(i2)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a(i2);
    }

    @Override // com.taobao.android.weex_framework.h
    public int c(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("683330ee", new Object[]{this, weexInstance, new Integer(i)})).intValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (!a(instanceId, i)) {
            return this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).c();
        }
        return 0;
    }

    @Override // com.taobao.android.weex_framework.h
    public long d(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b1f9a4e", new Object[]{this, weexInstance, new Integer(i)})).longValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (!a(instanceId, i)) {
            return this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).d();
        }
        return 0L;
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f21c37", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a(z);
    }

    @Override // com.taobao.android.weex_framework.h
    public boolean e(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee0c03bd", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (!a(instanceId, i)) {
            return this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).e();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.h
    public boolean f(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0f86d1c", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (!a(instanceId, i)) {
            return this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).f();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.h
    public boolean g(WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e4d67b", new Object[]{this, weexInstance, new Integer(i)})).booleanValue();
        }
        int instanceId = weexInstance.getInstanceId();
        if (!a(instanceId, i)) {
            return this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).g();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.h
    public void b(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392deb8", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).b(z);
    }

    @Override // com.taobao.android.weex_framework.h
    public void c(WeexInstance weexInstance, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e33a139", new Object[]{this, weexInstance, new Integer(i), new Boolean(z)});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).c(z);
    }

    @Override // com.taobao.android.weex_framework.h
    public void b(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685bc266", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).a(str);
    }

    @Override // com.taobao.android.weex_framework.h
    public void c(WeexInstance weexInstance, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9a3205", new Object[]{this, weexInstance, new Integer(i), str});
            return;
        }
        int instanceId = weexInstance.getInstanceId();
        if (a(instanceId, i)) {
            return;
        }
        this.f29834a.get(Integer.valueOf(instanceId)).get(Integer.valueOf(i)).b(str);
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : this.f29834a.get(Integer.valueOf(i)) == null || this.f29834a.get(Integer.valueOf(i)).get(Integer.valueOf(i2)) == null;
    }

    @Override // com.taobao.android.weex_framework.h
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f29834a.get(Integer.valueOf(i)) != null) {
            HashMap hashMap = new HashMap();
            for (Integer num : new HashSet()) {
                if (hashMap.get(num) != null) {
                    ((a) hashMap.get(num)).b();
                    hashMap.remove(num);
                }
            }
            this.f29834a.remove(Integer.valueOf(i));
        }
    }
}
