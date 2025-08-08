package com.taobao.falco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.Choreographer;
import android.view.KeyEvent;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dis;
import tb.dit;
import tb.nkx;
import tb.rhd;
import tb.sfn;
import tb.shc;
import tb.slo;
import tb.slx;
import tb.spq;
import tb.tgx;
import tb.tij;
import tb.tpr;
import tb.xmu;

/* loaded from: classes7.dex */
public class FalcoLoadActionMonitor implements a.b, a.d, r.a, nkx.a, slx.a, tpr.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private tij c;
    private rhd d;
    private Handler f;
    private String g;
    private String i;
    private sfn n;
    private nkx o;
    private xmu p;

    /* renamed from: a  reason: collision with root package name */
    private Stack<a> f17108a = new Stack<>();
    private Map<Integer, slo> b = new ConcurrentHashMap();
    private List<Integer> e = new CopyOnWriteArrayList();
    private long k = 0;
    private float l = 0.0f;
    private float m = 0.0f;
    private int h = -1;
    private boolean j = false;

    /* loaded from: classes7.dex */
    public static class LoadRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FalcoLoadActionMonitor f17112a;
        public final int b;
        public final Object[] c;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes7.dex */
        @interface Definition {
        }

        public LoadRunnable(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, Object... objArr) {
            this.f17112a = falcoLoadActionMonitor;
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.b) {
                case 0:
                    FalcoLoadActionMonitor falcoLoadActionMonitor = this.f17112a;
                    Object[] objArr = this.c;
                    FalcoLoadActionMonitor.a(falcoLoadActionMonitor, (String) objArr[0], (String) objArr[1], ((Long) objArr[2]).longValue(), ((Float) this.c[3]).floatValue(), ((Float) this.c[4]).floatValue());
                    return;
                case 1:
                    FalcoLoadActionMonitor falcoLoadActionMonitor2 = this.f17112a;
                    Object[] objArr2 = this.c;
                    FalcoLoadActionMonitor.b(falcoLoadActionMonitor2, (String) objArr2[0], (String) objArr2[1], ((Long) objArr2[2]).longValue(), ((Float) this.c[3]).floatValue(), ((Float) this.c[4]).floatValue());
                    return;
                case 2:
                    FalcoLoadActionMonitor.a(this.f17112a, ((Long) this.c[0]).longValue());
                    return;
                case 3:
                    FalcoLoadActionMonitor falcoLoadActionMonitor3 = this.f17112a;
                    Object[] objArr3 = this.c;
                    FalcoLoadActionMonitor.a(falcoLoadActionMonitor3, (String) objArr3[0], (String) objArr3[1], ((Integer) objArr3[2]).intValue(), ((Long) this.c[3]).longValue(), ((Long) this.c[4]).longValue(), ((Long) this.c[5]).longValue());
                    return;
                case 4:
                    FalcoLoadActionMonitor.a(this.f17112a, ((Integer) this.c[0]).intValue(), ((Long) this.c[1]).longValue());
                    return;
                case 5:
                    FalcoLoadActionMonitor.a(this.f17112a, ((Integer) this.c[0]).intValue(), ((Long) this.c[1]).longValue(), ((Long) this.c[2]).longValue(), ((Long) this.c[3]).longValue());
                    return;
                case 6:
                    FalcoLoadActionMonitor falcoLoadActionMonitor4 = this.f17112a;
                    Object[] objArr4 = this.c;
                    FalcoLoadActionMonitor.a(falcoLoadActionMonitor4, (String) objArr4[0], ((Long) objArr4[1]).longValue());
                    return;
                case 7:
                    FalcoLoadActionMonitor falcoLoadActionMonitor5 = this.f17112a;
                    Object[] objArr5 = this.c;
                    FalcoLoadActionMonitor.b(falcoLoadActionMonitor5, (String) objArr5[0], ((Long) objArr5[1]).longValue());
                    return;
                case 8:
                    FalcoLoadActionMonitor.b(this.f17112a, ((Integer) this.c[0]).intValue(), ((Long) this.c[1]).longValue());
                    return;
                case 9:
                    FalcoLoadActionMonitor.a(this.f17112a, (shc.a) this.c[0]);
                    return;
                case 10:
                    FalcoLoadActionMonitor.a(this.f17112a, (tgx.a) this.c[0]);
                    return;
                case 11:
                    FalcoLoadActionMonitor.c(this.f17112a, ((Integer) this.c[0]).intValue(), ((Long) this.c[1]).longValue());
                    return;
                case 12:
                    FalcoLoadActionMonitor.a(this.f17112a);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f17113a;
        public String b;
        public String c;
        public String d;
        public String e;

        private a() {
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9dd973", new Object[]{falcoLoadActionMonitor});
        } else {
            falcoLoadActionMonitor.d();
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9bacd4", new Object[]{falcoLoadActionMonitor, new Integer(i), new Long(j)});
        } else {
            falcoLoadActionMonitor.a(i, j);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a372a054", new Object[]{falcoLoadActionMonitor, new Integer(i), new Long(j), new Long(j2), new Long(j3)});
        } else {
            falcoLoadActionMonitor.a(i, j, j2, j3);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81dcbb1", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.a(j);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, Activity activity, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3bf66", new Object[]{falcoLoadActionMonitor, activity, new Integer(i), new Long(j)});
        } else {
            falcoLoadActionMonitor.a(activity, i, j);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca00b905", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.b(fragment, j);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8d59e7", new Object[]{falcoLoadActionMonitor, str, new Long(j)});
        } else {
            falcoLoadActionMonitor.a(str, j);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, String str2, int i, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f36de8", new Object[]{falcoLoadActionMonitor, str, str2, new Integer(i), new Long(j), new Long(j2), new Long(j3)});
        } else {
            falcoLoadActionMonitor.a(str, str2, i, j, j2, j3);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, String str2, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0bcb5d", new Object[]{falcoLoadActionMonitor, str, str2, new Long(j), new Float(f), new Float(f2)});
        } else {
            falcoLoadActionMonitor.a(str, str2, j, f, f2);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, shc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392a6c58", new Object[]{falcoLoadActionMonitor, aVar});
        } else {
            falcoLoadActionMonitor.b(aVar);
        }
    }

    public static /* synthetic */ void a(FalcoLoadActionMonitor falcoLoadActionMonitor, tgx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffb2301", new Object[]{falcoLoadActionMonitor, aVar});
        } else {
            falcoLoadActionMonitor.b(aVar);
        }
    }

    public static /* synthetic */ nkx b(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nkx) ipChange.ipc$dispatch("43b9d839", new Object[]{falcoLoadActionMonitor}) : falcoLoadActionMonitor.o;
    }

    public static /* synthetic */ void b(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55664eb3", new Object[]{falcoLoadActionMonitor, new Integer(i), new Long(j)});
        } else {
            falcoLoadActionMonitor.c(i, j);
        }
    }

    public static /* synthetic */ void b(FalcoLoadActionMonitor falcoLoadActionMonitor, Activity activity, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47942005", new Object[]{falcoLoadActionMonitor, activity, new Integer(i), new Long(j)});
        } else {
            falcoLoadActionMonitor.b(activity, i, j);
        }
    }

    public static /* synthetic */ void b(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f41ee4", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.c(fragment, j);
        }
    }

    public static /* synthetic */ void b(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4cd1e8", new Object[]{falcoLoadActionMonitor, str, new Long(j)});
        } else {
            falcoLoadActionMonitor.b(str, j);
        }
    }

    public static /* synthetic */ void b(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, String str2, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f838de", new Object[]{falcoLoadActionMonitor, str, str2, new Long(j), new Float(f), new Float(f2)});
        } else {
            falcoLoadActionMonitor.b(str, str2, j, f, f2);
        }
    }

    public static /* synthetic */ Handler c(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e9ff7275", new Object[]{falcoLoadActionMonitor}) : falcoLoadActionMonitor.f;
    }

    public static /* synthetic */ void c(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f30f092", new Object[]{falcoLoadActionMonitor, new Integer(i), new Long(j)});
        } else {
            falcoLoadActionMonitor.b(i, j);
        }
    }

    public static /* synthetic */ void c(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e784c3", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.d(fragment, j);
        }
    }

    public static /* synthetic */ void d(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63daeaa2", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.a(fragment, j);
        }
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.d = new rhd();
        this.f = new Handler(Looper.getMainLooper());
        this.j = dis.c();
        try {
            if (z2) {
                this.o = new nkx();
                this.o.a(this);
            } else {
                m a2 = com.taobao.monitor.impl.common.a.a(com.taobao.monitor.impl.common.a.WINDOW_EVENT_DISPATCHER);
                if (a2 != null) {
                    ALog.e("falco.LoadActionMonitor", "register windowDispatcher", null, new Object[0]);
                    a2.a(this);
                }
            }
            tpr.a().a(this);
            tpr.a().a(new b(this));
            c.a((a.d) this);
            c.a((IApmEventListener) this);
            if (z) {
                this.n = new sfn();
                this.n.a(this);
            }
            this.p = new xmu();
            this.p.a("falco.load_action");
        } catch (Throwable th) {
            ALog.e("falco.LoadActionMonitor", "registerPageMonitor error", null, th, new Object[0]);
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            c(activity, keyEvent, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else {
            c(activity, i, f, f2, j + c());
        }
    }

    @Override // tb.nkx.a
    public void b(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff009dc", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else {
            c(activity, i, f, f2, j);
        }
    }

    @Override // tb.nkx.a
    public void b(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd48f03", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            c(activity, keyEvent, j);
        }
    }

    private void c(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d8d21d", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (i != 0 && i != 1) {
        } else {
            String str = this.g;
            String dataString = activity != null ? activity.getIntent().getDataString() : "";
            if (i == 0) {
                dit.d(new LoadRunnable(this, 0, str, dataString, Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2)));
            } else if (1 != i) {
            } else {
                dit.d(new LoadRunnable(this, 1, str, dataString, Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2)));
            }
        }
    }

    private void c(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35facc4", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        int hashCode = activity.hashCode();
        if (action != 0 || keyCode != 4) {
            return;
        }
        dit.d(new LoadRunnable(this, 11, Integer.valueOf(hashCode), Long.valueOf(j)));
    }

    @Override // tb.slx.a
    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            dit.d(new LoadRunnable(this, 2, Long.valueOf(System.currentTimeMillis())));
        }
    }

    @Override // tb.tpr.a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String localClassName = activity.getLocalClassName();
        int hashCode = activity.hashCode();
        Intent intent = activity.getIntent();
        String str = null;
        long j2 = -1;
        if (intent != null) {
            str = intent.getDataString();
            j = intent.getLongExtra("NAV_TO_URL_START_UPTIME", -1L);
            j2 = intent.getLongExtra("NAV_START_ACTIVITY_UPTIME", -1L);
        } else {
            j = -1;
        }
        dit.d(new LoadRunnable(this, 3, localClassName, str, Integer.valueOf(hashCode), Long.valueOf(currentTimeMillis), Long.valueOf(j), Long.valueOf(j2)));
    }

    @Override // tb.tpr.a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            dit.d(new LoadRunnable(this, 4, Integer.valueOf(activity.hashCode()), Long.valueOf(System.currentTimeMillis())));
        }
    }

    @Override // tb.tpr.a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int hashCode = activity.hashCode();
        this.g = activity.getLocalClassName();
        this.h = hashCode;
        a(activity, hashCode, currentTimeMillis);
    }

    @Override // tb.tpr.a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        dit.d(new LoadRunnable(this, 8, Integer.valueOf(activity.hashCode()), Long.valueOf(System.currentTimeMillis())));
        nkx nkxVar = this.o;
        if (nkxVar == null) {
            return;
        }
        nkxVar.b(activity);
    }

    private void a(Fragment fragment, long j) {
        FragmentActivity activity;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1a4eba", new Object[]{this, fragment, new Long(j)});
            return;
        }
        int hashCode = fragment.hashCode();
        if (fragment.getActivity() == null) {
            str = fragment.getClass().getName();
        } else {
            str = activity.getLocalClassName() + "_" + fragment.getClass().getName();
        }
        dit.d(new LoadRunnable(this, 3, str, null, Integer.valueOf(hashCode), Long.valueOf(j), -1L, -1L));
    }

    private void b(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241b45fb", new Object[]{this, fragment, new Long(j)});
        } else {
            dit.d(new LoadRunnable(this, 4, Integer.valueOf(fragment.hashCode()), Long.valueOf(j)));
        }
    }

    private void c(Fragment fragment, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1c3d3c", new Object[]{this, fragment, new Long(j)});
            return;
        }
        final FragmentActivity activity = fragment.getActivity();
        final int hashCode = fragment.hashCode();
        if (activity == null) {
            this.g = fragment.getClass().getName();
        } else {
            this.g = activity.getLocalClassName() + "_" + fragment.getClass().getName();
        }
        this.h = hashCode;
        this.f.postAtFrontOfQueue(new Runnable() { // from class: com.taobao.falco.FalcoLoadActionMonitor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FalcoLoadActionMonitor.a(FalcoLoadActionMonitor.this, activity, hashCode, j);
                }
            }
        });
    }

    private void d(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61d347d", new Object[]{this, fragment, new Long(j)});
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.g = activity.getLocalClassName();
            this.h = activity.hashCode();
        }
        dit.d(new LoadRunnable(this, 8, Integer.valueOf(fragment.hashCode()), Long.valueOf(j)));
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i != 1) {
        } else {
            dit.d(new LoadRunnable(this, 12, new Object[0]));
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void a(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
            return;
        }
        long c = j + c();
        if (i == 2) {
            dit.d(new LoadRunnable(this, 6, str, Long.valueOf(c)));
        } else if (i != 3) {
        } else {
            dit.d(new LoadRunnable(this, 7, str, Long.valueOf(c)));
        }
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onPageVisible", null, "page", str, "time", Long.valueOf(j));
        slo sloVar = this.b.get(Integer.valueOf(this.h));
        if (sloVar == null) {
            return;
        }
        sloVar.l(Long.valueOf(j));
    }

    private void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onPageInteractive", null, "page", str, "time", Long.valueOf(j));
        slo sloVar = this.b.get(Integer.valueOf(this.h));
        if (sloVar == null) {
            return;
        }
        sloVar.m(Long.valueOf(j));
        this.p.b(sloVar.a());
        this.p.e(str);
        this.p.f(SceneIdentifier.getCurrentPageUrl());
        this.p.b();
    }

    private void a(String str, String str2, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9847ec8", new Object[]{this, str, str2, new Long(j), new Float(f), new Float(f2)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onTouchDown", null, "activity", str, "time", Long.valueOf(j));
        com.taobao.analysis.v3.r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return;
        }
        this.c = (tij) rVar.a(tgx.MODULE, "touch").a(j).aw_();
        this.c.j(str);
        this.c.k(str2);
        this.c.a(Long.valueOf(j));
        this.c.a(f, f2);
        shc a2 = a();
        if (a2 == null) {
            return;
        }
        this.c.m(a2.a());
    }

    private void b(String str, String str2, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c70e827", new Object[]{this, str, str2, new Long(j), new Float(f), new Float(f2)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onTouchUp", null, "activity", str, "time", Long.valueOf(j));
        a aVar = new a();
        aVar.f17113a = j;
        aVar.b = str;
        aVar.c = str2;
        aVar.d = f + "_" + f2;
        aVar.e = aVar.f17113a + "_" + aVar.d;
        this.f17108a.push(aVar);
        tij tijVar = this.c;
        if (tijVar != null && !tijVar.ds_()) {
            this.c.b(Long.valueOf(j));
            this.c.b(f, f2);
            this.c.l(a(j, f, f2));
            this.c.c();
        }
        this.p.c(str);
        this.p.d(str2);
        this.p.a();
    }

    private void b(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f791ca", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doKeyBack", null, "pageCode", Integer.valueOf(i), "time", Long.valueOf(j));
        slo sloVar = this.b.get(Integer.valueOf(i));
        if (sloVar == null) {
            return;
        }
        sloVar.r("back");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doBackground", null, new Object[0]);
        slo sloVar = (slo) a();
        if (sloVar == null) {
            return;
        }
        sloVar.r("F2B");
    }

    private String a(long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3960fc4", new Object[]{this, new Long(j), new Float(f), new Float(f2)});
        }
        if (this.k == 0) {
            this.k = j;
            this.l = f;
            this.m = f2;
            return String.valueOf(j);
        }
        float f3 = this.l;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float f5 = this.m;
        float f6 = f2 > f5 ? f2 - f5 : f5 - f2;
        if (j - this.k > 1000 || f4 > 20.0f || f6 > 20.0f) {
            this.k = j;
            this.l = f;
            this.m = f2;
        }
        return String.valueOf(this.k);
    }

    private void a(final Activity activity, final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca6035b", new Object[]{this, activity, new Integer(i), new Long(j)});
        } else {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.falco.FalcoLoadActionMonitor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j2)});
                        return;
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    FalcoLoadActionMonitor.c(FalcoLoadActionMonitor.this).postAtFrontOfQueue(new Runnable() { // from class: com.taobao.falco.FalcoLoadActionMonitor.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            FalcoLoadActionMonitor.b(FalcoLoadActionMonitor.this, activity, i, currentTimeMillis2);
                            if (FalcoLoadActionMonitor.b(FalcoLoadActionMonitor.this) != null) {
                                FalcoLoadActionMonitor.b(FalcoLoadActionMonitor.this).a(activity);
                            }
                            dit.d(new LoadRunnable(FalcoLoadActionMonitor.this, 5, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2)));
                        }
                    });
                }
            });
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onStartActivity", null, "time", Long.valueOf(j));
        a peek = this.f17108a.peek();
        if (peek == null) {
            return;
        }
        this.i = peek.e;
    }

    private void a(String str, String str2, int i, long j, long j2, long j3) {
        a pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659127dd", new Object[]{this, str, str2, new Integer(i), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPageCreate", null, "page", str, "pageCode", Integer.valueOf(i), "time", Long.valueOf(j));
        com.taobao.analysis.v3.r rVar = FalcoGlobalTracer.get();
        if (rVar == null || this.b.get(Integer.valueOf(i)) != null || this.f17108a.isEmpty()) {
            return;
        }
        if (StringUtils.isEmpty(this.i)) {
            pop = this.f17108a.pop();
        } else {
            this.f17108a.peek();
            do {
                pop = this.f17108a.pop();
            } while (!pop.e.equals(this.i));
        }
        this.f17108a.clear();
        this.i = null;
        slo sloVar = (slo) rVar.a(shc.MODULE, shc.SCENE_TAP).a(pop.f17113a).av_();
        sloVar.j(pop.b);
        sloVar.k(pop.c);
        sloVar.a(Long.valueOf(pop.f17113a));
        sloVar.d(Long.valueOf(j));
        sloVar.l(str);
        sloVar.a(i);
        if (!StringUtils.isEmpty(str2)) {
            sloVar.m(str2);
        }
        this.e.add(Integer.valueOf(i));
        this.b.put(Integer.valueOf(i), sloVar);
        if (j2 <= 0 || j3 <= 0) {
            return;
        }
        long c = c();
        sloVar.b(Long.valueOf(j2 + c));
        sloVar.c(Long.valueOf(c + j3));
    }

    private void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPageStart", null, "pageCode", Integer.valueOf(i), "time", Long.valueOf(j));
        slo sloVar = this.b.get(Integer.valueOf(i));
        if (sloVar == null) {
            return;
        }
        sloVar.e(Long.valueOf(j));
    }

    private void a(int i, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d24b0c9", new Object[]{this, new Integer(i), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doFirstFrameRender", null, "pageCode", Integer.valueOf(i), "pageResumeTime", Long.valueOf(j), "firstFrameRenderStart", Long.valueOf(j2), "firstFrameRenderEnd", Long.valueOf(j3));
        slo sloVar = this.b.get(Integer.valueOf(i));
        if (sloVar == null || !sloVar.m()) {
            return;
        }
        sloVar.f(Long.valueOf(j));
        sloVar.g(Long.valueOf(j2));
        sloVar.h(Long.valueOf(j3));
    }

    private void c(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddcd0b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPageStop", null, "pageCode", Integer.valueOf(i), "time", Long.valueOf(j));
        slo sloVar = this.b.get(Integer.valueOf(i));
        if (sloVar == null || sloVar.q() != i) {
            return;
        }
        if (this.e.size() > 0) {
            List<Integer> list = this.e;
            if (list.get(list.size() - 1).intValue() != sloVar.q()) {
                sloVar.r("jumpNextPage");
            } else if (!sloVar.r()) {
                sloVar.r("F2B");
            }
        }
        sloVar.a(this.d);
        sloVar.b(j);
        Integer valueOf = Integer.valueOf(i);
        this.e.remove(valueOf);
        this.b.remove(valueOf);
    }

    private void b(Activity activity, int i, long j) {
        slo sloVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5e7dc", new Object[]{this, activity, new Integer(i), new Long(j)});
        } else if (!this.j || (sloVar = this.b.get(Integer.valueOf(i))) == null || !sloVar.m()) {
        } else {
            spq.a(activity, "tapResponse：" + (j - sloVar.k()));
        }
    }

    public shc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("f0a7e30", new Object[]{this});
        }
        if (this.e.size() <= 0) {
            return null;
        }
        List<Integer> list = this.e;
        return this.b.get(Integer.valueOf(list.get(list.size() - 1).intValue()));
    }

    public tgx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgx) ipChange.ipc$dispatch("16bc96b8", new Object[]{this}) : this.c;
    }

    public void a(shc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3649910d", new Object[]{this, aVar});
        } else {
            dit.d(new LoadRunnable(this, 9, aVar));
        }
    }

    private void b(shc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9024fb4e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(a());
        }
    }

    public void a(tgx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1a47b6", new Object[]{this, aVar});
        } else {
            dit.d(new LoadRunnable(this, 10, aVar));
        }
    }

    private void b(tgx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f5b1f7", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(b());
        }
    }

    private long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : System.currentTimeMillis() - SystemClock.uptimeMillis();
    }

    /* loaded from: classes7.dex */
    public static class b implements tpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FalcoLoadActionMonitor f17114a;

        public b(FalcoLoadActionMonitor falcoLoadActionMonitor) {
            this.f17114a = falcoLoadActionMonitor;
        }

        @Override // tb.tpr.b
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a112a7bb", new Object[]{this, fragmentManager, fragment, bundle});
            } else {
                FalcoLoadActionMonitor.d(this.f17114a, fragment, System.currentTimeMillis());
            }
        }

        @Override // tb.tpr.b
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5d51079", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.a(this.f17114a, fragment, System.currentTimeMillis());
            }
        }

        @Override // tb.tpr.b
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eed66218", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.b(this.f17114a, fragment, System.currentTimeMillis());
            }
        }

        @Override // tb.tpr.b
        public void c(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d7b3b7", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.c(this.f17114a, fragment, System.currentTimeMillis());
            }
        }
    }
}
