package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* loaded from: classes7.dex */
public class MtopInvalidUrlException extends NetworkResponseException {
    public MtopInvalidUrlException(int i) {
        super(0, "Invalid Url", i, null);
    }
}
