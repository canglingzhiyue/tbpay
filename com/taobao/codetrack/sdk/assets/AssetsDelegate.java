package com.taobao.codetrack.sdk.assets;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.assets.a;
import com.taobao.android.remoteso.api.assets.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import tb.ihq;
import tb.kft;
import tb.kga;

/* loaded from: classes7.dex */
public class AssetsDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final List<String> LAUNCH_ASSETS;
    private static final String TAG = "CodeTrack.assets";

    static {
        ArrayList arrayList = new ArrayList();
        LAUNCH_ASSETS = arrayList;
        arrayList.add("gateway2/newface_gateway2.json");
    }

    public static void proxy_close(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73525db", new Object[]{assetManager});
            return;
        }
        kft.a(TAG, "close, enter");
        kga.a("proxy_close", "");
        assetManager.close();
    }

    public static InputStream proxy_open(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("ac320ffc", new Object[]{assetManager, str});
        }
        kft.a(TAG, "open, enter, fileName=" + str);
        kga.a("proxy_open_S", str);
        if (LAUNCH_ASSETS.contains(str)) {
            kft.a(TAG, "hit LAUNCH_ASSETS skip remoAssets, " + str);
            return assetManager.open(str);
        }
        a bA_ = ihq.c().bA_();
        if (bA_.a(str).a()) {
            b b = bA_.b(str);
            InputStream a2 = b.a();
            if (a2 != null) {
                kft.a(TAG, "open, result success, from remote assets, fileName=" + str);
                return a2;
            }
            FileNotFoundException fileNotFoundException = new FileNotFoundException("taobao assets delegate, open remote assets failed, file=" + str);
            kft.a(TAG, "open, result failure, from remote assets, fileName=" + str + ", error=" + b, fileNotFoundException);
            throw fileNotFoundException;
        }
        return assetManager.open(str);
    }

    public static InputStream proxy_open(AssetManager assetManager, String str, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("8fb6d8ad", new Object[]{assetManager, str, new Integer(i)});
        }
        kft.a(TAG, "open, enter, fileName=" + str + ", accessMode=" + i);
        kga.a("proxy_open_SI", str);
        return assetManager.open(str, i);
    }

    public static String[] proxy_list(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("31c7a45c", new Object[]{assetManager, str});
        }
        kft.a(TAG, "list, enter, path=" + str);
        kga.a("proxy_list", str);
        return assetManager.list(str);
    }

    public static AssetFileDescriptor proxy_openFd(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("37c277b2", new Object[]{assetManager, str});
        }
        kft.a(TAG, "openFd, enter, fileName=" + str);
        kga.a("proxy_openFd", str);
        return assetManager.openFd(str);
    }

    public static AssetFileDescriptor proxy_openNonAssetFd(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("535d9035", new Object[]{assetManager, str});
        }
        kft.a(TAG, "openNonAssetFd, enter, fileName=" + str);
        kga.a("proxy_openNonAssetFd", str);
        return assetManager.openNonAssetFd(str);
    }

    public static AssetFileDescriptor proxy_openNonAssetFd(AssetManager assetManager, int i, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetFileDescriptor) ipChange.ipc$dispatch("4cd6b8d8", new Object[]{assetManager, new Integer(i), str});
        }
        kft.a(TAG, "openNonAssetFd, enter, cookie=" + i + ", fileName=" + str);
        kga.a("proxy_openNonAssetFd_IS", str);
        return assetManager.openNonAssetFd(i, str);
    }

    public static XmlResourceParser proxy_openXmlResourceParser(AssetManager assetManager, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("b7f49699", new Object[]{assetManager, str});
        }
        kft.a(TAG, "openXmlResourceParser, enter, fileName=" + str);
        kga.a("proxy_openXmlResourceParser", str);
        return assetManager.openXmlResourceParser(str);
    }

    public static XmlResourceParser proxy_openXmlResourceParser(AssetManager assetManager, int i, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("5b470842", new Object[]{assetManager, new Integer(i), str});
        }
        kft.a(TAG, "openXmlResourceParser, enter, cookie=" + i + ", fileName=" + str);
        kga.a("proxy_openXmlResourceParser_IS", str);
        return assetManager.openXmlResourceParser(i, str);
    }

    public static String[] proxy_getLocales(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4aadc097", new Object[]{assetManager});
        }
        kft.a(TAG, "getLocales, enter");
        kga.a("proxy_getLocales", "");
        return assetManager.getLocales();
    }
}
