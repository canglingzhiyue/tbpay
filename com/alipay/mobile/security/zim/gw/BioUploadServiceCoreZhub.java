package com.alipay.mobile.security.zim.gw;

import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BioUploadServiceCoreZhub<Request> extends BioUploadServiceCore<Request> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f5849a;
    public Map<String, Object> b;

    public static /* synthetic */ Object ipc$super(BioUploadServiceCoreZhub bioUploadServiceCoreZhub, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract BioUploadResult doUpload(Request request, boolean z);

    public void setExtParams(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc64f2f", new Object[]{this, str, map});
            return;
        }
        BioLog.d("BioUploadServiceCoreZhub.setExtParams(): zimId=" + str + ", params=" + StringUtil.map2String(map));
        this.f5849a = str;
        this.b = map;
    }

    public void setZimId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ae30e8", new Object[]{this, str});
            return;
        }
        BioLog.d("BioUploadServiceCoreZhub.setZimId(): zimId=" + str);
        this.f5849a = str;
    }

    @Override // com.alipay.mobile.security.bio.service.BioUploadServiceCore
    public BioUploadResult upload(Request request, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioUploadResult) ipChange.ipc$dispatch("85198269", new Object[]{this, request, new Boolean(z)});
        }
        if (z) {
            RecordProcessor.getInstance().record(RecordProcessor.KEY_VALIDATE_REQUEST);
        }
        BioUploadResult doUpload = doUpload(request, z);
        if (z) {
            a(doUpload);
        }
        return doUpload;
    }

    private void a(BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d9396b", new Object[]{this, bioUploadResult});
            return;
        }
        HashMap hashMap = new HashMap();
        if (bioUploadResult != null) {
            int i = bioUploadResult.validationRetCode;
            if (i == 100 || i == 1000) {
                hashMap.put("result", ZimPlatform.RESULT_TRUE);
            } else {
                hashMap.put("result", ZimPlatform.RESULT_FALSE);
            }
            hashMap.put("message", "");
            hashMap.put("retCode", "" + bioUploadResult.validationRetCode);
            hashMap.put("subCode", bioUploadResult.subCode);
            hashMap.put(ZimPlatform.KEY_SUB_MSG, bioUploadResult.subMsg);
        } else {
            hashMap.put("result", ZimPlatform.RESULT_FALSE);
            hashMap.put("message", "0");
            hashMap.put("retCode", "0");
            hashMap.put("subCode", "");
            hashMap.put(ZimPlatform.KEY_SUB_MSG, "");
        }
        RecordProcessor recordProcessor = RecordProcessor.getInstance();
        if (recordProcessor == null) {
            return;
        }
        recordProcessor.record(RecordProcessor.KEY_VALIDATE_RESPONSE, hashMap);
    }
}
