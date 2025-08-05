package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;
import tb.hcp;

/* loaded from: classes5.dex */
public class hhb<T extends LocalMedia, S extends hcp> extends hba<T, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final BitmapFactory.Options b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.hba
    public /* bridge */ /* synthetic */ BitmapDrawable a(Object obj, Context context) {
        return a((hhb<T, S>) ((LocalMedia) obj), context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.hba
    public /* bridge */ /* synthetic */ String a(Object obj) {
        return a((hhb<T, S>) ((LocalMedia) obj));
    }

    static {
        kge.a(-1806452402);
        BitmapFactory.Options options = new BitmapFactory.Options();
        b = options;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
    }

    public String a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8779dee8", new Object[]{this, t}) : String.valueOf(t.id);
    }

    @Override // tb.hba
    public void a(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1cd0a7", new Object[]{this, str, bitmapDrawable});
        } else {
            hbd.sAlbumDrawableCache.put(str, bitmapDrawable);
        }
    }

    @Override // tb.hba
    public BitmapDrawable a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("7ba0d799", new Object[]{this, str}) : hbd.sAlbumDrawableCache.get(str);
    }

    public BitmapDrawable a(T t, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("2028a77b", new Object[]{this, t, context});
        }
        Bitmap bitmap = null;
        if (t.mediaType == 3) {
            bitmap = MediaStore.Video.Thumbnails.getThumbnail(context.getContentResolver(), t.id, 1, b);
        } else if (t.mediaType == 1) {
            bitmap = MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), t.id, 1, b);
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }
}
