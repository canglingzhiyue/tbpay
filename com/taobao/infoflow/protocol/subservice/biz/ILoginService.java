package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface ILoginService extends ISubService {
    public static final String SERVICE_NAME = "LoginService";

    boolean isLogin();

    boolean loginStatusTrigger(boolean z);
}
