package mtopsdk.mtop.upload;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.util.FileUploadThreadPoolExecutorFactory;
import tb.kge;
import tb.rpb;
import tb.rpe;
import tb.rpf;

/* loaded from: classes9.dex */
public class FileUploadMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUploadMgr";
    private ConcurrentHashMap<UploadFileInfo, Pair<DefaultFileUploadListenerWrapper, i>> uploadTasks;
    private g uploaderManager;

    /* loaded from: classes9.dex */
    public static class FileUploadMgrHolder {
        public static final FileUploadMgr instance;

        static {
            kge.a(814104986);
            instance = new FileUploadMgr();
        }

        private FileUploadMgrHolder() {
        }
    }

    static {
        kge.a(2109471255);
    }

    public static /* synthetic */ ConcurrentHashMap access$100(FileUploadMgr fileUploadMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("e944bd54", new Object[]{fileUploadMgr}) : fileUploadMgr.uploadTasks;
    }

    public static /* synthetic */ g access$200(FileUploadMgr fileUploadMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("46ddde03", new Object[]{fileUploadMgr}) : fileUploadMgr.uploaderManager;
    }

    private FileUploadMgr() {
        this.uploaderManager = null;
        if (this.uploadTasks == null) {
            this.uploadTasks = new ConcurrentHashMap<>();
        }
        if (this.uploaderManager == null) {
            try {
                Context globalContext = SDKConfig.getInstance().getGlobalContext();
                this.uploaderManager = l.a();
                if (this.uploaderManager.isInitialized()) {
                    return;
                }
                rpe rpeVar = new rpe();
                rpeVar.a(RemoteConfig.getInstance().enableArupTlog);
                this.uploaderManager.initialize(globalContext, new rpb(globalContext, new UploaderEnvironmentAdapter(globalContext), rpeVar, new rpf()));
            } catch (Exception e) {
                TBSdkLog.e(TAG, "init IUploaderMananger error.", e);
            }
        }
    }

    public static final FileUploadMgr getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileUploadMgr) ipChange.ipc$dispatch("c61b600c", new Object[0]) : FileUploadMgrHolder.instance;
    }

    @Deprecated
    public void addTask(UploadFileInfo uploadFileInfo, FileUploadListener fileUploadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ae151c", new Object[]{this, uploadFileInfo, fileUploadListener});
        } else if (fileUploadListener == null) {
            TBSdkLog.e(TAG, "add upload task failed,listener is invalid");
        } else {
            addTask(uploadFileInfo, (FileUploadBaseListener) new DefaultFileUploadListener(fileUploadListener));
        }
    }

    public void addTask(final UploadFileInfo uploadFileInfo, FileUploadBaseListener fileUploadBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2084f58b", new Object[]{this, uploadFileInfo, fileUploadBaseListener});
        } else if (fileUploadBaseListener == null) {
            TBSdkLog.e(TAG, "add upload task failed,listener is invalid");
        } else if (uploadFileInfo == null || !uploadFileInfo.isValid()) {
            TBSdkLog.e(TAG, "add upload task failed,fileInfo is invalid");
            fileUploadBaseListener.onError(UploadConstants.ERRTYPE_ILLEGAL_FILE_ERROR, UploadConstants.ERRCODE_FILE_INVALID, UploadConstants.ERRMSG_FILE_INVALID);
        } else {
            DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper = new DefaultFileUploadListenerWrapper(fileUploadBaseListener);
            if (RemoteConfig.getInstance().degradeBizcodeSets.contains(uploadFileInfo.getBizCode())) {
                if (this.uploadTasks.containsKey(uploadFileInfo)) {
                    return;
                }
                this.uploadTasks.put(uploadFileInfo, new Pair<>(defaultFileUploadListenerWrapper, null));
                FileUploadThreadPoolExecutorFactory.submitUploadTask(new FileUploadTask(uploadFileInfo, defaultFileUploadListenerWrapper));
                return;
            }
            i iVar = new i() { // from class: mtopsdk.mtop.upload.FileUploadMgr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uploader.export.i
                public String getFileType() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.uploader.export.i
                public Map<String, String> getMetaInfo() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.uploader.export.i
                public String getBizType() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : uploadFileInfo.getBizCode();
                }

                @Override // com.uploader.export.i
                public String getFilePath() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : uploadFileInfo.getFilePath();
                }
            };
            if (this.uploadTasks.containsKey(uploadFileInfo)) {
                return;
            }
            this.uploadTasks.put(uploadFileInfo, new Pair<>(defaultFileUploadListenerWrapper, iVar));
            this.uploaderManager.uploadAsync(iVar, new TaskListenerAdapter(uploadFileInfo, defaultFileUploadListenerWrapper), null);
        }
    }

    @Deprecated
    public void addTask(UploadFileInfo uploadFileInfo, FileUploadBaseListener fileUploadBaseListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a6ea9", new Object[]{this, uploadFileInfo, fileUploadBaseListener, new Boolean(z)});
        } else {
            addTask(uploadFileInfo, fileUploadBaseListener);
        }
    }

    public void addTask(List<UploadFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d96e3e", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
            TBSdkLog.e(TAG, "add upload task failed,fileInfoList is invalid");
        } else {
            for (UploadFileInfo uploadFileInfo : list) {
                if (uploadFileInfo != null) {
                    addTask(uploadFileInfo, uploadFileInfo.getListener());
                }
            }
        }
    }

    public void removeTask(final UploadFileInfo uploadFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9badf", new Object[]{this, uploadFileInfo});
            return;
        }
        try {
            FileUploadThreadPoolExecutorFactory.submitRemoveTask(new Runnable() { // from class: mtopsdk.mtop.upload.FileUploadMgr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UploadFileInfo uploadFileInfo2 = uploadFileInfo;
                    if (uploadFileInfo2 == null || !uploadFileInfo2.isValid()) {
                        TBSdkLog.e(FileUploadMgr.TAG, "remove upload task failed,fileInfo is invalid");
                    } else if (!FileUploadMgr.access$100(FileUploadMgr.this).containsKey(uploadFileInfo)) {
                    } else {
                        Pair pair = (Pair) FileUploadMgr.access$100(FileUploadMgr.this).get(uploadFileInfo);
                        ((DefaultFileUploadListenerWrapper) pair.first).cancel();
                        FileUploadMgr.access$100(FileUploadMgr.this).remove(uploadFileInfo);
                        i iVar = (i) pair.second;
                        if (iVar != null) {
                            FileUploadMgr.access$200(FileUploadMgr.this).cancelAsync(iVar);
                        }
                        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                            return;
                        }
                        TBSdkLog.d(FileUploadMgr.TAG, "remove upload task succeed." + uploadFileInfo.toString());
                    }
                }
            });
        } catch (Exception e) {
            TBSdkLog.e(TAG, "add removeTask to removeTaskPool error", e);
        }
    }

    public void removeArupTask(final UploadFileInfo uploadFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88078eb3", new Object[]{this, uploadFileInfo});
            return;
        }
        try {
            FileUploadThreadPoolExecutorFactory.submitRemoveTask(new Runnable() { // from class: mtopsdk.mtop.upload.FileUploadMgr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UploadFileInfo uploadFileInfo2 = uploadFileInfo;
                    if (uploadFileInfo2 == null || !uploadFileInfo2.isValid()) {
                        TBSdkLog.e(FileUploadMgr.TAG, "remove upload task failed,fileInfo is invalid");
                    } else {
                        FileUploadMgr.access$100(FileUploadMgr.this).remove(uploadFileInfo);
                    }
                }
            });
        } catch (Exception e) {
            TBSdkLog.e(TAG, "add removeTask to removeTaskPool error", e);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.uploadTasks.clear();
        }
    }
}
