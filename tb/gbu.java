package tb;

import android.animation.TimeInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dxv4common.exception.DXAnimationException;
import tb.gbs;

/* loaded from: classes5.dex */
public abstract class gbu<T> implements gbq<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28298a;
    public final int b;
    public final int c;
    public final int d;
    public final TimeInterpolator e;

    static {
        kge.a(-1348298121);
        kge.a(-1096866309);
    }

    public static <T> gbu<T> a(Class<T> cls, int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbu) ipChange.ipc$dispatch("8ee67e7", new Object[]{cls, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), timeInterpolator});
        }
        if (cls == Float.class) {
            return new a(i, i2, i3, i4, timeInterpolator);
        }
        throw new DXAnimationException("不支持的 DXTweenSpec 类型: " + cls.getSimpleName());
    }

    public gbu(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        this.f28298a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = timeInterpolator;
    }

    /* loaded from: classes5.dex */
    public static class a extends gbu<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-437672437);
        }

        public a(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
            super(i, i2, i3, i4, timeInterpolator);
        }

        @Override // tb.gbq
        public gbp<Float> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gbp) ipChange.ipc$dispatch("f04f4c9", new Object[]{this}) : new gbs.b(this);
        }
    }
}
