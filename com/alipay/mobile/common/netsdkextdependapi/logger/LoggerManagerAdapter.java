package com.alipay.mobile.common.netsdkextdependapi.logger;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoggerManagerAdapter implements LoggerManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void printInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94d816", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
        } else {
            Log.e(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
        } else {
            Log.e(str, "", th);
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
    public void printError(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6fc9", new Object[]{this, str, th});
        } else {
            Log.e(str, "", th);
        }
    }
}
