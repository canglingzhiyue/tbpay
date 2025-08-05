package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class RecordSet extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RecordSet recordSet, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native long nativeGetRecord();

    private native boolean nativeNext();

    public RecordSet(long j) {
        super(j);
    }

    public boolean next() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54d45dfe", new Object[]{this})).booleanValue() : nativeNext();
    }

    public Record getRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("d484c952", new Object[]{this});
        }
        long nativeGetRecord = nativeGetRecord();
        if (nativeGetRecord <= 0) {
            return null;
        }
        return new Record(nativeGetRecord);
    }
}
