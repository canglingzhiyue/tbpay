package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.qnw;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f22223a;
    private final o b;
    private qnw c;
    private final a d;
    private final l e;
    private final ThreadPoolExecutor f;
    private final com.alibaba.poplayer.utils.i g;

    /* loaded from: classes8.dex */
    public interface a {
        View a(StateModel stateModel, StateVersionModel stateVersionModel);

        void a(Rect rect);

        void a(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list);

        void a(j jVar);

        void a(String str, String str2);

        void a(String str, String str2, String str3);

        void a(String str, String str2, boolean z, j jVar);

        boolean a(List<String> list, List<String> list2, boolean z, boolean z2);

        String b(String str);

        void b();

        boolean b(String str, String str2);

        void c();

        void e();

        void f();

        void g();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onPreCloseDone(boolean z);
    }

    static {
        kge.a(-277117835);
    }

    public e(Context context, Handler handler, int i, a aVar) {
        this.g = new com.alibaba.poplayer.utils.i(context, com.taobao.android.autosize.h.a().b(context), i == 0);
        this.f22223a = new d(context, handler, i);
        this.d = aVar;
        this.e = new l();
        this.b = new o(this);
        this.f = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new f.a("NativePopEngineSingleThreadPool"));
        this.f.allowCoreThreadTimeOut(true);
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1563b20d", new Object[]{this}) : this.f22223a;
    }

    public void a(qnw qnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbadbe9e", new Object[]{this, qnwVar});
        } else {
            this.c = qnwVar;
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (StringUtils.isEmpty(str) || jSONObject == null) {
        } else {
            this.f22223a.f().put(str.replaceAll("[$]", ""), (Object) jSONObject);
        }
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || jSONObject == null) {
        } else {
            String replaceAll = str.replaceAll("[$]", "");
            String replaceAll2 = str2.replaceAll("[$]", "");
            JSONObject f = this.f22223a.f();
            JSONObject jSONObject2 = f.getJSONObject(replaceAll);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put(replaceAll2, (Object) jSONObject);
            f.put(replaceAll, (Object) jSONObject2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a(this.f22223a.e());
        }
    }

    public com.alibaba.poplayer.utils.i l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.poplayer.utils.i) ipChange.ipc$dispatch("c7bcc955", new Object[]{this}) : this.g;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        if (this.f22223a.i() <= 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.f22223a.i();
    }

    public qnw d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qnw) ipChange.ipc$dispatch("261e9e81", new Object[]{this}) : this.c;
    }

    public l e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("32f88781", new Object[]{this}) : this.e;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.f22223a.b().post(runnable);
            }
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else if (i > 0) {
                this.f22223a.b().postDelayed(runnable, j);
            } else {
                this.f22223a.b().post(runnable);
            }
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            this.f.execute(runnable);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.d.f();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.d.g();
        }
    }

    public void a(String str, String str2, boolean z, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae22edf1", new Object[]{this, str, str2, new Boolean(z), jVar});
        } else {
            this.d.a(str, str2, z, jVar);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.d.c();
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.d.a(str, str2);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            this.d.a(str, str2, str3);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.d.b();
        }
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb765981", new Object[]{this, jVar});
        } else {
            this.d.a(jVar);
        }
    }

    public void a(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a42395", new Object[]{this, componentBaseModel, str, actionModel, list});
        } else {
            this.d.a(componentBaseModel, str, actionModel, list);
        }
    }

    public boolean a(List<String> list, List<String> list2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("633e544e", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue() : this.d.a(list, list2, z, z2);
    }

    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel}) : this.d.a(stateModel, stateVersionModel);
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue() : this.d.b(str, str2);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.d.b(str);
    }

    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
        } else {
            this.d.a(rect);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0097, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<com.taobao.tbpoplayer.nativerender.dsl.StateModel, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel> b(java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.e.b(java.util.List, java.util.List, boolean, boolean):android.util.Pair");
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateIndex", (Object) Integer.valueOf(this.f22223a.o()));
        jSONObject.put("stateId", (Object) this.f22223a.m());
        jSONObject.put("stateVerId", (Object) this.f22223a.n());
        return jSONObject;
    }
}
