package tb;

import android.app.Application;
import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ikt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Application application, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf21d3c", new Object[]{application, str, file})).booleanValue();
        }
        if (application == null || ikw.a((CharSequence) str) || file == null) {
            ikq.a("index_assets", " app=" + application + " fileName=" + str + " targetFile=" + file);
            return false;
        }
        AssetManager assets = application.getAssets();
        if (assets == null) {
            ikq.a("index_assets", "AssetsUtils -> copyAssetsToFile assets == null, wtf");
            return false;
        }
        iky.a(file);
        try {
            InputStream open = assets.open(str);
            iku.a(open, file);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (Throwable th) {
            ikq.a("AssetsUtils -> copyAssetsToFile ", th);
            iky.a(file);
            return false;
        }
    }

    public static byte[] a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1028e77c", new Object[]{application, str});
        }
        if (application == null || ikw.a((CharSequence) str)) {
            ikq.a("index_assets", "readStringFromAssets illegal args , app=" + application + ",  fileName=" + str);
            return null;
        }
        AssetManager assets = application.getAssets();
        if (assets == null) {
            ikq.a("index_assets", "readStringFromAssets assets == null, wtf");
            return null;
        }
        try {
            InputStream open = assets.open(str);
            byte[] a2 = ikv.a(open);
            if (open != null) {
                open.close();
            }
            return a2;
        } catch (Throwable th) {
            ikq.a("AssetsUtils -> readStringFromAssets", th);
            return null;
        }
    }
}
