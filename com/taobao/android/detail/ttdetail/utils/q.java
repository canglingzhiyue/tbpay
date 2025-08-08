package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIZ_ID = 15;
    public static final String BIZ_NAME = "detail";
    public static final int INVALID_RES_ID = -1;
    public static final int MAX_SIZE = 1200;
    public static final int PRELOAD_MAX_SIZE = 480;

    /* renamed from: a  reason: collision with root package name */
    private static final int f10971a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ImageView>>> e;
    private static final boolean f;

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f10971a;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : b;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : d;
    }

    static {
        kge.a(2123630183);
        f10971a = R.id.tt_detail_element_image_url;
        d = R.id.tt_detail_element_image_original_url;
        b = R.id.tt_detail_element_image_url_success;
        c = R.id.tt_detail_element_image_load_ticket;
        e = new ConcurrentHashMap<>();
        f = j.r();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f || context == null) {
        } else {
            int hashCode = context.hashCode();
            if (e.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            e.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
        }
    }

    public static void b(Context context) {
        ConcurrentHashMap<Integer, WeakReference<ImageView>> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (f && context != null && (remove = e.remove(Integer.valueOf(context.hashCode()))) != null) {
            for (WeakReference<ImageView> weakReference : remove.values()) {
                ImageView imageView = weakReference.get();
                if (imageView != null) {
                    a(imageView, (String) null);
                }
            }
        }
    }

    public static void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{imageView});
        } else if (!f) {
        } else {
            ConcurrentHashMap<Integer, WeakReference<ImageView>> concurrentHashMap = e.get(Integer.valueOf(y.a(imageView).hashCode()));
            int hashCode = imageView.hashCode();
            if (concurrentHashMap == null || concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            concurrentHashMap.put(Integer.valueOf(hashCode), new WeakReference<>(imageView));
        }
    }

    public static String e(ImageView imageView, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80ce6f30", new Object[]{imageView, str});
        }
        int i2 = 600;
        if (imageView == null) {
            i = 600;
        } else {
            int width = imageView.getWidth() / 2;
            int height = imageView.getHeight() / 2;
            if (width <= 0) {
                width = 600;
            }
            if (height > 0) {
                i2 = height;
            }
            i = i2;
            i2 = width;
        }
        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(i), ImageStrategyConfig.a("detail", 15).a(TaobaoImageUrlStrategy.ImageQuality.q30).a());
        return StringUtils.isEmpty(decideUrl) ? str : decideUrl;
    }

    public static ImageStrategyConfig a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("5a652e36", new Object[]{imageQuality});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a("detail", 15);
        if (imageQuality == null) {
            imageQuality = TaobaoImageUrlStrategy.ImageQuality.q90;
        }
        return a2.a(imageQuality).a();
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else {
            a(str, 0, 0, z, (ImageStrategyConfig) null);
        }
    }

    public static void a(String str, int i, int i2, final boolean z, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6421a875", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z), imageStrategyConfig});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            final String a2 = l.a(str);
            if (i <= 0) {
                i = 1200;
            }
            if (i2 <= 0) {
                i2 = 1200;
            }
            final String decideUrl = imageStrategyConfig != null ? ImageStrategyDecider.decideUrl(a2, Integer.valueOf(i), Integer.valueOf(i2), imageStrategyConfig) : a2;
            PhenixCreator scaleFromLarge = com.taobao.phenix.intf.b.h().a(decideUrl).schedulePriority(4).preloadWithSmall(true).scaleFromLarge(true);
            if (z) {
                scaleFromLarge.fuzzyMatchCache();
            }
            scaleFromLarge.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.utils.q.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    if (StringUtils.equals(decideUrl, failPhenixEvent.getUrl())) {
                        i.a("ImageUtils", "preloadImageUrl failure with: " + decideUrl);
                        if (!StringUtils.equals(decideUrl, a2)) {
                            q.a(a2, z);
                            i.a("ImageUtils", "preloadImageUrl failure with: " + decideUrl + " reload with originalUrl: " + a2);
                        }
                    }
                    return true;
                }
            }).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.utils.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (StringUtils.equals(decideUrl, succPhenixEvent.getUrl()) && !succPhenixEvent.isIntermediate()) {
                        i.a("ImageUtils", "preloadImageUrl success with: " + decideUrl);
                    }
                    return true;
                }
            }).fetch();
        }
    }

    public static void a(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af386b6c", new Object[]{imageView, str});
        } else {
            a(imageView, str, -1);
        }
    }

    public static void a(ImageView imageView, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d5b4e8", new Object[]{imageView, str, new Boolean(z)});
        } else {
            a(imageView, str, -1, z);
        }
    }

    public static void a(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d57517", new Object[]{imageView, str, new Integer(i)});
        } else {
            a(imageView, str, i, true);
        }
    }

    public static void a(ImageView imageView, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d9e09d", new Object[]{imageView, str, new Integer(i), new Boolean(z)});
        } else {
            a(imageView, str, i, z, true);
        }
    }

    public static void a(ImageView imageView, String str, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9862e5d7", new Object[]{imageView, str, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            a(imageView, str, i, z, z2, false);
        }
    }

    public static void a(ImageView imageView, String str, int i, boolean z, boolean z2, boolean z3) {
        ImageStrategyConfig imageStrategyConfig;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fa87dd", new Object[]{imageView, str, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z2) {
            int i5 = 1200;
            if (imageView == null) {
                i4 = 1200;
            } else {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width <= 0) {
                    width = 1200;
                }
                if (height > 0) {
                    i5 = height;
                }
                int i6 = width;
                i4 = i5;
                i5 = i6;
            }
            imageStrategyConfig = ImageStrategyConfig.a("detail", 15).a(TaobaoImageUrlStrategy.ImageQuality.q90).a();
            i3 = i4;
            i2 = i5;
        } else {
            imageStrategyConfig = null;
            i2 = 0;
            i3 = 0;
        }
        a(imageView, i2, i3, str, i, z, imageStrategyConfig, z3);
    }

    private static boolean b(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aec20571", new Object[]{imageView, str})).booleanValue();
        }
        Object tag = imageView.getTag(c);
        if (tag instanceof com.taobao.phenix.intf.c) {
            com.taobao.phenix.intf.c cVar = (com.taobao.phenix.intf.c) tag;
            if (!StringUtils.isEmpty(str) && cVar.b(str)) {
                if (cVar.c()) {
                    return true;
                }
                if (cVar.a()) {
                    Object tag2 = imageView.getTag(b);
                    if (tag2 != null && Boolean.parseBoolean(tag2.toString())) {
                        return true;
                    }
                } else {
                    cVar.b();
                }
            } else {
                cVar.b();
            }
        }
        return false;
    }

    private static boolean b(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("297f1b3a", new Object[]{imageView, str, new Integer(i)})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return true;
        }
        if (i != -1) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageDrawable(null);
        }
        imageView.setTag(c, null);
        imageView.setTag(d, str);
        imageView.setTag(f10971a, str);
        imageView.setTag(b, true);
        return false;
    }

    private static boolean c(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4b9f72", new Object[]{imageView, str})).booleanValue();
        }
        String str2 = (String) imageView.getTag(f10971a);
        Drawable drawable = imageView.getDrawable();
        Object tag = imageView.getTag(b);
        boolean z = tag != null && Boolean.parseBoolean(tag.toString());
        if (!StringUtils.equals(str, str2) || drawable == null || !z) {
            return false;
        }
        imageView.setTag(c, null);
        return true;
    }

    private static boolean d(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("add53973", new Object[]{imageView, str})).booleanValue();
        }
        try {
            BitmapDrawable e2 = com.taobao.phenix.intf.b.h().e(str);
            if (e2 != null) {
                imageView.setImageDrawable(e2);
                imageView.setTag(d, str);
                imageView.setTag(f10971a, str);
                imageView.setTag(c, null);
                imageView.setTag(b, true);
                i.a("ImageUtils", "fetchLocalDrawable success with url: " + str);
                return true;
            }
        } catch (Throwable th) {
            i.a("ImageUtils", "fetchLocalDrawable with url: " + str + " error: ", th);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (android.text.StringUtils.isEmpty(r7) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.widget.ImageView r6, int r7, int r8, java.lang.String r9, int r10, boolean r11, com.taobao.tao.image.ImageStrategyConfig r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.utils.q.a(android.widget.ImageView, int, int, java.lang.String, int, boolean, com.taobao.tao.image.ImageStrategyConfig, boolean):void");
    }

    /* loaded from: classes5.dex */
    public static class b implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ImageView> f10975a;

        static {
            kge.a(-916932758);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public b(ImageView imageView) {
            this.f10975a = new WeakReference<>(imageView);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.f10975a.get();
            if (imageView == null) {
                return true;
            }
            String url = succPhenixEvent.getUrl();
            String str = (String) imageView.getTag(q.a());
            if (StringUtils.equals(url, str)) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                imageView.setImageDrawable(drawable);
                int b = q.b();
                if (drawable != null && !succPhenixEvent.isIntermediate()) {
                    z = true;
                }
                imageView.setTag(b, Boolean.valueOf(z));
                i.a("ImageUtils", "loadImageWithUrl withPhenix success with: " + str);
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ImageView> f10974a;
        private int b;
        private boolean c;

        static {
            kge.a(119206065);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public a(ImageView imageView, int i, boolean z) {
            this.c = false;
            this.b = -1;
            this.f10974a = new WeakReference<>(imageView);
            this.b = i;
            this.c = z;
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.f10974a.get();
            if (imageView == null) {
                return true;
            }
            String url = failPhenixEvent.getUrl();
            String str = (String) imageView.getTag(q.a());
            if (StringUtils.equals(url, str)) {
                String str2 = (String) imageView.getTag(q.c());
                if (!StringUtils.equals(str, str2)) {
                    q.a(imageView, str2, this.b, this.c, false, true);
                    i.a("ImageUtils", "loadImageWithUrl failure with: " + str + " reload with originalUrl: " + str2);
                } else {
                    int i = this.b;
                    if (i != -1) {
                        imageView.setImageResource(i);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                    imageView.setTag(q.b(), false);
                    i.a("ImageUtils", "loadImageWithUrl withPhenix failure with: " + str);
                }
            }
            return true;
        }
    }
}
