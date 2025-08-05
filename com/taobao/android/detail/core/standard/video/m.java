package com.taobao.android.detail.core.standard.video;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9882a;
    private final String b;
    private final String c;
    private final float d;
    private final Map<String, String> e;
    private Map<String, Object> f;
    private String g;
    private String h;

    static {
        kge.a(1235066391);
    }

    public static /* synthetic */ String a(m mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0246229", new Object[]{mVar, str});
        }
        mVar.g = str;
        return str;
    }

    public static /* synthetic */ String b(m mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92c272a", new Object[]{mVar, str});
        }
        mVar.h = str;
        return str;
    }

    private m(String str, String str2, String str3, float f, Map<String, String> map) {
        this.f = new HashMap();
        this.g = AliSDetailScaleType.fitCenter;
        this.h = AliSDetailScaleType.fitCenter;
        this.f9882a = str;
        this.b = str2;
        this.c = str3;
        this.d = f <= 0.0f ? 1.0f : f;
        this.e = map;
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoModel");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f9882a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.h;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f.put(str, obj);
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : this.f.get(str);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9883a;
        private String b;
        private String c;
        private float d;
        private Map<String, String> e;
        private String f = AliSDetailScaleType.fitCenter;
        private String g = AliSDetailScaleType.centerCrop;

        static {
            kge.a(-135500306);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c61a9ba", new Object[]{this, str});
            }
            this.f9883a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("436d90bb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7977bc", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1dbc5060", new Object[]{this, new Float(f)});
            }
            this.d = f;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1855ebd", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("989145be", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("f7baaa0d", new Object[]{this});
            }
            m mVar = new m(this.f9883a, this.b, this.c, this.d, this.e);
            m.a(mVar, this.f);
            m.b(mVar, this.g);
            return mVar;
        }
    }
}
