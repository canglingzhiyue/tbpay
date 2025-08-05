package com.etao.feimagesearch.capture.scan.irp;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.d;
import com.etao.feimagesearch.capture.scan.h;
import com.etao.feimagesearch.capture.scan.i;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import tb.com;
import tb.cot;
import tb.kge;
import tb.oxy;

/* loaded from: classes3.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SCANCODE_TOKEN = -1;
    public static final int IRP_SCAN_CODE_RESULT_FLAG = 1;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f6597a;
    private final HashMap<Integer, c> b = new HashMap<>();
    private final LimitLinkedHashMap<Integer, C0221b> c = new LimitLinkedHashMap<>(16);

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public MaResult f6598a;
        public RectF b;
        public String c;
        public RectF d;
        public HashMap<String, String> e;
        public ScancodeType f;

        static {
            kge.a(-715044243);
        }

        public a(MaResult maResult, RectF rectF, String str, HashMap<String, String> hashMap) {
            this.f6598a = maResult;
            this.b = rectF;
            this.c = str;
            this.e = new HashMap<>(hashMap);
            this.f = oxy.a(maResult);
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.scan.irp.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0221b {

        /* renamed from: a  reason: collision with root package name */
        public final PhotoFrom.Values f6599a;
        public final List<a> b;

        static {
            kge.a(-1716750421);
        }

        public C0221b(List<a> list, PhotoFrom.Values values) {
            this.b = list;
            this.f6599a = values;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(List<a> list, PhotoFrom.Values values);
    }

    static {
        kge.a(1696622241);
        kge.a(1409154498);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a109da19", new Object[0]);
        }
        if (f6597a == null) {
            synchronized (b.class) {
                if (f6597a == null) {
                    f6597a = new b();
                }
            }
        }
        return f6597a;
    }

    private void b(com.etao.feimagesearch.capture.scan.c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2b8b63", new Object[]{this, cVar, iVar});
            return;
        }
        Bitmap e = cVar.b().e();
        if (e == null) {
            cot.a("Scan", "_scancode_IrpScancodeResultManager", "bitmap is null");
            return;
        }
        int hashCode = e.hashCode();
        cot.c("_scancode_IrpScancodeResultManager", "storeScanResult: token=" + hashCode + " isFrame=" + cVar.d() + ", photoFrom=" + cVar.j());
        LinkedList<a> a2 = a(e, iVar, cVar.j().getValue());
        if (a2 == null || a2.size() == 0) {
            cot.a("Scan", "_scancode_IrpScancodeResultManager", "imgCodeDetectResultList is null or empty");
            return;
        }
        c cVar2 = this.b.get(Integer.valueOf(hashCode));
        if (cVar2 != null) {
            cot.c("_scancode_IrpScancodeResultManager", "storeScanResult: token " + hashCode + ", listener is null");
            cVar2.a(a2, cVar.j());
            return;
        }
        this.c.put(Integer.valueOf(hashCode), new C0221b(a2, cVar.j()));
    }

    public void a(FragmentActivity fragmentActivity, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f27189", new Object[]{this, fragmentActivity, aVar});
            return;
        }
        IrpCodeProcessor a2 = com.etao.feimagesearch.capture.scan.irp.a.a().a(fragmentActivity, aVar.e);
        if (a2 == null) {
            return;
        }
        a2.a(fragmentActivity, aVar.f6598a, aVar.c);
    }

    private LinkedList<a> a(Bitmap bitmap, i iVar, String str) {
        RectF a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("eeeab1b8", new Object[]{this, bitmap, iVar, str});
        }
        Rect[] b = iVar.b();
        h[] c2 = iVar.c();
        if (c2 == null || c2.length == 0 || b == null || c2.length != b.length) {
            return null;
        }
        LinkedList<a> linkedList = new LinkedList<>();
        for (int i = 0; i < c2.length; i++) {
            h hVar = c2[i];
            if (hVar.b() != null) {
                MaResult b2 = hVar.b();
                if (bitmap != null && (a2 = a(b2, bitmap.getWidth(), bitmap.getHeight())) != null) {
                    linkedList.add(new a(b2, a2, str, iVar.d()));
                }
            } else if (hVar.a() != null) {
                linkedList.add(new a(hVar.a().a(), a(b[i]), str, iVar.d()));
            }
        }
        return linkedList;
    }

    private RectF a(Rect rect) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("19794116", new Object[]{this, rect});
        }
        float p = com.p();
        float o = com.o();
        float f = (rect.left + rect.right) / 2.0f;
        float f2 = (rect.top + rect.bottom) / 2.0f;
        if (Math.min(rect.width(), rect.height()) < 80.0f) {
            if (rect.width() < rect.height()) {
                float min = Math.min(Math.min(f, p - f) * 2.0f, 80.0f) / 2.0f;
                rectF = new RectF(f - min, rect.top, f + min, rect.bottom);
            } else {
                float min2 = Math.min(Math.min(f2, o - f2) * 2.0f, 80.0f) / 2.0f;
                rectF = new RectF(rect.left, f2 - min2, rect.right, f2 + min2);
            }
        } else {
            rectF = new RectF(rect);
        }
        RectF rectF2 = new RectF(rectF.left / p, rectF.top / o, rectF.right / p, rectF.bottom / o);
        cot.c("_scancode_IrpScancodeResultManager", "rectF=" + rectF2 + ", screenWidth=" + p + ", screenHeight=" + o);
        return rectF2;
    }

    private RectF a(MaResult maResult, float f, float f2) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("aaba83d5", new Object[]{this, maResult, new Float(f), new Float(f2)});
        }
        if (f == 0.0f || f2 == 0.0f) {
            return null;
        }
        float x = maResult.getX() + (maResult.getWidth() / 2.0f);
        float y = maResult.getY() + (maResult.getHeight() / 2.0f);
        cot.c("_scancode_IrpScancodeResultManager", "centerX=" + x + ", centerY=" + y + ", width=" + maResult.getWidth() + ", height=" + maResult.getHeight());
        if (Math.min(maResult.getWidth(), maResult.getHeight()) < 80.0f) {
            if (maResult.getWidth() >= maResult.getHeight()) {
                float min = Math.min(Math.min(y, f2 - y) * 2.0f, 80.0f) / 2.0f;
                rectF = new RectF(maResult.getX(), y - min, maResult.getX() + maResult.getWidth(), y + min);
            } else {
                float min2 = Math.min(Math.min(x, f - x) * 2.0f, 80.0f) / 2.0f;
                rectF = new RectF(x - min2, maResult.getY(), x + min2, maResult.getY() + maResult.getHeight());
            }
        } else {
            rectF = new RectF(maResult.getX(), maResult.getY(), maResult.getX() + maResult.getWidth(), maResult.getY() + maResult.getHeight());
        }
        cot.c("_scancode_IrpScancodeResultManager", "result=" + rectF);
        return new RectF(rectF.left / f, rectF.top / f2, rectF.right / f, rectF.bottom / f2);
    }

    @Override // com.etao.feimagesearch.capture.scan.d
    public void a(com.etao.feimagesearch.capture.scan.c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83afb1a2", new Object[]{this, cVar, iVar});
        } else if (iVar == null || iVar.c() == null || iVar.c().length == 0) {
            cot.c("_scancode_IrpScancodeResultManager", "scanResultWrapper is null or scanResultWrapper.getScanResults() is empty");
        } else {
            b(cVar, iVar);
        }
    }

    public void a(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2b2867", new Object[]{this, new Integer(i), cVar});
            return;
        }
        C0221b c0221b = this.c.get(Integer.valueOf(i));
        if (c0221b != null) {
            cot.c("_scancode_IrpScancodeResultManager", "registerIrpScancodeResultListener: onGetScanResult");
            cVar.a(c0221b.b, c0221b.f6599a);
            return;
        }
        this.b.put(Integer.valueOf(i), cVar);
        cot.c("_scancode_IrpScancodeResultManager", "registerIrpScancodeResultListener: cache listener");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.remove(Integer.valueOf(i));
        this.c.remove(Integer.valueOf(i));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    public static boolean a(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{num})).booleanValue() : num != null && (num.intValue() & 1) > 0;
    }
}
