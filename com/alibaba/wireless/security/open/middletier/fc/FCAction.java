package com.alibaba.wireless.security.open.middletier.fc;

import tb.kge;

/* loaded from: classes3.dex */
public class FCAction {

    /* loaded from: classes3.dex */
    public enum FCMainAction {
        SUCCESS,
        FAIL,
        CANCEL,
        RETRY,
        TIMEOUT
    }

    /* loaded from: classes3.dex */
    public enum FCSubAction {
        WUA(1),
        NC(2),
        FL(4),
        LOGIN(8),
        DENY(16);
        

        /* renamed from: a  reason: collision with root package name */
        private long f4299a;

        FCSubAction(long j) {
            this.f4299a = 0L;
            this.f4299a = j;
        }

        public long getValue() {
            return this.f4299a;
        }
    }

    static {
        kge.a(-1475031885);
    }
}
