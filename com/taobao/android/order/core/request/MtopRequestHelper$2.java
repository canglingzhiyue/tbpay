package com.taobao.android.order.core.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.c;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class MtopRequestHelper$2 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c val$iContainerListener;

    public MtopRequestHelper$2(c cVar) {
        this.val$iContainerListener = cVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        c cVar = this.val$iContainerListener;
        if (cVar != null) {
            cVar.onLoadError(mtopResponse.getRetMsg(), mtopResponse, null, null);
        }
        UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
        c cVar = this.val$iContainerListener;
        if (cVar == null) {
            return;
        }
        cVar.onLoadSuccess(mtopResponse, (DataStatus) null, (PageStatus) null);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
        c cVar = this.val$iContainerListener;
        if (cVar == null) {
            return;
        }
        cVar.onLoadError(mtopResponse.getRetMsg(), mtopResponse, null, null);
    }
}
