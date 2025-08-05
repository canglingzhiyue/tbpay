package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* loaded from: classes7.dex */
public class MtopIOException extends NetworkResponseException {
    public MtopIOException(int i) {
        super(0, "io exception", i, null);
    }
}
