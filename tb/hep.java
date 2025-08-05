package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public class hep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1673697869);
    }

    public static Class a(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("195e4984", new Object[]{type});
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getActualTypeArguments().length <= 0) {
            return null;
        }
        return a(parameterizedType.getActualTypeArguments()[0]);
    }
}
