package com.taobao.android.virtual_thread.adapter.task;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class SharedHandlerThread extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-372896861);
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b79acd14", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // java.lang.Thread
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    public SharedHandlerThread(String str) {
        super(str);
        super.start();
    }
}
