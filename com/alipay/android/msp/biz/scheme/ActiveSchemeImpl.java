package com.alipay.android.msp.biz.scheme;

import android.content.Intent;
import android.net.Uri;
import com.alipay.android.msp.biz.scheme.MspSchemeActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ActiveSchemeImpl {
    public ActiveSchemeImpl() {
        MspSchemeActivity.registerHandler(new MspSchemeActivity.MspSchemeHandler() { // from class: com.alipay.android.msp.biz.scheme.ActiveSchemeImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public String getName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : "ActiveSchemeImpl";
            }

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public void handle(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f96ac96c", new Object[]{this, intent});
                }
            }

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public boolean shouldHandle(Intent intent) {
                Uri data;
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86262e83", new Object[]{this, intent})).booleanValue() : intent != null && (data = intent.getData()) != null && "msptaobao".equals(data.getScheme()) && "active".equals(data.getHost());
            }
        });
    }
}
