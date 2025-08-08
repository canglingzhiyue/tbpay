package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.video.m;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;

@AURAExtensionImpl(code = "alidetail.impl.render.dx.video.lifecycle")
/* loaded from: classes4.dex */
public final class dxp implements axc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d b;
    private awz c;
    private boolean d;

    /* renamed from: a  reason: collision with root package name */
    private String f27066a = dxp.class.getSimpleName();
    private AbsPicGalleryVideoPlayer.a e = new AbsPicGalleryVideoPlayer.a() { // from class: tb.dxp.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            String a2 = dxp.a(dxp.this);
            i.d(a2, "onPicPlay:" + absPicGalleryVideoPlayer);
            if (dxp.b(dxp.this) != null) {
                dxp.b(dxp.this).c();
            }
            dxp.a(dxp.this, false);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            String a2 = dxp.a(dxp.this);
            i.d(a2, "onPicPause: " + absPicGalleryVideoPlayer);
        }
    };

    static {
        kge.a(1169885148);
        kge.a(19975191);
    }

    public static /* synthetic */ String a(dxp dxpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("398f5124", new Object[]{dxpVar}) : dxpVar.f27066a;
    }

    public static /* synthetic */ boolean a(dxp dxpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db07975c", new Object[]{dxpVar, new Boolean(z)})).booleanValue();
        }
        dxpVar.d = z;
        return z;
    }

    public static /* synthetic */ awz b(dxp dxpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (awz) ipChange.ipc$dispatch("cd2a83e5", new Object[]{dxpVar}) : dxpVar.c;
    }

    public dxp() {
        emu.a("com.taobao.android.detail.core.aura.extension.video.AliDetailDXVideoExtension");
    }

    @Override // tb.axc
    public void a(awz awzVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482ee20e", new Object[]{this, awzVar, objArr, dXRuntimeContext});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onInit: " + awzVar);
        this.c = awzVar;
    }

    @Override // tb.axc
    public void b(awz awzVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        d dVar;
        AbsPicGalleryVideoPlayer g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613033ad", new Object[]{this, awzVar, objArr, dXRuntimeContext});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onPlay: " + awzVar + "," + objArr + "," + dXRuntimeContext);
        Context m = dXRuntimeContext != null ? dXRuntimeContext.m() : null;
        if (m instanceof Activity) {
            eps.a(m, "teavideo", new Pair[0]);
        }
        if (!f.r() || (dVar = this.b) == null || (g = dVar.g()) == null || !StringUtils.equals(g.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
            return;
        }
        g.b();
        this.d = true;
    }

    @Override // tb.axc
    public void c(awz awzVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        d dVar;
        AbsPicGalleryVideoPlayer g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a31854c", new Object[]{this, awzVar, objArr, dXRuntimeContext});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onPause: " + awzVar + ",mUserTriggeredPause=" + this.d);
        if (!f.r() || (dVar = this.b) == null || !this.d || (g = dVar.g()) == null || !StringUtils.equals(g.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING)) {
            return;
        }
        g.a();
    }

    @Override // tb.axc
    public void a(awz awzVar, int i, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a64293", new Object[]{this, awzVar, new Integer(i), objArr, dXRuntimeContext});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onError: " + awzVar + "," + objArr + "," + dXRuntimeContext);
    }

    @Override // tb.axc
    public void d(awz awzVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9332d6eb", new Object[]{this, awzVar, objArr, dXRuntimeContext});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onComplete: " + awzVar + "," + objArr + "," + dXRuntimeContext);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        i.d(this.f27066a, "onDataChanged");
        if (aURAGlobalData != null) {
            this.b = (d) aURAGlobalData.get("AliDetailPicGalleryVideoManager", d.class);
        }
        a();
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        String str = this.f27066a;
        i.d(str, "onCreate: " + qVar + "," + fVar);
    }

    private void a() {
        AbsPicGalleryVideoPlayer.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null || (aVar = this.e) == null) {
            return;
        }
        dVar.a(aVar);
    }

    @Override // tb.arl
    public void onDestroy() {
        AbsPicGalleryVideoPlayer.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        i.d(this.f27066a, "onDestroy: ");
        d dVar = this.b;
        if (dVar != null && (aVar = this.e) != null) {
            dVar.b(aVar);
        }
        this.b = null;
        awz awzVar = this.c;
        if (awzVar != null) {
            awzVar.d();
        }
        this.c = null;
    }
}
