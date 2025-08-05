package com.taobao.homepage.messiah.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public final class StabilityDataUploadMtopParams implements IMTOPDataObject {
    public String appId;
    public String params;

    static {
        kge.a(-1316471552);
        kge.a(-350052935);
    }

    private StabilityDataUploadMtopParams(a aVar) {
        this.appId = a.a(aVar);
        this.params = a.b(aVar);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17242a;
        private String b;

        static {
            kge.a(77730775);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ecd6b66", new Object[]{aVar}) : aVar.f17242a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81288245", new Object[]{aVar}) : aVar.b;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("223aef6", new Object[]{this, str});
            }
            this.f17242a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("647ec5d5", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public StabilityDataUploadMtopParams a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StabilityDataUploadMtopParams) ipChange.ipc$dispatch("d1d4e31d", new Object[]{this}) : new StabilityDataUploadMtopParams(this);
        }
    }
}
