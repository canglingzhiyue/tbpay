package com.taobao.android.dinamicx.model;

import android.support.v4.util.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class b<E> extends LongSparseArray<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(334520880);
    }

    public b() {
    }

    public b(int i) {
        super(i);
    }

    public b(b<E> bVar) {
        a(bVar);
    }

    public void a(b<E> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855fd370", new Object[]{this, bVar});
        } else if (bVar != null) {
            for (int i = 0; i < bVar.size(); i++) {
                put(bVar.keyAt(i), bVar.valueAt(i));
            }
        }
    }
}
