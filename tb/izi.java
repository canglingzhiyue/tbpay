package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class izi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1870592189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = ipChange instanceof IpChange;
        if (z) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        FileOutputStream fileOutputStream = z;
        if (parentFile != null) {
            boolean exists = parentFile.exists();
            fileOutputStream = exists;
            if (!exists) {
                try {
                    fileOutputStream = exists;
                    if (!parentFile.mkdirs()) {
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    return false;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(str2.getBytes());
                        try {
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        return true;
                    } catch (Exception e4) {
                        e = e4;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                return false;
                            }
                        }
                        if (fileOutputStream != 0) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                throw th;
                            }
                        }
                        if (fileOutputStream != 0) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e8) {
                e = e8;
                fileOutputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str) {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            return "";
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream2 = bufferedInputStream;
                            e.printStackTrace();
                            if (bufferedInputStream2 != null) {
                                bufferedInputStream2.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return new String(bArr);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    throw th;
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bufferedInputStream.read(bArr, 0, length) >= length) {
            bufferedInputStream.close();
            fileInputStream.close();
            return new String(bArr);
        }
        try {
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return "";
    }
}
