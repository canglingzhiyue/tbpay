package tb;

import com.alibaba.android.ultron.vfw.weex2.c;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;

/* loaded from: classes2.dex */
public class abn implements c, g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f25206a;

    static {
        kge.a(-1073669523);
        kge.a(-311268728);
        kge.a(-1737820920);
    }

    public abn(p pVar) {
        this.f25206a = pVar;
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.a(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        } else {
            UnifyLog.b("UltronTradeHybridPreRenderListener.IMUSRenderListener", "onForeground");
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        } else {
            UnifyLog.b("UltronTradeHybridPreRenderListener.IMUSRenderListener", "onPrepareSuccess");
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        UnifyLog.b("UltronTradeHybridPreRenderListener.IMUSRenderListener", ljl.RENDER_SUCCESS_TIME);
        a(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        if (("onRenderFailed,errorType:" + i + " errorMsg:" + str) == null) {
            str2 = "";
        } else {
            str2 = str + " fatal:" + z;
        }
        strArr[0] = str2;
        UnifyLog.d("UltronTradeHybridPreRenderListener.IMUSRenderListener", strArr);
        b(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        } else {
            UnifyLog.b("UltronTradeHybridPreRenderListener.IMUSRenderListener", "onRefreshSuccess");
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        if (("onRefreshFailed,errorType:" + i + " errorMsg:" + str) == null) {
            str2 = "";
        } else {
            str2 = str + " fatal:" + z;
        }
        strArr[0] = str2;
        UnifyLog.d("UltronTradeHybridPreRenderListener.IMUSRenderListener", strArr);
        b(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        String[] strArr = new String[1];
        if (("onJSException,errorType:" + i + " errorMsg:" + str) == null) {
            str = "";
        }
        strArr[0] = str;
        UnifyLog.d("UltronTradeHybridPreRenderListener.IMUSRenderListener", strArr);
        b(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        String[] strArr = new String[1];
        if (("onFatalException,errorType:" + i + " errorMsg:" + str) == null) {
            str = "";
        }
        strArr[0] = str;
        UnifyLog.d("UltronTradeHybridPreRenderListener.IMUSRenderListener", strArr);
        b(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            UnifyLog.b("UltronTradeHybridPreRenderListener.IMUSRenderListener", "onDestroyed");
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.c
    public void onBizReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
            return;
        }
        UnifyLog.b("UltronTradeHybridPreRenderListener.UltronWeex2BizLifecycleListener", "onBizReady");
        c(this.f25206a);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.c
    public void onBizFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            return;
        }
        String[] strArr = new String[1];
        String str3 = "";
        if (("onBizFailed,errorCode:" + str) != null) {
            if ((str + " errorMsg:" + str2) != null) {
                str3 = str2;
            }
        }
        strArr[0] = str3;
        UnifyLog.d("UltronTradeHybridPreRenderListener.UltronWeex2BizLifecycleListener", strArr);
        d(this.f25206a);
    }

    private void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
        if (b == null) {
            return;
        }
        b.a(true);
    }

    private void b(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194dea44", new Object[]{this, pVar});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
        if (b == null) {
            return;
        }
        b.b(true);
    }

    private void c(p pVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
        if (b != null) {
            b.c(true);
        }
        JSONObject a2 = a.a().a(pVar);
        if (a2 != null) {
            pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cachedFrontEndParams is null? ");
        sb.append(a2 == null);
        jqg.b("UltronTradeHybridPreRenderListener.bizReady", sb.toString());
        JSONObject b2 = a.a().b(pVar);
        if (b2 != null) {
            pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", b2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cachedNetParams is null? ");
        if (b2 == null) {
            z = true;
        }
        sb2.append(z);
        jqg.b("UltronTradeHybridPreRenderListener.bizReady", sb2.toString());
    }

    private void d(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28185482", new Object[]{this, pVar});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
        if (b == null) {
            return;
        }
        b.c(false);
    }
}
