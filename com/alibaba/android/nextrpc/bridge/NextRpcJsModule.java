package com.alibaba.android.nextrpc.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.WXModule;
import tb.bfm;
import tb.bfn;
import tb.bfo;

/* loaded from: classes2.dex */
public class NextRpcJsModule extends WXModule implements Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bfm mJsRequest;

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        bfm bfmVar = this.mJsRequest;
        if (bfmVar == null) {
            return;
        }
        bfmVar.a();
    }

    @JSMethod
    public void bind(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e30e", new Object[]{this, str});
        } else if (this.mJsRequest != null) {
        } else {
            this.mJsRequest = new bfo(this.mWXSDKInstance.O(), "NextRPC_JsModule");
            this.mJsRequest.a(str);
        }
    }

    @JSMethod
    public void request(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6575ca8", new Object[]{this, str, jSCallback});
            return;
        }
        bfm bfmVar = this.mJsRequest;
        if (bfmVar == null) {
            return;
        }
        bfmVar.a(str, new bfn(jSCallback));
    }
}
