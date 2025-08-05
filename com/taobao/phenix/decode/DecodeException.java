package com.taobao.phenix.decode;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class DecodeException extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mDataFromDisk;
    private DecodedError mDecodedError;
    private boolean misLocalUri;

    /* loaded from: classes7.dex */
    public enum DecodedError {
        SUCCESS,
        OOM_ERROR,
        UNAVAILABLE_INPUT_ERROR,
        UNAVAILABLE_OUTPUT_ERROR,
        EMPTY_BYTES_ERROR,
        UNLINK_SO_ERROR,
        UNKNOWN_ERROR,
        WEBP_FORMAT_ERROR
    }

    static {
        kge.a(2068557260);
    }

    public DecodeException(DecodedError decodedError) {
        this.mDecodedError = decodedError;
    }

    public DecodeException(DecodedError decodedError, String str) {
        super(str);
        this.mDecodedError = decodedError;
    }

    public DecodeException(DecodedError decodedError, Throwable th) {
        super(th);
        this.mDecodedError = decodedError;
    }

    public DecodedError getDecodedError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DecodedError) ipChange.ipc$dispatch("630116b6", new Object[]{this}) : this.mDecodedError;
    }

    public boolean isDataFromDisk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15067f86", new Object[]{this})).booleanValue() : this.mDataFromDisk;
    }

    public void dataFromDisk(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89b379c", new Object[]{this, new Boolean(z)});
        } else {
            this.mDataFromDisk = z;
        }
    }

    public boolean isLocalUri() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("72e54056", new Object[]{this})).booleanValue() : this.misLocalUri;
    }

    public void setLocalUri(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ba488a", new Object[]{this, new Boolean(z)});
        } else {
            this.misLocalUri = z;
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DecodeException:type=" + this.mDecodedError + " localUri=" + this.misLocalUri + " fromDisk=" + this.mDataFromDisk + " throwable=" + getMessage();
    }
}
