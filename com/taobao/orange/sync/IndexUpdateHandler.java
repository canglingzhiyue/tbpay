package com.taobao.orange.sync;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.orq;

/* loaded from: classes7.dex */
public class IndexUpdateHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<IndexUpdateInfo> f18586a;
    private static volatile long b;
    private static boolean c;

    static {
        kge.a(-1438913355);
        b = 0L;
        c = true;
        f18586a = new HashSet();
    }

    public static void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (com.taobao.orange.util.a.c(com.taobao.orange.a.g) && c) {
            OLog.w("IndexUpdateHandler", "checkIndexUpdate skip as in com.taobao.taobao package", new Object[0]);
        } else {
            synchronized (IndexUpdateHandler.class) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - b <= orq.FRAME_CHECK_TIMEOUT) {
                    OLog.w("IndexUpdateHandler", "checkIndexUpdate too frequently, interval should more than 20s", new Object[0]);
                    return;
                }
                b = currentTimeMillis;
                OLog.i("IndexUpdateHandler", "checkIndexUpdate", OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str, "versionIndexVersion", str2);
                com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.sync.IndexUpdateHandler.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            IndexUpdateHandler.a(new a<String>(null, false, com.taobao.orange.a.y == 0 ? OConstant.REQTYPE_INDEX_UPDATE : OConstant.REQTYPE_PROBE_UPDATE) { // from class: com.taobao.orange.sync.IndexUpdateHandler.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public String a(String str3) {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("9f352ae", new Object[]{this, str3}) : str3;
                                }

                                @Override // com.taobao.orange.sync.a
                                public String b() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this});
                                    }
                                    return null;
                                }

                                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                                @Override // com.taobao.orange.sync.a
                                public /* synthetic */ String b(String str3) {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("6e4e661f", new Object[]{this, str3}) : a(str3);
                                }

                                @Override // com.taobao.orange.sync.a
                                public Map<String, String> a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return (Map) ipChange3.ipc$dispatch("a014a89d", new Object[]{this});
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put(OConstant.KEY_CLIENTAPPINDEXVERSION, str);
                                    hashMap.put(OConstant.KEY_CLIENTVERSIONINDEXVERSION, str2);
                                    return hashMap;
                                }
                            }.c(), true);
                        }
                    }
                });
            }
        }
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            IndexUpdateInfo b2 = b(str, z);
            if (b2 == null || !b2.checkValid()) {
                return;
            }
            synchronized (f18586a) {
                if (!f18586a.add(b2)) {
                    if (OLog.isPrintLog(0)) {
                        OLog.v("IndexUpdateHandler", "updateIndex is ongoing", new Object[0]);
                    }
                    return;
                }
                if (OLog.isPrintLog(2)) {
                    OLog.i("IndexUpdateHandler", "updateIndex", b2);
                }
                com.taobao.orange.a.p = "https".equalsIgnoreCase(b2.protocol) ? "https" : "http";
                ConfigCenter.getInstance().updateIndex(b2);
                synchronized (f18586a) {
                    f18586a.remove(b2);
                }
            }
        } catch (Throwable th) {
            OLog.e("IndexUpdateHandler", "updateIndex", th, new Object[0]);
        }
    }

    private static IndexUpdateInfo b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndexUpdateInfo) ipChange.ipc$dispatch("c1594ef8", new Object[]{str, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            return (IndexUpdateInfo) JSON.parseObject(str, IndexUpdateInfo.class);
        }
        String[] split = str.split("&");
        if (split == null) {
            return null;
        }
        IndexUpdateInfo indexUpdateInfo = new IndexUpdateInfo();
        for (String str2 : split) {
            if (str2 != null) {
                String substring = str2.substring(str2.indexOf("=") + 1);
                if (str2.startsWith("cdn")) {
                    indexUpdateInfo.cdn = substring.trim();
                } else if (str2.startsWith("md5")) {
                    indexUpdateInfo.md5 = substring.trim();
                } else if (str2.startsWith(IndexUpdateInfo.SYNC_KEY_RESOURCEID)) {
                    indexUpdateInfo.resourceId = substring.trim();
                } else if (str2.startsWith("protocol")) {
                    indexUpdateInfo.protocol = substring;
                } else if (str2.startsWith("baseVersion")) {
                    indexUpdateInfo.baseVersion = substring.trim();
                }
            }
        }
        return indexUpdateInfo;
    }

    /* loaded from: classes7.dex */
    public static class IndexUpdateInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String SYNC_KEY_BASE_VERSION = "baseVersion";
        public static final String SYNC_KEY_CDN = "cdn";
        public static final String SYNC_KEY_MD5 = "md5";
        public static final String SYNC_KEY_PROTOCOL = "protocol";
        public static final String SYNC_KEY_RESOURCEID = "resourceId";
        public String baseVersion;
        public String cdn;
        public String md5;
        public String protocol;
        public String resourceId;

        static {
            kge.a(1057028474);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IndexUpdateInfo{cdn='" + this.cdn + "', resourceId='" + this.resourceId + "', md5='" + this.md5 + "', protocol='" + this.protocol + "', baseVersion='" + this.baseVersion + "'}";
        }

        public boolean checkValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
            }
            if (!StringUtils.isEmpty(this.cdn) && !StringUtils.isEmpty(this.resourceId) && !StringUtils.isEmpty(this.md5)) {
                return true;
            }
            OLog.w("IndexUpdateHandler", "lack param", new Object[0]);
            return false;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IndexUpdateInfo indexUpdateInfo = (IndexUpdateInfo) obj;
            if (!this.cdn.equals(indexUpdateInfo.cdn) || !this.resourceId.equals(indexUpdateInfo.resourceId)) {
                return false;
            }
            return this.md5.equals(indexUpdateInfo.md5);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((this.cdn.hashCode() * 31) + this.resourceId.hashCode()) * 31) + this.md5.hashCode();
        }
    }
}
