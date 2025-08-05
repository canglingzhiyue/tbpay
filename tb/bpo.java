package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.android.umbrella.link.export.a;
import com.alibaba.android.umbrella.link.i;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bpo implements UMLinkLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{this, str, str2, umTypeKey, str3, str4});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public i createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2b8159b5", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logBegin(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21e2b0a", new Object[]{this, str, str2, str3, iVar, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logEnd(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1860da8", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logError(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12f15", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logErrorRawDim(String str, String str2, String str3, i iVar, String str4, String str5, Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f386cb75", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf17", new Object[]{this, str, str2, str3, iVar, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfoRawDim(String str, String str2, String str3, i iVar, Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedf50f7", new Object[]{this, str, str2, str3, iVar, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopReq(String str, String str2, i iVar, String str3, String str4, String str5, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd8fa2f", new Object[]{this, str, str2, iVar, str3, str4, str5, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopResponse(String str, String str2, i iVar, Object obj, String str3, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fe6022", new Object[]{this, str, str2, iVar, obj, str3, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle(String str, String str2, i iVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c026efe", new Object[]{this, str, str2, iVar, new Integer(i), new Integer(i2), str3, str4, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle2(String str, String str2, i iVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb646dae", new Object[]{this, str, str2, iVar, str3, str4, str5, str6, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logSimpleInfo(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf0b93", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction(String str, String str2, i iVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7369ee1c", new Object[]{this, str, str2, iVar, new Integer(i), str3, str4, str5, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction2(String str, String str2, i iVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d4fc", new Object[]{this, str, str2, iVar, new Integer(i), str3, str4, str5, str6, map, aVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e3476d", new Object[]{this, str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
        }
    }
}
