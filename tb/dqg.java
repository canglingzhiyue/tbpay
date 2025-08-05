package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.j;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.d;
import com.etao.feimagesearch.structure.capture.g;
import com.etao.feimagesearch.util.ab;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class dqg implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "_scancode_TakePhotoManager";

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.capture.dynamic.bean.a f26907a;
    private final boolean b;
    private final j c;
    private final Activity d;
    private final CaptureManager e;
    private final com.etao.feimagesearch.model.b f;
    private final View g;

    /* loaded from: classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dqg.a(dqg.this).u();
            cot.a("Dynamic", "promptImageDark", rrv.PHOTO_CANCEL_SCAN);
            cox.a(rrv.PHOTO_CANCEL_SCAN, new String[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ boolean d;

        public c(Bitmap bitmap, Activity activity, boolean z) {
            this.c = bitmap;
            this.b = activity;
            this.d = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dqg.a(dqg.this).u();
            cox.a("continueupload", new String[0]);
            cot.a("Dynamic", "promptImageDark", "continueupload");
            if (dqg.a(dqg.this).U()) {
                fkj.a().a(this.c);
            }
            dqg dqgVar = dqg.this;
            dqg.a(dqgVar, this.b, this.c, this.d, dqg.b(dqgVar), dqg.c(dqg.this), -1, PhotoFrom.Values.TAKE);
        }
    }

    static {
        kge.a(-1293037306);
        kge.a(129786070);
        Companion = new a(null);
    }

    public dqg(j scancodeBizManager, Activity activity, CaptureManager captureManager, com.etao.feimagesearch.model.b pageModel, View rootView) {
        q.c(scancodeBizManager, "scancodeBizManager");
        q.c(activity, "activity");
        q.c(captureManager, "captureManager");
        q.c(pageModel, "pageModel");
        q.c(rootView, "rootView");
        this.c = scancodeBizManager;
        this.d = activity;
        this.e = captureManager;
        this.f = pageModel;
        this.g = rootView;
        this.b = com.etao.feimagesearch.config.b.cP();
    }

    public static final /* synthetic */ CaptureManager a(dqg dqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureManager) ipChange.ipc$dispatch("64863154", new Object[]{dqgVar}) : dqgVar.e;
    }

    public static final /* synthetic */ void a(dqg dqgVar, Activity activity, Bitmap bitmap, boolean z, com.etao.feimagesearch.model.b bVar, Map map, int i, PhotoFrom.Values values) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c4f8ac", new Object[]{dqgVar, activity, bitmap, new Boolean(z), bVar, map, new Integer(i), values});
        } else {
            dqgVar.a(activity, bitmap, z, bVar, map, i, values);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.model.b b(dqg dqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.model.b) ipChange.ipc$dispatch("e7e77b39", new Object[]{dqgVar}) : dqgVar.f;
    }

    public static final /* synthetic */ HashMap c(dqg dqgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cfb43983", new Object[]{dqgVar}) : dqgVar.d();
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1602792654);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final com.etao.feimagesearch.capture.dynamic.bean.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bean.a) ipChange.ipc$dispatch("643e256f", new Object[]{this}) : this.f26907a;
    }

    @Override // com.etao.feimagesearch.structure.capture.d
    public void a(Bitmap snapshot, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8065b3c6", new Object[]{this, snapshot, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(snapshot, "snapshot");
        com.etao.feimagesearch.newresult.perf.a.as();
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onCaptureFinished", 19999, new String[0]);
        b(snapshot, z, z2);
    }

    public final boolean a(boolean z, cti qrCodeNotFoundEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db8838c8", new Object[]{this, new Boolean(z), qrCodeNotFoundEvent})).booleanValue();
        }
        q.c(qrCodeNotFoundEvent, "qrCodeNotFoundEvent");
        com.etao.feimagesearch.capture.dynamic.bean.a aVar = this.f26907a;
        if (aVar != null) {
            KakaLibImageWrapper kakaLibImageWrapper = qrCodeNotFoundEvent.c;
            cot.c(TAG, "onScanFailed cachedImageWrapper=" + aVar.b() + ", outImageWrapper=" + kakaLibImageWrapper);
            if (kakaLibImageWrapper != null && q.a(kakaLibImageWrapper, aVar.b())) {
                cot.c(TAG, "not scan code in photo " + kakaLibImageWrapper);
                this.f26907a = null;
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "decodeFailedAfterTakePhoto", 19999, new String[0]);
                if (q.a((Object) this.e.q(), (Object) "scan")) {
                    cuk.a(this.d, com.etao.feimagesearch.config.b.ah(), 0);
                }
                a(this.d, aVar.a(), aVar.d(), this.f, d(), aVar.a().hashCode(), PhotoFrom.Values.TAKE);
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            this.f26907a = null;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f26907a = null;
        }
    }

    private final void b(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895f3a5", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            a(bitmap, this.d, z2);
        } else {
            if (this.e.U()) {
                fkj.a().a(bitmap);
            }
            if (this.e.V()) {
                com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(bitmap));
            }
            if (q.a((Object) this.e.q(), (Object) "scan") || this.b) {
                a(bitmap, z2);
            } else {
                cot.c(TAG, "direct jump");
                a(this.d, bitmap, z2, this.f, d(), -1, PhotoFrom.Values.TAKE);
            }
        }
        cox.a("Take", new String[0]);
    }

    private final void a(Bitmap bitmap, boolean z) {
        long j;
        boolean z2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5e18ce", new Object[]{this, bitmap, new Boolean(z)});
            return;
        }
        cot.c(TAG, "try to decode after take photo " + bitmap);
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "decodeAfterTakePhoto", 19999, new String[0]);
        if (q.a((Object) this.e.q(), (Object) "scan")) {
            j = com.etao.feimagesearch.config.b.dT();
            str = ScanFromEnum.SYS_CAMERA.getScanFrom();
            z2 = false;
        } else {
            String scanFrom = ScanFromEnum.PLT_CAMERA.getScanFrom();
            j = 0;
            z2 = this.b;
            str = scanFrom;
        }
        KakaLibImageWrapper wrapper = this.c.a(bitmap, c(), PhotoFrom.Values.TAKE, j, str, z2);
        q.a((Object) wrapper, "wrapper");
        this.f26907a = new com.etao.feimagesearch.capture.dynamic.bean.a(bitmap, wrapper, z);
    }

    private final Rect c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("61daa133", new Object[]{this}) : new Rect(0, 0, this.g.getWidth(), this.g.getHeight());
    }

    private final HashMap<String, String> d() {
        ClientModelType it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        g i = this.e.i();
        if (i != null && (it = i.f()) != null) {
            q.a((Object) it, "it");
            String type = it.getType();
            q.a((Object) type, "it.type");
            hashMap.put(ClientModelType.KEY_CLIENT_MODEL_TYPE, type);
        }
        com.etao.feimagesearch.mnn.autodetect.d dVar = this.e.Q;
        if (dVar != null && dVar.d()) {
            hashMap.put("noFrontRetake", "true");
        }
        return hashMap;
    }

    private final void a(Activity activity, Bitmap bitmap, boolean z, com.etao.feimagesearch.model.b bVar, Map<String, String> map, int i, PhotoFrom.Values values) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b876e22", new Object[]{this, activity, bitmap, new Boolean(z), bVar, map, new Integer(i), values});
        } else {
            cpf.a(activity, bitmap, z, bVar, map, this.e.a(bVar), i, values, this.e.U());
        }
    }

    private final void a(Bitmap bitmap, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e42743c", new Object[]{this, bitmap, activity, new Boolean(z)});
        } else if (!this.e.t()) {
        } else {
            ab.a(activity, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19055), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19044), new b(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19043), new c(bitmap, activity, z));
        }
    }
}
