package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.tao.Globals;
import tb.nia;

/* loaded from: classes5.dex */
public class hfh implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hfh INSTANCE;

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : "rotate";
    }

    static {
        kge.a(-689504940);
        kge.a(1386160431);
        INSTANCE = new hfh();
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
        }
        try {
            int a2 = k.a(Globals.getApplication(), str);
            if (a2 != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.setRotate(a2);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
