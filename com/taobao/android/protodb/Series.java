package com.taobao.android.protodb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.dii;

/* loaded from: classes6.dex */
public class Series extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Series series, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native void nativeAppendRecord(long j, String str, String str2, ValueWrapper[] valueWrapperArr);

    private native long nativeGetRecord(long j, String str);

    private static native long nativeOpen(String str, Config config);

    public static Series open(String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Series) ipChange.ipc$dispatch("bd502fe6", new Object[]{str, config});
        }
        Application a2 = dii.a();
        if (a2 == null) {
            throw new RuntimeException("failed to get android context!");
        }
        if (i.a() < 0) {
            return null;
        }
        long nativeOpen = nativeOpen(a2.getFilesDir() + File.separator + "lsdb-series-" + str, config);
        if (nativeOpen <= 0) {
            return null;
        }
        return new Series(nativeOpen);
    }

    public static Series open(String str, String str2, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Series) ipChange.ipc$dispatch("e18ed1c", new Object[]{str, str2, config});
        }
        if (i.a() < 0) {
            return null;
        }
        long nativeOpen = nativeOpen(str + File.separator + "lsdb-series-" + str2, config);
        if (nativeOpen <= 0) {
            return null;
        }
        return new Series(nativeOpen);
    }

    public Series(long j) {
        super(j);
    }

    public void appendRecord(e eVar, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be604f", new Object[]{this, eVar, str, objArr});
            return;
        }
        ValueWrapper[] valueWrapperArr = new ValueWrapper[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                valueWrapperArr[i] = ValueWrapper.stringValue((String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    valueWrapperArr[i] = ValueWrapper.intValue(((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    valueWrapperArr[i] = ValueWrapper.longValue(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    valueWrapperArr[i] = ValueWrapper.floatValue(((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    valueWrapperArr[i] = ValueWrapper.doubleValue(((Double) obj).doubleValue());
                }
            }
        }
        nativeAppendRecord(getNativePointer(), eVar.a(), str, valueWrapperArr);
    }

    public Record getRecord(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("1d85a398", new Object[]{this, eVar});
        }
        long nativeGetRecord = nativeGetRecord(getNativePointer(), eVar.a());
        if (nativeGetRecord <= 0) {
            return null;
        }
        return new Record(nativeGetRecord);
    }
}
