package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class crx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final RectF f26483a;

    public static final float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : f * f;
    }

    static {
        kge.a(-585072027);
        f26483a = new RectF();
    }

    public static final RectF a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("f7d777ff", new Object[0]) : f26483a;
    }
}
