package com.android.dingtalk.share.ddsharemodule.algorithm;

import com.alibaba.security.ccrc.service.build.C1238p;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import tb.kge;

/* loaded from: classes3.dex */
public class MD5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(255475);
    }

    public static final String getMessageDigest(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6f2263d", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length << 1];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final byte[] getRawDigest(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6838fcf9", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getMD5(FileInputStream fileInputStream, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("133eb8fd", new Object[]{fileInputStream, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (fileInputStream != null && i > 0 && i2 >= 0 && i3 > 0) {
            long j = i2;
            try {
                if (fileInputStream.skip(j) < j) {
                    return null;
                }
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                StringBuilder sb = new StringBuilder(32);
                byte[] bArr = new byte[i];
                int i4 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1 || i4 >= i3) {
                        break;
                    }
                    int i5 = i4 + read;
                    if (i5 <= i3) {
                        messageDigest.update(bArr, 0, read);
                        i4 = i5;
                    } else {
                        messageDigest.update(bArr, 0, i3 - i4);
                        i4 = i3;
                    }
                }
                for (byte b : messageDigest.digest()) {
                    sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final String getMD5(FileInputStream fileInputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6355589d", new Object[]{fileInputStream, new Integer(i)});
        }
        if (fileInputStream != null && i > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                StringBuilder sb = new StringBuilder(32);
                byte[] bArr = new byte[i];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                for (byte b : messageDigest.digest()) {
                    sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getMD5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        return getMD5(file, (int) C1238p.b);
    }

    public static String getMD5(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c149273a", new Object[]{file}) : getMD5(file, (int) C1238p.b);
    }

    public static String getMD5(File file, int i) {
        FileInputStream fileInputStream;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a95aa8a3", new Object[]{file, new Integer(i)});
        }
        if (file != null && i > 0 && file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                j = i;
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                if (j > file.length()) {
                    j = file.length();
                }
                String md5 = getMD5(fileInputStream, (int) j);
                fileInputStream.close();
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                return md5;
            } catch (Exception unused3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public static String getMD5(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c86d4a7", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        return getMD5(file, i, i2);
    }

    public static String getMD5(File file, int i, int i2) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c379545a", new Object[]{file, new Integer(i), new Integer(i2)});
        }
        FileInputStream fileInputStream2 = null;
        if (file != null && file.exists() && i >= 0 && i2 > 0) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                String md5 = getMD5(fileInputStream, C1238p.b, i, i2);
                fileInputStream.close();
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                return md5;
            } catch (Exception unused3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        }
        return null;
    }
}
