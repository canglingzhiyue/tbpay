package anet.channel;

import anet.channel.detect.WifiDetector;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.util.ALog;
import anet.channel.util.SessionSeq;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes.dex */
public class SessionPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SessionPool";
    private final Map<SessionRequest, List<Session>> connPool = new HashMap();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();

    static {
        kge.a(-1315004493);
    }

    public void add(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588a2c59", new Object[]{this, sessionRequest, session});
        } else if (sessionRequest == null || sessionRequest.getHost() == null || session == null) {
        } else {
            this.writeLock.lock();
            try {
                List<Session> list = this.connPool.get(sessionRequest);
                if (list == null) {
                    list = new ArrayList<>();
                    this.connPool.put(sessionRequest, list);
                }
                if (list.indexOf(session) != -1) {
                    return;
                }
                list.add(session);
                Collections.sort(list);
            } finally {
                this.writeLock.unlock();
            }
        }
    }

    public void remove(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38694916", new Object[]{this, sessionRequest, session});
            return;
        }
        this.writeLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                return;
            }
            list.remove(session);
            if (AwcnConfig.isSessionReuseOptimized()) {
                Iterator<Session> it = list.iterator();
                while (it.hasNext()) {
                    Session next = it.next();
                    if (next != null && next.isReuse(session)) {
                        it.remove();
                    }
                }
            }
            if (list.size() == 0) {
                this.connPool.remove(sessionRequest);
            }
        } finally {
            this.writeLock.unlock();
        }
    }

    public List<Session> getSessions(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0c81798", new Object[]{this, sessionRequest});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (Session session : list) {
                String str = session.isDeprecated ? "true" : "false";
                if (session != null && session.isDeprecated) {
                    if (session.isNetworkStatusChangeDeprecated && !AwcnConfig.isNetworkStatusOpt()) {
                        session.isDeprecated = false;
                        ALog.e(TAG, "[smoothSwitch] getSessions session is reused,  host= " + sessionRequest.getHost() + " session= " + session.toString() + "ip =" + session.getIp(), session.mSeq, new Object[0]);
                    } else {
                        session.isNetworkStatusChangeNewSession = true;
                        ALog.e(TAG, "[smoothSwitch] getSessions BB host= " + sessionRequest.getHost() + " session= " + session.toString() + "ip =" + session.getIp() + " isDeprecated =" + str, session.mSeq, new Object[0]);
                    }
                }
                arrayList.add(session);
            }
            return arrayList;
        } finally {
            this.readLock.unlock();
        }
    }

    public List<Session> getAvailableSessions(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b8c2955", new Object[]{this, sessionRequest});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator<Session> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Session next = it.next();
                        if (next != null && next.isAvailable()) {
                            if (next.isDeprecated) {
                                ALog.e(TAG, "session is deprecated", next.mSeq, new Object[0]);
                            } else {
                                arrayList.add(next);
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                return new ArrayList(arrayList);
            }
            return null;
        } finally {
            this.readLock.unlock();
        }
    }

    public Session getSession(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("3a31470c", new Object[]{this, sessionRequest});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            Session session = null;
            if (list != null && !list.isEmpty()) {
                for (Session session2 : list) {
                    if (session2 != null && session2.isAvailable()) {
                        if (session2.isDeprecated) {
                            if (session2.isNetworkStatusChangeDeprecated && !AwcnConfig.isNetworkStatusOpt()) {
                                session2.isDeprecated = false;
                                ALog.e(TAG, "session is reused", session2.mSeq, new Object[0]);
                            } else {
                                session2.isNetworkStatusChangeNewSession = true;
                                ALog.e(TAG, "session is deprecated", session2.mSeq, new Object[0]);
                            }
                        }
                        if (list.get(0).isDeprecated) {
                            session2.mSessionStat.selectSessionType = 1;
                            if (1 == list.indexOf(session2)) {
                                session2.mSessionStat.selectSessionType = 2;
                            }
                        }
                        session = session2;
                        return session;
                    }
                }
                return session;
            }
            return null;
        } finally {
            this.readLock.unlock();
        }
    }

    public Session getSession(SessionRequest sessionRequest, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("5d09d56d", new Object[]{this, sessionRequest, new Integer(i)}) : getSession(sessionRequest, i, ProtocolType.ALL);
    }

    public Session getSessionByRetry(SessionRequest sessionRequest, int i, int i2, SessionParamStat sessionParamStat) {
        Session session;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a09cdc08", new Object[]{this, sessionRequest, new Integer(i), new Integer(i2), sessionParamStat});
        }
        this.readLock.lock();
        String str = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list != null && !list.isEmpty()) {
                Iterator<Session> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        session = null;
                        break;
                    }
                    session = it.next();
                    if (session != null && session.isAvailable() && (i == SessionType.ALL || session.mConnType.getType() == i)) {
                        if (i2 == ProtocolType.ALL || session.mConnType.getProtocolType() == i2) {
                            if (!session.isDeprecated && !session.getConnType().isHTTP3()) {
                                break;
                            }
                            ALog.e(TAG, "session is deprecated!", session.mSeq, "reqSeq", str, d.PARAM_IS_RETRY, Boolean.valueOf(z));
                        }
                    }
                }
                return session;
            }
            return null;
        } finally {
            this.readLock.unlock();
        }
    }

    public Session getSession(SessionRequest sessionRequest, int i, int i2) {
        Session session;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("9543132c", new Object[]{this, sessionRequest, new Integer(i), new Integer(i2)});
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list != null && !list.isEmpty()) {
                boolean z = AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(sessionRequest.getRealHost());
                Iterator<Session> it = list.iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    session = it.next();
                    if (session != null && session.isAvailable() && ((i == SessionType.ALL || session.mConnType.getType() == i) && (i2 == ProtocolType.ALL || session.mConnType.getProtocolType() == i2))) {
                        if (WifiDetector.isForceCell(session.mRealHost, session.mSeq) && !session.getForceCellular()) {
                            ALog.e(TAG, "[wifi fg detect opt] session not force cell, go next!", session.mSeq, new Object[0]);
                        } else {
                            if (session.isDeprecated) {
                                if (session.isNetworkStatusChangeDeprecated && !AwcnConfig.isNetworkStatusOpt()) {
                                    session.isDeprecated = false;
                                    ALog.e(TAG, "session is reused", session.mSeq, new Object[0]);
                                } else {
                                    session.isNetworkStatusChangeNewSession = true;
                                    ALog.e(TAG, "session is deprecated", session.mSeq, new Object[0]);
                                }
                            }
                            if (list.get(0).isDeprecated) {
                                session.mSessionStat.selectSessionType = 1;
                                if (1 == list.indexOf(session)) {
                                    session.mSessionStat.selectSessionType = 2;
                                }
                            }
                            if (!z) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(session);
                            if (arrayList.size() >= 2) {
                                break;
                            }
                        }
                    }
                }
                session = null;
                if (z && arrayList != null) {
                    GlobalAppRuntimeInfo.setRequestIndex(sessionRequest.getRealHost());
                    if (arrayList.size() >= 2) {
                        session = (Session) arrayList.get(0);
                        Session session2 = (Session) arrayList.get(1);
                        int requestIndex = GlobalAppRuntimeInfo.getRequestIndex(sessionRequest.getRealHost());
                        ALog.e(TAG, "[multiConnect] req countIndex=" + requestIndex + " ,session1 [" + toString() + "] countIndex=" + session.countIndex.get() + " ,session2 [" + session2.toString() + "] countIndex=" + session2.countIndex.get(), null, new Object[0]);
                        if (requestIndex == 0) {
                            ALog.e(TAG, "[multiConnect] select session1, req countIndex=" + requestIndex, null, new Object[0]);
                        } else {
                            ALog.e(TAG, "[multiConnect] select session2, req countIndex=" + requestIndex, null, new Object[0]);
                            session = session2;
                        }
                    } else if (arrayList.size() > 0) {
                        session = (Session) arrayList.get(0);
                        sessionRequest.createOneSession(session, i, i2, SessionSeq.createSequenceNo(GlobalAppRuntimeInfo.getAppkey()));
                    }
                }
                return session;
            }
            this.readLock.unlock();
            return null;
        } finally {
            this.readLock.unlock();
        }
    }

    public List<SessionRequest> getInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2971eeb1", new Object[]{this});
        }
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.readLock.lock();
        try {
            return this.connPool.isEmpty() ? list : new ArrayList(this.connPool.keySet());
        } finally {
            this.readLock.unlock();
        }
    }

    public boolean containsValue(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21d4e34c", new Object[]{this, sessionRequest, session})).booleanValue();
        }
        this.readLock.lock();
        try {
            List<Session> list = this.connPool.get(sessionRequest);
            if (list == null) {
                return false;
            }
            if (list.indexOf(session) == -1) {
                z = false;
            }
            return z;
        } finally {
            this.readLock.unlock();
        }
    }
}
