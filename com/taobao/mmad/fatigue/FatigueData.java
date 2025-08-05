package com.taobao.mmad.fatigue;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class FatigueData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long nextShowTime;
    public int times;

    static {
        kge.a(1412904592);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FatigueData{times=" + this.times + ", nextShowTime=" + this.nextShowTime + '}';
    }
}
