package com.taobao.taobaoavsdk.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import tb.ddg;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBDWInstance";

    static {
        kge.a(-1395235582);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    public static void a(ddg ddgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1687d51b", new Object[]{ddgVar, str});
        } else if (StringUtils.isEmpty(str) || ddgVar == null) {
        } else {
            try {
                ddgVar.c(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(ddg ddgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b709d5c", new Object[]{ddgVar, str});
        } else if (StringUtils.isEmpty(str) || ddgVar == null) {
        } else {
            try {
                ddgVar.b(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(ddg ddgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4059659d", new Object[]{ddgVar, str});
        } else if (StringUtils.isEmpty(str) || ddgVar == null) {
        } else {
            try {
                ddgVar.a(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (str2 == null) {
        } else {
            AVSDKLog.e(str, str2);
        }
    }

    public static String a(Exception exc) {
        StringWriter stringWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66410142", new Object[]{exc});
        }
        if (exc == null) {
            return "";
        }
        PrintWriter printWriter = null;
        try {
            try {
                stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter2 = new PrintWriter(stringWriter);
                    try {
                        exc.printStackTrace(printWriter2);
                        printWriter2.flush();
                        stringWriter.flush();
                        try {
                            stringWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        printWriter2.close();
                        return stringWriter.toString();
                    } catch (Throwable th) {
                        th = th;
                        printWriter = printWriter2;
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (printWriter != null) {
                            printWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                stringWriter = null;
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}
