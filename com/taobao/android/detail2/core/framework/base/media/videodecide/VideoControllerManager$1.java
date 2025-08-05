package com.taobao.android.detail2.core.framework.base.media.videodecide;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.fjt;
import tb.fkd;

/* loaded from: classes5.dex */
public class VideoControllerManager$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IRemoteBaseListener val$callback;

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public VideoControllerManager$1(IRemoteBaseListener iRemoteBaseListener) {
        this.val$callback = iRemoteBaseListener;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = this.val$callback;
        if (iRemoteBaseListener == null) {
            return;
        }
        iRemoteBaseListener.onSystemError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        try {
            b.a(fkd.a(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject("config").get("bitrateOptiConfig"), (String) null));
            if (this.val$callback == null) {
                return;
            }
            this.val$callback.onSuccess(i, mtopResponse, baseOutDo, obj);
        } catch (Throwable th) {
            fjt.a("VideoControllerManager", "requestVideoInfo failed: ", th);
        }
    }
}
