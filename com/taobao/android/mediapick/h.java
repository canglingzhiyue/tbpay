package com.taobao.android.mediapick;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class h implements IMediaPickClient.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(52107975);
        kge.a(279158606);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void a(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c3cf68", new Object[]{this, media, new Integer(i)});
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void b(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938e7147", new Object[]{this, media, new Integer(i)});
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient.a
    public void c(Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd591326", new Object[]{this, media, new Integer(i)});
        }
    }
}
