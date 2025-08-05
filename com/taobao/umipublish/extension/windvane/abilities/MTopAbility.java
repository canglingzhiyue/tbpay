package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class MTopAbility extends BaseAbility implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1855362588);
        kge.a(-525336021);
    }

    public abstract String getErrorCode();

    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String retCode = mtopResponse.getRetCode();
        String retMsg = mtopResponse.getRetMsg();
        String errorCode = getErrorCode();
        errorCallback(errorCode, retCode + "," + retMsg);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String retCode = mtopResponse.getRetCode();
        String retMsg = mtopResponse.getRetMsg();
        String errorCode = getErrorCode();
        errorCallback(errorCode, retCode + "," + retMsg);
    }
}
