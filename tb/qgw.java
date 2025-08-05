package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.h;
import com.taobao.adaemon.e;
import com.taobao.adaemon.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class qgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1633353904);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Comparator<a> COMPARATOR_BY_CPU_DIFF_TIME_DESCENDING;
        public static final Comparator<a> COMPARATOR_BY_EXEC_TIME_DESC;

        /* renamed from: a  reason: collision with root package name */
        public int f32934a;
        public String b;
        public char c;
        public long d;
        public long e;
        public long f;
        public long g;
        public double h;
        public double i;

        public void a(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5279f0c3", new Object[]{this, sb});
            } else if (sb == null) {
            } else {
                sb.append(this.f32934a);
                sb.append("|");
                sb.append(this.b);
                sb.append("|");
                sb.append(l.a(this.d));
                sb.append("|");
                sb.append(l.a(this.e));
                sb.append("|");
                sb.append(this.h);
                sb.append("|");
                sb.append(this.i);
            }
        }

        static {
            kge.a(-1174028866);
            COMPARATOR_BY_CPU_DIFF_TIME_DESCENDING = $$Lambda$qgw$a$J4HESBiiFN4ApNzooB3RDUgaMBM.INSTANCE;
            COMPARATOR_BY_EXEC_TIME_DESC = $$Lambda$qgw$a$F1mZaCPhZqHmC0uxGaZP0UxOJw.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eb14300", new Object[]{aVar, aVar2})).intValue() : Long.compare(aVar2.f + aVar2.g, aVar.f + aVar.g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba80f5ff", new Object[]{aVar, aVar2})).intValue() : Double.compare(aVar2.d + aVar2.e, aVar.d + aVar.e);
        }
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3058f9f6", new Object[]{str});
        }
        String[] split = str.split(" ");
        a aVar = new a();
        try {
            if (split.length > 16) {
                aVar.f32934a = Integer.parseInt(split[0]);
                aVar.b = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
                aVar.c = (split[2] == null || split[2].length() != 1) ? '0' : split[2].charAt(0);
                aVar.d = Long.parseLong(split[13]);
                aVar.e = Long.parseLong(split[14]);
            } else {
                e.b("ProcStatParser", "parseProcStat error", "parts", split);
            }
        } catch (Throwable th) {
            e.a("ProcStatParser", "parseProcStat", th, new Object[0]);
        }
        return aVar;
    }

    public static List<a> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String str = "/proc/" + i + "/task";
            String[] list = new File(str).list();
            if (list != null) {
                for (String str2 : list) {
                    a b = b(str + "/" + str2 + "/stat");
                    if (b != null && b.d + b.e > 0) {
                        arrayList.add(b);
                    }
                }
            }
        } catch (Throwable th) {
            e.a("ProcStatParser", "readProcTaskStats", th, new Object[0]);
        }
        return arrayList;
    }

    public static String b(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        List<a> a2 = a(Process.myPid());
        if (a2.isEmpty()) {
            return null;
        }
        Collections.sort(a2, a.COMPARATOR_BY_EXEC_TIME_DESC);
        int min = Math.min(i, a2.size());
        e.b("ProcStatParser", "dumpTopThreadInfo", "len", Integer.valueOf(min));
        StringBuilder sb = new StringBuilder(min * 50);
        String str = "/proc/" + Process.myPid() + "/task/";
        BufferedReader bufferedReader2 = null;
        for (int i2 = 0; i2 < min; i2++) {
            a aVar = a2.get(i2);
            try {
                bufferedReader = new BufferedReader(new FileReader(str + aVar.f32934a + "/sched"));
                int i3 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("avg_per_cpu")) {
                            aVar.h = Double.parseDouble(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        } else if (readLine.startsWith("se.sum_exec_runtime")) {
                            aVar.i = Double.parseDouble(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        } else {
                            continue;
                        }
                        i3++;
                        continue;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            e.a("ProcStatParser", "dumpTopThreadInfo err", th, new Object[0]);
                            h.a(bufferedReader);
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            h.a(bufferedReader);
                            throw th3;
                        }
                    }
                } while (i3 != 2);
                aVar.a(sb);
                if (i2 < min - 1) {
                    sb.append(",");
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
            h.a(bufferedReader);
            bufferedReader2 = bufferedReader;
        }
        return sb.toString();
    }

    private static a b(String str) {
        BufferedReader bufferedReader;
        String readLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b88939d5", new Object[]{str});
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th) {
                th = th;
                try {
                    e.a("ProcStatParser", "readStatFile fail", th, new Object[0]);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.a("ProcStatParser", "readStatFile close", e, new Object[0]);
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e.a("ProcStatParser", "readStatFile close", e2, new Object[0]);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        if (readLine == null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                e.a("ProcStatParser", "readStatFile close", e3, new Object[0]);
            }
            return null;
        }
        a a2 = a(readLine);
        try {
            bufferedReader.close();
        } catch (IOException e4) {
            e.a("ProcStatParser", "readStatFile close", e4, new Object[0]);
        }
        return a2;
    }
}
