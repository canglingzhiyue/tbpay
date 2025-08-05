package com.taobao.infoflow.protocol.view.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public interface b {
    void bindData(View view, BaseSectionModel<?> baseSectionModel);

    View createView(ViewGroup viewGroup, int i);

    int getViewType(BaseSectionModel<?> baseSectionModel);

    void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i);
}
