package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.util.a;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class oxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tb.oxw$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32474a = new int[MaType.values().length];

        static {
            try {
                f32474a[MaType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32474a[MaType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32474a[MaType.GEN3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-271379322);
    }

    public static void a(Activity activity, String str, ScancodeResult scancodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc5244e", new Object[]{activity, str, scancodeResult});
        } else if (activity == null || scancodeResult == null || TextUtils.isEmpty(str)) {
        } else {
            Intent intent = new Intent(str);
            intent.putExtra(a.GATEWAY_CALLBACK_RESULT_PARAM, scancodeResult);
            if (activity == null) {
                return;
            }
            activity.sendBroadcast(intent);
        }
    }

    public static void a(Object obj, String str, MaType maType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b56a6f", new Object[]{obj, str, maType});
            return;
        }
        HashMap hashMap = new HashMap();
        if (maType == null) {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "");
            oxy.a(obj, hashMap);
            return;
        }
        int i = AnonymousClass1.f32474a[maType.ordinal()];
        if (i == 1) {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "GoodsBarcode");
            oxy.a(obj, hashMap);
        } else if (i != 2) {
            if (i == 3) {
                hashMap.put(SessionConstants.ECODE, str);
                hashMap.put("codetype", "QR_CODE");
                oxy.a(obj, hashMap);
                return;
            }
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "");
            oxy.a(obj, hashMap);
        } else if (str.contains("ma.taobao.com") || str.contains("tb.cn") || str.contains("ma.m.taobao.com")) {
            hashMap.put("mecode", str);
            hashMap.put("codetype", "QR_CODE");
            oxy.a(obj, hashMap);
        } else {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "QR_CODE");
            oxy.a(obj, hashMap);
        }
    }
}
