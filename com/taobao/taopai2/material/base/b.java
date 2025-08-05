package com.taobao.taopai2.material.base;

import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes8.dex */
public interface b extends a {
    String getAPI();

    MethodEnum getMethod();

    MaterialRequestPolicy getRequestPolicy();

    boolean needLogin();
}
