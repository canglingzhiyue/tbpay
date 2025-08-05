package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class gvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f28517a;
    private final Object b;

    public gvn(Class<?> cls, Object obj) {
        this.f28517a = cls;
        this.b = obj;
    }

    public boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
        }
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        Object a2 = a(this.f28517a, "isActivityEmbedded", obj, new Class[]{Activity.class}, new Object[]{activity});
        TLog.loge("TBAutoSize.EmbeddingComponent", "isActivityEmbedded: activity=" + activity + " result=" + a2);
        if (!(a2 instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    private static Object a(Class<?> cls, String str, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception e) {
            TLog.loge("TBAutoSize.EmbeddingComponent", "invokeMethod: ", e);
            return null;
        }
    }
}
