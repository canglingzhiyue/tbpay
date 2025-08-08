package com.taobao.tao.util;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.Globals;
import com.taobao.tao.TrackBuried;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes.dex */
public class AppUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(421774621);
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        try {
            return Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    public static Boolean isExistsSD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("32097dfb", new Object[0]);
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return true;
        }
        return false;
    }

    public static void unZipSelectedFiles(String str, String str2, String str3) throws ZipException, IOException {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5d69d9", new Object[]{str, str2, str3});
            return;
        }
        ZipFile zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement.getName().contains("../")) {
                    break;
                } else if (nextElement.getName().startsWith(str3)) {
                    File file = new File(str2, StringUtils.substring(nextElement.getName(), nextElement.getName().lastIndexOf("/") + 1, nextElement.getName().length()));
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    FileChannel fileChannel = null;
                    try {
                        inputStream = zipFile.getInputStream(nextElement);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                        fileOutputStream = null;
                    }
                    try {
                        fileChannel = fileOutputStream.getChannel();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileChannel.write(ByteBuffer.wrap(bArr, 0, read));
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            }
        } finally {
            zipFile.close();
        }
    }

    public static void copyfile(String str, String str2) throws Exception {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60101f8c", new Object[]{str, str2});
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static void removeNotify(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9028f", new Object[]{new Integer(i)});
        } else {
            ((NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(i);
        }
    }

    public static void fromPointTBS(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a90fad", new Object[]{intent, str});
        } else if (StringUtils.isEmpty(str) || intent == null) {
        } else {
            try {
                if (intent.getData() == null && StringUtils.isEmpty(intent.getStringExtra("myBrowserUrl"))) {
                    return;
                }
                Uri data = intent.getData();
                if (data == null) {
                    String stringExtra = intent.getStringExtra("myBrowserUrl");
                    if (!StringUtils.isEmpty(stringExtra)) {
                        data = Uri.parse(stringExtra);
                    }
                }
                if (data == null) {
                    return;
                }
                String queryParameter = data.getQueryParameter("point");
                String queryParameter2 = data.getQueryParameter("nav_source_id");
                String str2 = "frompoint:name" + queryParameter;
                String queryParameter3 = data.getQueryParameter(DispatchConstants.CARRIER);
                if (!StringUtils.isEmpty(queryParameter3)) {
                    TrackBuried.carrier = queryParameter3;
                }
                if (!StringUtils.isEmpty(queryParameter)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("_sb", queryParameter);
                    UTAnalytics.getInstance().updateSessionProperties(hashMap);
                    l.getInstance().updatePageProperties(hashMap);
                    Map map = (Map) JSON.parseObject(queryParameter, Map.class);
                    if (map != null && map.containsKey("ttid")) {
                        TrackBuried.bdid = (String) map.get("ttid");
                    }
                    if (StringUtils.isEmpty(TrackBuried.bdid)) {
                        TrackBuried.bdid = data.getQueryParameter("ttid");
                    }
                }
                if (StringUtils.isEmpty(queryParameter2)) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("nav_source_id", queryParameter2);
                l.getInstance().updatePageProperties(hashMap2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
