package com.alibaba.security.wukong.model.meta;

import com.alibaba.security.ccrc.common.keep.IKeep;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Data extends IKeep {
    Map<String, Object> getExtras();

    Map<String, Object> getRawMap();

    long getTs();

    int length();

    String type();
}
