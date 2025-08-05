package mtopsdk.mtop.upload.service;

import anetwork.channel.IBodyHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import mtopsdk.common.util.TBSdkLog;
import tb.kge;

/* loaded from: classes9.dex */
public class FileUploadBodyHandlerImpl implements IBodyHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUploadBodyHandlerImpl";
    private File file;
    private long offset;
    private long patchSize;
    private boolean isCompleted = false;
    private int postedLength = 0;
    private RandomAccessFile raf = null;

    static {
        kge.a(2013716525);
        kge.a(-1445981459);
    }

    public FileUploadBodyHandlerImpl(File file, long j, long j2) {
        this.patchSize = 0L;
        this.offset = 0L;
        this.file = file;
        this.offset = j;
        this.patchSize = j2;
    }

    @Override // anetwork.channel.IBodyHandler
    public int read(byte[] bArr) {
        File file;
        long length;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        if (bArr == null || bArr.length == 0 || (file = this.file) == null) {
            TBSdkLog.e(TAG, "[read(byte[] buffer)]parameter buffer or file is null");
            this.isCompleted = true;
            return 0;
        }
        try {
            try {
            } finally {
                RandomAccessFile randomAccessFile = this.raf;
                if (randomAccessFile != null && this.isCompleted) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        TBSdkLog.e(TAG, "close RandomAccessFile error", e);
                    }
                }
            }
        } catch (IOException e2) {
            TBSdkLog.e(TAG, "close RandomAccessFile error", e2);
        }
        if (this.postedLength >= this.patchSize) {
            this.isCompleted = true;
            return 0;
        }
        try {
            if (this.raf == null) {
                this.raf = new RandomAccessFile(file, "r");
            }
            length = this.raf.length();
        } catch (Exception e3) {
            TBSdkLog.e(TAG, "[read]write Body error", e3);
            this.isCompleted = true;
            RandomAccessFile randomAccessFile2 = this.raf;
            if (randomAccessFile2 != null && this.isCompleted) {
                randomAccessFile2.close();
            }
        }
        if (this.offset < length && this.postedLength < length) {
            this.raf.seek(this.offset);
            int read = this.raf.read(bArr);
            if (read != -1) {
                if (this.postedLength + read > this.patchSize) {
                    read = (int) (this.patchSize - this.postedLength);
                }
                i = read;
                this.postedLength += i;
                this.offset += i;
                if (this.postedLength >= this.patchSize || this.offset >= length) {
                    this.isCompleted = true;
                }
            }
            RandomAccessFile randomAccessFile3 = this.raf;
            if (randomAccessFile3 != null && this.isCompleted) {
                randomAccessFile3.close();
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
