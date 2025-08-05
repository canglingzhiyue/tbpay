package tb;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jgk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f29537a;

    public static boolean a(jdy jdyVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef2fcffd", new Object[]{jdyVar})).booleanValue();
        }
        if (f29537a == null) {
            try {
                Application a2 = jdyVar.a();
                if (jdyVar.d().a("addMoreBlackInfo", false) && Build.VERSION.SDK_INT <= 30) {
                    if (a(a2, a2.getCacheDir().getAbsolutePath()) && a(jdyVar.c()) && a(a2)) {
                        z = true;
                    }
                    f29537a = new AtomicBoolean(z);
                } else {
                    if (a(a2, a2.getCacheDir().getAbsolutePath()) && a(jdyVar.c())) {
                        z = true;
                    }
                    f29537a = new AtomicBoolean(z);
                }
            } catch (Throwable th) {
                jfj.b(th);
            }
        }
        AtomicBoolean atomicBoolean = f29537a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return true;
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        String[] split = str.split("/");
        Pattern compile = Pattern.compile("(([a-zA-Z0-9]{2,})\\.)+.*");
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                if (compile.matcher(str2).matches() && !str2.contains(context.getPackageName())) {
                    jfj.b("EnvUtils", str);
                    return false;
                } else if (str2.contains(context.getPackageName())) {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String a2 = jgq.a();
        if (TextUtils.isEmpty(a2) || str.contains(a2)) {
            return true;
        }
        jfj.b("EnvUtils", a2);
        return false;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            ClassLoader classLoader = ((Instrumentation) jgp.a(Class.forName(ProcessUtils.ACTIVITY_THREAD)).a("sCurrentActivityThread").a("mInstrumentation").a()).getClass().getClassLoader();
            if (classLoader instanceof PathClassLoader) {
                List list = (List) jgp.a(classLoader).a("pathList").a("nativeLibraryDirectories").a();
                if (!list.isEmpty()) {
                    return a(context, ((File) list.get(0)).getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            jfj.b(th);
        }
        return true;
    }
}
