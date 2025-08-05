package com.taobao.android.cachecleaner.monitor.info.node;

import java.util.List;

/* loaded from: classes4.dex */
public interface a {
    void addChild(a aVar);

    List<a> children();

    String getName();

    long getSize();

    boolean isDirectory();

    a parent();

    String path();

    void setSize(long j);

    int type();
}
