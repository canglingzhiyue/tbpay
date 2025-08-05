package com.taobao.message.subscribe;

import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class Constants {
    public static final String DEFAULT_TOAST;
    public static final String SDK_VERSION = "Android_1.0";
    public static final String TAG = "cbq@topicsubscribe";

    static {
        kge.a(1316501135);
        DEFAULT_TOAST = DisplayUtil.localizedString(R.string.mp_the_activity_is_too_hot);
    }
}
