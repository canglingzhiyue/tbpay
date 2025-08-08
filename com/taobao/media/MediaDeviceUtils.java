package com.taobao.media;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.b;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaDeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile int mCoreNums;
    private static volatile float mMaxCpuFreq;

    static {
        kge.a(-354460075);
        mCoreNums = 0;
        mMaxCpuFreq = 0.0f;
    }

    public static boolean isSupportH265(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2050e03", new Object[]{str})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            float parseFloat = Float.parseFloat(str);
            if (parseFloat < 1.2f) {
                parseFloat = 1.8f;
            }
            return isCoreNumOrCpuMaxFreqEnough(6, parseFloat);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isCoreNumOrCpuMaxFreqEnough(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8559646c", new Object[]{new Integer(i), new Float(f)})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                if (mCoreNums == 0) {
                    mCoreNums = b.b();
                }
                if (mCoreNums >= i) {
                    return true;
                }
                if (Math.abs(mMaxCpuFreq) < 1.0E-6d) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= mCoreNums) {
                            break;
                        }
                        float d = b.d(b.a(i2)) / 1000000.0f;
                        if (d > f) {
                            mMaxCpuFreq = d;
                            break;
                        }
                        mMaxCpuFreq = 0.0f > mMaxCpuFreq ? 0.0f : mMaxCpuFreq;
                        i2++;
                    }
                }
                if (mCoreNums >= 4) {
                    if (mMaxCpuFreq <= f) {
                        if (Math.abs(mMaxCpuFreq - f) < 1.0E-6d) {
                        }
                    }
                    return true;
                }
                return false;
            }
        } catch (Throwable unused) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "judge isCoreNumOrCpuMaxFreqEnough failed.");
        }
        return false;
    }
}
