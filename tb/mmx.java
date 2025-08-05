package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mmx implements mmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f31122a = new File(e.a().b().getCacheDir() + "/apm_db.db");

    @Override // tb.mmv
    public void a(String str) {
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            c();
            if (this.f31122a.length() >= 4194304) {
                return;
            }
            FileWriter fileWriter2 = null;
            try {
                fileWriter = new FileWriter(this.f31122a, true);
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileWriter.append((CharSequence) str).append((CharSequence) "\n");
                fileWriter.close();
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    fileWriter2.close();
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.mmv
    public List<String> a() {
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        try {
            c();
            if (this.f31122a.length() > 0) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(this.f31122a));
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        arrayList.add(readLine);
                    }
                    bufferedReader.close();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // tb.mmv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f31122a.exists()) {
        } else {
            this.f31122a.delete();
        }
    }

    private void c() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f31122a.exists()) {
            this.f31122a.createNewFile();
        } else if (!this.f31122a.isDirectory()) {
        } else {
            this.f31122a.delete();
            this.f31122a.createNewFile();
        }
    }
}
