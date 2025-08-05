package com.taobao.message.tree.core.model;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ContentNode<T> extends Node {
    List<ContentNode> getChildNode();

    Map<String, Object> getComputedData();

    T getObject();

    String getOriginalObjectId();

    String getOriginalObjectType();

    Map<String, Object> getViewMap();
}
