package com.taobao.android.order.map.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderMapCoordinateModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "latitude")
    private double latitude;
    @JSONField(name = "longitude")
    private double longitude;

    static {
        kge.a(-673844138);
        kge.a(1028243835);
    }

    public double getLatitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[]{this})).doubleValue() : this.latitude;
    }

    public void setLatitude(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855cc669", new Object[]{this, new Double(d)});
        } else {
            this.latitude = d;
        }
    }

    public double getLongitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b61adaee", new Object[]{this})).doubleValue() : this.longitude;
    }

    public void setLongitude(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5374d4a", new Object[]{this, new Double(d)});
        } else {
            this.longitude = d;
        }
    }
}
