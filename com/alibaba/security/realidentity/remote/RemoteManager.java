package com.alibaba.security.realidentity.remote;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.n2;
import com.alibaba.security.realidentity.o2;
import com.alibaba.security.realidentity.v2;
import com.alibaba.security.realidentity.w2;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RemoteManager implements n2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final v2 mModelGetter;
    public final w2 mSoGetter = new w2();

    public RemoteManager(Context context) {
        this.mModelGetter = new v2(context);
    }

    @Override // com.alibaba.security.realidentity.n2
    public void getRemoteModel(Context context, RPBizConfig rPBizConfig, o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1b2abf", new Object[]{this, context, rPBizConfig, o2Var});
        } else {
            this.mModelGetter.a(context, rPBizConfig, o2Var);
        }
    }

    @Override // com.alibaba.security.realidentity.n2
    public void getRemoteSoAsync(o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e580bbd2", new Object[]{this, o2Var});
        } else {
            this.mSoGetter.a(o2Var);
        }
    }

    @Override // com.alibaba.security.realidentity.n2
    public boolean loadRemoteSo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6a90cd3", new Object[]{this})).booleanValue() : this.mSoGetter.c();
    }

    @Override // com.alibaba.security.realidentity.n2
    public boolean needDownloadModel(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff16eafa", new Object[]{this, rPBizConfig})).booleanValue() : this.mModelGetter.b(rPBizConfig);
    }

    @Override // com.alibaba.security.realidentity.n2
    public boolean needLoadRemoteSo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7018ed89", new Object[]{this})).booleanValue() : !this.mSoGetter.a();
    }
}
