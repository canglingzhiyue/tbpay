package com.alibaba.android.icart.core.event.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ChangeQuantityEventModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String max;
    private String min;
    private String quantity;
    private String step;

    static {
        kge.a(-832217906);
        kge.a(1028243835);
    }

    public String getMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fcfa15d", new Object[]{this}) : this.min;
    }

    public void setMin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b16d21", new Object[]{this, str});
        } else {
            this.min = str;
        }
    }

    public String getMax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f7c218b", new Object[]{this}) : this.max;
    }

    public void setMax(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e94f2b3", new Object[]{this, str});
        } else {
            this.max = str;
        }
    }

    public String getStep() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b4b3cf7", new Object[]{this}) : this.step;
    }

    public void setStep(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29ba25f", new Object[]{this, str});
        } else {
            this.step = str;
        }
    }

    public String getQuantity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2be78798", new Object[]{this}) : this.quantity;
    }

    public void setQuantity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe6c5de", new Object[]{this, str});
        } else {
            this.quantity = str;
        }
    }
}
