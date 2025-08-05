package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public interface lnv {
    void a(View view);

    void a(boolean z, long j);

    boolean a();

    a b();

    void b(View view);

    void c();

    void d();

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DEFAULT_SECTION_BIZ_CODE = "defaultIconSectionBIzCode";
        public static final String ICON_ANIME_DURATION = "IconAnimeDuration";
        public static final String ICON_ANIME_PARENT_IMG = "IconAnimeParentImg";
        public static final String ICON_CONTAINER_SECTION_BIZ_CODE = "iconContainerBizCode";
        public static final String TARGET_MINI_APP_ID = "targetIconSectionBIzCode";

        /* renamed from: a  reason: collision with root package name */
        private String f30757a;
        private String b;
        private String c;
        private String d;
        private long e = 2500;

        static {
            kge.a(1997458016);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.f30757a) && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && this.e > 0;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AnimeConfig{iconContainerBizCode" + this.f30757a + "targetMiniAppId='" + this.b + "', defaultSectionBizCode='" + this.c + "', imgSession='" + this.d + "', duration=" + this.e + '}';
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f30757a;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f30757a = str;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public long f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.e;
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.e = j;
            }
        }
    }
}
