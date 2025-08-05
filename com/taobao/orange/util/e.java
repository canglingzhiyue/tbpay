package com.taobao.orange.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public a f18605a = new a();

    static {
        kge.a(614554583);
    }

    /* loaded from: classes.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f18606a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public long g;
        public long h;
        public long i;

        static {
            kge.a(1389472695);
        }

        public a() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PerformanceStat{bootType='" + this.f18606a + "', downgradeType='" + this.b + "', monitorType='" + this.c + "', requestCount='" + this.d + "', persistCount='" + this.e + "', restoreCount='" + this.f + "', persistTime='" + this.g + "', restoreTime='" + this.h + "', ioTime='" + this.i + "'}";
        }
    }
}
