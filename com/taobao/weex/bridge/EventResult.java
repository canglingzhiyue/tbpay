package com.taobao.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class EventResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object result;
    private boolean success = false;

    static {
        kge.a(335641324);
    }

    public void onCallback(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff8b8e7", new Object[]{this, obj});
            return;
        }
        this.success = true;
        this.result = obj;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.success;
    }

    public Object getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5be12058", new Object[]{this}) : this.result;
    }
}
