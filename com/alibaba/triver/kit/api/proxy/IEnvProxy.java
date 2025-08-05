package com.alibaba.triver.kit.api.proxy;

import com.alibaba.ariver.kernel.common.Proxiable;

/* loaded from: classes3.dex */
public interface IEnvProxy extends Proxiable {
    public static final String ALIAPP = "AliApp";
    public static final String ARIVERAPP = "AriverApp";

    String getAppGroup();

    String getEnvValue(String str);
}
