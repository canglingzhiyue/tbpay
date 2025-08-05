package com.alipay.mobile.intelligentdecision.model;

import android.os.Bundle;
import com.alipay.mobile.intelligentdecision.callback.IDResultListener;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DecisionTask implements Comparable<DecisionTask> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f5753a;
    public Bundle b;
    public IDResultListener c;
    public String d;
    public int e;
    public long f = System.currentTimeMillis();
    public long g;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(DecisionTask decisionTask) {
        int i = this.e;
        int i2 = decisionTask.e;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }
}
