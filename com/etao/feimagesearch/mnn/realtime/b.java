package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int UPDATE = 1;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f6785a;

    static {
        kge.a(-1935705145);
        Companion = new a(null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : this == obj || ((obj instanceof b) && q.a(this.f6785a, ((b) obj).f6785a));
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        List<c> list = this.f6785a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlgoOutput(outputList=" + this.f6785a + riy.BRACKET_END_STR;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1357342129);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public b(List<c> outputList) {
        q.c(outputList, "outputList");
        this.f6785a = outputList;
    }

    public final List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f6785a;
    }
}
