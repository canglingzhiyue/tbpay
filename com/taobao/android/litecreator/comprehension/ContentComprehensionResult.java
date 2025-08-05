package com.taobao.android.litecreator.comprehension;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class ContentComprehensionResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject bizData;
    public long timeStamp = -1;

    static {
        kge.a(533265303);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ContentComprehensionResult{timeStamp=" + this.timeStamp + ", bizData=" + this.bizData + '}';
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.timeStamp = -1L;
        this.bizData = null;
    }
}
