package com.taobao.homepage.pop.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes7.dex */
public final class PopFatigueReportMtopParams implements IMTOPDataObject {
    public String businessId;
    public String passParam;

    private PopFatigueReportMtopParams(a aVar) {
        this.businessId = a.a(aVar);
        this.passParam = a.b(aVar);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17247a;
        private String b;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb8c1ad7", new Object[]{aVar}) : aVar.f17247a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c0570d8", new Object[]{aVar}) : aVar.b;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e8017233", new Object[]{this, str});
            }
            this.f17247a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c87ac834", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public PopFatigueReportMtopParams a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PopFatigueReportMtopParams) ipChange.ipc$dispatch("9987a6c6", new Object[]{this}) : new PopFatigueReportMtopParams(this);
        }
    }
}
