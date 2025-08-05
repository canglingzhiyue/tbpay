package com.android.taobao.aop;

import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.report.ReportType;
import com.android.taobao.aop.report.ResModel;
import io.unicorn.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes3.dex */
public class ANDROID_CONTENT_RES_ASSETMANAGER_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static com.android.taobao.aop.report.a sUsageReporter;

    static {
        kge.a(772330625);
        sUsageReporter = com.android.taobao.aop.report.a.a();
    }

    public static InputStream proxy_open(AssetManager assetManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("ac320ffc", new Object[]{assetManager, str});
        }
        InputStream inputStream = null;
        try {
            inputStream = assetManager.open(str);
            sUsageReporter.a(ReportType.ASSETS, new ResModel("com.taobao.taobao", FlutterActivityLaunchConfigs.EXTRA_RENDER_TYPE_ASSET, str), 0);
            return inputStream;
        } catch (IOException e) {
            e.printStackTrace();
            return inputStream;
        }
    }

    public static InputStream proxy_open_1(AssetManager assetManager, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("984168fb", new Object[]{assetManager, str, new Integer(i)});
        }
        InputStream inputStream = null;
        try {
            inputStream = assetManager.open(str, i);
            sUsageReporter.a(ReportType.ASSETS, new ResModel("com.taobao.taobao", FlutterActivityLaunchConfigs.EXTRA_RENDER_TYPE_ASSET, str), 0);
            return inputStream;
        } catch (IOException e) {
            e.printStackTrace();
            return inputStream;
        }
    }
}
