package com.taobao.android.behavir;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.task.d;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.algo.NativeAlgo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1507006958);
    }

    public static /* synthetic */ void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
        } else {
            b(jSONObject, z);
        }
    }

    public static void a(String str, Map<String, Object> map, boolean z, d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22ebe56", new Object[]{str, map, new Boolean(z), dVar, new Integer(i)});
            return;
        }
        a aVar = new a(dVar, str, map);
        if (i > 0) {
            com.taobao.android.behavix.utils.e.a().postDelayed(aVar, i);
        }
        if (NativeAlgo.isEnableNativeAlgo(str)) {
            NativeAlgo.run(str, map, aVar);
        } else if (z) {
            com.taobao.android.behavix.task.e.b("BehaviR", str, map, aVar);
        } else {
            com.taobao.android.behavix.task.e.a("BehaviR", str, map, aVar);
        }
    }

    private static void b(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137a1f8d", new Object[]{jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("success", (Object) Boolean.valueOf(z));
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends i.a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicBoolean f9138a = new AtomicBoolean(false);
        private final d b;
        private final String c;
        private final Map<String, Object> d;

        static {
            kge.a(-1885357513);
            kge.a(-1281609071);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(d dVar, String str, Map<String, Object> map) {
            this.b = dVar;
            this.c = str;
            this.d = map;
        }

        @Override // com.taobao.android.behavix.task.d
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            } else if (this.f9138a.getAndSet(true)) {
            } else {
                e.a(jSONObject, true);
                this.b.a(str, jSONObject);
                LogUtils.c("PythonExecutor", this.c, "success");
            }
        }

        @Override // com.taobao.android.behavix.task.d
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            } else if (this.f9138a.getAndSet(true)) {
            } else {
                b(str, str2, str3, jSONObject);
            }
        }

        private void b(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c839ac9", new Object[]{this, str, str2, str3, jSONObject});
                return;
            }
            e.a(jSONObject, false);
            this.b.a(str, str2, str3, jSONObject);
            LogUtils.c("PythonExecutor", this.c, "error", str2, str3);
        }

        @Override // com.taobao.android.behavix.utils.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.f9138a.getAndSet(true)) {
            } else {
                b(this.c, "timeout", "timeout", g.a("code", 1001, "error", g.a("code", (Object) 1001), "model", g.a("input", this.d, "name", this.c)));
            }
        }
    }
}
