package com.alibaba.android.spindle.stage;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "stage")

    /* renamed from: a  reason: collision with root package name */
    public String f2422a;
    @JSONField(name = "s")
    public long b = 0;
    @JSONField(name = "e")
    public long c = 0;
    @JSONField(name = "tc")
    public long d = 0;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j != 0) {
            long j2 = this.c;
            if (j2 != 0) {
                this.d = j2 - j;
                return;
            }
        }
        this.d = 0L;
    }
}
