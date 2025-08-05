package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.taobao.windvane.util.h;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.ado;
import tb.kge;

/* loaded from: classes2.dex */
public final class ScreenCaptureUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1714714610);
    }

    public static /* synthetic */ void a(Context context, Bitmap bitmap, Uri uri) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cab4939", new Object[]{context, bitmap, uri});
        } else {
            b(context, bitmap, uri);
        }
    }

    public static /* synthetic */ void a(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb0ec9", new Object[]{uri, context});
        } else {
            b(uri, context);
        }
    }

    public static long a(View view, boolean z, long j, long j2, long j3, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8462a4ae", new Object[]{view, new Boolean(z), new Long(j), new Long(j2), new Long(j3), new Boolean(z2)})).longValue();
        }
        Bitmap a2 = a(view);
        if (a2 == null) {
            throw new RuntimeException("can't get bitmap from the view");
        }
        android.taobao.windvane.cache.a.a().a(true);
        long a3 = ado.a(z2 ? h.a(a2, j2, j3) : a2);
        if (!z) {
            return a3;
        }
        h.a(view.getContext(), a2);
        return a3;
    }

    public static long a(Activity activity, boolean z, long j, long j2, long j3, boolean z2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f037545e", new Object[]{activity, new Boolean(z), new Long(j), new Long(j2), new Long(j3), new Boolean(z2)})).longValue();
        }
        activity.getWindow().getDecorView().setDrawingCacheEnabled(true);
        Bitmap drawingCache = activity.getWindow().getDecorView().getDrawingCache();
        if (drawingCache == null) {
            throw new RuntimeException("can't get bitmap from the view");
        }
        android.taobao.windvane.cache.a.a().a(true);
        if (z2) {
            drawingCache = h.a(drawingCache, j2, j3);
        }
        long a2 = ado.a(drawingCache);
        if (!z) {
            return a2;
        }
        h.a(activity, drawingCache);
        return a2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void b(android.content.Context r3, android.graphics.Bitmap r4, android.net.Uri r5) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.jsbridge.api.ScreenCaptureUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "1ef5fe18"
            r0.ipc$dispatch(r3, r1)
            return
        L18:
            r0 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "w"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r5, r1)     // Catch: java.lang.Throwable -> L4b
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46
            java.io.FileDescriptor r1 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L46
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L46
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L43
            r1 = 100
            r4.compress(r0, r1, r5)     // Catch: java.lang.Throwable -> L43
            r5.flush()
            r5.close()
            if (r3 == 0) goto L5d
            r3.close()
            return
        L40:
            r4 = move-exception
            r0 = r5
            goto L5f
        L43:
            r4 = move-exception
            r0 = r5
            goto L4d
        L46:
            r4 = move-exception
            goto L4d
        L48:
            r4 = move-exception
            r3 = r0
            goto L5f
        L4b:
            r4 = move-exception
            r3 = r0
        L4d:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L58
            r0.flush()
            r0.close()
        L58:
            if (r3 == 0) goto L5d
            r3.close()
        L5d:
            return
        L5e:
            r4 = move-exception
        L5f:
            if (r0 == 0) goto L67
            r0.flush()
            r0.close()
        L67:
            if (r3 == 0) goto L6c
            r3.close()
        L6c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.ScreenCaptureUtil.b(android.content.Context, android.graphics.Bitmap, android.net.Uri):void");
    }

    private static Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{view});
        }
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    private static void b(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8545350a", new Object[]{uri, context});
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        context.sendBroadcast(intent);
    }

    /* loaded from: classes2.dex */
    public static final class BackFragment extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap f1623a;

        static {
            kge.a(414331213);
        }

        public static /* synthetic */ Object ipc$super(BackFragment backFragment, String str, Object... objArr) {
            if (str.hashCode() == 1257714799) {
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            super.onActivityResult(i, i2, intent);
            if (i != 1553 || i2 != -1) {
                return;
            }
            try {
                if (this.f1623a == null) {
                    return;
                }
                ScreenCaptureUtil.a(getActivity(), this.f1623a, intent.getData());
                ScreenCaptureUtil.a(intent.getData(), getActivity());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
