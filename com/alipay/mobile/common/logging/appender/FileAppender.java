package com.alipay.mobile.common.logging.appender;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.HybridEncryption;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public abstract class FileAppender extends Appender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    public abstract File c();

    public abstract File d();

    public FileAppender(LogContext logContext, String str) {
        super(logContext, str);
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            LogEncryptClient logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient();
            if (logEncryptClient != null) {
                String[] split = str.split("\\$\\$");
                int length = split.length;
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < length; i++) {
                    String encrypt = logEncryptClient.encrypt(split[i]);
                    if (!StringUtils.isEmpty(encrypt)) {
                        stringBuffer.append("1_");
                        stringBuffer.append(encrypt);
                        stringBuffer.append("$$");
                    } else {
                        stringBuffer.append(split[i]);
                        stringBuffer.append("$$");
                    }
                }
                return a(stringBuffer.toString());
            }
            return a(str);
        }
        return a(str);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            File c = c();
            if (c != null) {
                FileUtil.writeFile(c, str, true);
            }
            return true;
        } catch (Throwable unused) {
            if (!this.r) {
                this.r = true;
            }
            return false;
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized boolean a(byte[] bArr, int i) {
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2713f1b8", new Object[]{this, bArr, new Integer(i)})).booleanValue();
        }
        DataOutputStream dataOutputStream2 = null;
        byte[] gzipDataByBytes = LoggingUtil.gzipDataByBytes(bArr, 0, i);
        if (gzipDataByBytes == null) {
            return false;
        }
        byte[] encrypt = HybridEncryption.getInstance().encrypt(gzipDataByBytes, 0, gzipDataByBytes.length);
        byte[] secureSeed = HybridEncryption.getInstance().getSecureSeed();
        if (encrypt != null && secureSeed != null) {
            if (secureSeed.length > 32767) {
                new StringBuilder("the length of secure seed is too long: ").append(secureSeed.length);
                return false;
            }
            File c = c();
            try {
                if (!c.getParentFile().exists()) {
                    c.getParentFile().mkdirs();
                }
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(c, true)));
            } catch (Throwable unused) {
            }
            try {
                dataOutputStream.writeInt(encrypt.length);
                dataOutputStream.writeShort((short) secureSeed.length);
                dataOutputStream.write(secureSeed);
                dataOutputStream.write(encrypt);
                dataOutputStream.flush();
                try {
                    dataOutputStream.close();
                } catch (Throwable unused2) {
                }
                return true;
            } catch (Throwable unused3) {
                dataOutputStream2 = dataOutputStream;
                if (!this.u) {
                    this.u = true;
                }
                if (dataOutputStream2 != null) {
                    try {
                        dataOutputStream2.close();
                    } catch (Throwable unused4) {
                    }
                }
                return false;
            }
        }
        if (!this.t) {
            this.t = true;
        }
        return false;
    }
}
