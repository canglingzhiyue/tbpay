package com.taobao.android.fluid.framework.data.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class RectData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String height;
    public String width;
    public String x;
    public String y;

    static {
        kge.a(-1725378982);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RectData{x='" + this.x + "', y='" + this.y + "', width='" + this.width + "', height='" + this.height + "'}";
    }
}
