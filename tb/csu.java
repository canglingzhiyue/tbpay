package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.perf.b;
import com.taobao.android.tracker.util.e;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class csu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26498a;
    private long b;
    private long c;
    private long d;
    private long e;
    private boolean f = true;
    private boolean g = false;

    static {
        kge.a(800763216);
        f26498a = false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = System.currentTimeMillis();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g) {
        } else {
            this.c = System.currentTimeMillis();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g) {
        } else {
            this.g = true;
            this.d = System.currentTimeMillis();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = System.currentTimeMillis();
        f();
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (f26498a) {
        } else {
            f26498a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("startDetect");
            arrayList.add("detect");
            arrayList.add(e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP);
            arrayList.add("total");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("model_config");
            arrayList2.add("query_correct");
            arrayList2.add("intelli_optimize");
            arrayList2.add("retry");
            cox.a(b.MODULE_CHAIN, "camera_model_cost", arrayList, arrayList2);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.f) {
        } else {
            this.f = false;
            e();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("startDetect", Double.valueOf(this.c - this.b));
            hashMap.put("detect", Double.valueOf(this.d - this.c));
            hashMap.put(e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Double.valueOf(this.e - this.d));
            hashMap.put("total", Double.valueOf(this.e - this.b));
            hashMap2.put("model_config", com.etao.feimagesearch.config.b.a(false));
            hashMap2.put("query_correct", String.valueOf(false));
            hashMap2.put("intelli_optimize", "true");
            hashMap2.put("retry", String.valueOf(com.etao.feimagesearch.config.b.ab()));
            cox.a(b.MODULE_CHAIN, "camera_model_cost", hashMap, hashMap2);
        }
    }
}
