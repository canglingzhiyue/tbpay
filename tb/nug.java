package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;

/* loaded from: classes8.dex */
public final class nug {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nug INSTANCE;

    static {
        kge.a(-210554783);
        INSTANCE = new nug();
    }

    private nug() {
    }

    @JvmStatic
    private static final Sensor a(Context context, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sensor) ipChange.ipc$dispatch("446ed127", new Object[]{context, num});
        }
        if (context == null || num == null) {
            return null;
        }
        Object systemService = context.getApplicationContext().getSystemService("sensor");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }
        return ((SensorManager) systemService).getDefaultSensor(num.intValue());
    }

    @JvmStatic
    public static final boolean a(Context context, Integer num, nuc nucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d13508f", new Object[]{context, num, nucVar})).booleanValue();
        }
        if (context == null || nucVar == null) {
            return false;
        }
        Object systemService = context.getApplicationContext().getSystemService("sensor");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor a2 = a(context, num);
        if (a2 == null) {
            return false;
        }
        sensorManager.registerListener(nucVar, a2, (int) nucVar.a());
        return true;
    }

    @JvmStatic
    public static final void a(Context context, SensorEventListener sensorEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ccfa02", new Object[]{context, sensorEventListener});
        } else if (context == null || sensorEventListener == null) {
        } else {
            Object systemService = context.getApplicationContext().getSystemService("sensor");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
            }
            ((SensorManager) systemService).unregisterListener(sensorEventListener);
        }
    }
}
