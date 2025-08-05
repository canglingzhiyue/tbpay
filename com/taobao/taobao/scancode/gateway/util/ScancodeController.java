package com.taobao.taobao.scancode.gateway.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public final class ScancodeController implements m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ScanController";
    private m currentPreviewController;
    public boolean isFragmentStarted = false;

    static {
        kge.a(1753214641);
        kge.a(1571819161);
    }

    public ScancodeController(m mVar) {
        this.currentPreviewController = mVar;
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        m mVar = this.currentPreviewController;
        if (mVar == null) {
            return;
        }
        mVar.startPreview();
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        m mVar = this.currentPreviewController;
        if (mVar == null) {
            return;
        }
        mVar.stopPreview();
    }
}
