package com.alipay.zoloz.toyger.extservice.record;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.rrv;

/* loaded from: classes3.dex */
public class ToygerRecordService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALERT_APPEAR = "AlertAppear";
    public static final String ALERT_CHOOSE = "AlertChoose";
    public static final String CALLBACK_VERIFY_SYSTEM = "callbackVerifySystem";
    public static final String CLICK_BUTTON = "clickButton";
    public static final String CLICK_START_CAPTURE = "clickStartCapture";
    public static final String CUT_NANO_END = "cutNanoImgEnd";
    public static final String DETECT_COND_END = "detectCondEnd";
    public static final String DETECT_COND_START = "detectCondStart";
    public static final String DEV_TECH_SEED = "fromH5";
    public static final String ENTER_DETECTION_END = "EnterDetectionEnd";
    public static final String ENTER_DETECTION_START = "EnterDetectionStart";
    public static final String ENTER_GUIDE_PAGE = "enterGuidePage";
    public static final String ENTRY_SDK = "entrySDK";
    public static final String EXIT_GUIDE_PAGE = "exitGuidePage";
    public static final String EXIT_SDK = "exitSDK";
    public static final String FACE_DETECT_END = "faceImageDetectEnd";
    public static final String FACE_REDETECT_END = "keyPointsReCheckEnd";
    public static final String FACE_REDETECT_START = "keyPointsReCheckStart";
    public static final String FACE_SLICE = "faceSlice";
    public static final String IMAGE_CAPTURE_END = "imageCaptureEnd";
    public static final String IMAGE_CAPTURE_START = "imageCaptureStart";
    public static final String LIVEBODY_END = "livebodyEnd";
    public static final String LIVEBODY_START = "livebodyStart";
    public static final String LOAD_DETECT_GRAY_MODEL = "loadDetectGrayModel";
    public static final String LOAD_LIVEBODY_GRAY_MODEL = "loadLivebodyGrayModel";
    public static final String NOTICE_EXIT_SDK = "noticeExitSDK";
    public static final String PHOTINUS_CAMERA_PARAMETER_PROBED = "photinusCameraParameterProbed";
    public static final String PHOTINUS_ENCODER_ERROR = "photinusEncoderError";
    public static final String PHOTINUS_END = "photinusEnd";
    public static final String PHOTINUS_HAS_ENOUGH_FRAMES = "photinusHasEnoughFrames";
    public static final String PHOTINUS_INIT_ERROR = "photinusInitError";
    public static final String PHOTINUS_METADATA_UPLOAD_END = "photinusMetadataUploadEnd";
    public static final String PHOTINUS_METADATA_UPLOAD_START = "photinusMetadataUploadStart";
    public static final String PHOTINUS_PROBE_ERROR = "photinusProbeError";
    public static final String PHOTINUS_SKIP = "photinusSkip";
    public static final String PHOTINUS_START = "photinusStart";
    public static final String PHOTINUS_UPLOAD_ERROR = "photinusUploadError";
    public static final String PHOTINUS_VIDEO_ENCODED = "photinusVideoEncoded";
    public static final String PHOTINUS_VIDEO_UPLOAD_END = "photinusVideoUploadEnd";
    public static final String PHOTINUS_VIDEO_UPLOAD_START = "photinusVideoUploadStart";
    public static final String PROCESS_IMAGE_START = "processImageStart";
    public static final String PROMPT_COPY_POINT = "actionPrompt";
    public static final String RAW_CAMERA_FRAME = "rawCameraFrame";
    public static final String SHOW_FACE_ALPHA_END = "showFaceAlphaEnd";
    public static final String TOYGER_CONFIG_END = "toygerConfigEnd";
    public static final String TOYGER_CONFIG_START = "toygerConfigStart";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, MetaRecord> f6276a;
    private ZimRecordService b;

    public static /* synthetic */ Object ipc$super(ToygerRecordService toygerRecordService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 548948747) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        super.onCreate(bioServiceManager);
        this.f6276a = new HashMap<>();
        this.f6276a.put(ENTRY_SDK, new MetaRecord("UC-YWRLSB-161114-01", "event", "20000189", ENTRY_SDK, 1));
        this.f6276a.put(ENTER_GUIDE_PAGE, new MetaRecord("UC-YWRLSB-161114-02", "event", "20000189", ENTER_GUIDE_PAGE, 1));
        this.f6276a.put(EXIT_GUIDE_PAGE, new MetaRecord("UC-YWRLSB-161114-03", "event", "20000189", EXIT_GUIDE_PAGE, 1));
        this.f6276a.put(DEV_TECH_SEED, new MetaRecord("UC-YWRLSB-161114-03", "event", "20000189", DEV_TECH_SEED, 1));
        this.f6276a.put(CLICK_START_CAPTURE, new MetaRecord("UC-YWRLSB-161114-04", "event", "20000189", CLICK_START_CAPTURE, 1));
        this.f6276a.put(ENTER_DETECTION_START, new MetaRecord("UC-YWRLSB-161114-07", BehavorID.OPENPAGE, "20000189", "enterDetectionStart", 1));
        this.f6276a.put(ENTER_DETECTION_END, new MetaRecord("UC-YWRLSB-161114-08", "event", "20000189", "enterDetectionEnd", 1));
        this.f6276a.put(DETECT_COND_START, new MetaRecord("UC-YWRLSB-161114-09", "event", "20000189", DETECT_COND_START, 1));
        this.f6276a.put(DETECT_COND_END, new MetaRecord("UC-YWRLSB-161114-10", "event", "20000189", DETECT_COND_END, 1));
        this.f6276a.put("actionPrompt", new MetaRecord("UC-YWRLSB-161114-17", "event", "20000189", "actionPrompt", 3, "2"));
        this.f6276a.put(FACE_SLICE, new MetaRecord("UC-YWRLSB-161114-18", "event", "20000189", FACE_SLICE, 1, "2"));
        this.f6276a.put(ALERT_APPEAR, new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", rrv.ALERT_APPEAR, 1));
        this.f6276a.put(ALERT_CHOOSE, new MetaRecord("UC-YWRLSB-161114-22", "event", "20000189", rrv.ALERT_CHOOSE, 1));
        this.f6276a.put(CALLBACK_VERIFY_SYSTEM, new MetaRecord("UC-YWRLSB-161114-23", "event", "20000189", CALLBACK_VERIFY_SYSTEM, 1));
        this.f6276a.put(NOTICE_EXIT_SDK, new MetaRecord("UC-YWRLSB-161114-26", "event", "20000189", NOTICE_EXIT_SDK, 1));
        this.f6276a.put(EXIT_SDK, new MetaRecord("UC-YWRLSB-161114-24", "event", "20000189", EXIT_SDK, 1));
        this.f6276a.put(IMAGE_CAPTURE_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", IMAGE_CAPTURE_START, 1));
        this.f6276a.put(IMAGE_CAPTURE_END, new MetaRecord("UC-YWRLSB-161114-31", "event", "20000189", IMAGE_CAPTURE_END, 1));
        this.f6276a.put("clickButton", new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", "clickButton", 1));
        this.f6276a.put(FACE_DETECT_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", FACE_DETECT_END, 1));
        this.f6276a.put(LIVEBODY_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", LIVEBODY_END, 1));
        this.f6276a.put(CUT_NANO_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", CUT_NANO_END, 1));
        this.f6276a.put(FACE_REDETECT_START, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", FACE_REDETECT_START, 1));
        this.f6276a.put(FACE_REDETECT_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", FACE_REDETECT_END, 1));
        this.f6276a.put(SHOW_FACE_ALPHA_END, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", SHOW_FACE_ALPHA_END, 1));
        this.f6276a.put(RAW_CAMERA_FRAME, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", RAW_CAMERA_FRAME, 1));
        this.f6276a.put(PROCESS_IMAGE_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PROCESS_IMAGE_START, 1));
        this.f6276a.put(TOYGER_CONFIG_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", TOYGER_CONFIG_START, 1));
        this.f6276a.put(TOYGER_CONFIG_END, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", TOYGER_CONFIG_END, 1));
        this.f6276a.put(LIVEBODY_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", LIVEBODY_START, 1));
        this.f6276a.put(LOAD_DETECT_GRAY_MODEL, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", LOAD_DETECT_GRAY_MODEL, 1));
        this.f6276a.put(LOAD_LIVEBODY_GRAY_MODEL, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", LOAD_LIVEBODY_GRAY_MODEL, 1));
        this.f6276a.put(PHOTINUS_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_START, 1));
        this.f6276a.put(PHOTINUS_HAS_ENOUGH_FRAMES, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_HAS_ENOUGH_FRAMES, 1));
        this.f6276a.put(PHOTINUS_CAMERA_PARAMETER_PROBED, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_CAMERA_PARAMETER_PROBED, 1));
        this.f6276a.put(PHOTINUS_VIDEO_ENCODED, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_VIDEO_ENCODED, 1));
        this.f6276a.put(PHOTINUS_VIDEO_UPLOAD_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_VIDEO_UPLOAD_START, 1));
        this.f6276a.put(PHOTINUS_METADATA_UPLOAD_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_METADATA_UPLOAD_START, 1));
        this.f6276a.put(PHOTINUS_METADATA_UPLOAD_END, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_METADATA_UPLOAD_END, 1));
        this.f6276a.put(PHOTINUS_VIDEO_UPLOAD_END, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_VIDEO_UPLOAD_END, 1));
        this.f6276a.put(PHOTINUS_INIT_ERROR, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_INIT_ERROR, 1));
        this.f6276a.put(PHOTINUS_UPLOAD_ERROR, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_UPLOAD_ERROR, 1));
        this.f6276a.put(PHOTINUS_PROBE_ERROR, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_PROBE_ERROR, 1));
        this.f6276a.put(PHOTINUS_ENCODER_ERROR, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_ENCODER_ERROR, 1));
        this.f6276a.put(PHOTINUS_SKIP, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_SKIP, 1));
        this.f6276a.put(PHOTINUS_END, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", PHOTINUS_END, 1));
        this.b = (ZimRecordService) bioServiceManager.getBioService(ZimRecordService.class);
    }

    public void write(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
        } else {
            write(str, null);
        }
    }

    public void addExtProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6781de2b", new Object[]{this, map});
        } else {
            this.b.addExtProperties(map);
        }
    }

    public void write(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a88455", new Object[]{this, str, map});
        } else {
            this.b.write(this.f6276a.get(str), map);
        }
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            this.b.retry();
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
