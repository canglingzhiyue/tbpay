package com.etao.feimagesearch.newresult.perf;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class IrpAvaRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6855a = "Unknown";
    private boolean b = true;
    private String c = "";
    private String d = "";
    private String e;
    private String f;
    private String g;

    /* loaded from: classes3.dex */
    public static final class AvaType {
        public static final String AVA_TYPE_CROP_EMPTY = "CropEmpty";
        public static final String AVA_TYPE_ILLEGAL_SOURCE = "Illegal_Source";
        public static final String AVA_TYPE_IMAGE_LOAD = "ImageLoad";
        public static final String AVA_TYPE_NET_REQUEST = "NetRequest";
        public static final String AVA_TYPE_NET_REQUEST_EMPTY = "NetRequestEmpty";
        public static final String AVA_TYPE_PAGE_DOWNGRADE = "PageDowngrade";
        public static final String AVA_TYPE_PAGE_LOAD = "PageLoad";
        public static final String AVA_TYPE_PAGE_MUISE_LOAD = "PageMuiseLoad";
        public static final String AVA_TYPE_PAGE_MUISE_RUN = "PageMuiseRun";
        public static final String AVA_TYPE_PAGE_WEB_LOAD = "PageWebLoad";
        public static final String AVA_TYPE_UNKNOWN = "Unknown";
        public static final AvaType INSTANCE;

        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        /* renamed from: com.etao.feimagesearch.newresult.perf.IrpAvaRecord$AvaType$AvaType  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public @interface InterfaceC0238AvaType {
        }

        static {
            kge.a(1727784093);
            INSTANCE = new AvaType();
        }

        private AvaType() {
        }
    }

    static {
        kge.a(-1184092101);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6855a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final void a(String avaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, avaType});
            return;
        }
        q.c(avaType, "avaType");
        this.f6855a = avaType;
        this.b = true;
        b.a(this);
    }

    public final void b(String avaType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, avaType, str, str2});
            return;
        }
        q.c(avaType, "avaType");
        this.f6855a = avaType;
        this.b = false;
        if (StringUtils.isEmpty(str)) {
            str = "unknown";
        }
        this.c = str;
        if (StringUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        this.d = str2;
        b.a(this);
    }
}
