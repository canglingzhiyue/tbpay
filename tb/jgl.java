package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

/* loaded from: classes6.dex */
public class jgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue();
        }
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (Exception e) {
            jfj.b(e);
            return false;
        }
    }

    public static String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        if (file.exists()) {
            return e(file);
        }
        return null;
    }

    private static String e(File file) {
        FileReader fileReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("705101d", new Object[]{file});
        }
        StringBuilder sb = new StringBuilder();
        try {
            fileReader = new FileReader(file);
        } catch (IOError | IOException e) {
            jfj.b(e);
        }
        try {
            char[] cArr = new char[1024];
            while (true) {
                int read = fileReader.read(cArr, 0, 1024);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            fileReader.close();
            return sb.toString();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileReader.close();
                }
                throw th2;
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (file != null) {
            try {
                if (file.exists()) {
                    return file.delete();
                }
            } catch (Exception e) {
                jfj.b(e);
            }
        }
        return false;
    }

    public static void c(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        b(file);
    }

    public static void a(File[] fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc644de4", new Object[]{fileArr});
        } else if (fileArr != null) {
            for (File file : fileArr) {
                b(file);
            }
        }
    }

    public static File d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("dee9e72b", new Object[]{file});
        }
        if (!file.isDirectory()) {
            try {
                c(file);
                file.mkdirs();
            } catch (Exception e) {
                jfj.b(e);
            }
        }
        return file;
    }
}
