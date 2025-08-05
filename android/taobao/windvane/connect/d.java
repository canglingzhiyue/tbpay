package android.taobao.windvane.connect;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-8173811);
    }

    public void onError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
        }
    }

    public abstract void onFinish(T t, int i);
}
