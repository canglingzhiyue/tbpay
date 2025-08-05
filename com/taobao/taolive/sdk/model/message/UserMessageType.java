package com.taobao.taolive.sdk.model.message;

import com.taobao.android.dinamicx.s;
import tb.kge;

/* loaded from: classes8.dex */
public enum UserMessageType {
    MSG_VIDEO_START,
    MSG_VIDEO_END,
    MSG_VIDEO_PAUSE;
    
    private int type;

    /* loaded from: classes8.dex */
    public static class Counter {
        public static int count;

        static {
            kge.a(-1114196969);
            count = s.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;
        }

        private Counter() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    UserMessageType() {
        /*
            r2 = this;
            int r0 = com.taobao.taolive.sdk.model.message.UserMessageType.Counter.count
            int r1 = r0 + 1
            com.taobao.taolive.sdk.model.message.UserMessageType.Counter.count = r1
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.model.message.UserMessageType.<init>(java.lang.String, int):void");
    }

    UserMessageType(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }
}
