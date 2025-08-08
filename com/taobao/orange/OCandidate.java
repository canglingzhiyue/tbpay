package com.taobao.orange;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.aidl.OrangeCandidateCompareStub;
import com.taobao.orange.aidl.ParcelableCandidateCompare;
import com.taobao.orange.candidate.DefCandidateCompare;
import tb.kge;

/* loaded from: classes.dex */
public class OCandidate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f18557a;
    private String b;
    private ParcelableCandidateCompare c;

    static {
        kge.a(1504426658);
    }

    public OCandidate(String str, String str2, Class<? extends b> cls) {
        if (StringUtils.isEmpty(str) || cls == null) {
            throw new IllegalArgumentException("key or compare is null");
        }
        this.f18557a = str;
        this.b = str2;
        try {
            this.c = new OrangeCandidateCompareStub(cls.newInstance());
        } catch (Exception unused) {
            this.c = new OrangeCandidateCompareStub(new DefCandidateCompare());
        }
    }

    public OCandidate(String str, String str2, ParcelableCandidateCompare parcelableCandidateCompare) {
        if (StringUtils.isEmpty(str) || parcelableCandidateCompare == null) {
            throw new IllegalArgumentException("key or compare is null");
        }
        this.f18557a = str;
        this.b = str2;
        this.c = parcelableCandidateCompare;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f18557a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public ParcelableCandidateCompare c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParcelableCandidateCompare) ipChange.ipc$dispatch("4527d285", new Object[]{this}) : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = null;
        ParcelableCandidateCompare parcelableCandidateCompare = this.c;
        if (parcelableCandidateCompare instanceof OrangeCandidateCompareStub) {
            str = ((OrangeCandidateCompareStub) parcelableCandidateCompare).getName();
        }
        return this.f18557a + "=" + this.b + " " + str;
    }

    public boolean a(OCandidate oCandidate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("232ac8f9", new Object[]{this, oCandidate})).booleanValue();
        }
        if (oCandidate == null) {
            return false;
        }
        if (this == oCandidate) {
            return true;
        }
        if (!this.f18557a.equals(oCandidate.f18557a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? oCandidate.b != null : !str.equals(oCandidate.b)) {
            return false;
        }
        return ((OrangeCandidateCompareStub) this.c).getRealClass() == ((OrangeCandidateCompareStub) oCandidate.c).getRealClass();
    }
}
