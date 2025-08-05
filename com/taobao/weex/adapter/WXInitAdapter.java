package com.taobao.weex.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.j;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class WXInitAdapter implements IWXInitTaskAdapter, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean inited;

    static {
        kge.a(-815329117);
        kge.a(1037095307);
        kge.a(1028243835);
        inited = false;
    }

    @Override // com.taobao.weex.adapter.IWXInitTaskAdapter
    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue() : inited;
    }

    @Override // com.taobao.weex.adapter.IWXInitTaskAdapter
    public void doInit(IWXInitTaskAdapter.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f866f21", new Object[]{this, callback});
            return;
        }
        inited = true;
        TLog.loge("Weex", "Weex", "trigger compensation init in WXInitAdapter");
        j.a(null, true, false, true, callback);
    }
}
