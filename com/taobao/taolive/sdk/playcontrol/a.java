package com.taobao.taolive.sdk.playcontrol;

import android.content.Context;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import tb.ddt;
import tb.ppr;

/* loaded from: classes8.dex */
public interface a extends ddt {

    /* renamed from: com.taobao.taolive.sdk.playcontrol.a$-CC  reason: invalid class name */
    /* loaded from: classes8.dex */
    public final /* synthetic */ class CC {
    }

    @Override // tb.ddt
    /* synthetic */ IMediaPlayer a();

    com.taobao.taolive.sdk.ui.media.d a(Context context, String str, int i, String str2);

    com.taobao.taolive.sdk.ui.media.d a(Context context, String str, MediaData mediaData, String str2);

    void a(int i);

    void a(Context context, boolean z);

    void a(ISmallWindowStrategy iSmallWindowStrategy);

    void a(d.a aVar);

    void a(String str);

    void a(ppr pprVar);

    void a(boolean z);

    void a(boolean z, boolean z2);

    boolean a(Context context, String str, int i, boolean z);

    void b(ppr pprVar);

    void b(boolean z);

    void c(boolean z);

    boolean c();

    boolean d();

    com.taobao.taolive.sdk.ui.media.d e();

    boolean f();

    void g();

    String h();

    boolean i();

    void j();

    void k();

    void p();

    boolean u();

    void v();

    void w();

    void x();
}
