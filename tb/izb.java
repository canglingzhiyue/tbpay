package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class izb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_MODULE = "AliNewDetailExtend";

    /* renamed from: a  reason: collision with root package name */
    private static iyz f29416a;

    public izb() {
        if (f29416a == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailDelegate sNDExtendHandler is null!");
        }
    }

    public static void a(iyz iyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea3594e", new Object[]{iyzVar});
        } else {
            f29416a = iyzVar;
        }
    }

    public <T extends iza> T a(Class<T> cls) {
        iyz iyzVar;
        iza a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("271c15c1", new Object[]{this, cls});
        }
        if (cls != null && (iyzVar = f29416a) != null && (a2 = iyzVar.a(cls)) != null && cls.isAssignableFrom(a2.getClass())) {
            return cls.cast(a2);
        }
        return null;
    }
}
