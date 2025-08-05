package com.alipay.mobile.security.bio.sensor;

import android.content.Context;
import android.hardware.SensorManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SensorCollectors {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SensorType[] f5802a = {SensorType.ACCELEROMETER, SensorType.MAGNETIC, SensorType.GYROSCOPE};
    private List<SensorCollectWorker> b = new ArrayList();

    /* loaded from: classes3.dex */
    public enum SensorType {
        ACCELEROMETER(1, "Acceleration"),
        GYROSCOPE(4, "Gyroscope"),
        MAGNETIC(2, "Magnetic");
        
        private String mSensorName;
        private int mSensorType;

        SensorType(int i, String str) {
            this.mSensorName = str;
            this.mSensorType = i;
        }

        public String getSensorName() {
            return this.mSensorName;
        }

        public int getmSensorType() {
            return this.mSensorType;
        }
    }

    public SensorCollectors(Context context) {
        reset(context);
    }

    public void reset(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b45632", new Object[]{this, context});
        } else if (context != null) {
            try {
                this.b.clear();
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                for (SensorType sensorType : this.f5802a) {
                    this.b.add(new SensorCollectWorker(sensorManager, sensorType, 100));
                }
            } catch (Exception e) {
                BioLog.e(e.toString());
            }
        }
    }

    public void startListening() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66aa80", new Object[]{this});
            return;
        }
        for (SensorCollectWorker sensorCollectWorker : this.b) {
            sensorCollectWorker.start();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (SensorCollectWorker sensorCollectWorker : this.b) {
            sensorCollectWorker.destory();
        }
    }

    public SensorData getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorData) ipChange.ipc$dispatch("b2d85e45", new Object[]{this});
        }
        SensorData sensorData = new SensorData();
        List<SensorCollectWorker> list = this.b;
        if (list != null) {
            for (SensorCollectWorker sensorCollectWorker : list) {
                if (sensorCollectWorker != null) {
                    String resultData = sensorCollectWorker.getResultData();
                    if (sensorCollectWorker.getType() == 1) {
                        sensorData.f5803a = resultData;
                    }
                    if (sensorCollectWorker.getType() == 2) {
                        sensorData.c = resultData;
                    }
                    if (sensorCollectWorker.getType() == 4) {
                        sensorData.b = resultData;
                    }
                }
            }
        }
        return sensorData;
    }
}
