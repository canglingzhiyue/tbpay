package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public abstract class gmv<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gmv f28386a;

    static {
        kge.a(-773351280);
    }

    public abstract boolean a(T t);

    public gmv(gmv gmvVar) {
        this.f28386a = gmvVar;
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
        }
        gmv gmvVar = this.f28386a;
        return gmvVar != null && gmvVar.a(t);
    }
}
