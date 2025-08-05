package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes8.dex */
public class ozb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2087224880);
    }

    public static void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("File " + file + " is not directory!");
        } else if (!file.mkdirs()) {
            throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
        }
    }

    public static List<File> b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a90c5ca7", new Object[]{file});
        }
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new a());
        return asList;
    }

    public static void c(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
        } else if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
        } else {
            d(file);
        }
    }

    public static void d(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f396c522", new Object[]{file});
            return;
        }
        long length = file.length();
        if (length == 0) {
            e(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j = length - 1;
        try {
            randomAccessFile.seek(j);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j);
            randomAccessFile.write(readByte);
        } finally {
            randomAccessFile.close();
        }
    }

    private static void e(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14126e3", new Object[]{file});
        } else if (file.delete() && file.createNewFile()) {
        } else {
            throw new IOException("Error recreate zero-size file " + file);
        }
    }

    /* loaded from: classes8.dex */
    public static final class a implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1637822679);
            kge.a(-2099169482);
        }

        private int a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c11cadb", new Object[]{this, new Long(j), new Long(j2)})).intValue();
            }
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }

        private a() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue() : a(file, file2);
        }

        public int a(File file, File file2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3abf709", new Object[]{this, file, file2})).intValue() : a(file.lastModified(), file2.lastModified());
        }
    }
}
