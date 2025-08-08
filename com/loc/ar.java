package com.loc;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.riy;

/* loaded from: classes4.dex */
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    private static volatile aq f7663a;
    private static Properties b = b();

    private ar() {
    }

    public static aq a() {
        if (f7663a == null) {
            synchronized (ar.class) {
                if (f7663a == null) {
                    try {
                        aq a2 = a(Build.MANUFACTURER);
                        if ("".equals(a2.a())) {
                            Iterator it = Arrays.asList(aq.MIUI.a(), aq.Flyme.a(), aq.EMUI.a(), aq.ColorOS.a(), aq.FuntouchOS.a(), aq.SmartisanOS.a(), aq.AmigoOS.a(), aq.Sense.a(), aq.LG.a(), aq.Google.a(), aq.NubiaUI.a()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    a2 = aq.Other;
                                    break;
                                }
                                aq a3 = a((String) it.next());
                                if (!"".equals(a3.a())) {
                                    a2 = a3;
                                    break;
                                }
                            }
                        }
                        f7663a = a2;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return f7663a;
    }

    private static aq a(String str) {
        if (str == null || str.length() <= 0) {
            return aq.Other;
        }
        if (str.equals(aq.MIUI.a())) {
            aq aqVar = aq.MIUI;
            if (a(aqVar)) {
                return aqVar;
            }
        } else if (str.equals(aq.Flyme.a())) {
            aq aqVar2 = aq.Flyme;
            if (b(aqVar2)) {
                return aqVar2;
            }
        } else if (str.equals(aq.EMUI.a())) {
            aq aqVar3 = aq.EMUI;
            if (c(aqVar3)) {
                return aqVar3;
            }
        } else if (str.equals(aq.ColorOS.a())) {
            aq aqVar4 = aq.ColorOS;
            if (d(aqVar4)) {
                return aqVar4;
            }
        } else if (str.equals(aq.FuntouchOS.a())) {
            aq aqVar5 = aq.FuntouchOS;
            if (e(aqVar5)) {
                return aqVar5;
            }
        } else if (str.equals(aq.SmartisanOS.a())) {
            aq aqVar6 = aq.SmartisanOS;
            if (f(aqVar6)) {
                return aqVar6;
            }
        } else if (str.equals(aq.AmigoOS.a())) {
            aq aqVar7 = aq.AmigoOS;
            if (g(aqVar7)) {
                return aqVar7;
            }
        } else if (str.equals(aq.EUI.a())) {
            aq aqVar8 = aq.EUI;
            if (h(aqVar8)) {
                return aqVar8;
            }
        } else if (str.equals(aq.Sense.a())) {
            aq aqVar9 = aq.Sense;
            if (i(aqVar9)) {
                return aqVar9;
            }
        } else if (str.equals(aq.LG.a())) {
            aq aqVar10 = aq.LG;
            if (j(aqVar10)) {
                return aqVar10;
            }
        } else if (str.equals(aq.Google.a())) {
            aq aqVar11 = aq.Google;
            if (k(aqVar11)) {
                return aqVar11;
            }
        } else if (str.equals(aq.NubiaUI.a())) {
            aq aqVar12 = aq.NubiaUI;
            if (l(aqVar12)) {
                return aqVar12;
            }
        }
        return aq.Other;
    }

    private static void a(aq aqVar, String str) {
        Matcher matcher = Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                aqVar.a(group);
                aqVar.a(Integer.parseInt(group.split("\\.")[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean a(aq aqVar) {
        if (!StringUtils.isEmpty(b("ro.miui.ui.version.name"))) {
            String b2 = b(com.alibaba.security.realidentity.m.x);
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static String b(String str) {
        Properties properties = b;
        String property = properties.getProperty(riy.ARRAY_START_STR + str + riy.ARRAY_END_STR, null);
        return StringUtils.isEmpty(property) ? c(str) : property.replace(riy.ARRAY_START_STR, "").replace(riy.ARRAY_END_STR, "");
    }

    private static Properties b() {
        Properties properties = new Properties();
        try {
            properties.load(Runtime.getRuntime().exec("getprop").getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static boolean b(aq aqVar) {
        String b2 = b("ro.flyme.published");
        String b3 = b("ro.meizu.setupwizard.flyme");
        if (!StringUtils.isEmpty(b2) || !StringUtils.isEmpty(b3)) {
            String b4 = b("ro.build.display.id");
            a(aqVar, b4);
            aqVar.b(b4);
            return true;
        }
        return false;
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return readLine;
        } catch (IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static boolean c(aq aqVar) {
        String b2 = b(com.alibaba.security.realidentity.m.v);
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean d(aq aqVar) {
        String b2 = b(com.alibaba.security.realidentity.m.y);
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean e(aq aqVar) {
        String b2 = b(com.alibaba.security.realidentity.m.w);
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean f(aq aqVar) {
        String b2 = b("ro.smartisan.version");
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean g(aq aqVar) {
        String b2 = b("ro.build.display.id");
        if (StringUtils.isEmpty(b2) || !b2.matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean h(aq aqVar) {
        String b2 = b(com.alibaba.security.realidentity.m.z);
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean i(aq aqVar) {
        String b2 = b("ro.build.sense.version");
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean j(aq aqVar) {
        String b2 = b("sys.lge.lgmdm_version");
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean k(aq aqVar) {
        if ("android-google".equals(b("ro.com.google.clientidbase"))) {
            String b2 = b("ro.build.version.release");
            aqVar.a(Build.VERSION.SDK_INT);
            aqVar.b(b2);
            return true;
        }
        return false;
    }

    private static boolean l(aq aqVar) {
        String b2 = b("ro.build.nubia.rom.code");
        if (!StringUtils.isEmpty(b2)) {
            a(aqVar, b2);
            aqVar.b(b2);
            return true;
        }
        return false;
    }
}
