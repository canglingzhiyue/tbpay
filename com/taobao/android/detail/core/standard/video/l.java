package com.taobao.android.detail.core.standard.video;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import tb.aqs;
import tb.arc;
import tb.elq;
import tb.elr;
import tb.emj;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.render.picGalleryVideoMiniWindow.scroll")
/* loaded from: classes4.dex */
public final class l extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d b;
    private boolean c = true;
    private q d;

    static {
        kge.a(696852921);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public l() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoMiniWindowScrollExtension");
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (emj.d(recyclerView)) {
            c();
        } else {
            a();
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.d = qVar;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.a, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.b = (d) aURAGlobalData.get("AliDetailPicGalleryVideoManager", d.class);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            arc.a().c("PicGalleryVideoMiniWindowScrollExtension", "showVideoMiniWindow", "mPicGalleryVideoManager为空");
            return;
        }
        AbsPicGalleryVideoPlayer g = dVar.g();
        if (g == null || !StringUtils.equals(g.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
            return;
        }
        Object a2 = g.a(n.EXT_KEY_IS_STRUCT_VIDEO);
        if ((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) {
            return;
        }
        com.taobao.android.detail.core.standard.lightoff.a b = b();
        if (b != null && b.c()) {
            arc.a().c("PicGalleryVideoMiniWindowScrollExtension", "showVideoMiniWindow", "lightOff isShowing, not show VideoMiniWindow");
            return;
        }
        this.b.a(g);
        d();
        this.c = false;
    }

    private com.taobao.android.detail.core.standard.lightoff.a b() {
        elq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.standard.lightoff.a) ipChange.ipc$dispatch("1d721da4", new Object[]{this});
        }
        Context e = this.d.e();
        if (!(e instanceof DetailCoreActivity) || (a2 = elr.a(((DetailCoreActivity) e).h)) == null) {
            return null;
        }
        return a2.i();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.d();
        this.c = true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.c) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, "Page_Detail_Show_FloatingVideo", null, null, null).build());
            BehaviR.getInstance().trackAppear("Page_Detail", "Page_Detail_Show_FloatingVideo", null, null, new String[0]);
        }
    }
}
