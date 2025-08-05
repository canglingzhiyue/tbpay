package com.taobao.android.weex_framework.util;

import android.app.Application;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.kge;

/* loaded from: classes6.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final b f16096a;

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, Throwable th);
    }

    static {
        kge.a(-1487007176);
        f16096a = b();
    }

    private static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5dd22d1a", new Object[0]);
        }
        try {
            return new b() { // from class: com.taobao.android.weex_framework.util.u.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                private Random f16097a = new Random(System.currentTimeMillis());

                @Override // com.taobao.android.weex_framework.util.u.b
                public void a(String str, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fe179b03", new Object[]{this, str, th});
                    } else if (th == null) {
                    } else {
                        try {
                            Application b2 = com.taobao.android.weex_framework.m.b();
                            if (b2 == null) {
                                Log.e("[Weex]ExceptionReport", "report before init");
                                return;
                            }
                            int t = f.t();
                            if (t <= 0) {
                                g.f("[Weex]ExceptionReport", "reportRemoteException disabled");
                                return;
                            }
                            int nextInt = this.f16097a.nextInt(t);
                            if (nextInt != 0) {
                                g.f("[Weex]ExceptionReport", "reportRemoteException skip: " + nextInt + " in " + t);
                                return;
                            }
                            com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
                            aVar.b = AggregationType.STACK;
                            aVar.f3119a = "WEEX2_NATIVE_EXCEPTION";
                            aVar.d = "JavaException";
                            aVar.c = "0";
                            aVar.j = str == null ? "<empty>" : str;
                            aVar.e = "0.17.1.5-framework-android";
                            aVar.l = Thread.currentThread();
                            aVar.k = th;
                            com.alibaba.ha.bizerrorreporter.e.a().a(b2, aVar);
                            g.f("[Weex]ExceptionReport", "reportRemoteException: " + str + ", " + th);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            };
        } catch (Throwable unused) {
            Log.e("[Weex]ExceptionReport", "no BizErrorModule");
            return new a();
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("24078b3b", new Object[0]) : f16096a;
    }

    /* loaded from: classes6.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(702107934);
            kge.a(2076207516);
        }

        @Override // com.taobao.android.weex_framework.util.u.b
        public void a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
            }
        }

        private a() {
        }
    }
}
