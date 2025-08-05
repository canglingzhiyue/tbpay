package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class eoz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1422533653);
    }

    public abstract String getkey();

    public void onMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
        }
    }

    public void postMessage(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
        }
    }
}
