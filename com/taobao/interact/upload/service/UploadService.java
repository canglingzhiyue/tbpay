package com.taobao.interact.upload.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.upload.service.IUploadService;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.upload.FileUploadMgr;
import mtopsdk.mtop.upload.domain.UploadFileInfo;

/* loaded from: classes7.dex */
public class UploadService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UploadCallBack f17624a;
    private List<UploadFileInfo> b = new ArrayList();
    private IUploadService.Stub c = new IUploadService.Stub() { // from class: com.taobao.interact.upload.service.UploadService.1
        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException {
            if (list == null || list.isEmpty()) {
                return;
            }
            UploadService.a(UploadService.this).clear();
            MultiFileUploadAdapter multiFileUploadAdapter = new MultiFileUploadAdapter(UploadService.b(UploadService.this), list);
            for (String str : list) {
                UploadFileInfo uploadFileInfo = new UploadFileInfo();
                uploadFileInfo.setBizCode(mtopInfo.getBizCode());
                uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
                uploadFileInfo.setFilePath(str);
                uploadFileInfo.setListener((mtopsdk.mtop.upload.FileUploadBaseListener) multiFileUploadAdapter);
                UploadService.a(UploadService.this).add(uploadFileInfo);
            }
            FileUploadMgr.getInstance().addTask(UploadService.a(UploadService.this));
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void registerCallback(UploadCallBack uploadCallBack) throws RemoteException {
            UploadService.a(UploadService.this, uploadCallBack);
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException {
            if (list == null || list.isEmpty()) {
                return;
            }
            MultiFileUploadAdapter multiFileUploadAdapter = new MultiFileUploadAdapter(new a(uploadCallBack), list);
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                UploadFileInfo uploadFileInfo = new UploadFileInfo();
                uploadFileInfo.setBizCode(mtopInfo.getBizCode());
                uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
                uploadFileInfo.setFilePath(str);
                uploadFileInfo.setListener((mtopsdk.mtop.upload.FileUploadBaseListener) multiFileUploadAdapter);
                arrayList.add(uploadFileInfo);
            }
            FileUploadMgr.getInstance().addTask(arrayList);
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void cancelAll() throws RemoteException {
            if (UploadService.a(UploadService.this).isEmpty()) {
                return;
            }
            for (UploadFileInfo uploadFileInfo : UploadService.a(UploadService.this)) {
                FileUploadMgr.getInstance().removeTask(uploadFileInfo);
            }
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadFile(String str, MtopInfo mtopInfo, final FileUploadBaseListener fileUploadBaseListener) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            FileUploadListenerAdapter fileUploadListenerAdapter = new FileUploadListenerAdapter(new com.taobao.interact.upload.service.a() { // from class: com.taobao.interact.upload.service.UploadService.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.interact.upload.service.a
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        if (fileUploadBaseListener == null) {
                            return;
                        }
                        fileUploadBaseListener.onStart();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.interact.upload.service.a
                public void a(long j, long j2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
                        return;
                    }
                    try {
                        if (fileUploadBaseListener == null) {
                            return;
                        }
                        fileUploadBaseListener.onProgress(j, j2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.interact.upload.service.a
                public void a(UploadFileInfo uploadFileInfo, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("223811b1", new Object[]{this, uploadFileInfo, str2});
                        return;
                    }
                    FileUploadBaseListener fileUploadBaseListener2 = fileUploadBaseListener;
                    if (fileUploadBaseListener2 == null) {
                        return;
                    }
                    try {
                        fileUploadBaseListener2.onFinish(uploadFileInfo.getFilePath(), str2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.interact.upload.service.a
                public void a(String str2, String str3, String str4) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("929ad046", new Object[]{this, str2, str3, str4});
                        return;
                    }
                    FileUploadBaseListener fileUploadBaseListener2 = fileUploadBaseListener;
                    if (fileUploadBaseListener2 == null) {
                        return;
                    }
                    try {
                        fileUploadBaseListener2.onError(str2, str3, str4);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }, str);
            UploadFileInfo uploadFileInfo = new UploadFileInfo();
            uploadFileInfo.setBizCode(mtopInfo.getBizCode());
            uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
            uploadFileInfo.setFilePath(str);
            FileUploadMgr.getInstance().addTask(uploadFileInfo, (mtopsdk.mtop.upload.FileUploadBaseListener) fileUploadListenerAdapter);
        }
    };
    private c d = new c() { // from class: com.taobao.interact.upload.service.UploadService.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.interact.upload.service.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (UploadService.c(UploadService.this) == null) {
            } else {
                try {
                    UploadService.c(UploadService.this).onStart();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            } else if (UploadService.c(UploadService.this) == null) {
            } else {
                try {
                    UploadService.c(UploadService.this).onProgress(j, j2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(List<UploadFileInfo> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            } else if (UploadService.c(UploadService.this) != null && list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UploadFileInfo uploadFileInfo : list) {
                    arrayList.add(uploadFileInfo.getFilePath());
                }
                try {
                    UploadService.c(UploadService.this).onFinish(arrayList, list2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
            } else if (UploadService.c(UploadService.this) == null) {
            } else {
                try {
                    UploadService.c(UploadService.this).onError(str, str2, list);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public static /* synthetic */ UploadCallBack a(UploadService uploadService, UploadCallBack uploadCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadCallBack) ipChange.ipc$dispatch("2d4b25fd", new Object[]{uploadService, uploadCallBack});
        }
        uploadService.f17624a = uploadCallBack;
        return uploadCallBack;
    }

    public static /* synthetic */ List a(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("60d37c62", new Object[]{uploadService}) : uploadService.b;
    }

    public static /* synthetic */ c b(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6acc7e", new Object[]{uploadService}) : uploadService.d;
    }

    public static /* synthetic */ UploadCallBack c(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UploadCallBack) ipChange.ipc$dispatch("4438f7d0", new Object[]{uploadService}) : uploadService.f17624a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.c;
    }

    /* loaded from: classes7.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private UploadCallBack b;

        public a(UploadCallBack uploadCallBack) {
            this.b = uploadCallBack;
        }

        @Override // com.taobao.interact.upload.service.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            UploadCallBack uploadCallBack = this.b;
            if (uploadCallBack == null) {
                return;
            }
            try {
                uploadCallBack.onStart();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            UploadCallBack uploadCallBack = this.b;
            if (uploadCallBack == null) {
                return;
            }
            try {
                uploadCallBack.onProgress(j, j2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(List<UploadFileInfo> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            } else if (this.b != null && list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UploadFileInfo uploadFileInfo : list) {
                    arrayList.add(uploadFileInfo.getFilePath());
                }
                try {
                    this.b.onFinish(arrayList, list2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.taobao.interact.upload.service.c
        public void a(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
                return;
            }
            UploadCallBack uploadCallBack = this.b;
            if (uploadCallBack == null) {
                return;
            }
            try {
                uploadCallBack.onError(str, str2, list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
