package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.gsl;

/* loaded from: classes.dex */
public class gl extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f13048a = {"res/drawable/yw_1222.jpg", "res/drawable/yw_1222_mwua.jpg", "res/drawable/yw_1222_sharetoken.jpg"};
    private static Method b;
    private static boolean c;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f13049a = Pattern.compile("\\S*(\\.\\.)+(%)*\\S*");

        public static /* synthetic */ Pattern a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("8d215c31", new Object[0]) : f13049a;
        }
    }

    public gl(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (a(application, f13048a)) {
        } else {
            gsl.a("SGJpgProcess", "unzipFinished return false", new Object[0]);
        }
    }

    private static boolean a(String str, String str2, String str3, String[] strArr) {
        ZipEntry entry;
        int indexOf;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5003131d", new Object[]{str, str2, str3, strArr})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ZipFile zipFile = new ZipFile(str);
                    for (String str4 : strArr) {
                        if (!a.a().matcher(str4).find() && (entry = zipFile.getEntry(str4)) != null && (indexOf = str4.indexOf(str3)) >= 0) {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            int size = (int) entry.getSize();
                            String substring = str4.substring(indexOf);
                            BufferedOutputStream bufferedOutputStream2 = null;
                            try {
                                fileOutputStream = new FileOutputStream(new File(str2, substring));
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream, size);
                                } catch (Exception unused) {
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (Exception unused2) {
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                            try {
                                byte[] bArr = new byte[size];
                                int i = 0;
                                while (i < size) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                    i += read;
                                }
                                if (i != size) {
                                    try {
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        fileOutputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    return false;
                                }
                                try {
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.flush();
                                        bufferedOutputStream2.close();
                                    } catch (Exception unused6) {
                                        return false;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return false;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.flush();
                                        bufferedOutputStream2.close();
                                    } catch (Exception unused7) {
                                        throw th;
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException unused8) {
            }
        }
        return false;
    }

    private static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (file == null) {
                return false;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath());
                try {
                    fileOutputStream2.close();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean a(Context context, String[] strArr) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{context, strArr})).booleanValue();
        }
        try {
            String absolutePath = context.getDir("SGLib", 0).getAbsolutePath();
            String str = context.getApplicationInfo().sourceDir;
            String str2 = null;
            if (str != null) {
                if (new File(str).exists()) {
                    str2 = absolutePath + "/app_" + (file.lastModified() / 1000);
                }
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                str2 = str2 + "/pre_unzip_jpgs";
                File file3 = new File(str2);
                if (!file3.exists()) {
                    file3.mkdir();
                }
            }
            File file4 = new File(str2, "SGJpgProcessFinished");
            if (file4.exists()) {
                return true;
            }
            if (!a(context, str2, strArr) && !a(str, str2, "yw_1222", strArr)) {
                return false;
            }
            return a(file4);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context, String str, String[] strArr) {
        int indexOf;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2be7ab9", new Object[]{context, str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!a.a().matcher(str2).find() && (indexOf = str2.indexOf("yw_1222")) >= 0) {
                try {
                    InputStream a2 = a(context.getAssets(), str2);
                    if (a2 == null) {
                        return false;
                    }
                    String substring = str2.substring(indexOf);
                    BufferedOutputStream bufferedOutputStream2 = null;
                    try {
                        int available = a2.available();
                        fileOutputStream = new FileOutputStream(new File(str, substring));
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            byte[] bArr = new byte[available];
                            int i = 0;
                            while (i < available) {
                                int read = a2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                                i += read;
                            }
                            if (i != available) {
                                try {
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                } catch (Exception unused2) {
                                }
                                return false;
                            }
                            try {
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                                return false;
                            }
                        } catch (Exception unused4) {
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                } catch (Exception unused5) {
                                    return false;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream2.close();
                                } catch (Exception unused6) {
                                    return false;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception unused7) {
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Exception unused8) {
                    if (!str2.contains(MspEventTypes.ACTION_STRING_SHARETOKEN)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static InputStream a(AssetManager assetManager, String str) {
        c();
        Method method = b;
        if (method != null) {
            try {
                return (InputStream) method.invoke(assetManager, str);
            } catch (IllegalAccessException unused) {
                return null;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (c) {
        } else {
            try {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("openNonAsset", String.class);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                gsl.d("SG_Compatible", "Failed to retrieve openNonAsset method", e);
            }
            c = true;
        }
    }
}
