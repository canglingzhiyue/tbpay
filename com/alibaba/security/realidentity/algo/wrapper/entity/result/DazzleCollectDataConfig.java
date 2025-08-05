package com.alibaba.security.realidentity.algo.wrapper.entity.result;

import com.alibaba.security.realidentity.service.sensor.model.SensorInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DazzleCollectDataConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<DazzleDataConfigItem> conf;
    public SensorInfo firstSensorInfo;
    public SensorInfo lastSensorInfo;
    public int rotate;

    public void addUiConfig(DazzleDataConfigItem dazzleDataConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3696b815", new Object[]{this, dazzleDataConfigItem});
            return;
        }
        if (this.conf == null) {
            this.conf = new ArrayList();
        }
        this.conf.add(dazzleDataConfigItem);
    }
}
