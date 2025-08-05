package com.taobao.detail.domain.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class ServiceUnit implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean free;
    private boolean multi;
    private String price;
    private boolean selected;
    private long serId;
    private long uniqId = 0;

    static {
        kge.a(-1288535909);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public boolean isSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue() : this.selected;
    }

    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.selected = z;
        }
    }

    public boolean isFree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74f42c41", new Object[]{this})).booleanValue() : this.free;
    }

    public void setFree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f15fdff", new Object[]{this, new Boolean(z)});
        } else {
            this.free = z;
        }
    }

    public boolean isMulti() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe3a573a", new Object[]{this})).booleanValue() : this.multi;
    }

    public void setMulti(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640b4b96", new Object[]{this, new Boolean(z)});
        } else {
            this.multi = z;
        }
    }

    public String getPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3a46146", new Object[]{this}) : this.price;
    }

    public void setPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
        } else {
            this.price = str;
        }
    }

    public long getSerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6b0dde0", new Object[]{this})).longValue() : this.serId;
    }

    public void setSerId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8fa464", new Object[]{this, new Long(j)});
        } else {
            this.serId = j;
        }
    }

    public long getUniqId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c05d24ed", new Object[]{this})).longValue() : this.uniqId;
    }

    public void setUniqId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ad645f", new Object[]{this, new Long(j)});
        } else {
            this.uniqId = j;
        }
    }

    /* renamed from: clone */
    public ServiceUnit m1059clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceUnit) ipChange.ipc$dispatch("844c2dda", new Object[]{this});
        }
        try {
            Object clone = super.clone();
            if (clone instanceof ServiceUnit) {
                return (ServiceUnit) clone;
            }
        } catch (CloneNotSupportedException unused) {
        }
        return null;
    }
}
