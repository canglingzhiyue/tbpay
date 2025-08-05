package com.taobao.android.tcon;

import android.content.Context;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import tb.ico;

/* loaded from: classes.dex */
public class TconBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean loadRequiredLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccb543e1", new Object[0])).booleanValue();
        }
        try {
            ico.a();
            System.loadLibrary("tcon");
            Log.e(TconInitializer.TCON_TAG, "prglite initialized");
            return true;
        } catch (Throwable unused) {
            Log.e(TconInitializer.TCON_TAG, "prglite initialization failed");
            return false;
        }
    }

    public static void reportException(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49485ee4", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
            aVar.f3119a = str3;
            aVar.e = "1.0.0.6";
            aVar.b = AggregationType.CONTENT;
            aVar.d = str;
            aVar.j = str2;
            e.a().a(context, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41f260a1", new Object[]{str});
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void clearLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7144bd08", new Object[]{str});
        } else {
            new File(str).delete();
        }
    }
}
