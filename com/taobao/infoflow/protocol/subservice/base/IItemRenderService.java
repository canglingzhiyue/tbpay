package com.taobao.infoflow.protocol.subservice.base;

import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.view.item.b;
import com.taobao.infoflow.protocol.view.item.c;

/* loaded from: classes.dex */
public interface IItemRenderService extends ISubService {
    public static final String SERVICE_NAME = "ItemRenderService";

    /* loaded from: classes.dex */
    public interface a {
        b a(String str);
    }

    c getItemRenderPresenter();

    void setItemRenderFactory(a aVar);
}
