package com.ali.user.open.core.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class CallbackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<Integer, Object> staticCallbacks;

    static {
        kge.a(-1389642002);
        staticCallbacks = new HashMap();
    }

    public static synchronized void registerCallback(int i, Object obj) {
        synchronized (CallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dea1e730", new Object[]{new Integer(i), obj});
                return;
            }
            if (obj != null) {
                staticCallbacks.put(Integer.valueOf(i), obj);
            }
        }
    }

    public static synchronized Object getCallback(Integer num) {
        synchronized (CallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8c6bad5d", new Object[]{num});
            }
            return staticCallbacks.get(num);
        }
    }

    public static void unregisterCallback(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12081f5b", new Object[]{new Integer(i)});
        } else {
            staticCallbacks.remove(Integer.valueOf(i));
        }
    }
}
