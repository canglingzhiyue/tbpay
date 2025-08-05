package com.taobao.orange.model;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import tb.kge;

@Monitor(module = OConstant.MONITOR_PRIVATE_MODULE, monitorPoint = OConstant.POINT_INDEX_ACK)
/* loaded from: classes7.dex */
public class IndexAckDO extends StatObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String indexId;
    @Dimension
    public String md5;
    @Dimension
    public String updateTime;

    static {
        kge.a(-1444753898);
        kge.a(1028243835);
    }

    public IndexAckDO() {
    }

    public IndexAckDO(String str, String str2, String str3) {
        this.indexId = str;
        this.updateTime = str2;
        this.md5 = str3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IndexAckDO{indexId='" + this.indexId + "', updateTime='" + this.updateTime + "', md5='" + this.md5 + "'}";
    }
}
