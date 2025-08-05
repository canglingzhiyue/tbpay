package com.taobao.android.detail.wrapper.ext.provider.option;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.alj;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements com.taobao.android.detail.datasdk.protocol.adapter.core.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2046236643);
        kge.a(1343277829);
    }

    public c() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBDataHubProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.b
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            alj.a().a(str, hashMap);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            alj.a().a(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            alj.a().a(str);
        }
    }
}
