package com.alibaba.security.ccrc.service.build;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.akt;

/* loaded from: classes3.dex */
public class N {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final float f3261a = 3.0f;
    public static final float b = 1048576.0f;
    public final List<Float> c = new ArrayList();

    public N() {
        this.c.add(Float.valueOf(50.0f));
        List<Float> list = this.c;
        Float valueOf = Float.valueOf(100.0f);
        list.add(valueOf);
        this.c.add(Float.valueOf(150.0f));
        this.c.add(valueOf);
    }

    public C1268za a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C1268za) ipChange.ipc$dispatch("c192462d", new Object[]{this, bitmap});
        }
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            if (bitmap.getConfig() == null) {
                return new C1268za("image size error: bitmap config 为空", 1);
            }
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            if (bitmap.getByteCount() >= a() * 1048576.0f) {
                StringBuilder a2 = Yb.a("image size error: bitmap 大小过大： ");
                a2.append(a());
                return new C1268za(a2.toString(), 2);
            } else if (max / min >= 3.0f) {
                StringBuilder a3 = Yb.a("image size error: bitmap 长宽比过大： ");
                a3.append(bitmap.getWidth());
                a3.append(" ");
                a3.append(bitmap.getHeight());
                return new C1268za(a3.toString(), 3);
            } else {
                return new C1268za(null, 0);
            }
        }
        return new C1268za("image size error: bitmap 为空", -1);
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        List<Float> j = Kb.b().j();
        if (j == null) {
            j = this.c;
        }
        int a2 = akt.a();
        if (a2 == 2) {
            return j.get(0).floatValue();
        }
        if (a2 == 1) {
            return j.get(1).floatValue();
        }
        if (a2 == 0) {
            return j.get(2).floatValue();
        }
        return j.get(3).floatValue();
    }
}
