package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;

/* loaded from: classes5.dex */
public final class soh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final soh INSTANCE;

    /* loaded from: classes5.dex */
    public interface a {
        void a(Bitmap bitmap, View view);
    }

    /* loaded from: classes5.dex */
    static final class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33767a;
        final /* synthetic */ Bitmap b;
        final /* synthetic */ SurfaceView c;

        b(a aVar, Bitmap bitmap, SurfaceView surfaceView) {
            this.f33767a = aVar;
            this.b = bitmap;
            this.c = surfaceView;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            spz.c("VideoBitmapUtils", "onPixelCopyFinished, copyResult=" + i);
            this.f33767a.a(this.b, this.c);
        }
    }

    static {
        kge.a(319836704);
        INSTANCE = new soh();
    }

    private soh() {
    }

    public final void a(ViewGroup viewGroup, a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab05c6e", new Object[]{this, viewGroup, callback});
            return;
        }
        q.d(callback, "callback");
        if (viewGroup == null) {
            callback.a(null, null);
            return;
        }
        TextureView a2 = jwi.a(viewGroup);
        spz.c("VideoBitmapUtils", "requestCopyBitmap, textureView=" + a2);
        if (a2 != null) {
            callback.a(a(a2), a2);
            return;
        }
        SurfaceView a3 = a(viewGroup);
        spz.c("VideoBitmapUtils", "onPixelCopyFinished, surfaceView=" + a3 + "; sdkversion=" + Build.VERSION.SDK_INT);
        if (a3 != null && a3.getWidth() > 0 && a3.getHeight() > 0 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmap.createBitmap(a3.getWidth(), a3.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(a3, createBitmap, new b(callback, createBitmap, a3), new Handler(Looper.getMainLooper()));
            return;
        }
        callback.a(null, null);
    }

    public final View a(ViewParent viewParent) {
        ViewGroup viewGroup;
        int id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52ee122", new Object[]{this, viewParent});
        }
        if (viewParent == null) {
            return null;
        }
        if ((viewParent instanceof ViewGroup) && ((id = (viewGroup = (ViewGroup) viewParent).getId()) == R.id.video_host || id == 16908290)) {
            return viewGroup.findViewById(R.id.video_host);
        }
        return a(viewParent.getParent());
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 24;
    }

    private final Bitmap a(TextureView textureView) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e441f8ff", new Object[]{this, textureView});
        }
        if (textureView == null || (context = textureView.getContext()) == null) {
            return null;
        }
        Resources resources = context.getResources();
        q.b(resources, "uiContext.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        if (textureView.getWidth() >= i) {
            Bitmap bitmap = textureView.getBitmap(i, textureView.getHeight());
            q.b(bitmap, "textureView.getBitmap(de…idth, textureView.height)");
            return bitmap;
        }
        Bitmap bitmap2 = textureView.getBitmap();
        q.b(bitmap2, "textureView.bitmap");
        return bitmap2;
    }

    private final SurfaceView a(ViewGroup viewGroup) {
        SurfaceView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceView) ipChange.ipc$dispatch("11dbd736", new Object[]{this, viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            spz.c("VideoBitmapUtils", "child= " + childAt);
            if (childAt instanceof SurfaceView) {
                return (SurfaceView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }
}
