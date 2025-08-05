package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class dip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(817761344);
    }

    public static void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file == null) {
            throw new IllegalStateException("Failed to get external storage files directory");
        } else {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                throw new IllegalStateException(file.getAbsolutePath() + " already exists and is not a directory");
            } else if (file.mkdirs()) {
            } else {
                throw new IOException("Couldn't create directory " + file.getPath());
            }
        }
    }
}
