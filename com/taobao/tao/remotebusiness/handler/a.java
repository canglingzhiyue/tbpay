package com.taobao.tao.remotebusiness.handler;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.mtop.common.MtopListener;
import tb.kge;

/* loaded from: classes.dex */
public class a extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_CACHED = 4;
    public static final int ON_DATA_RECEIVED = 1;
    public static final int ON_FINISHED = 3;
    public static final int ON_HEADER = 2;
    public static final int ON_STREAM_FINISH = 11;
    public static final int ON_STREAM_RECEIVE_DATA = 10;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f21017a;

    static {
        kge.a(-662274148);
    }

    private a(Looper looper) {
        super(looper);
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]);
        }
        if (f21017a == null) {
            synchronized (a.class) {
                if (f21017a == null) {
                    f21017a = new a(Looper.getMainLooper());
                }
            }
        }
        return f21017a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0207 -> B:151:0x0062). Please submit an issue!!! */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.handler.a.handleMessage(android.os.Message):void");
    }

    public static HandlerParam a(MtopListener mtopListener, MtopEvent mtopEvent, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerParam) ipChange.ipc$dispatch("dd362b0e", new Object[]{mtopListener, mtopEvent, mtopBusiness}) : new HandlerParam(mtopListener, mtopEvent, mtopBusiness);
    }
}
