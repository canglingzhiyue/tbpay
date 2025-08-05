package com.taobao.themis.kernel.adapter;

/* loaded from: classes9.dex */
public interface IFileAbilityAdapter extends com.taobao.themis.kernel.basic.a {
    String getUserId();

    boolean hasFolderPermission(String str);

    String queryLocalIdByPath(String str);

    String queryPathByLocalId(String str);

    boolean saveIdWithPath(String str, String str2);
}
