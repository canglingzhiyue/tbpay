package com.taobao.alivfssdk.fresco.common.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1369996603);
    }

    public static void a(File file, b bVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad2388b", new Object[]{file, bVar});
        } else {
            a(file, bVar, 0);
        }
    }

    public static void a(File file, b bVar, int i) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f754bd8", new Object[]{file, bVar, new Integer(i)});
        } else if (i <= 10 && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, bVar, i + 1);
                } else {
                    bVar.a(file2);
                }
            }
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= b(file2);
            }
        }
        return z;
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }
}
