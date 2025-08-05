package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* loaded from: classes7.dex */
public class MtopConnectException extends NetworkResponseException {
    public MtopConnectException(int i) {
        super(0, "connect exception", i, null);
    }
}
