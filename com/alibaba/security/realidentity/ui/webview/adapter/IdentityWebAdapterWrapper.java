package com.alibaba.security.realidentity.ui.webview.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IdentityWebAdapterWrapper implements IVerifyWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IdentityWebAdapterWrapper";
    public IVerifyWebAdapter mIdentityAdapter = new VerifyWebAdapterImpl();

    /* loaded from: classes3.dex */
    public static final class Singleton {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final IdentityWebAdapterWrapper INSTANCE = new IdentityWebAdapterWrapper();

        public static /* synthetic */ IdentityWebAdapterWrapper access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IdentityWebAdapterWrapper) ipChange.ipc$dispatch("a5ad54e0", new Object[0]) : INSTANCE;
        }
    }

    public static IdentityWebAdapterWrapper getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IdentityWebAdapterWrapper) ipChange.ipc$dispatch("bcf591e5", new Object[0]) : Singleton.access$000();
    }

    @Override // com.alibaba.security.realidentity.ui.webview.adapter.IVerifyWebAdapter
    public BaseWebViewProxy getWebViewType(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseWebViewProxy) ipChange.ipc$dispatch("e15d986d", new Object[]{this, context, str});
        }
        IVerifyWebAdapter iVerifyWebAdapter = this.mIdentityAdapter;
        if (iVerifyWebAdapter == null) {
            return null;
        }
        return iVerifyWebAdapter.getWebViewType(context, str);
    }

    public void setAdapter(IVerifyWebAdapter iVerifyWebAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f0ef2", new Object[]{this, iVerifyWebAdapter});
        } else {
            this.mIdentityAdapter = iVerifyWebAdapter;
        }
    }
}
