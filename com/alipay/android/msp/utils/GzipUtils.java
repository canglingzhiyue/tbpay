package com.alipay.android.msp.utils;

import com.alipay.android.msp.framework.exception.GzipException;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public class GzipUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] toGzip(byte[] bArr) throws GzipException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d29cafa", new Object[]{bArr});
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read != -1) {
                    gZIPOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LogicUtil.toGzip", "length : " + byteArray.length);
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    gZIPOutputStream.close();
                    return byteArray;
                }
            }
        } catch (IOException e) {
            LogUtil.printExceptionStackTrace(e);
            throw new GzipException("IOException");
        }
    }

    public static byte[] unGZip(byte[] bArr) throws GzipException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8acd083c", new Object[]{bArr});
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr2 = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = gZIPInputStream.read(bArr2, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArray;
                }
            }
        } catch (UnsupportedEncodingException e) {
            LogUtil.printExceptionStackTrace(e);
            throw new GzipException("UnsupportedEncodingException");
        } catch (IOException e2) {
            LogUtil.printExceptionStackTrace(e2);
            throw new GzipException("IOException");
        }
    }
}
