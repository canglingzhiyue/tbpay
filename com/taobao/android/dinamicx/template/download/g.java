package com.taobao.android.dinamicx.template.download;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import tb.fux;
import tb.kge;

/* loaded from: classes5.dex */
public class g implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1954954334);
        kge.a(677664621);
    }

    @Override // com.taobao.android.dinamicx.template.download.h
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str}) : a(str, null, null);
    }

    public byte[] a(String str, String str2, DXTemplateItem dXTemplateItem) {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4669a958", new Object[]{this, str, str2, dXTemplateItem});
        }
        if (StringUtils.isEmpty(str)) {
            fux.a(str + "下载链接为空");
            try {
                s sVar = new s(str2);
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_DOWNLOAD_ERROR_60023);
                aVar.e = "下载链接为空" + str;
                sVar.b = dXTemplateItem;
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
            return null;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        httpURLConnection.disconnect();
                        inputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        bufferedInputStream.close();
                        return byteArray;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    s sVar2 = new s(str2);
                    s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_DOWNLOAD_ERROR_60024);
                    aVar2.e = "url: " + str + " stack: " + com.taobao.android.dinamicx.exception.a.a(e);
                    sVar2.b = dXTemplateItem;
                    sVar2.c.add(aVar2);
                    com.taobao.android.dinamicx.monitor.b.a(sVar2);
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                } catch (Throwable th2) {
                    com.taobao.android.dinamicx.exception.a.b(th2);
                }
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedInputStream = null;
        }
    }
}
