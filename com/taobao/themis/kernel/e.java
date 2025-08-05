package com.taobao.themis.kernel;

import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static final String TMS_ERR_APPINFO_PREFIX = "TMS_ERR_AI_";
    public static final String TMS_ERR_ENGINE_MIX_DATA = "TMS_ERR_ENGINE_MIX_DATA";
    public static final String TMS_ERR_ENGINE_MIX_H5_RENDER = "TMS_ERR_ENGINE_MIX_H5_RENDER";
    public static final String TMS_ERR_RENDER_PREFIX = "TMS_ERR_";

    /* renamed from: a  reason: collision with root package name */
    public static e f22510a;
    public static e b;
    public static e c;
    public static e g;
    public static e h;
    public static e i;
    public static e l;
    public static e m;
    public String d;
    public String e;
    public String f;
    public String j;
    public String k;

    /* loaded from: classes9.dex */
    public static final class a {
        public static final e APP_ID_DIS_MATCH;
        public static final String TMS_ERR_MANIFEST_PREFIX = "TMS_ERR_MT_";
        public static final e URL_EMPTY;
        public static final e URL_NOT_MATCH;

        static {
            kge.a(1868485833);
            URL_NOT_MATCH = new e("TMS_ERR_MT_URL_NOT_MATCH", "Manifest内页url与投放链接url不匹配", "对不起，加载失败，请尝试重新打开当前页面");
            APP_ID_DIS_MATCH = new e("TMS_ERR_MT_APPID_DISMATCH", "当前UniApp打开页面的appID与manifest不匹配", "");
            URL_EMPTY = new e("TMS_ERR_MT_URL_EMPTY", "Manifest请求URL为空", "对不起，加载失败，请尝试重新打开当前页面");
        }
    }

    static {
        kge.a(1383973098);
        f22510a = new e("TMS_ERR_ENGINE_INVALID", "当前手淘版本不支持这种类型的engine", "升级到客户端最新版本才能打开这个页面");
        b = new e("TMS_ERR_GET_PREFETCH_APPINFO", "TMS_ERR_GET_PREFETCH_APPINFO", "别紧张，休息一会再来试试吧...");
        c = new e("TMS_ERR_CANVAS_LOAD_FAIL", "themis_graphics remoteSo 加载失败", "对不起，加载失败，请尝试重新打开当前页面");
        g = new e("TMS_ERR_CAN_NOT_CREATE_PAGE", "Page创建失败", "对不起，加载失败，请尝试重新打开当前页面");
        l = new e("TMS_ERR_TIMEOUT", "时间超时了", "对不起，加载失败，请尝试重新打开当前页面");
        h = new e("TMS_PAGE_ERROR", "页面错误，需要降级", "页面错误，需要降级");
        i = new e("TMS_DEPRECATED_DOWNGRADE", "页面错误，需要降级", "页面错误，需要降级");
        m = new e("TMS_ERR_HITSNAPSHOT", "页面错误，需要降级", "页面错误，需要降级");
    }

    public e(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public e(String str, String str2, String str3, String str4, String str5) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.j = str4;
        this.k = str5;
    }
}
