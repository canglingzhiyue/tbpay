package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ctl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COLLISION_COVER = 0;
    public static final int COLLISION_HORIZONTAL_MOVE = 2;
    public static final int COLLISION_VERTICAL_MOVE = 1;
    public static final a Companion;
    private int b;
    private RectF d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26516a = true;
    private boolean c = true;

    static {
        kge.a(-697747733);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(274577523);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f26516a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26516a;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public final void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
        } else {
            this.d = rectF;
        }
    }

    public final RectF d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("ca4a8e1c", new Object[]{this}) : this.d;
    }
}
