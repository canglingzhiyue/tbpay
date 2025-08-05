package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class iku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 1048576;

    public static void a(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{file, str});
        } else {
            a(file, str, Charset.defaultCharset(), false);
        }
    }

    public static void a(File file, String str, Charset charset, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ba14bd", new Object[]{file, str, charset, new Boolean(z)});
            return;
        }
        FileOutputStream b = b(file, z);
        try {
            ikv.a(str, b, charset);
            if (b == null) {
                return;
            }
            b.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    if (th != null) {
                        try {
                            b.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        b.close();
                    }
                }
                throw th2;
            }
        }
    }

    public static Collection<File> a(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("60863512", new Object[]{file, new Boolean(z)});
        }
        LinkedList linkedList = new LinkedList();
        a(linkedList, file, z);
        return linkedList;
    }

    private static void a(Collection<File> collection, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1f8704", new Object[]{collection, file, new Boolean(z)});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                if (z) {
                    collection.add(file2);
                }
                a(collection, file2, z);
            } else {
                collection.add(file2);
            }
        }
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da5162", new Object[]{inputStream, file});
            return;
        }
        try {
            FileOutputStream a2 = a(file);
            ikv.a(inputStream, a2);
            if (a2 != null) {
                a2.close();
            }
            if (inputStream == null) {
                return;
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    if (th != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        inputStream.close();
                    }
                }
                throw th2;
            }
        }
    }

    public static FileOutputStream a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileOutputStream) ipChange.ipc$dispatch("12101f2d", new Object[]{file}) : b(file, false);
    }

    public static FileOutputStream b(File file, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("2f191378", new Object[]{file, new Boolean(z)});
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            } else if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        }
        return new FileOutputStream(file, z);
    }

    public static void b(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{file});
        } else if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
        } else if (file.mkdirs() || file.isDirectory()) {
        } else {
            throw new IOException("Unable to create directory " + file);
        }
    }

    public static void c(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        b(parentFile);
    }

    public static FileInputStream d(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileInputStream) ipChange.ipc$dispatch("8b0020c1", new Object[]{file});
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            } else if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            } else {
                return new FileInputStream(file);
            }
        }
        throw new FileNotFoundException("File '" + file + "' does not exist");
    }

    public static byte[] e(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("66e3b65a", new Object[]{file});
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = d(file);
            return ikv.a(fileInputStream, file.length());
        } finally {
            ikv.a((Closeable) fileInputStream);
        }
    }

    public static boolean f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eeb88a8", new Object[]{file})).booleanValue();
        }
        if (file.isFile()) {
            return file.delete();
        }
        return g(file);
    }

    public static boolean g(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c95ea69", new Object[]{file})).booleanValue();
        }
        if (!h(file)) {
            return false;
        }
        return file.delete();
    }

    public static boolean h(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a404c2a", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= h(file2);
                }
                if (!file2.delete()) {
                    String str = "Failed to delete " + file2;
                    z = false;
                }
            }
        }
        return z;
    }

    public static void a(File file, List<File> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec608ed0", new Object[]{file, list});
        } else if (file == null) {
            RSoLog.b("collectDirectChild(), dir == null");
        } else if (!file.isDirectory()) {
            RSoLog.b("collectDirectChild(), !dir.isDirectory(), path=" + file.getPath());
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                RSoLog.b("collectDirectChild(), children == null || children.length < 1, path=" + file.getPath());
                return;
            }
            for (File file2 : listFiles) {
                if (file2 == null || !file2.exists()) {
                    RSoLog.b("file == null in dir=" + file.getPath());
                } else {
                    list.add(file2);
                }
            }
        }
    }

    public static void a(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{file, file2});
        } else {
            a(file, file2, true);
        }
    }

    public static void a(File file, File file2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d39e7e", new Object[]{file, file2, new Boolean(z)});
        } else if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else {
            if (file2 == null) {
                throw new NullPointerException("Destination must not be null");
            }
            if (!file.exists()) {
                throw new FileNotFoundException("Source '" + file + "' does not exist");
            } else if (file.isDirectory()) {
                throw new IOException("Source '" + file + "' exists but is a directory");
            } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException("Destination '" + parentFile + "' directory cannot be created");
                } else if (file2.exists() && !file2.canWrite()) {
                    throw new IOException("Destination '" + file2 + "' exists but is read-only");
                } else {
                    b(file, file2, z);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, java.io.FileOutputStream] */
    private static void b(File file, File file2, boolean z) throws IOException {
        FileInputStream fileInputStream;
        ?? r5;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3629d", new Object[]{file, file2, new Boolean(z)});
        } else if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        } else {
            FileChannel fileChannel2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
                r5 = 0;
            }
            try {
                r5 = new FileOutputStream(file2);
                try {
                    fileChannel = fileInputStream.getChannel();
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r5 = 0;
                fileChannel = r5;
                ikv.a(fileChannel2);
                ikv.a((Closeable) r5);
                ikv.a(fileChannel);
                ikv.a((Closeable) fileInputStream);
                throw th;
            }
            try {
                fileChannel2 = r5.getChannel();
                long size = fileChannel.size();
                long j = 0;
                while (j < size) {
                    long j2 = size - j;
                    j += fileChannel2.transferFrom(fileChannel, j, j2 > 31457280 ? 31457280L : j2);
                }
                ikv.a(fileChannel2);
                ikv.a((Closeable) r5);
                ikv.a(fileChannel);
                ikv.a((Closeable) fileInputStream);
                if (file.length() == file2.length()) {
                    if (!z) {
                        return;
                    }
                    file2.setLastModified(file.lastModified());
                    return;
                }
                throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
            } catch (Throwable th4) {
                th = th4;
                ikv.a(fileChannel2);
                ikv.a((Closeable) r5);
                ikv.a(fileChannel);
                ikv.a((Closeable) fileInputStream);
                throw th;
            }
        }
    }
}
