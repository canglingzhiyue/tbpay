package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.b;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class qpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1247803918);
    }

    public static void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.loge(str, str2);
                    }
                }
            });
        }
    }

    public static void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AppMonitor.Stat.begin(str, str2, str3);
                    }
                }
            });
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AppMonitor.Stat.end(str, str2, str3);
                    }
                }
            });
        }
    }

    public static void c(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str4 = str3;
                    if (str4 == null) {
                        AppMonitor.Alarm.commitSuccess(str, str2);
                    } else {
                        AppMonitor.Alarm.commitSuccess(str, str2, str4);
                    }
                }
            });
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str6 = str3;
                    if (str6 == null) {
                        AppMonitor.Alarm.commitFail(str, str2, str4, str5);
                    } else {
                        AppMonitor.Alarm.commitFail(str, str2, str6, str4, str5);
                    }
                }
            });
        }
    }

    public static void a(final String str, final String str2, final String str3, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
        } else {
            b.a(new Runnable() { // from class: tb.qpl.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str4 = str3;
                    if (str4 == null) {
                        AppMonitor.Counter.commit(str, str2, d);
                    } else {
                        AppMonitor.Counter.commit(str, str2, str4, d);
                    }
                }
            });
        }
    }
}
