package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class dce {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Object c = new Object();

    static {
        kge.a(-463312822);
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        return null;
    }

    public String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
        }
        return null;
    }

    public abstract void a(String str, String str2, int i, int i2);

    public abstract void a(dch dchVar);
}
