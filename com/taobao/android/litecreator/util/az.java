package com.taobao.android.litecreator.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.marvel.java.OnFrameCallback;
import com.alibaba.marvel.toolbox.FrameParam;
import com.alibaba.marvel.toolbox.ToolBox;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes5.dex */
public class az {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.litecreator.util.az$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13493a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ com.taobao.android.litecreator.base.data.c d;
        public final /* synthetic */ Runnable e;

        public AnonymousClass1(String str, int i, long j, com.taobao.android.litecreator.base.data.c cVar, Runnable runnable) {
            this.f13493a = str;
            this.b = i;
            this.c = j;
            this.d = cVar;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!az.a(this.f13493a)) {
                final FrameParam frameParam = new FrameParam(this.f13493a);
                frameParam.startTimeUs = 0L;
                long j = this.c;
                frameParam.stopTimeUs = j * 1000;
                frameParam.fps = 1.0f / (((float) (j / 1000)) / this.b);
                frameParam.imgWidth = 256;
                frameParam.imgHeight = 256;
                ToolBox.generateVideoFrame(frameParam, new OnFrameCallback() { // from class: com.taobao.android.litecreator.util.az.1.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean onFrame(ByteBuffer byteBuffer, long j2, final int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("2371addf", new Object[]{this, byteBuffer, new Long(j2), new Integer(i)})).booleanValue();
                        }
                        if (byteBuffer == null) {
                            return false;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(frameParam.imgWidth, frameParam.imgHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(byteBuffer);
                        final Bitmap a2 = az.a(createBitmap, r3);
                        if (a2 == null) {
                            a2 = createBitmap;
                        }
                        au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.az.1.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (i >= AnonymousClass1.this.b) {
                                } else {
                                    AnonymousClass1.this.d.a(a2, Integer.valueOf(i));
                                }
                            }
                        });
                        return false;
                    }

                    public void onEnd() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("efc72903", new Object[]{this});
                        } else {
                            au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.az.1.3.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        AnonymousClass1.this.e.run();
                                    }
                                }
                            });
                        }
                    }
                });
            } else {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f13493a);
                    for (final int i = 0; i < this.b; i++) {
                        long j2 = (i / this.b) * ((float) this.c) * 1000;
                        final Bitmap scaledFrameAtTime = Build.VERSION.SDK_INT >= 27 ? mediaMetadataRetriever.getScaledFrameAtTime(j2, 3, 256, 256) : az.a(mediaMetadataRetriever.getFrameAtTime(j2), 256);
                        au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.az.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AnonymousClass1.this.d.a(scaledFrameAtTime, Integer.valueOf(i));
                                }
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
                mediaMetadataRetriever.release();
                au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.az.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AnonymousClass1.this.e.run();
                        }
                    }
                });
            }
        }
    }

    static {
        kge.a(130142388);
    }

    public static /* synthetic */ Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)}) : b(bitmap, i);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            int a2 = a(mediaExtractor);
            if (a2 < 0) {
                return false;
            }
            mediaExtractor.selectTrack(a2);
            return TextUtils.equals(mediaExtractor.getTrackFormat(a2).getString("mime"), "video/hevc");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int a(MediaExtractor mediaExtractor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53c352ff", new Object[]{mediaExtractor})).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    public static void a(String str, long j, int i, com.taobao.android.litecreator.base.data.c<Bitmap, Integer> cVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5af66", new Object[]{str, new Long(j), new Integer(i), cVar, runnable});
        } else {
            au.b(new AnonymousClass1(str, i, j, cVar, runnable));
        }
    }

    private static Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9952961c", new Object[]{bitmap, new Integer(i)});
        }
        float max = i / Math.max(bitmap.getWidth(), bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false).copy(Bitmap.Config.RGB_565, false);
    }
}
