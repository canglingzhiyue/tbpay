package com.taobao.android.litecreator.sdk.editor;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class AbsEditInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1722139103);
        kge.a(1028243835);
    }

    public String toJSONString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this}) : JSON.toJSONString(this);
    }
}
