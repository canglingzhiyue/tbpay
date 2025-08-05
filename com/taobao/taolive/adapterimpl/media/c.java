package com.taobao.taolive.adapterimpl.media;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.avplayer.h;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.mjz;
import tb.mka;
import tb.pmd;

/* loaded from: classes8.dex */
public class c implements mjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    /* renamed from: a */
    private String f21376a = "";
    private final String c = h.VIDEOCONFIG_API_NAME;
    private final String d = "3.0";

    static {
        kge.a(1622138118);
        kge.a(1828750134);
    }

    public static /* synthetic */ MediaVideoResponse a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaVideoResponse) ipChange.ipc$dispatch("cf21989c", new Object[]{cVar}) : cVar.b();
    }

    public static /* synthetic */ MediaVideoResponse a(c cVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaVideoResponse) ipChange.ipc$dispatch("41521ee1", new Object[]{cVar, mtopResponse}) : cVar.a(mtopResponse);
    }

    public c(String str) {
        this.b = "";
        this.b = str;
    }

    private MtopRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d9d4d093", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(h.VIDEOCONFIG_API_NAME);
        mtopRequest.setVersion("3.0");
        mtopRequest.dataParams = new HashMap();
        mtopRequest.dataParams.put(MusLiveVideo.ATTR_PLAY_SCENES, "live");
        mtopRequest.dataParams.put("userId", pmd.a().q().a());
        mtopRequest.dataParams.put("videoChannel", "");
        mtopRequest.dataParams.put("from", "TBLiveTimeShift");
        mtopRequest.dataParams.put("videoId", this.b);
        mtopRequest.dataParams.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        Map<String, String> map = mtopRequest.dataParams;
        map.put("androidSDKVersion", "" + Build.VERSION.SDK_INT);
        mtopRequest.dataParams.put("useServerPriority", com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_USE_SERVER_DEFINITIONPRIORITY, "false")) ? "1" : "0");
        mtopRequest.setData(ReflectUtil.converMapToDataStr(mtopRequest.dataParams));
        return mtopRequest;
    }

    private MediaVideoResponse a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaVideoResponse) ipChange.ipc$dispatch("1a789676", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
        mediaVideoResponse.errorCode = mtopResponse.getRetCode();
        mediaVideoResponse.errorMsg = mtopResponse.getRetMsg();
        if (mtopResponse.getBytedata() != null) {
            try {
                mediaVideoResponse.data = new JSONObject(new String(mtopResponse.getBytedata())).optJSONObject("data");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return mediaVideoResponse;
    }

    private MediaVideoResponse b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaVideoResponse) ipChange.ipc$dispatch("daf6a332", new Object[]{this}) : new MediaVideoResponse();
    }

    private boolean b(final mka mkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3291bfa", new Object[]{this, mkaVar})).booleanValue();
        }
        RemoteBusiness registeListener = RemoteBusiness.build(a()).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.taolive.adapterimpl.media.TBVideoSourceAdapter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    mka mkaVar2 = mkaVar;
                    if (mkaVar2 == null) {
                        return;
                    }
                    mkaVar2.b(c.a(c.this));
                } else {
                    mka mkaVar3 = mkaVar;
                    if (mkaVar3 == null) {
                        return;
                    }
                    mkaVar3.a(c.a(c.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                mka mkaVar2 = mkaVar;
                if (mkaVar2 == null) {
                    return;
                }
                mkaVar2.b(c.a(c.this, mtopResponse));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                mka mkaVar2 = mkaVar;
                if (mkaVar2 == null) {
                    return;
                }
                mkaVar2.b(c.a(c.this, mtopResponse));
            }
        });
        registeListener.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        registeListener.mo1312setConnectionTimeoutMilliSecond(3000);
        registeListener.mo1326setSocketTimeoutMilliSecond(1000);
        registeListener.startRequest(0, MediaVideoResponse.class);
        return true;
    }

    @Override // tb.mjz
    public void a(mka mkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a61575", new Object[]{this, mkaVar});
        } else {
            b(mkaVar);
        }
    }
}
