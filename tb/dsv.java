package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import com.taobao.android.buy.internal.status.e.a;
import com.taobao.android.buy.internal.status.e.b;
import com.taobao.android.buy.internal.status.e.c;

/* loaded from: classes4.dex */
public abstract class dsv<EMPTY extends e.a, ERROR extends e.b, LOADING extends e.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1127267972);
    }

    public LOADING a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LOADING) ipChange.ipc$dispatch("140cdb20", new Object[]{this});
        }
        return null;
    }

    public LOADING b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LOADING) ipChange.ipc$dispatch("4dd77cff", new Object[]{this});
        }
        return null;
    }

    public ERROR c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ERROR) ipChange.ipc$dispatch("87a21ebf", new Object[]{this});
        }
        return null;
    }

    public EMPTY d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EMPTY) ipChange.ipc$dispatch("c16cc07f", new Object[]{this});
        }
        return null;
    }
}
