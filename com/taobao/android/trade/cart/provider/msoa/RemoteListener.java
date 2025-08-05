package com.taobao.android.trade.cart.provider.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteListener implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String requestId;

    static {
        kge.a(203814788);
        kge.a(-525336021);
    }

    public RemoteListener(String str) {
        this.requestId = str;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(i.CDN_REQUEST_TYPE, Integer.valueOf(i));
        hashMap.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
        hashMap.put("context", obj);
        String str = "mtopResponse is null";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        c.a().b(this.requestId, retCode, str, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(i.CDN_REQUEST_TYPE, Integer.valueOf(i));
        hashMap.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
        hashMap.put("data", baseOutDo);
        hashMap.put("context", obj);
        c.a().a(this.requestId, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(i.CDN_REQUEST_TYPE, Integer.valueOf(i));
        hashMap.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
        hashMap.put("context", obj);
        String str = "mtopResponse is null";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        c.a().a(this.requestId, retCode, str, hashMap);
    }
}
