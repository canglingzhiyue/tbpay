package com.vivo.push.sdk.service;

import com.taobao.android.launcher.bootstrap.tao.f;

/* loaded from: classes9.dex */
public class CommandClientService extends CommandService {
    public CommandClientService() {
        f.a("null", "com.vivo.push.sdk.service.CommandClientService");
    }

    @Override // com.vivo.push.sdk.service.CommandService
    protected final boolean a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }
}
