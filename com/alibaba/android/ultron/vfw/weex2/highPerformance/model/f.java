package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cew;
import tb.kge;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f2795a;
    public final long b;
    public final String c;

    static {
        kge.a(-1738926605);
    }

    public f(String str, long j, String str2) {
        this.f2795a = str;
        this.b = j;
        this.c = str2;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2796a = "";
        private long b = cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        private String c = "none";

        static {
            kge.a(85019082);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed94a317", new Object[]{this, str});
            }
            this.f2796a = str;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bdc69aad", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3335e5b6", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("c43325fe", new Object[]{this}) : new f(this.f2796a, this.b, this.c);
        }
    }
}
