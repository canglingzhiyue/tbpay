package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rrx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f33346a;
    public String b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;
    public String h;
    public int i;
    public int j;
    public long k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public long q;
    public long r;
    public long s;
    public double u;
    public double v;
    public String w;
    public String x;
    public int t = -1;
    public Boolean y = false;
    public String z = "";

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f33347a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;

        static {
            kge.a(-263310794);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Step{playerPre=" + this.f33347a + ", httpOpen=" + this.b + ", fileOpen=" + this.c + ", downloadTime=" + this.d + ", frameRecvFirstDecodeTime=" + this.e + ", frameDecodeTime=" + this.f + ", renderTime=" + this.g + '}';
        }
    }

    static {
        kge.a(-340461798);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DataNotice{step=" + this.f33346a + ", videoID='" + this.b + "', bitrate=" + this.c + ", definition='" + this.d + "', userFirstRenderTime=" + this.e + ", dtPlayerTotalVisibleTime=" + this.f + ", videoLength=" + this.g + ", encodeUniqueCode='" + this.h + "', width=" + this.i + ", height=" + this.j + ", duration=" + this.k + ", cdnIp='" + this.l + "', encodeType='" + this.m + "', playUrl='" + this.n + "', serverIp='" + this.o + "', videoScore='" + this.p + "', renderTime=" + this.q + ", videoCacheFrame=" + this.r + ", fileOpen=" + this.s + ", index=" + this.t + ", proxySpeed=" + this.u + ", globalSpeed=" + this.v + ", host='" + this.w + "', defList='" + this.x + "', hitCache=" + this.y + ", connType='" + this.z + "'}";
    }
}
