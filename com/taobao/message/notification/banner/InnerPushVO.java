package com.taobao.message.notification.banner;

import android.os.Bundle;
import tb.kge;

/* loaded from: classes7.dex */
public class InnerPushVO {
    public String content;
    public String iconUrl;
    public String img;
    public Bundle mParam = new Bundle();
    public Options options;
    public long time;
    public String title;

    /* loaded from: classes7.dex */
    public static class Options {
        public boolean allPage = false;

        static {
            kge.a(-1611642455);
        }
    }

    static {
        kge.a(803936975);
    }
}
