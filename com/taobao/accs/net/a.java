package com.taobao.accs.net;

import android.os.SystemClock;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.SessionType;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.utl.ALog;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile long f8265a;

    static {
        kge.a(-379936323);
    }

    public static void a(Session session, Integer... numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255d6942", new Object[]{session, numArr});
        } else if (session == null) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f8265a > 0 && elapsedRealtime - f8265a < 3000) {
                ALog.e("AccsSessionCenter", "ping freq", new Object[0]);
                return;
            }
            if (numArr != null && numArr.length > 0 && numArr[0] != null && numArr[0].intValue() > 0) {
                session.ping(true, numArr[0].intValue());
            } else {
                session.ping(true);
            }
            f8265a = elapsedRealtime;
        }
    }

    public static Session a(SessionCenter sessionCenter, String str, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("1d78f415", new Object[]{sessionCenter, str, new Long(j), str2});
        }
        if (ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return sessionCenter.getThrowsException(str, j);
        }
        return null;
    }

    public static Session a(SessionCenter sessionCenter, String str, ConnType.TypeLevel typeLevel, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("ce6bc46b", new Object[]{sessionCenter, str, typeLevel, new Long(j), str2});
        }
        if (ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return sessionCenter.getThrowsException(str, typeLevel, j);
        }
        return null;
    }

    public static Session b(SessionCenter sessionCenter, String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("e3a37cd6", new Object[]{sessionCenter, str, new Long(j), str2}) : b(sessionCenter, str, ConnType.TypeLevel.SPDY, j, str2);
    }

    public static Session b(SessionCenter sessionCenter, String str, ConnType.TypeLevel typeLevel, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("be2eb82c", new Object[]{sessionCenter, str, typeLevel, new Long(j), str2});
        }
        if (ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return sessionCenter.get(str, typeLevel, j);
        }
        return null;
    }

    public static Session a(SessionCenter sessionCenter, String str, int i, long j, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("541354ce", new Object[]{sessionCenter, str, new Integer(i), new Long(j), str2});
        }
        if (ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str2)) {
            return sessionCenter.getThrowsException(HttpUrl.parse(str), SessionType.LONG_LINK, i, j);
        }
        return null;
    }
}
