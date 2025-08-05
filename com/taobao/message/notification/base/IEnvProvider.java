package com.taobao.message.notification.base;

import android.content.Context;

/* loaded from: classes7.dex */
public interface IEnvProvider {
    boolean checkBrand(String str);

    boolean isAppBackGround(String str);

    boolean isProcessRight(Context context);

    boolean isWindowManagerAvaliable(Context context);
}
