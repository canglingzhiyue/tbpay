package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.kge;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ID_MAIN_SEARCH_COMMON = "PageSearch";
    public static final String BIZ_ID_MAIN_SRP = "BXIdSpec|PageSearch";
    public static final a Companion;
    public static final String INVOKE_ID_MAIN_SRP = "search.request.list";
    public static final String INVOKE_ID_SEARCH_DOOR_BG_WORD = "search.request.searchdoor.bgword";
    public static final String INVOKE_ID_SEARCH_DOOR_MAIN_PAGE = "search.request.searchdoor.main";
    public static final String INVOKE_ID_SEARCH_DOOR_SUGGEST = "search.request.searchdoor.suggest";
    private static final kotlin.d b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f19029a;

    public static final b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("db7ccf76", new Object[0]) : Companion.a();
    }

    public b() {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.taobao.android.behavix.service.BUFS");
        } catch (Throwable unused) {
        }
        this.f19029a = cls != null;
    }

    public static final /* synthetic */ kotlin.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("9e77df26", new Object[0]) : b;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f19030a;

        static {
            kge.a(1809172445);
            f19030a = new kotlin.reflect.k[]{kotlin.jvm.internal.t.a(new PropertyReference1Impl(kotlin.jvm.internal.t.b(a.class), "instance", "getInstance()Lcom/taobao/search/common/util/ClientIntelligenceHelper;"))};
        }

        public final b a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("b42d2874", new Object[]{this});
            } else {
                kotlin.d b = b.b();
                a aVar = b.Companion;
                value = b.getValue();
            }
            return (b) value;
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    static {
        kge.a(-1918917931);
        Companion = new a(null);
        b = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, ClientIntelligenceHelper$Companion$instance$2.INSTANCE);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f19029a;
    }

    public final String a(String str, String str2, String str3, Integer num) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c2c5c4f", new Object[]{this, str, str2, str3, num});
        }
        if (!this.f19029a) {
            return "";
        }
        String str4 = null;
        try {
            str4 = BUFS.getFeature(new BUFS.QueryArgs(), str2, str, str3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str5 = str4;
        if (str5 != null && str5.length() != 0) {
            z = false;
        }
        return z ? "" : (num == null || num.intValue() < 0 || kotlin.jvm.internal.q.a(str4.length(), num.intValue()) <= 0) ? str4 : "";
    }

    public final String a(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3baa0f71", new Object[]{this, num}) : a(BIZ_ID_MAIN_SRP, INVOKE_ID_MAIN_SRP, "Page_SearchItemList", num);
    }

    public final String a(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71553685", new Object[]{this, str, str2, num}) : a(BIZ_ID_MAIN_SEARCH_COMMON, str, str2, num);
    }
}
