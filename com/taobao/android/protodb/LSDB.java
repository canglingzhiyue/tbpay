package com.taobao.android.protodb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dii;
import tb.igx;
import tb.mto;

/* loaded from: classes.dex */
public class LSDB extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int COMPACT_LEVEL_AGGRESSIVE = 2;
    public static int COMPACT_LEVEL_MINOR = 0;
    public static int COMPACT_LEVEL_NORMAL = 1;
    private static final long MIN_AVAILABLE_STORAGE = 1073741824;
    private static final long MIN_USAGE_STORAGE = 134217728;
    private static final int SIZE_OF_BOOL = 1;
    private static final int SIZE_OF_DOUBLE = 8;
    private static final int SIZE_OF_FLOAT = 4;
    private static final int SIZE_OF_INT = 4;
    private static final int SIZE_OF_LONG = 8;
    private static final String TO_BE_CLEAR_TAG = ".clear";
    private static final ConcurrentLinkedQueue<LSDB> sLSDBInstances = new ConcurrentLinkedQueue<>();
    private final String path;
    private final int sdkVersion;
    private final String tag;

    public static /* synthetic */ Object ipc$super(LSDB lsdb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native boolean nativeClose(long j);

    private native boolean nativeCompact(long j);

    private native boolean nativeContains(long j, String str);

    private native boolean nativeDelete(long j, String str);

    private native byte[] nativeGetBinary(long j, String str);

    private native boolean nativeGetBinaryToBuffer(long j, String str, byte[] bArr, int i);

    private native int nativeGetDataSize(long j, String str);

    private native boolean nativeInsert(long j, String str, int i, byte[] bArr, int i2);

    private native String[] nativeKeyIterator(long j, String str, String str2);

    private static native long nativeOpen(String str, Config config);

    public static LSDB open(String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("95df478", new Object[]{str, config});
        }
        Application a2 = dii.a();
        if (a2 == null) {
            throw new RuntimeException("Failed to get android context!");
        }
        return open(a2, str, config);
    }

    public static LSDB open(Context context, String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("4d3c2ef2", new Object[]{context, str, config});
        }
        int a2 = i.a();
        if (a2 < 0) {
            h.a(str, "FAILED_TO_LOAD_LIBRARY");
            return new g(context);
        } else if (getAvailableInternalMemorySize() < MIN_USAGE_STORAGE) {
            h.a(str, "NO_AVAILABLE_SPACE");
            return new g(context);
        } else {
            if (config == null) {
                config = new Config();
            }
            LSDB openInternal = openInternal(context.getFilesDir() + File.separator + "lsdb-" + str, config, a2);
            return openInternal != null ? openInternal : new g(context);
        }
    }

    public static int tryLoadNativeLibrary() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5306abdd", new Object[0])).intValue() : i.a();
    }

    public static void removeDB(String str) {
        Application a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d95d13", new Object[]{str});
            return;
        }
        if (dii.a() == null) {
            throw new RuntimeException("Failed to get android context!");
        }
        File[] listFiles = new File(a2.getFilesDir() + File.separator + "lsdb-" + str).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            file.delete();
        }
    }

    public static void compactAll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cbae9e", new Object[]{new Integer(i)});
            return;
        }
        Iterator<LSDB> it = sLSDBInstances.iterator();
        while (it.hasNext()) {
            it.next().forceCompact(i);
        }
    }

    public static void compactAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53616505", new Object[0]);
            return;
        }
        Iterator<LSDB> it = sLSDBInstances.iterator();
        while (it.hasNext()) {
            LSDB next = it.next();
            File file = new File(next.path);
            if (file.exists()) {
                long availableInternalMemorySize = getAvailableInternalMemorySize();
                long folderDirectFileSize = getFolderDirectFileSize(file);
                if (availableInternalMemorySize < MIN_AVAILABLE_STORAGE && folderDirectFileSize > 536870912) {
                    next.forceCompact(COMPACT_LEVEL_AGGRESSIVE);
                } else if (folderDirectFileSize > MIN_AVAILABLE_STORAGE) {
                    next.forceCompact(COMPACT_LEVEL_AGGRESSIVE);
                } else {
                    next.forceCompact(COMPACT_LEVEL_NORMAL);
                }
            }
        }
    }

    private static long getAvailableInternalMemorySize() {
        long blockSize;
        long availableBlocks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7670982d", new Object[0])).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    private static long getFolderDirectFileSize(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38335e5c", new Object[]{file})).longValue();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                j += file2.length();
            }
        }
        return j;
    }

    private static LSDB openInternal(String str, Config config, int i) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("7bbdad88", new Object[]{str, config, new Integer(i)});
        }
        if (new File(str, TO_BE_CLEAR_TAG).exists() && (listFiles = new File(str).listFiles()) != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        long nativeOpen = nativeOpen(str, config);
        if (nativeOpen == 0) {
            return null;
        }
        LSDB lsdb = new LSDB(nativeOpen, str, i);
        sLSDBInstances.add(lsdb);
        return lsdb;
    }

    public LSDB(long j, String str, int i) {
        super(j);
        this.tag = "ProtoDB";
        this.path = str;
        this.sdkVersion = i;
    }

    public int getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("541225ae", new Object[]{this})).intValue() : this.sdkVersion;
    }

    public boolean contains(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("932394f0", new Object[]{this, eVar})).booleanValue() : nativeContains(getNativePointer(), eVar.a());
    }

    public int getDataSize(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9cf2b281", new Object[]{this, eVar})).intValue() : nativeGetDataSize(getNativePointer(), eVar.a());
    }

    public d<e> keyIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("35837809", new Object[]{this}) : new f(nativeKeyIterator(getNativePointer(), null, null));
    }

    public d<e> keyIterator(e eVar, e eVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1a70377d", new Object[]{this, eVar, eVar2}) : new f(nativeKeyIterator(getNativePointer(), eVar.a(), eVar2.a()));
    }

    public String getString(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d16af4c", new Object[]{this, eVar});
        }
        byte[] nativeGetBinary = nativeGetBinary(getNativePointer(), eVar.a());
        if (nativeGetBinary != null && nativeGetBinary.length > 0) {
            return new String(nativeGetBinary, Charset.forName("UTF-8"));
        }
        return null;
    }

    public int getInt(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfad40f9", new Object[]{this, eVar})).intValue();
        }
        byte[] bArr = new byte[4];
        if (!nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, 4)) {
            return 0;
        }
        return ByteBuffer.wrap(bArr).getInt();
    }

    public long getLong(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9f058f3", new Object[]{this, eVar})).longValue();
        }
        byte[] bArr = new byte[8];
        if (!nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, 8)) {
            return 0L;
        }
        return ByteBuffer.wrap(bArr).getLong();
    }

    public float getFloat(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("431c85a3", new Object[]{this, eVar})).floatValue();
        }
        byte[] bArr = new byte[4];
        if (!nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, 4)) {
            return 0.0f;
        }
        return ByteBuffer.wrap(bArr).getFloat();
    }

    public double getDouble(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eef89382", new Object[]{this, eVar})).doubleValue();
        }
        byte[] bArr = new byte[8];
        return nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, 8) ? ByteBuffer.wrap(bArr).getDouble() : mto.a.GEO_NOT_SUPPORT;
    }

    public boolean getBool(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933131f1", new Object[]{this, eVar})).booleanValue();
        }
        byte[] bArr = new byte[1];
        return nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, 1) && ByteBuffer.wrap(bArr).get() != 0;
    }

    public byte[] getBinary(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("76abe199", new Object[]{this, eVar}) : nativeGetBinary(getNativePointer(), eVar.a());
    }

    public boolean getBinaryToBuffer(e eVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3e8adca", new Object[]{this, eVar, bArr})).booleanValue() : nativeGetBinaryToBuffer(getNativePointer(), eVar.a(), bArr, bArr.length);
    }

    public boolean insertString(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9476645", new Object[]{this, eVar, str})).booleanValue();
        }
        if (str == null) {
            return nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, null, 0);
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        return nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, bytes, bytes.length);
    }

    public boolean insertInt(e eVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50cbe3e4", new Object[]{this, eVar, new Integer(i)})).booleanValue() : nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(4).putInt(i).array(), 4);
    }

    public boolean insertLong(e eVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("935cd0e6", new Object[]{this, eVar, new Long(j)})).booleanValue() : nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(8).putLong(j).array(), 8);
    }

    public boolean insertFloat(e eVar, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9656cd4", new Object[]{this, eVar, new Float(f)})).booleanValue() : nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(4).putFloat(f).array(), 4);
    }

    public boolean insertDouble(e eVar, double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6543f72b", new Object[]{this, eVar, new Double(d)})).booleanValue() : nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, ByteBuffer.allocate(8).putDouble(d).array(), 8);
    }

    public boolean insertBool(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123751c8", new Object[]{this, eVar, new Boolean(z)})).booleanValue();
        }
        return nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, new byte[]{z ? (byte) 1 : (byte) 0}, 1);
    }

    public boolean insertBinary(e eVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef3f332", new Object[]{this, eVar, bArr})).booleanValue();
        }
        return nativeInsert(getNativePointer(), eVar.a(), Integer.MAX_VALUE, bArr, bArr != null ? bArr.length : 0);
    }

    public boolean insertBinary(e eVar, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e988187", new Object[]{this, eVar, new Integer(i), bArr})).booleanValue();
        }
        return nativeInsert(getNativePointer(), eVar.a(), i, bArr, bArr != null ? bArr.length : 0);
    }

    public boolean insertStream(e eVar, int i, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("949466da", new Object[]{this, eVar, new Integer(i), inputStream})).booleanValue();
        }
        if (inputStream != null) {
            try {
                int available = inputStream.available();
                byte[] bArr = new byte[available];
                if (inputStream.read(bArr, 0, inputStream.available()) == available) {
                    return insertBinary(eVar, i, bArr);
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean delete(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88e1c17c", new Object[]{this, eVar})).booleanValue() : nativeDelete(getNativePointer(), eVar.a());
    }

    public boolean close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ba683", new Object[]{this})).booleanValue();
        }
        sLSDBInstances.remove(this);
        return nativeClose(getNativePointer());
    }

    public boolean forceCompact(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75df98a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == COMPACT_LEVEL_NORMAL) {
            return nativeCompact(getNativePointer());
        }
        if (i != COMPACT_LEVEL_AGGRESSIVE) {
            return true;
        }
        try {
            return new File(this.path, TO_BE_CLEAR_TAG).createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean downgradeOn32Bit(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c929eb", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && !Process.is64Bit()) {
            return Objects.equals(context.getSharedPreferences(igx.ORANGE_NAMESPACE, 0).getString("downgradeOn32Bit", "false"), "true");
        }
        return false;
    }
}
