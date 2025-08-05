package com.taobao.android.weex.util;

import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import tb.kge;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f15897a;
    public static String[] b;

    static {
        kge.a(-843562904);
        f15897a = new String[]{"bundle_url", MUSAppMonitor.SCRIPT_URL, MUSAppMonitor.BYTECODE};
        b = new String[]{MUSMonitor.KEY_DOWNLOAD_TIME, MUSMonitor.KEY_BG_TIME_JS, MUSMonitor.KEY_BG_TIME_ALL, MUSMonitor.KEY_MAIN_TIME_ALL, MUSMonitor.KEY_MEM_SIZE, MUSMonitor.KEY_MEM_MAX_SIZE, MUSMonitor.KEY_PAGE_WLM_DOWNLOAD};
    }
}
