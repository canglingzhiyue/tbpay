package com.taobao.collection.manager;

import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import java.util.Map;

/* loaded from: classes7.dex */
public interface a {
    int a(b bVar);

    d a(SwitchOption.CollectionType collectionType);

    Map<Integer, b> a();

    void a(int i, SwitchOption.CollectionType collectionType);

    void a(Code code, SwitchOption switchOption);

    boolean a(int i);
}
