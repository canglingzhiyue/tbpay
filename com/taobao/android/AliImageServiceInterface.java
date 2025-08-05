package com.taobao.android;

import android.content.Context;
import android.view.View;

/* loaded from: classes4.dex */
public interface AliImageServiceInterface {
    AliImageInterface a(Context context);

    <T extends View & AliUrlImageViewInterface> T b(Context context);
}
