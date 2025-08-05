package com.uc.webview.base.io;

import android.content.Context;
import android.os.Build;
import com.taobao.themis.utils.io.i;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.io.Closeable;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipFile;
import tb.riy;

/* loaded from: classes9.dex */
public final class d {
    public static File a(File file) {
        int i = 3;
        while (true) {
            if (file.exists() || file.mkdirs()) {
                break;
            }
            i--;
            if (i <= 0) {
                Log.rInfo(i.TAG, String.format("Directory [%s] mkdir failed. (free: %s)", file.getAbsolutePath(), c(file)));
                ErrorCode.MKDIR_FAILED.report();
                break;
            }
        }
        return file;
    }

    public static File a(File file, String str) {
        return a(new File(file, str));
    }

    public static String a(Context context) {
        if (context == null) {
            return "context is null";
        }
        StringBuilder sb = new StringBuilder();
        File dirRoot = PathUtils.getDirRoot(context);
        if (dirRoot == null) {
            sb.append(dirRoot.getAbsolutePath() + " get failed");
        } else {
            sb.append(dirRoot.getAbsolutePath());
            sb.append(" (free:");
            sb.append(c(dirRoot));
            sb.append(riy.BRACKET_END_STR);
            a(sb, dirRoot, "  ", true);
        }
        return sb.toString();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str, File file) {
        a(str, file, false, (ArrayList<File>) null);
    }

    public static void a(String str, File file, boolean z, ArrayList<File> arrayList) {
        if (!file.exists()) {
            return;
        }
        Log.d(str, "recursiveDelete toDelete:" + file + "\n  onlySubFiles:" + z + "\n  notDeleteFiles:" + arrayList);
        ArrayList arrayList2 = new ArrayList(20);
        File[] listFiles = (!z || !file.isDirectory()) ? new File[]{file} : file.listFiles();
        int i = -1;
        do {
            for (File file2 : listFiles) {
                if (arrayList == null || !a(arrayList, file2)) {
                    if (!file2.isDirectory()) {
                        c(str, file2);
                    } else if (!file2.getName().replace(".", "").replace("/", "").replace(" ", "").isEmpty()) {
                        arrayList2.add(file2);
                    }
                }
            }
            i++;
            listFiles = i < arrayList2.size() ? ((File) arrayList2.get(i)).listFiles() : null;
            if (listFiles == null) {
                break;
            }
        } while (i < 256);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c(str, (File) arrayList2.get(size));
        }
    }

    public static void a(StringBuilder sb, File file) {
        a(sb, file, "  ", false);
    }

    private static void a(StringBuilder sb, File file, String str, boolean z) {
        try {
            if (!file.exists()) {
                sb.append("\n".concat(String.valueOf(str)));
                sb.append(file.getName());
                sb.append(" [Not Exists]");
            } else if (!file.isDirectory()) {
                sb.append("\n".concat(String.valueOf(str)));
                sb.append(b(file, z));
            } else {
                sb.append("\n".concat(String.valueOf(str)));
                sb.append(file.getName());
                sb.append(" [dir]");
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                String str2 = str + "  ";
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(sb, file2, str2, z);
                    } else {
                        sb.append("\n".concat(String.valueOf(str2)));
                        sb.append(b(file2, z));
                    }
                }
            }
        } catch (Throwable th) {
            sb.append("listAllFiles failed:" + Log.a(th));
        }
    }

    private static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(File file, boolean z) {
        return (z || PathUtils.getFileCoreDex(file).exists()) && PathUtils.getFileCoreLib(PathUtils.getDirCoreLib(file)).exists();
    }

    private static boolean a(ArrayList<File> arrayList, File file) {
        if (file != null && arrayList != null && arrayList.size() != 0) {
            try {
                Iterator<File> it = arrayList.iterator();
                while (it.hasNext()) {
                    File next = it.next();
                    if (next != null && file.getCanonicalPath().equals(next.getCanonicalPath())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                Log.w(i.TAG, "containsFile failed", th);
            }
        }
        return false;
    }

    private static String b(File file, boolean z) {
        try {
            long length = file.length();
            StringBuilder sb = new StringBuilder();
            sb.append(Log.a(file.lastModified()));
            sb.append(" ");
            sb.append(length);
            sb.append(" ");
            sb.append(file.getName());
            if (z && !file.isDirectory() && length > 0) {
                sb.append(" (");
                a.b b = a.b.b();
                b.b = file;
                sb.append(b.c());
                sb.append(riy.BRACKET_END_STR);
            }
            return sb.toString();
        } catch (Throwable th) {
            return file.getName() + ", failed:" + th.getMessage();
        }
    }

    public static boolean b(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            a(new ZipFile(file));
            return true;
        } catch (Exception unused) {
            a((ZipFile) null);
            return false;
        } catch (Throwable th) {
            a((ZipFile) null);
            throw th;
        }
    }

    public static boolean b(String str, File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return true;
            }
            file.createNewFile();
            Log.d(str, "!!createFile [" + file.getAbsolutePath() + riy.ARRAY_END_STR);
            return true;
        } catch (Throwable th) {
            Log.w(str, "createFile failed:" + file.getAbsolutePath(), th);
            return false;
        }
    }

    public static String c(File file) {
        return String.format("%.2f MB", Float.valueOf((((float) file.getFreeSpace()) / 1024.0f) / 1024.0f));
    }

    public static boolean c(String str, File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() && (Build.VERSION.SDK_INT < 26 || !Files.isSymbolicLink(file.toPath()))) {
                return true;
            }
            file.delete();
            boolean exists = file.exists();
            StringBuilder sb = new StringBuilder("!!delete [");
            sb.append(file.getAbsolutePath());
            sb.append("] ");
            sb.append(exists ? "fail" : "ok");
            Log.d(str, sb.toString());
            return exists;
        } catch (Throwable th) {
            Log.w(str, "delete failed:" + file.getAbsolutePath(), th);
            return false;
        }
    }
}
