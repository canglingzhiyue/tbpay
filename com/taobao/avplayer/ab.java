package com.taobao.avplayer;

import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.embed.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.embed.MyTBLiveEmbedView;
import com.taobao.avplayer.embed.MyTBVideoEmbedView;
import tb.kge;

/* loaded from: classes6.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f16449a;

    static {
        kge.a(-804741149);
        f16449a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f16449a) {
        } else {
            f16449a = true;
            a.a(MyTBLiveEmbedView.NAME, (Class<? extends BaseEmbedView>) MyTBLiveEmbedView.class, true);
            a.a(MyTBVideoEmbedView.NAME, (Class<? extends BaseEmbedView>) MyTBVideoEmbedView.class, true);
        }
    }
}
