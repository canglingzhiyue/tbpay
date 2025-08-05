package com.vivo.push.restructure.request;

import android.content.Intent;
import android.os.Bundle;
import com.vivo.push.restructure.request.a.a.b;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes9.dex */
public abstract class a<I extends com.vivo.push.restructure.request.a.a.b, O extends com.vivo.push.restructure.request.a.a.b> {

    /* renamed from: a  reason: collision with root package name */
    private int f24232a = IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR;
    private I b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(I i) {
        this.b = i;
    }

    public final Intent a(int i) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("client_pkgname", com.vivo.push.restructure.a.a().b().getPackageName());
        bundle.putBoolean("support_rf", true);
        com.vivo.push.restructure.request.a.c cVar = new com.vivo.push.restructure.request.a.c(this.f24232a, i);
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        cVar.a(aVar);
        bundle.putString("cf_content", aVar.d());
        com.vivo.push.restructure.request.a.a.a aVar2 = new com.vivo.push.restructure.request.a.a.a();
        this.b.a(aVar2);
        bundle.putString("content", aVar2.d());
        intent.putExtras(bundle);
        return intent;
    }

    public abstract O a(com.vivo.push.restructure.request.a.a.a aVar);
}
