package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.taolive.uikit.api.a;
import com.taobao.taolive.uikit.api.b;
import java.util.HashMap;
import java.util.Map;
import tb.lmj;

/* loaded from: classes7.dex */
public class lmp implements a, b, lmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lmn f30717a = new lmn();
    private long b = 0;
    private long c = 0;
    private lmj.a d;
    private final DXRuntimeContext e;
    private TBLiveOpenCardView f;

    static {
        kge.a(-479897285);
        kge.a(-2075796458);
        kge.a(1591031764);
        kge.a(-905470315);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    public lmp(DXRuntimeContext dXRuntimeContext) {
        this.e = dXRuntimeContext;
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
    public void a(lmj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73926b92", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    @Override // tb.lmj
    public void a(DXRuntimeContext dXRuntimeContext) {
        ljs a2;
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                ldf.d("LiveCardPlayControlWhenPlayControl", "stopVideo invoke");
                TBLiveOpenCardView b = b(dXRuntimeContext);
                if (b != null) {
                    b.stopVideo();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ldf.a("LiveCardPlayControlWhenPlayControl", "stopVideo exception", e);
            }
            if (this.e == null || (a2 = lfq.a(dXRuntimeContext)) == null || (iFaceDetectorService = (IFaceDetectorService) a2.a(IFaceDetectorService.class)) == null) {
                return;
            }
            iFaceDetectorService.stopFaceDetector();
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext, ljs ljsVar, lmk lmkVar) {
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72427b9a", new Object[]{this, dXRuntimeContext, ljsVar, lmkVar});
            return;
        }
        try {
            this.f = b(dXRuntimeContext);
            if (!a(ljsVar, lmkVar, this.f)) {
                ldf.d("LiveCardPlayControlWhenPlayControl", "播放视频的条件没达到");
                return;
            }
            this.c = System.currentTimeMillis();
            ldk.a("live", "live_startPlay", "", "Page_Home_VideoPlayer_Count", "", c(dXRuntimeContext));
            boolean playVideo = this.f.playVideo(this, this);
            ldf.d("LiveCardPlayControlWhenPlayControl", "start play live video result = " + playVideo);
            if (this.e == null || (iFaceDetectorService = (IFaceDetectorService) ljsVar.a(IFaceDetectorService.class)) == null) {
                return;
            }
            iFaceDetectorService.startFaceDetector(this.f, this.e.e(), lmkVar.q());
        } catch (Exception e) {
            e.printStackTrace();
            ldf.a("LiveCardPlayControlWhenPlayControl", "play Live video when play Controller exception", e);
        }
    }

    private boolean a(ljs ljsVar, lmk lmkVar, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f1cfed", new Object[]{this, ljsVar, lmkVar, tBLiveOpenCardView})).booleanValue();
        }
        if (!this.f30717a.a(ljsVar, lmkVar)) {
            ldf.d("LiveCardPlayControlWhenPlayControl", "video相关的配置不对");
            a(1, "参数不合法");
            return false;
        } else if (!this.f30717a.a(tBLiveOpenCardView)) {
            a(1, "上下文不合法");
            ldf.d("LiveCardPlayControlWhenPlayControl", "上下文未初始化");
            return false;
        } else if (!this.f30717a.a(tBLiveOpenCardView.getContext())) {
            ldf.d("LiveCardPlayControlWhenPlayControl", "can not play under current network");
            a(1, "网络状态不合法");
            return false;
        } else if (!tBLiveOpenCardView.isPlaying()) {
            return true;
        } else {
            ldf.d("LiveCardPlayControlWhenPlayControl", "视频正在播放中，不重复执行");
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

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        lmj.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(i, str);
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onInfo(int i) {
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case com.alibaba.android.ultron.engine.template.b.ERROR_TEMPLATE_INIT_FAILED /* 100005 */:
                ldk.a("live", "live_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", c(this.e));
                if (this.c > 0) {
                    Map<String, String> c = c(this.e);
                    c.put("cost", String.valueOf(System.currentTimeMillis() - this.c));
                    ldk.a("live", "live_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", c);
                }
                if (this.b > 0) {
                    Map<String, String> c2 = c(this.e);
                    c2.put("cost", String.valueOf(System.currentTimeMillis() - this.b));
                    ldk.a("live", "live_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", c2);
                }
                ljs a2 = lfq.a(this.e);
                if (a2 == null || (iFaceDetectorService = (IFaceDetectorService) a2.a(IFaceDetectorService.class)) == null) {
                    return;
                }
                iFaceDetectorService.setFirstFrameRendered();
                return;
            case 100006:
                this.b = System.currentTimeMillis();
                ldk.a("live", "live_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", c(this.e));
                return;
            case 100007:
                if (this.c <= 0) {
                    return;
                }
                Map<String, String> c3 = c(this.e);
                c3.put("cost", String.valueOf(System.currentTimeMillis() - this.c));
                ldk.a("live", "live_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", c3);
                return;
            default:
                return;
        }
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        ldk.a("live", "live_playFail", "", "Page_Home_VideoPlayer", "", c(this.e), String.valueOf(i), "");
        a(4, "直播组件播放失败");
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ldk.a("live", "live_playMediaFail", "", "Page_Home_VideoPlayer", "", c(this.e), String.valueOf(i), String.valueOf(i2));
        a(2, "直播播放器播放失败");
    }

    private Map<String, String> c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b122850", new Object[]{this, dXRuntimeContext});
        }
        HashMap hashMap = new HashMap(8);
        DXTemplateItem c = dXRuntimeContext == null ? null : dXRuntimeContext.c();
        if (c != null) {
            hashMap.put("template", c.f11925a + "_" + c.b);
        }
        return hashMap;
    }
}
