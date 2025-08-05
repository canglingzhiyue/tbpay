package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g;
import tb.kge;

/* loaded from: classes5.dex */
public class o implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-253062249);
        kge.a(1324300470);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g
    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : com.taobao.android.layoutmanager.adapter.impl.tbtheme.f.a(i, i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : com.taobao.android.tbtheme.c.a(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g
    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : com.taobao.android.layoutmanager.adapter.impl.tbtheme.f.a(context);
    }
}
