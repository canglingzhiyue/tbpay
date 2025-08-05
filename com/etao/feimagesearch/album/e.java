package com.etao.feimagesearch.album;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6494a;
    private int b;
    private final Bitmap c;
    private PhotoFrom.Values d;
    private KakaLibImageWrapper e;
    private String f;
    private int g;

    static {
        kge.a(-542086732);
    }

    public e(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper) {
        kotlin.jvm.internal.q.c(bitmap, "bitmap");
        this.f6494a = str;
        this.c = bitmap;
        this.b = i;
        this.d = values;
        this.g = i2;
        this.f = str2;
        this.e = kakaLibImageWrapper;
    }

    public /* synthetic */ e(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper, int i3, kotlin.jvm.internal.o oVar) {
        this((i3 & 1) != 0 ? null : str, bitmap, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : values, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : kakaLibImageWrapper);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6494a;
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final PhotoFrom.Values d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoFrom.Values) ipChange.ipc$dispatch("3be7c89d", new Object[]{this}) : this.d;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final void a(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f01e902", new Object[]{this, kakaLibImageWrapper});
        } else {
            this.e = kakaLibImageWrapper;
        }
    }

    public final KakaLibImageWrapper e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KakaLibImageWrapper) ipChange.ipc$dispatch("e7068604", new Object[]{this}) : this.e;
    }
}
