package com.taobao.taolive.sdk.goodlist;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1530479818);
    }

    public static void a(String str, String str2, String str3) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            com.taobao.taolive.sdk.utils.q.b(com.alibaba.security.realidentity.f.f3394a, "文件夹创建失败");
            return;
        }
        File file2 = new File(str + File.separator + str2);
        if (!file2.exists() && !file2.createNewFile()) {
            com.taobao.taolive.sdk.utils.q.b(com.alibaba.security.realidentity.f.f3394a, "文件创建失败");
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(str3.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static String a(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        File file = new File(str + File.separator + str2);
        if (!file.exists()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
