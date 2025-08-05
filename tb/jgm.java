package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class jgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f29538a;

    static {
        HashSet hashSet = new HashSet();
        f29538a = hashSet;
        hashSet.add("main");
        f29538a.add("radio");
        f29538a.add("system");
        f29538a.add("events");
        f29538a.add("crash");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : a(null, i);
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("logcat -b  ");
        sb.append("crash");
        sb.append(": \n");
        if (i < 0) {
            sb.append("[DEBUG] custom java logcat lines count is 0!\n");
            return sb.toString();
        }
        Process b = b("crash", i);
        if (b == null) {
            sb.append("[DEBUG] exec logcat failed!\n");
            return sb.toString();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.getInputStream()));
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                int i3 = i2 + 1;
                if (i2 < i) {
                    sb.append(readLine);
                    sb.append("\n");
                }
                i2 = i3;
            }
            bufferedReader.close();
        } catch (Exception e) {
            jfj.b("print log.", e);
        }
        return sb.toString();
    }

    public static String a(String str, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)});
        }
        if (!TextUtils.isEmpty(str) && !f29538a.contains(str)) {
            str = "main";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("logcat ");
        sb.append(str);
        sb.append(": \n");
        if (i < 0) {
            sb.append("[DEBUG] custom java logcat lines count is 0!\n");
            return sb.toString();
        }
        Process b = b(str, i);
        if (b == null) {
            sb.append("[DEBUG] exec logcat failed!\n");
            return sb.toString();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.getInputStream()));
            i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (Exception e) {
                            e = e;
                            jfj.b("print log.", e);
                            sb.append(String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i2), Integer.valueOf(Math.min(i, i2))));
                            return sb.toString();
                        }
                    }
                    int i3 = i2 + 1;
                    if (i2 < i) {
                        try {
                            sb.append(readLine);
                            sb.append("\n");
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    if (th != null) {
                                        bufferedReader.close();
                                    } else {
                                        bufferedReader.close();
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                    i2 = i3;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            bufferedReader.close();
        } catch (Exception e2) {
            e = e2;
            i2 = 0;
        }
        sb.append(String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i2), Integer.valueOf(Math.min(i, i2))));
        return sb.toString();
    }

    private static Process b(String str, int i) {
        List<String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Process) ipChange.ipc$dispatch("a945c806", new Object[]{str, new Integer(i)});
        }
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            if (TextUtils.isEmpty(str)) {
                c = b(i);
            } else {
                c = c(str, i);
            }
            return processBuilder.command(c).redirectErrorStream(true).start();
        } catch (Throwable th) {
            jfj.b(th);
            return null;
        }
    }

    private static List<String> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("94962acd", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogCategory.CATEGORY_LOGCAT);
        arrayList.add("-t");
        arrayList.add(String.valueOf(i));
        return arrayList;
    }

    private static List<String> c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14a42f98", new Object[]{str, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogCategory.CATEGORY_LOGCAT);
        arrayList.add("-d");
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        arrayList.add(String.valueOf(i));
        return arrayList;
    }
}
