package com.taobao.umipublish.extension.windvane;

import com.taobao.android.litecreator.service.ServiceImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.sqj;

@ServiceImpl("com.taobao.umipublish.extension.windvane.MaterialVersionChecker")
/* loaded from: classes9.dex */
public interface IMaterialVersionChecker extends sqj {
    public static final int TYPE_ALBUM_FILM = 1;
    public static final int TYPE_FUN = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface MaterialType {
    }
}
