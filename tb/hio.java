package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taolive.sdk.goodlist.b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class hio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2006735757);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            new a(context, str).start();
        } catch (Exception e) {
            his.b("CacheUtils", "setTemplateCache Error: " + e.getMessage());
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), str);
            InputStreamReader inputStreamReader = new InputStreamReader(proxy_open, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    proxy_open.close();
                    his.a("CacheUtils", "getAssetString | name=" + str);
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            his.b("CacheUtils", "getAssetString | name=" + str + "error:" + e.toString());
            return "";
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            return b.a(context.getCacheDir().getPath(), "template_list.json");
        } catch (Exception e) {
            his.b("CacheUtils", "getTemplateCache Error: " + e.getMessage());
            return null;
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f28692a;
        public WeakReference<String> b;

        static {
            kge.a(1174650933);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, String str) {
            super("live_gl_cache_template");
            this.f28692a = new WeakReference<>(context);
            this.b = new WeakReference<>(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            super.run();
            WeakReference<Context> weakReference = this.f28692a;
            if (weakReference == null || this.b == null || weakReference.get() == null) {
                return;
            }
            try {
                b.a(this.f28692a.get().getCacheDir().getPath(), "template_list.json", this.b.get());
            } catch (Exception e) {
                his.b("CacheUtils", "CacheSetTemplateThread Run Error: " + e.getMessage());
            }
        }
    }
}
