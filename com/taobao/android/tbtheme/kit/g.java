package com.taobao.android.tbtheme.kit;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BLUR_HEIGHT_DP = 20;
    public static final int DEFAULT_COVER_BLUR_HEIGHT_DP = 30;
    public static final int TYPE_ACTION_BAR = 1;
    public static final int TYPE_HEADER = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f15437a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;

    static {
        kge.a(-717514133);
    }

    public g(String str, int i) {
        this.f15437a = str;
        this.c = i;
    }

    public g(String str, int i, int i2) {
        this.f15437a = str;
        this.b = i;
        this.c = i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ThemeConfig{biz='" + this.f15437a + "', viewType=" + this.b + ", height=" + this.c + ", skinHeight=" + this.d + ", minHeight=" + this.e + ", useConvert=" + this.f + ", coverColor=" + this.g + ", coverHeight=" + this.h + ", useBlur=" + this.i + ", blurHeight=" + this.j + '}';
    }
}
