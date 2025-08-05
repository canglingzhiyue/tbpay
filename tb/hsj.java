package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;
import tb.hsm;

/* loaded from: classes6.dex */
public class hsj extends AsyncTask<Void, Void, Bitmap> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f28755a;
    private final hsi b;
    private LocalMedia c;
    private ImageView d;
    private hsm.a e;
    private boolean f;

    static {
        kge.a(-423719676);
    }

    public static /* synthetic */ Object ipc$super(hsj hsjVar, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.Bitmap, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, bitmap});
        } else {
            a(bitmap);
        }
    }

    public hsj(Context context, LocalMedia localMedia, ImageView imageView, hsm.a aVar, boolean z, hsi hsiVar) {
        this.c = localMedia;
        this.d = imageView;
        this.f = z;
        this.e = aVar;
        this.f28755a = context;
        this.b = hsiVar;
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        super.onPostExecute(bitmap);
        if (bitmap == null || bitmap.isRecycled()) {
            hsm.a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.a();
            return;
        }
        hsm.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.a(bitmap);
        } else {
            this.d.setImageBitmap(bitmap);
        }
    }

    public Bitmap a(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e1e32632", new Object[]{this, voidArr});
        }
        if (Thread.interrupted()) {
            return null;
        }
        try {
            return this.b.a(this.f28755a, this.c, this.f);
        } catch (Throwable unused) {
            return null;
        }
    }
}
