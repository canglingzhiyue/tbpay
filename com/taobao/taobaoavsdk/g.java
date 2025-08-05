package com.taobao.taobaoavsdk;

import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f21339a;
    public final String b;
    public final String c;

    static {
        kge.a(1845432336);
    }

    public g(a aVar) {
        this.f21339a = aVar.f21340a;
        this.b = aVar.b;
        this.c = aVar.c.toString();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f21340a;
        public String b;
        public final StringBuilder c = new StringBuilder();

        static {
            kge.a(-1763911961);
        }

        public a(String str) {
            this.b = str;
            this.f21340a = str;
        }

        public a a(long j, long j2, long j3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("783e8510", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            }
            if (this.c.length() > 0) {
                this.c.append('.');
            }
            StringBuilder sb = this.c;
            sb.append(j2);
            sb.append('_');
            sb.append(j3);
            return this;
        }

        public a a(VariationSet variationSet) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c5a25931", new Object[]{this, variationSet}) : a(variationSet.getExperimentId(), variationSet.getExperimentReleaseId(), variationSet.getExperimentBucketId());
        }

        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("e9d038a1", new Object[]{this}) : new g(this);
        }
    }
}
