package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ab;
import com.taobao.android.dinamicx.ac;
import com.taobao.android.dinamicx.ad;
import com.taobao.android.dinamicx.aq;
import com.taobao.android.dinamicx.av;
import com.taobao.android.dinamicx.aw;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class fpw extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_ASYNC_RENDER = 3;
    public static final int MSG_BATCH_RENDER = 9;
    public static final int MSG_CACHE_MONITOR = 8;
    public static final int MSG_CANCEL_PREFETCH_SIMPLE = 11;
    public static final int MSG_CANCEL_PREFETCH_TASK = 7;
    public static final int MSG_CLEAR_COMPLETED_SIMPLE_TASKS = 13;
    public static final int MSG_CLEAR_EXECUTOR_TASKS = 4;
    public static final int MSG_CLEAR_SIMPLE_TASKS = 12;
    public static final int MSG_CLEAR_TASKS = 5;
    public static final int MSG_PREFETCH = 2;
    public static final int MSG_PREFETCH_SIMPLE = 10;
    public static final int MSG_PRE_RENDER = 1;
    public static final int MSG_REMOVE_COMPLETED_TASK = 14;
    public static final int MSG_REMOVE_COMPLETED_TASK_VALUE = 15;
    public static final int MSG_RESTORE_EXECUTOR_TASKS = 6;
    private int c;
    private int d;
    private int e;
    private int f;
    private HashMap<String, ad> g;
    private HashMap<String, aq> h;
    private boolean i;
    private a j;

    static {
        kge.a(-362610049);
    }

    public static /* synthetic */ Object ipc$super(fpw fpwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(fpw fpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9049ecb", new Object[]{fpwVar});
        } else {
            fpwVar.p();
        }
    }

    public static /* synthetic */ void b(fpw fpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d787a54c", new Object[]{fpwVar});
        } else {
            fpwVar.o();
        }
    }

    public static /* synthetic */ void c(fpw fpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60aabcd", new Object[]{fpwVar});
        } else {
            fpwVar.r();
        }
    }

    public static /* synthetic */ void d(fpw fpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48db24e", new Object[]{fpwVar});
        } else {
            fpwVar.t();
        }
    }

    public static /* synthetic */ void e(fpw fpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a310b8cf", new Object[]{fpwVar});
        } else {
            fpwVar.q();
        }
    }

    public fpw(r rVar) {
        super(rVar);
        this.c = -1;
        try {
            this.j = new a(this, fxe.b().getLooper());
        } catch (Throwable th) {
            this.j = new a(this, Looper.getMainLooper());
            b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_ASYNC_RENDER, DXMonitorConstant.DX_ASYNC_RENDER_INIT_CRASH, s.V3_ASYNC_RENDER_INIT_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public void a(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, fzm fzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4431d1f", new Object[]{this, dXRuntimeContext, dXRenderOptions, awVar, abVar, fzmVar});
            return;
        }
        if (this.g == null) {
            this.g = new HashMap<>(100);
        }
        if (this.g.containsKey(dXRuntimeContext.t())) {
            return;
        }
        if (this.c == -1) {
            this.c = 0;
        }
        ad adVar = new ad(dXRuntimeContext, dXRenderOptions, awVar, abVar, this.b, fzmVar);
        fxe.a(new e(2, adVar));
        this.g.put(dXRuntimeContext.t(), adVar);
        this.c++;
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public void b(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, fzm fzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb41dfe", new Object[]{this, dXRuntimeContext, dXRenderOptions, awVar, abVar, fzmVar});
        } else {
            fxe.c(new e(0, new ac(dXRuntimeContext, dXRenderOptions, awVar, abVar, this.b, fzmVar)));
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c881a7", new Object[]{this, dXRuntimeContext, dXRenderOptions});
        } else {
            fxe.c(new e(0, new av(dXRuntimeContext, dXRenderOptions)));
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.obj = runnable;
        this.j.sendMessage(obtain);
    }

    public void a(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, ab abVar, View view, fpv<DXRuntimeContext> fpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f90af4", new Object[]{this, dXRuntimeContext, dXRenderOptions, abVar, view, fpvVar});
            return;
        }
        if (this.h == null) {
            this.h = new HashMap<>();
        }
        String i = i(dXRuntimeContext);
        if (this.h.containsKey(i)) {
            return;
        }
        aq aqVar = new aq(dXRuntimeContext, dXRenderOptions, this.b, abVar, view, fpvVar);
        fxe.b(new e(2, aqVar));
        this.h.put(i, aqVar);
    }

    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else {
            g(dXRuntimeContext);
        }
    }

    public void b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07f39a", new Object[]{this, dXRuntimeContext});
        } else {
            h(dXRuntimeContext);
        }
    }

    private void g(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbf885f", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    private void h(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214aa620", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 11;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public void c(DXRuntimeContext dXRuntimeContext) {
        ad adVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93115b", new Object[]{this, dXRuntimeContext});
            return;
        }
        this.e++;
        HashMap<String, ad> hashMap = this.g;
        if (hashMap == null || (adVar = hashMap.get(dXRuntimeContext.t())) == null) {
            return;
        }
        if (!adVar.h) {
            adVar.g.a(true);
            adVar.h = true;
            this.d++;
        } else if (adVar.g.f()) {
        } else {
            this.f++;
        }
    }

    public void d(DXRuntimeContext dXRuntimeContext) {
        aq remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131e2f1c", new Object[]{this, dXRuntimeContext});
            return;
        }
        HashMap<String, aq> hashMap = this.h;
        if (hashMap == null || (remove = hashMap.remove(i(dXRuntimeContext))) == null) {
            return;
        }
        remove.e();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h != null) {
            HashSet<String> hashSet = new HashSet();
            for (Map.Entry<String, aq> entry : this.h.entrySet()) {
                if (entry.getValue().b) {
                    hashSet.add(entry.getKey());
                }
            }
            for (String str : hashSet) {
                this.h.remove(str);
            }
        }
    }

    public void e(DXRuntimeContext dXRuntimeContext) {
        String t;
        ad adVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a94cdd", new Object[]{this, dXRuntimeContext});
        } else if (this.g == null || dXRuntimeContext == null || (adVar = this.g.get((t = dXRuntimeContext.t()))) == null || !adVar.h) {
        } else {
            this.g.remove(t);
        }
    }

    public void j(DXRuntimeContext dXRuntimeContext) {
        String t;
        ad adVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a860e1a2", new Object[]{this, dXRuntimeContext});
        } else if (this.g == null || dXRuntimeContext == null || (adVar = this.g.get((t = dXRuntimeContext.t()))) == null || !adVar.h) {
        } else {
            this.g.put(t, null);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        this.j.sendMessage(obtain);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 5;
        this.j.sendMessage(obtain);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 12;
        this.j.sendMessage(obtain);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        this.j.sendMessage(obtain);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 13;
        this.j.sendMessage(obtain);
    }

    public void f(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a346a9e", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 14;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    public void k(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebebff63", new Object[]{this, dXRuntimeContext});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 15;
        obtain.obj = dXRuntimeContext;
        this.j.sendMessage(obtain);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.i = true;
        fxe.c();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        HashMap<String, ad> hashMap = this.g;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        HashMap<String, aq> hashMap = this.h;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.i) {
            HashMap<String, ad> hashMap = this.g;
            if (hashMap != null) {
                for (ad adVar : hashMap.values()) {
                    if (!adVar.h) {
                        fxe.a(new e(2, adVar));
                    }
                }
            }
            HashMap<String, aq> hashMap2 = this.h;
            if (hashMap2 != null) {
                for (aq aqVar : hashMap2.values()) {
                    if (!aqVar.b) {
                        fxe.b(new e(2, aqVar));
                    }
                }
            }
            this.i = false;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c == -1) {
        } else {
            k();
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 8;
        this.j.sendMessage(obtain);
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i == 0) {
            return;
        }
        if (i > 0) {
            float f = (i - this.d) / i;
            HashMap hashMap = new HashMap();
            hashMap.put("totalNum", String.valueOf(this.c));
            hashMap.put("cancelNum", String.valueOf(this.d));
            hashMap.put("fillRate", String.valueOf(f));
            b.a(0, this.f11887a, "PreRender", "PreRender_FillRate", hashMap);
            fuw.b("DXAsyncRenderManager", "任务填充率=" + f + "预加载任务创建=" + this.c + "任务取消=" + this.d);
        }
        int i2 = this.e;
        if (i2 > 0) {
            float f2 = this.f / i2;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("totalNum", String.valueOf(this.e));
            hashMap2.put("hitNum", String.valueOf(this.f));
            hashMap2.put("hitRate", String.valueOf(f2));
            b.a(0, this.f11887a, "PreRender", "PreRender_HitRate", hashMap2);
            fuw.b("DXAsyncRenderManager", "缓存命中率=" + f2 + "模板渲染调用次数=" + this.e + "缓存命中的调用次数=" + this.f);
        }
        if (b().d() > 0) {
            float d = this.c / b().d();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("maxNum", String.valueOf(b().d()));
            HashMap<String, ad> hashMap4 = this.g;
            hashMap3.put("taskNum", String.valueOf(hashMap4 != null ? hashMap4.size() : 0));
            hashMap3.put("hitRate", String.valueOf(d));
            b.a(0, this.f11887a, "PreRender", "PreRender_OccupationRate", hashMap3);
            fuw.b("DXAsyncRenderManager", "缓存利用率=" + d + "缓存最大个数限制=" + b().d() + "预加载的创建任务=" + this.c);
        }
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c == -1) {
        } else {
            s();
            k();
            l();
            m();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.c == -1) {
        } else {
            n();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.c == -1) {
        } else {
            s();
            k();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<fpw> f28108a;

        static {
            kge.a(1669359604);
        }

        public a(fpw fpwVar, Looper looper) {
            super(looper);
            this.f28108a = new WeakReference<>(fpwVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null) {
            } else {
                fpw fpwVar = this.f28108a.get();
                if (fpwVar == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                try {
                    switch (message.what) {
                        case 1:
                            ((Runnable) message.obj).run();
                            return;
                        case 2:
                            ((Runnable) message.obj).run();
                            return;
                        case 3:
                        default:
                            return;
                        case 4:
                            fpw.b(fpwVar);
                            return;
                        case 5:
                            fpw.a(fpwVar);
                            return;
                        case 6:
                            fpw.c(fpwVar);
                            return;
                        case 7:
                            fpwVar.c((DXRuntimeContext) message.obj);
                            return;
                        case 8:
                            fpw.d(fpwVar);
                            return;
                        case 9:
                            ((Runnable) message.obj).run();
                            return;
                        case 10:
                            ((Runnable) message.obj).run();
                            return;
                        case 11:
                            fpwVar.d((DXRuntimeContext) message.obj);
                            return;
                        case 12:
                            fpw.e(fpwVar);
                            return;
                        case 13:
                            fpwVar.d();
                            return;
                        case 14:
                            fpwVar.e((DXRuntimeContext) message.obj);
                            return;
                        case 15:
                            fpwVar.j((DXRuntimeContext) message.obj);
                            return;
                    }
                } catch (Throwable th) {
                    com.taobao.android.dinamicx.exception.a.b(th);
                }
            }
        }
    }

    private String i(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7a4edf", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext.d() instanceof com.taobao.android.dinamicx.widget.ac) {
            return dXRuntimeContext.u();
        }
        return dXRuntimeContext.t();
    }
}
