package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes4.dex */
public class dvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(900783661);
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20e2c4", new Object[]{str, aVar});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(str);
            if (!file.exists()) {
                TLog.loge(CacheCleaner.MODULE, "ShellUtil", String.format("readProcessFile: file %s is not exist.", str));
                return;
            }
            a(new FileInputStream(file), aVar);
            Log.e("ShellUtil", String.format("readProcessFile: read proc [%s] success, consume %d ms.", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (Throwable th) {
            TLog.loge(CacheCleaner.MODULE, "ShellUtil", String.format("read process file %s with exception %s", str, th));
        }
    }

    private static void a(InputStream inputStream, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e502a27d", new Object[]{inputStream, aVar});
        } else if (inputStream == null) {
            TLog.loge(CacheCleaner.MODULE, "ShellUtil", "readFromStream: input stream is empty.");
        } else {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                                return;
                            } catch (IOException unused) {
                                TLog.loge(CacheCleaner.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                                return;
                            }
                        } else if (aVar != null) {
                            aVar.a(readLine);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            TLog.loge(CacheCleaner.MODULE, "ShellUtil", "readFromStream: read from input stream with exception " + th);
                            if (bufferedReader == null) {
                                return;
                            }
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException unused2) {
                                TLog.loge(CacheCleaner.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                                return;
                            }
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                    TLog.loge(CacheCleaner.MODULE, "ShellUtil", "readFromStream: close input stream with IOException.");
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
