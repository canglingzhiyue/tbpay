package com.taobao.android.lifecycle;

import android.support.v7.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class PanguActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1326891966);
    }

    public PanguApplication getPanguApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PanguApplication) ipChange.ipc$dispatch("bc6c9716", new Object[]{this}) : (PanguApplication) getApplication();
    }
}
