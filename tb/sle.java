package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaVideoInfoData;
import com.taobao.android.fluid.framework.data.remote.MediaVideoInfoResponse;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequestV2;
import com.taobao.taobaoavsdk.util.f;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class sle implements sld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33682a;

    static {
        kge.a(-550197055);
        kge.a(883983766);
    }

    public static /* synthetic */ FluidContext a(sle sleVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("b574409c", new Object[]{sleVar}) : sleVar.f33682a;
    }

    public sle(FluidContext fluidContext) {
        this.f33682a = fluidContext;
    }

    @Override // tb.sld
    public void fetchVideoInfoAndPrecreateDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f797c6", new Object[]{this});
            return;
        }
        spz.c("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() 单独请求播控");
        sps sessionParams = ((ISceneConfigService) this.f33682a.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return;
        }
        MediaVideoInfoRequest a2 = a();
        try {
            a2.videoId = Long.parseLong(sessionParams.d);
        } catch (Exception unused) {
        }
        a2.source = sessionParams.c;
        a2.type = sessionParams.b;
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put(c.KEY_NETWORK_SPEED, Integer.valueOf(f.a()));
            if (a2.isEnableServerABR()) {
                hashMap.put(c.KEY_ENABLE_SERVER_ABR, "true");
            }
            a2.extendParameters = JSON.toJSONString(hashMap);
        } catch (Exception unused2) {
        }
        d.a(this.f33682a, "videoinfo_mtop_start", a2.getApi());
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        FluidSDK.getMTopAdapter().send(a2, new IMTopAdapter.b<MediaVideoInfoResponse>() { // from class: tb.sle.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                try {
                    d.a(sle.a(sle.this), "videoinfo_mtop_error", mtopResponse, SystemClock.elapsedRealtime() - elapsedRealtime);
                    spz.c("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() error请求播控失败。" + mtopResponse.getRetCode() + " " + mtopResponse.getRetMsg());
                } catch (Exception unused3) {
                }
            }

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse, MediaVideoInfoResponse mediaVideoInfoResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a31cf61", new Object[]{this, mtopResponse, mediaVideoInfoResponse});
                } else if (mediaVideoInfoResponse == null || mediaVideoInfoResponse.data == 0) {
                } else {
                    d.a(sle.a(sle.this), "videoinfo_mtop_end", mtopResponse, SystemClock.elapsedRealtime() - elapsedRealtime);
                    spz.c("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() onSuccess请求播控成功返回 " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    if (((ISharePlayerService) sle.a(sle.this).getService(ISharePlayerService.class)).isHasCreateDWInstance()) {
                        return;
                    }
                    String str = ((MediaVideoInfoData) mediaVideoInfoResponse.data).result;
                    if (skk.e()) {
                        skl j = ((IDataService) sle.a(sle.this).getService(IDataService.class)).getConfig().j();
                        if (j != null) {
                            j.a(((MediaVideoInfoData) mediaVideoInfoResponse.data).config);
                        }
                        str = ((MediaVideoInfoData) mediaVideoInfoResponse.data).resourceStr;
                    }
                    snv a3 = snu.a(sle.a(sle.this), sle.a(sle.this).getContext(), str);
                    if (a3 == null) {
                        return;
                    }
                    spz.c("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance 播控分离，创建播放器。idwInstance=" + a3);
                    ((ISharePlayerService) sle.a(sle.this).getService(ISharePlayerService.class)).setDWInstance(a3);
                }
            }
        }, MediaVideoInfoResponse.class);
    }

    private MediaVideoInfoRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoInfoRequest) ipChange.ipc$dispatch("eeb73006", new Object[]{this});
        }
        if (skk.e()) {
            return new MediaVideoInfoRequestV2();
        }
        return new MediaVideoInfoRequest();
    }
}
