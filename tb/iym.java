package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class iym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77983af9", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = iyl.a(classLoader, "pathList").get(classLoader);
            Field a2 = iyl.a(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) a2.get(obj);
            for (File file2 : fileArr) {
                if (file.equals(file2)) {
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file3 : fileArr) {
                if (!file.equals(file3)) {
                    arrayList.add(file3);
                }
            }
            a2.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77983af9", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = iyl.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) iyl.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(0, file);
            List list2 = (List) iyl.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            iyl.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) iyl.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77983af9", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        private static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = iyl.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) iyl.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(0, file);
            List list2 = (List) iyl.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            iyl.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) iyl.a(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    public static synchronized void a(ClassLoader classLoader, File file) throws Throwable {
        synchronized (iym.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77983af9", new Object[]{classLoader, file});
                return;
            }
            if (file != null && file.exists()) {
                if ((Build.VERSION.SDK_INT == 25 && Build.VERSION.PREVIEW_SDK_INT != 0) || Build.VERSION.SDK_INT > 25) {
                    c.a(classLoader, file);
                    return;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    b.a(classLoader, file);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 14) {
                        a.a(classLoader, file);
                    }
                    return;
                }
            }
            RSoLog.c("installNativeLibraryPath, folder %s is illegal" + file);
        }
    }
}
