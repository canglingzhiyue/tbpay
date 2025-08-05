package com.etao.feimagesearch.newresult.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.newresult.perf.IrpAvaRecord;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.pipline.NodeType;
import com.etao.feimagesearch.pipline.b;
import com.etao.feimagesearch.util.al;
import com.etao.feimagesearch.util.o;
import com.etao.feimagesearch.util.t;
import com.etao.feimagesearch.util.w;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.x;
import mtopsdk.mtop.domain.MtopResponse;
import tb.com;
import tb.cov;
import tb.cox;
import tb.coy;
import tb.cpe;
import tb.cqm;
import tb.crj;
import tb.crk;
import tb.crl;
import tb.crp;
import tb.crq;
import tb.cso;
import tb.csv;
import tb.csy;
import tb.cta;
import tb.ieq;
import tb.kge;
import tb.nog;
import tb.nyk;

/* loaded from: classes3.dex */
public final class f extends com.etao.feimagesearch.newresult.base.b implements b.a, ieq<com.etao.feimagesearch.newresult.base.h> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int MSG_PAGE_LOAD_TIMEOUT_CHECK = 2;

    /* renamed from: a  reason: collision with root package name */
    public cqm f6820a;
    private IrpAvaRecord b;
    private com.etao.feimagesearch.newresult.base.h c;
    private com.etao.feimagesearch.pipline.a d;
    private boolean e;
    private final com.etao.feimagesearch.result.g f;
    private final cta g;
    private boolean h;
    private boolean i;
    private JSONObject j;
    private boolean k;
    private final Handler m;
    private Activity n;
    private AuctionItemVO o;

    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            f.d(f.this);
            com.etao.feimagesearch.pipline.a e = f.e(f.this);
            if (e == null) {
                return;
            }
            e.a(true);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (!(dialogInterface instanceof AlertDialog) ? dialogInterface != null : ((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
            if (f.this.n().isFinishing()) {
                return;
            }
            f.this.c(true);
            f.this.n().finish();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (!(dialogInterface instanceof AlertDialog) ? dialogInterface != null : ((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
            f.d(f.this);
            com.etao.feimagesearch.pipline.a e = f.e(f.this);
            if (e == null) {
                return;
            }
            e.a(true);
        }
    }

    /* renamed from: com.etao.feimagesearch.newresult.base.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class DialogInterface$OnClickListenerC0236f implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DialogInterface$OnClickListenerC0236f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (!(dialogInterface instanceof AlertDialog) ? dialogInterface != null : ((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
            if (f.this.n().isFinishing()) {
                return;
            }
            f.this.c(true);
            f.this.n().finish();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, msg})).booleanValue();
            }
            kotlin.jvm.internal.q.c(msg, "msg");
            if (msg.what != 2) {
                return false;
            }
            f.f(f.this);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (!(dialogInterface instanceof AlertDialog) ? dialogInterface != null : ((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
            if (f.this.n().isFinishing()) {
                return;
            }
            f.this.n().finish();
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (!(dialogInterface instanceof AlertDialog) ? dialogInterface != null : ((AlertDialog) dialogInterface).isShowing()) {
                dialogInterface.cancel();
            }
            if (f.this.n().isFinishing()) {
                return;
            }
            f.this.n().finish();
        }
    }

    /* loaded from: classes3.dex */
    public static final class m implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                f.this.n().finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.b(f.this).G();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.b(f.this).M();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!al.a(com.b())) {
            } else {
                List<AlbumMediaItem> a2 = t.a(1L);
                if (a2.isEmpty()) {
                    return;
                }
                AlbumMediaItem albumMediaItem = a2.get(0);
                if (System.currentTimeMillis() - (com.taobao.android.searchbaseframe.util.g.a(albumMediaItem.lastUpdateTime, 0L) * 1000) > com.etao.feimagesearch.newresult.base.g.Companion.a().b()) {
                    return;
                }
                cpe.c cVar = cpe.Companion;
                Uri uri = albumMediaItem.imgUri;
                if (uri == null || (str = uri.toString()) == null) {
                    str = "";
                }
                cVar.a(str);
                if (!com.etao.feimagesearch.newresult.base.g.Companion.a().a()) {
                    return;
                }
                com.etao.feimagesearch.newresult.base.h b = f.b(f.this);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) TBAlbumImg.ATTR_IMG_KEY, albumMediaItem.imgUri.toString());
                jSONObject2.put((JSONObject) TBAlbumImg.ATTR_IMG_ROTATION, albumMediaItem.orientation);
                jSONObject2.put((JSONObject) "objectFit", com.taobao.android.weex_framework.util.a.ATOM_EXT_fill);
                jSONObject2.put((JSONObject) nyk.KEY_SHARE_CONFIG_SCREENSHOT, String.valueOf(t.a(albumMediaItem.imgFilePath)));
                b.e(jSONObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final String a2 = com.etao.feimagesearch.util.l.a(f.b(f.this).g(), f.b(f.this).m().e(), 90);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            f.a(f.this).post(new Runnable() { // from class: com.etao.feimagesearch.newresult.base.f.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    f.a(f.this, com.etao.feimagesearch.history.a.a().a(f.b(f.this).m().a().getValue(), a2, (Map<String, String>) null));
                    if (!com.etao.feimagesearch.config.b.db()) {
                        return;
                    }
                    f.this.c((JSONObject) null);
                }
            });
        }
    }

    static {
        kge.a(-1103487710);
        kge.a(-1239250678);
        kge.a(1653497275);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Activity activity) {
        kotlin.jvm.internal.q.c(activity, "activity");
        this.n = activity;
        Activity activity2 = this.n;
        if (activity2 instanceof com.etao.feimagesearch.result.b) {
            if (activity2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.IrpActivityInterface");
            }
            this.b = ((com.etao.feimagesearch.result.b) activity2).e();
        }
        this.f = new com.etao.feimagesearch.result.g();
        this.g = new cta();
        this.m = new Handler(Looper.getMainLooper(), new g());
    }

    public static final /* synthetic */ Handler a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2cf84ef6", new Object[]{fVar}) : fVar.m;
    }

    public static final /* synthetic */ JSONObject a(f fVar, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e583c785", new Object[]{fVar, jSONObject, map}) : fVar.a(jSONObject, map);
    }

    public static final /* synthetic */ List a(f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6b1be727", new Object[]{fVar, jSONObject}) : fVar.b(jSONObject);
    }

    public static final /* synthetic */ void a(f fVar, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e41d9a", new Object[]{fVar, auctionItemVO});
        } else {
            fVar.o = auctionItemVO;
        }
    }

    public static final /* synthetic */ void a(f fVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29529450", new Object[]{fVar, new Boolean(z), new Boolean(z2)});
        } else {
            fVar.a(z, z2);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.newresult.base.h b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.base.h) ipChange.ipc$dispatch("9155bb15", new Object[]{fVar});
        }
        com.etao.feimagesearch.newresult.base.h hVar = fVar.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        return hVar;
    }

    public static final /* synthetic */ JSONObject c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("54367c2e", new Object[]{fVar}) : fVar.j;
    }

    public static final /* synthetic */ void d(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0716ad", new Object[]{fVar});
        } else {
            fVar.r();
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.pipline.a e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.pipline.a) ipChange.ipc$dispatch("c6bce96b", new Object[]{fVar}) : fVar.d;
    }

    public static final /* synthetic */ void f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef631eb", new Object[]{fVar});
        } else {
            fVar.s();
        }
    }

    @Override // tb.ieq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ieq.a.a(this);
        }
    }

    @Override // tb.ieq
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ieq.a.c(this);
        }
    }

    @Override // tb.ieq
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            ieq.a.d(this);
        }
    }

    public final Activity n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("396bf7d3", new Object[]{this}) : this.n;
    }

    @Override // tb.ieq
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            ieq.a.b(this);
        }
    }

    @Override // tb.ieq
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            ieq.a.e(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-370571798);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public final void a(cqm cqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3efa0b9", new Object[]{this, cqmVar});
            return;
        }
        kotlin.jvm.internal.q.c(cqmVar, "<set-?>");
        this.f6820a = cqmVar;
    }

    @Override // tb.ieq
    public void a(com.etao.feimagesearch.newresult.base.h widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa1568e", new Object[]{this, widget});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        this.c = widget;
    }

    @Override // tb.ieq
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            r();
        }
    }

    @Override // tb.ieq
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ieq.a.f(this);
        this.m.removeCallbacksAndMessages(null);
        this.g.a();
    }

    public final void a(com.etao.feimagesearch.pipline.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4307809", new Object[]{this, aVar});
            return;
        }
        this.d = aVar;
        if (aVar == null) {
            return;
        }
        aVar.a(this);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f.a();
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        double s = hVar.m().s();
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        double t = hVar2.m().t();
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        csv.a(s, t, hVar3.m().f());
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            r();
        }
    }

    public final void k() {
        LinkedList<a.b> M;
        int N;
        String str;
        Iterator it;
        int i2;
        crq d2;
        Bitmap d3;
        crq d4;
        Bitmap d5;
        crq d6;
        IpChange ipChange = $ipChange;
        char c2 = 0;
        char c3 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.i) {
        } else {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            IrpDatasource m2 = hVar.m();
            if (!m2.H().f() || m2.e() == null || (M = m2.M()) == null || (N = m2.N()) <= 0) {
                return;
            }
            this.i = true;
            if (N <= 1) {
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar2.a(b((JSONObject) null));
                return;
            }
            com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
            if (hVar3 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            int[] G = hVar3.m().G();
            com.etao.feimagesearch.pipline.a aVar = this.d;
            String str2 = "";
            if (aVar == null || (d6 = aVar.d()) == null || (str = d6.h()) == null) {
                str = str2;
            }
            com.etao.feimagesearch.pipline.a aVar2 = this.d;
            int width = (aVar2 == null || (d4 = aVar2.d()) == null || (d5 = d4.d()) == null) ? 0 : d5.getWidth();
            com.etao.feimagesearch.pipline.a aVar3 = this.d;
            int height = (aVar3 == null || (d2 = aVar3.d()) == null || (d3 = d2.d()) == null) ? 0 : d3.getHeight();
            JSONArray jSONArray = new JSONArray(N);
            Iterator it2 = M.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                a.b bVar = (a.b) it2.next();
                if (!kotlin.jvm.internal.q.a((Object) com.etao.feimagesearch.e.REGION_SCAN, (Object) bVar.f6858a)) {
                    JSONObject jSONObject = new JSONObject();
                    RectF rectF = bVar.c;
                    JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put((JSONObject) "imageId", String.valueOf(i3));
                    int i4 = (int) (rectF.left * G[c2]);
                    if (i4 >= 0 && i4 <= width && (i2 = (int) (rectF.top * G[c3])) >= 0 && i2 <= height) {
                        int i5 = (int) (rectF.right * G[0]);
                        if (i5 < 0 || i5 > width) {
                            it = it2;
                        } else {
                            it = it2;
                            int i6 = (int) (rectF.bottom * G[1]);
                            if (i6 >= 0 && i6 <= height) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i4);
                                sb.append(',');
                                sb.append(i5);
                                sb.append(',');
                                sb.append(i2);
                                sb.append(',');
                                sb.append(i6);
                                jSONObject2.put((JSONObject) "region", sb.toString());
                                jSONArray.add(jSONObject);
                            }
                        }
                        i3++;
                        it2 = it;
                        c2 = 0;
                        c3 = 1;
                    }
                }
                it = it2;
                i3++;
                it2 = it;
                c2 = 0;
                c3 = 1;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!jSONArray.isEmpty()) {
                str2 = jSONArray.toJSONString();
            }
            linkedHashMap.put("imageInfos", str2);
            linkedHashMap.put("imgWidth", String.valueOf(width));
            linkedHashMap.put("imgHeight", String.valueOf(height));
            linkedHashMap.put("sversion", com.h());
            linkedHashMap.put("utd_id", com.a(com.b()));
            linkedHashMap.put("debug", String.valueOf(com.a()));
            linkedHashMap.put("api", "mtop.relationrecommend.PailitaoRecommend.recommend");
            linkedHashMap.put("imageBase64", str);
            linkedHashMap.put("scene", "multiObject");
            linkedHashMap.put("_sid_", "69148");
            linkedHashMap.put("source", "crop_digest_card");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("params", JSON.toJSONString(linkedHashMap));
            linkedHashMap2.put("appId", "32969");
            com.etao.feimagesearch.util.o.a("mtop.relationrecommend.PailitaoRecommend.recommend", "1.0", linkedHashMap2, new l());
        }
    }

    /* loaded from: classes3.dex */
    public static final class l implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.b(f.this).a(f.a(f.this, (JSONObject) null));
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ JSONObject b;

            public b(JSONObject jSONObject) {
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.b(f.this).a(f.a(f.this, this.b));
                }
            }
        }

        public l() {
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                f.a(f.this).post(new b(jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
            } else {
                f.a(f.this).post(new a());
            }
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (this.k || m()) {
            return false;
        }
        com.alibaba.poplayer.trigger.g.a(com.taobao.android.searchbaseframe.util.a.a(this.j, "popLayerUrl", ""), "").a(new b()).a();
        this.k = true;
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class b implements g.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.this.n().finish();
                }
            }
        }

        /* renamed from: com.etao.feimagesearch.newresult.base.f$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0235b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0235b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.this.n().finish();
                }
            }
        }

        public b() {
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "state", "pop");
            jSONObject2.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) f.c(f.this));
            f.b(f.this).c(jSONObject);
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e47be646", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else {
                f.a(f.this).post(new a());
            }
        }

        @Override // com.alibaba.poplayer.trigger.g.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                f.a(f.this).post(new RunnableC0235b());
            }
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            com.etao.feimagesearch.pipline.c.a(new p());
        }
    }

    private final List<com.etao.feimagesearch.newresult.base.i> b(JSONObject jSONObject) {
        JSONObject b2;
        JSONObject jSONObject2;
        MaResult maResult;
        ScancodeType scancodeType;
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        LinkedList<a.b> M = hVar.m().M();
        if (M == null) {
            return null;
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "data"), "realtimeResult");
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        int[] G = hVar2.m().G();
        ArrayList arrayList = new ArrayList();
        Iterator<a.b> it = M.iterator();
        while (it.hasNext()) {
            a.b next = it.next();
            boolean a3 = kotlin.jvm.internal.q.a((Object) next.f6858a, (Object) com.etao.feimagesearch.e.REGION_SCAN);
            String regionKey = cov.a(next.c);
            kotlin.jvm.internal.q.a((Object) regionKey, "regionKey");
            String str = a3 ? "nt_scan_code_hint" : "nt_region_digest";
            if (a3) {
                jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "region", regionKey);
                com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
                if (hVar3 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.c i3 = hVar3.m().i();
                jSONObject3.put((JSONObject) "tfskey", i3 != null ? i3.f() : null);
                if (G.length == i2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(G[0]);
                    sb.append('_');
                    sb.append(G[1]);
                    jSONObject3.put((JSONObject) "imgSize", sb.toString());
                }
                com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
                if (hVar4 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                b.a a4 = hVar4.m().a(next.c);
                jSONObject3.put((JSONObject) "type", (a4 == null || (scancodeType = a4.f) == null) ? null : scancodeType.toString());
                jSONObject3.put((JSONObject) "content", (a4 == null || (maResult = a4.f6598a) == null) ? null : maResult.getText());
            } else {
                jSONObject2 = null;
            }
            arrayList.add(new com.etao.feimagesearch.newresult.base.i(regionKey, str, jSONObject2, a3));
            i2 = 2;
        }
        if (a2 == null) {
            a2 = new JSONArray();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = a2.size();
        for (int i4 = 0; i4 < size; i4++) {
            JSONObject jSONObject4 = a2.getJSONObject(i4);
            int a5 = com.taobao.android.searchbaseframe.util.a.a(jSONObject4, "imageId", -1);
            if (a5 >= 0 && a5 < M.size() && (b2 = com.taobao.android.searchbaseframe.util.a.b(com.taobao.android.searchbaseframe.util.a.b(jSONObject4, "objectData"), "showCardInfo")) != null) {
                kotlin.jvm.internal.q.a((Object) b2, "FastJsonParseUtil.optJSO…fo\"\n        ) ?: continue");
                String str2 = "";
                String a6 = com.taobao.android.searchbaseframe.util.a.a(b2, "title", str2);
                JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(b2, nog.PRICE_BLOCK);
                if (b3 != null) {
                    str2 = com.taobao.android.searchbaseframe.util.a.a(b3, "price", str2);
                }
                ((com.etao.feimagesearch.newresult.base.i) arrayList.get(a5)).a(b2);
                if (!TextUtils.isEmpty(a6) && !TextUtils.isEmpty(str2)) {
                    String str3 = a6 + "_" + str2;
                    if (linkedHashSet.contains(str3)) {
                        ((com.etao.feimagesearch.newresult.base.i) arrayList.get(a5)).a(false);
                    } else {
                        ((com.etao.feimagesearch.newresult.base.i) arrayList.get(a5)).a(true);
                        linkedHashSet.add(str3);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.etao.feimagesearch.pipline.b.a
    public void a(crl event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd43db", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        String e2 = event.e();
        if (e2 == null) {
            return;
        }
        switch (e2.hashCode()) {
            case -670529065:
                if (!e2.equals(NodeType.NODE_INVALID)) {
                    return;
                }
                com.etao.feimagesearch.newresult.base.h hVar = this.c;
                if (hVar == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar.a(true);
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.h.a(hVar2, -9, com.etao.feimagesearch.e.TIP_ERROR + "(-7)", null, new h(), null, null, 48, null);
                return;
            case -466095421:
                if (!e2.equals(NodeType.NODE_IMAGE_SEARCH)) {
                    return;
                }
                break;
            case 417667782:
                if (!e2.equals(NodeType.NODE_IMAGE_FEATURE_EXTRACT)) {
                    return;
                }
                c(event);
                return;
            case 453063860:
                if (!e2.equals("ImageProcess")) {
                    return;
                }
                d(event);
                return;
            case 651715211:
                if (!e2.equals(NodeType.NODE_IMAGE_CODE_DETECT)) {
                    return;
                }
                f(event);
                return;
            case 1125571777:
                if (!e2.equals("ImageLoad")) {
                    return;
                }
                b(event);
                return;
            case 1372034246:
                if (!e2.equals(NodeType.NODE_IMAGE_MOCK_RESPONSE)) {
                    return;
                }
                break;
            default:
                return;
        }
        e(event);
    }

    private final void b(crl crlVar) {
        String str;
        DialogInterface.OnClickListener onClickListener;
        IrpAvaRecord irpAvaRecord;
        com.etao.feimagesearch.newresult.base.h hVar;
        Bitmap l2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2804a5c", new Object[]{this, crlVar});
            return;
        }
        Integer[] numArr = null;
        if (crlVar.d()) {
            IrpAvaRecord irpAvaRecord2 = this.b;
            if (irpAvaRecord2 != null) {
                irpAvaRecord2.a("ImageLoad");
            }
            com.etao.feimagesearch.newresult.perf.a.M();
            if (crlVar.c() instanceof Bitmap) {
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                IrpDatasource m2 = hVar2.m();
                Object c2 = crlVar.c();
                if (c2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                m2.a((Bitmap) c2);
                com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
                if (hVar3 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                if (this.c == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar3.b(!hVar.m().H().g());
                com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
                if (hVar4 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                if (hVar4.m().F()) {
                    com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
                    if (hVar5 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    com.etao.feimagesearch.newresult.base.c i3 = hVar5.m().i();
                    if (i3 != null) {
                        numArr = i3.o();
                    }
                    if (numArr == null) {
                        numArr = new Integer[]{640, 640};
                    }
                    com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
                    if (hVar6 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    float width = ((hVar6.m().l() != null ? l2.getWidth() : 0) * 1.0f) / numArr[0].intValue();
                    com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
                    if (hVar7 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    Bitmap l3 = hVar7.m().l();
                    if (l3 != null) {
                        i2 = l3.getHeight();
                    }
                    float intValue = (i2 * 1.0f) / numArr[1].intValue();
                    com.etao.feimagesearch.newresult.base.h hVar8 = this.c;
                    if (hVar8 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    hVar8.a(width, intValue);
                    return;
                }
            }
            com.etao.feimagesearch.newresult.base.h hVar9 = this.c;
            if (hVar9 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (!hVar9.m().I()) {
                return;
            }
            com.etao.feimagesearch.newresult.base.h hVar10 = this.c;
            if (hVar10 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar10.a((cso) null);
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar11 = this.c;
        if (hVar11 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar11.m().m()) {
            com.etao.feimagesearch.newresult.base.h hVar12 = this.c;
            if (hVar12 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (hVar12.m().I()) {
                com.etao.feimagesearch.newresult.base.h hVar13 = this.c;
                if (hVar13 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar13.a((cso) null);
            }
        } else {
            com.etao.feimagesearch.newresult.base.h hVar14 = this.c;
            if (hVar14 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (hVar14.m().F()) {
                com.etao.feimagesearch.newresult.base.h hVar15 = this.c;
                if (hVar15 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar15.d(true);
            } else {
                com.etao.feimagesearch.newresult.base.h hVar16 = this.c;
                if (hVar16 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                if (hVar16.m().R()) {
                    com.etao.feimagesearch.newresult.base.h hVar17 = this.c;
                    if (hVar17 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    hVar17.N();
                    com.etao.feimagesearch.newresult.base.h hVar18 = this.c;
                    if (hVar18 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    if (hVar18.m().I()) {
                        com.etao.feimagesearch.newresult.base.h hVar19 = this.c;
                        if (hVar19 == null) {
                            kotlin.jvm.internal.q.b("irpWidget");
                        }
                        hVar19.a((cso) null);
                    }
                } else {
                    i2 = 1;
                }
            }
        }
        if (i2 == 0) {
            IrpAvaRecord irpAvaRecord3 = this.b;
            if (irpAvaRecord3 == null) {
                return;
            }
            irpAvaRecord3.a("ImageLoad");
            return;
        }
        if ((crlVar instanceof crk) && (irpAvaRecord = this.b) != null) {
            crk crkVar = (crk) crlVar;
            irpAvaRecord.b("ImageLoad", String.valueOf(crkVar.a()), crkVar.b());
        }
        com.etao.feimagesearch.newresult.base.h hVar20 = this.c;
        if (hVar20 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar20.m().u()) {
            str = com.etao.feimagesearch.e.TIP_IMAGE_DOWNLOAD_ERROR + "(30033)";
            onClickListener = new c();
        } else {
            str = com.etao.feimagesearch.e.TIP_DECODE_FAILED + "(30033)";
            onClickListener = null;
        }
        String str2 = str;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        com.etao.feimagesearch.newresult.base.h hVar21 = this.c;
        if (hVar21 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.h hVar22 = this.c;
        if (hVar22 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.h.a(hVar21, hVar22.m().u() ? -1 : -2, str2, onClickListener2, new d(), null, null, 48, null);
    }

    private final void f(crl crlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c6460", new Object[]{this, crlVar});
        } else if (!crlVar.d()) {
        } else {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar.m().b(x.f(crlVar.c()));
            if (this.h) {
                return;
            }
            com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
            if (hVar2 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (!hVar2.F()) {
                return;
            }
            com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
            if (hVar3 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            FrameLayout frameLayout = (FrameLayout) hVar3.O();
            if (frameLayout == null) {
                return;
            }
            frameLayout.post(new n());
        }
    }

    private final void c(crl crlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10350dd", new Object[]{this, crlVar});
        } else if (!crlVar.d()) {
        } else {
            if (crlVar.c() instanceof Integer) {
                com.etao.feimagesearch.newresult.base.h hVar = this.c;
                if (hVar == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                IrpDatasource m2 = hVar.m();
                Object c2 = crlVar.c();
                if (c2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                m2.a((Integer) c2);
            } else if (!x.h(crlVar.c())) {
            } else {
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                IrpDatasource m3 = hVar2.m();
                Object c3 = crlVar.c();
                if (c3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String?, kotlin.String?>");
                }
                m3.b(x.i(c3));
            }
        }
    }

    private final void d(crl crlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af86575e", new Object[]{this, crlVar});
        } else if (!crlVar.d() || !(crlVar.c() instanceof crp)) {
        } else {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            IrpDatasource m2 = hVar.m();
            Object c2 = crlVar.c();
            if (c2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.pipline.model.ImgProcessResult");
            }
            m2.a(((crp) c2).b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(tb.crl r15) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.newresult.base.f.e(tb.crl):void");
    }

    private final void o() {
        JSONObject a2;
        String k2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.a(1.0f, 1.0f);
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar2.m().b("objectFrom", Constants.Value.ORIGINAL);
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar3.m().a("regionIndex", "0");
        com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
        if (hVar4 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar4.m().b(com.etao.feimagesearch.p.KEY_DEVICE_TYPE, com.etao.feimagesearch.p.a());
        com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
        if (hVar5 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        String str2 = "";
        if (hVar5.m().k()) {
            com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
            if (hVar6 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            Uri b2 = hVar6.m().b();
            if (b2 != null && kotlin.jvm.internal.q.a((Object) b2.toString(), (Object) cpe.Companion.c())) {
                com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
                if (hVar7 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar7.m().b("isConSearch", "true");
                cpe.Companion.a(str2);
            }
        }
        Application b3 = com.b();
        kotlin.jvm.internal.q.a((Object) b3, "GlobalAdapter.getCtx()");
        Resources resources = b3.getResources();
        kotlin.jvm.internal.q.a((Object) resources, "GlobalAdapter.getCtx().resources");
        float f = resources.getConfiguration().fontScale;
        com.etao.feimagesearch.newresult.base.h hVar8 = this.c;
        if (hVar8 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar8.m().b("fontSize", String.valueOf(f));
        com.etao.feimagesearch.newresult.base.h hVar9 = this.c;
        if (hVar9 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar9.m().b("isElderVer", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        com.etao.feimagesearch.newresult.base.h hVar10 = this.c;
        if (hVar10 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar10.m().S()) {
            com.etao.feimagesearch.newresult.base.h hVar11 = this.c;
            if (hVar11 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            String f2 = hVar11.m().f("queryFromMainSearch");
            if (!TextUtils.isEmpty(f2)) {
                com.etao.feimagesearch.newresult.base.h hVar12 = this.c;
                if (hVar12 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar12.m().b("queryFromMainSearch", f2);
            }
        }
        com.etao.feimagesearch.newresult.base.h hVar13 = this.c;
        if (hVar13 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar13.m().o()) {
            cpe.c cVar = cpe.Companion;
            com.etao.feimagesearch.newresult.base.h hVar14 = this.c;
            if (hVar14 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i2 = hVar14.m().i();
            if (i2 == null || (str = i2.z()) == null) {
                str = str2;
            }
            cVar.b(str);
            if (al.a((Context) this.n)) {
                com.etao.feimagesearch.newresult.base.h hVar15 = this.c;
                if (hVar15 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar15.m().b("albumUpdate", com.etao.feimagesearch.album.g.INSTANCE.b());
            } else {
                com.etao.feimagesearch.newresult.base.h hVar16 = this.c;
                if (hVar16 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar16.m().b("albumUpdate", "noaccess");
            }
        }
        com.etao.feimagesearch.newresult.base.h hVar17 = this.c;
        if (hVar17 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        String str3 = null;
        if (hVar17.r()) {
            com.etao.feimagesearch.newresult.base.h hVar18 = this.c;
            if (hVar18 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i3 = hVar18.m().i();
            String f3 = i3 != null ? i3.f() : null;
            if (f3 != null && !TextUtils.isEmpty(f3)) {
                com.etao.feimagesearch.newresult.base.h hVar19 = this.c;
                if (hVar19 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.h hVar20 = this.c;
                if (hVar20 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.c i4 = hVar20.m().i();
                hVar19.b(a(f3, i4 != null ? i4.a() : null));
            }
        }
        com.etao.feimagesearch.newresult.base.h hVar21 = this.c;
        if (hVar21 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar21.r()) {
            com.etao.feimagesearch.newresult.base.h hVar22 = this.c;
            if (hVar22 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i5 = hVar22.m().i();
            JSONObject b4 = i5 != null ? i5.b() : null;
            com.etao.feimagesearch.newresult.base.h hVar23 = this.c;
            if (hVar23 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i6 = hVar23.m().i();
            a2 = a(b4, i6 != null ? i6.a() : null);
        } else {
            com.etao.feimagesearch.newresult.base.h hVar24 = this.c;
            if (hVar24 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i7 = hVar24.m().i();
            JSONObject c2 = i7 != null ? i7.c() : null;
            com.etao.feimagesearch.newresult.base.h hVar25 = this.c;
            if (hVar25 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i8 = hVar25.m().i();
            a2 = a(c2, i8 != null ? i8.a() : null);
        }
        com.etao.feimagesearch.newresult.base.h hVar26 = this.c;
        if (hVar26 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar26.a(false);
        com.etao.feimagesearch.newresult.base.h hVar27 = this.c;
        if (hVar27 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar27.m().I()) {
            com.etao.feimagesearch.newresult.base.h hVar28 = this.c;
            if (hVar28 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar28.ei_();
        } else {
            com.etao.feimagesearch.newresult.base.h hVar29 = this.c;
            if (hVar29 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (!hVar29.m().z()) {
                com.etao.feimagesearch.newresult.base.h hVar30 = this.c;
                if (hVar30 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.d H = hVar30.m().H();
                com.etao.feimagesearch.newresult.base.h hVar31 = this.c;
                if (hVar31 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.c i9 = hVar31.m().i();
                H.c((i9 == null || i9.j()) ? 0.0f : 0.5f);
            }
            com.etao.feimagesearch.newresult.base.h hVar32 = this.c;
            if (hVar32 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (!hVar32.m().H().c()) {
                k();
            }
            com.etao.feimagesearch.newresult.base.h hVar33 = this.c;
            if (hVar33 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar33.L();
        }
        com.etao.feimagesearch.newresult.base.h hVar34 = this.c;
        if (hVar34 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i10 = hVar34.m().i();
        if (i10 != null) {
            str3 = i10.k();
        }
        if (!TextUtils.isEmpty(str3)) {
            com.etao.feimagesearch.newresult.base.h hVar35 = this.c;
            if (hVar35 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.d H2 = hVar35.m().H();
            com.etao.feimagesearch.newresult.base.h hVar36 = this.c;
            if (hVar36 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.c i11 = hVar36.m().i();
            if (i11 != null && (k2 = i11.k()) != null) {
                str2 = k2;
            }
            H2.b(str2);
        }
        com.etao.feimagesearch.newresult.base.h hVar37 = this.c;
        if (hVar37 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar37.a(a2);
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        String du = com.etao.feimagesearch.config.b.du();
        kotlin.jvm.internal.q.a((Object) du, "ConfigModel.getIrpNotSafeDialogTip()");
        hVar.a(-8, du, (DialogInterface.OnClickListener) null, new m(), "", this.n.getString(R.string.irp_error_message_finish_text));
    }

    public final void a(RectF newRegion, Integer num) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b96fa5e", new Object[]{this, newRegion, num});
            return;
        }
        kotlin.jvm.internal.q.c(newRegion, "newRegion");
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.m().e("regionIndex");
        if (num != null && (a2 = this.g.a(num)) != null) {
            coy.b("Page_PhotoSearchResult", "changeOldRegion", "index=" + num);
            if (com.etao.feimagesearch.config.b.bZ()) {
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar2.m().b("changeOldRegion", WXStorageModule.NAME);
                com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
                if (hVar3 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                com.etao.feimagesearch.newresult.base.c i2 = hVar3.m().i();
                JSONObject a3 = a(a2, i2 != null ? i2.a() : null);
                a3.put((JSONObject) "header", "new");
                com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
                if (hVar4 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar4.a(a3);
                return;
            }
        }
        com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
        if (hVar5 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar5.m().b("changeOldRegion", "common");
        if (num == null || num.intValue() < 0) {
            com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
            if (hVar6 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            IrpDatasource m2 = hVar6.m();
            com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
            if (hVar7 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            m2.a("regionIndex", String.valueOf(hVar7.eh_()));
        } else {
            com.etao.feimagesearch.newresult.base.h hVar8 = this.c;
            if (hVar8 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar8.m().a("regionIndex", String.valueOf(num.intValue()));
        }
        com.etao.feimagesearch.newresult.base.h hVar9 = this.c;
        if (hVar9 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i3 = hVar9.m().i();
        if (i3 != null && i3.i()) {
            c(newRegion);
        } else {
            b(newRegion);
        }
    }

    private final void b(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3bf7fa", new Object[]{this, rectF});
            return;
        }
        csy.c();
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.o();
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        int[] G = hVar2.m().G();
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left * G[0];
        rectF2.top = rectF.top * G[1];
        rectF2.right = rectF.right * G[0];
        rectF2.bottom = rectF.bottom * G[1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        String r = hVar3.m().r();
        com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
        if (hVar4 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Map<String, String> a2 = w.a(r, hVar4.m().d());
        kotlin.jvm.internal.q.a((Object) a2, "MtopUtil.preHandleReques…Widget.model.params\n    )");
        linkedHashMap.putAll(a2);
        linkedHashMap.put("regionChanged", "true");
        linkedHashMap.put("hasCropedImage", "true");
        com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
        if (hVar5 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i2 = hVar5.m().i();
        linkedHashMap.put("pltSession", i2 != null ? i2.h() : null);
        com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
        if (hVar6 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Map<String, String> T = hVar6.m().T();
        if (T != null) {
            linkedHashMap.putAll(T);
        }
        com.etao.feimagesearch.result.g gVar = this.f;
        com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
        if (hVar7 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i3 = hVar7.m().i();
        String f = i3 != null ? i3.f() : null;
        gVar.a(f, rectF2, "0," + G[0] + ",0," + G[1], linkedHashMap, new k(linkedHashMap));
    }

    /* loaded from: classes3.dex */
    public static final class k implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public k(Map map) {
            this.b = map;
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
                return;
            }
            JSONObject a2 = f.a(f.this, com.etao.feimagesearch.newresult.base.c.Companion.a(jSONObject).c(), this.b);
            a2.put((JSONObject) "header", "new");
            f.b(f.this).a(a2);
            cox.a("Page_PhotoSearchResult", "irpMnnLogs", f.b(f.this).m().V());
            f.a(f.this, true, false);
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
                return;
            }
            f.b(f.this).p();
            f.a(f.this, false, false);
        }
    }

    private final void c(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178bdc7b", new Object[]{this, rectF});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Bitmap a2 = com.etao.feimagesearch.util.d.a(hVar.m().l(), rectF);
        if (a2 == null) {
            return;
        }
        csy.c();
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar2.o();
        int[] q2 = q();
        Bitmap a3 = com.etao.feimagesearch.util.d.a(a2, q2[0], q2[1]);
        if (a3 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        String r = hVar3.m().r();
        com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
        if (hVar4 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Map<String, String> a4 = w.a(r, hVar4.m().d());
        kotlin.jvm.internal.q.a((Object) a4, "MtopUtil.preHandleReques…Widget.model.params\n    )");
        linkedHashMap.putAll(a4);
        linkedHashMap.put("regionChanged", "true");
        linkedHashMap.put("hasCropedImage", "true");
        com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
        if (hVar5 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        linkedHashMap.put("originalRegion", hVar5.m().w());
        com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
        if (hVar6 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Map<String, String> T = hVar6.m().T();
        if (T != null) {
            linkedHashMap.putAll(T);
        }
        this.f.a(a3, linkedHashMap, new j(linkedHashMap));
    }

    /* loaded from: classes3.dex */
    public static final class j implements o.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public j(Map map) {
            this.b = map;
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str, str2, jSONObject});
                return;
            }
            JSONObject a2 = f.a(f.this, com.etao.feimagesearch.newresult.base.c.Companion.a(jSONObject).c(), this.b);
            a2.put((JSONObject) "header", "new");
            f.b(f.this).a(a2);
            cox.a("Page_PhotoSearchResult", "irpMnnLogs", f.b(f.this).m().V());
            f.a(f.this, true, false);
        }

        @Override // com.etao.feimagesearch.util.o.a
        public void a(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e122485", new Object[]{this, str, str2, num, str3});
                return;
            }
            f.b(f.this).p();
            f.a(f.this, false, false);
        }
    }

    private final int[] q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c36eab6c", new Object[]{this});
        }
        int[] iArr = null;
        String[] bL = com.etao.feimagesearch.config.b.bL();
        if (bL.length >= 2) {
            try {
                String str = bL[0];
                kotlin.jvm.internal.q.a((Object) str, "sizeConfigStrArr[0]");
                int parseInt = Integer.parseInt(str);
                String str2 = bL[1];
                kotlin.jvm.internal.q.a((Object) str2, "sizeConfigStrArr[1]");
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt > 0 && parseInt2 > 0) {
                    iArr = new int[]{parseInt, parseInt2};
                }
            } catch (Exception unused) {
            }
        }
        return iArr == null ? new int[]{224, 224} : iArr;
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void ap_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
            return;
        }
        try {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            Activity g2 = hVar.g();
            Object systemService = g2.getSystemService("input_method");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            Window window = g2.getWindow();
            kotlin.jvm.internal.q.a((Object) window, "activity.window");
            View decorView = window.getDecorView();
            kotlin.jvm.internal.q.a((Object) decorView, "activity.window.decorView");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(String str, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (this.e || this.h) {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar.M();
        } else {
            this.e = true;
            if (z) {
                com.etao.feimagesearch.newresult.perf.a.P();
                IrpAvaRecord irpAvaRecord = this.b;
                if (irpAvaRecord != null) {
                    irpAvaRecord.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_LOAD);
                }
            }
            com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
            if (hVar2 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar2.m().a(str);
            if (com.etao.feimagesearch.config.b.cj()) {
                com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
                if (hVar3 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                hVar3.a(true, "https://gw.alicdn.com/imgextra/i4/O1CN01FgpGTc1FdczEXTRZK_!!6000000000510-2-tps-1500-1800.png");
            }
            w();
            try {
                com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
                if (hVar4 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                jSONObject = JSONObject.parseObject(hVar4.m().j());
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "pageParams");
                cqm cqmVar = this.f6820a;
                if (cqmVar == null) {
                    kotlin.jvm.internal.q.b("tracker");
                }
                cqmVar.a(b2);
                com.etao.feimagesearch.newresult.perf.a.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "perfStatics"));
            }
            String[] strArr = new String[4];
            strArr[0] = "pssource";
            com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
            if (hVar5 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            strArr[1] = hVar5.m().r();
            strArr[2] = com.etao.feimagesearch.model.d.KEY_PHOTO_FROM;
            com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
            if (hVar6 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            strArr[3] = hVar6.m().a().getValue();
            coy.c("Page_PhotoSearchResult", "IrpShow", strArr);
            this.m.postDelayed(new o(), 100L);
            com.etao.feimagesearch.newresult.perf.a.Q();
            com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
            if (hVar7 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            cox.a("Page_PhotoSearchResult", "irpMnnLogs", hVar7.m().V());
        }
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.d(z);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public JSONObject dV_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f710354", new Object[]{this});
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i2 = hVar.w().i();
        Map<String, String> a2 = i2 != null ? i2.a() : null;
        if (a2 == null) {
            return new JSONObject();
        }
        return new JSONObject(a2);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public Map<String, Object> ec_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90aea7bd", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i2 = hVar.m().i();
        Map<String, String> map = null;
        jSONObject.put((JSONObject) "result", (String) (i2 != null ? i2.c() : null));
        jSONObject.put((JSONObject) "error", (String) 0);
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i3 = hVar2.m().i();
        if (i3 != null) {
            map = i3.a();
        }
        jSONObject.put((JSONObject) "searchParams", (String) map);
        jSONObject.put((JSONObject) "header", "new");
        return jSONObject;
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!kotlin.jvm.internal.q.a((Object) "top", (Object) str)) {
        } else {
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            hVar.n();
        }
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.e(!kotlin.jvm.internal.q.a((Object) "search", (Object) str));
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.a(z, str);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.a(kotlin.collections.p.c(rectF), true);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.a(str);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.b(str);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.a(i2);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public Bitmap e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("61b3954a", new Object[]{this});
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        return hVar.ej_();
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.m().a(true);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        hVar.f(z);
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public cta g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cta) ipChange.ipc$dispatch("3d2d4548", new Object[]{this}) : this.g;
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void a(JSONObject popLayerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, popLayerConfig});
            return;
        }
        kotlin.jvm.internal.q.c(popLayerConfig, "popLayerConfig");
        this.j = popLayerConfig;
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        AuctionItemVO auctionItemVO = this.o;
        if (auctionItemVO == null) {
            return;
        }
        auctionItemVO.allowanceStatus = 1;
        com.etao.feimagesearch.history.a.a().e();
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public Bitmap ed_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ed1e4605", new Object[]{this});
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        return hVar.m().l();
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public RectF e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("340bab71", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        List b2 = kotlin.text.n.b((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
        if (b2.size() != 4) {
            return null;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        int[] G = hVar.m().G();
        if (G[0] != 0 && G[1] != 0) {
            RectF rectF = new RectF(Float.parseFloat((String) b2.get(0)) / G[0], Float.parseFloat((String) b2.get(2)) / G[1], Float.parseFloat((String) b2.get(1)) / G[0], Float.parseFloat((String) b2.get(3)) / G[1]);
            float f = 0;
            if (rectF.left < f) {
                rectF.left = 0.0f;
            }
            float f2 = 1;
            if (rectF.right > f2) {
                rectF.right = 1.0f;
            }
            if (rectF.top < f) {
                rectF.top = 0.0f;
            }
            if (rectF.bottom > f2) {
                rectF.bottom = 1.0f;
            }
            if (rectF.width() >= f && rectF.width() <= f2 && rectF.height() >= f && rectF.height() <= f2) {
                return rectF;
            }
        }
        return null;
    }

    @Override // com.etao.feimagesearch.newresult.base.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.n.finish();
        }
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.m.removeMessages(2);
        this.m.sendEmptyMessageDelayed(2, 15000L);
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.e) {
        } else {
            this.h = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = "30022";
            linkedHashMap.put("errCode", str);
            com.etao.feimagesearch.newresult.base.h hVar = this.c;
            if (hVar == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            if (!hVar.ef_()) {
                str = "30031";
                StringBuilder sb = new StringBuilder();
                sb.append("tm_mus_fail ");
                com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
                if (hVar2 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                sb.append(hVar2.m().a());
                com.etao.feimagesearch.result.f.a("irpTimeout", sb.toString());
                IrpAvaRecord irpAvaRecord = this.b;
                if (irpAvaRecord != null) {
                    irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_LOAD, str, "tm_mus_fail");
                }
                linkedHashMap.put("errMsg", "mus_load_failure");
            } else {
                com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
                if (hVar3 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                if (hVar3.m().i() == null) {
                    IrpAvaRecord irpAvaRecord2 = this.b;
                    if (irpAvaRecord2 != null) {
                        irpAvaRecord2.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_LOAD, str, "request_timeout");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("tm_tpp_fail ");
                    com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
                    if (hVar4 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    sb2.append(hVar4.m().a());
                    com.etao.feimagesearch.result.f.a("irpTimeout", sb2.toString());
                    linkedHashMap.put("errMsg", "request_timeout");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("tm_mus_load_timeout ");
                    com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
                    if (hVar5 == null) {
                        kotlin.jvm.internal.q.b("irpWidget");
                    }
                    sb3.append(hVar5.m().a());
                    com.etao.feimagesearch.result.f.a("irpTimeout", sb3.toString());
                    IrpAvaRecord irpAvaRecord3 = this.b;
                    if (irpAvaRecord3 != null) {
                        irpAvaRecord3.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_LOAD, str, "mus_load_timeout");
                    }
                    linkedHashMap.put("errMsg", "mus_load_timeout");
                }
            }
            TLogTracker.b("IrpLoadTimeout", linkedHashMap);
            com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
            if (hVar6 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            com.etao.feimagesearch.newresult.base.h.a(hVar6, -5, com.etao.feimagesearch.e.TIP_ERROR + '(' + str + ')', null, new i(), null, null, 48, null);
        }
    }

    private final JSONObject a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0b50433", new Object[]{this, str, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put((JSONObject) "tfskey", str);
        return jSONObject;
    }

    private final JSONObject a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38aed61d", new Object[]{this, jSONObject, map});
        }
        JSONObject jSONObject2 = new JSONObject();
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar.r()) {
            jSONObject2.put((JSONObject) "searchResult", (String) jSONObject);
        } else {
            jSONObject2.put((JSONObject) "result", (String) jSONObject);
        }
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "error", (String) 0);
        if (map == null) {
            map = null;
        } else if (!map.containsKey("imgFeatureExtractInfo")) {
            com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
            if (hVar2 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            Map<String, String> T = hVar2.m().T();
            if (T != null) {
                map.putAll(T);
            }
        }
        jSONObject3.put((JSONObject) "searchParams", (String) map);
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        jSONObject3.put((JSONObject) "pageParams", (String) hVar3.m().d());
        com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
        if (hVar4 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        jSONObject3.put((JSONObject) "clientUTParams", (String) hVar4.m().C());
        com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
        if (hVar5 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        jSONObject3.put((JSONObject) PopConst.POP_CLIENT_PARAMS_KEY, (String) hVar5.m().B());
        jSONObject3.put((JSONObject) "header", "new");
        return jSONObject2;
    }

    private final boolean a(crk crkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3fccf80", new Object[]{this, crkVar})).booleanValue();
        }
        Object c2 = crkVar.c();
        if (c2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.newresult.base.IrpNetResultModel");
        }
        Map<String, String> a2 = ((com.etao.feimagesearch.newresult.base.c) c2).a();
        if ((a2 != null && a2.containsKey("imgExtractInfo")) || TextUtils.isEmpty(com.etao.feimagesearch.config.b.bu())) {
            return false;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        Map<String, String> T = hVar.m().T();
        if ((T == null || T.isEmpty()) || !com.etao.feimagesearch.config.b.ba()) {
            return false;
        }
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (com.etao.feimagesearch.config.b.g(hVar2.m().r())) {
            return false;
        }
        Integer a3 = crkVar.a();
        return (a3 == null || a3.intValue() != -10) && (a3 == null || a3.intValue() != -16) && (a3 == null || a3.intValue() != -17);
    }

    private final void g(crl crlVar) {
        String str;
        int i2;
        int intValue;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0f6ae1", new Object[]{this, crlVar});
            return;
        }
        int i3 = -3;
        if (crlVar instanceof crk) {
            crk crkVar = (crk) crlVar;
            Integer a3 = crkVar.a();
            if (a3 != null && a3.intValue() == -10) {
                IrpAvaRecord irpAvaRecord = this.b;
                if (irpAvaRecord != null) {
                    irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_NET_REQUEST, "30013", "NoNetWork");
                }
                String str2 = com.etao.feimagesearch.e.TIP_NETWORK_OFFLINE + "(30013)";
                if (this.f6820a == null) {
                    kotlin.jvm.internal.q.b("tracker");
                }
                str = str2;
                i2 = -4;
            } else {
                if (crkVar.a() == null) {
                    intValue = -6;
                } else {
                    Integer a4 = crkVar.a();
                    if (a4 == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    intValue = a4.intValue();
                }
                IrpAvaRecord irpAvaRecord2 = this.b;
                if (irpAvaRecord2 != null) {
                    irpAvaRecord2.b(IrpAvaRecord.AvaType.AVA_TYPE_NET_REQUEST, String.valueOf(intValue), crkVar.b());
                }
                if (intValue == -17) {
                    a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19002);
                    kotlin.jvm.internal.q.a((Object) a2, "Localization.localizedSt….taobao_app_1007_1_19002)");
                    i3 = -6;
                } else if (intValue == -16) {
                    String a5 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19021);
                    kotlin.jvm.internal.q.a((Object) a5, "Localization.localizedSt….taobao_app_1007_1_19021)");
                    a2 = a5;
                    i3 = -7;
                } else {
                    a2 = com.etao.feimagesearch.e.TIP_IMAGE_UPLOAD_ERROR + '(' + intValue + ')';
                }
                StringBuilder sb = new StringBuilder();
                sb.append("tm_tpp_fail ");
                com.etao.feimagesearch.newresult.base.h hVar = this.c;
                if (hVar == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                sb.append(hVar.m().a());
                com.etao.feimagesearch.result.f.a("irpTimeout", sb.toString());
                str = a2;
                i2 = i3;
            }
        } else {
            String str3 = com.etao.feimagesearch.e.TIP_ERROR;
            kotlin.jvm.internal.q.a((Object) str3, "FEISConstant.TIP_ERROR");
            IrpAvaRecord irpAvaRecord3 = this.b;
            if (irpAvaRecord3 != null) {
                irpAvaRecord3.b(IrpAvaRecord.AvaType.AVA_TYPE_NET_REQUEST, "30022", "unknown");
            }
            str = str3;
            i2 = -3;
        }
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.h.a(hVar2, i2, str, new e(), new DialogInterface$OnClickListenerC0236f(), null, null, 48, null);
    }

    private final void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component", "client_monitor_api");
        linkedHashMap.put("requestDisasterRecovery", String.valueOf(z2));
        if (z2) {
            z3 = z;
        }
        linkedHashMap.put("disasterRecoverySuccess", String.valueOf(z3));
        linkedHashMap.put("finalSuccess", String.valueOf(z));
        com.etao.feimagesearch.pipline.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a((crj) new com.etao.feimagesearch.pipline.node.l("37747", com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), linkedHashMap, "plt-search-report", false), true);
    }

    private final void w() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar = this.c;
        if (hVar == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        com.etao.feimagesearch.newresult.base.c i2 = hVar.m().i();
        if (i2 == null || i2.f() == null) {
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar2 = this.c;
        if (hVar2 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar2.m().u()) {
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar3 = this.c;
        if (hVar3 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar3.m().n()) {
            return;
        }
        com.etao.feimagesearch.newresult.base.h hVar4 = this.c;
        if (hVar4 == null) {
            kotlin.jvm.internal.q.b("irpWidget");
        }
        if (hVar4.m().e() != null) {
            if (com.etao.feimagesearch.config.b.cX()) {
                com.etao.feimagesearch.pipline.c.a(new q());
            } else {
                com.etao.feimagesearch.history.a a2 = com.etao.feimagesearch.history.a.a();
                com.etao.feimagesearch.newresult.base.h hVar5 = this.c;
                if (hVar5 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                Activity g2 = hVar5.g();
                com.etao.feimagesearch.newresult.base.h hVar6 = this.c;
                if (hVar6 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                String value = hVar6.m().a().getValue();
                com.etao.feimagesearch.newresult.base.h hVar7 = this.c;
                if (hVar7 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                this.o = a2.a(g2, value, hVar7.m().e(), (Map<String, String>) null);
                if (com.etao.feimagesearch.config.b.db()) {
                    c((JSONObject) null);
                }
            }
        } else {
            com.etao.feimagesearch.newresult.base.h hVar8 = this.c;
            if (hVar8 == null) {
                kotlin.jvm.internal.q.b("irpWidget");
            }
            Uri b2 = hVar8.m().b();
            if (b2 == null || (str = b2.toString()) == null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                com.etao.feimagesearch.history.a a3 = com.etao.feimagesearch.history.a.a();
                com.etao.feimagesearch.newresult.base.h hVar9 = this.c;
                if (hVar9 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                Activity g3 = hVar9.g();
                com.etao.feimagesearch.newresult.base.h hVar10 = this.c;
                if (hVar10 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                String value2 = hVar10.m().a().getValue();
                com.etao.feimagesearch.newresult.base.h hVar11 = this.c;
                if (hVar11 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                String valueOf = String.valueOf(hVar11.m().b());
                com.etao.feimagesearch.newresult.base.h hVar12 = this.c;
                if (hVar12 == null) {
                    kotlin.jvm.internal.q.b("irpWidget");
                }
                this.o = a3.a(g3, value2, valueOf, hVar12.m().v(), null);
            }
        }
        if (!com.etao.feimagesearch.config.b.db()) {
            return;
        }
        c((JSONObject) null);
    }
}
