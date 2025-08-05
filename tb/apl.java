package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class apl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1867856397);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static String b(String str) {
        InputStreamReader inputStreamReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(str));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            inputStreamReader = null;
        }
        try {
            char[] cArr = new char[100];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            String sb2 = sb.toString();
            try {
                inputStreamReader.close();
            } catch (Exception e) {
                apr.b("", e, new Object[0]);
            }
            return sb2;
        } catch (Exception unused2) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e2) {
                    apr.b("", e2, new Object[0]);
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Exception e3) {
                    apr.b("", e3, new Object[0]);
                }
            }
            throw th;
        }
    }

    public static boolean a(String str, String str2) {
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(new File(str));
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.write(str2);
                        bufferedWriter2.flush();
                        try {
                            bufferedWriter2.close();
                        } catch (Exception e) {
                            apr.b("", e, new Object[0]);
                        }
                        try {
                            fileWriter.close();
                        } catch (Exception e2) {
                            apr.b("", e2, new Object[0]);
                        }
                        return true;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedWriter = bufferedWriter2;
                        apr.b("", e, new Object[0]);
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Exception e4) {
                                apr.b("", e4, new Object[0]);
                            }
                        }
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (Exception e5) {
                                apr.b("", e5, new Object[0]);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Exception e6) {
                                apr.b("", e6, new Object[0]);
                            }
                        }
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (Exception e7) {
                                apr.b("", e7, new Object[0]);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            fileWriter = null;
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                return file.delete();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
