package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f13782a;
    public VideoInfo b;
    public l c;
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c f;
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b d = new com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b();
    public boolean g = true;
    public com.taobao.taolive.sdk.model.f e = new com.taobao.taolive.sdk.model.f(this);

    static {
        kge.a(-637945397);
        kge.a(-1905361424);
    }

    public a(FrameLayout frameLayout, VideoInfo videoInfo, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        boolean z = true;
        this.f13782a = frameLayout;
        this.b = videoInfo;
        this.f = cVar;
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar2 = this.f;
        boolean z2 = false;
        if (cVar2 != null) {
            if (!cVar2.k()) {
                z2 = (!this.f.i() || !this.f.c.f) ? false : z;
            }
            this.d.a(this.f.c.b, this.f.c.c);
        }
        this.c = new l(cVar, frameLayout.getContext(), z2);
    }

    public static boolean a(VideoInfo videoInfo, LiveItem liveItem, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e9883eb", new Object[]{videoInfo, liveItem, cVar})).booleanValue();
        }
        if (liveItem == null || videoInfo == null) {
            return false;
        }
        if (hiq.c(liveItem)) {
            his.b("BaseGoodPlayer", "showProducts | not show for gray, id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            return false;
        } else if (hiq.a(videoInfo.liveId, liveItem)) {
            return true;
        } else {
            his.b("BaseGoodPlayer", "showProducts| liveid check fail. mVideoInfo.liveId=" + videoInfo.liveId);
            return false;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.removeCallbacksAndMessages(null);
        }
    }
}
