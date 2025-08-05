package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);

        void a(byte[] bArr);
    }

    static {
        kge.a(-2083994934);
    }

    public abstract void a(String str, a aVar);

    public void a(String str, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ea9365", new Object[]{this, str, new Boolean(z), aVar});
        }
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        return null;
    }
}
