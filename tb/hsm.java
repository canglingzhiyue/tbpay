package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.LocalMedia;

/* loaded from: classes6.dex */
public class hsm implements hsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f28758a;
    private hsj b;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    static {
        kge.a(1252743503);
        kge.a(-894432429);
    }

    public hsm(Context context) {
        this.f28758a = context;
    }

    public void a(LocalMedia localMedia, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603ab272", new Object[]{this, localMedia, imageView});
        } else {
            a(localMedia, imageView, false);
        }
    }

    public void a(LocalMedia localMedia, ImageView imageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71c4ea2", new Object[]{this, localMedia, imageView, new Boolean(z)});
        } else {
            a(localMedia, imageView, null, z);
        }
    }

    public void a(LocalMedia localMedia, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488fba2b", new Object[]{this, localMedia, aVar, new Boolean(z)});
        } else if (aVar == null) {
        } else {
            a(localMedia, null, aVar, z);
        }
    }

    public void a(LocalMedia localMedia, ImageView imageView, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e2c31", new Object[]{this, localMedia, imageView, aVar, new Boolean(z)});
            return;
        }
        hsj hsjVar = this.b;
        if (hsjVar != null) {
            hsjVar.cancel(true);
        }
        this.b = new hsj(this.f28758a, localMedia, imageView, aVar, z, this);
        try {
            this.b.execute(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // tb.hsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap a(android.content.Context r7, com.taobao.android.mediapick.media.LocalMedia r8, boolean r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hsm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r6
            r1[r4] = r7
            r1[r3] = r8
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r9)
            r1[r2] = r7
            java.lang.String r7 = "bc85a7f2"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            return r7
        L23:
            int r0 = r8.mediaType
            r1 = 0
            if (r0 != r2) goto L5b
            if (r9 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 1
        L2c:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L38
            int r9 = r8.id     // Catch: java.lang.IllegalArgumentException -> L38
            long r4 = (long) r9     // Catch: java.lang.IllegalArgumentException -> L38
            android.graphics.Bitmap r7 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r7, r4, r3, r1)     // Catch: java.lang.IllegalArgumentException -> L38
            return r7
        L38:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L54
            r7.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L54
            java.lang.String r8 = r8.path     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L55
            r7.setDataSource(r8)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L55
            android.graphics.Bitmap r8 = r7.getFrameAtTime()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L55
            r7.release()
            return r8
        L4a:
            r8 = move-exception
            goto L4e
        L4c:
            r8 = move-exception
            r7 = r1
        L4e:
            if (r7 == 0) goto L53
            r7.release()
        L53:
            throw r8
        L54:
            r7 = r1
        L55:
            if (r7 == 0) goto L5a
            r7.release()
        L5a:
            return r1
        L5b:
            int r0 = r8.mediaType
            if (r0 != r4) goto L6f
            if (r9 == 0) goto L62
            goto L63
        L62:
            r3 = 1
        L63:
            android.content.ContentResolver r7 = r7.getContentResolver()
            int r8 = r8.id
            long r8 = (long) r8
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r7, r8, r3, r1)
            return r7
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hsm.a(android.content.Context, com.taobao.android.mediapick.media.LocalMedia, boolean):android.graphics.Bitmap");
    }
}
