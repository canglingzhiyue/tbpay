package com.taobao.android.fluid.framework.preload.launcher;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.spz;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: classes5.dex */
public class PrefetchMTOPRequest$1 extends MTopAdapter.ParserResponseCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile CommonResponseOutDo data;
    public final /* synthetic */ IMTopAdapter.b val$callback;
    public final /* synthetic */ Class val$clazz;
    public final /* synthetic */ IMTopAdapter.a val$parseResponseListener;

    public PrefetchMTOPRequest$1(IMTopAdapter.a aVar, Class cls, IMTopAdapter.b bVar) {
        this.val$parseResponseListener = aVar;
        this.val$clazz = cls;
        this.val$callback = bVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
    public void parseResponse(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
            return;
        }
        try {
            this.data = (CommonResponseOutDo) this.val$parseResponseListener.a(mtopResponse.getBytedata(), this.val$clazz);
        } catch (Exception e) {
            spz.a("PrefetchMTOPRequest", "sendWithPrefetch parseResponse error", e);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.data == null) {
            this.val$callback.a(mtopResponse, null);
        } else {
            this.val$callback.a(mtopResponse, this.data);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.val$callback.a(mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.val$callback.a(mtopResponse);
        }
    }
}
