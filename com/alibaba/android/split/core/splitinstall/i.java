package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.bgu;
import tb.bhc;
import tb.bht;
import tb.bhu;
import tb.kge;

/* loaded from: classes.dex */
public final class i implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final k f2467a;
    private final com.alibaba.android.split.g b;
    private final f c;
    private final e d;
    private final b e;
    private bhu f;
    private final Handler g;
    private com.alibaba.android.split.j h;

    static {
        kge.a(1785079416);
        kge.a(757345336);
    }

    public i(k kVar, Context context) {
        this(kVar, context, context.getPackageName());
    }

    private i(k kVar, Context context, String str) {
        this.b = new com.alibaba.android.split.b();
        this.f = null;
        this.h = (com.alibaba.android.split.j) com.alibaba.android.split.a.a((Class<? extends Object>) com.alibaba.android.split.j.class, new Object[0]);
        this.g = new Handler(Looper.getMainLooper());
        this.d = new e(context, str);
        this.f2467a = kVar;
        this.c = f.a(context);
        this.e = new b(context);
        this.f = bht.a(com.alibaba.android.split.core.splitcompat.j.h().e());
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public final void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3990003e", new Object[]{this, oVar});
        } else {
            this.c.a((com.alibaba.android.split.core.listener.b) oVar);
        }
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public final void b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67689a9d", new Object[]{this, oVar});
        } else {
            this.c.b(oVar);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String str = "";
            String className = stackTrace.length > 7 ? stackTrace[6].getClassName() : str;
            String methodName = stackTrace.length > 7 ? stackTrace[6].getMethodName() : str;
            sb.append(className + ":" + methodName);
            String className2 = stackTrace.length > 8 ? stackTrace[7].getClassName() : str;
            String methodName2 = stackTrace.length > 8 ? stackTrace[7].getMethodName() : str;
            sb.append(className2 + ":" + methodName2);
            String className3 = stackTrace.length > 9 ? stackTrace[8].getClassName() : str;
            if (stackTrace.length > 9) {
                str = stackTrace[8].getMethodName();
            }
            sb.append(className3 + ":" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public final com.alibaba.android.split.core.tasks.h<Integer> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.split.core.tasks.h) ipChange.ipc$dispatch("38169b55", new Object[]{this, jVar});
        }
        bgu a2 = this.c.a();
        a2.d("startInstall:" + jVar, new Object[0]);
        if (com.alibaba.android.split.core.splitcompat.j.f(com.alibaba.android.split.core.splitcompat.j.h().e())) {
            for (String str : jVar.b()) {
                this.h.a(str, true, "startInstall_channel", 0L, 0, b(), com.alibaba.android.split.core.splitcompat.j.h().i());
            }
            this.c.a().d("startInstall features: %s from channel: %s", jVar.b(), Arrays.asList(Thread.currentThread().getStackTrace()));
            if (!v.l(com.alibaba.android.split.core.splitcompat.j.h().e())) {
                return com.alibaba.android.split.core.tasks.n.a(0);
            }
        }
        List<String> b = jVar.b();
        if (b.isEmpty()) {
            return com.alibaba.android.split.core.tasks.n.a((Exception) new SplitInstallException(-3));
        }
        if (!v.c(com.alibaba.android.split.core.splitcompat.j.h().e())) {
            return com.alibaba.android.split.core.tasks.n.a((Exception) new SplitInstallException(-2));
        }
        for (String str2 : b) {
            com.alibaba.android.split.j jVar2 = this.h;
            if (jVar2 != null) {
                jVar2.a(str2, true, com.alibaba.android.split.j.ARG_START_INSTALL, 0L, 0, "", com.alibaba.android.split.core.splitcompat.j.h().i());
            }
        }
        return this.f2467a.a(b, new HashSet(), jVar.c());
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public final com.alibaba.android.split.core.tasks.h<Void> a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.split.core.tasks.h) ipChange.ipc$dispatch("9704e39f", new Object[]{this, list});
        }
        Log.e("SplitInstallManager", "deferredInstall:" + list.toString());
        if (com.alibaba.android.split.core.splitcompat.j.f(com.alibaba.android.split.core.splitcompat.j.h().e())) {
            for (String str : list) {
                this.h.a(str, true, "deferredInstall_channel", 0L, 0, b(), com.alibaba.android.split.core.splitcompat.j.h().i());
            }
            this.c.a().d("deferredInstall features: %s from channel: %s", list, Arrays.asList(Thread.currentThread().getStackTrace()));
            if (!v.l(com.alibaba.android.split.core.splitcompat.j.h().e())) {
                return com.alibaba.android.split.core.tasks.n.a((Object) null);
            }
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(list);
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (this.b.g(str2) != null && this.b.g(str2).size() > 0) {
                arrayList.addAll(this.b.g(str2));
            }
        }
        hashSet.addAll(arrayList);
        if (!v.c(com.alibaba.android.split.core.splitcompat.j.h().e())) {
            return com.alibaba.android.split.core.tasks.n.a((Object) null);
        }
        Set<String> a2 = a();
        if (a2.containsAll(hashSet)) {
            Log.e("SplitInstallManager", hashSet + " all installed before deferredInstall");
            return com.alibaba.android.split.core.tasks.n.a((Object) null);
        }
        hashSet.removeAll(a2);
        hashSet.removeAll(v.a(com.alibaba.android.split.core.splitcompat.j.h().e()));
        if (this.h != null) {
            for (String str3 : hashSet) {
                this.h.a(str3, true, com.alibaba.android.split.j.ARG_DEFFERED_INSTALL, 0L, 0, "", com.alibaba.android.split.core.splitcompat.j.h().i());
            }
        }
        return this.f2467a.a((List) new ArrayList(hashSet));
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.d.a();
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public void a(String str, com.alibaba.android.split.ui.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65fa23", new Object[]{this, str, cVar});
        } else {
            this.c.a(str, cVar);
        }
    }

    @Override // com.alibaba.android.split.core.splitinstall.g
    public void a(bhc bhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b768db", new Object[]{this, bhcVar});
        } else {
            this.c.a(bhcVar);
        }
    }
}
