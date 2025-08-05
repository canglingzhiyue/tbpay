package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends d implements Comparable<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f15668a;

    static {
        kge.a(378530093);
        kge.a(415966670);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
    }

    public a(String str, String str2, float f) {
        super(str, str2);
        this.f15668a = f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ArbitrateFloatScore{score=" + this.f15668a + ", bizName='" + this.b + "', bizCode='" + this.c + "'}";
    }

    public int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37e47c30", new Object[]{this, aVar})).intValue() : Float.compare(this.f15668a, aVar.f15668a);
    }
}
