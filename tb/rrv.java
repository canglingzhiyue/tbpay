package tb;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rrv extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_PROMPT = "actionPrompt";
    public static final String ACTIVE_EXIT = "active_exit";
    public static final String ALERT_APPEAR = "alertAppear";
    public static final String ALERT_CHOOSE = "alertChoose";
    public static final String APDIDTOKEN = "apdidToken";
    public static final String AUTH_CHECK = "authCheck";
    public static final String AUTH_CHECK_RESULT = "authCheckResult";
    public static final String BACKSTAGE_INTERRUPT = "backstage_interrupt";
    public static final String BASIC_CHECK = "basicCheck";
    public static final String BISTOKEN = "bisToken";
    public static final String CAMERA_ERROR = "camera_error";
    public static final String CAPTURE_MODE = "captureMode";
    public static final String CAPTURE_RESULT = "captureResult";
    public static final String CLICK_ALERT = "clickAlert";
    public static final String CLICK_BUTTON = "clickButton";
    public static final String CLICK_ITEM = "clickItem";
    public static final String COMPRESS_RESULT = "compressResult";
    public static final String DEVICE_BRAND = "deviceBrand";
    public static final String DOC_COPY = "doc_copyreject";
    public static final String DOC_INCOMPLETE = "doc_incomplete";
    public static final String DOC_NO_DETECT = "doc_nodetect";
    public static final String DOC_REFLECTION = "doc_reflection";
    public static final String DOC_TYPE = "docType";
    public static final String DOC_VAGUE = "doc_vague";
    public static final String END_SCAN = "endScan";
    public static final String END_ZDOC = "endZdoc";
    public static final String FRAME_SIZE_WH = "ztech_zdoc_frame_size";
    public static final String GO_BACK = "go_back";
    public static final String MAX_PAGE = "maxPage";
    public static final String NETWORK_ERROR = "network_error";
    public static final String ON_PAGE = "onPage";
    public static final String OVERTIME_ERROR = "overtime_error";
    public static final String OVERTIME_REASON = "overtimeReason";
    public static final String OVER_THRESHOLD = "overThreshold";
    public static final String OVER_THRESHOLD_ERROR = "overthreshold_error";
    public static final String OVER_TIME = "overtime";
    public static final String PAGE_CONTENT = "pageContent";
    public static final String PAGE_NUMBER = "pageNumber";
    public static final String PARAMES = "params";
    public static final String PHOTO_CANCEL = "photo_cancel";
    public static final String PHOTO_CANCEL_SCAN = "retake";
    public static final String PHOTO_CONFIRM = "photo_confirm";
    public static final String PHOTO_CONFIRM_SCAN = "confirm";
    public static final String POST_COMPRESS_SIZE = "postCompressSize";
    public static final String PRE_COMPRESS_SIZE = "preCompressSize";
    public static final String PRODUCT_ID = "productId";
    public static final String REASON = "reason";
    public static final String RPC_RESULT_CODE = "rpcResultCode";
    public static final String SCAN_OVER_TIME = "scan_overtime";
    public static final String SCAN_RESULT = "scanResult";
    public static final String SCENCE_ID = "sceneId";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String SERVER_QUALITY_ERROR = "serverQuality_error";
    public static final String SERVER_RESULT = "serverResult";
    public static final String START_SCAN = "startScan";
    public static final String START_ZDOC = "startZdoc";
    public static final String SYSTEM_EXCEPTION_ERROR = "systemException_error";
    public static final String TAKE_PHOTO = "take_photo";
    public static final String TECH_SEED = "techSeed";
    public static final String UPLOAD_END = "uploadEnd";
    public static final String UPLOAD_RESULT = "uploadResult";
    public static final String UPLOAD_START = "uploadStart";
    public static final String UPLOAD_TIME = "uploadTime";
    public static final String VALIDATION_RESULT = "validationResult";
    public static final String ZDOC_RESULT = "zdocResult";
    public static final String ZDOC_SCAN_ALGO_RESULT = "aggAlgoResult";
    public static final String ZDOC_SCAN_OVER_TIME = "overTme";
    public static final String ZDOC_SCAN_TASK_END = "endScanTask";
    public static final String ZDOC_SCAN_TASK_START = "startScanTask";
    public static final String ZTECH_ENTER = "ztech_enter";
    public static final String ZTECH_EXIT = "ztech_exit";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, MetaRecord> f33343a;
    private ZimRecordService b;

    static {
        kge.a(820067991);
    }

    public static /* synthetic */ Object ipc$super(rrv rrvVar, String str, Object... objArr) {
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
        this.f33343a = new HashMap<>();
        this.f33343a.put(START_ZDOC, new MetaRecord("UC-YWRLSB-161114-01", "event", "20000189", START_ZDOC, 1));
        this.f33343a.put(CAPTURE_MODE, new MetaRecord("UC-YWRLSB-161114-02", "event", "20000189", CAPTURE_MODE, 1));
        this.f33343a.put(AUTH_CHECK, new MetaRecord("UC-YWRLSB-161114-03", "event", "20000189", AUTH_CHECK, 1));
        this.f33343a.put(START_SCAN, new MetaRecord("UC-YWRLSB-161114-04", "event", "20000189", START_SCAN, 1));
        this.f33343a.put(BASIC_CHECK, new MetaRecord("UC-YWRLSB-161114-05", "event", "20000189", BASIC_CHECK, 1));
        this.f33343a.put(OVER_TIME, new MetaRecord("UC-YWRLSB-161114-06", "event", "20000189", OVER_TIME, 1));
        this.f33343a.put(OVER_THRESHOLD, new MetaRecord("UC-YWRLSB-161114-07", "event", "20000189", OVER_THRESHOLD, 1));
        this.f33343a.put(COMPRESS_RESULT, new MetaRecord("UC-YWRLSB-161114-08", "event", "20000189", COMPRESS_RESULT, 1));
        this.f33343a.put("uploadStart", new MetaRecord("UC-YWRLSB-161114-09", BehavorID.OPENPAGE, "20000189", "uploadStart", 1));
        this.f33343a.put(UPLOAD_END, new MetaRecord("UC-YWRLSB-161114-10", "event", "20000189", UPLOAD_END, 1));
        this.f33343a.put(END_ZDOC, new MetaRecord("UC-YWRLSB-161114-11", "event", "20000189", END_ZDOC, 1));
        this.f33343a.put("clickButton", new MetaRecord("UC-YWRLSB-161114-12", "event", "20000189", "clickButton", 1));
        this.f33343a.put(ALERT_APPEAR, new MetaRecord("UC-YWRLSB-161114-13", "event", "20000189", ALERT_APPEAR, 1));
        this.f33343a.put(ALERT_CHOOSE, new MetaRecord("UC-YWRLSB-161114-14", "event", "20000189", ALERT_CHOOSE, 1));
        this.f33343a.put("actionPrompt", new MetaRecord("UC-YWRLSB-161114-15", "event", "20000189", "actionPrompt", 1));
        this.f33343a.put(END_SCAN, new MetaRecord("UC-YWRLSB-161114-16", "event", "20000189", END_SCAN, 1));
        this.f33343a.put(TECH_SEED, new MetaRecord("UC-YWRLSB-161114-17", "event", "20000189", TECH_SEED, 1));
        this.f33343a.put(FRAME_SIZE_WH, new MetaRecord("UC-YWRLSB-161114-19", "event", "20000189", FRAME_SIZE_WH, 1));
        this.f33343a.put(ZTECH_ENTER, new MetaRecord("UC-YWRLSB-161114-20", "event", "20000189", ZTECH_ENTER, 1));
        this.f33343a.put(ZTECH_EXIT, new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", ZTECH_EXIT, 1));
        this.f33343a.put(ZDOC_SCAN_TASK_START, new MetaRecord("UC-YWRLSB-161114-22", "event", "20000189", ZDOC_SCAN_TASK_START, 1));
        this.f33343a.put(ZDOC_SCAN_TASK_END, new MetaRecord("UC-YWRLSB-161114-23", "event", "20000189", ZDOC_SCAN_TASK_END, 1));
        this.f33343a.put(ZDOC_SCAN_ALGO_RESULT, new MetaRecord("UC-YWRLSB-161114-24", "event", "20000189", ZDOC_SCAN_ALGO_RESULT, 1));
        this.f33343a.put(ZDOC_SCAN_OVER_TIME, new MetaRecord("UC-YWRLSB-161114-25", "event", "20000189", ZDOC_SCAN_OVER_TIME, 1));
        this.b = (ZimRecordService) bioServiceManager.getBioService(ZimRecordService.class);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, null);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b.addExtProperties(map);
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            this.b.write(this.f33343a.get(str), map);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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
