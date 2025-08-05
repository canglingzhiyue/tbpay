package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;

/* loaded from: classes6.dex */
public class huk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f28791a = false;
    private static boolean b = true;

    public static synchronized boolean a() {
        synchronized (huk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            } else if (f28791a) {
                return true;
            } else {
                f28791a = true;
                ihz c = ihq.a().c("mnnpybridge");
                ihz c2 = ihq.a().c("MNN");
                ihz c3 = ihq.a().c("MNN_CL");
                ihz c4 = ihq.a().c("MNN_Express");
                ihz c5 = ihq.a().c("MNNOpenCV");
                if (!c2.g()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN.so failed.");
                }
                if (!c.g()) {
                    Log.e("MNNPyBridge", "Load Remote libmnnpybridge.so failed.");
                }
                if (!c3.g()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN_CL.so failed.");
                }
                if (!c4.g()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN_Express.so failed.");
                }
                if (!c5.g()) {
                    Log.e("MNNPyBridge", "Load Remote libMNNOpenCV.so failed.");
                }
                if (!c2.g() && !c.g()) {
                    return false;
                }
                AliNNPython.copyPyLib(null, "MNN.zip", "");
                return true;
            }
        }
    }
}
