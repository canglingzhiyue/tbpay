package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long A;
    public long B;
    public String c;
    public long d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    public String n;
    public String o;
    public String x;
    public String z;

    /* renamed from: a  reason: collision with root package name */
    public long f12426a = 0;
    public long b = 0;
    public int p = 0;
    public int q = 1;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public long v = 0;
    public long w = 0;
    public int y = -1;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f12428a;
        public long b;
        public String c;
        public String d;
        public String h;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public int e = 0;
        public int f = -1;
        public String g = "1";
        public boolean i = true;
        public String j = "";

        static {
            kge.a(426006999);
        }
    }

    static {
        kge.a(-2088591990);
    }

    public a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("94213501", new Object[]{this, bVar}) : new a(this, bVar);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f12427a;
        public final Map<String, String> b = new HashMap(20);
        public final b c;

        static {
            kge.a(723175961);
        }

        public a(c cVar, b bVar) {
            this.f12427a = cVar;
            this.c = bVar;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f128afc5", new Object[]{this});
            }
            this.f12427a.e = SystemClock.elapsedRealtime();
            this.b.put("svm_ts", String.valueOf(this.f12427a.e));
            if (this.c != null) {
                this.b.put(FluidSDK.FLUID_SDK_FLAG, "1");
                this.b.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
                this.b.put("svm_pid", this.c.d);
                this.b.put("svm_has_preplayer", String.valueOf(this.c.e));
                this.b.put("svm_p_mtop_use_nd_api", String.valueOf(this.c.g));
                this.f12427a.f12426a = SystemClock.elapsedRealtime() - this.c.f12428a;
                this.b.put("svm_p_time", String.valueOf(this.f12427a.f12426a));
                this.f12427a.b = SystemClock.elapsedRealtime() - this.c.b;
                this.b.put("svm_p_visible_time", String.valueOf(this.f12427a.b));
                this.b.put("svm_dsl_md5", this.c.j);
                this.b.put("svm_p_flag_ggpick_isdefault", String.valueOf(this.c.l));
                this.b.put("svm_p_flag_ggpick_cachetype", String.valueOf(this.c.k));
                if (!TextUtils.isEmpty(this.c.m)) {
                    this.b.put("svm_p_flag_ggpick_cachescene", this.c.m);
                }
                if (!TextUtils.isEmpty(this.c.n)) {
                    this.b.put("svm_p_flag_ggpick_iscoldred", this.c.n);
                }
                if (!TextUtils.isEmpty(this.c.o)) {
                    this.b.put("svm_p_flag_ggpick_usepreloaddw", this.c.o);
                }
                if (!TextUtils.isEmpty(this.c.p)) {
                    this.b.put("svm_p_flag_ggpick_fromLaun", this.c.p);
                }
                if (!TextUtils.isEmpty(this.c.q)) {
                    this.b.put("svm_p_flag_ggpick_launUsePre", this.c.q);
                }
            }
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("24d6da86", new Object[]{this});
            }
            b bVar = this.c;
            if (bVar != null) {
                this.b.put("svm_biz_params", bVar.c);
            }
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("812d33b9", new Object[]{this, new Long(j)});
            }
            this.b.put("svm_cost", String.valueOf(j));
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9a42c00f", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b.put("svm_reserve1", str);
            }
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7fee1c90", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b.put("svm_reserve2", str);
            }
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("65997911", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b.put("svm_reserve3", str);
            }
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b44d592", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.b.put("svm_reserves", VideoTracker.j(str));
            }
            return this;
        }

        public a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("58850547", new Object[]{this});
            }
            this.b.put("svm_vv_flag_stall", String.valueOf(this.f12427a.u));
            this.b.put("svm_vv_gap_stall", String.valueOf(this.f12427a.v));
            return this;
        }

        public a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8c333008", new Object[]{this});
            }
            this.b.put("svm_error_code", this.f12427a.f);
            this.b.put("svm_error_content", this.f12427a.g);
            return this;
        }

        public a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bfe15ac9", new Object[]{this});
            }
            this.b.put("svm_p_mtop_api", this.f12427a.c);
            b bVar = this.c;
            if (bVar != null) {
                this.b.put("svm_p_mtop_index", String.valueOf(bVar.f));
            }
            return this;
        }

        public a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f38f858a", new Object[]{this});
            }
            this.b.put("svm_player_qos", this.f12427a.x);
            return this;
        }

        public a g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("273db04b", new Object[]{this});
            }
            this.b.put("svm_vvid", this.f12427a.h);
            this.b.put("svm_playerid", this.f12427a.i);
            this.b.put("svm_preplayerid", this.f12427a.j);
            c cVar = this.f12427a;
            cVar.k = cVar.d > 0 ? SystemClock.elapsedRealtime() - this.f12427a.d : 1L;
            if (!this.b.containsKey("svm_vv_time")) {
                this.b.put("svm_vv_time", String.valueOf(this.f12427a.k));
            }
            this.b.put("svm_vv_content_id", this.f12427a.n);
            this.b.put("svm_vv_video_duration", String.valueOf(this.f12427a.l));
            this.b.put("svm_vv_progress", String.valueOf(this.f12427a.m));
            this.b.put("svm_vv_index", String.valueOf(this.f12427a.p));
            this.b.put("svm_vv_play_count", String.valueOf(this.f12427a.q));
            this.b.put("svm_vv_retry_count", String.valueOf(this.f12427a.r));
            this.b.put("svm_vv_hit_cache", String.valueOf(this.f12427a.s));
            this.b.put("svm_vv_is_active", String.valueOf(this.f12427a.t));
            this.b.put("svm_vv_flag_predl", String.valueOf(this.f12427a.y));
            if (!TextUtils.isEmpty(this.f12427a.z)) {
                this.b.put("svm_p_flag_ggpick_hit", this.f12427a.z);
            }
            if (this.f12427a.w > 0) {
                this.b.put("svm_vv_gap_launcher_time", String.valueOf(this.f12427a.w));
            }
            return this;
        }

        public a b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3446118", new Object[]{this, new Long(j)});
            }
            this.b.put("svm_vv_time", String.valueOf(j));
            return this;
        }

        public a h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5aebdb0c", new Object[]{this});
            }
            this.b.put("svm_vv_content_data", this.f12427a.o);
            return this;
        }

        public Map<String, String> i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.b;
        }
    }
}
