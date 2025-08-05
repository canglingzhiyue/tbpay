package com.taobao.interact.upload.service;

import android.os.RemoteException;
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.UploadCallBack;
import java.util.List;

/* loaded from: classes7.dex */
public interface b {
    void a(String str, MtopInfo mtopInfo, FileUploadBaseListener.Stub stub) throws RemoteException;

    void a(List<String> list, MtopInfo mtopInfo, UploadCallBack.Stub stub) throws RemoteException;
}
