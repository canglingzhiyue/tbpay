package com.taobao.orange.model;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import tb.kge;

@Monitor(module = OConstant.MONITOR_PRIVATE_MODULE, monitorPoint = OConstant.POINT_CONFIG_ACK)
/* loaded from: classes7.dex */
public class ConfigAckDO extends StatObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String name;
    @Dimension
    public String namespaceId;
    @Dimension
    public String updateTime;
    @Dimension
    public String version;

    static {
        kge.a(1634350654);
        kge.a(1028243835);
    }

    public ConfigAckDO() {
    }

    public ConfigAckDO(String str, String str2, String str3, String str4) {
        this.name = str;
        this.namespaceId = str2;
        this.updateTime = str3;
        this.version = str4;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigAckDO configAckDO = (ConfigAckDO) obj;
        if (!this.name.equals(configAckDO.name) || !this.namespaceId.equals(configAckDO.namespaceId) || !this.updateTime.equals(configAckDO.updateTime)) {
            return false;
        }
        return this.version.equals(configAckDO.version);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((((this.name.hashCode() * 31) + this.namespaceId.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.version.hashCode();
    }
}
