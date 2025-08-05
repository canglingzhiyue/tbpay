package com.taobao.infoflow.core.utils.lang3;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class ObjectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Null NULL;

    /* loaded from: classes.dex */
    public static class Null implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 7092611880189329093L;

        static {
            kge.a(1592091345);
            kge.a(1028243835);
        }

        private Object readResolve() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8a474bd5", new Object[]{this}) : ObjectUtils.NULL;
        }
    }

    static {
        kge.a(1773394234);
        NULL = new Null();
    }

    public static boolean a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63135cd", new Object[]{objArr})).booleanValue();
        }
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        } else if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        } else if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        } else {
            if (!(obj instanceof Map)) {
                return false;
            }
            return ((Map) obj).isEmpty();
        }
    }
}
