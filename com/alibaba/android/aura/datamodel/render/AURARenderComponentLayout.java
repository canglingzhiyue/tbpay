package com.alibaba.android.aura.datamodel.render;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARenderComponentLayout implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public Map<String, Object> style;
    public String type;

    static {
        kge.a(1884120528);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFRenderComponentLayout{type='" + this.type + "', style=" + this.style + '}';
    }
}
