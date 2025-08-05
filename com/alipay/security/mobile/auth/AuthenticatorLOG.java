package com.alipay.security.mobile.auth;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthenticatorLOG {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = true;
    private static final String DEVICE_TAG = "ifaa_device";
    private static final String FACE_TAG = "ifaa_face";
    private static final String FP_TAG = "ifaa_fingerprint";
    private static final String TAG = "wearable";

    public static void error(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf860c6", new Object[]{th});
        } else {
            log_e(FP_TAG, getStackString(th));
        }
    }

    public static void error(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{str});
        } else {
            log_e(FP_TAG, str);
        }
    }

    public static void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
        } else {
            log_e(FP_TAG, getStackString(th));
        }
    }

    public static void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
        } else {
            log_e(FP_TAG, str2);
        }
    }

    public static void debug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966c00a4", new Object[]{str});
        } else {
            log_i(TAG, str);
        }
    }

    public static void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
        } else {
            log_i(str, str2);
        }
    }

    public static synchronized void fpInfo(String str) {
        String name;
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c575a929", new Object[]{str});
                return;
            }
            try {
                name = Thread.currentThread().getName();
            } catch (Exception unused) {
            }
            log_i(FP_TAG, name + ", " + str);
        }
    }

    public static synchronized void fpInfo(Throwable th) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdae4436", new Object[]{th});
            } else {
                log_e(FP_TAG, getStackString(th));
            }
        }
    }

    public static synchronized void faceInfo(String str) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6898d0fc", new Object[]{str});
            } else {
                log_i(FACE_TAG, str);
            }
        }
    }

    public static synchronized void faceInfo(Throwable th) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45c5a783", new Object[]{th});
            } else {
                log_e(FACE_TAG, getStackString(th));
            }
        }
    }

    public static synchronized void faceErr(String str) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54c7f659", new Object[]{str});
            } else {
                log_e(FACE_TAG, str);
            }
        }
    }

    public static synchronized void devInfo(String str) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fc048b4", new Object[]{str});
            } else {
                log_i(DEVICE_TAG, str);
            }
        }
    }

    public static synchronized void devInfo(Throwable th) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efaa74cb", new Object[]{th});
            } else {
                log_e(DEVICE_TAG, getStackString(th));
            }
        }
    }

    public static synchronized void devErr(String str) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4376a7a1", new Object[]{str});
            } else {
                log_e(DEVICE_TAG, str);
            }
        }
    }

    public static String getStackString(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36f2ec55", new Object[]{th}) : Log.getStackTraceString(th);
    }

    private static synchronized void log_i(String str, String str2) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa6eea49", new Object[]{str, str2});
            }
        }
    }

    private static synchronized void log_e(String str, String str2) {
        synchronized (AuthenticatorLOG.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7ee3e45", new Object[]{str, str2});
            } else {
                Log.e(str, str2);
            }
        }
    }
}
