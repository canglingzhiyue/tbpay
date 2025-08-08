package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes6.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f14224a;
    private static final String b;

    static {
        kge.a(-267625941);
        b = p.class.getSimpleName();
        f14224a = "taobao_live_home";
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (l.a((CharSequence) str)) {
            return null;
        }
        try {
            com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(f14224a);
            if (cacheForModule != null) {
                return cacheForModule.a(cacheForModule.c()).a(new com.taobao.alivfssdk.cache.c()).a().b(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{str, obj})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(f14224a);
            if (cacheForModule != null) {
                return cacheForModule.a(cacheForModule.c()).a(new com.taobao.alivfssdk.cache.c()).a().a(str, obj);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null && !l.a((CharSequence) str)) {
            try {
                return context.getSharedPreferences(f14224a, 0).getString(str, "");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && !l.a((CharSequence) str)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(f14224a, 0).edit();
                edit.putString(str, str2);
                edit.apply();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                } catch (Exception e) {
                    TLog.loge(b, "read assets close stream exp.", e);
                }
                return byteArrayOutputStream2;
            } catch (Exception e2) {
                TLog.loge(b, "read assets write buffer exp.", e2);
                try {
                    byteArrayOutputStream.close();
                    proxy_open.close();
                    return null;
                } catch (Exception e3) {
                    TLog.loge(b, "read assets close stream exp.", e3);
                    return null;
                }
            }
        } catch (Exception e4) {
            TLog.loge(b, "read assets open assets exp.", e4);
            return null;
        }
    }
}
