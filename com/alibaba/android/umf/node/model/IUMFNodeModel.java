package com.alibaba.android.umf.node.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public interface IUMFNodeModel extends Serializable {
    String getCode();

    String getId();

    String getNodeType();

    void setCode(String str);

    void setId(String str);
}
