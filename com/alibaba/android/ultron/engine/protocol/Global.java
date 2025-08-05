package com.alibaba.android.ultron.engine.protocol;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class Global extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object data;

    static {
        kge.a(775756199);
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        } else {
            this.data = obj;
        }
    }
}
