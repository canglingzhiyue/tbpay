package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class mpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile mpo f31192a;
    private String b;
    private a c;

    /* loaded from: classes7.dex */
    public interface a {
        String a(File file, String str);
    }

    private mpo() {
    }

    public static mpo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpo) ipChange.ipc$dispatch("f07e372", new Object[0]);
        }
        if (f31192a == null) {
            synchronized (mpo.class) {
                if (f31192a == null) {
                    f31192a = new mpo();
                }
            }
        }
        return f31192a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ae854f", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        File a2 = mql.a();
        if (!a2.exists() || !a2.isDirectory() || (listFiles = a2.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                String b = b(file);
                file.delete();
                a aVar = this.c;
                if (aVar != null) {
                    b = aVar.a(file, b);
                }
                mpm.a().a(a(file), b, false);
            } catch (Exception e) {
                e.printStackTrace();
                if (z) {
                    file.delete();
                    mpi.c("UploadStorage", "上传文件失败：", file.getName());
                }
            }
        }
    }

    private String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{this, file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return this.b + "/error";
        }
        return this.b + "/" + name.split("_")[0];
    }

    private String b(File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa476700", new Object[]{this, file});
        }
        BufferedReader bufferedReader = null;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("\n");
                            }
                            sb.append(readLine);
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return sb.toString();
    }
}
