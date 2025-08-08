package com.taobao.android.detail.core.standard.video;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import tb.aqs;
import tb.arc;
import tb.emj;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.render.picGalleryStructVideo.scroll")
/* loaded from: classes4.dex */
public final class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d b;

    static {
        kge.a(-1428124139);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public f() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryStructVideoScrollExtension");
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (emj.d(recyclerView)) {
            a();
        } else {
            b();
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
            arc.a().c("PicGalleryStructVideoScrollExtension", "resumePlay", "mPicGalleryVideoManager为空");
            return;
        }
        AbsPicGalleryVideoPlayer g = dVar.g();
        if (g == null) {
            return;
        }
        Object a2 = g.a(n.EXT_KEY_IS_STRUCT_VIDEO);
        if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue()) {
            return;
        }
        Object a3 = g.a(n.EXT_KEY_IS_USER_PAUSE_STRUCT_VIDEO);
        if (((a3 instanceof Boolean) && ((Boolean) a3).booleanValue()) || StringUtils.equals(g.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING) || StringUtils.equals(g.p(), "init") || !this.b.h()) {
            return;
        }
        g.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            arc.a().c("PicGalleryStructVideoScrollExtension", "resumePlay", "mPicGalleryVideoManager为空");
            return;
        }
        AbsPicGalleryVideoPlayer g = dVar.g();
        if (g == null) {
            return;
        }
        Object a2 = g.a(n.EXT_KEY_IS_STRUCT_VIDEO);
        if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue() || !StringUtils.equals(g.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
            return;
        }
        g.b();
    }
}
