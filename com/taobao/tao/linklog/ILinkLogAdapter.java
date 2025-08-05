package com.taobao.tao.linklog;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.i;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public interface ILinkLogAdapter extends Serializable {
    void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7);

    void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    i createLinkId(String str);

    void logError(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);
}
