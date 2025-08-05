package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2793a;
    public final List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a> b;
    public final List<d> c;
    public final List<g> d;
    public final List<h> e;

    static {
        kge.a(-1138901054);
    }

    private e(String str, List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a> list, List<d> list2, List<g> list3, List<h> list4) {
        this.f2793a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2794a;
        private List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a> b;
        private List<d> c;
        private List<g> d;
        private List<h> e;

        static {
            kge.a(-965626727);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed942eb8", new Object[]{this, str});
            }
            this.f2794a = str;
            return this;
        }

        public a a(List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("279548b1", new Object[]{this, list});
            }
            this.b = list;
            return this;
        }

        public a b(List<d> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f94a710", new Object[]{this, list});
            }
            this.c = list;
            return this;
        }

        public a c(List<g> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b794056f", new Object[]{this, list});
            }
            this.d = list;
            return this;
        }

        public a d(List<h> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff9363ce", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c43325df", new Object[]{this}) : new e(this.f2794a, this.b, this.c, this.d, this.e);
        }
    }
}
