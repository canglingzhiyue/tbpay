package com.taobao.android.detail2.core.framework.base.media.frame;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f11471a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ImageView.ScaleType h = ImageView.ScaleType.CENTER_CROP;
    public int i;
    public int j;
    public float[] k;
    public int l;
    public int m;

    static {
        kge.a(1604700391);
    }

    public a(int i, int i2) {
        this.f11471a = i2;
        this.b = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IMediaCommentSizeObject{height=" + this.f11471a + ", width=" + this.b + ", showHeight=" + this.c + ", showWidth=" + this.d + ", showMarginTop=" + this.e + ", showPaddingBottom=" + this.f + ", type=" + this.h + ", videoWidth=" + this.i + ", videoHeight=" + this.j + '}';
    }
}
