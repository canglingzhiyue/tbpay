package com.taobao.android.miniLive.services;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.ipz;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";

    /* renamed from: a  reason: collision with root package name */
    private static b f14348a;
    private com.taobao.android.miniLive.smallwindow.a b;

    static {
        kge.a(-1606768530);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ad1b273", new Object[0]);
        }
        if (f14348a == null) {
            synchronized (b.class) {
                if (f14348a == null) {
                    f14348a = new b();
                }
            }
        }
        return f14348a;
    }

    private b() {
    }

    public void a(Context context, IMediaPlayer iMediaPlayer, VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z, com.taobao.android.miniLive.sdk.c cVar, ipz ipzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7b93a8", new Object[]{this, context, iMediaPlayer, videoInfo, str, str2, str3, str4, str5, str6, new Boolean(z), cVar, ipzVar});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
        com.taobao.android.miniLive.smallwindow.c cVar2 = new com.taobao.android.miniLive.smallwindow.c(context, iMediaPlayer, videoInfo, str, str2, str3, str4, ipzVar, z);
        cVar2.d(str5);
        cVar2.e(str6);
        cVar2.a(cVar);
        this.b = cVar2;
    }

    public void a(Context context, IMediaPlayer iMediaPlayer, VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, com.taobao.android.miniLive.sdk.c cVar, ipz ipzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daee1fb2", new Object[]{this, context, iMediaPlayer, videoInfo, str, str2, str3, str4, str5, str6, str7, new Boolean(z), cVar, ipzVar});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
        com.taobao.android.miniLive.smallwindow.b bVar = new com.taobao.android.miniLive.smallwindow.b(context, iMediaPlayer, videoInfo, str, str2, str3, str4, str5, ipzVar, z);
        bVar.d(str6);
        bVar.e(str7);
        bVar.a(cVar);
        bVar.b();
        this.b = bVar;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (!(aVar instanceof com.taobao.android.miniLive.smallwindow.c)) {
            return;
        }
        aVar.c();
        this.b = null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.c();
        this.b = null;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(onClickListener);
    }

    public void a(com.taobao.android.miniLive.ui.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69a3b5", new Object[]{this, dVar});
            return;
        }
        com.taobao.android.miniLive.smallwindow.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(dVar);
    }
}
