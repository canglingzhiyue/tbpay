package com.alipay.mobile.security.bio.common.statistics;

import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioRecordService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Hashtable;
import java.util.Map;

/* loaded from: classes3.dex */
public class RecordExtServiceImpl extends RecordExtService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BioRecordService b;
    private String d;
    private int c = 1;

    /* renamed from: a  reason: collision with root package name */
    public Hashtable<RecordExtAction, MetaRecord> f5775a = new Hashtable<RecordExtAction, MetaRecord>() { // from class: com.alipay.mobile.security.bio.common.statistics.RecordExtServiceImpl.1
        {
            put(RecordExtAction.RECORD_FC_ENTRY_SDK, new MetaRecord("UC-RZHY-170118-01", "event", "20000189", "fcEntrySDK", 1));
            put(RecordExtAction.RECORD_FC_GET_PARAM, new MetaRecord("UC-RZHY-170118-02", "event", "20000189", "fcGetParameters", 1));
            put(RecordExtAction.RECORD_FC_ENTRY_CERT_SDK, new MetaRecord("UC-RZHY-170118-03", "event", "20000189", "fcEntryCertSDK", 1));
            put(RecordExtAction.RECORD_FC_ENTER_H5_PAGE, new MetaRecord("UC-RZHY-170118-04", "event", "20000189", "fcEnterH5Page", 1));
            put(RecordExtAction.RECORD_FC_EXIT_H5_PAGE, new MetaRecord("UC-RZHY-170118-05", "event", "20000189", "fcExitH5Page", 1));
            put(RecordExtAction.RECORD_FC_DEVICE_CHECK_START, new MetaRecord("UC-RZHY-170118-07", "event", "20000189", "fcDeviceCheckStart", 1));
            put(RecordExtAction.RECORD_FC_DEVICE_CHECK_END, new MetaRecord("UC-RZHY-170118-08", "event", "20000189", "fcDeviceCheckEnd", 1));
            put(RecordExtAction.RECORD_FC_ALERT_APPEAR, new MetaRecord("UC-RZHY-170118-09", "event", "20000189", "fcAlertAppear", 1));
            put(RecordExtAction.RECORD_FC_ALERT_CHOOSE, new MetaRecord("UC-RZHY-170118-10", "event", "20000189", "fcAlertChoose", 1));
            put(RecordExtAction.RECORD_FC_ENTER_DETECTION_START, new MetaRecord("UC-RZHY-170118-11", "event", "20000189", "fcEnterDetectionStart", 1));
            put(RecordExtAction.RECORD_FC_ENTER_DETECTION_END, new MetaRecord("UC-RZHY-170118-12", "event", "20000189", "fcEnterDetectionEnd", 1));
            put(RecordExtAction.RECORD_FC_CERT_CHECK_START, new MetaRecord("UC-RZHY-170118-13", "event", "20000189", "fcCertCheckStart", 1));
            put(RecordExtAction.RECORD_FC_CERT_CHECK_END, new MetaRecord("UC-RZHY-170118-14", "event", "20000189", "fcCertCheckEnd", 1));
            put(RecordExtAction.RECORD_FC_CLICK_BUTTON, new MetaRecord("UC-RZHY-170118-15", "event", "20000189", "fcClickButton", 1));
            put(RecordExtAction.RECORD_FC_CERT_QUALITY_ALERT_APPEAR, new MetaRecord("UC-RZHY-170118-18", "event", "20000189", "fcCertQualityAlertAppear", 1));
            put(RecordExtAction.RECORD_FC_CERT_QUALITY_ALERT_CHOOSE, new MetaRecord("UC-RZHY-170118-19", "event", "20000189", "fcCertQualityAlertChoose", 1));
            put(RecordExtAction.RECORD_FC_UPLOAD_CERT_AVARRIABLE, new MetaRecord("UC-RZHY-170118-20", "event", "20000189", "fcUploadCertAvailable", 1));
            put(RecordExtAction.RECORD_FC_UPLOAD_CERT_START, new MetaRecord("UC-RZHY-170118-21", "event", "20000189", "fcUploadCertStart", 1));
            put(RecordExtAction.RECORD_FC_UPLOAD_CERT_END, new MetaRecord("UC-RZHY-170118-22", "event", "20000189", "fcUploadCertEnd", 1));
            put(RecordExtAction.RECORD_FC_CERT_GET_SERVER_RESULT, new MetaRecord("UC-RZHY-170118-23", "event", "20000189", "fcCertGetServerResult", 1));
            put(RecordExtAction.RECORD_FC_ENTER_CERT_BACK_FILL, new MetaRecord("UC-RZHY-170118-24", "event", "20000189", "fcEnterCertBackfill", 1));
            put(RecordExtAction.RECORD_FC_EXIT_CERT_BACK_FILL_ERROR, new MetaRecord("UC-RZHY-170118-25", "event", "20000189", "fcExitCertBackfillError", 1));
            put(RecordExtAction.RECORD_FC_EXIT_CERT_BACK_FILL_NORMAL, new MetaRecord("UC-RZHY-170118-26", "event", "20000189", "fcExitCertBackfillNormal", 1));
            put(RecordExtAction.RECORD_FC_CERT_CALL_BACK_BIS_SYSTEM, new MetaRecord("UC-RZHY-170118-27", "event", "20000189", "fcCertCallbackBisSystem", 1));
            put(RecordExtAction.RECORD_FC_EXIT_CERT_SDK, new MetaRecord("UC-RZHY-170118-28", "event", "20000189", "fcExitCertSDK", 1));
            put(RecordExtAction.RECORD_FC_FACE_GET_SERVER_RESULT, new MetaRecord("UC-RZHY-170118-29", "event", "20000189", "fcFaceGetServerResult", 1));
            put(RecordExtAction.RECORD_FC_FACE_CMPR_CERT_START, new MetaRecord("UC-RZHY-170118-30", "event", "20000189", "fcFaceCmprCertStart", 1));
            put(RecordExtAction.RECORD_FC_FACE_CALL_BACK_BIS_SYSTEM, new MetaRecord("UC-RZHY-170118-31", "event", "20000189", "fcFaceCallbackBisSystem", 1));
            put(RecordExtAction.RECORD_FC_CALL_BACK_VERITY_SYSTEM, new MetaRecord("UC-RZHY-170118-32", "event", "20000189", "fcCallbackVeritySystem", 1));
            put(RecordExtAction.RECORD_FC_EXIT_SDK, new MetaRecord("UC-RZHY-170118-33", "event", "20000189", "fcExitSDK", 1));
            put(RecordExtAction.RECORD_HANDLE_PROTOCOL_START, new MetaRecord("UC-RZHY-170118-34", "event", "20000189", "handleProtocolStart", 1));
            put(RecordExtAction.RECORD_HANDLE_PROTOCOL_END, new MetaRecord("UC-RZHY-170118-35", "event", "20000189", "handleProtocolEnd", 1));
            put(RecordExtAction.ALGORITHM_RESULT, new MetaRecord("UC-RZHY-170118-36", "event", "20000189", "algorithmResult", 1));
            put(RecordExtAction.COMPRESS_CERT_START, new MetaRecord("UC-RZHY-170118-37", "event", "20000189", "compressCertStart", 1));
            put(RecordExtAction.COMPRESS_CERT_END, new MetaRecord("UC-RZHY-170118-37", "event", "20000189", "compressCertEnd", 1));
        }
    };

    public static /* synthetic */ Object ipc$super(RecordExtServiceImpl recordExtServiceImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public void write(RecordExtAction recordExtAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed67997", new Object[]{this, recordExtAction});
        } else {
            a(recordExtAction, "", "", null);
        }
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public void write(RecordExtAction recordExtAction, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4210e", new Object[]{this, recordExtAction, map});
        } else {
            a(recordExtAction, "", "", map);
        }
    }

    private void a(RecordExtAction recordExtAction, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef76b8", new Object[]{this, recordExtAction, str, str2, map});
            return;
        }
        MetaRecord metaRecord = this.f5775a.get(recordExtAction);
        metaRecord.setParam2(Integer.toString(this.c));
        metaRecord.setParam3(this.d);
        metaRecord.setParam4(map);
        this.c++;
        BioLog.i("RecordExtService:" + metaRecord.toString());
        this.b.write(metaRecord);
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public String getRetryID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9199bb8c", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public void setRetryID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a13ed2", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public String getUniqueID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4faa1617", new Object[]{this}) : this.b.getUniqueID();
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public void setExtProperty(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba3a4a", new Object[]{this, map});
        } else {
            this.b.setExtProperty(map);
        }
    }

    @Override // com.alipay.mobile.security.bio.common.statistics.RecordExtService
    public void setUniqueID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076073f", new Object[]{this, str});
        } else {
            this.b.setUniqueID(str);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
        } else {
            this.b = (BioRecordService) bioServiceManager.getBioService(BioRecordService.class);
        }
    }
}
