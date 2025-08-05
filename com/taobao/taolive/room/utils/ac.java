package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ac f21755a;

    static {
        kge.a(-33228377);
    }

    private ac() {
    }

    public static ac a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ac) ipChange.ipc$dispatch("83f62bbd", new Object[0]);
        }
        if (f21755a == null) {
            synchronized (ac.class) {
                if (f21755a == null) {
                    f21755a = new ac();
                }
            }
        }
        return f21755a;
    }

    public IMediaPlayer.AspectRatio a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.AspectRatio) ipChange.ipc$dispatch("8e014f6b", new Object[]{this, str});
        }
        if ("2".equals(str)) {
            return IMediaPlayer.AspectRatio.CENTER_CROP;
        }
        if ("3".equals(str)) {
            return IMediaPlayer.AspectRatio.FIT_X_Y;
        }
        return IMediaPlayer.AspectRatio.FIT_CENTER;
    }

    public IMediaPlayer.AspectRatio b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.AspectRatio) ipChange.ipc$dispatch("6bf4b54a", new Object[]{this, str});
        }
        if ("0".equals(str) || "1".equals(str)) {
            return IMediaPlayer.AspectRatio.FIT_CENTER;
        }
        if ("3".equals(str)) {
            return IMediaPlayer.AspectRatio.FIT_X_Y;
        }
        return IMediaPlayer.AspectRatio.CENTER_CROP;
    }
}
