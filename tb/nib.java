package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.common.a;
import com.taobao.pexode.d;
import com.taobao.phenix.intf.b;
import tb.nia;

/* loaded from: classes7.dex */
public class nib implements nia.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final nib f31474a;

    static {
        kge.a(1603313039);
        kge.a(352512080);
        f31474a = new nib();
    }

    public static nib a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nib) ipChange.ipc$dispatch("f083bf7", new Object[0]) : f31474a;
    }

    @Override // tb.nia.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9d49a802", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        Bitmap bitmap = null;
        if (d.c()) {
            bitmap = a.a().b(i, i2, config);
        } else {
            nhy a2 = b.h().r().a();
            if (a2 != null) {
                bitmap = a2.a(i, i2, config);
            }
        }
        return bitmap == null ? Bitmap.createBitmap(i, i2, config) : bitmap;
    }
}
