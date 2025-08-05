package tb;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayJava;
import com.taobao.highway.config.a;
import com.taobao.highway.jsbridge.HighwayJSBridge;

/* loaded from: classes7.dex */
public class ktj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f30301a;

    static {
        kge.a(-347895190);
        f30301a = false;
    }

    public static synchronized boolean a() {
        synchronized (ktj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            } else if (f30301a) {
                return true;
            } else {
                DataHighwayJava.setMTOP(new ktl());
                a.a().b();
                f30301a = true;
                q.a("HighwayJSBridge", (Class<? extends e>) HighwayJSBridge.class);
                return true;
            }
        }
    }
}
