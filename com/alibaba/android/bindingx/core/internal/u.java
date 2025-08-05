package com.alibaba.android.bindingx.core.internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class u implements t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f2248a;

    static {
        kge.a(-1511971464);
        kge.a(603368248);
    }

    public u(SensorManager sensorManager) {
        this.f2248a = sensorManager;
    }

    @Override // com.alibaba.android.bindingx.core.internal.t
    public boolean a(SensorEventListener sensorEventListener, int i, int i2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8195981e", new Object[]{this, sensorEventListener, new Integer(i), new Integer(i2), handler})).booleanValue();
        }
        List<Sensor> sensorList = this.f2248a.getSensorList(i);
        if (!sensorList.isEmpty()) {
            return this.f2248a.registerListener(sensorEventListener, sensorList.get(0), i2, handler);
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.t
    public void a(SensorEventListener sensorEventListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1a3839", new Object[]{this, sensorEventListener, new Integer(i)});
            return;
        }
        List<Sensor> sensorList = this.f2248a.getSensorList(i);
        if (sensorList.isEmpty()) {
            return;
        }
        try {
            this.f2248a.unregisterListener(sensorEventListener, sensorList.get(0));
        } catch (Throwable unused) {
            com.alibaba.android.bindingx.core.h.c("Failed to unregister device sensor " + sensorList.get(0).getName());
        }
    }
}
