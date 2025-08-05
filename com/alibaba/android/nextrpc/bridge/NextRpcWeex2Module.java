package com.alibaba.android.nextrpc.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.bfm;
import tb.bfn;
import tb.bfo;

/* loaded from: classes2.dex */
public class NextRpcWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bfm mJsRequest;

    public NextRpcWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bfm bfmVar = this.mJsRequest;
        if (bfmVar == null) {
            return;
        }
        bfmVar.a();
    }

    @MUSMethod
    public void bind(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e30e", new Object[]{this, str});
        } else if (this.mJsRequest != null) {
        } else {
            this.mJsRequest = new bfo(getInstance().getUIContext(), "NextRPC_weex2JsModule");
            this.mJsRequest.a(str);
        }
    }

    @MUSMethod
    public void request(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225d77f7", new Object[]{this, str, bVar});
            return;
        }
        bfm bfmVar = this.mJsRequest;
        if (bfmVar == null) {
            return;
        }
        bfmVar.a(str, new bfn(bVar));
    }
}
