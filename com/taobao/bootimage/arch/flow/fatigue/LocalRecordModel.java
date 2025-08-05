package com.taobao.bootimage.arch.flow.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class LocalRecordModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String localLastShowDay;
    public int localLastShowDayCount = 0;
    public String localLastShowTime;

    static {
        kge.a(1566428406);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LocalRecordModel{localLastShowDay='" + this.localLastShowDay + "', localLastShowDayCount=" + this.localLastShowDayCount + ", localLastShowTime='" + this.localLastShowTime + "'}";
    }
}
