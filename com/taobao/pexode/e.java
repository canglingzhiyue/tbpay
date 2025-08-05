package com.taobao.pexode;

import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.a;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f18702a;
    public a b;
    public String c;

    static {
        kge.a(-436004775);
    }

    public static e a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("223c0081", new Object[]{bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        e eVar = new e();
        eVar.f18702a = bitmap;
        if (Build.VERSION.SDK_INT > 23) {
            eVar.f18702a.prepareToDraw();
        }
        return eVar;
    }

    public static e a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("f8885410", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        e eVar = new e();
        eVar.b = aVar;
        return eVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PexodeResult(bitmap=" + this.f18702a + ", animated=" + this.b + riy.BRACKET_END_STR;
    }
}
