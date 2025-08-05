package com.taobao.android.tbuprofen.common;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.h;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENGINE_LIB_NAME = "tbuprofen-engine";

    static {
        kge.a(1396768698);
    }

    public static File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{context});
        }
        com.taobao.android.tbuprofen.log.c.d("TBPFileManager", "Find TBP Plugin Library.....", new Object[0]);
        try {
            d(context);
            if (h.b().a()) {
                String b = h.b().b("tbuprofen-agent-v1");
                if (!TextUtils.isEmpty(b)) {
                    File file = new File(b);
                    if (!file.equals(c(context)) && file.exists() && file.length() > 0) {
                        com.taobao.android.tbuprofen.log.c.d("TBPFileManager", "Get agent from remote", new Object[0]);
                        return file;
                    }
                }
            }
            File file2 = new File(b(context), "tbuprofen-agent-v1.so");
            if (!file2.exists() || file2.length() == 0) {
                File c = c(context);
                if (c == null) {
                    com.taobao.android.tbuprofen.log.c.b("TBPFileManager", "Can't find the agent in apk!", new Object[0]);
                    return null;
                }
                Files.copy(Paths.get(c.getAbsolutePath(), new String[0]), Paths.get(file2.getAbsolutePath(), new String[0]), new CopyOption[0]);
                com.taobao.android.tbuprofen.log.c.d("TBPFileManager", "Copy the tbp agent library from " + c.getAbsolutePath() + "===>" + file2.getAbsolutePath(), new Object[0]);
            }
            return file2;
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a("TBPFileManager", e, "GetAgentLib Exception", new Object[0]);
            return null;
        }
    }

    public static File b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{context});
        }
        File file = new File(context.getFilesDir(), "tbuprofen");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File c(Context context) {
        String str;
        try {
            str = (String) ClassLoader.class.getDeclaredMethod("findLibrary", String.class).invoke(context.getClassLoader(), "tbuprofen-agent-v1");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    private static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            File file = new File(context.getFilesDir(), "jvmti");
            if (!file.exists() || !file.isDirectory()) {
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }
}
