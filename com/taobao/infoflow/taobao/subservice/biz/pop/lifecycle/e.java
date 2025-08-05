package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import tb.kge;
import tb.kyu;

/* loaded from: classes7.dex */
public class e implements IMainFeedsLoopStartStopService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17504a;

    static {
        kge.a(929485851);
        kge.a(-1909436489);
    }

    public e(kyu kyuVar) {
        this.f17504a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f17504a.c().b(c(str));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f17504a.c().c(c(str));
        }
    }

    private int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1633761750:
                if (str.equals(IMainFeedsLoopStartStopService.a.MUTI_CLASS_TAB_SWITCH)) {
                    c = 0;
                    break;
                }
                break;
            case -1538563764:
                if (str.equals(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH)) {
                    c = 2;
                    break;
                }
                break;
            case 1289658019:
                if (str.equals(IMainFeedsLoopStartStopService.a.PAGE_SWITCH)) {
                    c = 4;
                    break;
                }
                break;
            case 1502363829:
                if (str.equals(IMainFeedsLoopStartStopService.a.APP_SWITCH)) {
                    c = 3;
                    break;
                }
                break;
            case 1607966505:
                if (str.equals(IMainFeedsLoopStartStopService.a.TAB_SWITCH)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 4;
        }
        if (c == 1) {
            return 3;
        }
        return c != 2 ? 0 : 2;
    }
}
