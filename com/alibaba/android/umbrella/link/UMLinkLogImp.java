package com.alibaba.android.umbrella.link;

import android.util.Log;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bps;

/* loaded from: classes.dex */
public final class UMLinkLogImp implements UMLinkLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "umbrella";

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public i createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2b8159b5", new Object[]{this, str});
        }
        Log.e(TAG, "createLinkId");
        return new i(bps.a(str));
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logSimpleInfo(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf0b93", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            String str5 = str + " logSimpleInfo";
            h.a(str, str2, str3, str4);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf17", new Object[]{this, str, str2, str3, iVar, map, aVar});
            return;
        }
        try {
            String str4 = str + " logInfo";
            h.a(str, str2, str3, iVar, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfoRawDim(String str, String str2, String str3, i iVar, Map<String, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedf50f7", new Object[]{this, str, str2, str3, iVar, map, aVar});
            return;
        }
        try {
            String str4 = str + " logInfoRawDim";
            h.a(str, str2, str3, iVar, UMDimKey.convertRawMap(map), aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logError(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12f15", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
            return;
        }
        try {
            Log.e(TAG, str + " logError");
            h.a(str, str2, str3, iVar, str4, str5, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logErrorRawDim(String str, String str2, String str3, i iVar, String str4, String str5, Map<String, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f386cb75", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
            return;
        }
        try {
            Log.e(TAG, str + " logErrorRawDim");
            h.a(str, str2, str3, iVar, str4, str5, UMDimKey.convertRawMap(map), aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logBegin(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21e2b0a", new Object[]{this, str, str2, str3, iVar, map, aVar});
            return;
        }
        try {
            String str4 = str + " logBegin";
            h.b(str, str2, str3, iVar, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logEnd(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1860da8", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
            return;
        }
        try {
            String str6 = str + " logEnd";
            h.b(str, str2, str3, iVar, str4, str5, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle(String str, String str2, i iVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c026efe", new Object[]{this, str, str2, iVar, new Integer(i), new Integer(i2), str3, str4, map, aVar});
            return;
        }
        try {
            String str5 = str + " logPageLifecycle";
            h.a(str, str2, iVar, String.valueOf(i), String.valueOf(i2), str3, str4, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_PAGE, str3);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle2(String str, String str2, i iVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb646dae", new Object[]{this, str, str2, iVar, str3, str4, str5, str6, map, aVar});
            return;
        }
        try {
            String str7 = str + " logPageLifecycle2";
            h.a(str, str2, iVar, str3, str4, str5, str6, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_PAGE, str5);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction(String str, String str2, i iVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7369ee1c", new Object[]{this, str, str2, iVar, new Integer(i), str3, str4, str5, map, aVar});
            return;
        }
        try {
            String str6 = str + " logUIAction";
            h.a(str, str2, iVar, String.valueOf(i), "", str3, str4, str5, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_UI_ACTION, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction2(String str, String str2, i iVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d4fc", new Object[]{this, str, str2, iVar, new Integer(i), str3, str4, str5, str6, map, aVar});
            return;
        }
        try {
            String str7 = str + " logUIAction2";
            h.a(str, str2, iVar, String.valueOf(i), str3, str4, str5, str6, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_UI_ACTION, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopReq(String str, String str2, i iVar, String str3, String str4, String str5, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd8fa2f", new Object[]{this, str, str2, iVar, str3, str4, str5, map, aVar});
            return;
        }
        try {
            String str6 = str + " logMtopReq";
            h.a(str, str2, iVar, str3, str4, str5, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_MTOP, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopResponse(String str, String str2, i iVar, Object obj, String str3, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fe6022", new Object[]{this, str, str2, iVar, obj, str3, map, aVar});
            return;
        }
        try {
            String str4 = str + " logMtopResponse";
            if (!(obj instanceof MtopResponse)) {
                return;
            }
            h.a(str, str2, iVar, (MtopResponse) obj, str3, map, aVar);
        } catch (Throwable th) {
            a.a(th, a.POINT_LOG, str, str2, UMLLCons.FEATURE_TYPE_MTOP, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            String str6 = str4 + " commitSuccess";
            h.a(str, str2, str3, str4, str5, map);
        } catch (Throwable th) {
            a.a(th, a.POINT_COMMIT_SUCCESS, str4, str5, str, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            Log.e(TAG, str4 + " commitFailure");
            h.a(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            a.a(th, a.POINT_COMMIT_FAILURE, str4, str5, str, str6);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{this, str, str2, umTypeKey, str3, str4});
            return;
        }
        try {
            Log.e(TAG, str + " commitFeedback");
            h.a(str, str2, umTypeKey, str3, str4);
        } catch (Throwable th) {
            a.a(th, a.POINT_COMMIT_FAILURE, str, (String) null, (String) null, (String) null);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e3476d", new Object[]{this, str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
            return;
        }
        try {
            Log.e(TAG, str + " trace");
            f.a(str, str2, str3, str4, str5, str6, traceLogEventType, strArr);
        } catch (Throwable th) {
            a.a(th, a.POINT_COMMIT_FAILURE, str, (String) null, (String) null, (String) null);
        }
    }
}
