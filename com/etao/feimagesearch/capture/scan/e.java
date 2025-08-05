package com.etao.feimagesearch.capture.scan;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public class e implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f6588a;
    private final com.taobao.taobao.scancode.gateway.util.m b;
    private final k c;

    /* renamed from: com.etao.feimagesearch.capture.scan.e$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6589a = new int[PhotoFrom.Values.values().length];

        static {
            try {
                f6589a[PhotoFrom.Values.TAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6589a[PhotoFrom.Values.OUTER_ALBUM_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6589a[PhotoFrom.Values.ALBUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6589a[PhotoFrom.Values.AUTO_DETECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6589a[PhotoFrom.Values.Got_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static final String TAG_PREFIX = "_scancode_";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f6590a;

        static {
            kge.a(1697368650);
            f6590a = new a();
        }

        private a() {
        }
    }

    static {
        kge.a(-187162394);
        kge.a(-1447985039);
    }

    public e(d dVar, com.taobao.taobao.scancode.gateway.util.m mVar, k kVar) {
        this.f6588a = dVar;
        this.b = mVar;
        this.c = kVar;
    }

    @Override // com.etao.feimagesearch.capture.scan.l
    public void a(c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83afb1a2", new Object[]{this, cVar, iVar});
            return;
        }
        if (!cVar.d()) {
            cot.c("_scancode_DecodeCallbackWrapper", "onDecodeFinished " + cVar.b().hashCode() + ", isTimeout=" + cVar.f() + ", cancelled=" + cVar.a() + ", isScanCaptureMergeInIrp=" + cVar.i() + ", photoFrom=" + cVar.j());
        }
        if (cVar.a()) {
            return;
        }
        Bitmap e = cVar.b().e();
        if (cVar.i() && e != null) {
            if (cVar.f()) {
                cVar.a(IDecodeTask.TaskStatus.CANCELLED);
                int i = AnonymousClass1.f6589a[cVar.j().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                    k kVar = this.c;
                    if (kVar != null) {
                        kVar.a(cVar, iVar);
                        return;
                    } else {
                        cot.a("Scan", "_scancode_DecodeCallbackWrapper", "onDecodeFinished: isScanCaptureMergeInIrp, goIrpIfNeededTask is null, something must be wrong");
                        return;
                    }
                }
                this.b.startPreview();
                return;
            }
            cVar.a(IDecodeTask.TaskStatus.CANCELLED);
            if (cVar.j() == PhotoFrom.Values.Got_CODE && a(iVar)) {
                if (this.c != null) {
                    cot.c("_scancode_DecodeCallbackWrapper", "goIrp");
                    this.c.a(e, cVar, iVar);
                    return;
                }
                cot.a("Scan", "_scancode_DecodeCallbackWrapper", "error: Got_CODE notify capture page");
                b(cVar, iVar);
                return;
            }
            b(cVar, iVar);
        } else if (cVar.f()) {
        } else {
            b(cVar, iVar);
        }
    }

    @Override // com.etao.feimagesearch.capture.scan.l
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb746b50", new Object[]{this, cVar});
            return;
        }
        cot.c("_scancode_DecodeCallbackWrapper", "onDecodeTimeout: " + cVar.b().hashCode() + " isTimeout=" + cVar.f() + ", cancelled=" + cVar.a() + ", isScanCaptureMergeInIrp=" + cVar.i() + ", photoFrom=" + cVar.j());
        if (cVar.a() || cVar.f()) {
            cot.a("Scan", "_scancode_DecodeCallbackWrapper", "onDecodeTimeout: task is cancelled " + cVar);
            return;
        }
        cVar.a(IDecodeTask.TaskStatus.TIMEOUT);
        if (cVar.i()) {
            int i = AnonymousClass1.f6589a[cVar.j().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                return;
            }
            b(cVar, null);
            return;
        }
        cVar.a(IDecodeTask.TaskStatus.CANCELLED);
        b(cVar, null);
    }

    private void b(c cVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2b8b63", new Object[]{this, cVar, iVar});
        } else {
            this.f6588a.a(cVar, iVar);
        }
    }

    private boolean a(i iVar) {
        h[] c;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb77258e", new Object[]{this, iVar})).booleanValue() : (iVar == null || (c = iVar.c()) == null || c.length <= 0) ? false : true;
    }
}
