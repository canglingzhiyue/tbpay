package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final csi f26486a;
    private static final csi b;

    static {
        kge.a(948278087);
        f26486a = new a();
        b = new b();
    }

    /* loaded from: classes3.dex */
    public static final class a implements csi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csi
        public float a(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c4ec1369", new Object[]{this, rectF})).floatValue();
            }
            q.c(rectF, "rectF");
            return rectF.left;
        }

        @Override // tb.csi
        public float b(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee3bf7ea", new Object[]{this, rectF})).floatValue();
            }
            q.c(rectF, "rectF");
            return rectF.right;
        }

        @Override // tb.csi
        public void a(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d896c367", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.left = f;
        }

        @Override // tb.csi
        public void b(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9436f06", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.right = f;
        }

        @Override // tb.csi
        public void c(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f01aa5", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.offset(f, 0.0f);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements csi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csi
        public float a(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c4ec1369", new Object[]{this, rectF})).floatValue();
            }
            q.c(rectF, "rectF");
            return rectF.top;
        }

        @Override // tb.csi
        public float b(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee3bf7ea", new Object[]{this, rectF})).floatValue();
            }
            q.c(rectF, "rectF");
            return rectF.bottom;
        }

        @Override // tb.csi
        public void a(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d896c367", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.top = f;
        }

        @Override // tb.csi
        public void b(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9436f06", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.bottom = f;
        }

        @Override // tb.csi
        public void c(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f01aa5", new Object[]{this, rectF, new Float(f)});
                return;
            }
            q.c(rectF, "rectF");
            rectF.offset(0.0f, f);
        }
    }
}
