package com.taobao.mytaobao.newsetting;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-4614248);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : new File("/data/local/tmp/.useFontSetting").exists();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        File file = new File("/data/local/tmp/.fontSizeLevelZero");
        File file2 = new File("/data/local/tmp/.fontSizeLevelOne");
        File file3 = new File("/data/local/tmp/.fontSizeLevelTwo");
        File file4 = new File("/data/local/tmp/.fontSizeLevelThree");
        if (new File("/data/local/tmp/.fontSizeLevelFour").exists()) {
            return 4;
        }
        if (file4.exists()) {
            return 3;
        }
        if (file3.exists()) {
            return 2;
        }
        return (!file2.exists() && file.exists()) ? 0 : 1;
    }
}
