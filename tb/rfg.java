package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<? extends b>, Class<? extends b>> f33110a;
    private static Map<Class<? extends b>, b> b;

    static {
        kge.a(-988848102);
        f33110a = new HashMap();
        b = new HashMap();
    }

    public static void registerSpecialProcessor(Class<? extends b> cls, Class<? extends b> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1559c803", new Object[]{cls, cls2});
        } else {
            f33110a.put(cls, cls2);
        }
    }

    public static b<ApkUpdateContext> getProcessor(Class<? extends b> cls) {
        try {
            b<ApkUpdateContext> bVar = b.get(cls);
            if (bVar != null) {
                return bVar;
            }
            Class<? extends b> cls2 = f33110a.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            b<ApkUpdateContext> newInstance = cls.newInstance();
            b.put(cls, newInstance);
            return newInstance;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
