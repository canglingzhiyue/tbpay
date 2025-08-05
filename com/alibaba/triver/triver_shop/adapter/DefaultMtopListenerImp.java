package com.alibaba.triver.triver_shop.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public class DefaultMtopListenerImp implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1775447337);
        kge.a(-525336021);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            ceg.Companion.b(q.a("on mtop error , ", (Object) (mtopResponse == null ? null : mtopResponse.toString())));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            ceg.Companion.b(q.a("on mtop success , ", (Object) (mtopResponse == null ? null : mtopResponse.toString())));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            ceg.Companion.b(q.a("on mtop system error , ", (Object) (mtopResponse == null ? null : mtopResponse.toString())));
        }
    }
}
