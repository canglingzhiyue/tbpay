package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.f;

/* loaded from: classes9.dex */
public interface IAccountAdapter extends com.taobao.themis.kernel.basic.a {
    String getNick(f fVar);

    String getUserAvatar(f fVar);

    String getUserId(f fVar);

    boolean isLogin();

    boolean isLogin(f fVar);
}
