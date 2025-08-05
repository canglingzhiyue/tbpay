package android.taobao.windvane.connect;

import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f1576a;

    static {
        kge.a(-1615555572);
        f1576a = null;
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("acc83b1f", new Object[0]);
            }
            if (f1576a == null) {
                f1576a = new c();
            }
            return f1576a;
        }
    }

    private c() {
    }

    public void a(String str, d<f> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc484f4", new Object[]{this, str, dVar});
        } else {
            a(str, dVar, null);
        }
    }

    public void a(final String str, final d<f> dVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a855d9be", new Object[]{this, str, dVar, str2});
        } else if (str == null) {
        } else {
            WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.connect.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    m.b("WVThreadPool", "Task has been executed");
                    try {
                        new HttpConnector().b(new e(str), dVar);
                    } catch (Exception e) {
                        m.b("WVThreadPool", "Task exception:" + e.getMessage());
                    }
                }
            }, str2);
        }
    }
}
