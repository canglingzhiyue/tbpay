package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class jgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static File f29533a;

    public jgd(Context context, String str) {
        if (f29533a == null) {
            File file = new File(context.getDir("tombstone", 0), str);
            f29533a = file;
            jgl.d(file);
        }
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : f29533a;
    }

    public boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue() : f29533a.equals(file.getParentFile());
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        File[] listFiles = f29533a.listFiles();
        if (listFiles == null || listFiles.length < i) {
            return 0;
        }
        Arrays.sort(listFiles, $$Lambda$jgd$2xWxZxk24DUhUXpqnkNJ15E7jBc.INSTANCE);
        for (int i2 = i; i2 < listFiles.length; i2++) {
            String absolutePath = listFiles[i2].getAbsolutePath();
            if (absolutePath.endsWith("anr.log")) {
                jfr.a().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "anr");
            } else if (absolutePath.endsWith("java.log")) {
                jfr.a().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "java");
            } else if (absolutePath.endsWith("jni.log") || absolutePath.endsWith("native.log")) {
                jfr.a().a("STAGE_ANR_FILE_LAUNCH_DELETED", "TCrash", "native");
            }
            jgl.b(listFiles[i2]);
        }
        return listFiles.length - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3abf709", new Object[]{file, file2})).intValue();
        }
        int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }
}
