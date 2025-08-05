package com.taobao.themis.kernel.basic;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Adapter f22503a;

    @DefaultAdapterImpl("com.taobao.themis.taobao.tlog.TLogAdapterImpl")
    /* loaded from: classes9.dex */
    public interface Adapter extends a {
        void d(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        void v(String str, String str2);

        void w(String str, String str2, Throwable th);
    }

    static {
        kge.a(5027661);
        f22503a = new Adapter() { // from class: com.taobao.themis.kernel.basic.TMSLogger.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
            public void d(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
            public void i(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
            public void v(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
                }
            }

            @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
            public void w(String str, String str2, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
                }
            }

            @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
            public void e(String str, String str2, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
                } else {
                    Log.e(str, str2, th);
                }
            }
        };
    }

    private static Adapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adapter) ipChange.ipc$dispatch("1d3e09c5", new Object[0]);
        }
        Adapter a2 = qpt.a();
        return a2 != null ? a2 : f22503a;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a().i(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a().d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a().w(str, str2, null);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            a().w(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            a().e(str, str2, null);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a().e(str, "", th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else {
            a().e(str, str2, th);
        }
    }
}
