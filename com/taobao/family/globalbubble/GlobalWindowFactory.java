package com.taobao.family.globalbubble;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.sya;

/* loaded from: classes7.dex */
public class GlobalWindowFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AMP_CONVERSATION = "event_amp_conversation";
    public static final String EVENT_LOCATION_RESET = "event_location_reset";
    public static final String EVENT_SHARE_BACK_POP = "event_share_back_pop";
    public static final int TYPE_PAGE = 1;
    public static final String WINDOW_AFFECTION = "window_affection";
    public static final String WINDOW_SHAREBACK = "window_shareback";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface GlobalEvent {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface GlobalWindow {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface WindowType {
    }

    public static e a(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("2f48fe67", new Object[]{str, new Boolean(z), new Integer(i)});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1013385289) {
            if (hashCode == 2034440004 && str.equals(WINDOW_AFFECTION)) {
                c = 0;
            }
        } else if (str.equals(WINDOW_SHAREBACK)) {
            c = 1;
        }
        if (c == 0) {
            return new com.taobao.family.globalbubble.affection.a(Globals.getApplication(), z, i);
        }
        if (c == 1) {
            return new sya(Globals.getApplication(), z, i);
        }
        return null;
    }
}
