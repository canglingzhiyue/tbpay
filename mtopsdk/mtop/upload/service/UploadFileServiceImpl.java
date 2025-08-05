package mtopsdk.mtop.upload.service;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.upload.domain.FileBaseInfo;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.domain.UploadResult;
import mtopsdk.mtop.upload.domain.UploadToken;
import mtopsdk.mtop.upload.util.FileUploadSetting;
import mtopsdk.mtop.upload.util.FileUtil;
import mtopsdk.mtop.upload.util.NetworkUtil;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.Result;
import mtopsdk.xstate.a;
import tb.kge;
import tb.ryv;

/* loaded from: classes9.dex */
public class UploadFileServiceImpl implements UploadFileService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int NETWORK_RETRY_TIMES = 1;
    private static final String SCHEMA_HTTP = "http://";
    private static final String SCHEMA_HTTPS = "https://";
    private static final int SOCKET_TIMEOUT_MILISECONDS = 40000;
    private static final String TAG = "mtopsdk.UploadFileServiceImpl";
    private static final int UPLOAD_BIZID = 4096;
    private static final String UPLOAD_PATH = "/uploadv2.do";
    private static volatile long timestampOffset;
    private Network networkImpl;
    private ryv signGenerator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum TokenParamsEnum {
        VERSION("version"),
        BIZ_CODE(UploadConstants.BIZ_CODE),
        APPKEY("appkey"),
        TIMESTAMP("t"),
        UTDID("utdid"),
        USERID("userid"),
        FILE_ID(UploadConstants.FILE_ID),
        FILE_NAME(UploadConstants.FILE_NAME),
        FILE_SIZE(UploadConstants.FILE_SIZE),
        SEGMENT_SIZE(UploadConstants.SEGMENT_SIZE);
        
        private String key;

        TokenParamsEnum(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }
    }

    static {
        kge.a(-2132489446);
        kge.a(-1117621798);
        timestampOffset = 0L;
    }

    public UploadFileServiceImpl() {
        this.networkImpl = null;
        this.signGenerator = null;
        MtopConfig mtopConfig = Mtop.instance(Mtop.Id.INNER, (Context) null).getMtopConfig();
        this.networkImpl = new DegradableNetwork(mtopConfig.context);
        this.signGenerator = mtopConfig.sign;
    }

    @Override // mtopsdk.mtop.upload.service.UploadFileService
    public Result<UploadToken> getUploadToken(UploadFileInfo uploadFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("4f4384ff", new Object[]{this, uploadFileInfo});
        }
        FileBaseInfo computeFileBaseInfo = computeFileBaseInfo(uploadFileInfo);
        if (computeFileBaseInfo == null || computeFileBaseInfo.fileSize <= 0) {
            UploadToken uploadToken = new UploadToken();
            uploadToken.useHttps = uploadFileInfo.isUseHttps();
            uploadToken.fileBaseInfo = computeFileBaseInfo;
            uploadToken.bizCode = uploadFileInfo.getBizCode();
            Result<UploadToken> result = new Result<>(false, UploadConstants.ERRTYPE_ILLEGAL_FILE_ERROR, UploadConstants.ERRCODE_FILE_INVALID, UploadConstants.ERRMSG_FILE_INVALID);
            result.setModel(uploadToken);
            return result;
        }
        UploadToken computeUploadToken = computeUploadToken(uploadFileInfo, computeFileBaseInfo);
        if (computeUploadToken == null) {
            UploadToken uploadToken2 = new UploadToken();
            uploadToken2.useHttps = uploadFileInfo.isUseHttps();
            uploadToken2.fileBaseInfo = computeFileBaseInfo;
            Result<UploadToken> result2 = new Result<>(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, UploadConstants.ERRCODE_INVALID_UPLOAD_TOKEN, UploadConstants.ERRMSG_INVALID_UPLOAD_TOKEN);
            result2.setModel(uploadToken2);
            return result2;
        }
        return new Result<>(computeUploadToken);
    }

    @Override // mtopsdk.mtop.upload.service.UploadFileService
    public Result<UploadResult> fileUpload(UploadToken uploadToken, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("41532224", new Object[]{this, uploadToken, new Long(j), new Integer(i)});
        }
        if (uploadToken == null || !uploadToken.isValid()) {
            return new Result<>(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, UploadConstants.ERRCODE_INVALID_UPLOAD_TOKEN, UploadConstants.ERRMSG_INVALID_UPLOAD_TOKEN);
        }
        try {
            RequestImpl requestImpl = new RequestImpl(genUploadUrl(uploadToken, null));
            requestImpl.setBizId(4096);
            requestImpl.setCookieEnabled(false);
            requestImpl.setReadTimeout(40000);
            requestImpl.setRetryTime(1);
            requestImpl.setMethod(MethodEnum.POST.getMethod());
            FileBaseInfo fileBaseInfo = uploadToken.fileBaseInfo;
            long j2 = fileBaseInfo.fileSize - j;
            if (j2 < 0) {
                return new Result<>(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, UploadConstants.ERRCODE_FILE_UPLOAD_FAIL, UploadConstants.ERRMSG_FILE_UPLOAD_FAIL);
            }
            long j3 = uploadToken.segmentSize;
            if (j2 <= j3) {
                j3 = j2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", UploadConstants.FILE_CONTENT_TYPE);
            hashMap.put("Content-Length", String.valueOf(j3));
            String a2 = a.a(MspGlobalDefine.UA);
            if (a2 != null) {
                hashMap.put("user-agent", a2);
            }
            requestImpl.setHeaders(NetworkUtil.createHttpHeaders(hashMap));
            HashMap hashMap2 = new HashMap();
            if (i > 0) {
                hashMap2.put(UploadConstants.RETRY_TIMES, String.valueOf(i));
            }
            hashMap2.put("token", uploadToken.token);
            hashMap2.put("offset", String.valueOf(j));
            hashMap2.putAll(uploadToken.tokenParams);
            requestImpl.setParams(NetworkUtil.createHttpParams(hashMap2));
            if (fileBaseInfo.file != null) {
                requestImpl.setBodyHandler(new FileUploadBodyHandlerImpl(fileBaseInfo.file, j, j3));
            } else {
                requestImpl.setBodyHandler(new FileStreamUploadBodyHandlerImpl(fileBaseInfo.fileInputStream, fileBaseInfo.fileSize, j, j3));
            }
            return parseUploadResponse(this.networkImpl.syncSend(requestImpl, null));
        } catch (Exception e) {
            TBSdkLog.e(TAG, "[fileUpload]gen fileUpload address url error", e);
            new Result(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, UploadConstants.ERRCODE_INVALID_UPLOAD_ADDRESS, UploadConstants.ERRMSG_INVALID_UPLOAD_ADDRESS);
            return null;
        }
    }

    private Result<UploadResult> parseUploadResponse(Response response) {
        Result<UploadResult> result;
        Result<UploadResult> result2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e0ff370f", new Object[]{this, response});
        }
        int statusCode = response.getStatusCode();
        Map<String, List<String>> connHeadFields = response.getConnHeadFields();
        if (statusCode < 0) {
            if (-200 == statusCode) {
                result2 = new Result<>(false, "NETWORK_ERROR", ErrorConstant.ERRCODE_NO_NETWORK, ErrorConstant.ERRMSG_NO_NETWORK);
            } else {
                result2 = new Result<>(false, "NETWORK_ERROR", "ANDROID_SYS_NETWORK_ERROR", anet.channel.util.ErrorConstant.getErrMsg(statusCode));
            }
            result2.setStatusCode(statusCode);
            return result2;
        }
        if (200 == statusCode) {
            String parseErrCode = FileUtil.parseErrCode(connHeadFields);
            if ("SUCCESS".equalsIgnoreCase(parseErrCode)) {
                String parseUrlLocation = FileUtil.parseUrlLocation(connHeadFields);
                if (StringUtils.isNotBlank(parseUrlLocation)) {
                    UploadResult uploadResult = new UploadResult(true, parseUrlLocation);
                    uploadResult.serverRT = HeaderHandlerUtil.getSingleHeaderFieldByKey(connHeadFields, UploadConstants.X_SERVER_RT);
                    result = new Result<>(uploadResult);
                } else {
                    result = new Result<>(new UploadResult(false, null));
                }
                result.setErrType("SUCCESS");
                result.setErrCode("SUCCESS");
            } else {
                if (UploadConstants.ERRCODE_TOKEN_EXPIRED.equalsIgnoreCase(parseErrCode)) {
                    computeTimeStampOffset(HeaderHandlerUtil.getSingleHeaderFieldByKey(connHeadFields, UploadConstants.X_SERVER_TIMESTAMP));
                }
                result = new Result<>(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, parseErrCode, FileUtil.parseErrMsg(connHeadFields));
            }
        } else {
            result = new Result<>(false, UploadConstants.ERRTYPE_OTHER_UPLOAD_ERROR, "ANDROID_SYS_NETWORK_ERROR", "ANDROID_SYS_NETWORK_ERROR");
        }
        result.setStatusCode(statusCode);
        return result;
    }

    private String genUploadUrl(UploadToken uploadToken, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e717573", new Object[]{this, uploadToken, str});
        }
        if (StringUtils.isBlank(uploadToken.domain)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        if (FileUploadSetting.useHttps(uploadToken.bizCode) || uploadToken.useHttps) {
            sb.append("https://");
        } else {
            sb.append("http://");
        }
        sb.append(uploadToken.domain);
        sb.append(UPLOAD_PATH);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private mtopsdk.mtop.upload.domain.FileBaseInfo computeFileBaseInfo(mtopsdk.mtop.upload.domain.UploadFileInfo r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.mtop.upload.service.UploadFileServiceImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            java.lang.String r11 = "3a2e2e85"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            mtopsdk.mtop.upload.domain.FileBaseInfo r11 = (mtopsdk.mtop.upload.domain.FileBaseInfo) r11
            return r11
        L18:
            java.lang.String r0 = r11.getFilePath()
            boolean r1 = mtopsdk.common.util.StringUtils.isNotBlank(r0)
            java.lang.String r2 = "mtopsdk.UploadFileServiceImpl"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 0
            if (r1 == 0) goto L69
            java.io.File r11 = new java.io.File     // Catch: java.lang.Exception -> L3f
            r11.<init>(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r11.getName()     // Catch: java.lang.Exception -> L39
            long r4 = r11.length()     // Catch: java.lang.Exception -> L37
            goto L62
        L37:
            r6 = move-exception
            goto L3b
        L39:
            r6 = move-exception
            r1 = r3
        L3b:
            r9 = r6
            r6 = r11
            r11 = r9
            goto L41
        L3f:
            r11 = move-exception
            r1 = r3
        L41:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[computeFileBaseInfo]get FileBaseInfo error.check filePath="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = "; ---"
            r7.append(r0)
            java.lang.String r11 = r11.toString()
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            mtopsdk.common.util.TBSdkLog.e(r2, r11)
            r11 = r6
        L62:
            mtopsdk.mtop.upload.domain.FileBaseInfo r6 = new mtopsdk.mtop.upload.domain.FileBaseInfo
            r6.<init>(r11)
            r0 = r1
            goto Lba
        L69:
            mtopsdk.mtop.upload.domain.FileStreamInfo r11 = r11.getFileStreamInfo()
            if (r11 == 0) goto Lb9
            java.lang.String r0 = r11.getFileName()     // Catch: java.lang.Exception -> L89
            long r6 = r11.fileLength     // Catch: java.lang.Exception -> L87
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L7c
            long r1 = r11.fileLength     // Catch: java.lang.Exception -> L87
            goto L85
        L7c:
            java.io.InputStream r1 = r11.getFileStream()     // Catch: java.lang.Exception -> L87
            int r1 = r1.available()     // Catch: java.lang.Exception -> L87
            long r1 = (long) r1
        L85:
            r4 = r1
            goto Laf
        L87:
            r1 = move-exception
            goto L8b
        L89:
            r1 = move-exception
            r0 = r3
        L8b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[[computeFileBaseInfo]]get FileBaseInfo error.check fileStreamInfo="
            r6.append(r7)
            java.lang.String r7 = r11.toString()
            r6.append(r7)
            java.lang.String r7 = ";---"
            r6.append(r7)
            java.lang.String r1 = r1.toString()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            mtopsdk.common.util.TBSdkLog.e(r2, r1)
        Laf:
            mtopsdk.mtop.upload.domain.FileBaseInfo r6 = new mtopsdk.mtop.upload.domain.FileBaseInfo
            java.io.InputStream r11 = r11.getFileStream()
            r6.<init>(r11)
            goto Lba
        Lb9:
            r0 = r3
        Lba:
            boolean r11 = mtopsdk.common.util.StringUtils.isNotBlank(r0)
            if (r11 == 0) goto Lcc
            java.lang.String r11 = "."
            int r11 = r0.lastIndexOf(r11)
            if (r11 < 0) goto Lcc
            java.lang.String r3 = r0.substring(r11)
        Lcc:
            if (r6 == 0) goto Lde
            r6.fileName = r0
            r6.fileType = r3
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r6.fileId = r11
            r6.fileSize = r4
        Lde:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.upload.service.UploadFileServiceImpl.computeFileBaseInfo(mtopsdk.mtop.upload.domain.UploadFileInfo):mtopsdk.mtop.upload.domain.FileBaseInfo");
    }

    private UploadToken computeUploadToken(UploadFileInfo uploadFileInfo, FileBaseInfo fileBaseInfo) {
        TokenParamsEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadToken) ipChange.ipc$dispatch("73ee91bc", new Object[]{this, uploadFileInfo, fileBaseInfo});
        }
        if (this.signGenerator == null) {
            TBSdkLog.e(TAG, "[computeToken]ISign for SDKConfig.getInstance().getGlobalSign is null");
            return null;
        }
        UploadToken uploadToken = new UploadToken();
        uploadToken.useHttps = uploadFileInfo.isUseHttps();
        uploadToken.bizCode = uploadFileInfo.getBizCode();
        uploadToken.retryCount = FileUploadSetting.getSegmentRetryTimes();
        uploadToken.segmentSize = FileUploadSetting.getSegmentSize(a.a("nq"), uploadFileInfo.getBizCode());
        HashMap hashMap = new HashMap();
        hashMap.put("version", "1");
        hashMap.put(UploadConstants.BIZ_CODE, uploadFileInfo.getBizCode());
        hashMap.put("appkey", SDKConfig.getInstance().getGlobalAppKey());
        hashMap.put("t", String.valueOf(System.currentTimeMillis() + timestampOffset));
        hashMap.put("utdid", SDKConfig.getInstance().getGlobalUtdid());
        hashMap.put("userid", a.a("uid"));
        hashMap.put(UploadConstants.FILE_ID, fileBaseInfo.fileId);
        hashMap.put(UploadConstants.FILE_NAME, fileBaseInfo.fileName);
        hashMap.put(UploadConstants.FILE_SIZE, String.valueOf(fileBaseInfo.fileSize));
        hashMap.put(UploadConstants.SEGMENT_SIZE, String.valueOf(uploadToken.segmentSize));
        uploadToken.tokenParams = hashMap;
        StringBuilder sb = new StringBuilder();
        for (TokenParamsEnum tokenParamsEnum : TokenParamsEnum.values()) {
            String str = (String) hashMap.get(tokenParamsEnum.getKey());
            if (StringUtils.isBlank(str)) {
                hashMap.remove(tokenParamsEnum.getKey());
                str = "";
            }
            sb.append(str);
            sb.append("&");
        }
        sb.deleteCharAt(sb.length() - 1);
        uploadToken.token = this.signGenerator.a(sb.toString(), (String) hashMap.get("appkey"));
        uploadToken.domain = FileUploadSetting.uploadDomainMap.get(SDKConfig.getInstance().getGlobalEnvMode().getEnvMode());
        uploadToken.fileBaseInfo = fileBaseInfo;
        return uploadToken;
    }

    private void computeTimeStampOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb042d03", new Object[]{this, str});
        } else if (StringUtils.isBlank(str)) {
        } else {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return;
                }
                timestampOffset = parseLong - System.currentTimeMillis();
            } catch (Exception unused) {
                TBSdkLog.e(TAG, "[computeTimeStampOffset] compute TimeStampOffset error,serverTimeStamp=" + str);
            }
        }
    }
}
