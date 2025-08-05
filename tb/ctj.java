package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ctj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Rect[] f26511a;
    private a b;
    private Bitmap c;
    private final boolean d;
    private final cti e;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(int i);
    }

    static {
        kge.a(1566818891);
    }

    public ctj(Bitmap bitmap, Rect[] rectArr, a aVar, boolean z, cti ctiVar) {
        this.c = bitmap;
        this.f26511a = rectArr;
        this.b = aVar;
        this.d = z;
        this.e = ctiVar;
    }

    public Rect[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect[]) ipChange.ipc$dispatch("74ac3612", new Object[]{this}) : this.f26511a;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3d9ff027", new Object[]{this}) : this.b;
    }

    public Bitmap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public cti e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cti) ipChange.ipc$dispatch("2dc9fb82", new Object[]{this}) : this.e;
    }
}
