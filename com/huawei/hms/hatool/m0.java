package com.huawei.hms.hatool;

import android.os.Build;
import android.util.Log;

/* loaded from: classes4.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7473a = false;
    private int b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.313" + p.a();
    }

    public void a(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 19) {
            sb.append(System.lineSeparator());
            sb.append("======================================= ");
            sb.append(System.lineSeparator());
            sb.append(a());
            sb.append("");
            sb.append(System.lineSeparator());
            str = "=======================================";
        } else {
            sb.append("====================");
            sb.append(a());
            str = "===================";
        }
        sb.append(str);
        sb.toString();
        this.b = i;
        this.f7473a = true;
    }

    public void a(int i, String str, String str2) {
        if (i == 3 || i == 5 || i != 6) {
            return;
        }
        Log.e(str, str2);
    }

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", str + "=> " + str2);
    }

    public boolean b(int i) {
        return this.f7473a && i >= this.b;
    }
}
