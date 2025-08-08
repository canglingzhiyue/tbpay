package com.taobao.taopai.business.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTER_ID = "filter_id";
    public static final String KEY_FILTER_ID = "ugc_utFilterId";
    public static final String KEY_STICKER_IDS = "ugc_utStickerIds";
    public static final String KEY_STICKER_URLS = "ugc_utStickerUrls";
    public static final String KEY_TEMPLATES_ID = "ugc_utTemplatesApplied";
    public static final String STICKER_IDS = "sticker_ids";
    public static final String STICKER_URLS = "sticker_urls";
    public static final String TEMPLATE_APPLIED = "templatesApplied";
    public static final String TEMPLATE_ID = "template_id";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f22060a;

    static {
        kge.a(-455823026);
        f22060a = new HashMap();
    }

    public static synchronized void a(String str, String str2) {
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            } else {
                f22060a.put(str, str2);
            }
        }
    }

    public static synchronized void a() {
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                f22060a.clear();
            }
        }
    }

    public static synchronized String a(String str) {
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            return f22060a.get(str);
        }
    }

    public static synchronized void b(String str) {
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            } else {
                f22060a.put(KEY_FILTER_ID, str);
            }
        }
    }

    public static synchronized String b() {
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            return f22060a.get(KEY_TEMPLATES_ID);
        }
    }

    public static synchronized void c(String str) {
        String str2;
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
                return;
            }
            String str3 = f22060a.get(KEY_STICKER_URLS);
            if (StringUtils.isEmpty(str3)) {
                str2 = "";
            } else {
                str2 = str3 + ",";
            }
            f22060a.put(KEY_STICKER_URLS, str2 + str);
        }
    }

    public static synchronized void d(String str) {
        String replace;
        synchronized (y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
                return;
            }
            String str2 = f22060a.get(KEY_STICKER_URLS);
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            String str3 = "," + str;
            String str4 = str + ",";
            if (str2.endsWith(str3)) {
                replace = str2.replace(str3, "");
            } else {
                replace = str2.replace(str4, "");
            }
            f22060a.put(KEY_STICKER_URLS, replace);
        }
    }
}
