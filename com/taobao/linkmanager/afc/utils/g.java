package com.taobao.linkmanager.afc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import tb.kge;

/* loaded from: classes7.dex */
public class g<V> extends FutureTask<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1136836910);
    }

    public g() {
        super(new Callable<V>() { // from class: com.taobao.linkmanager.afc.utils.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (V) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
                }
                throw new IllegalStateException("this should never be called");
            }
        });
    }

    public void a(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, v});
        } else {
            set(v);
        }
    }
}
