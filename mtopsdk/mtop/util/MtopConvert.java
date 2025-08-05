package mtopsdk.mtop.util;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes.dex */
public class MtopConvert {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopConvert";

    static {
        kge.a(-2096525144);
    }

    @Deprecated
    public static BaseOutDo jsonToOutputDO(byte[] bArr, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("de7caa2a", new Object[]{bArr, cls});
        }
        if (cls == null || bArr == null || bArr.length == 0) {
            TBSdkLog.e(TAG, "[jsonToOutputDO]outClass is null or jsonData is blank");
            return null;
        }
        try {
            return (BaseOutDo) JSON.parseObject(new String(bArr, "UTF-8"), cls);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[jsonToOutputDO]invoke JSON.parseObject error ---Class=" + cls.getName(), th);
            return null;
        }
    }

    @Deprecated
    public static BaseOutDo mtopResponseToOutputDO(MtopResponse mtopResponse, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("6821e60b", new Object[]{mtopResponse, cls});
        }
        if (cls == null || mtopResponse == null) {
            TBSdkLog.e(TAG, "outClass is null or response is null");
            return null;
        }
        return jsonToOutputDO(mtopResponse.getBytedata(), cls);
    }

    public static <T> T convertJsonToOutputDO(byte[] bArr, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("861cd025", new Object[]{bArr, cls});
        }
        if (cls == null || bArr == null || bArr.length == 0) {
            TBSdkLog.e(TAG, "[jsonToOutputDO]outputClass is null or jsonData is blank");
            return null;
        }
        try {
            return (T) JSON.parseObject(new String(bArr, "UTF-8"), cls);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[jsonToOutputDO]invoke JSON.parseObject error ---Class=" + cls.getName(), th);
            return null;
        }
    }

    public static <T> T convertMtopResponseToOutputDO(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f4ce8ba4", new Object[]{mtopResponse, cls});
        }
        if (cls == null || mtopResponse == null) {
            TBSdkLog.e(TAG, "outputClass is null or mtopResponse is null");
            return null;
        }
        return (T) convertJsonToOutputDO(mtopResponse.getBytedata(), cls);
    }

    public static MtopRequest inputDoToMtopRequest(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("1e70de95", new Object[]{iMTOPDataObject});
        }
        if (iMTOPDataObject != null) {
            return ReflectUtil.convertToMtopRequest(iMTOPDataObject);
        }
        return null;
    }

    public static MtopRequest inputDoToMtopRequest(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("474a33c5", new Object[]{obj});
        }
        if (obj != null) {
            return ReflectUtil.convertToMtopRequest(obj);
        }
        return null;
    }
}
