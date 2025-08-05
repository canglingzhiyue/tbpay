package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import tb.lmj;

/* loaded from: classes7.dex */
public class lmo implements lmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lmn f30716a = new lmn();

    static {
        kge.a(-1363220339);
        kge.a(-2075796458);
    }

    @Override // tb.lmj
    public void a(lmj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73926b92", new Object[]{this, aVar});
        }
    }

    @Override // tb.lmj
    public void a(DXRuntimeContext dXRuntimeContext, lmk lmkVar) {
        ljs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9de5fff", new Object[]{this, dXRuntimeContext, lmkVar});
        } else if (dXRuntimeContext == null || lmkVar == null || (a2 = lfq.a(dXRuntimeContext)) == null) {
        } else {
            a(dXRuntimeContext, a2, lmkVar);
        }
    }

    @Override // tb.lmj
    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                ldf.d("LiveCardPlayControl", "stopVideo invoke");
                TBLiveOpenCardView b = b(dXRuntimeContext);
                if (b == null) {
                    return;
                }
                b.destroy();
            } catch (Exception e) {
                e.printStackTrace();
                ldf.a("LiveCardPlayControl", "stopVideo exception", e);
            }
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, ljs ljsVar, lmk lmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72427b9a", new Object[]{this, dXRuntimeContext, ljsVar, lmkVar});
            return;
        }
        try {
            ldf.b("LiveCardPlayControl", "playVideoIfNecessary");
            TBLiveOpenCardView b = b(dXRuntimeContext);
            if (!a(ljsVar, lmkVar, b)) {
                ldf.d("LiveCardPlayControl", "播放视频的条件没达到");
                return;
            }
            boolean playVideo = b.playVideo(null, null);
            ldf.d("LiveCardPlayControl", "start play live video result = " + playVideo);
        } catch (Exception e) {
            e.printStackTrace();
            ldf.a("LiveCardPlayControl", "play Live video exception", e);
        }
    }

    private boolean a(ljs ljsVar, lmk lmkVar, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f1cfed", new Object[]{this, ljsVar, lmkVar, tBLiveOpenCardView})).booleanValue();
        }
        if (!this.f30716a.a(ljsVar, lmkVar)) {
            ldf.d("LiveCardPlayControl", "video相关的配置不对");
            return false;
        } else if (!this.f30716a.a(tBLiveOpenCardView)) {
            ldf.d("LiveCardPlayControl", "上下文未初始化");
            return false;
        } else if (!this.f30716a.a(tBLiveOpenCardView, lmkVar)) {
            ldf.d("LiveCardPlayControl", "can not play under current network");
            return false;
        } else if (!this.f30716a.a(tBLiveOpenCardView.getContext())) {
            ldf.d("LiveCardPlayControl", "can not play under current network");
            return false;
        } else if (!tBLiveOpenCardView.isPlaying()) {
            return true;
        } else {
            ldf.d("LiveCardPlayControl", "视频正在播放中，取消播放");
            return false;
        }
    }

    private TBLiveOpenCardView b(DXRuntimeContext dXRuntimeContext) {
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("8cea4f3c", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && (v = dXRuntimeContext.v()) != null) {
            return (TBLiveOpenCardView) v.findViewById(10);
        }
        return null;
    }
}
