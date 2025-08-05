package com.taobao.android.diagnose.scene.engine.reader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RulesManager$2 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;
    public final /* synthetic */ Runnable val$runnable;

    public RulesManager$2(d dVar, Runnable runnable) {
        this.this$0 = dVar;
        this.val$runnable = runnable;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge("Diagnose", "RulesManager", String.format("Request scene rule onSystemError. ErrorCode=%s,ErrorMsg=%s", mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        onFinish();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.scene.engine.reader.-$$Lambda$RulesManager$2$W8TgrABAhXj8ek_nEvDRLOOv9yM
                @Override // java.lang.Runnable
                public final void run() {
                    RulesManager$2.this.lambda$onSuccess$17$RulesManager$2(mtopResponse);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onSuccess$17$RulesManager$2(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d419b7af", new Object[]{this, mtopResponse});
            return;
        }
        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        if (dataJsonObject == null) {
            return;
        }
        d.a(this.this$0, dataJsonObject.toString());
        onFinish();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.loge("Diagnose", "RulesManager", String.format("Request scene rule onError. ErrorCode=%s,ErrorMsg=%s", mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        onFinish();
    }

    private void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        Runnable runnable = this.val$runnable;
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception e) {
            v.a("RulesManager", "checkUpdate onFinish", e);
        }
    }
}
