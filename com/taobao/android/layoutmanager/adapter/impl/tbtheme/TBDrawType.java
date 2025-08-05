package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface TBDrawType {
    public static final int BACKGROUND = 2;
    public static final int FOREGROUND_DRAWABLE = 1;
    public static final int FOREGROUND_TEXT = 0;
    public static final int UNSPECIFIED = 3;

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(984935554);
        }

        public static String a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "wtf unknown TBDrawType" : "UNSPECIFIED" : "BACKGROUND" : "FOREGROUND_DRAWABLE" : "FOREGROUND_TEXT";
        }
    }
}
