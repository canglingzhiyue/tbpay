package com.taobao.calendar.sdk.common;

import tb.kge;

/* loaded from: classes6.dex */
public class Step {
    private final CallBack cb;
    private int current;
    private int now;
    private final int vend;
    private final int vstart;

    /* loaded from: classes6.dex */
    public static class CallBack {
        private Step instance;

        static {
            kge.a(-1625169236);
        }

        public void done() {
        }

        public void exec(int i) {
        }

        protected void init(Step step) {
            this.instance = step;
        }

        protected void next() {
            this.instance.next();
        }
    }

    static {
        kge.a(-1328786787);
    }

    public Step(int i, int i2, CallBack callBack) {
        this.vstart = i;
        this.vend = i2;
        this.cb = callBack;
        if (i == i2) {
            this.cb.done();
            return;
        }
        this.cb.init(this);
        this.current = i;
        next();
    }

    protected void next() {
        int i = this.current;
        if (i >= this.vend) {
            this.cb.done();
            return;
        }
        CallBack callBack = this.cb;
        this.current = i + 1;
        callBack.exec(i);
    }
}
