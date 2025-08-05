package com.taobao.android.ultron.common.model;

import com.alibaba.fastjson.JSONObject;
import java.util.List;

/* loaded from: classes6.dex */
public interface b {
    List<IDMComponent> getComponents();

    JSONObject getFields();

    String getType();

    void record();

    void rollBack();

    void writeFields(String str, Object obj);
}
