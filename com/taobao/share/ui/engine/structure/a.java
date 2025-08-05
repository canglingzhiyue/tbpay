package com.taobao.share.ui.engine.structure;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject c;
    public com.taobao.share.globalmodel.a d;
    public boolean e;

    static {
        kge.a(1498391115);
    }

    public com.taobao.share.globalmodel.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.share.globalmodel.a) ipChange.ipc$dispatch("b7cbb925", new Object[]{this}) : this.d;
    }

    public void a(com.taobao.share.globalmodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8e9042", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }
}
