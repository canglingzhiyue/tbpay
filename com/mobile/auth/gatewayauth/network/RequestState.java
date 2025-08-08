package com.mobile.auth.gatewayauth.network;

import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public class RequestState {
    private static volatile RequestState mInstance;
    private boolean useRequest = false;
    private volatile PrivateKeyRespone keyRespone = null;

    public static RequestState getInstance() {
        try {
            if (mInstance == null) {
                synchronized (RequestState.class) {
                    if (mInstance == null) {
                        mInstance = new RequestState();
                    }
                }
            }
            return mInstance;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean checkTokenValied(int i) {
        try {
            if (this.keyRespone != null && !StringUtils.isEmpty(this.keyRespone.getAk()) && !StringUtils.isEmpty(this.keyRespone.getSk()) && !StringUtils.isEmpty(this.keyRespone.getStsToken())) {
                return this.keyRespone.getExpiredTime() - System.currentTimeMillis() > ((long) ((i * 60) * 1000));
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public PrivateKeyRespone getKeyRespone() {
        try {
            return this.keyRespone;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean isUseRequest() {
        try {
            return this.useRequest;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void setKeyRespone(PrivateKeyRespone privateKeyRespone) {
        try {
            this.keyRespone = privateKeyRespone;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setUseRequest(boolean z) {
        try {
            this.useRequest = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
