package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import com.alipay.android.msp.plugin.engine.IOcrEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspOcrImpl implements IOcrEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IOcrEngine
    public void finishOCRView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88f8557", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IOcrEngine
    public String startOCR(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715e07bc", new Object[]{this, activity, str, new Integer(i)});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IOcrEngine
    public void stopOCR(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e4174d", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IOcrEngine
    public boolean supportOCR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89defda", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
