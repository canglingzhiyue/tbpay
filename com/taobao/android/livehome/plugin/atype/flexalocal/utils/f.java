package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.content.Context;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(189877201);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        String a2 = p.a(context, "taobao_live_home_isFLYME");
        if (!l.a((CharSequence) a2)) {
            return "true".equals(a2);
        }
        if (a("persist.sys.use.flyme.icon", "ro.meizu.setupwizard.flyme", "ro.flyme.published")) {
            p.a(context, "taobao_live_home_isFLYME", "true");
            return true;
        }
        try {
            a a3 = a.a();
            if (a3.a((Object) "ro.build.display.id")) {
                String a4 = a3.a("ro.build.display.id");
                if (!StringUtils.isEmpty(a4) && a4.contains("Flyme")) {
                    p.a(context, "taobao_live_home_isFLYME", "true");
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.a(context, "taobao_live_home_isFLYME", "false");
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        String a2 = p.a(context, "taobao_live_home_isMIUI");
        if (l.a((CharSequence) a2)) {
            boolean a3 = a("ro.miui.ui.version.code", "ro.miui.ui.version.name", "ro.miui.internal.storage");
            if (a3) {
                p.a(context, "taobao_live_home_isMIUI", "true");
            } else {
                p.a(context, "taobao_live_home_isMIUI", "false");
            }
            return a3;
        }
        return "true".equals(a2);
    }

    private static boolean a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{strArr})).booleanValue();
        }
        if (strArr != null && strArr.length != 0) {
            try {
                a a2 = a.a();
                for (String str : strArr) {
                    if (a2.a(str) != null) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Properties f14220a = new Properties();

        static {
            kge.a(-2128612530);
        }

        private a() throws IOException {
            FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            this.f14220a.load(fileInputStream);
            fileInputStream.close();
        }

        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : this.f14220a.containsKey(obj);
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f14220a.getProperty(str);
        }

        public static a a() throws IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7540d361", new Object[0]) : new a();
        }
    }
}
