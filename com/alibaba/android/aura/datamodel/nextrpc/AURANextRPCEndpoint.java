package com.alibaba.android.aura.datamodel.nextrpc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.kge;

/* loaded from: classes2.dex */
public class AURANextRPCEndpoint implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_RETRY_TIME = 1;
    private static final int INVALID_BIZID = -1;
    private int mAllTimeOutSeconds;
    private String mApi;
    private AttachedResponseStrategy mAttachedResponseStrategy;
    private int mBizId;
    private Map<String, String> mDataParams;
    private String mDomain;
    private boolean mMainThread;
    private boolean mNeedEncode;
    private boolean mNeedSession;
    private b mNextRPCPrefetch;
    private String mPageUrl;
    private boolean mPostMethod;
    private MtopPrefetch.IPrefetchComparator mPrefetchComparator;
    private int mPrefetchMode;
    private Map<String, String> mRequestHeaders;
    private int mRetryTime;
    private int mSingleRequestTimeout;
    private int mSocketTimeoutMilliSecond;
    private boolean mStreamModel;
    private String mTTid;
    private String mTopic;
    private String mUnitStrategy;
    private boolean mUseWua;
    private String mVersion;

    /* loaded from: classes2.dex */
    public enum AttachedResponseStrategy {
        IMMEDIATELY,
        FULL
    }

    static {
        kge.a(-180971316);
        kge.a(1028243835);
    }

    public AURANextRPCEndpoint(a aVar) {
        this.mApi = "";
        this.mVersion = "1.0";
        this.mNeedSession = false;
        this.mNeedEncode = false;
        this.mDataParams = null;
        this.mPostMethod = true;
        this.mDomain = "";
        this.mUnitStrategy = "";
        this.mBizId = -1;
        this.mUseWua = false;
        this.mRequestHeaders = null;
        this.mRetryTime = 1;
        this.mMainThread = true;
        if (aVar == null) {
            return;
        }
        this.mApi = a.a(aVar);
        this.mVersion = a.b(aVar);
        this.mRequestHeaders = a.c(aVar);
        this.mDataParams = a.d(aVar);
        this.mDomain = a.e(aVar);
        this.mUnitStrategy = a.f(aVar);
        this.mUseWua = a.g(aVar);
        this.mPostMethod = a.h(aVar);
        this.mBizId = a.i(aVar);
        this.mNeedSession = a.j(aVar);
        this.mNeedEncode = a.k(aVar);
        this.mTTid = a.l(aVar);
        this.mPageUrl = a.m(aVar);
        this.mSingleRequestTimeout = a.n(aVar);
        this.mSocketTimeoutMilliSecond = a.o(aVar);
        this.mRetryTime = a.p(aVar);
        this.mAttachedResponseStrategy = a.q(aVar);
        this.mAllTimeOutSeconds = a.r(aVar);
        this.mMainThread = a.s(aVar);
        this.mNextRPCPrefetch = a.t(aVar);
        this.mTopic = a.u(aVar);
        this.mStreamModel = a.v(aVar);
        this.mPrefetchMode = a.w(aVar);
        this.mPrefetchComparator = a.x(aVar);
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.mApi;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.mVersion;
    }

    public boolean isPostMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a99b176", new Object[]{this})).booleanValue() : this.mPostMethod;
    }

    public boolean isNeedSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue() : this.mNeedSession;
    }

    public boolean isNeedEncode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("597a70a1", new Object[]{this})).booleanValue() : this.mNeedEncode;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this}) : this.mDomain;
    }

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : this.mUnitStrategy;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.mBizId;
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue() : this.mUseWua;
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.mTopic;
    }

    public boolean getStreamModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4755d55e", new Object[]{this})).booleanValue() : this.mStreamModel;
    }

    public int getPrefetchMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93d69b2a", new Object[]{this})).intValue() : this.mPrefetchMode;
    }

    public MtopPrefetch.IPrefetchComparator getPrefetchComparator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopPrefetch.IPrefetchComparator) ipChange.ipc$dispatch("89482c5c", new Object[]{this}) : this.mPrefetchComparator;
    }

    public int getSocketTimeoutMilliSecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2f434c3", new Object[]{this})).intValue() : this.mSocketTimeoutMilliSecond;
    }

    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this}) : this.mRequestHeaders;
    }

    public Map<String, String> getDataParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this}) : this.mDataParams;
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : this.mTTid;
    }

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this}) : this.mPageUrl;
    }

    public int getTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue() : this.mSingleRequestTimeout;
    }

    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue() : this.mRetryTime;
    }

    public AttachedResponseStrategy getAttachedResponseStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AttachedResponseStrategy) ipChange.ipc$dispatch("84c3eb36", new Object[]{this}) : this.mAttachedResponseStrategy;
    }

    public int getAllTimeOutSeconds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8066943", new Object[]{this})).intValue() : this.mAllTimeOutSeconds;
    }

    public boolean useMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue() : this.mMainThread;
    }

    public b getNextRPCPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("73b02b41", new Object[]{this}) : this.mNextRPCPrefetch;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (!StringUtils.isBlank(this.mApi) && !StringUtils.isBlank(this.mVersion)) {
            return StringUtils.concatStr2LowerCase(this.mApi, this.mVersion);
        }
        return null;
    }

    public void appendHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac539d92", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            Map<String, String> map2 = this.mRequestHeaders;
            if (map2 != null) {
                map2.putAll(map);
            } else {
                this.mRequestHeaders = map;
            }
        }
    }

    public void appendParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761956de", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (this.mDataParams != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!StringUtils.isEmpty(entry.getKey())) {
                        replaceMapValue(this.mDataParams, entry.getKey(), entry.getValue());
                    }
                }
                return;
            }
            this.mDataParams = map;
        }
    }

    private void replaceMapValue(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ac5fc9", new Object[]{this, map, str, str2});
        } else if (map.containsKey(str)) {
            JSONObject json = getJson(str2);
            JSONObject json2 = getJson(map.get(str));
            if (json != null && json2 != null) {
                json2.putAll(json);
                map.put(str, json2.toJSONString());
                return;
            }
            map.put(str, str2);
        } else {
            map.put(str, str2);
        }
    }

    private JSONObject getJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a8ea448f", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2125a;
        private String g;
        private String h;
        private Map<String, String> k;
        private Map<String, String> l;
        private String m;
        private String n;
        private int p;
        private AttachedResponseStrategy r;
        private int s;
        private b u;
        private String v;
        private boolean w;
        private int x;
        private MtopPrefetch.IPrefetchComparator y;
        private String b = "1.0";
        private final int c = 15000;
        private boolean d = true;
        private boolean e = false;
        private boolean f = true;
        private int i = -1;
        private boolean j = false;
        private int o = 15000;
        private int q = 1;
        private boolean t = true;

        static {
            kge.a(877519779);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfba632", new Object[]{aVar}) : aVar.f2125a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f56bd11", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("abc6f4e5", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ Map d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("63b36266", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("966801ae", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8c3188d", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fb923b8", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42e4d6f9", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26108a29", new Object[]{aVar})).intValue() : aVar.i;
        }

        public static /* synthetic */ boolean j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93c3d7b", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec67f0bc", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ String l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46e5a1c7", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ String m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a940b8a6", new Object[]{aVar}) : aVar.n;
        }

        public static /* synthetic */ int n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95eb0a6e", new Object[]{aVar})).intValue() : aVar.o;
        }

        public static /* synthetic */ int o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7916bdaf", new Object[]{aVar})).intValue() : aVar.p;
        }

        public static /* synthetic */ int p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c4270f0", new Object[]{aVar})).intValue() : aVar.q;
        }

        public static /* synthetic */ AttachedResponseStrategy q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AttachedResponseStrategy) ipChange.ipc$dispatch("3f0078df", new Object[]{aVar}) : aVar.r;
        }

        public static /* synthetic */ int r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2299d772", new Object[]{aVar})).intValue() : aVar.s;
        }

        public static /* synthetic */ boolean s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c58ac4", new Object[]{aVar})).booleanValue() : aVar.t;
        }

        public static /* synthetic */ b t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8d23537a", new Object[]{aVar}) : aVar.u;
        }

        public static /* synthetic */ String u(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc196f9e", new Object[]{aVar}) : aVar.v;
        }

        public static /* synthetic */ boolean v(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af48a487", new Object[]{aVar})).booleanValue() : aVar.w;
        }

        public static /* synthetic */ int w(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("927457b7", new Object[]{aVar})).intValue() : aVar.x;
        }

        public static /* synthetic */ MtopPrefetch.IPrefetchComparator x(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MtopPrefetch.IPrefetchComparator) ipChange.ipc$dispatch("5f5850a1", new Object[]{aVar}) : aVar.y;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21702faa", new Object[]{this, str});
            }
            this.f2125a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("83cb4689", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("73e25fb0", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e6265d68", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("10949d61", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("570e12f1", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3a39c632", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48817447", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f92b8e4", new Object[]{this, str});
            }
            this.v = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aadc8b26", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3c050a2", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1d657973", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f396ff1f", new Object[]{this, map});
            }
            this.k = map;
            return this;
        }

        public a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ab836ca0", new Object[]{this, map});
            }
            this.l = map;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d37a205", new Object[]{this, str});
            }
            this.n = str;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6ec03e3", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ba17b724", new Object[]{this, new Integer(i)});
            }
            this.s = i;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("912cb4", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4cede40f", new Object[]{this, bVar});
            }
            this.u = bVar;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e3bcdff5", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d436a65", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public a a(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("54de2c04", new Object[]{this, iPrefetchComparator});
            }
            this.y = iPrefetchComparator;
            return this;
        }

        public AURANextRPCEndpoint a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this});
            }
            b();
            return new AURANextRPCEndpoint(this);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.f2125a == null) {
                throw new IllegalArgumentException("param api can not be null");
            } else {
                if (this.b == null) {
                    throw new IllegalArgumentException("param version can not be null");
                }
            }
        }
    }
}
