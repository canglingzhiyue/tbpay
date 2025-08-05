package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.gsu;
import tb.gsv;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13016a;

    static {
        kge.a(-2075341473);
    }

    private g(Context context) {
        this.f13016a = context;
    }

    private boolean a(e eVar) {
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ce5ddf8", new Object[]{this, eVar})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            gsv.a("ProfileInstaller", "Install profile, length=" + eVar.c.length);
            String format = String.format("/data/misc/profiles/cur/0/%s/%s", this.f13016a.getPackageName(), "primary.prof");
            gsv.a("ProfileInstaller", "Install to destination=" + format);
            FileOutputStream fileOutputStream2 = new FileOutputStream(format);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedOutputStream.write(eVar.c);
                    bufferedOutputStream.flush();
                    gsv.a("ProfileInstaller", "Profile installed success!");
                    gsu.a(fileOutputStream2);
                    gsu.a(bufferedOutputStream);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        gsv.a("ProfileInstaller", "Install profile failed:" + e.getMessage());
                        gsu.a(fileOutputStream);
                        gsu.a(bufferedOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        gsu.a(fileOutputStream);
                        gsu.a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    gsu.a(fileOutputStream);
                    gsu.a(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public static boolean a(Context context, e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34e69b00", new Object[]{context, eVar})).booleanValue() : new g(context).a(eVar);
    }
}
