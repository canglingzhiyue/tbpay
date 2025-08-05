package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import java.util.Calendar;
import java.util.Date;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1109508879);
    }

    public b(String str, String str2) {
        super(str, str2);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog
    public boolean a(SmartLandingTask.ShowStrategy showStrategy, MemoryLog.LogItem logItem, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bcb37c8", new Object[]{this, showStrategy, logItem, new Long(j)})).booleanValue() : (showStrategy == null || logItem == null || showStrategy.interval > (new a(j).a() - new a(logItem.interval).a()) / a.b()) ? false : true;
    }

    /* loaded from: classes6.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f14021a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            kge.a(483257133);
            kge.a(415966670);
        }

        public static long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
            }
            return 86400000L;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public a(long j) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j));
            this.f14021a = calendar.get(1);
            this.b = calendar.get(2);
            this.c = calendar.get(5);
            this.d = calendar.get(11);
            this.e = calendar.get(12);
            this.f = calendar.get(13);
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa00eaf4", new Object[]{this, aVar})).intValue() : Long.compare(c(), aVar.c());
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f14021a + "-" + (this.b + 1) + "-" + this.c + " " + this.d + ":" + this.e + ":" + this.f;
        }

        private long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.f14021a, this.b, this.c, this.d, this.e, this.f);
            calendar.setLenient(true);
            return calendar.getTimeInMillis();
        }

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.f14021a, this.b, this.c, 0, 0, 0);
            calendar.setLenient(true);
            return calendar.getTimeInMillis();
        }
    }
}
