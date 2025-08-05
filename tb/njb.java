package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.a;

/* loaded from: classes7.dex */
public class njb implements nmq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATE_IMAGE = 2;
    public static final int STATIC_BITMAP = 1;

    /* renamed from: a  reason: collision with root package name */
    private njd f31495a;
    private final int b;
    private final Bitmap c;
    private final Rect d;
    private final a e;
    private boolean f;

    static {
        kge.a(-1739191547);
        kge.a(-1523452991);
    }

    public njb(njd njdVar, Bitmap bitmap) {
        this(njdVar, bitmap, null, null);
    }

    public njb(njd njdVar, Bitmap bitmap, a aVar, Rect rect) {
        this(njdVar, bitmap, aVar, rect, false);
    }

    public njb(njd njdVar, Bitmap bitmap, a aVar, Rect rect, boolean z) {
        if (bitmap != null) {
            this.b = 1;
        } else {
            this.b = 2;
        }
        this.f31495a = njdVar;
        this.c = bitmap;
        this.e = aVar;
        this.d = rect;
        this.f = z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        njd njdVar = this.f31495a;
        return (njdVar == null || njdVar.f31496a) && !this.f;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f;
    }

    public njd b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njd) ipChange.ipc$dispatch("16b9e555", new Object[]{this}) : this.f31495a;
    }

    public Bitmap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.c;
    }

    public Rect d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("9b2bb1f4", new Object[]{this}) : this.d;
    }

    public a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3bc7cd99", new Object[]{this}) : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b == 1;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : (this.b == 1 && this.c != null) || (this.b == 2 && this.e != null);
    }

    @Override // tb.nmq
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        njd njdVar = this.f31495a;
        if (njdVar != null) {
            njdVar.h();
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.dispose();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DecodedImage(type=" + this.b + ", bitmap=" + this.c + ", animated=" + this.e + riy.BRACKET_END_STR;
    }
}
