package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* loaded from: classes7.dex */
public class MtopBgForbiddenException extends NetworkResponseException {
    public MtopBgForbiddenException(int i) {
        super(0, "bg forbidden", i, null);
    }
}
