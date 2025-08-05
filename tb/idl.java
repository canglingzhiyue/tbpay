package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class idl<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1631499411);
    }

    public abstract T a(boolean z);

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public abstract void a(Context context);
}
