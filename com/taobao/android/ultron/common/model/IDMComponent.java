package com.taobao.android.ultron.common.model;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jpk;

/* loaded from: classes6.dex */
public interface IDMComponent extends Serializable {

    /* loaded from: classes6.dex */
    public interface a {
        com.taobao.android.ultron.common.b a(IDMComponent iDMComponent);
    }

    boolean clearOnceExtMap();

    String getAdjustOperatorAction();

    String getCardGroup();

    List<IDMComponent> getChildren();

    Map<String, DMComponent> getCodePopupWindowMap();

    JSONObject getContainerInfo();

    String getContainerType();

    JSONObject getData();

    Map<String, List<b>> getEventMap();

    JSONObject getEvents();

    ArrayMap<String, Object> getExtMap();

    String getExtendType();

    JSONObject getFields();

    JSONObject getHidden();

    String getId();

    String getKey();

    JSONObject getLayout();

    JSONObject getLayoutStyle();

    String getLayoutType();

    LinkageType getLinkageType();

    jpk getMessageChannel();

    int getModifiedCount();

    ArrayMap<String, Object> getOnceExtMap();

    IDMComponent getParent();

    String getPosition();

    ConcurrentHashMap<String, Object> getSafeExtMap();

    JSONObject getStashData();

    int getStatus();

    String getTag();

    String getType();

    boolean isNormalComponent();

    void record();

    void rollBack();

    void setAdjustOperatorAction(String str);

    void setComponentCardGroupTag(String str);

    void setComponentPosition(String str);

    void setCornerTypeFields(int i);

    void setCustomValidate(a aVar);

    void setExtendType(String str);

    void setLayoutType(String str);

    void setMessageChannel(jpk jpkVar);

    void updateModifiedCount();

    com.taobao.android.ultron.common.b validate();

    void writeBackData(JSONObject jSONObject, boolean z);

    void writeBackDataAndReloadEvent(JSONObject jSONObject, boolean z);

    void writeBackFields(JSONObject jSONObject, boolean z);

    void writeFields(String str, Object obj);
}
