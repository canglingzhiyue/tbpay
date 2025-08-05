package com.taobao.android.weex.instance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.g;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexXRInstance extends WeexDOMInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-774955633);
    }

    public static WeexXRInstance create(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexXRInstance) ipChange.ipc$dispatch("afc73bb4", new Object[]{gVar});
        }
        WeexXRInstance weexXRInstance = new WeexXRInstance(gVar);
        postInstanceCreate(weexXRInstance, gVar.l);
        return weexXRInstance;
    }

    private WeexXRInstance(g gVar) {
        super(gVar);
    }
}
