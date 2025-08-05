package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class aml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f25448a;
    private final int b;

    static {
        kge.a(-1951505463);
    }

    public aml(Bitmap bitmap, int i) {
        this.f25448a = bitmap;
        this.b = i;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f25448a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
