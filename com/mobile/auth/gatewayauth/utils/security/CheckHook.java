package com.mobile.auth.gatewayauth.utils.security;

import android.os.Process;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import tb.bgy;

/* loaded from: classes4.dex */
public class CheckHook {
    private static int O000000o = -1;
    private static int O00000Oo = -1;

    public static synchronized boolean isHookByJar() {
        synchronized (CheckHook.class) {
            if (O00000Oo == -1) {
                O00000Oo = 0;
                try {
                    HashSet<String> hashSet = new HashSet();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.endsWith(bgy.SO_EXTENSION) || readLine.endsWith(".jar")) {
                            hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        }
                    }
                    for (String str : hashSet) {
                        if (str.contains("XposedBridge.jar")) {
                            O0000Oo0.O00000o0("HookDetection, Xposed JAR found: " + str);
                            O00000Oo = 1;
                        }
                        if (str.contains("Xposed") || str.contains("xposed") || str.contains("xposed_art")) {
                            O0000Oo0.O00000o0("HookDetection, Xposed JAR found: " + str);
                            O00000Oo = 1;
                        }
                    }
                    bufferedReader.close();
                } catch (Exception e) {
                    O0000Oo0.O00000o0("HookDetection" + e.toString());
                }
            }
            return O00000Oo == 1;
        }
    }

    public static synchronized boolean isHookByStack() {
        StackTraceElement[] stackTrace;
        synchronized (CheckHook.class) {
            if (O000000o == -1) {
                try {
                    O000000o = 0;
                    throw new Exception("blah");
                } catch (Exception e) {
                    int i = 0;
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        if ("com.android.internal.os.ZygoteInit".equals(stackTraceElement.getClassName()) && (i = i + 1) == 2) {
                            O0000Oo0.O00000o0("HookDetection, Substrate is active on the device.");
                            O000000o = 1;
                        }
                        if ("de.robv.android.xposed.XposedBridge".equals(stackTraceElement.getClassName()) && "main".equals(stackTraceElement.getMethodName())) {
                            O0000Oo0.O00000o0("HookDetection, Xposed is active on the device.");
                            O000000o = 1;
                        }
                        if ("de.robv.android.xposed.XposedBridge".equals(stackTraceElement.getClassName()) && "handleHookedMethod".equals(stackTraceElement.getMethodName())) {
                            O0000Oo0.O00000o0("HookDetection, A method on the stack trace has been hooked using Xposed.");
                            O000000o = 1;
                        }
                    }
                }
            }
            return O000000o == 1;
        }
    }
}
