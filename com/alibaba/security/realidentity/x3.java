package com.alibaba.security.realidentity;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import com.alibaba.security.realidentity.service.sensor.model.SensorData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class x3 extends u3<List<SensorData>> implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "x3";
    public SensorManager c;
    public final List<Sensor> d;
    public final List<SensorData> e;
    public boolean f;

    public x3(Activity activity) {
        super(activity);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = false;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public static /* synthetic */ Object ipc$super(x3 x3Var, String str, Object... objArr) {
        if (str.hashCode() == -1548715975) {
            super.a((z3) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.u3
    public void a(z3 z3Var) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b07839", new Object[]{this, z3Var});
            return;
        }
        super.a(z3Var);
        Activity activity = this.f3531a;
        if (activity != null) {
            SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
            this.c = sensorManager;
            if (sensorManager != null) {
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                if (sensorList != null && sensorList.size() > 0) {
                    z3 z3Var2 = this.b;
                    if (z3Var2 != null && z3Var2.a() != null && this.b.a().size() > 0) {
                        for (Sensor sensor : sensorList) {
                            for (Integer num : this.b.a()) {
                                if (num.intValue() == sensor.getType()) {
                                    this.d.add(sensor);
                                }
                            }
                        }
                        return;
                    }
                    throw new RpSecException("The collector strategy is null", -400);
                }
                throw new RpSecException("No sensors found on this device", -300);
            }
            throw new RpSecException("No sensor manager found while get system service", -200);
        }
        throw new RpSecException("No activity found when initialized", -100);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.alibaba.security.realidentity.service.sensor.model.SensorData>, java.lang.Object] */
    @Override // com.alibaba.security.realidentity.u3
    public /* synthetic */ List<SensorData> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : g();
    }

    @Override // com.alibaba.security.realidentity.u3
    public void c() throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c != null) {
            List<SensorData> list = this.e;
            if (list == null) {
                return;
            }
            list.clear();
        } else {
            throw new RpSecException("No sensor manager found while processing reset", -200);
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public void d() throws RpSecException {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            if (this.c != null) {
                List<Sensor> list = this.d;
                if (list != null && list.size() > 0) {
                    this.f = true;
                    for (Sensor sensor : this.d) {
                        this.c.registerListener(this, sensor, 2);
                    }
                    return;
                }
                throw new RpSecException("No enabled sensors", -500);
            } else {
                throw new RpSecException("No sensor manager found while processing start", -200);
            }
        }
        ipChange.ipc$dispatch("596b2eb", new Object[]{this});
    }

    @Override // com.alibaba.security.realidentity.u3
    public boolean e() throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        SensorManager sensorManager = this.c;
        if (sensorManager != null) {
            this.f = false;
            sensorManager.unregisterListener(this);
            return false;
        }
        throw new RpSecException("No sensor manager found while processing stop", -200);
    }

    public List<SensorData> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.e;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (!this.d.contains(sensorEvent.sensor) || !f() || this.e.size() > this.b.c()) {
        } else {
            this.e.add(a(sensorEvent));
        }
    }

    private SensorData a(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorData) ipChange.ipc$dispatch("bd208aaf", new Object[]{this, sensorEvent});
        }
        SensorData sensorData = new SensorData();
        if (sensorEvent.sensor.getType() == 1) {
            sensorData.type = 1;
            float[] fArr = sensorEvent.values;
            sensorData.values = new float[]{fArr[0], fArr[1], fArr[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 4) {
            sensorData.type = 4;
            float[] fArr2 = sensorEvent.values;
            sensorData.values = new float[]{fArr2[0], fArr2[1], fArr2[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 9) {
            sensorData.type = 9;
            float[] fArr3 = sensorEvent.values;
            sensorData.values = new float[]{fArr3[0], fArr3[1], fArr3[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 2) {
            sensorData.type = 2;
            float[] fArr4 = sensorEvent.values;
            sensorData.values = new float[]{fArr4[0], fArr4[1], fArr4[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 10) {
            sensorData.type = 10;
            float[] fArr5 = sensorEvent.values;
            sensorData.values = new float[]{fArr5[0], fArr5[1], fArr5[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 5) {
            sensorData.type = 5;
            sensorData.values = new float[]{sensorEvent.values[0]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 6) {
            sensorData.type = 6;
            sensorData.values = new float[]{sensorEvent.values[0]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 13) {
            sensorData.type = 7;
            sensorData.values = new float[]{sensorEvent.values[0]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 8) {
            sensorData.type = 8;
            sensorData.values = new float[]{sensorEvent.values[0]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 3) {
            sensorData.type = 9;
            float[] fArr6 = sensorEvent.values;
            sensorData.values = new float[]{fArr6[0], fArr6[1], fArr6[2]};
            sensorData.timestamp = a();
        }
        if (sensorEvent.sensor.getType() == 11) {
            sensorData.type = 11;
            float[] fArr7 = sensorEvent.values;
            sensorData.values = new float[]{fArr7[0], fArr7[1], fArr7[2]};
            sensorData.timestamp = a();
        }
        return sensorData;
    }
}
