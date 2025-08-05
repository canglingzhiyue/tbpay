package com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat;

import android.os.Process;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AndroidSCLogCatImpl implements SCLogCatInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
        } else {
            a();
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void printInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94d816", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void printError(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6fc9", new Object[]{this, str, th});
        } else {
            a();
        }
    }

    private static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return " [" + Process.myPid() + ":" + Thread.currentThread().getId() + "] ";
    }
}
