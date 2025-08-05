package com.taobao.message.disk;

import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public interface IStorageClearService {

    /* loaded from: classes7.dex */
    public @interface Keys {
        public static final String OUTER = "outer";
    }

    /* loaded from: classes7.dex */
    public @interface KeysInner {
        public static final String INTERACT = "interact";
    }

    /* loaded from: classes7.dex */
    public static class Options {
        public int daysAgo;
        public int mode;

        static {
            kge.a(-678976277);
        }
    }

    void cleanUpLocalConversation(long j, Map<String, Object> map);

    DeleteResult delete(String str, Options options);

    void register(String str, String str2);

    /* loaded from: classes7.dex */
    public static class DeleteResult {
        public String errorMsg;
        public boolean isSuccess = true;
        public int size;

        static {
            kge.a(2073155451);
        }

        public DeleteResult(int i) {
            this.size = i;
        }

        public DeleteResult(String str) {
            this.errorMsg = str;
        }
    }
}
