package com.tmall.android.dai.trigger.protocol;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import tb.kge;
import tb.rli;
import tb.rlm;

/* loaded from: classes9.dex */
public class c extends a<UserTrackDO, UserTrackDO, rlm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1505866761);
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public UserTrackDO b2(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserTrackDO) ipChange.ipc$dispatch("ac7b9cad", new Object[]{this, userTrackDO}) : userTrackDO;
    }

    @Override // com.tmall.android.dai.trigger.protocol.a
    public /* synthetic */ String b(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e17923bb", new Object[]{this, userTrackDO}) : a(userTrackDO);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.tmall.android.dai.internal.usertrack.UserTrackDO, java.lang.Object] */
    @Override // com.tmall.android.dai.trigger.protocol.a
    public /* synthetic */ UserTrackDO c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("45d4372c", new Object[]{this, userTrackDO}) : b2(userTrackDO);
    }

    @Override // com.tmall.android.dai.trigger.protocol.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : ((rlm) this.c).a();
    }

    public c(String str, rli rliVar, rlm rlmVar, String str2) {
        super(str, rliVar, rlmVar, str2);
    }

    public String a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a163d78b", new Object[]{this, userTrackDO}) : userTrackDO.getSummary();
    }
}
