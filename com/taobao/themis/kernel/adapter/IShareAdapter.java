package com.taobao.themis.kernel.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public interface IShareAdapter extends com.taobao.themis.kernel.basic.a {

    /* loaded from: classes9.dex */
    public interface b {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    void share(Context context, ITMSPage iTMSPage, a aVar, b bVar);

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f22502a;
        private final String b;
        private String c;
        private String d;
        private String e;
        private Map<String, ? extends Object> f;
        private Map<String, ? extends Object> g;
        private ArrayList<String> h;

        static {
            kge.a(-1952236006);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a((Object) this.f22502a, (Object) aVar.f22502a) || !q.a((Object) this.b, (Object) aVar.b) || !q.a((Object) this.c, (Object) aVar.c) || !q.a((Object) this.d, (Object) aVar.d) || !q.a((Object) this.e, (Object) aVar.e) || !q.a(this.f, aVar.f) || !q.a(this.g, aVar.g) || !q.a(this.h, aVar.h)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f22502a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Map<String, ? extends Object> map = this.f;
            int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, ? extends Object> map2 = this.g;
            int hashCode7 = (hashCode6 + (map2 != null ? map2.hashCode() : 0)) * 31;
            ArrayList<String> arrayList = this.h;
            if (arrayList != null) {
                i = arrayList.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ShareConfig(businessId=" + this.f22502a + ", url=" + this.b + ", title=" + this.c + ", desc=" + this.d + ", imageUrl=" + this.e + ", templateParams=" + this.f + ", extendParams=" + this.g + ", targets=" + this.h + riy.BRACKET_END_STR;
        }

        public a(String businessId, String url, String str, String str2, String str3, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, ArrayList<String> arrayList) {
            q.d(businessId, "businessId");
            q.d(url, "url");
            this.f22502a = businessId;
            this.b = url;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = map;
            this.g = map2;
            this.h = arrayList;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22502a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Map map, Map map2, ArrayList arrayList, int i, o oVar) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : arrayList);
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public final void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f = map;
            }
        }

        public final Map<String, Object> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
        }

        public final Map<String, Object> g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.g;
        }

        public final ArrayList<String> h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("485f2749", new Object[]{this}) : this.h;
        }
    }
}
