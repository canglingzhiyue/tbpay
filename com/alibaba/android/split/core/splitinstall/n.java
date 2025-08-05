package com.alibaba.android.split.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class n extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f2476a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final List g;
    private final List h;
    private final String i;
    private final PendingIntent j;
    private final List<Parcelable> k;

    static {
        kge.a(1226396257);
    }

    public static m a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("e39cb2c4", new Object[]{bundle}) : new n(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(PushMessageHelper.ERROR_TYPE), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"), bundle.getString("args"));
    }

    public n(int i, int i2, int i3, int i4, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, ArrayList<Parcelable> arrayList) {
        this(i, i2, i3, i4, j, j2, list, list2, pendingIntent, arrayList, "");
    }

    public n(int i, int i2, int i3, int i4, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, ArrayList<Parcelable> arrayList, String str) {
        this.f2476a = i;
        this.b = i2;
        this.d = i3;
        this.c = i4;
        this.e = j;
        this.f = j2;
        this.g = list;
        this.h = list2;
        this.j = pendingIntent;
        this.k = arrayList;
        this.i = str;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f2476a;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.f;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final List g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.g;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final List h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.h;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final PendingIntent i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("19f6f5dc", new Object[]{this}) : this.j;
    }

    @Override // com.alibaba.android.split.core.splitinstall.m
    public final List j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.k;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.f2476a;
        int i2 = this.b;
        int i3 = this.c;
        long j = this.e;
        int i4 = this.d;
        long j2 = this.f;
        String valueOf = String.valueOf(new ArrayList(this.g));
        List<Parcelable> list = this.k;
        String valueOf2 = list != null ? String.valueOf(new ArrayList(list)) : "";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 251 + String.valueOf(valueOf2).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", errorType=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", splitFileIntents=");
        sb.append(valueOf2);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2476a != mVar.a() || this.b != mVar.b() || this.c != mVar.d() || this.e != mVar.e() || this.f != mVar.f()) {
            return false;
        }
        List list = this.g;
        if (list == null) {
            if (mVar.g() != null) {
                return false;
            }
        } else if (!list.equals(mVar.g())) {
            return false;
        }
        List list2 = this.h;
        if (list2 == null) {
            if (mVar.h() != null) {
                return false;
            }
        } else if (!list2.equals(mVar.h())) {
            return false;
        }
        PendingIntent pendingIntent = this.j;
        if (pendingIntent == null) {
            if (mVar.i() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(mVar.i())) {
            return false;
        }
        List<Parcelable> list3 = this.k;
        if (list3 == null) {
            if (mVar.j() != null) {
                return false;
            }
        } else if (!list3.equals(mVar.j())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long j = this.e;
        long j2 = this.f;
        int i2 = (((((((((this.f2476a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        List list = this.g;
        int hashCode = (i2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.h;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.j;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Parcelable> list3 = this.k;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 ^ i;
    }
}
