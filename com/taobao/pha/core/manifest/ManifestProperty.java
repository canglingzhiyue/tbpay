package com.taobao.pha.core.manifest;

import tb.kge;

/* loaded from: classes7.dex */
public class ManifestProperty {

    /* renamed from: a  reason: collision with root package name */
    public long f18743a;
    public long b;
    public long c;
    public long d;
    public String e = "";
    public String f = "";
    public int g = 0;
    public String h = null;
    public int i = 0;

    /* loaded from: classes7.dex */
    public @interface CacheType {
        public static final int EXPIRED = 2;
        public static final int HIT = 1;
        public static final int UNHIT = 0;
    }

    /* loaded from: classes7.dex */
    public @interface PHAManifest {
        public static final String DEFAULT = "default";
        public static final String H5URL = "h5url";
        public static final String UPDATE = "update";
    }

    /* loaded from: classes7.dex */
    public @interface SourceType {
        public static final int CACHE = 2;
        public static final int NETWORK = 3;
        public static final int NONE = 0;
        public static final int PRESET = 1;
        public static final int THIRD_PARTY = 4;
    }

    static {
        kge.a(-1636159091);
    }
}
