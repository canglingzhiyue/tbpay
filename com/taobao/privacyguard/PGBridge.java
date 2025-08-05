package com.taobao.privacyguard;

import com.alibaba.wireless.security.aopsdk.AopBridge;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nkd;

/* loaded from: classes7.dex */
public class PGBridge extends AopBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PGBridge";
    public final nkd mPGReportManager = new nkd();

    static {
        kge.a(1879237055);
    }

    public static /* synthetic */ Object ipc$super(PGBridge pGBridge, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1820922206:
                super.resultBridgeV((Invocation) objArr[0]);
                return null;
            case -1168893114:
                return super.resultBridge((Invocation) objArr[0]);
            case 325535248:
                return new Boolean(super.callBeforeBridge((Invocation) objArr[0]));
            case 1067314891:
                super.callAfterBridge((Invocation) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void report(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public boolean shouldSampleDefault(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3635ff2", new Object[]{this, invocation})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public boolean callBeforeBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13674610", new Object[]{this, invocation})).booleanValue();
        }
        if (!com.taobao.privacyguard.config.a.a().c()) {
            return false;
        }
        return super.callBeforeBridge(invocation);
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void reportTimeCost(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c842a6e4", new Object[]{this, invocation});
        } else if (!com.taobao.privacyguard.config.a.a().c() || !invocation.shouldReport) {
        } else {
            this.mPGReportManager.a(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void callAfterBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9deecb", new Object[]{this, invocation});
        } else {
            super.callAfterBridge(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public void resultBridgeV(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9376eea2", new Object[]{this, invocation});
        } else {
            super.resultBridgeV(invocation);
        }
    }

    @Override // com.alibaba.wireless.security.aopsdk.AopBridge
    public Object resultBridge(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ba541b46", new Object[]{this, invocation}) : super.resultBridge(invocation);
    }
}
