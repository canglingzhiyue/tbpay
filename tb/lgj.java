package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class lgj implements lgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30566a;
    private WeakReference<IMulticlassTabService.a> b;
    private final IMainFeedsLoopStartStopService.a c;
    private final IMulticlassTabService d;

    static {
        kge.a(-1107900184);
        kge.a(1227300292);
    }

    public static /* synthetic */ ljs a(lgj lgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("597d8428", new Object[]{lgjVar}) : lgjVar.f30566a;
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a b(lgj lgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("9515a7f7", new Object[]{lgjVar}) : lgjVar.c;
    }

    public lgj(ljs ljsVar, IMainFeedsLoopStartStopService.a aVar) {
        this.f30566a = ljsVar;
        this.c = aVar;
        this.d = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
    }

    @Override // tb.lgn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IMulticlassTabService iMulticlassTabService = this.d;
        if (iMulticlassTabService == null) {
            return;
        }
        a(iMulticlassTabService);
    }

    @Override // tb.lgn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IMulticlassTabService iMulticlassTabService = this.d;
        if (iMulticlassTabService == null) {
            return;
        }
        b(iMulticlassTabService);
    }

    @Override // tb.lgn
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IMulticlassTabService iMulticlassTabService = this.d;
        return iMulticlassTabService == null || !iMulticlassTabService.isShowTabContent();
    }

    private void a(IMulticlassTabService iMulticlassTabService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a545789", new Object[]{this, iMulticlassTabService});
            return;
        }
        IMulticlassTabService.a d = d();
        iMulticlassTabService.addTabChangeListener(d);
        this.b = new WeakReference<>(d);
    }

    private void b(IMulticlassTabService iMulticlassTabService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff59a28", new Object[]{this, iMulticlassTabService});
            return;
        }
        WeakReference<IMulticlassTabService.a> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        iMulticlassTabService.removeTabChangeListener(this.b.get());
    }

    private IMulticlassTabService.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("d06b4cef", new Object[]{this}) : new IMulticlassTabService.a() { // from class: tb.lgj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    return;
                }
                IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) lgj.a(lgj.this).a(IMulticlassTabService.class);
                if (iMulticlassTabService == null) {
                    return;
                }
                if (iMulticlassTabService.isShowTabContent()) {
                    lgj.b(lgj.this).b(IMainFeedsLoopStartStopService.a.MUTI_CLASS_TAB_SWITCH);
                } else {
                    lgj.b(lgj.this).a(IMainFeedsLoopStartStopService.a.MUTI_CLASS_TAB_SWITCH);
                }
            }
        };
    }
}
