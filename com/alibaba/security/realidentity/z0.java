package com.alibaba.security.realidentity;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class z0 implements y0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.realidentity.y0
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.y0
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.y0
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }
}
