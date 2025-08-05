package com.taobao.android.detail.ttdetail.utils;

import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class bs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-699481952);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.ttdetail.utils.bs.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    odg.j().a("askAll_weex");
                    return false;
                }
            });
        }
    }
}
