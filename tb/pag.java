package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import mtopsdk.common.util.StringUtils;
import com.alilive.adapter.uikit.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ab;
import java.util.HashMap;
import tb.nia;

/* loaded from: classes8.dex */
public class pag implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f32527a;
    private float b;
    private Paint c;
    private String d;

    static {
        kge.a(1018652144);
        kge.a(1386160431);
    }

    public pag(h hVar) {
        this.d = hVar.f4328a;
        ab.e("LimitBitmapProcessor", "load url:" + this.d);
    }

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.d)) {
            return "W" + this.f32527a + "$H" + this.b;
        }
        return "W" + this.f32527a + "$H" + this.b + "url" + this.d;
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
        }
        try {
            if (this.c == null) {
                this.c = new Paint();
                this.c.setAntiAlias(true);
            }
            this.f32527a = bitmap.getWidth();
            this.b = bitmap.getHeight();
            int byteCount = bitmap.getByteCount();
            ab.e("LimitBitmapProcessor", "process url:" + this.d);
            if (byteCount <= 1048576) {
                return bitmap;
            }
            float f = 0.1f;
            if (byteCount > 10485760) {
                f = 0.01f;
            }
            this.f32527a *= f;
            this.b *= f;
            bitmap2 = aVar.a((int) this.f32527a, (int) this.b, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmap2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                bitmapShader.setLocalMatrix(matrix);
                this.c.setShader(bitmapShader);
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, this.f32527a, this.b);
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.c);
                ab.e("LimitBitmapProcessor", "scale bitmap size to 0.1:" + this.d);
                HashMap hashMap = new HashMap();
                hashMap.put("url", this.d);
                hashMap.put("size", String.valueOf(byteCount));
                pmd.a().e().a("Page_TaobaoLiveWatch", "LoaderBigBitmap", hashMap);
                return bitmap2;
            } catch (Throwable th) {
                th = th;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("t", th.getMessage());
                pmd.a().e().a("Page_TaobaoLiveWatch", "LoaderBitmapCrash", hashMap2);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = bitmap;
        }
    }
}
