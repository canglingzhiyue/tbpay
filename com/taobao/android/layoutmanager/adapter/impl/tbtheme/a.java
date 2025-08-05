package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f13143a = new SparseIntArray(32);

    static {
        kge.a(-239929012);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f13143a.put(i, i2);
        }
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int indexOfKey = this.f13143a.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.f13143a.valueAt(indexOfKey);
        }
        return -1;
    }
}
