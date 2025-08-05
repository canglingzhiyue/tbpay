package com.taobao.infoflow.protocol.subservice.base;

import android.app.Activity;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* loaded from: classes.dex */
public interface IDxItemRenderService extends ISubService, com.taobao.infoflow.protocol.view.item.b {
    public static final String SERVICE_NAME = "DXService";

    /* loaded from: classes.dex */
    public interface a {
        void a(DinamicXEngine dinamicXEngine);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();
    }

    void downloadTemplate(List<BaseSectionModel> list, b bVar);

    void downloadTemplateWithoutPrefetch(List<BaseSectionModel> list, b bVar);

    void initDx();

    void reset();

    void setDxCurrentActivity(Activity activity);

    void setDxEngineConfigBuilder(DXEngineConfig.a aVar);

    void setDxEngineDesignScaleEnable(boolean z, boolean z2);

    void setOnDxRegisterListener(a aVar);
}
