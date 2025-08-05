package tb;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.util.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mnu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DeviceRuntimeInfo";

    /* renamed from: a  reason: collision with root package name */
    public static int f31145a;
    private static BatteryManager b;

    public static JSONObject a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31f0a5c6", new Object[]{new Boolean(z), new Long(j)});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.freeMemory() >> 20;
            jSONObject.put("java", (runtime.totalMemory() >> 20) - freeMemory);
            jSONObject.put("dalvikFree", freeMemory);
            jSONObject.put("nativeHeapSize", Debug.getNativeHeapSize() >> 20);
            jSONObject.put("nativeHeapAllocatedSize", Debug.getNativeHeapAllocatedSize() >> 20);
            if (b == null) {
                b = (BatteryManager) e.a().b().getSystemService("batterymanager");
            }
            jSONObject.put("chargeCounter", b.getLongProperty(1));
            if (d.aj) {
                jSONObject.put("pss", Debug.getPss() >> 10);
            }
            jSONObject.put("time", j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z) {
            try {
                Intent a2 = a.a(e.a().b());
                if (a2 != null) {
                    jSONObject.put("batteryTemp", a2.getIntExtra("temperature", -1) / 10.0f);
                    int intExtra = a2.getIntExtra("level", 0);
                    int intExtra2 = a2.getIntExtra("scale", 100);
                    if (intExtra2 > 0) {
                        jSONObject.put("batteryPct", (intExtra * 100) / intExtra2);
                    }
                    f31145a = a2.getIntExtra("plugged", 0);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return jSONObject;
    }
}
