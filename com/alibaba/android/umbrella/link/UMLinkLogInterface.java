package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import java.util.Map;

/* loaded from: classes.dex */
public interface UMLinkLogInterface {
    void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7);

    void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4);

    void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    i createLinkId(String str);

    void logBegin(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logEnd(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logError(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logErrorRawDim(String str, String str2, String str3, i iVar, String str4, String str5, Map<String, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logInfoRawDim(String str, String str2, String str3, i iVar, Map<String, Object> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logMtopReq(String str, String str2, i iVar, String str3, String str4, String str5, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logMtopResponse(String str, String str2, i iVar, Object obj, String str3, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logPageLifecycle(String str, String str2, i iVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logPageLifecycle2(String str, String str2, i iVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logSimpleInfo(String str, String str2, String str3, String str4);

    @Deprecated
    void logUIAction(String str, String str2, i iVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void logUIAction2(String str, String str2, i iVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar);

    void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr);
}
