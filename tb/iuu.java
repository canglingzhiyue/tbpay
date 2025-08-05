package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.tao.log.TLog;
import java.util.List;

/* loaded from: classes4.dex */
public class iuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f29321a;
    private boolean b;
    private int c;
    private float d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(float f);
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final iuu f29323a = new iuu();
    }

    public static /* synthetic */ float a(iuu iuuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee68b55f", new Object[]{iuuVar})).floatValue() : iuuVar.d;
    }

    public static /* synthetic */ int a(iuu iuuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deae6b67", new Object[]{iuuVar, new Integer(i)})).intValue();
        }
        iuuVar.c = i;
        return i;
    }

    public static /* synthetic */ List b(iuu iuuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("960cb857", new Object[]{iuuVar}) : iuuVar.f29321a;
    }

    public static /* synthetic */ int c(iuu iuuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb6ec264", new Object[]{iuuVar})).intValue() : iuuVar.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r3.equals("huawei") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private iuu() {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r7.f29321a = r0
            r0 = 0
            r7.b = r0
            r1 = -1
            r7.c = r1
            r2 = 1108082688(0x420c0000, float:35.0)
            r7.d = r2
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r3.toLowerCase()
            int r4 = r3.hashCode()
            r5 = 2
            r6 = 1
            switch(r4) {
                case -1206476313: goto L60;
                case -759499589: goto L56;
                case 3418016: goto L4c;
                case 3620012: goto L42;
                case 99462250: goto L38;
                case 108389869: goto L2e;
                case 1864941562: goto L24;
                default: goto L23;
            }
        L23:
            goto L69
        L24:
            java.lang.String r0 = "samsung"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 6
            goto L6a
        L2e:
            java.lang.String r0 = "redmi"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 5
            goto L6a
        L38:
            java.lang.String r0 = "honor"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 1
            goto L6a
        L42:
            java.lang.String r0 = "vivo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 2
            goto L6a
        L4c:
            java.lang.String r0 = "oppo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 3
            goto L6a
        L56:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            r0 = 4
            goto L6a
        L60:
            java.lang.String r4 = "huawei"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L69
            goto L6a
        L69:
            r0 = -1
        L6a:
            if (r0 == 0) goto L78
            if (r0 == r6) goto L76
            if (r0 == r5) goto L71
            goto L75
        L71:
            r0 = 1096810496(0x41600000, float:14.0)
            r7.d = r0
        L75:
            return
        L76:
            r7.d = r2
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iuu.<init>():void");
    }

    public static iuu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuu) ipChange.ipc$dispatch("f062575", new Object[0]) : b.f29323a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e60dd2", new Object[]{this, aVar});
        } else {
            this.f29321a.add(aVar);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        this.b = sensorManager.registerListener(new SensorEventListener() { // from class: tb.iuu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
                }
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
                } else if (sensorEvent.values != null && sensorEvent.values.length > 0) {
                    float f = sensorEvent.values[0];
                    if (f < -5.0f) {
                        iuu.a(iuu.this, -1);
                    } else if (f <= iuu.a(iuu.this)) {
                        iuu.a(iuu.this, 2);
                    } else if (f < 150.0f) {
                        iuu.a(iuu.this, 1);
                    } else if (f < 185.0f) {
                        iuu.a(iuu.this, 0);
                    } else {
                        iuu.a(iuu.this, -1);
                    }
                    for (a aVar : iuu.b(iuu.this)) {
                        aVar.a(f);
                    }
                    TLog.loge("TBAutoSize.HingeAngleSensor", "angle=" + f + " status=" + FoldPosture.a(iuu.c(iuu.this)));
                }
            }
        }, sensorManager.getDefaultSensor(36), 3);
    }
}
