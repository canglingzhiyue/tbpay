package com.taobao.trtc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WAIT_FOR_DEVICE_INFO_INTERRUPT = 1;
    public static final int WAIT_FOR_GET_HTTPDNS_DONE = 3;
    public static final int WAIT_FOR_START_STREAM_PROCESS_DONE = 2;
    public static final int WAIT_FOR_UNINIT_DONE = 0;

    /* renamed from: a  reason: collision with root package name */
    private Object[] f23193a = new Object[10];
    private boolean[] b = new boolean[10];

    static {
        kge.a(1082438908);
    }

    public i() {
        for (int i = 0; i < 10; i++) {
            this.f23193a[i] = new Object();
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        synchronized (this.f23193a[i]) {
            if (!this.b[i]) {
                try {
                    this.f23193a[i].wait(i2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.b[i] = false;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.f23193a[i]) {
            this.b[i] = true;
            this.f23193a[i].notify();
        }
    }
}
