package com.taobao.tao.messagekit.base.monitor;

import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class PMBaseMonitor extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCommitted = false;

    static {
        kge.a(-1465780871);
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        if (this.isCommitted) {
            return false;
        }
        this.isCommitted = true;
        return true;
    }
}
