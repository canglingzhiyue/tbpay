package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public final class InfoFlowDeleteParams implements IMTOPDataObject {
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
        kge.a(1499378832);
        kge.a(-350052935);
    }

    public InfoFlowDeleteParams(a aVar) {
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
        private String f17480a;
        private String b;
        private String c;
        private int d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            kge.a(-1399850137);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("351690f6", new Object[]{aVar}) : aVar.f17480a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c18acdd5", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4dff0ab4", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3053fca0", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66e78472", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f35bc151", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fcffe30", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c443b0f", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98b877ee", new Object[]{aVar}) : aVar.i;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f5313d66", new Object[]{this, str});
            }
            this.f17480a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81a57a45", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e19b724", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9a8df403", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("270230e2", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public InfoFlowDeleteParams a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InfoFlowDeleteParams) ipChange.ipc$dispatch("21ad518d", new Object[]{this}) : new InfoFlowDeleteParams(this);
        }
    }
}
