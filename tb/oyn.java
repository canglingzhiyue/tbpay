package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.base.media.frame.a;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.tao.Globals;

/* loaded from: classes5.dex */
public class oyn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_PROGRESS_HEIGHT = 20;

    /* renamed from: tb.oyn$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32493a = new int[NewDetailScreenConfig.ScreenType.values().length];

        static {
            try {
                f32493a[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32493a[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32493a[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1477239468);
    }

    public static a a(b bVar, fhi fhiVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("63611934", new Object[]{bVar, fhiVar, str, new Integer(i), new Boolean(z)});
        }
        int i2 = AnonymousClass1.f32493a[a(bVar).f().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return c(bVar, fhiVar, str, i, z);
        }
        return d(bVar, fhiVar, str, i, z);
    }

    public static a c(b bVar, fhi fhiVar, String str, int i, boolean z) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f8d05eb6", new Object[]{bVar, fhiVar, str, new Integer(i), new Boolean(z)});
        }
        a aVar = new a(-1, -1);
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        String[] split = str.split(":");
        float f = 1.0f;
        if (split.length == 2) {
            try {
                f = Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
            } catch (NumberFormatException e) {
                fjt.a("new_detail异常", "createMediaFrameSizeObjectForPhoneMainPicNative比例解析错误:" + str, e);
            }
        } else {
            fjt.a("new_detail异常", "createMediaFrameSizeObjectForPhoneMainPicNative Invalid ratio format:" + str);
        }
        int b = a(bVar).b();
        int b2 = b(bVar, fhiVar, str, i, z);
        int l = bVar.n().l();
        if (l == 2) {
            z2 = false;
        }
        if (z2 || f < 0.5625f || f > 1.7777778f) {
            fjt.a(fjt.TAG_TIP, "Adapter size for Pad&Fold , ForContainer-mainPicPadAndFoldSizeType:" + l + " dimension:" + str);
            if (f < 0.5625f) {
                f = 0.5625f;
            } else if (f >= 1.7777778f) {
                f = 1.7777778f;
            }
            float f2 = b;
            float f3 = f2 / f;
            float f4 = b2;
            float f5 = f * f4;
            if (f3 > f4) {
                i3 = (int) f5;
                i2 = b2;
            } else {
                i2 = f5 > f2 ? (int) f3 : b2;
                i3 = b;
            }
            int i4 = (b - i3) / 2;
            int i5 = (b2 - i2) / 2;
            aVar.b = i3;
            aVar.f11471a = i2;
            aVar.d = i3;
            aVar.c = i2;
            aVar.g = i5;
            aVar.m = i4;
            aVar.e = i5;
            aVar.l = i4;
            aVar.f = 0;
            aVar.h = ImageView.ScaleType.CENTER_CROP;
        } else {
            fjt.a(fjt.TAG_TIP, "Adapter size for Pad&Fold , ForScaleType-mainPicPadAndFoldSizeType:" + l + " dimension:" + str);
            float f6 = (float) b;
            float f7 = f6 / f;
            float f8 = (float) b2;
            float f9 = f * f8;
            aVar.b = b;
            aVar.f11471a = b2;
            if (f7 > f8) {
                aVar.d = (int) f9;
                aVar.c = b2;
                aVar.e = 0;
                aVar.l = (b - aVar.d) / 2;
            } else if (f9 > f6) {
                aVar.d = b;
                aVar.c = (int) f7;
                aVar.e = (b2 - aVar.c) / 2;
                aVar.l = 0;
            }
            aVar.g = 0;
            aVar.m = 0;
            aVar.f = 0;
            aVar.h = ImageView.ScaleType.FIT_CENTER;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.detail2.core.framework.base.media.frame.a d(com.taobao.android.detail2.core.framework.b r8, tb.fhi r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oyn.d(com.taobao.android.detail2.core.framework.b, tb.fhi, java.lang.String, int, boolean):com.taobao.android.detail2.core.framework.base.media.frame.a");
    }

    private static NewDetailScreenConfig a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig) ipChange.ipc$dispatch("1627dcf0", new Object[]{bVar}) : bVar.h().K();
    }

    private static int b(b bVar, fhi fhiVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40353c8d", new Object[]{bVar, fhiVar, str, new Integer(i), new Boolean(z)})).intValue() : i - a(bVar, fhiVar, str, z);
    }

    private static int a(b bVar, fhi fhiVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f901e6bd", new Object[]{bVar, fhiVar, str, new Boolean(z)})).intValue();
        }
        JSONObject jSONObject = fhiVar.H().getJSONObject("mainPicContainer");
        return a(bVar, jSONObject != null ? jSONObject.getString("bottomAreaBasic") : "", z);
    }

    public static int a(b bVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4158b86", new Object[]{bVar, str, new Boolean(z)})).intValue();
        }
        int i = AnonymousClass1.f32493a[a(bVar).f().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return c(bVar, str, z);
        }
        return b(bVar, str, z);
    }

    public static int b(b bVar, String str, boolean z) {
        NewDetailScreenConfig a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5671b07", new Object[]{bVar, str, new Boolean(z)})).intValue();
        }
        if (z) {
            a2 = a(bVar);
            i = 18;
        } else {
            a2 = a(bVar);
            i = 30;
        }
        int c = a2.c(i) + a(bVar).c(98);
        if (!TextUtils.isEmpty(str)) {
            try {
                c += a(bVar).c(Integer.parseInt(str));
            } catch (Exception e) {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        fjt.a(fjt.TAG_TIP, "getBottomAreaHeight bottomAreaHeight:" + c);
        return c;
    }

    public static int c(b bVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6b8aa88", new Object[]{bVar, str, new Boolean(z)})).intValue();
        }
        Application application = Globals.getApplication();
        int a2 = gbg.a(application, z ? 9.0f : 15.0f) + gbg.a((Context) application, 49.0f);
        if (!TextUtils.isEmpty(str)) {
            try {
                a2 += gbg.a(application, Integer.parseInt(str) / 2.0f);
            } catch (Exception e) {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        fjt.a(fjt.TAG_TIP, "getBottomAreaHeight bottomAreaHeight:" + a2);
        return a2;
    }

    private static int a(xji xjiVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b9e30", new Object[]{xjiVar, new Boolean(z), str})).intValue();
        }
        int a2 = xjiVar.a(z ? 18 : 30) + xjiVar.a(98);
        if (!TextUtils.isEmpty(str)) {
            try {
                a2 += xjiVar.a(Integer.parseInt(str));
            } catch (Exception e) {
                fjt.a(fjt.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            }
        }
        fjt.a(fjt.TAG_TIP, "getBottomAreaHeight bottomAreaHeight:" + a2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.detail2.core.framework.base.media.frame.a a(tb.xji r9, java.lang.String r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oyn.a(tb.xji, java.lang.String, boolean, java.lang.String):com.taobao.android.detail2.core.framework.base.media.frame.a");
    }
}
