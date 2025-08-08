package com.taobao.login4android.qrcode.data;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class QrCodeData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long QR_CODE_QUERY_INTERVAL = 2000;
    public static final long QR_CODE_VALID_PERIOD = 900000;
    public String qrCode;
    public String qrCodeImgUrl;
    public String qrCodeUrl;
    public int cycleSecs = 2000;
    private long mValidPeriod = QR_CODE_VALID_PERIOD;
    private long mCreateTime = SystemClock.elapsedRealtime();

    static {
        kge.a(-1532883814);
        kge.a(1028243835);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.qrCode) && !StringUtils.isEmpty(this.qrCodeUrl) && SystemClock.elapsedRealtime() - this.mCreateTime <= this.mValidPeriod;
    }
}
