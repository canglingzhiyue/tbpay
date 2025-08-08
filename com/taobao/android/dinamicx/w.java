package com.taobao.android.dinamicx;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.util.List;

/* loaded from: classes.dex */
public class w implements com.taobao.android.dinamicx.template.download.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_REQUEST_FORBIDDEN_IN_BG = -205;

    @Override // com.taobao.android.dinamicx.template.download.h
    public byte[] a(String str) {
        s.a aVar;
        List<s.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
        Response syncSend = new DegradableNetwork(null).syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            return syncSend.getBytedata();
        }
        try {
            s sVar = new s("DinamicX");
            if (syncSend.getStatusCode() == -205) {
                aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_DOWNLOAD_ERROR_60029);
                StringBuilder sb = new StringBuilder();
                sb.append("下载链接  " + str);
                sb.append("\n responseErrorCode: ");
                sb.append(syncSend.getStatusCode());
                sb.append("\n trace: ");
                sb.append(com.taobao.android.dinamicx.exception.a.a(syncSend.getError()));
                sb.append("desc");
                sb.append(syncSend.getDesc());
                aVar.e = sb.toString();
                list = sVar.c;
            } else if (StringUtils.isEmpty(str)) {
                aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_DOWNLOAD_ERROR_60023);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("下载链接为空" + str);
                sb2.append("\n responseErrorCode: ");
                sb2.append(syncSend.getStatusCode());
                sb2.append("\n trace: ");
                sb2.append(com.taobao.android.dinamicx.exception.a.a(syncSend.getError()));
                aVar.e = sb2.toString();
                list = sVar.c;
            } else {
                aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_DOWNLOAD_ERROR_60024);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("下载链接  " + str);
                sb3.append("\n responseErrorCode: ");
                sb3.append(syncSend.getStatusCode());
                sb3.append("\n trace: ");
                sb3.append(com.taobao.android.dinamicx.exception.a.a(syncSend.getError()));
                sb3.append("desc");
                sb3.append(syncSend.getDesc());
                aVar.e = sb3.toString();
                list = sVar.c;
            }
            list.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
        return null;
    }
}
