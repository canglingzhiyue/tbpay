package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ImagePopTask;
import com.etao.feimagesearch.album.g;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.hybrid.d;
import com.etao.feimagesearch.capture.dynamic.msg.i;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.al;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.cpe;

/* loaded from: classes3.dex */
public final class cpg extends ctb<cph> implements ImagePopTask.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "CapturePresenterV2";
    private i c;
    private b d;
    private CaptureManager e;
    private volatile DynCaptureImgGotConfig f;
    private boolean h;

    static {
        kge.a(1146625638);
        kge.a(-1942333266);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cpg cpgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -670876635) {
            super.a((Intent) objArr[0]);
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    @Override // com.etao.feimagesearch.ImagePopTask.a
    public void a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1408877102);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final CaptureManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("b4915a21", new Object[]{this});
        }
        CaptureManager captureManager = this.e;
        if (captureManager != null) {
            return captureManager;
        }
        CaptureManager captureManager2 = new CaptureManager();
        this.e = captureManager2;
        return captureManager2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
        if (r6 == null) goto L26;
     */
    @Override // tb.ctb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Intent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.cpg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "d8033c25"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.q.c(r6, r0)
            super.a(r6)
            T extends tb.ctc r0 = r5.f26504a
            java.lang.String r1 = "view"
            kotlin.jvm.internal.q.a(r0, r1)
            tb.cph r0 = (tb.cph) r0
            android.app.Activity r0 = r0.s()
            java.lang.String r3 = "view.activity"
            kotlin.jvm.internal.q.a(r0, r3)
            android.content.Intent r0 = r0.getIntent()
            com.etao.feimagesearch.model.b r0 = com.etao.feimagesearch.model.b.parseFromIntent(r0)
            r5.d = r0
            boolean r0 = com.etao.feimagesearch.structure.capture.CaptureManager.n
            if (r0 != 0) goto L5c
            com.etao.feimagesearch.model.b r0 = r5.d
            if (r0 == 0) goto L49
            java.lang.String r0 = r0.getPssource()
            goto L4a
        L49:
            r0 = 0
        L4a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5c
            com.etao.feimagesearch.model.b r0 = r5.d
            if (r0 == 0) goto L5c
            java.lang.String r3 = "sy_hwtab"
            r0.setPssource(r3)
        L5c:
            T extends tb.ctc r0 = r5.f26504a
            tb.cph r0 = (tb.cph) r0
            com.etao.feimagesearch.model.b r3 = r5.e()
            java.lang.String r3 = r3.getInitScene()
            java.lang.String r4 = "getModel().initScene"
            kotlin.jvm.internal.q.a(r3, r4)
            r0.a(r3, r2)
            android.net.Uri r6 = r6.getData()
            if (r6 == 0) goto Lbb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onNewIntent: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "CapturePresenterV2"
            tb.cot.c(r2, r0)
            java.lang.String r0 = "scene"
            java.lang.String r2 = r6.getQueryParameter(r0)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Lb5
            android.net.Uri$Builder r6 = r6.buildUpon()
            com.etao.feimagesearch.model.b r2 = r5.e()
            java.lang.String r2 = r2.getInitScene()
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r2)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            goto Lb9
        Lb5:
            java.lang.String r6 = r6.toString()
        Lb9:
            if (r6 != 0) goto Lbd
        Lbb:
            java.lang.String r6 = ""
        Lbd:
            java.lang.String r0 = "intent.data?.let {\n     …ing()\n      }\n    } ?: \"\""
            kotlin.jvm.internal.q.a(r6, r0)
            T extends tb.ctc r0 = r5.f26504a
            kotlin.jvm.internal.q.a(r0, r1)
            tb.cph r0 = (tb.cph) r0
            com.etao.feimagesearch.structure.capture.CaptureManager r0 = r0.i()
            com.etao.feimagesearch.structure.capture.h r0 = r0.y()
            com.etao.feimagesearch.capture.dynamic.msg.e r1 = new com.etao.feimagesearch.capture.dynamic.msg.e
            r1.<init>(r6)
            com.etao.feimagesearch.capture.dynamic.msg.b r1 = (com.etao.feimagesearch.capture.dynamic.msg.b) r1
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cpg.a(android.content.Intent):void");
    }

    public final void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i2 != -1 || i != cph.Companion.a() || intent == null || intent.getBooleanExtra("isVideo", false)) {
        } else {
            Uri data = intent.getData();
            DynCaptureImgGotConfig dynCaptureImgGotConfig = this.f;
            if (dynCaptureImgGotConfig == null || dynCaptureImgGotConfig.a() == null || dynCaptureImgGotConfig.b() == null) {
                return;
            }
            dynCaptureImgGotConfig.a().d().a(data);
            crq d = dynCaptureImgGotConfig.a().d();
            T view = this.f26504a;
            q.a((Object) view, "view");
            Map<String, String> extraParams = ((cph) view).A_().getExtraParams();
            q.a((Object) extraParams, "view.pageModel.extraParams");
            d.a(ai.c(extraParams));
            new d(dynCaptureImgGotConfig).a();
        }
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        CaptureManager captureManager = this.e;
        if (captureManager == null) {
            return;
        }
        captureManager.H();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        i iVar = this.c;
        if (iVar == null) {
            return;
        }
        d().y().a(iVar);
        this.c = null;
    }

    public final b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("560a1ccc", new Object[]{this});
        }
        b bVar = this.d;
        if (bVar == null) {
            T view = this.f26504a;
            q.a((Object) view, "view");
            Activity s = ((cph) view).s();
            q.a((Object) s, "view.activity");
            bVar = b.parseFromIntent(s.getIntent());
            if (!CaptureManager.n) {
                q.a((Object) bVar, "this");
                if (TextUtils.isEmpty(bVar.getPssource())) {
                    bVar.setPssource("sy_hwtab");
                }
            }
            this.d = bVar;
            q.a((Object) bVar, "this");
        }
        return bVar;
    }

    public final void a(String sceneType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, sceneType});
            return;
        }
        q.c(sceneType, "sceneType");
        if ((!q.a((Object) sceneType, (Object) "scan") && !q.a((Object) sceneType, (Object) cpe.a.SCENE_AUTO_DETECT)) || this.h) {
            return;
        }
        f();
        this.h = true;
    }

    public final void a(DynCaptureImgGotConfig imgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a172c768", new Object[]{this, imgGotConfig});
            return;
        }
        q.c(imgGotConfig, "imgGotConfig");
        cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "clickLibrary", "pssource", e().getPssource());
        this.f = imgGotConfig;
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.a aVar = new com.etao.feimagesearch.model.a(((cph) view).A_());
        Map<String, String> extraParams = aVar.getExtraParams();
        q.a((Object) extraParams, "model.extraParams");
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        extraParams.put("album_tab_type", String.valueOf(((cph) view2).i().p()));
        Map<String, String> extraParams2 = aVar.getExtraParams();
        q.a((Object) extraParams2, "model.extraParams");
        extraParams2.put("direct_jump_after_album_choose", "true");
        if (imgGotConfig.c()) {
            aVar.setShowVideo();
        }
        Intent createJumpIntent = aVar.createJumpIntent();
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        ((cph) view3).s().startActivityForResult(createJumpIntent, cph.Companion.a());
        T view4 = this.f26504a;
        q.a((Object) view4, "view");
        ((cph) view4).s().overridePendingTransition(R.anim.album_enter_anim, R.anim.empty);
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!d().o()) {
        } else {
            T view = this.f26504a;
            q.a((Object) view, "view");
            String pssource = ((cph) view).A_().getPssource();
            String blackList = d().E();
            String str = blackList;
            if (!TextUtils.isEmpty(str)) {
                q.a((Object) blackList, "blackList");
                q.a((Object) pssource, "pssource");
                if (n.b((CharSequence) str, (CharSequence) pssource, false, 2, (Object) null)) {
                    return;
                }
            }
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            if (!al.a((Context) ((cph) view2).s())) {
                TLogTracker.a("PermissionRequest", "album permission denied");
                i iVar = new i(false);
                if (d().y().i()) {
                    d().y().a(iVar);
                    return;
                } else {
                    this.c = iVar;
                    return;
                }
            }
            cot.c(TAG, "updateRecentAlbumImg----");
            new ImagePopTask(this, 10, false, true).execute();
        }
    }

    @Override // com.etao.feimagesearch.ImagePopTask.b
    public void a(List<AlbumMediaItem> list, List<ctd> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        if (list2 != null && list2.size() >= 4) {
            int i = 0;
            for (ctd ctdVar : list2) {
                arrayList.add(new MusOuterAlbumBean(ctdVar.f26508a, Float.valueOf(f), true, Integer.valueOf(i), "false", -1L));
                i++;
                f = 0.0f;
            }
            cox.c(com.etao.feimagesearch.structure.capture.a.f6987a, "OuterAlbumRemote", "count", String.valueOf(arrayList.size()));
        } else if (list != null) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            int i2 = 0;
            boolean z = false;
            for (AlbumMediaItem albumMediaItem : list) {
                if (albumMediaItem.imgUri != null) {
                    long a2 = cov.a(albumMediaItem.lastUpdateTime, 0L);
                    if (Math.abs(currentTimeMillis - a2) < d().F()) {
                        arrayList.add(new MusOuterAlbumBean(albumMediaItem.imgUri.toString(), Float.valueOf(cov.a(albumMediaItem.orientation, 0.0f)), false, Integer.valueOf(i2), String.valueOf(com.etao.feimagesearch.album.q.a(albumMediaItem.imgFilePath)), Long.valueOf(a2 * 1000)));
                    }
                    if (!z) {
                        g.a(albumMediaItem.lastUpdateTime);
                        z = true;
                    }
                }
                i2++;
            }
            if (arrayList.size() > 0) {
                cox.c(com.etao.feimagesearch.structure.capture.a.f6987a, "OuterAlbumLocal", "count", String.valueOf(arrayList.size()));
            }
        }
        ((cph) this.f26504a).a(arrayList);
    }
}
