package com.taobao.accs.utl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.agoo.TaobaoRegister;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes.dex */
public class f implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_STATE_BACK = "ACTION_STATE_BACK";
    public static final String ACTION_STATE_FORE = "ACTION_STATE_FORE";
    public static final int STATE_BACK = 0;
    public static final int STATE_BACK_LIMIT = 3;
    public static final int STATE_FORE = 1;

    /* renamed from: a  reason: collision with root package name */
    public static String f8308a;
    public static String b;
    private static final String c;
    private static volatile f d;
    private static ArrayList<a> e;
    private static ArrayList<b> f;
    private static Application g;
    private static boolean l;
    private boolean i;
    private boolean m;
    private int h = 0;
    private int j = 0;
    private Integer k = null;

    /* loaded from: classes.dex */
    public interface b {
        void a(Context context);

        void b(Context context);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    public static /* synthetic */ ArrayList d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[0]) : e;
    }

    public static /* synthetic */ Application e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("9e618a3b", new Object[0]) : g;
    }

    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : c;
    }

    static {
        kge.a(1778175390);
        kge.a(-1894394539);
        c = f.class.getSimpleName();
        l = false;
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9ddc7e9f", new Object[0]);
        }
        if (d == null) {
            synchronized (f.class) {
                if (d == null) {
                    d = new f();
                }
            }
        }
        return d;
    }

    private f() {
        e = new ArrayList<>();
        f = new ArrayList<>();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (!this.m) {
            com.taobao.accs.asp.a.b($$Lambda$f$jDrxHqeCgoApnh4uKl5dm325o.INSTANCE);
        }
        this.m = true;
        int i = this.h;
        if ((i & 1) != 1) {
            this.h = i | 1;
            this.h |= 2;
        } else if ((i & 2) != 2) {
        } else {
            this.h = i & (-3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else {
            APreferencesManager.getSharedPreferences(g, Constants.SP_FILE_NAME, 0).edit().putInt(Constants.SP_KEY_MAIN_CREATED_PID, Process.myPid()).commit();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        int i2 = this.j;
        this.j = i2 + 1;
        if (i2 == 0) {
            ALog.i(c, "onActivityStarted back to force", new Object[0]);
            this.i = true;
            this.k = 1;
            com.taobao.accs.common.a.a($$Lambda$f$B4AEInc62iW90szoaWaXqoTE1Ew.INSTANCE);
        }
        int i3 = this.i ? 4 : 0;
        if ((this.h & 2) != 2) {
            i = 1;
        }
        int i4 = i3 | i;
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        try {
            Intent intent = activity.getIntent();
            String stringExtra = intent.getStringExtra("AliAgooMsgID");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            ALog.i(c, "onActivityStarted isFromAgoo", new Object[0]);
            intent.removeExtra("AliAgooMsgID");
            final a aVar = new a(stringExtra, i4);
            if (Launcher_InitAccs.mIsInited) {
                com.taobao.accs.common.a.a(aVar);
            } else {
                com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.utl.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            f.d().add(aVar);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            ALog.e(c, "onActivityStarted Error:", e2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        Iterator<b> it = f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null) {
                next.a(g);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.i) {
            com.taobao.accs.asp.a.b($$Lambda$f$l4kGGoCmCmSICKSyH5XziUTA7qM.INSTANCE);
        }
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        l.a(g, System.currentTimeMillis());
        if (l) {
            return;
        }
        l.e(g);
        l.f(g);
        l = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        this.j = Math.max(0, this.j - 1);
        if (this.j != 0) {
            return;
        }
        this.k = 0;
        com.taobao.accs.common.a.a($$Lambda$f$zHX0tHUx5oYoIx2gx0jXo4WTudg.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        Iterator<b> it = f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null) {
                next.b(g);
            }
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (g != null) {
        } else {
            GlobalClientInfo.mContext = application;
            g = application;
            f8308a = g.getPackageName() + "_" + ACTION_STATE_FORE;
            b = g.getPackageName() + "_" + ACTION_STATE_BACK;
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84580d61", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            f.add(bVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList<a> arrayList = e;
        if (arrayList == null) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            com.taobao.accs.common.a.a().execute(it.next());
        }
        e.clear();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        Integer num = this.k;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.m;
    }

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f8310a;
        private int b;
        private long c = l.h(f.e());

        static {
            kge.a(1885515010);
            kge.a(-1390502639);
        }

        public a(String str, int i) {
            this.f8310a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ALog.e(f.g(), "click report", "lastActiveTime", Long.valueOf(this.c), "currentActiveTime", Long.valueOf(currentTimeMillis));
            long j = this.c;
            if (j == 0 || UtilityImpl.isSameDay(j, currentTimeMillis)) {
                this.b |= 8;
            }
            TaobaoRegister.clickMessage(f.e(), this.f8310a, null, this.b, this.c);
        }
    }
}
