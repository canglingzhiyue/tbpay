package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/open/resource/PackageInfo;", "", "name", "", "id", "version", "type", "Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "filePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/themis/open/resource/PackageInfo$TYPE;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getId", "getName", NetworkAbility.API_GET_TYPE, "()Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "getVersion", eau.PARSER_TAG, "", "other", "hashCode", "", "toString", "TYPE", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PackageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f22717a;
    private final String b;
    private final String c;
    private final TYPE d;
    private final String e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "", "(Ljava/lang/String;I)V", "FRAMEWORK", "MAIN", "PLUGIN", "SUBPACKAGE", "RESOURCE", "OTHER", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum TYPE {
        FRAMEWORK,
        MAIN,
        PLUGIN,
        SUBPACKAGE,
        RESOURCE,
        OTHER
    }

    static {
        kge.a(1291099586);
    }

    public PackageInfo(String name, String id, String version, TYPE type, String str) {
        q.d(name, "name");
        q.d(id, "id");
        q.d(version, "version");
        q.d(type, "type");
        this.f22717a = name;
        this.b = id;
        this.c = version;
        this.d = type;
        this.e = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!q.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.open.resource.PackageInfo");
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        return !(q.a((Object) this.b, (Object) packageInfo.b) ^ true) && !(q.a((Object) this.c, (Object) packageInfo.c) ^ true);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PackageInfo(name='" + this.f22717a + "', id='" + this.b + "', version='" + this.c + "', filePath=" + this.e + ')';
    }
}
