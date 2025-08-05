package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends d implements Comparable<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15670a;

    static {
        kge.a(2114580794);
        kge.a(415966670);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, cVar})).intValue() : a(cVar);
    }

    public c(String str, String str2, int i) {
        super(str, str2);
        this.f15670a = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ArbitrateIntScore{score=" + this.f15670a + ", bizName='" + this.b + "', bizCode='" + this.c + "'}";
    }

    public int a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37e564ee", new Object[]{this, cVar})).intValue();
        }
        int i = this.f15670a;
        int i2 = cVar.f15670a;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
