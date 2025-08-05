package com.etao.feimagesearch.capture.scan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.util.aa;
import com.etao.feimagesearch.util.f;
import com.taobao.taobao.scancode.gateway.util.n;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.cpk;
import tb.cqc;
import tb.cqd;
import tb.kge;
import tb.oyi;

/* loaded from: classes3.dex */
public class c implements IDecodeTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALBUM_IMAGE_DETECT = 3;
    public static final int FRAME_DETECT = 1;
    public static final int REALTIME_BITMAP = 2;

    /* renamed from: a  reason: collision with root package name */
    public final int f6587a;
    private final boolean b;
    private final ScanMode c;
    private final KakaLibImageWrapper d;
    private boolean e;
    private final PhotoFrom.Values f;
    private final boolean g;
    private cqc h;
    private final HashMap<String, String> i;
    private final boolean j;
    private IDecodeTask.TaskStatus k;
    private int l;
    private Bitmap m;
    private int n;
    private l o;

    static {
        kge.a(-1237021077);
        kge.a(-1571530366);
    }

    public c(boolean z, KakaLibImageWrapper kakaLibImageWrapper, int i, HashMap<String, String> hashMap, int i2, PhotoFrom.Values values, l lVar, boolean z2) {
        boolean z3 = false;
        this.e = false;
        this.h = null;
        this.l = 0;
        this.k = IDecodeTask.TaskStatus.NORMAL;
        this.m = null;
        this.n = 0;
        this.b = z;
        this.d = kakaLibImageWrapper;
        this.c = ScanMode.TOUGH_MODE;
        this.l = i;
        this.i = hashMap;
        this.o = lVar;
        if (!z2 && com.etao.feimagesearch.config.b.au()) {
            z3 = true;
        }
        this.j = z3;
        this.f6587a = i2;
        this.f = values;
        this.g = z2;
    }

    public c(KakaLibImageWrapper kakaLibImageWrapper, ScanMode scanMode, HashMap<String, String> hashMap, int i, l lVar, PhotoFrom.Values values, boolean z, int i2) {
        boolean z2 = false;
        this.e = false;
        this.h = null;
        this.l = 0;
        this.k = IDecodeTask.TaskStatus.NORMAL;
        this.m = null;
        this.n = 0;
        this.b = false;
        this.c = scanMode;
        this.d = kakaLibImageWrapper;
        this.i = hashMap;
        this.o = lVar;
        if (!z && com.etao.feimagesearch.config.b.au()) {
            z2 = true;
        }
        this.j = z2;
        this.f6587a = i;
        this.f = values;
        this.g = z;
        this.n = i2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.k == IDecodeTask.TaskStatus.CANCELLED;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.k == IDecodeTask.TaskStatus.TIMEOUT;
    }

    @Override // com.etao.feimagesearch.capture.scan.IDecodeTask
    public void a(IDecodeTask.TaskStatus taskStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b159e", new Object[]{this, taskStatus});
            return;
        }
        if (!d()) {
            cot.c("_scancode_DecodeTaskV2", "changeTaskStatus " + taskStatus + ", token=" + this.d.hashCode());
        }
        this.k = taskStatus;
    }

    @Override // com.etao.feimagesearch.capture.scan.IDecodeTask
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.g;
    }

    public KakaLibImageWrapper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KakaLibImageWrapper) ipChange.ipc$dispatch("a877eda7", new Object[]{this}) : this.d;
    }

    public i c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("88cd39cc", new Object[]{this});
        }
        if (this.d == null) {
            return null;
        }
        try {
            h[] h = h();
            if (h == null) {
                return new i(null, null, null, this.i);
            }
            return new i(a(h) ? g() : null, a(this.d, h, this.b), h, this.i);
        } catch (Throwable th) {
            cot.a("_scancode_DecodeTaskV2", "DecodeTaskV2", th);
            return new i(null, null, null, this.i);
        }
    }

    private boolean a(h[] hVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6e862ca", new Object[]{this, hVarArr})).booleanValue();
        }
        if (hVarArr != null && hVarArr.length != 0) {
            h hVar = hVarArr[0];
            if (hVar.b() != null && com.etao.feimagesearch.config.b.aB()) {
                return a(hVar.b());
            }
            if (hVar.a() != null) {
                return a(hVar.a().a());
            }
        }
        return false;
    }

    private Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4535e4c", new Object[]{this});
        }
        if (d()) {
            return a(this.d);
        }
        return b(this.d);
    }

    private Bitmap a(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f163d1e0", new Object[]{this, kakaLibImageWrapper});
        }
        Bitmap a2 = ((f.b) com.etao.feimagesearch.util.f.a(kakaLibImageWrapper.a(), kakaLibImageWrapper.b(), kakaLibImageWrapper.c(), this.l, this.b)).b(kakaLibImageWrapper.f21284a.width(), kakaLibImageWrapper.f21284a.height()).a();
        kakaLibImageWrapper.a(a2);
        return a2;
    }

    private Bitmap b(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b78e5aa1", new Object[]{this, kakaLibImageWrapper});
        }
        if (this.m == null) {
            return null;
        }
        if (com.etao.feimagesearch.config.b.dr()) {
            return this.m;
        }
        float c = c(kakaLibImageWrapper);
        if (c <= 0.0f) {
            return null;
        }
        Bitmap b = com.etao.feimagesearch.util.d.b(this.m, c, c);
        if (b != null && b.isRecycled()) {
            return null;
        }
        return b;
    }

    private float c(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3684e074", new Object[]{this, kakaLibImageWrapper})).floatValue();
        }
        if (kakaLibImageWrapper.f21284a == null || this.m == null) {
            return 0.0f;
        }
        float width = kakaLibImageWrapper.f21284a.width();
        float height = kakaLibImageWrapper.f21284a.height();
        float min = Math.min(width / this.m.getWidth(), height / this.m.getHeight());
        cot.c("_scancode_DecodeTaskV2", "targetWidth = " + width + ", targetHeight = " + height + ", \t width = " + kakaLibImageWrapper.b() + ", height = " + kakaLibImageWrapper.c() + ", scale = " + min);
        return min;
    }

    private Rect[] a(KakaLibImageWrapper kakaLibImageWrapper, h[] hVarArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("aff31386", new Object[]{this, kakaLibImageWrapper, hVarArr, new Boolean(z)});
        }
        if (kakaLibImageWrapper == null || hVarArr == null) {
            return null;
        }
        Rect[] rectArr = new Rect[hVarArr.length];
        for (int i = 0; i < hVarArr.length; i++) {
            h hVar = hVarArr[i];
            cot.c("_scancode_DecodeTaskV2", "scanResult = " + JSON.toJSONString(hVar));
            if (hVar.a() != null && hVar.a().a() != null) {
                rectArr[i] = a(kakaLibImageWrapper, hVar.a().a(), z);
            } else if (hVar.b() != null) {
                rectArr[i] = a(kakaLibImageWrapper, hVar.b());
            }
            if (rectArr[i] == null) {
                return null;
            }
            cot.c("_scancode_DecodeTaskV2", "scanCode rect = " + rectArr[i]);
        }
        return rectArr;
    }

    private Rect a(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("be382425", new Object[]{this, kakaLibImageWrapper, maResult, new Boolean(z)}) : b(kakaLibImageWrapper, maResult, z);
    }

    private Rect b(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c04b8326", new Object[]{this, kakaLibImageWrapper, maResult, new Boolean(z)});
        }
        YuvImage d = kakaLibImageWrapper.d();
        Rect rect = new Rect();
        a(maResult, d, rect);
        a(rect, a(kakaLibImageWrapper, rect, z));
        return rect;
    }

    private Rect a(KakaLibImageWrapper kakaLibImageWrapper, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c7a09941", new Object[]{this, kakaLibImageWrapper, maResult});
        }
        if (kakaLibImageWrapper.f21284a == null) {
            return null;
        }
        Rect rect = new Rect(maResult.getX(), maResult.getY(), maResult.getX() + maResult.getWidth(), maResult.getY() + maResult.getHeight());
        float c = c(kakaLibImageWrapper);
        if (c <= 0.0f) {
            return null;
        }
        rect.left = (int) (rect.left * c);
        rect.top = (int) (rect.top * c);
        rect.right = (int) (rect.right * c);
        rect.bottom = (int) (rect.bottom * c);
        int floor = (int) Math.floor(this.m.getWidth() * c);
        int floor2 = (int) Math.floor(this.m.getHeight() * c);
        int max = Math.max((kakaLibImageWrapper.f21284a.width() - floor) / 2, 0);
        int max2 = Math.max((kakaLibImageWrapper.f21284a.height() - floor2) / 2, 0);
        rect.left += max;
        rect.right += max;
        rect.top += max2;
        rect.bottom += max2;
        return rect;
    }

    private void a(MaResult maResult, YuvImage yuvImage, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7054c2f", new Object[]{this, maResult, yuvImage, rect});
            return;
        }
        rect.left = (yuvImage.getHeight() - maResult.getY()) - maResult.getHeight();
        rect.top = maResult.getX();
        rect.right = yuvImage.getHeight() - maResult.getY();
        rect.bottom = maResult.getX() + maResult.getWidth();
        cot.c("_scancode_DecodeTaskV2", "after rotation " + rect);
    }

    private float a(KakaLibImageWrapper kakaLibImageWrapper, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9d7564d", new Object[]{this, kakaLibImageWrapper, rect, new Boolean(z)})).floatValue();
        }
        f.b bVar = (f.b) com.etao.feimagesearch.util.f.a(kakaLibImageWrapper.a(), kakaLibImageWrapper.b(), kakaLibImageWrapper.c(), 0, z);
        PointF pointF = new PointF(bVar.b(), bVar.c());
        float width = kakaLibImageWrapper.f21284a.width();
        float height = kakaLibImageWrapper.f21284a.height();
        PointF a2 = aa.a(new PointF(width, height), pointF);
        float f = (pointF.x - a2.x) / 2.0f;
        float f2 = (pointF.y - a2.y) / 2.0f;
        rect.left = (int) (rect.left - f);
        rect.right = (int) (rect.right - f);
        rect.top = (int) (rect.top - f2);
        rect.bottom = (int) (rect.bottom - f2);
        cot.c("_scancode_DecodeTaskV2", "xStart = " + f + ", yStart = " + f2);
        StringBuilder sb = new StringBuilder();
        sb.append("after move, ");
        sb.append(rect);
        cot.c("_scancode_DecodeTaskV2", sb.toString());
        return Math.max(width / bVar.b(), height / bVar.c());
    }

    private void a(Rect rect, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e73caf", new Object[]{this, rect, new Float(f)});
            return;
        }
        rect.left = (int) (rect.left * f);
        rect.right = (int) (rect.right * f);
        rect.top = (int) (rect.top * f);
        rect.bottom = (int) (rect.bottom * f);
        cot.c("_scancode_DecodeTaskV2", "after zoom, rect = " + rect);
    }

    private Rect a(int i, int i2, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("170f3bf1", new Object[]{this, new Integer(i), new Integer(i2), rect, rect2});
        }
        float width = rect2.width();
        float height = rect2.height();
        float f = rect.left / width;
        float f2 = rect.top / height;
        float f3 = rect.right / width;
        float f4 = rect.bottom / height;
        Rect rect3 = new Rect();
        float f5 = i2;
        float f6 = i;
        rect3.set((int) (f2 * f5), (int) (f * f6), (int) ((f4 - f2) * f5), (int) ((f3 - f) * f6));
        return rect3;
    }

    private h[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h[]) ipChange.ipc$dispatch("a6661225", new Object[]{this});
        }
        if (d()) {
            return d(this.d);
        }
        return e(this.d);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : 1 == this.f6587a;
    }

    private h[] d(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h[]) ipChange.ipc$dispatch("1baf520f", new Object[]{this, kakaLibImageWrapper});
        }
        YuvImage d = kakaLibImageWrapper.d();
        Rect rect = null;
        if (d == null) {
            return null;
        }
        String replace = Build.MODEL.toLowerCase(Locale.US).replace(" ", "");
        long currentTimeMillis = System.currentTimeMillis();
        if (!replace.contains("nexus5x")) {
            rect = a(Math.min(d.getWidth(), d.getHeight()), Math.max(d.getWidth(), d.getHeight()), kakaLibImageWrapper.b, kakaLibImageWrapper.f21284a);
        }
        MaResult[] a2 = oyi.a(d, rect, kakaLibImageWrapper.i());
        cqd.INSTANCE.a(System.currentTimeMillis() - currentTimeMillis);
        return a(a2);
    }

    private h[] a(MaResult[] maResultArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h[]) ipChange.ipc$dispatch("ca44bce7", new Object[]{this, maResultArr});
        }
        if (maResultArr == null || maResultArr.length == 0) {
            return null;
        }
        if (maResultArr.length == 1) {
            return new h[]{h.a(new n.a(maResultArr[0], "masdk"))};
        }
        ArrayList arrayList = new ArrayList(10);
        for (MaResult maResult : maResultArr) {
            if (a(maResult)) {
                arrayList.add(h.a(new n.a(maResult, "masdk")));
            }
        }
        if (arrayList.size() == 0) {
            return new h[]{h.a(new n.a(maResultArr[0], "masdk"))};
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    private boolean a(MaResult maResult) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e04fadd6", new Object[]{this, maResult})).booleanValue();
        }
        if (maResult != null && !this.e && maResult.getWidth() * maResult.getHeight() != 0) {
            z = true;
        }
        if (!z) {
            cot.b("_scancode_DecodeTaskV2", "unableToGetCodeAnchor");
        }
        return z;
    }

    private h[] e(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h[]) ipChange.ipc$dispatch("891c0f2e", new Object[]{this, kakaLibImageWrapper});
        }
        MaResult[] f = f(kakaLibImageWrapper);
        if (f == null || f.length == 0) {
            return null;
        }
        h[] hVarArr = new h[f.length];
        int i = 0;
        for (MaResult maResult : f) {
            hVarArr[i] = h.a(maResult);
            i++;
        }
        return hVarArr;
    }

    private MaResult[] f(KakaLibImageWrapper kakaLibImageWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("121a67b4", new Object[]{this, kakaLibImageWrapper});
        }
        if (kakaLibImageWrapper.e() == null) {
            return null;
        }
        this.m = com.etao.feimagesearch.config.b.dx() ? kakaLibImageWrapper.e() : kakaLibImageWrapper.e().copy(kakaLibImageWrapper.e().getConfig(), true);
        return b(kakaLibImageWrapper, this.m);
    }

    private MaResult[] b(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("f75c5c30", new Object[]{this, kakaLibImageWrapper, bitmap});
        }
        cot.c("_scancode_DecodeTaskV2", "decodeByAntSdk: bitmap width = " + bitmap.getWidth() + ", height " + bitmap.getHeight());
        long currentTimeMillis = System.currentTimeMillis();
        MaResult[] a2 = a(bitmap);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean z = a2 != null && a2.length > 0;
        cot.a("AutoDetect", "_scancode_DecodeTaskV2", "decodeInBatch cost " + currentTimeMillis2 + ", decodeSuccess=" + z);
        cqc cqcVar = this.h;
        if (cqcVar != null) {
            cqcVar.b(z);
            this.h.b(currentTimeMillis2);
            cqd.INSTANCE.a(this.h);
        }
        if (a()) {
            return null;
        }
        if (z) {
            this.m = bitmap;
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "albumDetectCode", "costTime", String.valueOf(currentTimeMillis2));
            return a2;
        } else if (this.j && a(kakaLibImageWrapper.h(), bitmap)) {
            return c(kakaLibImageWrapper, bitmap);
        } else {
            return null;
        }
    }

    private MaResult[] c(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("c213fef1", new Object[]{this, kakaLibImageWrapper, bitmap});
        }
        cot.c("_scancode_DecodeTaskV2", "processLongImage---");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap a2 = a(bitmap, false);
        if (a2 == null) {
            cot.c("_scancode_DecodeTaskV2", "downPartBitmap is null");
            return null;
        }
        MaResult[] a3 = a(a2);
        if (a3 != null && a3.length > 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            cot.c("_scancode_DecodeTaskV2", "long image downPartBitmap cost " + currentTimeMillis2);
            a(a2, a3, currentTimeMillis2, true, false);
            this.m = a2;
            this.e = true;
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "albumLongImageDetectCode", "costTime", String.valueOf(currentTimeMillis2));
            return a3;
        }
        if (a2 != bitmap) {
            a2.recycle();
        }
        if (a()) {
            return null;
        }
        Bitmap a4 = a(bitmap, true);
        if (a4 == null) {
            cot.b("_scancode_DecodeTaskV2", "upPartBitmap is null");
            return null;
        }
        MaResult[] a5 = a(a4);
        if (a5 != null && a5.length > 0) {
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            cot.c("_scancode_DecodeTaskV2", "long image upPartBitmap cost " + currentTimeMillis3);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "albumLongImageDetectCode", "costTime", String.valueOf(currentTimeMillis3));
            a(a4, a5, currentTimeMillis3, true, true);
            this.m = a4;
            this.e = true;
            return a5;
        }
        cot.a("AutoDetect", "_scancode_DecodeTaskV2", "cannot find any code");
        a(bitmap, null, System.currentTimeMillis() - currentTimeMillis, false, true);
        if (a4 != bitmap) {
            a4.recycle();
        }
        return null;
    }

    private MaResult[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("bf0246d5", new Object[]{this, bitmap});
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        MaResult[] a2 = oyi.a(copy, 36607, false);
        if (copy != bitmap) {
            try {
                copy.recycle();
            } catch (Throwable unused) {
            }
        }
        return a2;
    }

    private void a(Bitmap bitmap, MaResult[] maResultArr, long j, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0801199", new Object[]{this, bitmap, maResultArr, new Long(j), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (maResultArr == null || maResultArr.length <= 0) {
            str = "default_code_type";
        } else {
            str = "" + maResultArr[0].getType();
        }
        String[] strArr = new String[12];
        strArr[0] = "scanCost";
        strArr[1] = j + "";
        strArr[2] = "pixel";
        strArr[3] = bitmap.getWidth() + "_" + bitmap.getHeight();
        strArr[4] = "isScanSuc";
        strArr[5] = "" + z;
        strArr[6] = "codeRegion";
        strArr[7] = z2 ? "top" : "down";
        strArr[8] = "scanMode";
        strArr[9] = this.c.getScanMode();
        strArr[10] = "codeType";
        strArr[11] = str;
        cox.a(cpk.ALBUM_PAGE_NAME, "LongPicScan", 2101, strArr);
    }

    private boolean a(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cc61d2", new Object[]{this, context, bitmap})).booleanValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager == null) {
            cot.a("AutoDetect", "_scancode_DecodeTaskV2", "cropLongImage: wm is null");
            return false;
        }
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        return bitmap.getHeight() >= bitmap.getWidth() * 3 && bitmap.getHeight() * point.x >= bitmap.getWidth() * point.y;
    }

    private Bitmap a(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3e605dac", new Object[]{this, bitmap, new Boolean(z)});
        }
        int width = bitmap.getWidth();
        int height = z ? 0 : bitmap.getHeight() - width;
        if (height < 0) {
            cot.a("AutoDetect", "_scancode_DecodeTaskV2", "cropLongImage: beginY = " + height);
            return null;
        }
        return Bitmap.createBitmap(bitmap, 0, height, width, width);
    }

    public ScanMode e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScanMode) ipChange.ipc$dispatch("7d03c07f", new Object[]{this}) : this.c;
    }

    public void a(cqc cqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3eb1503", new Object[]{this, cqcVar});
        } else {
            this.h = cqcVar;
        }
    }

    public PhotoFrom.Values j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoFrom.Values) ipChange.ipc$dispatch("d12a7b23", new Object[]{this}) : this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.n;
    }

    public l m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("7d5b8db3", new Object[]{this}) : this.o;
    }
}
