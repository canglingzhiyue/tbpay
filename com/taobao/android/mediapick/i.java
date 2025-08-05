package com.taobao.android.mediapick;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.Media;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Media> f14242a = new ArrayList();
    public final List<IMediaPickClient> b = new ArrayList();

    static {
        kge.a(-1768890601);
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("10154f71", new Object[0]) : new i();
    }

    public void a(IMediaPickClient iMediaPickClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1c9175", new Object[]{this, iMediaPickClient});
        } else if (!iMediaPickClient.a(this)) {
        } else {
            this.b.add(iMediaPickClient);
        }
    }
}
