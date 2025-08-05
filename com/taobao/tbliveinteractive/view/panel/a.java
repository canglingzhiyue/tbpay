package com.taobao.tbliveinteractive.view.panel;

import com.taobao.tbliveinteractive.InteractiveComponent;

/* loaded from: classes8.dex */
public interface a {
    void addInteractComponent(InteractiveComponent interactiveComponent);

    void addNativeComponent(InteractiveComponent interactiveComponent);

    void destroy();

    void hide();

    void init(b bVar);

    void removeInteractComponent(InteractiveComponent interactiveComponent);

    void show();
}
