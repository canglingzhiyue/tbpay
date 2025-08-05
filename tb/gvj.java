package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.h;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.gvb;

/* loaded from: classes.dex */
public class gvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Set<a>> f28511a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f28514a;
        public final String b;
        public long c;
        public long d;

        public a(String str, String str2) {
            this.f28514a = str;
            this.b = str2;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            long j = this.c;
            if (j > 0) {
                long j2 = this.d;
                if (j2 > 0 && j2 >= j) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28514a.equals(aVar.f28514a)) {
                return this.b.equals(aVar.b);
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.f28514a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : h.a(".report_custom_dag_point");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, System.currentTimeMillis(), 0L);
        }
    }

    public static void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            if (!a()) {
                return;
            }
            gvb.b.f28506a.submit(new Runnable() { // from class: tb.gvj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Set<a> set;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (gvj.f28511a != null && (set = gvj.f28511a.get(str)) != null) {
                        a aVar = new a(str, str2);
                        for (a aVar2 : set) {
                            if (aVar.equals(aVar2)) {
                                aVar2.d = currentTimeMillis;
                                gsl.b("TaoTrace", "update point {%s,%s}'s duration:[%d, %d] result:%b", str, str2, Long.valueOf(aVar2.c), Long.valueOf(currentTimeMillis), true);
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    public static void a(final String str, final String str2, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6998f6fc", new Object[]{str, str2, new Long(j), new Long(j2)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if ((j2 > 0 && j > j2) || !a()) {
                return;
            }
            gvb.b.f28506a.submit(new Runnable() { // from class: tb.gvj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (gvj.f28511a == null) {
                        gvj.f28511a = new LinkedHashMap();
                    }
                    Set<a> set = gvj.f28511a.get(str);
                    a aVar = new a(str, str2);
                    aVar.c = j;
                    aVar.d = j2;
                    if (set != null) {
                        gsl.b("TaoTrace", "add point {%s,%s}'s duration:[%d, %d] result:%b", str, str2, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(set.add(aVar)));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(aVar);
                    gsl.b("TaoTrace", "add point {%s,%s}'s duration:[%d, %d] result:%b", str, str2, Long.valueOf(j), Long.valueOf(j2), true);
                    gvj.f28511a.put(str, hashSet);
                }
            });
        }
    }
}
