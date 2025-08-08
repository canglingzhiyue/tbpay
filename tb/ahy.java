package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.e;
import com.airbnb.lottie.i;
import com.taobao.search.musie.n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ahy {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f25347a = new Object();
    private final Context b;
    private final String c;
    private e d;
    private final Map<String, i> e;

    public ahy(Drawable.Callback callback, String str, e eVar, Map<String, i> map) {
        if (!StringUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str + fxb.DIR;
        }
        this.c = str;
        if (!(callback instanceof View)) {
            akh.c("LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.b = null;
            return;
        }
        this.b = ((View) callback).getContext();
        this.e = map;
        a(eVar);
    }

    private Bitmap b(String str, Bitmap bitmap) {
        synchronized (f25347a) {
            this.e.get(str).a(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        Bitmap a2;
        i iVar = this.e.get(str);
        if (iVar == null) {
            return null;
        }
        Bitmap e = iVar.e();
        if (e != null) {
            return e;
        }
        e eVar = this.d;
        if (eVar != null) {
            Bitmap fetchBitmap = eVar.fetchBitmap(iVar);
            if (fetchBitmap != null) {
                b(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        String d = iVar.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (d.startsWith("data:") && d.indexOf(n.BASE_64) > 0) {
            try {
                byte[] decode = Base64.decode(d.substring(d.indexOf(44) + 1), 0);
                a2 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e2) {
                akh.b("data URL did not have correct base64 format.", e2);
                return null;
            }
        } else if (StringUtils.isEmpty(this.c)) {
            akh.c("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            return null;
        } else {
            try {
                AssetManager assets = this.b.getAssets();
                try {
                    a2 = akl.a(BitmapFactory.decodeStream(assets.open(this.c + d), null, options), iVar.a(), iVar.b());
                } catch (IllegalArgumentException e3) {
                    akh.b("Unable to decode image.", e3);
                    return null;
                }
            } catch (IOException e4) {
                akh.b("Unable to open asset.", e4);
                return null;
            }
        }
        return b(str, a2);
    }

    public Bitmap a(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap e = this.e.get(str).e();
            b(str, bitmap);
            return e;
        }
        i iVar = this.e.get(str);
        Bitmap e2 = iVar.e();
        iVar.a(null);
        return e2;
    }

    public void a(e eVar) {
        this.d = eVar;
    }

    public boolean a(Context context) {
        return (context == null && this.b == null) || this.b.equals(context);
    }
}
