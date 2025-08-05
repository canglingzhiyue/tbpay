package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class ExtData implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object ext;

    static {
        kge.a(-937298486);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public ExtData(Object obj) {
        this.ext = obj;
    }

    private Object getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1d0aa780", new Object[]{this}) : this.ext;
    }
}
