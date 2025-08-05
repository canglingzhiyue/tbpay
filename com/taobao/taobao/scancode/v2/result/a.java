package com.taobao.taobao.scancode.v2.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21289a;
    public int b = 0;
    public String c;
    public byte[] d;
    public String e;
    public MaType f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public int[] l;

    static {
        kge.a(1263548222);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaWapperResult [type=" + this.f21289a + ", subType=" + this.b + ", strCode=" + this.c + ", decodeBytes=" + Arrays.toString(this.d) + ", hiddenData=" + this.e + riy.ARRAY_END_STR;
    }
}
