package com.taobao.android.launch.turbo.profile;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f13015a;
    public final int b;
    public final byte[] c;

    static {
        kge.a(-2099206103);
    }

    public e(String str, int i, byte[] bArr) {
        this.f13015a = str;
        this.b = i;
        this.c = bArr;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr.length;
        }
        return -1;
    }
}
