package com.ta.audid.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import tb.kge;

/* loaded from: classes.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtils";

    static {
        kge.a(-268378881);
    }

    public static void isDirExist(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa3a945", new Object[]{str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (!file.exists()) {
                UtdidLogger.sd("FileUtils", "mkdirs path", str, "created", Boolean.valueOf(file.mkdirs()));
            } else {
                UtdidLogger.sd("FileUtils", "path exists", str);
            }
        } catch (Exception e) {
            UtdidLogger.se("FileUtils", e, new Object[0]);
        }
    }

    public static boolean checkFileExistOnly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9617da54", new Object[]{str})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return new File(str).exists();
        } catch (Exception e) {
            UtdidLogger.se("FileUtils", e, new Object[0]);
            return false;
        }
    }

    public static String readFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa3711bd", new Object[]{str});
        }
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(str));
                try {
                    char[] cArr = new char[100];
                    StringBuilder sb = new StringBuilder("");
                    while (true) {
                        int read = inputStreamReader2.read(cArr);
                        if (read == -1) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                    String sb2 = sb.toString();
                    try {
                        inputStreamReader2.close();
                    } catch (Exception e) {
                        UtdidLogger.se("FileUtils", e, new Object[0]);
                    }
                    return sb2;
                } catch (Exception e2) {
                    e = e2;
                    inputStreamReader = inputStreamReader2;
                    UtdidLogger.se("FileUtils", e, new Object[0]);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Exception e3) {
                            UtdidLogger.se("FileUtils", e3, new Object[0]);
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Exception e4) {
                            UtdidLogger.se("FileUtils", e4, new Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static boolean saveFile(String str, String str2) {
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76bd19b8", new Object[]{str, str2})).booleanValue();
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
                            UtdidLogger.se("FileUtils", e, new Object[0]);
                        }
                        try {
                            fileWriter.close();
                        } catch (Exception e2) {
                            UtdidLogger.se("FileUtils", e2, new Object[0]);
                        }
                        return true;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedWriter = bufferedWriter2;
                        UtdidLogger.se("FileUtils", e, new Object[0]);
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Exception e4) {
                                UtdidLogger.se("FileUtils", e4, new Object[0]);
                            }
                        }
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (Exception e5) {
                                UtdidLogger.se("FileUtils", e5, new Object[0]);
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
                                UtdidLogger.se("FileUtils", e6, new Object[0]);
                            }
                        }
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (Exception e7) {
                                UtdidLogger.se("FileUtils", e7, new Object[0]);
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

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return deleteFile(str);
        }
        return deleteDirectory(str);
    }

    private static boolean deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    private static boolean deleteDirectory(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb99617", new Object[]{str})).booleanValue();
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile()) {
                z = deleteFile(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                if (listFiles[i].isDirectory() && !(z = deleteDirectory(listFiles[i].getAbsolutePath()))) {
                    break;
                }
            }
        }
        if (z) {
            return file.delete();
        }
        return false;
    }
}
