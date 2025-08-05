package com.taobao.android.detail2.core.framework.base.media.frame;

import android.util.Log;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.fjt;
import tb.fkr;
import tb.kge;
import tb.ksz;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdVideoSettingHelper: ";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11474a;
    private fkr b;

    static {
        kge.a(-2049770588);
        f11474a = true;
    }

    public c(fkr fkrVar) {
        this.b = fkrVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int b = b();
        if (b < 0) {
            fjt.a("new_detail异常", "NdVideoSettingHelper: 播放设置读取异常。videoAutoPlaySettingValue:" + b);
            return f11474a;
        } else if (b == 0) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (status == null) {
                fjt.a("new_detail异常", "NdVideoSettingHelper: 无法读取网络状态。");
                return f11474a;
            } else if (status.isWifi()) {
                fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: Wifi状态下已开启自动播放。");
                return true;
            } else {
                fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: 非Wifi状态，不开启自动播放。");
                return false;
            }
        } else if (b == 1) {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: 自动播放已全量开启。");
            return true;
        } else if (b == 2) {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: 自动播放已关闭。");
            return false;
        } else {
            fjt.a("new_detail异常", "NdVideoSettingHelper: 未知的播放设置。videoAutoPlaySettingValue:" + b);
            return f11474a;
        }
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int ap = this.b.ap();
        if (ap >= 0) {
            fjt.a(fjt.TAG_TIP, "NdVideoSettingHelper: 自动播放设置命中流内缓存。");
            return ap;
        }
        int c = c();
        this.b.d(c);
        return c;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        try {
            ksz b = com.taobao.global.setting.c.a(Globals.getApplication()).b();
            if (b == null) {
                fjt.a("new_detail异常", "NdVideoSettingHelper: 配置异常，appSettingProvider is null");
                return -1;
            }
            Integer num = (Integer) b.a("nd", "video", -1, null);
            if (num == null) {
                fjt.a("new_detail异常", "NdVideoSettingHelper: 配置异常，appSettingResult is null.");
                return -1;
            }
            fjt.a("new_detail异常", "NdVideoSettingHelper: 播放配置读取成功，appSettingResult:" + num);
            return num.intValue();
        } catch (Exception e) {
            fjt.a("new_detail异常", "NdVideoSettingHelper: 读取我淘视频自动播放设置异常。" + Log.getStackTraceString(e));
            fjt.a("new_detail异常", "NdVideoSettingHelper: 配置异常，默认值。defaultValue:-1");
            return -1;
        }
    }
}
