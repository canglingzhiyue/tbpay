package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class PrivacyAuthGetParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<a> authListParams;

    private PrivacyAuthGetParam() {
        this(new b());
    }

    public PrivacyAuthGetParam(b bVar) {
        this.authListParams = b.a(bVar);
    }

    public List<a> getAuthListParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("738d6f1e", new Object[]{this}) : this.authListParams;
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f4230a;
        private final String[] b;

        public a(String str, String[] strArr) {
            this.f4230a = str;
            this.b = strArr;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4230a;
        }

        public String[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : this.b;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AuthData{sceneCode='" + this.f4230a + "', permissions=" + Arrays.toString(this.b) + '}';
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f4231a = new ArrayList();

        public static /* synthetic */ List a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c50acede", new Object[]{bVar}) : bVar.f4231a;
        }

        public b a(String str, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c4e58e4e", new Object[]{this, str, strArr});
            }
            this.f4231a.add(new a(str, strArr));
            return this;
        }

        public PrivacyAuthGetParam a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PrivacyAuthGetParam) ipChange.ipc$dispatch("6abb48c7", new Object[]{this}) : new PrivacyAuthGetParam(this);
        }
    }
}
