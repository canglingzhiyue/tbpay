package com.taobao.utils;

import java.io.Serializable;

/* loaded from: classes.dex */
public interface ILoginInfoGetter extends Serializable {
    LoginInfo getLastLoginUserInfo();

    LoginInfo getLoginUserInfo();
}
