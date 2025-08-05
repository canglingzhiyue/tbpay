package mtopsdk.mtop.upload.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.kge;

/* loaded from: classes9.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUtil";

    static {
        kge.a(-620276953);
    }

    public static String parseErrCode(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be7b7781", new Object[]{map});
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_ERROR_CODE);
        return StringUtils.isBlank(singleHeaderFieldByKey) ? UploadConstants.ERRCODE_FILE_UPLOAD_FAIL : singleHeaderFieldByKey;
    }

    public static String parseErrMsg(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98423531", new Object[]{map});
        }
        String urlDecode = MtopUtils.urlDecode(HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_ERROR_MSG), "utf-8");
        return StringUtils.isBlank(urlDecode) ? UploadConstants.ERRMSG_FILE_UPLOAD_FAIL : urlDecode;
    }

    public static String parseUrlLocation(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39bac153", new Object[]{map});
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_DATA);
        return StringUtils.isNotBlank(singleHeaderFieldByKey) ? MtopUtils.urlDecode(singleHeaderFieldByKey, "utf-8") : singleHeaderFieldByKey;
    }
}
