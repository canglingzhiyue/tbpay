package com.taobao.weex;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f23507a;
    private byte[] b;

    static {
        kge.a(801835686);
    }

    public h(String str) {
        this.f23507a = str;
    }

    public h(byte[] bArr) {
        this.b = bArr;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f23507a;
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        String str = this.f23507a;
        if (str != null) {
            return str.length();
        }
        byte[] bArr = this.b;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public boolean d() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f23507a) && ((bArr = this.b) == null || bArr.length == 0);
    }
}
