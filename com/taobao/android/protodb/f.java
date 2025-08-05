package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class f implements d<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String[] f14707a;
    private int b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.android.protodb.e] */
    @Override // com.taobao.android.protodb.d
    public /* synthetic */ e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : b();
    }

    public f(String[] strArr) {
        this.b = 0;
        this.f14707a = strArr;
        this.b = 0;
    }

    public e b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a6fd653", new Object[]{this});
        }
        String[] strArr = this.f14707a;
        if (strArr == null || (i = this.b) >= strArr.length) {
            return null;
        }
        this.b = i + 1;
        return new e(strArr[i]);
    }
}
