package com.taobao.taolive.room.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Random;
import tb.kge;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1765174424);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : new Random(System.currentTimeMillis()).nextInt(i);
    }

    public static boolean a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd977ce5", new Object[]{tBLiveDataModel})).booleanValue() : (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.commentSwitchStatus != 1) ? false : true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : context.getSharedPreferences("giftEffect", 0).getBoolean("enableGiftEffect", true);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else {
            context.getSharedPreferences("giftEffect", 0).edit().putBoolean("enableGiftEffect", z).apply();
        }
    }
}
