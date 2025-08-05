package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import tb.dvs;

/* loaded from: classes4.dex */
public class dve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f27014a;
        public long b;
        public String c;
        public long d;
        public String e;
        public int f;
        public String g;

        static {
            kge.a(193422295);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(a aVar);
    }

    static {
        kge.a(925116567);
    }

    public static /* synthetic */ boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f73d7e75", new Object[]{str, bVar})).booleanValue() : b(str, bVar);
    }

    public static void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8195327", new Object[]{bVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            dvs.a("/proc/self/maps", new dvs.a() { // from class: tb.dve.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dvs.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (dve.a(str, b.this)) {
                    } else {
                        TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "readFromProcess: parse line error, line " + str);
                    }
                }
            });
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "readFromProcess: read maps complete, consume time " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "readFromProcess: read maps with exception " + th);
            dvp.a("ReadProcMaps_" + th, "");
        }
    }

    private static boolean b(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75153a76", new Object[]{str, bVar})).booleanValue();
        }
        String[] split = str.split("\\s+");
        if (split.length != 6) {
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "parse: maps item len is wrong, item length " + split.length);
            return false;
        } else if (TextUtils.isEmpty(split[0])) {
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "parse: maps address is wrong, addresses is " + split[0]);
            return false;
        } else {
            String[] split2 = split[0].split("-");
            if (split2.length != 2) {
                TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "parse: maps address is wrong, addresses is " + split[0]);
                return false;
            }
            a aVar = new a();
            aVar.f27014a = a(split2[0], -1L);
            aVar.b = a(split2[1], -1L);
            aVar.c = split[1];
            aVar.d = a(split[2], -1L);
            aVar.e = split[3];
            aVar.f = a(split[4], -1);
            aVar.g = split[5];
            if (bVar != null) {
                bVar.a(aVar);
            }
            return true;
        }
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "safeParseInt: parse string error, input string " + str);
            return i;
        }
    }

    private static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            TLog.loge(CacheCleaner.MODULE, "ProcessMapsHelper", "safeParseHex: parse string error, input string " + str);
            return j;
        }
    }
}
