package mtopsdk.security.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.kge;

/* loaded from: classes.dex */
public class SignStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile IUploadStats f25025a;
    private static volatile AtomicBoolean b;

    /* loaded from: classes9.dex */
    public interface SignStatsType {
        public static final String TYPE_AVMP_INSTANCE = "AVMPInstance";
        public static final String TYPE_GET_APPKEY = "GetAppKey";
        public static final String TYPE_GET_SECBODY = "GetSecBody";
        public static final String TYPE_INIT_UMID = "InitUMID";
        public static final String TYPE_INVOKE_AVMP = "InvokeAVMP";
        public static final String TYPE_SG_MANAGER = "SGManager";
        public static final String TYPE_SIGN_HMAC_SHA1 = "SignHMACSHA1";
        public static final String TYPE_SIGN_MTOP_REQUEST = "SignMtopRequest";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(1131067067);
        f25025a = null;
        b = new AtomicBoolean(false);
    }

    public static void a(IUploadStats iUploadStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b551b1", new Object[]{iUploadStats});
            return;
        }
        f25025a = iUploadStats;
        TBSdkLog.i("mtopsdk.SignStatistics", "set IUploadStats =" + iUploadStats);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("type");
        hashSet.add("errorcode");
        hashSet.add("flag");
        if (f25025a == null) {
            return;
        }
        f25025a.onRegister(UploadConstants.UPLOAD_MODULE, "signException", hashSet, null, false);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (f25025a == null) {
        } else {
            if (b.compareAndSet(false, true)) {
                a();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("errorcode", str2);
            hashMap.put("flag", str3);
            if (f25025a == null) {
                return;
            }
            f25025a.onCommit(UploadConstants.UPLOAD_MODULE, "signException", hashMap, null);
        }
    }
}
