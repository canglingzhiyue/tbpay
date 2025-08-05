package com.taobao.analysis;

import java.util.List;

/* loaded from: classes.dex */
public interface a {
    void end(String str, String str2, String str3, String str4);

    void forceCommit(String str, String str2);

    String getFalcoId();

    void registerStages(String str, List<String> list);

    void start(String str, String str2, String str3, String str4);
}
