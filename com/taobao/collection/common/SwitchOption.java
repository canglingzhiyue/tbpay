package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class SwitchOption {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Object> feature;
    private int interval;
    private boolean isOpen;
    private long timeRange;
    private CollectionType type;
    private int version;

    /* loaded from: classes7.dex */
    public enum CollectionType {
        WIFI,
        BEACON
    }

    static {
        kge.a(295881871);
    }

    public SwitchOption() {
        this.isOpen = false;
        this.interval = 0;
        this.timeRange = 0L;
        this.version = 0;
    }

    public SwitchOption(CollectionType collectionType, boolean z) {
        this.isOpen = false;
        this.interval = 0;
        this.timeRange = 0L;
        this.version = 0;
        this.type = collectionType;
        this.isOpen = z;
    }

    public boolean getIsOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d1d515", new Object[]{this})).booleanValue() : this.isOpen;
    }

    public void setIsOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcef357", new Object[]{this, new Boolean(z)});
        } else {
            this.isOpen = z;
        }
    }

    public void setType(CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b168085", new Object[]{this, collectionType});
        } else {
            this.type = collectionType;
        }
    }

    public CollectionType getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollectionType) ipChange.ipc$dispatch("b5965281", new Object[]{this}) : this.type;
    }

    public long getTimeRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9883735", new Object[]{this})).longValue() : this.timeRange;
    }

    public void setTimeRange(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef758faf", new Object[]{this, new Long(j)});
        } else {
            this.timeRange = j;
        }
    }

    public int getInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue() : this.interval;
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue() : this.version;
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public Map<String, Object> getFeature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b97d253c", new Object[]{this}) : this.feature;
    }

    public void setFeature(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da7df6a", new Object[]{this, map});
        } else {
            this.feature = map;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SwitchOption [type=" + this.type + ", isOpen=" + this.isOpen + ", interval=" + this.interval + ", timeRange=" + this.timeRange + ", version=" + this.version + ", feature=" + this.feature + riy.ARRAY_END_STR;
    }
}
