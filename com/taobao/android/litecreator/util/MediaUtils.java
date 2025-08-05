package com.taobao.android.litecreator.util;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.d;
import com.taobao.android.litecreator.comprehension.video.FrameExtractor;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.emh;
import tb.kge;
import tb.mto;
import tb.ptv;
import tb.pvk;

/* loaded from: classes5.dex */
public final class MediaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEGREES_180 = 180;
    public static final int DEGREES_270 = 270;
    public static final int DEGREES_90 = 90;
    public static final int VIDEO_RATIO_4_3 = 16;
    public static final int VIDEO_RATIO_OTHERS = 128;
    public static final int VIDEO_RATIO_OVER_16_9 = 32;
    public static final int VIDEO_RATIO_OVER_9_16 = 64;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f13476a;

    /* loaded from: classes5.dex */
    public @interface RatioType {
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13482a;
        public int b;
        public int c;
        public int d;

        static {
            kge.a(-1708635909);
        }

        public b(int i, int i2, int i3, String str) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.f13482a = str;
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 64 ? i != 128 ? "unknown" : "others" : "over9:16" : "over16:9" : "4:3" : com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO : com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_SIXTEEN_NINE_RATIO : emh.sDefaultDimension : "9:16" : "unknown";
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static int d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dbcffcb", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 == 90 || i3 == 270) ? i2 : i;
    }

    public static int e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c59e2caa", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 == 90 || i3 == 270) ? i : i2;
    }

    public static /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0ac2ac", new Object[]{dVar, str});
        } else {
            b(dVar, str);
        }
    }

    public static /* synthetic */ void b(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cc846d", new Object[]{str, dVar});
        } else {
            c(str, dVar);
        }
    }

    static {
        kge.a(-997809034);
        f13476a = new HashMap();
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 * i) / i2;
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8dfaa60d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 * i2) / i;
    }

    public static int c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5dbd2ec", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        double d = (i * 1.0f) / i2;
        if (Math.abs(d - 1.0d) < 0.01d) {
            return 2;
        }
        if (Math.abs(d - 0.5625d) < 0.01d) {
            return (i3 == 90 || i3 == 270) ? 4 : 1;
        }
        double d2 = d - 1.7777777777777777d;
        if (Math.abs(d2) < 0.01d) {
            return (i3 == 90 || i3 == 270) ? 1 : 4;
        } else if (Math.abs(d - 1.3333333333333333d) < 0.01d) {
            return (i3 == 90 || i3 == 270) ? 8 : 16;
        } else if (Math.abs(d - 0.75d) < 0.01d) {
            return (i3 == 90 || i3 == 270) ? 16 : 8;
        } else if (0.5625d - d > 0.01d) {
            return (i3 == 90 || i3 == 270) ? 32 : 64;
        } else if (d2 <= 0.01d) {
            return 128;
        } else {
            return (i3 == 90 || i3 == 270) ? 64 : 32;
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 48936:
                if (str.equals(emh.sDefaultDimension)) {
                    c = 0;
                    break;
                }
                break;
            case 50861:
                if (str.equals(com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO)) {
                    c = 3;
                    break;
                }
                break;
            case 51821:
                if (str.equals("4:3")) {
                    c = 4;
                    break;
                }
                break;
            case 1513508:
                if (str.equals(com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_SIXTEEN_NINE_RATIO)) {
                    c = 2;
                    break;
                }
                break;
            case 1755398:
                if (str.equals("9:16")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 4;
        }
        if (c == 3) {
            return 8;
        }
        return c != 4 ? 0 : 16;
    }

    public static boolean f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d7f599a", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int[] b2 = ptv.b(i);
        if (b2 != null && b2.length == 2 && i2 / b2[0] == i3 / b2[1]) {
            return true;
        }
        return i == 16 && i2 / 4 == i3 / 3;
    }

    public static int a(Context context, Uri uri) {
        int i;
        InputStream openInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd717cda", new Object[]{context, uri})).intValue();
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            int d = k.d(uri.getPath());
            if (d == 90) {
                return 6;
            }
            if (d == 270) {
                return 8;
            }
            return d == 180 ? 3 : 0;
        }
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (openInputStream == null) {
            return 0;
        }
        i = new pvk(openInputStream).a();
        try {
            a(openInputStream);
        } catch (IOException e2) {
            e = e2;
            u.d("getExifOrientation", "getExifOrientation: " + uri.toString() + " " + e.getMessage());
            return i;
        }
        return i;
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b7b4f09f", new Object[]{str});
        }
        if (f13476a.containsKey(str)) {
            return f13476a.get(str);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
            if (TextUtils.isEmpty(extractMetadata)) {
                return null;
            }
            a a2 = a.a(extractMetadata);
            if (a2 != null) {
                f13476a.put(str, a2);
            }
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null || !(closeable instanceof Closeable)) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public double f13481a = mto.a.GEO_NOT_SUPPORT;
        public double b = mto.a.GEO_NOT_SUPPORT;

        static {
            kge.a(-445155349);
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("356a3bc0", new Object[]{str});
            }
            if (str == null) {
                return null;
            }
            a aVar = new a();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if ((charAt < '0' || charAt > '9') && charAt != '.') {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (arrayList.size() < 2) {
                return null;
            }
            try {
                aVar.f13481a = Double.parseDouble(str.substring(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue()));
                aVar.b = Double.parseDouble(str.substring(((Integer) arrayList.get(1)).intValue(), arrayList.size() > 2 ? ((Integer) arrayList.get(2)).intValue() : arrayList.size()));
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MediaLocation{latitude=" + this.f13481a + ", longitude=" + this.b + '}';
        }
    }

    public static void a(final String str, final long j, final int i, final d<String> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fca476b", new Object[]{str, new Long(j), new Integer(i), dVar});
        } else if (dVar == null) {
        } else {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.util.MediaUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MediaUtils.a(dVar, MediaUtils.a(j, i, str));
                    }
                }
            });
        }
    }

    public static void a(final String str, final Bitmap bitmap, final d<String> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91321336", new Object[]{str, bitmap, dVar});
        } else if (dVar == null) {
        } else {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.util.MediaUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MediaUtils.a(dVar, MediaUtils.a(bitmap, str));
                    }
                }
            });
        }
    }

    private static void b(final d<String> dVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323675ed", new Object[]{dVar, str});
        } else {
            au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.MediaUtils.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d dVar2 = d.this;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a(str);
                }
            });
        }
    }

    public static void a(final String str, final d<String> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea0d12c", new Object[]{str, dVar});
        } else {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.util.MediaUtils.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MediaUtils.b(str, dVar);
                    }
                }
            });
        }
    }

    private static void c(String str, d<String> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f837ae", new Object[]{str, dVar});
        } else if (dVar == null) {
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(at.a(mediaMetadataRetriever.extractMetadata(9), 0L) * 1000, 3);
                String d = n.d(Globals.getApplication());
                if (frameAtTime != null && c.a(frameAtTime, d)) {
                    b(dVar, d);
                } else {
                    TLog.loge("MediaUtils", "extractorLastFrameAtTime save bitmap fail");
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    TLog.loge("MediaUtils", "extractor fail ", th);
                    b(dVar, (String) null);
                } finally {
                    mediaMetadataRetriever.release();
                }
            }
        }
    }

    public static String a(long j, int i, String str) {
        Bitmap a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e2ac78f", new Object[]{new Long(j), new Integer(i), str});
        }
        int b2 = FrameExtractor.b(str);
        if (i == 3) {
            a2 = c.a(true, j, b2, false);
        } else {
            a2 = i == 1 ? c.a(false, j, b2, false) : null;
        }
        if (a2 != null) {
            return a(a2, str);
        }
        return null;
    }

    public static String a(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48d7bf90", new Object[]{bitmap, str});
        }
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        int min = Math.min(FrameExtractor.b(str), bitmap.getWidth());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, min, (bitmap.getHeight() * min) / bitmap.getWidth(), false);
        String d = n.d(Globals.getApplication());
        if (c.a(createScaledBitmap, d, FrameExtractor.d(str))) {
            return d;
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static com.taobao.android.litecreator.util.MediaUtils.b c(java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.litecreator.util.MediaUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r7 = "39ffa59d"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.taobao.android.litecreator.util.MediaUtils$b r7 = (com.taobao.android.litecreator.util.MediaUtils.b) r7
            return r7
        L15:
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            r1.setDataSource(r7)     // Catch: java.lang.Throwable -> L56
            r3 = 18
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L56
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L56
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L56
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L56
            r6 = 17
            if (r5 < r6) goto L42
            r2 = 24
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56
        L42:
            com.taobao.android.litecreator.util.MediaUtils$b r5 = new com.taobao.android.litecreator.util.MediaUtils$b     // Catch: java.lang.Throwable -> L56
            r5.<init>(r3, r4, r2, r7)     // Catch: java.lang.Throwable -> L56
            r1.release()
            return r5
        L4b:
            r7 = move-exception
            goto L4f
        L4d:
            r7 = move-exception
            r1 = r0
        L4f:
            if (r1 == 0) goto L54
            r1.release()
        L54:
            throw r7
        L55:
            r1 = r0
        L56:
            if (r1 == 0) goto L5b
            r1.release()
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.litecreator.util.MediaUtils.c(java.lang.String):com.taobao.android.litecreator.util.MediaUtils$b");
    }

    public static boolean a(LocalMedia localMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e161cbc", new Object[]{localMedia})).booleanValue();
        }
        if (localMedia == null) {
            return false;
        }
        Application application = Globals.getApplication();
        return j.e(application) ? ax.b(application, localMedia.uri) : k.a(localMedia.path);
    }
}
