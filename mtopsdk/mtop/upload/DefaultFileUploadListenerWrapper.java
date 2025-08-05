package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultFileUploadListenerWrapper implements FileUploadBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FileUploadBaseListener listener;
    public long segmentNum;
    public long serverRT;
    private long startTime;
    private long totalTime;
    private AtomicBoolean isCancelled = new AtomicBoolean(false);
    private AtomicBoolean isFinished = new AtomicBoolean(false);
    private AtomicInteger retryTimes = new AtomicInteger(0);

    static {
        kge.a(-732775355);
        kge.a(1696106886);
    }

    public DefaultFileUploadListenerWrapper(FileUploadBaseListener fileUploadBaseListener) {
        this.listener = fileUploadBaseListener;
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.startTime = System.currentTimeMillis();
        if (this.listener == null || isCancelled()) {
            return;
        }
        this.listener.onStart();
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        } else if (this.listener == null || isCancelled()) {
        } else {
            this.listener.onProgress(i);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(UploadFileInfo uploadFileInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
            return;
        }
        this.totalTime = System.currentTimeMillis() - this.startTime;
        if (this.listener == null || isCancelled()) {
            return;
        }
        this.listener.onFinish(uploadFileInfo, str);
        cancel();
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            return;
        }
        this.totalTime = System.currentTimeMillis() - this.startTime;
        if (this.listener == null || isCancelled()) {
            return;
        }
        this.listener.onError(str, str2, str3);
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99807463", new Object[]{this, str});
        } else if (this.listener == null || isCancelled()) {
        } else {
            this.listener.onFinish(str);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        } else if (this.listener == null || isCancelled()) {
        } else {
            this.listener.onError(str, str2);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.isCancelled.set(true);
        }
    }

    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue() : this.isCancelled.get();
    }

    public long getUploadTotalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28deec75", new Object[]{this})).longValue() : this.totalTime;
    }

    public AtomicBoolean isFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("5e519fc3", new Object[]{this}) : this.isFinished;
    }

    public void countRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744489f4", new Object[]{this});
        } else {
            this.retryTimes.incrementAndGet();
        }
    }

    public int getTotalRetryTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0d77026", new Object[]{this})).intValue() : this.retryTimes.get();
    }
}
