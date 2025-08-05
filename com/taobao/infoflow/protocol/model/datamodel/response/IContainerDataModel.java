package com.taobao.infoflow.protocol.model.datamodel.response;

import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public interface IContainerDataModel<M extends BaseSectionModel> extends Serializable {
    IContainerInnerDataModel<M> getBase();

    IContainerInnerDataModel<M> getDelta();

    List<M> getTotalData();

    void updateBaseSections(List<M> list);

    void updateDeltaSections(List<M> list);
}
