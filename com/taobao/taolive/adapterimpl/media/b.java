package com.taobao.taolive.adapterimpl.media;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;
import tb.mkb;
import tb.mkc;

/* loaded from: classes8.dex */
public class b extends mkb implements IMediaPlayer.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-951206195);
        kge.a(2100969153);
    }

    @Override // tb.mkb
    public mkb.a a(mkc mkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkb.a) ipChange.ipc$dispatch("4da568d2", new Object[]{this, mkcVar});
        }
        return null;
    }

    public b(Context context, String str, String str2, String str3) {
        super(str, str2);
    }
}
