package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ljn;

/* loaded from: classes5.dex */
public class ljo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljn f30689a = new ljn();

    static {
        kge.a(-478705096);
    }

    public ljn.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljn.a) ipChange.ipc$dispatch("6a92aa91", new Object[]{this}) : this.f30689a.a();
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        ljn ljnVar = this.f30689a;
        ljnVar.f30687a = str;
        ljnVar.b = str2;
        ljnVar.c = str3;
        ljnVar.d = str4;
        ljnVar.e = str5;
        ljnVar.f = str6;
        ljnVar.o = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r7.equals("webloadfinished") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r7, java.util.Map r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ljo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r6
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r7 = "20476513"
            r0.ipc$dispatch(r7, r1)
            return
        L18:
            tb.ljn$a r0 = r6.a()
            tb.ljn r1 = r6.f30689a
            r1.g = r7
            tb.ljn$a r1 = r0.a()
            tb.ljn$a r1 = r1.b()
            r1.a(r8)
            r8 = -1
            int r1 = r7.hashCode()
            switch(r1) {
                case -99989769: goto L79;
                case 310351011: goto L6f;
                case 507551783: goto L65;
                case 545472344: goto L5b;
                case 1330016653: goto L51;
                case 1344973996: goto L48;
                case 1508646476: goto L3e;
                case 1879530535: goto L34;
                default: goto L33;
            }
        L33:
            goto L83
        L34:
            java.lang.String r1 = "playnext"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 7
            goto L84
        L3e:
            java.lang.String r1 = "waittimeout"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 0
            goto L84
        L48:
            java.lang.String r1 = "webloadfinished"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            goto L84
        L51:
            java.lang.String r1 = "webterminate"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 4
            goto L84
        L5b:
            java.lang.String r1 = "loadfinished"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 5
            goto L84
        L65:
            java.lang.String r1 = "destroytimeout"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 1
            goto L84
        L6f:
            java.lang.String r1 = "loadfailed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 6
            goto L84
        L79:
            java.lang.String r1 = "webloadfailed"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L83
            r2 = 3
            goto L84
        L83:
            r2 = -1
        L84:
            switch(r2) {
                case 0: goto L8c;
                case 1: goto L8c;
                case 2: goto L8c;
                case 3: goto L8c;
                case 4: goto L8c;
                case 5: goto L88;
                case 6: goto L88;
                case 7: goto L88;
                default: goto L87;
            }
        L87:
            goto L8f
        L88:
            r0.b(r7)
            goto L8f
        L8c:
            r0.a(r7)
        L8f:
            java.lang.String r8 = "webloadinit"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lb8
            java.util.Map r7 = r0.c()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "埋点上报："
            r8.append(r0)
            java.lang.String r0 = com.alibaba.fastjson.JSONObject.toJSONString(r7)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "[webcomponent_tracker]"
            tb.spz.c(r0, r8)
            com.taobao.android.fluid.business.usertrack.track.b.b(r7)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ljo.a(java.lang.String, java.util.Map):void");
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        ljn ljnVar = this.f30689a;
        if (ljnVar == null) {
            return 0L;
        }
        return ljnVar.r;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ljn ljnVar = this.f30689a;
        if (ljnVar == null) {
            return;
        }
        ljnVar.r = 0L;
    }
}
