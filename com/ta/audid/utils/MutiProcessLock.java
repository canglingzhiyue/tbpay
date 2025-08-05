package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.upload.UtdidKeyFile;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import tb.kge;

/* loaded from: classes.dex */
public class MutiProcessLock {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FileChannel mChannel;
    private static FileLock mLock;
    private static File mLockFile;
    private static FileChannel mSyncUtdidChannel;
    private static File mSyncUtdidFile;
    private static FileLock mSyncUtdidLock;

    static {
        kge.a(38373063);
        mLockFile = null;
        mSyncUtdidFile = null;
    }

    public static synchronized void lockUtdidFile() {
        synchronized (MutiProcessLock.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c997a638", new Object[0]);
                return;
            }
            UtdidLogger.d();
            if (mLockFile == null) {
                mLockFile = new File(UtdidKeyFile.getFileLockPath());
            }
            if (!mLockFile.exists()) {
                try {
                    mLockFile.createNewFile();
                } catch (Exception unused) {
                    return;
                }
            }
            if (mChannel == null) {
                try {
                    mChannel = new RandomAccessFile(mLockFile, "rw").getChannel();
                } catch (Exception unused2) {
                    return;
                }
            }
            try {
                mLock = mChannel.lock();
            } catch (Throwable unused3) {
            }
        }
    }

    public static synchronized void releaseUtdidFile() {
        synchronized (MutiProcessLock.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c951c8dc", new Object[0]);
                return;
            }
            UtdidLogger.d();
            if (mLock != null) {
                try {
                    mLock.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    mLock = null;
                    throw th;
                }
                mLock = null;
            }
            if (mChannel == null) {
                return;
            }
            try {
                mChannel.close();
            } catch (Exception unused2) {
            } finally {
                mChannel = null;
            }
        }
    }

    public static synchronized boolean trylockSyncUtdid() {
        synchronized (MutiProcessLock.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b3079ea", new Object[0])).booleanValue();
            }
            UtdidLogger.d();
            if (mSyncUtdidFile == null) {
                mSyncUtdidFile = new File(UtdidKeyFile.getSyncUtdidFileLockPath());
            }
            if (!mSyncUtdidFile.exists()) {
                try {
                    mSyncUtdidFile.createNewFile();
                } catch (Exception unused) {
                    return false;
                }
            }
            if (mSyncUtdidChannel == null) {
                try {
                    mSyncUtdidChannel = new RandomAccessFile(mSyncUtdidFile, "rw").getChannel();
                } catch (Exception unused2) {
                    return false;
                }
            }
            try {
                FileLock tryLock = mSyncUtdidChannel.tryLock();
                if (tryLock != null) {
                    mSyncUtdidLock = tryLock;
                    return true;
                }
            } catch (Throwable unused3) {
            }
            return false;
        }
    }

    public static synchronized void releaseSyncUtdid() {
        synchronized (MutiProcessLock.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16c210e5", new Object[0]);
                return;
            }
            UtdidLogger.d();
            if (mSyncUtdidLock != null) {
                try {
                    mSyncUtdidLock.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    mSyncUtdidLock = null;
                    throw th;
                }
                mSyncUtdidLock = null;
            }
            if (mSyncUtdidChannel == null) {
                return;
            }
            try {
                mSyncUtdidChannel.close();
            } catch (Exception unused2) {
            } finally {
                mSyncUtdidChannel = null;
            }
        }
    }
}
