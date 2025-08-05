package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class byy {
    static {
        kge.a(1590475184);
    }

    public static String a() {
        try {
            return a("/proc/self/cmdline").trim();
        } catch (Exception e) {
            bzd.b("get my process name by cmd line failure .", e);
            return null;
        }
    }

    public static String a(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            return simpleDateFormat.format(new Date(j));
        } catch (Exception e) {
            bzd.b("getGMT8Time", e);
            return "";
        }
    }

    public static String a(Context context) {
        if (context != null) {
            int myPid = Process.myPid();
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static String a(File file) {
        List<String> a2 = a(file, 1);
        return !a2.isEmpty() ? a2.get(0) : "";
    }

    public static String a(String str) {
        return a(new File(str));
    }

    public static List<String> a(File file, int i) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2++;
                        arrayList.add(readLine);
                        if (i > 0 && i2 >= i) {
                            break;
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        bzd.b("readLine", e);
                        a(bufferedReader);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        a(bufferedReader);
                        throw th;
                    }
                }
                a(bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        return arrayList;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                bzd.b("close.", e);
            }
        }
    }

    public static String b() {
        return b(new File("/proc/self/status")).trim();
    }

    public static String b(Context context) {
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Integer num = null;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                num = Integer.valueOf((int) (memoryInfo.threshold >> 10));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JavaTotal:");
            sb.append(Runtime.getRuntime().totalMemory());
            sb.append(" JavaFree:");
            sb.append(Runtime.getRuntime().freeMemory());
            sb.append(" NativeHeap:");
            sb.append(Debug.getNativeHeapSize());
            sb.append(" NativeAllocated:");
            sb.append(Debug.getNativeHeapAllocatedSize());
            sb.append(" NativeFree:");
            sb.append(Debug.getNativeHeapFreeSize());
            sb.append(" threshold:");
            if (num != null) {
                str = num + " KB";
            } else {
                str = "not valid";
            }
            sb.append(str);
            return sb.toString();
        } catch (Exception e) {
            bzd.b("dumpMeminfo", e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static String b(File file) {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        r1 = null;
        InputStreamReader inputStreamReader2 = null;
        inputStreamReader = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    InputStreamReader inputStreamReader3 = new InputStreamReader(fileInputStream);
                    try {
                        char[] cArr = new char[4096];
                        while (true) {
                            int read = inputStreamReader3.read(cArr);
                            if (-1 == read) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        a(inputStreamReader3);
                        inputStreamReader = cArr;
                    } catch (Exception e) {
                        inputStreamReader2 = inputStreamReader3;
                        e = e;
                        bzd.b("readFully.", e);
                        a(inputStreamReader2);
                        inputStreamReader = inputStreamReader2;
                        a(fileInputStream);
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader3;
                        a(inputStreamReader);
                        a(fileInputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            a(fileInputStream);
            return sb.toString();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String c() {
        return b(new File("/proc/meminfo")).trim();
    }

    public static String c(Context context) {
        return "null";
    }
}
