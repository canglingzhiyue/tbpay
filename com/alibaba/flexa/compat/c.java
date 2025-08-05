package com.alibaba.flexa.compat;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.g;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import tb.bgj;
import tb.bgu;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f3104a;
    private static bgu b;

    /* loaded from: classes.dex */
    public interface a {
        void onClassLoaded(Class<?> cls);

        void onClassNotFound();
    }

    public static /* synthetic */ bgu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("f02c24e", new Object[0]) : b;
    }

    static {
        kge.a(-352071019);
        f3104a = new com.alibaba.android.split.b();
        b = (bgu) com.alibaba.android.split.a.b(bgu.class, "FlexaClass");
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a4ee6", new Object[]{str, aVar});
        } else {
            a(str, aVar, null);
        }
    }

    public static void a(final String str, final a aVar, final Executor executor) {
        com.alibaba.android.split.core.splitinstall.g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822c2670", new Object[]{str, aVar, executor});
            return;
        }
        final String e = f3104a.e(str);
        if (!TextUtils.isEmpty(e)) {
            b.d("forName:%s from Feature:%s", e, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(e);
            arrayList.addAll(f3104a.g(e));
            try {
                a2 = h.a(k.a().b().t());
            } catch (Exception e2) {
                e2.printStackTrace();
                a2 = h.a(d.b().a());
            }
            if (!a2.a().containsAll(arrayList)) {
                final com.alibaba.android.split.core.splitinstall.g gVar = a2;
                a2.a(new o() { // from class: com.alibaba.flexa.compat.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.listener.b
                    public /* synthetic */ void onStateUpdate(m mVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                        } else {
                            a(mVar);
                        }
                    }

                    public void a(m mVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("398f1780", new Object[]{this, mVar});
                        } else if (mVar.g() == null || !mVar.g().contains(e) || mVar.b() != 5) {
                        } else {
                            if (aVar != null) {
                                Executor executor2 = executor;
                                if (executor2 != null) {
                                    executor2.execute(new Runnable() { // from class: com.alibaba.flexa.compat.c.3.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            try {
                                                Class<?> cls = Class.forName(str, true, c.class.getClassLoader());
                                                c.a().d("callback success:%s on thread:%s", cls, Thread.currentThread());
                                                aVar.onClassLoaded(cls);
                                            } catch (ClassNotFoundException e3) {
                                                aVar.onClassNotFound();
                                                e3.printStackTrace();
                                            }
                                        }
                                    });
                                } else {
                                    bgj.a().a(new Runnable() { // from class: com.alibaba.flexa.compat.c.3.2
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            try {
                                                Class<?> cls = Class.forName(str, true, c.class.getClassLoader());
                                                c.a().d("callback success:%s on thread:%s", cls, Thread.currentThread());
                                                aVar.onClassLoaded(cls);
                                            } catch (ClassNotFoundException e3) {
                                                aVar.onClassNotFound();
                                                e3.printStackTrace();
                                            }
                                        }
                                    });
                                }
                            }
                            gVar.b(this);
                        }
                    }
                });
                a2.a(j.a().a(e).a()).a(new com.alibaba.android.split.core.tasks.d() { // from class: com.alibaba.flexa.compat.c.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.d
                    public void onFailure(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                        } else if (a.this == null) {
                        } else {
                            Executor executor2 = executor;
                            if (executor2 != null) {
                                executor2.execute(new Runnable() { // from class: com.alibaba.flexa.compat.c.4.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        c.a().d("callback failed:%s on thread:%s", str, Thread.currentThread());
                                        a.this.onClassNotFound();
                                    }
                                });
                                return;
                            }
                            c.a().d("callback failed:%s on thread:%s", str, Thread.currentThread());
                            a.this.onClassNotFound();
                        }
                    }
                });
                return;
            } else if (aVar == null) {
                return;
            } else {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: com.alibaba.flexa.compat.c.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                aVar.onClassLoaded(Class.forName(str, true, c.class.getClassLoader()));
                            } catch (ClassNotFoundException e3) {
                                e3.printStackTrace();
                                aVar.onClassNotFound();
                            }
                        }
                    });
                    return;
                } else {
                    bgj.a().a(new Runnable() { // from class: com.alibaba.flexa.compat.c.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Class<?> cls = Class.forName(str, true, c.class.getClassLoader());
                                c.a().d("callback success:%s on thread:%s", cls, Thread.currentThread());
                                aVar.onClassLoaded(cls);
                            } catch (ClassNotFoundException e3) {
                                e3.printStackTrace();
                                aVar.onClassNotFound();
                            }
                        }
                    });
                    return;
                }
            }
        }
        try {
            final Class<?> cls = Class.forName(str);
            if (cls == null || aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: com.alibaba.flexa.compat.c.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.onClassLoaded(cls);
                        }
                    }
                });
            } else {
                bgj.a().a(new Runnable() { // from class: com.alibaba.flexa.compat.c.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Log.e("FlexaClass", "callback success:" + str);
                        aVar.onClassLoaded(cls);
                    }
                });
            }
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            if (aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: com.alibaba.flexa.compat.c.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.onClassNotFound();
                        }
                    }
                });
            } else {
                bgj.a().a(new Runnable() { // from class: com.alibaba.flexa.compat.c.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.onClassNotFound();
                        }
                    }
                });
            }
        }
    }
}
