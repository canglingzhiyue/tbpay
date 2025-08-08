package com.taobao.android.litecreator.comprehension.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.d;
import com.taobao.android.litecreator.comprehension.g;
import com.taobao.android.litecreator.util.MediaUtils;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.c;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import com.taobao.taopai.business.record.videopicker.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.gwx;
import tb.kge;

/* loaded from: classes5.dex */
public class FrameExtractor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCCOM.FrameExtractor";

    /* renamed from: a  reason: collision with root package name */
    private static g f13334a;
    private static List<FrameConfig> b;
    private static String c;

    /* loaded from: classes5.dex */
    public static class FrameConfig implements Serializable {
        public String type = "default";
        public int frameCount = 5;
        public float frameInterval = 0.2f;
        public int frameResolutionSize = 256;
        public int frameQuality = 70;
        public long frameDecodeTimeout = Constants.STARTUP_TIME_LEVEL_1;
        public long frameUploadTimeout = Constants.STARTUP_TIME_LEVEL_1;

        static {
            kge.a(-895145499);
            kge.a(1028243835);
        }
    }

    public static /* synthetic */ void a(HashSet hashSet, int i, List list, String str, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae9e23d", new Object[]{hashSet, new Integer(i), list, str, countDownLatch});
        } else {
            b(hashSet, i, list, str, countDownLatch);
        }
    }

    public static /* synthetic */ void b(String str, String str2, long j, boolean z, long j2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d725591", new Object[]{str, str2, new Long(j), new Boolean(z), new Long(j2), dVar});
        } else {
            c(str, str2, j, z, j2, dVar);
        }
    }

    static {
        kge.a(1851311258);
        b = new ArrayList();
    }

    public static void a(final String str, final HashSet<String> hashSet, final long j, final d<List<String>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c899a3", new Object[]{str, hashSet, new Long(j), dVar});
        } else if (dVar == null) {
        } else {
            if (hashSet == null || hashSet.size() <= 0) {
                dVar.a(new ArrayList());
                return;
            }
            final ArrayList arrayList = new ArrayList();
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int a2 = FrameExtractor.a(str);
                    CountDownLatch countDownLatch = new CountDownLatch(Math.min(hashSet.size(), a2));
                    FrameExtractor.a(hashSet, a2, arrayList, str, countDownLatch);
                    try {
                        countDownLatch.await(j, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    au.c(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dVar.a(arrayList);
                            }
                        }
                    });
                }
            });
        }
    }

    private static void b(HashSet<String> hashSet, int i, final List<String> list, String str, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6baa1c", new Object[]{hashSet, new Integer(i), list, str, countDownLatch});
            return;
        }
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (i2 > i) {
                return;
            }
            if (g(next)) {
                list.add(next);
            } else {
                final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                c(str, next, -1L, true, 1000L, new d<List<String>>() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.litecreator.comprehension.d
                    public void a(List<String> list2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c7052959", new Object[]{this, list2});
                            return;
                        }
                        if (list2 != null) {
                            list.addAll(list2);
                        }
                        countDownLatch2.countDown();
                    }
                });
                try {
                    countDownLatch2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            countDownLatch.countDown();
            i2++;
        }
    }

    private static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void a(final String str, final String str2, final long j, final boolean z, final long j2, final d<List<String>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4bc632", new Object[]{str, str2, new Long(j), new Boolean(z), new Long(j2), dVar});
        } else if (dVar == null || !k.a(str2)) {
        } else {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FrameExtractor.b(str, str2, j, z, j2, dVar);
                    }
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void c(java.lang.String r20, java.lang.String r21, long r22, boolean r24, long r25, com.taobao.android.litecreator.comprehension.d<java.util.List<java.lang.String>> r27) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.litecreator.comprehension.video.FrameExtractor.c(java.lang.String, java.lang.String, long, boolean, long, com.taobao.android.litecreator.comprehension.d):void");
    }

    private static void a(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list.size() > 0) {
            for (Bitmap bitmap : list) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    private static void a(String str, long j, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0a59c3", new Object[]{str, new Long(j), list});
        } else if (!list.isEmpty() || j <= 0) {
        } else {
            String a2 = MediaUtils.a(j, 3, str);
            u.d(TAG, "VideoFrameOnThumbnail. use media id bitmap," + a2);
            if (k.a(a2)) {
                list.add(a2);
            }
            a(str, a2);
        }
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f13334a == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("biz_type", str);
            hashMap.put("is_suc", String.valueOf(k.a(str2)));
            f13334a.a("UseMediaThumbnail", hashMap, false);
        }
    }

    private static a a(final String str, String str2, long[] jArr, final List<String> list, int i, final CountDownLatch countDownLatch, final List<Bitmap> list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("98826ac7", new Object[]{str, str2, jArr, list, new Integer(i), countDownLatch, list2}) : new a(new com.taobao.tixel.android.media.a(str2), jArr, i, new g.a() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onSuccess(final int i2, final Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b81d0476", new Object[]{this, new Integer(i2), bitmap});
                    return;
                }
                au.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String str3 = "run: saveBitmap " + i2;
                        String d = n.d(Globals.getApplication());
                        if (c.a(bitmap, d, FrameExtractor.d(str))) {
                            list.add(d);
                            list2.add(bitmap);
                        }
                        countDownLatch.countDown();
                    }
                });
                u.b(FrameExtractor.TAG, "VideoFrameOnThumbnail. i:" + i2 + ", bitmap:" + bitmap);
            }
        });
    }

    private static void a(d<List<String>> dVar, List<String> list, List<Bitmap> list2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9651de10", new Object[]{dVar, list, list2, new Boolean(z)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<String> a2 = a(list2, list);
        int size = a2 != null ? a2.size() : 0;
        int size2 = list.size();
        u.b("isEnableMNN", "extractorAsync: getFrameListByMNN " + a2 + " ,delCount=" + (size - size2));
        if (!z) {
            return;
        }
        if (a2 != null && a2.size() > 0) {
            a(dVar, a2);
        } else {
            a(dVar, list);
            z2 = false;
        }
        if (f13334a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("total_count", String.valueOf(size2));
        hashMap.put("filtered_count", String.valueOf(size));
        hashMap.put("time_cost", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        f13334a.a("Duplicate_Detector", hashMap, false);
    }

    private static void a(final d<List<String>> dVar, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc28f653", new Object[]{dVar, list});
        } else {
            au.a(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.video.FrameExtractor.5
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
                    dVar2.a(list);
                }
            });
        }
    }

    private static List<String> a(List<Bitmap> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{list, list2});
        }
        if (list == null || list.size() <= 0) {
            return list2;
        }
        if (list2 == null || list2.size() <= 0) {
            return null;
        }
        List<Integer> a2 = new gwx().a(list);
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (Integer num : a2) {
            if (num.intValue() < size) {
                arrayList.add(list2.get(num.intValue()));
            }
        }
        return arrayList;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : new gwx().a();
    }

    private static long[] a(String str, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("c7106ce3", new Object[]{str, new Long(j), new Boolean(z)});
        }
        int a2 = a(str);
        if (z) {
            return new long[]{500};
        }
        long[] jArr = new long[a2];
        for (int i = 0; i < a2; i++) {
            jArr[i] = c(str) * i * ((float) j);
        }
        if (a2 > 1) {
            if (a2 == 2) {
                jArr[jArr.length - 1] = ((float) j) * 0.5f;
            } else {
                jArr[jArr.length - 1] = ((float) j) * 0.99f;
            }
        }
        return jArr;
    }

    public static void a(String str, List<FrameConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
            return;
        }
        c = str;
        b = list;
    }

    public static void a(com.taobao.android.litecreator.comprehension.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aeca7f", new Object[]{gVar});
        } else {
            f13334a = gVar;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (f13334a == null) {
        } else {
            HashMap hashMap = new HashMap();
            gwx gwxVar = new gwx();
            String str = "1";
            hashMap.put("mcv_available", gwxVar.b() ? str : "0");
            if (!gwxVar.a()) {
                str = "0";
            }
            hashMap.put("mnn_enable", str);
            f13334a.a("MNN_Env", hashMap, true);
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : h(str).frameCount;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : h(str).frameResolutionSize;
    }

    public static float c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea4", new Object[]{str})).floatValue() : h(str).frameInterval;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue() : h(str).frameQuality;
    }

    public static long e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{str})).longValue() : h(str).frameDecodeTimeout;
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("669e4a6b", new Object[]{str})).longValue() : h(str).frameUploadTimeout;
    }

    private static FrameConfig h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameConfig) ipChange.ipc$dispatch("a403c9a5", new Object[]{str});
        }
        List<FrameConfig> list = b;
        if (list != null) {
            for (FrameConfig frameConfig : list) {
                if (frameConfig != null && StringUtils.equals(frameConfig.type, str)) {
                    return frameConfig;
                }
            }
        }
        return new FrameConfig();
    }
}
