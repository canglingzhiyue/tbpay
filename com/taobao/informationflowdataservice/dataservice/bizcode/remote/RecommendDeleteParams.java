package com.taobao.informationflowdataservice.dataservice.bizcode.remote;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public final class RecommendDeleteParams implements IMTOPDataObject {
    public String deleteParam;
    public String lastResultVersion;
    public String pos;
    public String pvid;
    public String reasonArgs;
    public String reasonId;
    public int tabIndex;
    public String templateName;
    public String userId;

    static {
        kge.a(-2065367614);
        kge.a(-350052935);
    }

    private RecommendDeleteParams(a aVar) {
        this.userId = a.a(aVar);
        this.deleteParam = a.b(aVar);
        this.pos = a.c(aVar);
        this.tabIndex = a.d(aVar);
        this.pvid = a.e(aVar);
        this.templateName = a.f(aVar);
        this.reasonId = a.g(aVar);
        this.reasonArgs = a.h(aVar);
        this.lastResultVersion = a.i(aVar);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17583a;
        private String b;
        private String c;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            kge.a(1796928153);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f89baba8", new Object[]{aVar}) : aVar.f17583a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7d587", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14b3ff66", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a318f8ae", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30cc5324", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ed87d03", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ce4a6e2", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5af0d0c1", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68fcfaa0", new Object[]{aVar}) : aVar.i;
        }
    }
}
