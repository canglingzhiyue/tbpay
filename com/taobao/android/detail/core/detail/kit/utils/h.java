package com.taobao.android.detail.core.detail.kit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import mtopsdk.mtop.global.SDKUtils;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "JhsTimeFormater";

    static {
        kge.a(1255095222);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.JhsTimeFormater");
    }

    public static a a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("890e3298", new Object[]{new Long(j)});
        }
        long a2 = a();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        a a3 = a(a2, j);
        Date date = new Date(j);
        if (a3.c > 0) {
            if (a.a(a3) == 0) {
                a3.f9551a = "距" + simpleDateFormat.format(date) + "开抢";
                a3.e = a(a3);
            } else if (a.a(a3) == 1) {
                a3.f9551a = "明天" + simpleDateFormat.format(date) + "开抢";
                a3.e = a(a3);
            } else if (a.a(a3) == 2) {
                a3.f9551a = "后天" + simpleDateFormat.format(date) + "开抢";
                a3.e = a(a3);
            } else if (a.a(a3) > 2) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("M月d日\nHH:mm");
                a3.f9551a = simpleDateFormat2.format(date) + " 开抢";
                a3.b = false;
            }
        } else {
            a3.f9551a = "";
            a3.b = false;
        }
        com.taobao.android.detail.core.utils.i.b(TAG, "预热文案 : " + a3.f9551a + " " + c(a3.d));
        return a3;
    }

    public static a b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("15fb49b7", new Object[]{new Long(j)});
        }
        a a2 = a(a(), j);
        if (a2.c > 0) {
            if (0 <= a.b(a2) && a.b(a2) < 72) {
                a2.f9551a = "距结束仅剩";
                a2.e = a(a2.a(), a2.b(), a2.c(), a2.d());
            } else if (a.b(a2) >= 72) {
                a2.f9551a = "仅剩" + a.c(a2) + "天";
                a2.d = a2.c - ((((a.c(a2) * 24) * 60) * 60) * 1000);
                a2.e = a(String.valueOf(a.d(a2) - (a.c(a2) * 24)), a2.b(), a2.c(), a2.d());
            } else {
                a2.f9551a = "";
                a2.b = false;
            }
        } else {
            a2.f9551a = "";
            a2.b = false;
        }
        com.taobao.android.detail.core.utils.i.b(TAG, "开团文案 : " + a2.f9551a + " , 倒计时：" + c(a2.d));
        return a2;
    }

    private static String c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c69b346", new Object[]{new Long(j)});
        }
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        return j2 + ":" + (j3 / 60000) + ":" + ((j3 % 60000) / 1000);
    }

    public static String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ea5b1fc", new Object[]{aVar}) : a(aVar.a(), aVar.b(), aVar.c(), aVar.d());
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        stringBuffer.append(".");
        stringBuffer.append(str4);
        return stringBuffer.toString();
    }

    private static a a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1273f824", new Object[]{new Long(j), new Long(j2)});
        }
        long j3 = j2 - j;
        a aVar = new a();
        aVar.c = j3;
        aVar.d = j3;
        a.a(aVar, j3 / 86400000);
        a.b(aVar, j3 / 3600000);
        a.c(aVar, j3 / 86400000);
        long j4 = j3 % 86400000;
        a.d(aVar, j4 / 3600000);
        long j5 = j4 % 3600000;
        a.e(aVar, j5 / 60000);
        long j6 = j5 % 60000;
        a.f(aVar, j6 / 1000);
        a.g(aVar, j6 % 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        a.h(aVar, (calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000);
        return aVar;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        com.taobao.android.detail.core.utils.i.a(TAG, "getNowTime: date:" + new Date());
        return (SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis();
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9551a;
        public boolean b = true;
        public long c;
        public long d;
        public String e;
        private long f;
        private long g;
        private long h;
        private long i;
        private long j;
        private long k;
        private long l;
        private long m;

        static {
            kge.a(32526998);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7993ef18", new Object[]{aVar})).longValue() : aVar.h;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b8ea6c14", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.g = j;
            return j;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6810637", new Object[]{aVar})).longValue() : aVar.f;
        }

        public static /* synthetic */ long b(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c9a038d5", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.f = j;
            return j;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("936e1d56", new Object[]{aVar})).longValue() : aVar.g;
        }

        public static /* synthetic */ long c(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("da560596", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.i = j;
            return j;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("205b3475", new Object[]{aVar})).longValue() : aVar.j;
        }

        public static /* synthetic */ long d(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eb0bd257", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.j = j;
            return j;
        }

        public static /* synthetic */ long e(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fbc19f18", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.k = j;
            return j;
        }

        public static /* synthetic */ long f(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c776bd9", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.l = j;
            return j;
        }

        public static /* synthetic */ long g(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d2d389a", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.m = j;
            return j;
        }

        public static /* synthetic */ long h(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2de3055b", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.h = j;
            return j;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a(this.f);
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a(this.k);
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : a(this.l);
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : String.valueOf(this.m / 100);
        }

        public String a(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)}) : String.format(Locale.getDefault(), "%02d", Long.valueOf(j));
        }
    }
}
