package com.taobao.android.interactive_sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;

/* loaded from: classes5.dex */
public class IncBaseActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (getSupportActionBar() == null) {
        } else {
            getSupportActionBar().e();
        }
    }
}
