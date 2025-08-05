package com.ali.user.open.core;

import android.content.Context;
import android.content.res.Resources;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.config.AuthOption;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.Environment;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.task.InitTask;
import com.ali.user.open.core.util.Validate;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.FutureTask;
import tb.kge;

/* loaded from: classes2.dex */
public class AliMemberSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String sMasterSite;
    public static String ttid;

    static {
        kge.a(-1759223662);
    }

    public static synchronized void init(Context context, InitResultCallback initResultCallback) {
        synchronized (AliMemberSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75ebb594", new Object[]{context, initResultCallback});
            } else if (KernelContext.sdkInitialized.booleanValue()) {
                if (initResultCallback != null) {
                    initResultCallback.onSuccess();
                }
            } else {
                Validate.notNull(context, "context");
                KernelContext.applicationContext = context.getApplicationContext();
                KernelContext.executorService.postHandlerTask(new FutureTask(new InitTask(initResultCallback)));
            }
        }
    }

    public static synchronized void init(Context context, String str, InitResultCallback initResultCallback) {
        synchronized (AliMemberSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e59f0c1e", new Object[]{context, str, initResultCallback});
                return;
            }
            sMasterSite = str;
            init(context, initResultCallback);
        }
    }

    public static void turnOnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[0]);
        } else {
            ConfigManager.DEBUG = true;
        }
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls});
        }
        if (cls != null) {
            return (T) KernelContext.serviceRegistry.getService(cls, null);
        }
        return null;
    }

    public static void setMasterSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61bc31c", new Object[]{str});
        } else {
            sMasterSite = str;
        }
    }

    public static String getMasterSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d64b79a", new Object[0]) : sMasterSite;
    }

    public static void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{str});
        } else {
            ttid = str;
        }
    }

    public static void setEnvironment(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e31593", new Object[]{environment});
        } else {
            ConfigManager.getInstance().setEnvironment(environment);
        }
    }

    public static void setUUID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c2fdee", new Object[]{str});
        } else {
            KernelContext.UUID = str;
        }
    }

    public static void setAuthOption(AuthOption authOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ad55b", new Object[]{authOption});
        } else {
            KernelContext.authOption = authOption;
        }
    }

    public static void setPackageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292780", new Object[]{str});
        } else {
            KernelContext.packageName = str;
        }
    }

    public static void setResources(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f514537", new Object[]{resources});
        } else {
            KernelContext.resources = resources;
        }
    }
}
