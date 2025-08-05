package com.alibaba.android.icart.core.data.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class RequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECKED_COUNT = "checkedCount";
    public static final String CUSTOM_EXPARAMS = "customExParams";
    public static final String FIRST_PAGE_PRELOAD = "firstPagePreLoad";
    public static final String INSTANCE_ID = "instanceId";
    public static final String IS_FULL_DATA_QUERY = "isFullDataQuery";
    public static final String IS_ICART_CHANGE_MODE = "iCartChangeMode";
    public static final String IS_ICART_IS_FIRST_REQUEST = "isFirstRequest";
    public static final String IS_POP_LAYER_FIRST_PAGE = "isPopLayerFirstPage";
    public static final String IS_POP_LAYE_RQUERY = "isPopLayerRequest";
    public static final String IS_PRE_LOADV2 = "isPreLoadV2";
    public static final String IS_SUPPORT_WIDGET = "isSupportWidget";
    public static final String IS_WIDGET_INSTALLED = "isWidgetInstalled";
    public static final String NO_CACHE_OF_FIRST_PAGE = "noCacheOfFirstPage";
    private static final List<String> m;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2303a;
    private IDMComponent b;
    private bmz c;
    private Object d;
    private Map<String, String> e;
    private RequestType f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private MtopResponse k;
    private long l;

    /* loaded from: classes2.dex */
    public enum RequestType {
        LOAD_CACHE_DATA,
        QUERY_CART_PAGE,
        QUERY_CART_NEXT_PAGE,
        UPDATE,
        UPDATE_STRUCTURE
    }

    static {
        kge.a(-61920160);
        m = new ArrayList(Arrays.asList(IS_PRE_LOADV2, IS_POP_LAYER_FIRST_PAGE, IS_POP_LAYE_RQUERY, CHECKED_COUNT, IS_FULL_DATA_QUERY, IS_ICART_CHANGE_MODE, IS_ICART_IS_FIRST_REQUEST, CUSTOM_EXPARAMS, FIRST_PAGE_PRELOAD, IS_SUPPORT_WIDGET, IS_WIDGET_INSTALLED));
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (m.contains(str)) {
                hashMap.put(str, map.get(str));
            }
        }
        return hashMap;
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("acb1e46c", new Object[]{this}) : this.b;
    }

    public RequestConfig a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("546d4239", new Object[]{this, iDMComponent});
        }
        this.b = iDMComponent;
        return this;
    }

    public bmz b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmz) ipChange.ipc$dispatch("16b47ece", new Object[]{this}) : this.c;
    }

    public RequestConfig a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("587d71dc", new Object[]{this, bmzVar});
        }
        this.c = bmzVar;
        return this;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.d;
    }

    public RequestConfig a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("9868cae1", new Object[]{this, obj});
        }
        this.d = obj;
        return this;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.e;
    }

    public RequestConfig b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("8b9bc3a9", new Object[]{this, map});
        }
        this.e = map;
        return this;
    }

    public RequestType e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestType) ipChange.ipc$dispatch("423057b4", new Object[]{this}) : this.f;
    }

    public RequestConfig a(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("b1115f33", new Object[]{this, requestType});
        }
        this.f = requestType;
        return this;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.g;
    }

    public RequestConfig a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("3d66c6b9", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.h;
    }

    public RequestConfig b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("30f64afa", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i;
    }

    public RequestConfig c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("2485cf3b", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f == RequestType.QUERY_CART_PAGE || this.f == RequestType.QUERY_CART_NEXT_PAGE || k();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f == RequestType.UPDATE || this.f == RequestType.UPDATE_STRUCTURE;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f == RequestType.LOAD_CACHE_DATA;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.j;
    }

    public RequestConfig d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("1815537c", new Object[]{this, new Boolean(z)});
        }
        this.j = z;
        return this;
    }

    public MtopResponse m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("52737b67", new Object[]{this}) : this.k;
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            this.k = mtopResponse;
        }
    }

    public long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : this.l;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }
}
