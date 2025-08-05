package mtopsdk.mtop.upload.service;

import anetwork.channel.IBodyHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import mtopsdk.common.util.TBSdkLog;
import tb.kge;

/* loaded from: classes9.dex */
public class FileStreamUploadBodyHandlerImpl implements IBodyHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileStreamUploadBodyHandlerImpl";
    private long fileSize;
    private InputStream fileStream;
    private long offset;
    private long patchSize;
    private boolean isCompleted = false;
    private int postedLength = 0;
    private BufferedInputStream bis = null;

    static {
        kge.a(-1833350131);
        kge.a(-1445981459);
    }

    public FileStreamUploadBodyHandlerImpl(InputStream inputStream, long j, long j2, long j3) {
        this.fileSize = 0L;
        this.patchSize = 0L;
        this.offset = 0L;
        this.fileStream = inputStream;
        this.fileSize = j;
        this.offset = j2;
        this.patchSize = j3;
    }

    @Override // anetwork.channel.IBodyHandler
    public int read(byte[] bArr) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        if (bArr == null || bArr.length == 0 || (inputStream = this.fileStream) == null) {
            TBSdkLog.e(TAG, "[read(byte[] buffer)]parameter buffer or fileStream is null");
            this.isCompleted = true;
            return 0;
        }
        int i2 = this.postedLength;
        try {
            try {
            } finally {
                BufferedInputStream bufferedInputStream = this.bis;
                if (bufferedInputStream != null && this.isCompleted) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        TBSdkLog.e(TAG, "close inputStream error", e);
                    }
                }
            }
        } catch (IOException e2) {
            TBSdkLog.e(TAG, "close inputStream error", e2);
        }
        if (i2 >= this.patchSize) {
            this.isCompleted = true;
            return 0;
        }
        try {
        } catch (Exception e3) {
            TBSdkLog.e(TAG, "[read]write Body error", e3);
            this.isCompleted = true;
            BufferedInputStream bufferedInputStream2 = this.bis;
            if (bufferedInputStream2 != null && this.isCompleted) {
                bufferedInputStream2.close();
            }
        }
        if (this.offset < this.fileSize && i2 < this.fileSize) {
            if (this.bis == null) {
                this.bis = new BufferedInputStream(inputStream);
            }
            int read = this.bis.read(bArr);
            if (read != -1) {
                if (this.postedLength + read > this.patchSize) {
                    read = (int) (this.patchSize - this.postedLength);
                }
                i = read;
                this.postedLength += i;
                this.offset += i;
                if (this.postedLength >= this.patchSize || this.offset >= this.fileSize) {
                    this.isCompleted = true;
                }
                if (!this.isCompleted) {
                    this.bis.mark((int) this.fileSize);
                    this.bis.reset();
                }
            }
            BufferedInputStream bufferedInputStream3 = this.bis;
            if (bufferedInputStream3 != null && this.isCompleted) {
                bufferedInputStream3.close();
            }
            return i;
        }
        this.isCompleted = true;
        return 0;
    }

    @Override // anetwork.channel.IBodyHandler
    public boolean isCompleted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue() : this.isCompleted;
    }
}
