package com.taobao.vpm.adapter;

import java.util.Map;

/* loaded from: classes9.dex */
public interface ICommitAdapter {
    void track4Click(String str, String str2, Map<String, String> map);

    void track4Click(String str, String str2, String... strArr);

    void track4Show(String str, String str2, Map<String, String> map);

    void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map);
}
