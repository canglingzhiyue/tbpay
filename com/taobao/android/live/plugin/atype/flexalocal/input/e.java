package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.graphics.drawable.Drawable;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;

/* loaded from: classes6.dex */
public interface e {
    void onAnchorCustomStickerSelected(StickerConfig stickerConfig, Drawable drawable, String str, boolean z);

    void onOfficialStickerSelected(StickerConfig stickerConfig, Drawable drawable, StickerGroup stickerGroup, boolean z);
}
