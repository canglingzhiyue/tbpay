package com.flybird.deploy;

import android.os.ConditionVariable;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.b;
import tb.cum;

/* loaded from: classes4.dex */
public final class c implements cum<b.a, Void, Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a[] f7210a;
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ Throwable[] c;

    public c(b.a[] aVarArr, ConditionVariable conditionVariable, Throwable[] thArr) {
        this.f7210a = aVarArr;
        this.b = conditionVariable;
        this.c = thArr;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Void, java.lang.Object] */
    @Override // tb.cum
    public Void apply(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, aVar});
        }
        this.f7210a[0] = aVar;
        this.b.open();
        return null;
    }

    @Override // tb.cum
    public void error(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25621cab", new Object[]{this, th});
            return;
        }
        this.c[0] = th;
        this.b.open();
    }
}
