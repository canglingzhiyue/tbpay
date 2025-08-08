package com.taobao.android.detail.provider;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SDKConfig;
import tb.kge;

/* loaded from: classes4.dex */
public class f implements com.taobao.android.detail.protocol.adapter.optional.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2144128012);
        kge.a(1477471825);
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.e
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            Log.e(str, str2);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.e
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            StringUtils.isEmpty(str2);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.e
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            StringUtils.isEmpty(str2);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : SDKConfig.getInstance().getGlobalEnvMode() == EnvModeEnum.ONLINE;
    }
}
