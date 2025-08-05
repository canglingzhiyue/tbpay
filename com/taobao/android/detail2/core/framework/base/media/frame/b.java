package com.taobao.android.detail2.core.framework.base.media.frame;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import tb.fhi;
import tb.fjl;
import tb.fjm;
import tb.fjt;
import tb.kge;
import tb.oyn;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_BLUR_RPX = 100;
    public static final int VALUE_BOTTOM_SAFEAREA_MARGIN = 18;
    public static final int VALUE_BOTTOM_SAFEAREA_MARGIN_NO_HALF_SCREEN = 30;
    public static final int VALUE_COMMON_DEFAULT_HEIGHT = 98;
    public static final int VALUE_NAV_HEIGHT = 44;
    public static final String VALUE_NINE_SIXTEEN_RATIO = "9:16";
    public static final String VALUE_SIXTEEN_NINE_RATIO = "16:9";
    public static final String VALUE_THREE_FOUR_RATIO = "3:4";

    /* renamed from: a  reason: collision with root package name */
    private static int f11472a;
    private static int b;
    private static float c;
    private static Double d;

    /* renamed from: com.taobao.android.detail2.core.framework.base.media.frame.b$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11473a = new int[NewDetailScreenConfig.ScreenType.values().length];

        static {
            try {
                f11473a[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11473a[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11473a[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(2094986528);
        c = 0.0f;
    }

    public static a a(com.taobao.android.detail2.core.framework.b bVar, fhi fhiVar, MainMediaInfo mainMediaInfo, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7cc2285d", new Object[]{bVar, fhiVar, mainMediaInfo, new Integer(i), new Boolean(z)});
        }
        int i2 = AnonymousClass1.f11473a[a(bVar).f().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (fhiVar.b != null) {
                return b(bVar, fhiVar, i, z);
            }
            if (fhiVar.ae != null) {
                return c(bVar, fhiVar, mainMediaInfo, i, z);
            }
            return new a(-1, -1);
        } else if (fhiVar.b != null) {
            return a(bVar, fhiVar, i, z);
        } else {
            if (fhiVar.ae != null) {
                return b(bVar, fhiVar, mainMediaInfo, i, z);
            }
            return new a(-1, -1);
        }
    }

    private static a c(com.taobao.android.detail2.core.framework.b bVar, fhi fhiVar, MainMediaInfo mainMediaInfo, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("841b495f", new Object[]{bVar, fhiVar, mainMediaInfo, new Integer(i), new Boolean(z)});
        }
        if (mainMediaInfo == null || mainMediaInfo.data == null) {
            return new a(-1, -1);
        }
        return oyn.a(bVar, fhiVar, mainMediaInfo.data.dimension, i, z);
    }

    private static a b(com.taobao.android.detail2.core.framework.b bVar, fhi fhiVar, MainMediaInfo mainMediaInfo, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6eb8de", new Object[]{bVar, fhiVar, mainMediaInfo, new Integer(i), new Boolean(z)});
        }
        if (mainMediaInfo == null || mainMediaInfo.data == null) {
            return new a(-1, -1);
        }
        return oyn.a(bVar, fhiVar, mainMediaInfo.data.dimension, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.taobao.android.detail2.core.framework.base.media.frame.a a(com.taobao.android.detail2.core.framework.b r16, tb.fhi r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.base.media.frame.b.a(com.taobao.android.detail2.core.framework.b, tb.fhi, int, boolean):com.taobao.android.detail2.core.framework.base.media.frame.a");
    }

    private static a b(com.taobao.android.detail2.core.framework.b bVar, fhi fhiVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("32c5f53f", new Object[]{bVar, fhiVar, new Integer(i), new Boolean(z)});
        }
        char c2 = 65535;
        a aVar = new a(-1, -1);
        Activity g = bVar.g();
        if (g != null && fhiVar != null && fhiVar.b != null && fhiVar.b.data != null) {
            a(g);
            int b2 = a(bVar).b();
            int a2 = a(g, i, z);
            AtmosParams G = bVar.h().G();
            boolean z2 = bVar.h().H() && fhiVar.f == 0;
            if (z2) {
                a2 -= b(bVar, G);
            }
            String str = fhiVar.b.data.dimension;
            int hashCode = str.hashCode();
            if (hashCode != 50861) {
                if (hashCode != 1513508) {
                    if (hashCode == 1755398 && str.equals("9:16")) {
                        c2 = 0;
                    }
                } else if (str.equals(VALUE_SIXTEEN_NINE_RATIO)) {
                    c2 = 1;
                }
            } else if (str.equals(VALUE_THREE_FOUR_RATIO)) {
                c2 = 2;
            }
            if (c2 == 0) {
                aVar.c = a2;
                aVar.d = (int) (aVar.c * 0.5625f);
                aVar.h = ImageView.ScaleType.CENTER_CROP;
                aVar.e = z2 ? b(bVar, G) : 0;
                aVar.f = 0;
            } else if (c2 == 1) {
                aVar.c = (int) (b2 * 0.5625f);
                aVar.d = b2;
                aVar.h = ImageView.ScaleType.FIT_CENTER;
                aVar.f = 0;
                aVar.e = (a2 - aVar.c) / 2;
            } else if (c2 == 2) {
                aVar.c = a2;
                aVar.d = (int) (a2 * 0.75f);
                aVar.h = ImageView.ScaleType.FIT_CENTER;
                aVar.f = 0;
                aVar.e = z2 ? b(bVar, G) : 0;
            } else {
                if (a(bVar).f() == NewDetailScreenConfig.ScreenType.PAD_PORTRAIT) {
                    aVar.c = b2;
                    aVar.d = b2;
                    aVar.e = (a2 - aVar.c) / 2;
                } else {
                    aVar.c = a2;
                    aVar.d = a2;
                    aVar.e = z2 ? b(bVar, G) : 0;
                }
                aVar.h = ImageView.ScaleType.FIT_CENTER;
                aVar.f = 0;
            }
            if (fhiVar.f == 0 && aVar.c >= a2 && z2) {
                float c3 = a(bVar).c(G.layoutInfo.borderRadius);
                aVar.k = new float[]{c3, c3, c3, c3, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                aVar.k = null;
            }
            if (aVar.c < 0) {
                aVar.c = 0;
            }
        }
        return aVar;
    }

    private static NewDetailScreenConfig a(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig) ipChange.ipc$dispatch("1627dcf0", new Object[]{bVar}) : bVar.h().K();
    }

    private static int a(com.taobao.android.detail2.core.framework.b bVar, MainMediaInfo mainMediaInfo, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e5767bc", new Object[]{bVar, mainMediaInfo, new Integer(i), new Boolean(z)})).intValue() : i - a(bVar, mainMediaInfo, z);
    }

    private static int a(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c646c84", new Object[]{context, new Integer(i), new Boolean(z)})).intValue() : i - a(context, z);
    }

    public static int a(com.taobao.android.detail2.core.framework.b bVar, AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5cab4e", new Object[]{bVar, atmosParams})).intValue() : a(bVar).c(atmosParams.layoutInfo.height) + fjm.b(bVar.g()) + fjm.a(bVar.g());
    }

    public static int b(com.taobao.android.detail2.core.framework.b bVar, AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("570ad4cf", new Object[]{bVar, atmosParams})).intValue() : fjl.a(bVar.g(), atmosParams.layoutInfo.height / 2) + fjm.b(bVar.g()) + fjm.a(bVar.g());
    }

    private static int a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda67", new Object[]{context, new Boolean(z)})).intValue();
        }
        return fjl.a(context, ((z ? 18 : 30) + 98) / 2);
    }

    private static int a(com.taobao.android.detail2.core.framework.b bVar, MainMediaInfo mainMediaInfo, boolean z) {
        NewDetailScreenConfig a2;
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9834982f", new Object[]{bVar, mainMediaInfo, new Boolean(z)})).intValue();
        }
        if (z) {
            a2 = a(bVar);
            c2 = 18;
        } else {
            a2 = a(bVar);
            c2 = c();
        }
        int c3 = a2.c(c2);
        int c4 = a(bVar).c(98) + c3;
        if (mainMediaInfo.data.bottomAreaHeight != null) {
            try {
                int parseInt = Integer.parseInt(mainMediaInfo.data.bottomAreaHeight);
                if (parseInt > 0 && "9:16".equals(mainMediaInfo.data.dimension) && (!b() || z)) {
                    parseInt = 0;
                }
                if (parseInt == 0) {
                    return 0;
                }
                if (parseInt > 0) {
                    return a(bVar).c(parseInt) + c3;
                }
            } catch (Exception e) {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        return c4;
    }

    private static double a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c56", new Object[0])).doubleValue() : Math.floor(75000.0d / b((int) Math.ceil(b / c))) / 100.0d;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (c <= 0.1d) {
            c = context.getResources().getDisplayMetrics().density;
        }
        if (b == 0 || f11472a == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                windowManager.getDefaultDisplay().getRealSize(point);
            } else {
                windowManager.getDefaultDisplay().getSize(point);
            }
            b = point.y;
            f11472a = point.x;
        }
        if (d != null) {
            return;
        }
        d = Double.valueOf(750.0d / (f11472a / c));
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a() <= 0.5d;
    }

    private static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : b() ? 30 : 18;
    }

    private static double b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c28", new Object[]{new Integer(i)})).doubleValue() : d.doubleValue() * i;
    }
}
