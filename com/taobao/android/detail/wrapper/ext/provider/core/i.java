package com.taobao.android.detail.wrapper.ext.provider.core;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SDKConfig;
import tb.emu;
import tb.jqm;
import tb.kge;

/* loaded from: classes5.dex */
public class i implements com.taobao.android.detail.datasdk.protocol.adapter.optional.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11339a = jqm.a();

    static {
        kge.a(-2026501664);
        kge.a(891896530);
    }

    public i() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBLogProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            TLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            TLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            TLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            TLog.loge(str, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
        } else if (StringUtils.isEmpty(str2) && th == null) {
        } else {
            TLog.loge(str, str2, th);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{this, str, str2, th});
        } else if (StringUtils.isEmpty(str2) && th == null) {
        } else {
            TLog.loge(str, str2, th);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.d
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : SDKConfig.getInstance().getGlobalEnvMode() == EnvModeEnum.ONLINE;
    }
}
