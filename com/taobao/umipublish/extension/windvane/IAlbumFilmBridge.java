package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.service.ServiceImpl;
import tb.rdz;
import tb.sqi;

@ServiceImpl("com.taobao.android.litecreator.service.impl.AlbumFilmBridge")
/* loaded from: classes9.dex */
public interface IAlbumFilmBridge extends sqi {
    boolean downloadTemplateRes(Context context, JSONObject jSONObject, rdz<JSONObject> rdzVar, rdz<JSONObject> rdzVar2);

    @Override // tb.sqi
    boolean open(Context context, JSONObject jSONObject, WVCallBackContext wVCallBackContext);

    boolean openInner(Context context, WVCallBackContext wVCallBackContext);
}
