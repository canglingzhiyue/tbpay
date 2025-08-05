package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class Database extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Database database, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native long nativeCreateStatement(String str);

    private native void nativeDeleteDatabase();

    private static native long nativeOpenDatabase(DBConfig dBConfig);

    private native long nativePrepareStatement(String str);

    public static Database a(DBConfig dBConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Database) ipChange.ipc$dispatch("d7b581d3", new Object[]{dBConfig});
        }
        if (!f1801a) {
            return null;
        }
        long nativeOpenDatabase = nativeOpenDatabase(dBConfig);
        if (nativeOpenDatabase != 0) {
            return new Database(nativeOpenDatabase);
        }
        return null;
    }

    private Database(long j) {
        super(j);
    }

    public PreparedStatement a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedStatement) ipChange.ipc$dispatch("f3494ab8", new Object[]{this, str});
        }
        if (!f1801a) {
            return null;
        }
        long nativePrepareStatement = nativePrepareStatement(str);
        if (nativePrepareStatement != 0) {
            return new PreparedStatement(nativePrepareStatement);
        }
        return null;
    }

    public CallableStatement b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallableStatement) ipChange.ipc$dispatch("3647cdb4", new Object[]{this, str});
        }
        if (!f1801a) {
            return null;
        }
        long nativeCreateStatement = nativeCreateStatement(str);
        if (nativeCreateStatement != 0) {
            return new CallableStatement(nativeCreateStatement);
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!f1801a) {
        } else {
            c();
        }
    }
}
