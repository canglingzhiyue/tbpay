package com.taobao.homepage.pop.view.container;

import android.view.View;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public interface a {
    int a(IPopData iPopData, IPopAnchorViewInfo iPopAnchorViewInfo, View view);

    View a(com.taobao.homepage.pop.viewmodel.b bVar);

    IPopAnchorViewInfo a(View view, int i);

    IPopAnchorViewInfo a(IPopData iPopData, int i);
}
