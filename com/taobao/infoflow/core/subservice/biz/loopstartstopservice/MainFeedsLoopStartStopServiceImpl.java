package com.taobao.infoflow.core.subservice.biz.loopstartstopservice;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.loopstartstopservice.impl.appdetector.a;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ldf;
import tb.lgj;
import tb.lgk;
import tb.lgl;
import tb.lgm;
import tb.lgn;
import tb.ljs;

/* loaded from: classes.dex */
public class MainFeedsLoopStartStopServiceImpl implements IMainFeedsLoopStartStopService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainFeedsLoopStartStopServiceImpl";
    private List<IMainFeedsLoopStartStopService.a> mListener = new CopyOnWriteArrayList();
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private List<lgn> mStartStopDetectorList;

    static {
        kge.a(1875956541);
        kge.a(368184615);
    }

    public static /* synthetic */ IMainFeedsViewService access$000(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("4228a6f1", new Object[]{mainFeedsLoopStartStopServiceImpl}) : mainFeedsLoopStartStopServiceImpl.mMainFeedsViewService;
    }

    public static /* synthetic */ void access$100(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631c3854", new Object[]{mainFeedsLoopStartStopServiceImpl, str});
        } else {
            mainFeedsLoopStartStopServiceImpl.notifyStart(str);
        }
    }

    public static /* synthetic */ void access$200(MainFeedsLoopStartStopServiceImpl mainFeedsLoopStartStopServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a7b955", new Object[]{mainFeedsLoopStartStopServiceImpl, str});
        } else {
            mainFeedsLoopStartStopServiceImpl.notifyStop(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (this.mMainFeedsViewService == null) {
            return;
        }
        this.mStartStopDetectorList = createDetectors(ljsVar, createStartAndStopListener());
        startDetect(this.mStartStopDetectorList);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else if (this.mMainFeedsViewService == null) {
        } else {
            stopDetect(this.mStartStopDetectorList);
            this.mStartStopDetectorList.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public void registerStartStopListener(IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600130c7", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mListener.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public void unregisterStartStopListener(IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60da48e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mListener.remove(aVar);
        }
    }

    private List<lgn> createDetectors(ljs ljsVar, IMainFeedsLoopStartStopService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf16c489", new Object[]{this, ljsVar, aVar});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(aVar));
        arrayList.add(new lgl(ljsVar, aVar));
        arrayList.add(new lgj(ljsVar, aVar));
        arrayList.add(new lgk(ljsVar, aVar));
        arrayList.add(new lgm(ljsVar, aVar));
        return arrayList;
    }

    private void startDetect(List<lgn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670b649d", new Object[]{this, list});
            return;
        }
        for (lgn lgnVar : list) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lgnVar.a();
            ldf.e(TAG, "startDetect " + lgnVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void stopDetect(List<lgn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b03603d", new Object[]{this, list});
            return;
        }
        for (lgn lgnVar : list) {
            lgnVar.b();
        }
    }

    private IMainFeedsLoopStartStopService.a createStartAndStopListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("1d46fd73", new Object[]{this}) : new IMainFeedsLoopStartStopService.a() { // from class: com.taobao.infoflow.core.subservice.biz.loopstartstopservice.MainFeedsLoopStartStopServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (!MainFeedsLoopStartStopServiceImpl.this.isAllowStart()) {
                } else {
                    MainFeedsLoopStartStopServiceImpl.access$000(MainFeedsLoopStartStopServiceImpl.this).dispatchWindowVisibility(0);
                    MainFeedsLoopStartStopServiceImpl.access$100(MainFeedsLoopStartStopServiceImpl.this, str);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                MainFeedsLoopStartStopServiceImpl.access$000(MainFeedsLoopStartStopServiceImpl.this).dispatchWindowVisibility(4);
                MainFeedsLoopStartStopServiceImpl.access$200(MainFeedsLoopStartStopServiceImpl.this, str);
            }
        };
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        List<lgn> list = this.mStartStopDetectorList;
        if (list == null) {
            return true;
        }
        for (lgn lgnVar : list) {
            if (!lgnVar.c()) {
                ldf.c(TAG, "isAllowStart: 不允许启动的探测器： " + lgnVar.getClass().getName());
                return false;
            }
        }
        return true;
    }

    private void notifyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a2b46a", new Object[]{this, str});
            return;
        }
        for (IMainFeedsLoopStartStopService.a aVar : this.mListener) {
            try {
                aVar.a(str);
            } catch (Throwable th) {
                ldf.a(TAG, "notifyStart error： ", th);
            }
        }
    }

    private void notifyStop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0daaf3c", new Object[]{this, str});
            return;
        }
        for (IMainFeedsLoopStartStopService.a aVar : this.mListener) {
            try {
                aVar.b(str);
            } catch (Throwable th) {
                ldf.a(TAG, "notifyStart error： ", th);
            }
        }
    }
}
