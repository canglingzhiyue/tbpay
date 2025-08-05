package tb;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* loaded from: classes5.dex */
public class sjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f33635a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ImageView.ScaleType g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public sjp m;

    static {
        kge.a(-137544510);
    }

    public sjq(int i, int i2) {
        this(null, i, i2);
    }

    public sjq(Context context, int i, int i2) {
        this.g = ImageView.ScaleType.CENTER_CROP;
        this.f33635a = i2;
        this.b = i;
        context = context == null ? FluidSDK.getContext() : context;
        this.j = ohd.f(context);
        this.k = obu.a(context, true) - ohd.b(context, 4);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IVideoCommentSizeObject{height=" + this.f33635a + ", width=" + this.b + ", showHeight=" + this.c + ", showWidth=" + this.d + ", showMarginTop=" + this.e + ", showPaddingBottom=" + this.f + ", type=" + this.g + ", videoWidth=" + this.h + ", videoHeight=" + this.i + ", screenWidth=" + this.j + ", screenHeight=" + this.k + '}';
    }
}
