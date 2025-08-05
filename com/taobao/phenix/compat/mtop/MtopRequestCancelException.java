package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* loaded from: classes7.dex */
public class MtopRequestCancelException extends NetworkResponseException {
    public MtopRequestCancelException(int i) {
        super(0, "cancel request", i, null);
    }
}
