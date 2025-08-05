package mtopsdk.network.domain;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.riy;
import tb.ryq;

/* loaded from: classes.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Request f25008a;
    public final int b;
    public final String c;
    public final Map<String, List<String>> d;
    public final c e;
    public final NetworkStats f;
    public final byte[] g;
    public final ryq h;
    public final JSONObject i;
    public final BaseOutDo j;

    static {
        kge.a(1441585614);
    }

    private b(a aVar) {
        this.f25008a = aVar.f25009a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = a.a(aVar);
        this.i = a.b(aVar);
        this.j = a.c(aVar);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Response{ code=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", headers");
        sb.append(this.d);
        sb.append(", body");
        sb.append(this.e);
        sb.append(", request");
        sb.append(this.f25008a);
        sb.append(", stat");
        sb.append(this.f);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Request f25009a;
        public int b = -1;
        public String c;
        public Map<String, List<String>> d;
        public c e;
        public NetworkStats f;
        public byte[] g;
        private ryq h;
        private JSONObject i;
        private BaseOutDo j;

        static {
            kge.a(129761957);
        }

        public static /* synthetic */ ryq a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ryq) ipChange.ipc$dispatch("18bad2d7", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ JSONObject b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("87b9d166", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ BaseOutDo c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseOutDo) ipChange.ipc$dispatch("a8334591", new Object[]{aVar}) : aVar.j;
        }

        public a a(Request request) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c43d181e", new Object[]{this, request});
            }
            this.f25009a = request;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3103f938", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b979a41", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56aa7976", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4d5fe12", new Object[]{this, cVar});
            }
            this.e = cVar;
            return this;
        }

        public a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c988924", new Object[]{this, bArr});
            }
            this.g = bArr;
            return this;
        }

        public a a(NetworkStats networkStats) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2136e3d8", new Object[]{this, networkStats});
            }
            this.f = networkStats;
            return this;
        }

        public a a(ryq ryqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf1dcd65", new Object[]{this, ryqVar});
            }
            this.h = ryqVar;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9f1a052b", new Object[]{this, jSONObject});
            }
            this.i = jSONObject;
            return this;
        }

        public a a(BaseOutDo baseOutDo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1eefc41", new Object[]{this, baseOutDo});
            }
            this.j = baseOutDo;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2a19dca8", new Object[]{this});
            }
            if (this.f25009a == null) {
                throw new IllegalStateException("request == null");
            }
            return new b(this);
        }
    }
}
