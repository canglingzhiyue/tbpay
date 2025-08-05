package com.ali.user.open.ucc.util;

import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.ucc.UccCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccCallbackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, List<LoginCallback>> trustLoginCallbacks;
    private static Map<String, List<UccCallback>> uccCallbacks;

    static {
        kge.a(-2017295642);
        trustLoginCallbacks = new HashMap();
        uccCallbacks = new HashMap();
    }

    public static synchronized void registerTrustLoginUccCallback(String str, LoginCallback loginCallback) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29215682", new Object[]{str, loginCallback});
                return;
            }
            if (loginCallback != null) {
                List<LoginCallback> list = trustLoginCallbacks.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(loginCallback);
                trustLoginCallbacks.put(str, list);
            }
        }
    }

    public static synchronized List<LoginCallback> getTrustLoginCallbackWithSite(String str) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("cb55789d", new Object[]{str});
            }
            return trustLoginCallbacks.get(str);
        }
    }

    public static synchronized void unregisterTrustLoginCallback(String str) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a78afdc3", new Object[]{str});
            } else {
                trustLoginCallbacks.remove(str);
            }
        }
    }

    public static synchronized void registerUccCallback(String str, UccCallback uccCallback) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("269a4cb9", new Object[]{str, uccCallback});
                return;
            }
            if (uccCallback != null) {
                List<UccCallback> list = uccCallbacks.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(uccCallback);
                uccCallbacks.put(str, list);
            }
        }
    }

    public static synchronized List<UccCallback> getUccCallbackWithSite(String str) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c02f8f25", new Object[]{str});
            }
            return uccCallbacks.get(str);
        }
    }

    public static synchronized void unregisterUccCallback(String str) {
        synchronized (UccCallbackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4757a92f", new Object[]{str});
            } else {
                uccCallbacks.remove(str);
            }
        }
    }
}
