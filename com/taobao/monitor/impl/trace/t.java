package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile t b;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f18209a = new ConcurrentLinkedQueue<>();

    public static t a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("35375a76", new Object[0]);
        }
        if (b == null) {
            synchronized (t.class) {
                if (b == null) {
                    b = new t();
                }
            }
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f18209a.add(str);
        }
    }

    public Object[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("1edfb20a", new Object[]{this}) : this.f18209a.toArray();
    }
}
