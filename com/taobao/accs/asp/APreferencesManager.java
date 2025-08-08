package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class APreferencesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "APreferencesManager";
    private static final AtomicBoolean isInit;
    private static Context sContext;
    private static final HashMap<String, SharedPreferences> sSharedPrefsCache;

    static {
        kge.a(747720539);
        sSharedPrefsCache = new HashMap<>();
        isInit = new AtomicBoolean(false);
    }

    private APreferencesManager() {
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("327315e9", new Object[]{context, str, new Integer(i)});
        }
        if (Constants.SP_FILE_NAME.equals(str) && com.taobao.accs.utl.a.f()) {
            sharedPreferences = l.k(context);
        } else {
            sharedPreferences = context.getSharedPreferences(str, i);
        }
        return replaceSharePreferences(context, str, sharedPreferences);
    }

    public static SharedPreferences replaceSharePreferences(Context context, String str, SharedPreferences sharedPreferences) {
        SharedPreferences sharedPreferences2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1dec50da", new Object[]{context, str, sharedPreferences});
        }
        if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("SharedPreferences name can not be empty");
        }
        if (context != null && !UtilityImpl.isDualApp(context)) {
            init(context);
            if (l.c(context) && !StringUtils.isEmpty(f.a()) && PrefsIPCChannel.getInstance().isCoreProcessReady()) {
                synchronized (APreferencesManager.class) {
                    sharedPreferences2 = sSharedPrefsCache.get(str);
                    if (sharedPreferences2 == null) {
                        if (f.c()) {
                            sharedPreferences2 = new c(context, str, sharedPreferences);
                        } else {
                            sharedPreferences2 = new d(context, str, sharedPreferences);
                        }
                        sSharedPrefsCache.put(str, sharedPreferences2);
                    }
                }
                return sharedPreferences2;
            }
        }
        return sharedPreferences;
    }

    public static SharedPreferences getMultiProcessSharedPreferences(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("2c8a136c", new Object[]{str}) : getSharedPreferences(sContext, str, 0);
    }

    private static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!isInit.compareAndSet(false, true)) {
        } else {
            sContext = context;
            PrefsIPCChannel.getInstance().register(context);
        }
    }

    public static void recoverPreferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25debd7b", new Object[0]);
            return;
        }
        synchronized (APreferencesManager.class) {
            try {
                for (SharedPreferences sharedPreferences : sSharedPrefsCache.values()) {
                    if (sharedPreferences instanceof d) {
                        ((d) sharedPreferences).c();
                    }
                }
            }
        }
    }
}
