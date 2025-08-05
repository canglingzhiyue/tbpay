package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.n;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mnz implements njg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private n f31153a = null;

    public mnz() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m a2 = f.a(a.IMAGE_STAGE_DISPATCHER);
        if (!(a2 instanceof n)) {
            return;
        }
        this.f31153a = (n) a2;
    }

    @Override // tb.njg
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        if (!f.a(this.f31153a)) {
            this.f31153a.a(0);
        }
        try {
            HashMap hashMap = new HashMap(map);
            hashMap.put("procedureName", "ImageLib");
            hashMap.put("stage", "onRequest");
            hashMap.put(e.REQUEST_ID, str);
            hashMap.put("requestUrl", str2);
            a(hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.njg
    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        if (!f.a(this.f31153a)) {
            this.f31153a.a(2);
        }
        HashMap hashMap = new HashMap(map);
        hashMap.put("procedureName", "ImageLib");
        hashMap.put("stage", "onError");
        hashMap.put(e.REQUEST_ID, str);
        hashMap.put("requestUrl", str2);
        a(hashMap);
    }

    @Override // tb.njg
    public void c(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
            return;
        }
        if (!f.a(this.f31153a)) {
            this.f31153a.a(1);
        }
        HashMap hashMap = new HashMap(map);
        hashMap.put("procedureName", "ImageLib");
        hashMap.put("stage", "onFinished");
        hashMap.put(e.REQUEST_ID, str);
        hashMap.put("requestUrl", str2);
        a(hashMap);
    }

    @Override // tb.njg
    public void d(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b91f26", new Object[]{this, str, str2, map});
            return;
        }
        String str3 = null;
        if (map != null) {
            str3 = mqe.a(map.get("requestUrl"), "");
        }
        HashMap hashMap = new HashMap(map);
        hashMap.put("procedureName", "ImageLib");
        hashMap.put("stage", str2);
        hashMap.put(e.REQUEST_ID, str);
        hashMap.put("requestUrl", str3);
        a(hashMap);
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!d.e) {
        } else {
            mpi.c("image", map);
        }
    }
}
