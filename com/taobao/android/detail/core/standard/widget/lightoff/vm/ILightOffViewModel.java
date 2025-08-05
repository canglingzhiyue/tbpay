package com.taobao.android.detail.core.standard.widget.lightoff.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.taobao.android.detail.core.standard.widget.lightoff.a;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;

/* loaded from: classes4.dex */
public interface ILightOffViewModel {
    boolean allowPull();

    Drawable createSnapshot();

    String getType();

    View getView(Context context, LightOffItemModel lightOffItemModel, a aVar);
}
