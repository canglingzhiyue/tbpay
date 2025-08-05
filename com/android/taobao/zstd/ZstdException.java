package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ZstdException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long errCode;

    public static /* synthetic */ Object ipc$super(ZstdException zstdException, String str, Object... objArr) {
        if (str.hashCode() == -926732344) {
            return super.getMessage();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ZstdException(String str) {
        super(str);
        this.errCode = 0L;
    }

    public ZstdException(long j) {
        super(Zstd.getErrorMessage(j));
        this.errCode = j;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        if (this.errCode == 0) {
            return super.getMessage();
        }
        return super.getMessage() + " errCode=" + this.errCode;
    }
}
