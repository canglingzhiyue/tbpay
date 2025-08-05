package com.taobao.android.fluid.framework.data.remote.base;

import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes5.dex */
public interface IMTOPRequest extends IMTOPDataObject {
    String getApi();

    String getVersion();

    boolean isNeedEcode();

    boolean isNeedSession();
}
