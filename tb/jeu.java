package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jeu implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        ClassLoader contextClassLoader = thread.getContextClassLoader();
        if (contextClassLoader != null) {
            hashMap.put("context_class_loader", contextClassLoader.getClass().getName() + "@" + contextClassLoader.toString());
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != contextClassLoader && classLoader != null) {
            hashMap.put("class_loader", classLoader.getClass().getName() + "@" + classLoader);
        }
        if (th instanceof NoClassDefFoundError) {
            hashMap.put("class_info", a(thread, th));
        }
        return hashMap;
    }

    private String a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb4cfe24", new Object[]{this, thread, th});
        }
        StringBuilder sb = new StringBuilder();
        Throwable a2 = jgt.a(th);
        if ((a2 instanceof ClassNotFoundException) || (a2 instanceof NoClassDefFoundError)) {
            String message = a2.getMessage();
            try {
                Class.forName(message, false, getClass().getClassLoader());
                sb.append("found by default class_loader:" + message);
                sb.append("\n");
            } catch (Throwable unused) {
            }
            try {
                Class.forName(message, false, thread.getContextClassLoader());
                sb.append("found by context_class_loader:" + message);
                sb.append("\n");
            } catch (Exception unused2) {
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                try {
                    ClassLoader classLoader = Class.forName(stackTrace[0].getClassName()).getClassLoader();
                    sb.append(classLoader.getClass().getName() + "@" + classLoader);
                    sb.append("\n");
                    Class.forName(message, false, classLoader);
                    sb.append("found by caller_class_loader:" + message);
                    sb.append("\n");
                } catch (Exception unused3) {
                }
            }
        }
        return sb.toString();
    }
}
